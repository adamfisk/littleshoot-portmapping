package org.lastbamboo.common.portmapping;

public interface PortMapListener {
	
	public void onPortMap(PortMapEvent portMapEvent);
	
	public void onPortMapError(PortMapErrorEvent portMapErrorEvent);
	
}
