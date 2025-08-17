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
public final class Nv0 extends AbstractC6992Nd0 {

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f68964e;

    /* renamed from: f, reason: collision with root package name */
    private final DatagramPacket f68965f;

    /* renamed from: g, reason: collision with root package name */
    private Uri f68966g;

    /* renamed from: h, reason: collision with root package name */
    private DatagramSocket f68967h;

    /* renamed from: i, reason: collision with root package name */
    private MulticastSocket f68968i;

    /* renamed from: j, reason: collision with root package name */
    private InetAddress f68969j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f68970k;

    /* renamed from: l, reason: collision with root package name */
    private int f68971l;

    public Nv0(int i10) {
        super(true);
        byte[] bArr = new byte[2000];
        this.f68964e = bArr;
        this.f68965f = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        return this.f68966g;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws IOException {
        InetAddress inetAddress;
        this.f68966g = null;
        MulticastSocket multicastSocket = this.f68968i;
        if (multicastSocket != null) {
            try {
                inetAddress = this.f68969j;
            } catch (IOException unused) {
            }
            if (inetAddress == null) {
                throw null;
            }
            multicastSocket.leaveGroup(inetAddress);
            this.f68968i = null;
        }
        DatagramSocket datagramSocket = this.f68967h;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f68967h = null;
        }
        this.f68969j = null;
        this.f68971l = 0;
        if (this.f68970k) {
            this.f68970k = false;
            h();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException {
        Uri uri = c8030fk0.f74151a;
        this.f68966g = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f68966g.getPort();
        i(c8030fk0);
        try {
            this.f68969j = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f68969j, port);
            if (this.f68969j.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f68968i = multicastSocket;
                multicastSocket.joinGroup(this.f68969j);
                this.f68967h = this.f68968i;
            } else {
                this.f68967h = new DatagramSocket(inetSocketAddress);
            }
            this.f68967h.setSoTimeout(8000);
            this.f68970k = true;
            j(c8030fk0);
            return -1L;
        } catch (IOException e10) {
            throw new zzgz(e10, 2001);
        } catch (SecurityException e11) {
            throw new zzgz(e11, 2006);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f68971l == 0) {
            try {
                DatagramSocket datagramSocket = this.f68967h;
                if (datagramSocket == null) {
                    throw null;
                }
                datagramSocket.receive(this.f68965f);
                int length = this.f68965f.getLength();
                this.f68971l = length;
                zzg(length);
            } catch (SocketTimeoutException e10) {
                throw new zzgz(e10, 2002);
            } catch (IOException e11) {
                throw new zzgz(e11, 2001);
            }
        }
        int length2 = this.f68965f.getLength();
        int i12 = this.f68971l;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f68964e, length2 - i12, bArr, i10, iMin);
        this.f68971l -= iMin;
        return iMin;
    }
}
