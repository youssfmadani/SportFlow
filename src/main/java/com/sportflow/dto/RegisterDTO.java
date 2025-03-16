package com.sportflow.dto;

import jakarta.validation.constraints.*;

@PasswordMatch
public class RegisterDTO {

    @NotBlank(message = "first name is required")
    private String firstName;

    @NotBlank(message = "last name is required")
    private String lastName;

    @NotBlank(message = "email is reuqired")
    @Email
    private String email;

    //@NotBlank(message = "please select a role")
    private String role;

    @Pattern(regexp = "^$|\\d{4}-\\d{2}-\\d{2}", message = "Invalid date format, expected yyyy-MM-dd")
    private String dateOfBirth;

    @NotBlank(message = "password is required")
    private String password;

    @NotBlank(message = "password confimation is required")
    private String confirmPassword;

    private boolean isAdmin;


    public RegisterDTO(String firstName, String lastName, String email, String role, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public RegisterDTO(String firstName, String lastName, String email, String role, String dateOfBirth, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = role;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public RegisterDTO(String firstName, String lastName, String email, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getRole() {
        return role;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public void setIsAdmin ( boolean isAdmin ) { this.isAdmin = isAdmin; }
    public boolean getIsAdmin ( ) { return this.isAdmin; }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth( String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}