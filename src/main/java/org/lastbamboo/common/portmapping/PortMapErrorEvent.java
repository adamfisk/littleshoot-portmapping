package org.lastbamboo.common.portmapping;

import java.util.EventObject;

public class PortMapErrorEvent extends EventObject {

	private static final long serialVersionUID = -4501893735009785165L;

	private final int mappingIndex;
	private final int type;
	private final String message;

	public PortMapErrorEvent(Object source, int mappingIndex, int type, String message) {
		super(source);
		this.mappingIndex = mappingIndex;
		this.type = type;
		this.message = message;
	}

	public int getMappingIndex() {
		return mappingIndex;
	}
	
	public int getType() {
		return type;
	}
	
	public String getMessage() {
		return message;
	}
}
