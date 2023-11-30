package com.bookworm.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.bookworm.conf.security.UserService;
import com.bookworm.document.BaseDocument;
import com.bookworm.model.BaseResponse;

public abstract class BaseMapper {
	
	@Autowired
	protected UserService userService;


	protected BaseResponse toBaseResponse(BaseResponse baseResponse, BaseDocument baseDocument) {

		baseResponse.setCreatedBy(baseDocument.getCreatedBy());
		baseResponse.setCreationDate(baseDocument.getCreationDate());
		baseResponse.setModifiedBy(baseDocument.getModifiedBy());
		baseResponse.setModificationDate(baseDocument.getModificationDate());

		return baseResponse;
		
	}

}
