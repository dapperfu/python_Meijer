package com.google.firebase.perf.network;

import Vf.g;
import ag.l;
import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
class c {

    /* renamed from: f, reason: collision with root package name */
    private static final Uf.a f89097f = Uf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f89098a;

    /* renamed from: b, reason: collision with root package name */
    private final g f89099b;

    /* renamed from: c, reason: collision with root package name */
    private long f89100c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f89101d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final l f89102e;

    private void a0() {
        if (this.f89100c == -1) {
            this.f89102e.g();
            long jE = this.f89102e.e();
            this.f89100c = jE;
            this.f89099b.q(jE);
        }
        String strF = F();
        if (strF != null) {
            this.f89099b.j(strF);
        } else if (o()) {
            this.f89099b.j("POST");
        } else {
            this.f89099b.j("GET");
        }
    }

    public boolean A() {
        return this.f89098a.getInstanceFollowRedirects();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.f89098a.getOutputStream();
            return outputStream != null ? new Xf.b(outputStream, this.f89099b, this.f89102e) : outputStream;
        } catch (IOException e10) {
            this.f89099b.v(this.f89102e.c());
            Xf.d.d(this.f89099b);
            throw e10;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f89098a.getPermission();
        } catch (IOException e10) {
            this.f89099b.v(this.f89102e.c());
            Xf.d.d(this.f89099b);
            throw e10;
        }
    }

    public int E() {
        return this.f89098a.getReadTimeout();
    }

    public String F() {
        return this.f89098a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f89098a.getRequestProperties();
    }

    public String H(String str) {
        return this.f89098a.getRequestProperty(str);
    }

    public URL K() {
        return this.f89098a.getURL();
    }

    public boolean L() {
        return this.f89098a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f89098a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f89098a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f89098a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f89098a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f89098a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f89098a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f89098a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f89098a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f89098a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f89098a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f89098a.setReadTimeout(i10);
    }

    public void X(String str) throws ProtocolException {
        this.f89098a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if (HttpHeaders.USER_AGENT.equalsIgnoreCase(str)) {
            this.f89099b.y(str2);
        }
        this.f89098a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f89098a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f89098a.addRequestProperty(str, str2);
    }

    public void b() throws IOException {
        if (this.f89100c == -1) {
            this.f89102e.g();
            long jE = this.f89102e.e();
            this.f89100c = jE;
            this.f89099b.q(jE);
        }
        try {
            this.f89098a.connect();
        } catch (IOException e10) {
            this.f89099b.v(this.f89102e.c());
            Xf.d.d(this.f89099b);
            throw e10;
        }
    }

    public boolean b0() {
        return this.f89098a.usingProxy();
    }

    public void c() {
        this.f89099b.v(this.f89102e.c());
        this.f89099b.b();
        this.f89098a.disconnect();
    }

    public boolean d() {
        return this.f89098a.getAllowUserInteraction();
    }

    public int e() {
        return this.f89098a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f89098a.equals(obj);
    }

    public int hashCode() {
        return this.f89098a.hashCode();
    }

    public boolean m() {
        return this.f89098a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f89098a.getDoInput();
    }

    public boolean o() {
        return this.f89098a.getDoOutput();
    }

    public String toString() {
        return this.f89098a.toString();
    }

    public long y() {
        return this.f89098a.getIfModifiedSince();
    }

    public c(HttpURLConnection httpURLConnection, l lVar, g gVar) {
        this.f89098a = httpURLConnection;
        this.f89099b = gVar;
        this.f89102e = lVar;
        gVar.x(httpURLConnection.getURL().toString());
    }

    public long B() {
        a0();
        return this.f89098a.getLastModified();
    }

    public int I() throws IOException {
        a0();
        if (this.f89101d == -1) {
            long jC = this.f89102e.c();
            this.f89101d = jC;
            this.f89099b.w(jC);
        }
        try {
            int responseCode = this.f89098a.getResponseCode();
            this.f89099b.k(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f89099b.v(this.f89102e.c());
            Xf.d.d(this.f89099b);
            throw e10;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f89101d == -1) {
            long jC = this.f89102e.c();
            this.f89101d = jC;
            this.f89099b.w(jC);
        }
        try {
            String responseMessage = this.f89098a.getResponseMessage();
            this.f89099b.k(this.f89098a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f89099b.v(this.f89102e.c());
            Xf.d.d(this.f89099b);
            throw e10;
        }
    }

    public Object f() throws IOException {
        a0();
        this.f89099b.k(this.f89098a.getResponseCode());
        try {
            Object content = this.f89098a.getContent();
            if (content instanceof InputStream) {
                this.f89099b.r(this.f89098a.getContentType());
                return new Xf.a((InputStream) content, this.f89099b, this.f89102e);
            }
            this.f89099b.r(this.f89098a.getContentType());
            this.f89099b.s(this.f89098a.getContentLength());
            this.f89099b.v(this.f89102e.c());
            this.f89099b.b();
            return content;
        } catch (IOException e10) {
            this.f89099b.v(this.f89102e.c());
            Xf.d.d(this.f89099b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f89099b.k(this.f89098a.getResponseCode());
        try {
            Object content = this.f89098a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f89099b.r(this.f89098a.getContentType());
                return new Xf.a((InputStream) content, this.f89099b, this.f89102e);
            }
            this.f89099b.r(this.f89098a.getContentType());
            this.f89099b.s(this.f89098a.getContentLength());
            this.f89099b.v(this.f89102e.c());
            this.f89099b.b();
            return content;
        } catch (IOException e10) {
            this.f89099b.v(this.f89102e.c());
            Xf.d.d(this.f89099b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f89098a.getContentEncoding();
    }

    public int i() {
        a0();
        return this.f89098a.getContentLength();
    }

    public long j() {
        a0();
        return this.f89098a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f89098a.getContentType();
    }

    public long l() {
        a0();
        return this.f89098a.getDate();
    }

    public InputStream p() {
        a0();
        try {
            this.f89099b.k(this.f89098a.getResponseCode());
        } catch (IOException unused) {
            f89097f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f89098a.getErrorStream();
        if (errorStream != null) {
            return new Xf.a(errorStream, this.f89099b, this.f89102e);
        }
        return errorStream;
    }

    public long q() {
        a0();
        return this.f89098a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f89098a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f89098a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f89098a.getHeaderFieldDate(str, j10);
    }

    public int u(String str, int i10) {
        a0();
        return this.f89098a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f89098a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f89098a.getHeaderFieldLong(str, j10);
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f89098a.getHeaderFields();
    }

    public InputStream z() throws IOException {
        a0();
        this.f89099b.k(this.f89098a.getResponseCode());
        this.f89099b.r(this.f89098a.getContentType());
        try {
            InputStream inputStream = this.f89098a.getInputStream();
            if (inputStream != null) {
                return new Xf.a(inputStream, this.f89099b, this.f89102e);
            }
            return inputStream;
        } catch (IOException e10) {
            this.f89099b.v(this.f89102e.c());
            Xf.d.d(this.f89099b);
            throw e10;
        }
    }
}
