package tr.gov.nvi.tckimlik.Ws;

public interface KPSPublic {

	    public java.lang.String getKPSPublicSoapAddress();

	    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap() throws javax.xml.rpc.ServiceException;

	    public tr.gov.nvi.tckimlik.WS.KPSPublicSoap getKPSPublicSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
	}

}
