package org.lastbamboo.common.portmapping;

public class DefaultPortMappingService implements PortMappingService
    {

    private final NatPmpService natPmpService;
    private final UpnpService upnpService;

    public DefaultPortMappingService(final NatPmpService natPmpService,
        final UpnpService upnpService)
        {
        this.natPmpService = natPmpService;
        this.upnpService = upnpService;
        }
    
    public void addMapping(final int protocolType, final int localPort,
        final int externalPortRequested) 
        {
        this.natPmpService.addNatPmpMapping(protocolType, localPort, 
            externalPortRequested);
        this.upnpService.addUpnpMapping(protocolType, localPort, 
            externalPortRequested);
        }

    public void addPortMapListener(final PortMapListener portMapListener) 
        {
        this.natPmpService.addPortMapListener(portMapListener);
        this.upnpService.addPortMapListener(portMapListener);
        }

    public void removeMapping(final int mappingIndex) 
        {
        this.natPmpService.removeNatPmpMapping(mappingIndex);
        }
    }
