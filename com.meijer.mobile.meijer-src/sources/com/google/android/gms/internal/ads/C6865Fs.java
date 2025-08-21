package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.Fs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6865Fs extends AbstractC7117Nd0 implements InterfaceC9132os0 {

    /* renamed from: u, reason: collision with root package name */
    private static final Pattern f67737u = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicReference f67738v = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final SSLSocketFactory f67739e;

    /* renamed from: f, reason: collision with root package name */
    private final int f67740f;

    /* renamed from: g, reason: collision with root package name */
    private final int f67741g;

    /* renamed from: h, reason: collision with root package name */
    private final String f67742h;

    /* renamed from: i, reason: collision with root package name */
    private final Nr0 f67743i;

    /* renamed from: j, reason: collision with root package name */
    private C8155fk0 f67744j;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f67745k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f67746l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f67747m;

    /* renamed from: n, reason: collision with root package name */
    private int f67748n;

    /* renamed from: o, reason: collision with root package name */
    private long f67749o;

    /* renamed from: p, reason: collision with root package name */
    private long f67750p;

    /* renamed from: q, reason: collision with root package name */
    private long f67751q;

    /* renamed from: r, reason: collision with root package name */
    private long f67752r;

    /* renamed from: s, reason: collision with root package name */
    private int f67753s;

    /* renamed from: t, reason: collision with root package name */
    private final Set f67754t;

    C6865Fs(String str, Pu0 pu0, int i10, int i11, int i12) {
        super(true);
        this.f67739e = new C6831Es(this);
        this.f67754t = new HashSet();
        C8211gC.c(str);
        this.f67742h = str;
        this.f67743i = new Nr0();
        this.f67740f = i10;
        this.f67741g = i11;
        this.f67753s = i12;
        if (pu0 != null) {
            d(pu0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.f67746l;
            if (inputStream != null) {
                int i10 = OV.f69931a;
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzgp(e10, this.f67744j, 2000, 3);
                }
            }
        } finally {
            this.f67746l = null;
            n();
            if (this.f67747m) {
                this.f67747m = false;
                h();
            }
            this.f67754t.clear();
        }
    }

    private final void n() {
        HttpURLConnection httpURLConnection = this.f67745k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                Sc.p.e("Unexpected error while disconnecting", e10);
            }
            this.f67745k = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0272 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[Catch: IOException -> 0x0043, TryCatch #3 {IOException -> 0x0043, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0038, B:12:0x0049, B:13:0x0061, B:15:0x0067, B:22:0x008b, B:24:0x00a5, B:25:0x00b7, B:26:0x00bc, B:28:0x00c5, B:29:0x00cc, B:42:0x00f4, B:95:0x0237, B:97:0x0242, B:99:0x0253, B:102:0x025c, B:103:0x026b, B:105:0x0272, B:106:0x0279, B:107:0x027a, B:108:0x0290), top: B:117:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0242 A[Catch: IOException -> 0x0043, TryCatch #3 {IOException -> 0x0043, blocks: (B:3:0x000e, B:4:0x0024, B:6:0x002a, B:8:0x0038, B:12:0x0049, B:13:0x0061, B:15:0x0067, B:22:0x008b, B:24:0x00a5, B:25:0x00b7, B:26:0x00bc, B:28:0x00c5, B:29:0x00cc, B:42:0x00f4, B:95:0x0237, B:97:0x0242, B:99:0x0253, B:102:0x025c, B:103:0x026b, B:105:0x0272, B:106:0x0279, B:107:0x027a, B:108:0x0290), top: B:117:0x000e }] */
    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.C8155fk0 r21) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 681
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6865Fs.a(com.google.android.gms.internal.ads.fk0):long");
    }

    final void m(int i10) throws SocketException {
        this.f67753s = i10;
        for (Socket socket : this.f67754t) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.f67753s);
                } catch (SocketException e10) {
                    Sc.p.h("Failed to update receive buffer size.", e10);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (this.f67751q != this.f67749o) {
                byte[] bArr2 = (byte[]) f67738v.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (true) {
                    long j10 = this.f67751q;
                    long j11 = this.f67749o;
                    if (j10 == j11) {
                        f67738v.set(bArr2);
                        break;
                    }
                    int i12 = this.f67746l.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i12 == -1) {
                        throw new EOFException();
                    }
                    this.f67751q += i12;
                    zzg(i12);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.f67750p;
            if (j12 != -1) {
                long j13 = j12 - this.f67752r;
                if (j13 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j13);
            }
            int i13 = this.f67746l.read(bArr, i10, i11);
            if (i13 == -1) {
                if (this.f67750p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.f67752r += i13;
            zzg(i13);
            return i13;
        } catch (IOException e10) {
            throw new zzgp(e10, this.f67744j, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f67745k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7117Nd0, com.google.android.gms.internal.ads.InterfaceC9430rh0, com.google.android.gms.internal.ads.InterfaceC9132os0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f67745k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
