package org.lastbamboo.common.portmapping;

public interface PortMappingService 
    {
    public void addMapping(int protocolType, int localPort, 
        int externalPortRequested);

    public void removeMapping(int mappingIndex);
    
    public void addPortMapListener(PortMapListener portMapListener);
    }
