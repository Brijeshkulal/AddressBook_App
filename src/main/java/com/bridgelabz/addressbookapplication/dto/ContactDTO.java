package com.bridgelabz.addressbookapplication.dto;

import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class ContactDTO {
	
	@Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "First name Invalid")
    public String firstName;

    @Pattern(regexp = "^[A-Z]{1}[a-z]{2,}$", message = "Last name Invalid")
    public String lastName;

    public String address;

    public String state;
    public String city;

    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$", message = "Zip Code Invalid")
    public String zip;

    @Pattern(regexp = "^([\\+]?\\d{2})?[\\s]?\\d{10}$", message = "Phone Invalid")
    public String phone;
}
