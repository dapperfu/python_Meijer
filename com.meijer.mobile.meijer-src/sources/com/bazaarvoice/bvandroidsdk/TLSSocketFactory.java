package com.bazaarvoice.bvandroidsdk;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
class TLSSocketFactory extends SSLSocketFactory {
    private static final String[] SUPPORTED_PROTOCOLS = {"TLSv1.2"};
    private SSLSocketFactory delegate;

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket());
    }

    private Socket enableTLSOnSocket(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            ((SSLSocket) socket).setEnabledProtocols(SUPPORTED_PROTOCOLS);
        }
        return socket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(socket, str, i10, z10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.delegate.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.delegate.getSupportedCipherSuites();
    }

    TLSSocketFactory(SSLSocketFactory sSLSocketFactory) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext.getInstance("TLSv1.2").init(null, null, null);
        this.delegate = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return enableTLSOnSocket(this.delegate.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
