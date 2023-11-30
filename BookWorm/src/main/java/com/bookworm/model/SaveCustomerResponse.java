package com.bookworm.model;

import java.io.Serializable;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor
@Builder
public class SaveCustomerResponse extends BaseResponse implements Serializable {
	
	private static final long serialVersionUID = 2089906774028835050L;

	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId customerId;

	private String customerFullName;

	@JsonSerialize(using = ToStringSerializer.class)
	private ObjectId userId;

}
