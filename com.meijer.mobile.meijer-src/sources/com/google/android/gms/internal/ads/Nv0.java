package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes6.dex */
public final class Nv0 extends AbstractC7117Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f69804e;

    /* renamed from: f, reason: collision with root package name */
    private final DatagramPacket f69805f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f69806g;

    /* renamed from: h, reason: collision with root package name */
    private DatagramSocket f69807h;

    /* renamed from: i, reason: collision with root package name */
    private MulticastSocket f69808i;

    /* renamed from: j, reason: collision with root package name */
    private InetAddress f69809j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f69810k;

    /* renamed from: l, reason: collision with root package name */
    private int f69811l;

    public Nv0(int i10) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f69804e = bArr;
        this.f69805f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        return this.f69806g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws IOException {
        InetAddress inetAddress;
        this.f69806g = null;
        MulticastSocket multicastSocket = this.f69808i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f69809j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f69808i = null;
        }
        DatagramSocket datagramSocket = this.f69807h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f69807h = null;
        }
        this.f69809j = null;
        this.f69811l = 0;
        if (this.f69810k) {
            this.f69810k = false;
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException {
        Uri uri = c8155fk0.f74991a;
        this.f69806g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f69806g.getPort();
        i(c8155fk0);
        try {
            this.f69809j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f69809j, port);
            if (this.f69809j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f69808i = multicastSocket;
                multicastSocket.joinGroup(this.f69809j);
                this.f69807h = this.f69808i;
            } else {
                this.f69807h = new DatagramSocket(inetSocketAddress);
            }
            this.f69807h.setSoTimeout(8000);
            this.f69810k = true;
            j(c8155fk0);
            return -1L;
        } catch (IOException e10) {
            throw new zzgz(e10, 2001);
        } catch (SecurityException e11) {
            throw new zzgz(e11, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f69811l == 0) {
            try {
                DatagramSocket datagramSocket = this.f69807h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f69805f);
                int length = this.f69805f.getLength();
                this.f69811l = length;
                zzg(length);
            } catch (SocketTimeoutException e10) {
                throw new zzgz(e10, 2002);
            } catch (IOException e11) {
                throw new zzgz(e11, 2001);
            }
        }
        int length2 = this.f69805f.getLength();
        int i12 = this.f69811l;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f69804e, length2 - i12, bArr, i10, iMin);
        this.f69811l -= iMin;
        return iMin;
    }
}
