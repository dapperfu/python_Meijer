package androidx.media3.datasource;

import android.net.Uri;
import d3.C13599a;
import f3.AbstractC13946a;
import f3.g;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class UdpDataSource extends AbstractC13946a {

    /* renamed from: e, reason: collision with root package name */
    private final int f55678e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f55679f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f55680g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f55681h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f55682i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f55683j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f55684k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f55685l;

    /* renamed from: m, reason: collision with root package name */
    private int f55686m;

    public UdpDataSource() {
        this(2000);
    }

    @Override // f3.InterfaceC13949d
    public void close() throws IOException {
        this.f55681h = null;
        MulticastSocket multicastSocket = this.f55683j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C13599a.e(this.f55684k));
            } catch (IOException unused) {
            }
            this.f55683j = null;
        }
        DatagramSocket datagramSocket = this.f55682i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f55682i = null;
        }
        this.f55684k = null;
        this.f55686m = 0;
        if (this.f55685l) {
            this.f55685l = false;
            o();
        }
    }

    public static final class UdpDataSourceException extends DataSourceException {
        public UdpDataSourceException(Throwable th2, int i10) {
            super(th2, i10);
        }
    }

    public UdpDataSource(int i10) {
        this(i10, 8000);
    }

    @Override // f3.InterfaceC13949d
    public Uri getUri() {
        return this.f55681h;
    }

    @Override // f3.InterfaceC13949d
    public long h(g gVar) throws IOException {
        Uri uri = gVar.f131472a;
        this.f55681h = uri;
        String str = (String) C13599a.e(uri.getHost());
        int port = this.f55681h.getPort();
        p(gVar);
        try {
            this.f55684k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f55684k, port);
            if (this.f55684k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f55683j = multicastSocket;
                multicastSocket.joinGroup(this.f55684k);
                this.f55682i = this.f55683j;
            } else {
                this.f55682i = new DatagramSocket(inetSocketAddress);
            }
            this.f55682i.setSoTimeout(this.f55678e);
            this.f55685l = true;
            q(gVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // a3.InterfaceC5654k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f55686m == 0) {
            try {
                ((DatagramSocket) C13599a.e(this.f55682i)).receive(this.f55680g);
                int length = this.f55680g.getLength();
                this.f55686m = length;
                n(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f55680g.getLength();
        int i12 = this.f55686m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f55679f, length2 - i12, bArr, i10, iMin);
        this.f55686m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f55678e = i11;
        byte[] bArr = new byte[i10];
        this.f55679f = bArr;
        this.f55680g = new DatagramPacket(bArr, 0, i10);
    }
}
