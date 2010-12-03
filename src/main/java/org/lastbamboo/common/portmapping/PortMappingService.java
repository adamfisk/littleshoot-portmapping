package org.lastbamboo.common.portmapping;

public interface PortMappingService 
    {
    void addMapping(PortMappingProtocol protocol, int localPort, 
        int externalPortRequested);

    void removeMapping(int mappingIndex);
    
    void addPortMapListener(PortMapListener portMapListener);
    }
