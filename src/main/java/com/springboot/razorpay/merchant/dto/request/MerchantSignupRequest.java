package com.springboot.razorpay.merchant.dto.request;

import com.springboot.razorpay.common.enums.BusinessType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record MerchantSignupRequest(
        @NotNull(message = "Name cannot be null")
        @Size(min = 2, max = 100, message = "Name must be between 2 and 100 characters")
        String name,
        @Email(message = "Email must be a valid email address")
        @NotNull(message = "Email cannot be null")
        String email,
        @NotNull(message = "Password cannot be null")
        @Size(min = 8, message = "Password must be at least 8 characters long")
        String password,
        @Size(max = 50, message = "Business name must be at most 50 characters long")
        String businessName,
        BusinessType businessType
) {
}
