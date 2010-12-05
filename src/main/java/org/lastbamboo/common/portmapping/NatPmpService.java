package org.lastbamboo.common.portmapping;

public interface NatPmpService {
    
    /**
     * The return value is an index that identifies this port mapping. This is
     * used to refer to mappings that fails or succeeds in the {@link PortMapEvent} If The
     * mapping fails immediately, the return value is -1, which means failure.
     * There will not be any event generated for mappings that fail with
     * a -1 return value.
     * 
     * @param protocolType none = 0, udp = 1, tcp = 2, other than these values results in none = 0
     * @param localPort the local port
     * @param externalPortRequested the external port being requested
     * @return -1 if the mapping fails otherwise the index that identifies this
     *         port mapping (mappingIndex)
     */
    int addNatPmpMapping(PortMappingProtocol protocol, int localPort, 
        int externalPortRequested, PortMapListener portMapListener);

    void removeNatPmpMapping(int mappingIndex);
    
}
