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
final class C7413Zs extends AbstractC6992Nd0 implements InterfaceC9007os0 {

    /* renamed from: v, reason: collision with root package name */
    private static final Pattern f72258v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: e, reason: collision with root package name */
    private final int f72259e;

    /* renamed from: f, reason: collision with root package name */
    private final int f72260f;

    /* renamed from: g, reason: collision with root package name */
    private final String f72261g;

    /* renamed from: h, reason: collision with root package name */
    private final Nr0 f72262h;

    /* renamed from: i, reason: collision with root package name */
    private C8030fk0 f72263i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f72264j;

    /* renamed from: k, reason: collision with root package name */
    private final Queue f72265k;

    /* renamed from: l, reason: collision with root package name */
    private InputStream f72266l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f72267m;

    /* renamed from: n, reason: collision with root package name */
    private int f72268n;

    /* renamed from: o, reason: collision with root package name */
    private long f72269o;

    /* renamed from: p, reason: collision with root package name */
    private long f72270p;

    /* renamed from: q, reason: collision with root package name */
    private long f72271q;

    /* renamed from: r, reason: collision with root package name */
    private long f72272r;

    /* renamed from: s, reason: collision with root package name */
    private long f72273s;

    /* renamed from: t, reason: collision with root package name */
    private final long f72274t;

    /* renamed from: u, reason: collision with root package name */
    private final long f72275u;

    C7413Zs(String str, Pu0 pu0, int i10, int i11, long j10, long j11) {
        super(true);
        C8086gC.c(str);
        this.f72261g = str;
        this.f72262h = new Nr0();
        this.f72259e = i10;
        this.f72260f = i11;
        this.f72265k = new ArrayDeque();
        this.f72274t = j10;
        this.f72275u = j11;
        if (pu0 != null) {
            d(pu0);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.f72266l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzgp(e10, this.f72263i, 2000, 3);
                }
            }
        } finally {
            this.f72266l = null;
            l();
            if (this.f72267m) {
                this.f72267m = false;
                h();
            }
        }
    }

    private final void l() {
        while (!this.f72265k.isEmpty()) {
            try {
                ((HttpURLConnection) this.f72265k.remove()).disconnect();
            } catch (Exception e10) {
                Qc.p.e("Unexpected error while disconnecting", e10);
            }
        }
        this.f72264j = null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final long a(C8030fk0 c8030fk0) throws IOException, NumberFormatException {
        this.f72263i = c8030fk0;
        this.f72270p = 0L;
        long j10 = c8030fk0.f74155e;
        long j11 = c8030fk0.f74156f;
        long jMin = j11 == -1 ? this.f72274t : Math.min(this.f72274t, j11);
        this.f72271q = j10;
        HttpURLConnection httpURLConnectionK = k(j10, (jMin + j10) - 1, 1);
        this.f72264j = httpURLConnectionK;
        String headerField = httpURLConnectionK.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f72258v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    long j14 = c8030fk0.f74156f;
                    if (j14 != -1) {
                        this.f72269o = j14;
                        this.f72272r = Math.max(j12, (this.f72271q + j14) - 1);
                    } else {
                        this.f72269o = j13 - this.f72271q;
                        this.f72272r = j13 - 1;
                    }
                    this.f72273s = j12;
                    this.f72267m = true;
                    j(c8030fk0);
                    return this.f72269o;
                } catch (NumberFormatException unused) {
                    Qc.p.d("Unexpected Content-Range [" + headerField + "]");
                }
            }
        }
        throw new C7347Xs(headerField, c8030fk0);
    }

    final HttpURLConnection k(long j10, long j11, int i10) throws IOException {
        int i11;
        IOException iOException;
        String string = this.f72263i.f74151a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) com.fullstory.FS.urlconnection_wrapInstance(new URL(string).openConnection());
            httpURLConnection.setConnectTimeout(this.f72259e);
            httpURLConnection.setReadTimeout(this.f72260f);
            for (Map.Entry entry : this.f72262h.a().entrySet()) {
                try {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                } catch (IOException e10) {
                    iOException = e10;
                    i11 = i10;
                    throw new zzgp("Unable to connect to ".concat(String.valueOf(string)), iOException, this.f72263i, 2000, i11);
                }
            }
            httpURLConnection.setRequestProperty("Range", "bytes=" + j10 + "-" + j11);
            httpURLConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.f72261g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            this.f72265k.add(httpURLConnection);
            String string2 = this.f72263i.f74151a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f72268n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                    l();
                    throw new C7380Ys(this.f72268n, headerFields, this.f72263i, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.f72266l != null) {
                        inputStream = new SequenceInputStream(this.f72266l, inputStream);
                    }
                    this.f72266l = inputStream;
                    return httpURLConnection;
                } catch (IOException e11) {
                    l();
                    throw new zzgp(e11, this.f72263i, 2000, i10);
                }
            } catch (IOException e12) {
                l();
                throw new zzgp("Unable to connect to ".concat(String.valueOf(string2)), e12, this.f72263i, 2000, i10);
            }
        } catch (IOException e13) {
            i11 = i10;
            iOException = e13;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9685vA0
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f72269o;
            long j11 = this.f72270p;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.f72271q + j11;
            long j13 = i11;
            long j14 = j12 + j13 + this.f72275u;
            long j15 = this.f72273s;
            long j16 = j15 + 1;
            if (j14 > j16) {
                long j17 = this.f72272r;
                if (j15 < j17) {
                    long jMin = Math.min(j17, Math.max(((this.f72274t + j16) - r4) - 1, (j16 + j13) - 1));
                    k(j16, jMin, 2);
                    this.f72273s = jMin;
                    j15 = jMin;
                }
            }
            int i12 = this.f72266l.read(bArr, i10, (int) Math.min(j13, ((j15 + 1) - this.f72271q) - this.f72270p));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.f72270p += i12;
            zzg(i12);
            return i12;
        } catch (IOException e10) {
            throw new zzgp(e10, this.f72263i, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9305rh0
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f72264j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.AbstractC6992Nd0, com.google.android.gms.internal.ads.InterfaceC9305rh0, com.google.android.gms.internal.ads.InterfaceC9007os0
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.f72264j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
