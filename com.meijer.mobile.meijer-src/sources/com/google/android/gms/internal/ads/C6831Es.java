package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Es, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6831Es extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    final SSLSocketFactory f67379a = (SSLSocketFactory) SSLSocketFactory.getDefault();

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6865Fs f67380b;

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10) throws IOException {
        Socket socketCreateSocket = this.f67379a.createSocket(str, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    C6831Es(C6865Fs c6865Fs) {
        this.f67380b = c6865Fs;
    }

    private final Socket a(Socket socket) throws SocketException {
        C6865Fs c6865Fs = this.f67380b;
        if (c6865Fs.f67753s > 0) {
            socket.setReceiveBufferSize(c6865Fs.f67753s);
        }
        this.f67380b.f67754t.add(socket);
        return socket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        Socket socketCreateSocket = this.f67379a.createSocket(str, i10, inetAddress, i11);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f67379a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f67379a.getSupportedCipherSuites();
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        Socket socketCreateSocket = this.f67379a.createSocket(inetAddress, i10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        Socket socketCreateSocket = this.f67379a.createSocket(inetAddress, i10, inetAddress2, i11);
        a(socketCreateSocket);
        return socketCreateSocket;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        Socket socketCreateSocket = this.f67379a.createSocket(socket, str, i10, z10);
        a(socketCreateSocket);
        return socketCreateSocket;
    }
}
