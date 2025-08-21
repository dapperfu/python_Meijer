package ih;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: ih.s, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C14752s extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f137691a;

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f137691a.createSocket(socket, str, i10, z10));
    }

    static Socket a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            List listAsList = Arrays.asList(sSLSocket.getSupportedProtocols());
            ArrayList arrayList = new ArrayList();
            if (listAsList.contains("TLSv1.2")) {
                arrayList.add("TLSv1.2");
            }
            if (listAsList.contains("TLSv1.1")) {
                arrayList.add("TLSv1.1");
            }
            if (listAsList.contains("TLSv1")) {
                arrayList.add("TLSv1");
            }
            if (arrayList.size() > 0) {
                sSLSocket.setEnabledProtocols((String[]) arrayList.toArray(new String[arrayList.size()]));
            }
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10) throws IOException {
        return a(this.f137691a.createSocket(str, i10));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f137691a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f137691a.getSupportedCipherSuites();
    }

    C14752s() throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.init(null, null, null);
        this.f137691a = sSLContext.getSocketFactory();
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return a(this.f137691a.createSocket(str, i10, inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f137691a.createSocket(inetAddress, i10));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f137691a.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
