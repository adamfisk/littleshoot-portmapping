package org.lastbamboo.common.portmapping;

import java.util.EventObject;

public class PortMapEvent extends EventObject {

    private static final long serialVersionUID = -82849585250466266L;

    int mappingIndex;
    int externalPortAllocated;
    int type;
    
    public PortMapEvent(Object source, int mappinIndex, int externalPortAllocated, int type) {
        super(source);
        this.mappingIndex = mappinIndex;
        this.externalPortAllocated = externalPortAllocated;
        this.type = type;
    }
    
    public int getMappingIndex() {
        return mappingIndex;
    }
    
    public int getExternalPortAllocated() {
        return externalPortAllocated;
    }
    
    /**
     * @return Type is 0 for NAT-PMP and 1 for UPnP.
     */
    public int getType() {
        return type;
    }
    
}
