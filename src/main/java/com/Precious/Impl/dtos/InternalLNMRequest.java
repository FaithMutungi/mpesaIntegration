package com.Precious.Impl.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InternalLNMRequest{

	@JsonProperty("CheckoutRequestID")
	private String checkoutRequestID;
}