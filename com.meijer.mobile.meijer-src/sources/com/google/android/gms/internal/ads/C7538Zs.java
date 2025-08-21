package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.maps.internal.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.Zs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7538Zs extends AbstractC7117Nd0 implements InterfaceC9132os0 {

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f73098v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e, reason: collision with root package name */
    private final int f73099e;

    /* renamed from: f, reason: collision with root package name */
    private final int f73100f;

    /* renamed from: g, reason: collision with root package name */
    private final String f73101g;

    /* renamed from: h, reason: collision with root package name */
    private final Nr0 f73102h;

    /* renamed from: i, reason: collision with root package name */
    private C8155fk0 f73103i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f73104j;

    /* renamed from: k, reason: collision with root package name */
    private final Queue f73105k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f73106l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f73107m;

    /* renamed from: n, reason: collision with root package name */
    private int f73108n;

    /* renamed from: o, reason: collision with root package name */
    private long f73109o;

    /* renamed from: p, reason: collision with root package name */
    private long f73110p;

    /* renamed from: q, reason: collision with root package name */
    private long f73111q;

    /* renamed from: r, reason: collision with root package name */
    private long f73112r;

    /* renamed from: s, reason: collision with root package name */
    private long f73113s;

    /* renamed from: t, reason: collision with root package name */
    private final long f73114t;

    /* renamed from: u, reason: collision with root package name */
    private final long f73115u;

    C7538Zs(String str, Pu0 pu0, int i10, int i11, long j10, long j11) {
        super(true);
        C8211gC.c(str);
        this.f73101g = str;
        this.f73102h = new Nr0();
        this.f73099e = i10;
        this.f73100f = i11;
        this.f73105k = new ArrayDeque();
        this.f73114t = j10;
        this.f73115u = j11;
        if (pu0 != null) {
            d(pu0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.f73106l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzgp(e10, this.f73103i, 2000, 3);
                }
            }
        } finally {
            this.f73106l = null;
            l();
            if (this.f73107m) {
                this.f73107m = false;
                h();
            }
        }
    }

    private final void l() {
        while (!this.f73105k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f73105k.remove()).disconnect();
            } catch (Exception e10) {
                Sc.p.e("Unexpected error while disconnecting", e10);
            }
        }
        this.f73104j = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final long a(C8155fk0 c8155fk0) throws IOException, NumberFormatException {
        this.f73103i = c8155fk0;
        this.f73110p = 0L;
        long j10 = c8155fk0.f74995e;
        long j11 = c8155fk0.f74996f;
        long jMin = j11 == -1 ? this.f73114t : Math.min(this.f73114t, j11);
        this.f73111q = j10;
        HttpURLConnection httpURLConnectionK = k(j10, (jMin + j10) - 1, 1);
        this.f73104j = httpURLConnectionK;
        String headerField = httpURLConnectionK.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f73098v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    long j14 = c8155fk0.f74996f;
                    if (j14 != -1) {
                        this.f73109o = j14;
                        this.f73112r = Math.max(j12, (this.f73111q + j14) - 1);
                    } else {
                        this.f73109o = j13 - this.f73111q;
                        this.f73112r = j13 - 1;
                    }
                    this.f73113s = j12;
                    this.f73107m = true;
                    j(c8155fk0);
                    return this.f73109o;
                } catch (NumberFormatException unused) {
                    Sc.p.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new C7472Xs(headerField, c8155fk0);
    }

    final HttpURLConnection k(long j10, long j11, int i10) throws IOException {
        int i11;
        IOException iOException;
        String string = this.f73103i.f74991a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) com.fullstory.FS.urlconnection_wrapInstance(new URL(string).openConnection());
            httpURLConnection.setConnectTimeout(this.f73099e);
            httpURLConnection.setReadTimeout(this.f73100f);
            for (Map.Entry entry : this.f73102h.a().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e10) {
                    iOException = e10;
                    i11 = i10;
                    throw new zzgp("Unable to connect to ".concat(String.valueOf(string)), iOException, this.f73103i, 2000, i11);
                }
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.f73101g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f73105k.add(httpURLConnection);
            String string2 = this.f73103i.f74991a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f73108n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    l();
                    throw new C7505Ys(this.f73108n, headerFields, this.f73103i, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f73106l != null) {
                        inputStream = new SequenceInputStream(this.f73106l, inputStream);
                    }
                    this.f73106l = inputStream;
                    return httpURLConnection;
                } catch (IOException e11) {
                    l();
                    throw new zzgp(e11, this.f73103i, 2000, i10);
                }
            } catch (IOException e12) {
                l();
                throw new zzgp("Unable to connect to ".concat(String.valueOf(string2)), e12, this.f73103i, 2000, i10);
            }
        } catch (IOException e13) {
            i11 = i10;
            iOException = e13;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9810vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f73109o;
            long j11 = this.f73110p;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.f73111q + j11;
            long j13 = i11;
            long j14 = j12 + j13 + this.f73115u;
            long j15 = this.f73113s;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.f73112r;
                if (j15 < j17) {
                    long jMin = Math.min(j17, Math.max(((this.f73114t + j16) - r4) - 1, (j16 + j13) - 1));
                    k(j16, jMin, 2);
                    this.f73113s = jMin;
                    j15 = jMin;
                }
            }
            int i12 = this.f73106l.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.f73111q) - this.f73110p));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.f73110p += i12;
            zzg(i12);
            return i12;
        } catch (IOException e10) {
            throw new zzgp(e10, this.f73103i, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9430rh0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f73104j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC7117Nd0, com.google.android.gms.internal.ads.InterfaceC9430rh0, com.google.android.gms.internal.ads.InterfaceC9132os0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f73104j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
