package com.google.android.gms.internal.ads;

import android.net.Uri;
import io.constructor.BuildConfig;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.mo0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8910mo0 extends AbstractC7117Nd0 implements InterfaceC9132os0 {

    /* renamed from: e, reason: collision with root package name */
    private final boolean f77731e;

    /* renamed from: f, reason: collision with root package name */
    private final int f77732f;

    /* renamed from: g, reason: collision with root package name */
    private final int f77733g;

    /* renamed from: h, reason: collision with root package name */
    private final String f77734h;

    /* renamed from: i, reason: collision with root package name */
    private final Nr0 f77735i;

    /* renamed from: j, reason: collision with root package name */
    private final Nr0 f77736j;

    /* renamed from: k, reason: collision with root package name */
    private C8155fk0 f77737k;

    /* renamed from: l, reason: collision with root package name */
    private HttpURLConnection f77738l;

    /* renamed from: m, reason: collision with root package name */
    private InputStream f77739m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f77740n;

    /* renamed from: o, reason: collision with root package name */
    private int f77741o;

    /* renamed from: p, reason: collision with root package name */
    private long f77742p;

    /* renamed from: q, reason: collision with root package name */
    private long f77743q;

    /* synthetic */ C8910mo0(String str, int i10, int i11, boolean z10, boolean z11, Nr0 nr0, InterfaceC6816Ef0 interfaceC6816Ef0, boolean z12, Ln0 ln0) {
        super(true);
        this.f77734h = str;
        this.f77732f = i10;
        this.f77733g = i11;
        this.f77731e = z10;
        this.f77735i = nr0;
        this.f77736j = new Nr0();
    }

    private final URL l(URL url, String str, C8155fk0 c8155fk0) throws zzgp {
        if (str == null) {
            throw new zzgp("Null location redirect", c8155fk0, 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!BuildConfig.SERVICE_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                throw new zzgp("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), c8155fk0, 2001, 1);
            }
            if (this.f77731e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new zzgp("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c8155fk0, 2001, 1);
        } catch (MalformedURLException e10) {
            throw new zzgp(e10, c8155fk0, 2001, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.f77739m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    C8155fk0 c8155fk0 = this.f77737k;
                    int i10 = OV.f69931a;
                    throw new zzgp(e10, c8155fk0, 2000, 3);
                }
            }
        } finally {
            this.f77739m = null;
            m();
            if (this.f77740n) {
                this.f77740n = false;
                h();
            }
            this.f77738l = null;
            this.f77737k = null;
        }
    }

    private final void m() {
        HttpURLConnection httpURLConnection = this.f77738l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                C10042xL.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.C8155fk0 r21) throws java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8910mo0.a(com.google.android.gms.internal.ads.fk0):long");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f77742p;
            if (j10 != -1) {
                long j11 = j10 - this.f77743q;
                if (j11 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j11);
            }
            InputStream inputStream = this.f77739m;
            int i12 = OV.f69931a;
            int i13 = inputStream.read(bArr, i10, i11);
            if (i13 == -1) {
                return -1;
            }
            this.f77743q += i13;
            zzg(i13);
            return i13;
        } catch (IOException e10) {
            C8155fk0 c8155fk0 = this.f77737k;
            int i14 = OV.f69931a;
            throw zzgp.a(e10, c8155fk0, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f77738l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        C8155fk0 c8155fk0 = this.f77737k;
        if (c8155fk0 != null) {
            return c8155fk0.f74991a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7117Nd0, com.google.android.gms.internal.ads.InterfaceC9430rh0, com.google.android.gms.internal.ads.InterfaceC9132os0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f77738l;
        return httpURLConnection == null ? AbstractC8363hh0.d() : new C8694kn0(httpURLConnection.getHeaderFields());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.net.HttpURLConnection k(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.URLConnection r3 = com.fullstory.FS.urlconnection_wrapInstance(r3)
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.f77732f
            r3.setConnectTimeout(r4)
            int r4 = r2.f77733g
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.Nr0 r5 = r2.f77735i
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.Nr0 r5 = r2.f77736j
            java.util.Map r5 = r5.a()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L36:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L52
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L36
        L52:
            r4 = 0
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r0 = -1
            if (r12 != 0) goto L61
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L60
            r4 = 0
            goto L80
        L60:
            r6 = r4
        L61:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "bytes="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r5 = "-"
            r4.append(r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L7c
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L7c:
            java.lang.String r4 = r4.toString()
        L80:
            if (r4 == 0) goto L87
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L87:
            java.lang.String r4 = r2.f77734h
            if (r4 == 0) goto L90
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L90:
            r4 = 1
            if (r4 == r10) goto L96
            java.lang.String r4 = "identity"
            goto L98
        L96:
            java.lang.String r4 = "gzip"
        L98:
            java.lang.String r5 = "Accept-Encoding"
            r3.setRequestProperty(r5, r4)
            r3.setInstanceFollowRedirects(r11)
            r4 = 0
            r3.setDoOutput(r4)
            int r4 = com.google.android.gms.internal.ads.C8155fk0.f74990h
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8910mo0.k(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }
}
