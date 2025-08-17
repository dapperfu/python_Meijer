package androidx.media3.datasource;

import android.net.Uri;
import d3.C13466a;
import f3.AbstractC13836a;
import f3.g;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class UdpDataSource extends AbstractC13836a {

    /* renamed from: e, reason: collision with root package name */
    private final int f55454e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f55455f;

    /* renamed from: g, reason: collision with root package name */
    private final DatagramPacket f55456g;

    /* renamed from: h, reason: collision with root package name */
    private Uri f55457h;

    /* renamed from: i, reason: collision with root package name */
    private DatagramSocket f55458i;

    /* renamed from: j, reason: collision with root package name */
    private MulticastSocket f55459j;

    /* renamed from: k, reason: collision with root package name */
    private InetAddress f55460k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f55461l;

    /* renamed from: m, reason: collision with root package name */
    private int f55462m;

    public UdpDataSource() {
        this(2000);
    }

    @Override // f3.InterfaceC13839d
    public void close() throws IOException {
        this.f55457h = null;
        MulticastSocket multicastSocket = this.f55459j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) C13466a.e(this.f55460k));
            } catch (IOException unused) {
            }
            this.f55459j = null;
        }
        DatagramSocket datagramSocket = this.f55458i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f55458i = null;
        }
        this.f55460k = null;
        this.f55462m = 0;
        if (this.f55461l) {
            this.f55461l = false;
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

    @Override // f3.InterfaceC13839d
    public Uri getUri() {
        return this.f55457h;
    }

    @Override // f3.InterfaceC13839d
    public long h(g gVar) throws IOException {
        Uri uri = gVar.f130638a;
        this.f55457h = uri;
        String str = (String) C13466a.e(uri.getHost());
        int port = this.f55457h.getPort();
        p(gVar);
        try {
            this.f55460k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f55460k, port);
            if (this.f55460k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f55459j = multicastSocket;
                multicastSocket.joinGroup(this.f55460k);
                this.f55458i = this.f55459j;
            } else {
                this.f55458i = new DatagramSocket(inetSocketAddress);
            }
            this.f55458i.setSoTimeout(this.f55454e);
            this.f55461l = true;
            q(gVar);
            return -1L;
        } catch (IOException e10) {
            throw new UdpDataSourceException(e10, 2001);
        } catch (SecurityException e11) {
            throw new UdpDataSourceException(e11, 2006);
        }
    }

    @Override // a3.InterfaceC5571k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        if (this.f55462m == 0) {
            try {
                ((DatagramSocket) C13466a.e(this.f55458i)).receive(this.f55456g);
                int length = this.f55456g.getLength();
                this.f55462m = length;
                n(length);
            } catch (SocketTimeoutException e10) {
                throw new UdpDataSourceException(e10, 2002);
            } catch (IOException e11) {
                throw new UdpDataSourceException(e11, 2001);
            }
        }
        int length2 = this.f55456g.getLength();
        int i12 = this.f55462m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f55455f, length2 - i12, bArr, i10, iMin);
        this.f55462m -= iMin;
        return iMin;
    }

    public UdpDataSource(int i10, int i11) {
        super(true);
        this.f55454e = i11;
        byte[] bArr = new byte[i10];
        this.f55455f = bArr;
        this.f55456g = new DatagramPacket(bArr, 0, i10);
    }
}
