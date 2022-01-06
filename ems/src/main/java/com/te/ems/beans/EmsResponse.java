package com.te.ems.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmsResponse {

	private boolean err;
	
	private Object data;
}
