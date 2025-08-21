package com.google.firebase.perf.network;

import Xf.g;
import cg.l;
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

/* loaded from: classes8.dex */
class c {

    /* renamed from: f, reason: collision with root package name */
    private static final Wf.a f89939f = Wf.a.e();

    /* renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f89940a;

    /* renamed from: b, reason: collision with root package name */
    private final g f89941b;

    /* renamed from: c, reason: collision with root package name */
    private long f89942c = -1;

    /* renamed from: d, reason: collision with root package name */
    private long f89943d = -1;

    /* renamed from: e, reason: collision with root package name */
    private final l f89944e;

    private void a0() {
        if (this.f89942c == -1) {
            this.f89944e.g();
            long jE = this.f89944e.e();
            this.f89942c = jE;
            this.f89941b.q(jE);
        }
        String strF = F();
        if (strF != null) {
            this.f89941b.j(strF);
        } else if (o()) {
            this.f89941b.j("POST");
        } else {
            this.f89941b.j("GET");
        }
    }

    public boolean A() {
        return this.f89940a.getInstanceFollowRedirects();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.f89940a.getOutputStream();
            return outputStream != null ? new Zf.b(outputStream, this.f89941b, this.f89944e) : outputStream;
        } catch (IOException e10) {
            this.f89941b.v(this.f89944e.c());
            Zf.d.d(this.f89941b);
            throw e10;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f89940a.getPermission();
        } catch (IOException e10) {
            this.f89941b.v(this.f89944e.c());
            Zf.d.d(this.f89941b);
            throw e10;
        }
    }

    public int E() {
        return this.f89940a.getReadTimeout();
    }

    public String F() {
        return this.f89940a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f89940a.getRequestProperties();
    }

    public String H(String str) {
        return this.f89940a.getRequestProperty(str);
    }

    public URL K() {
        return this.f89940a.getURL();
    }

    public boolean L() {
        return this.f89940a.getUseCaches();
    }

    public void M(boolean z10) {
        this.f89940a.setAllowUserInteraction(z10);
    }

    public void N(int i10) {
        this.f89940a.setChunkedStreamingMode(i10);
    }

    public void O(int i10) {
        this.f89940a.setConnectTimeout(i10);
    }

    public void P(boolean z10) {
        this.f89940a.setDefaultUseCaches(z10);
    }

    public void Q(boolean z10) {
        this.f89940a.setDoInput(z10);
    }

    public void R(boolean z10) {
        this.f89940a.setDoOutput(z10);
    }

    public void S(int i10) {
        this.f89940a.setFixedLengthStreamingMode(i10);
    }

    public void T(long j10) {
        this.f89940a.setFixedLengthStreamingMode(j10);
    }

    public void U(long j10) {
        this.f89940a.setIfModifiedSince(j10);
    }

    public void V(boolean z10) {
        this.f89940a.setInstanceFollowRedirects(z10);
    }

    public void W(int i10) {
        this.f89940a.setReadTimeout(i10);
    }

    public void X(String str) throws ProtocolException {
        this.f89940a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if (HttpHeaders.USER_AGENT.equalsIgnoreCase(str)) {
            this.f89941b.y(str2);
        }
        this.f89940a.setRequestProperty(str, str2);
    }

    public void Z(boolean z10) {
        this.f89940a.setUseCaches(z10);
    }

    public void a(String str, String str2) {
        this.f89940a.addRequestProperty(str, str2);
    }

    public void b() throws IOException {
        if (this.f89942c == -1) {
            this.f89944e.g();
            long jE = this.f89944e.e();
            this.f89942c = jE;
            this.f89941b.q(jE);
        }
        try {
            this.f89940a.connect();
        } catch (IOException e10) {
            this.f89941b.v(this.f89944e.c());
            Zf.d.d(this.f89941b);
            throw e10;
        }
    }

    public boolean b0() {
        return this.f89940a.usingProxy();
    }

    public void c() {
        this.f89941b.v(this.f89944e.c());
        this.f89941b.b();
        this.f89940a.disconnect();
    }

    public boolean d() {
        return this.f89940a.getAllowUserInteraction();
    }

    public int e() {
        return this.f89940a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f89940a.equals(obj);
    }

    public int hashCode() {
        return this.f89940a.hashCode();
    }

    public boolean m() {
        return this.f89940a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f89940a.getDoInput();
    }

    public boolean o() {
        return this.f89940a.getDoOutput();
    }

    public String toString() {
        return this.f89940a.toString();
    }

    public long y() {
        return this.f89940a.getIfModifiedSince();
    }

    public c(HttpURLConnection httpURLConnection, l lVar, g gVar) {
        this.f89940a = httpURLConnection;
        this.f89941b = gVar;
        this.f89944e = lVar;
        gVar.x(httpURLConnection.getURL().toString());
    }

    public long B() {
        a0();
        return this.f89940a.getLastModified();
    }

    public int I() throws IOException {
        a0();
        if (this.f89943d == -1) {
            long jC = this.f89944e.c();
            this.f89943d = jC;
            this.f89941b.w(jC);
        }
        try {
            int responseCode = this.f89940a.getResponseCode();
            this.f89941b.k(responseCode);
            return responseCode;
        } catch (IOException e10) {
            this.f89941b.v(this.f89944e.c());
            Zf.d.d(this.f89941b);
            throw e10;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f89943d == -1) {
            long jC = this.f89944e.c();
            this.f89943d = jC;
            this.f89941b.w(jC);
        }
        try {
            String responseMessage = this.f89940a.getResponseMessage();
            this.f89941b.k(this.f89940a.getResponseCode());
            return responseMessage;
        } catch (IOException e10) {
            this.f89941b.v(this.f89944e.c());
            Zf.d.d(this.f89941b);
            throw e10;
        }
    }

    public Object f() throws IOException {
        a0();
        this.f89941b.k(this.f89940a.getResponseCode());
        try {
            Object content = this.f89940a.getContent();
            if (content instanceof InputStream) {
                this.f89941b.r(this.f89940a.getContentType());
                return new Zf.a((InputStream) content, this.f89941b, this.f89944e);
            }
            this.f89941b.r(this.f89940a.getContentType());
            this.f89941b.s(this.f89940a.getContentLength());
            this.f89941b.v(this.f89944e.c());
            this.f89941b.b();
            return content;
        } catch (IOException e10) {
            this.f89941b.v(this.f89944e.c());
            Zf.d.d(this.f89941b);
            throw e10;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f89941b.k(this.f89940a.getResponseCode());
        try {
            Object content = this.f89940a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f89941b.r(this.f89940a.getContentType());
                return new Zf.a((InputStream) content, this.f89941b, this.f89944e);
            }
            this.f89941b.r(this.f89940a.getContentType());
            this.f89941b.s(this.f89940a.getContentLength());
            this.f89941b.v(this.f89944e.c());
            this.f89941b.b();
            return content;
        } catch (IOException e10) {
            this.f89941b.v(this.f89944e.c());
            Zf.d.d(this.f89941b);
            throw e10;
        }
    }

    public String h() {
        a0();
        return this.f89940a.getContentEncoding();
    }

    public int i() {
        a0();
        return this.f89940a.getContentLength();
    }

    public long j() {
        a0();
        return this.f89940a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f89940a.getContentType();
    }

    public long l() {
        a0();
        return this.f89940a.getDate();
    }

    public InputStream p() {
        a0();
        try {
            this.f89941b.k(this.f89940a.getResponseCode());
        } catch (IOException unused) {
            f89939f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f89940a.getErrorStream();
        if (errorStream != null) {
            return new Zf.a(errorStream, this.f89941b, this.f89944e);
        }
        return errorStream;
    }

    public long q() {
        a0();
        return this.f89940a.getExpiration();
    }

    public String r(int i10) {
        a0();
        return this.f89940a.getHeaderField(i10);
    }

    public String s(String str) {
        a0();
        return this.f89940a.getHeaderField(str);
    }

    public long t(String str, long j10) {
        a0();
        return this.f89940a.getHeaderFieldDate(str, j10);
    }

    public int u(String str, int i10) {
        a0();
        return this.f89940a.getHeaderFieldInt(str, i10);
    }

    public String v(int i10) {
        a0();
        return this.f89940a.getHeaderFieldKey(i10);
    }

    public long w(String str, long j10) {
        a0();
        return this.f89940a.getHeaderFieldLong(str, j10);
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f89940a.getHeaderFields();
    }

    public InputStream z() throws IOException {
        a0();
        this.f89941b.k(this.f89940a.getResponseCode());
        this.f89941b.r(this.f89940a.getContentType());
        try {
            InputStream inputStream = this.f89940a.getInputStream();
            if (inputStream != null) {
                return new Zf.a(inputStream, this.f89941b, this.f89944e);
            }
            return inputStream;
        } catch (IOException e10) {
            this.f89941b.v(this.f89944e.c());
            Zf.d.d(this.f89941b);
            throw e10;
        }
    }
}
