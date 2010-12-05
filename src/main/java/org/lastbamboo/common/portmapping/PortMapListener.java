package org.lastbamboo.common.portmapping;

public interface PortMapListener {

    public void onPortMap(int externalPort);

    public void onPortMapError();
}
