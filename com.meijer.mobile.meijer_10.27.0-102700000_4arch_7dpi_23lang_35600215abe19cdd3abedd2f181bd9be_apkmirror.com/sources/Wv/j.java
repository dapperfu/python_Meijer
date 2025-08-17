package Wv;

import Qv.s;
import Vv.o;
import Vv.p;
import com.google.android.gms.common.api.a;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.http2.ConnectionShutdownException;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0007\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%¨\u0006&"}, d2 = {"LWv/j;", "Lokhttp3/Interceptor;", "Lokhttp3/OkHttpClient;", "client", "<init>", "(Lokhttp3/OkHttpClient;)V", "Ljava/io/IOException;", "e", "LVv/o;", "call", "Lokhttp3/Request;", "userRequest", "", "d", "(Ljava/io/IOException;LVv/o;Lokhttp3/Request;)Z", "(Ljava/io/IOException;Lokhttp3/Request;)Z", "requestSendStarted", "c", "(Ljava/io/IOException;Z)Z", "Lokhttp3/Response;", "userResponse", "LVv/i;", "exchange", "b", "(Lokhttp3/Response;LVv/i;)Lokhttp3/Request;", "", "method", "a", "(Lokhttp3/Response;Ljava/lang/String;)Lokhttp3/Request;", "", "defaultDelay", "f", "(Lokhttp3/Response;I)I", "Lokhttp3/Interceptor$Chain;", "chain", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "Lokhttp3/OkHttpClient;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class j implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final OkHttpClient client;

    private final Request b(Response userResponse, Vv.i exchange) throws IOException {
        p pVarJ;
        s sVarW = (exchange == null || (pVarJ = exchange.j()) == null) ? null : pVarJ.w();
        int code = userResponse.getCode();
        String method = userResponse.getRequest().getMethod();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.getAuthenticator().a(sVarW, userResponse);
            }
            if (code == 421) {
                RequestBody body = userResponse.getRequest().getBody();
                if ((body != null && body.isOneShot()) || exchange == null || !exchange.n()) {
                    return null;
                }
                exchange.j().v();
                return userResponse.getRequest();
            }
            if (code == 503) {
                Response priorResponse = userResponse.getPriorResponse();
                if ((priorResponse == null || priorResponse.getCode() != 503) && f(userResponse, a.e.API_PRIORITY_OTHER) == 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            if (code == 407) {
                Intrinsics.g(sVarW);
                if (sVarW.getProxy().type() == Proxy.Type.HTTP) {
                    return this.client.getProxyAuthenticator().a(sVarW, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (code == 408) {
                if (!this.client.getRetryOnConnectionFailure()) {
                    return null;
                }
                RequestBody body2 = userResponse.getRequest().getBody();
                if (body2 != null && body2.isOneShot()) {
                    return null;
                }
                Response priorResponse2 = userResponse.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.getCode() != 408) && f(userResponse, 0) <= 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            switch (code) {
                case HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES /* 300 */:
                case HttpResponseStatus.REDIRECTION_MOVED_PERMANENTLY /* 301 */:
                case HttpResponseStatus.REDIRECTION_FOUND /* 302 */:
                case HttpResponseStatus.REDIRECTION_SEE_OTHER /* 303 */:
                    break;
                default:
                    return null;
            }
        }
        return a(userResponse, method);
    }

    private final int f(Response userResponse, int defaultDelay) throws NumberFormatException {
        String strJ = Response.j(userResponse, "Retry-After", null, 2, null);
        if (strJ == null) {
            return defaultDelay;
        }
        if (!new Regex("\\d+").j(strJ)) {
            return a.e.API_PRIORITY_OTHER;
        }
        Integer numValueOf = Integer.valueOf(strJ);
        Intrinsics.i(numValueOf, "valueOf(...)");
        return numValueOf.intValue();
    }

    public j(OkHttpClient client) {
        Intrinsics.j(client, "client");
        this.client = client;
    }

    private final Request a(Response userResponse, String method) {
        String strJ;
        HttpUrl httpUrlW;
        if (!this.client.getFollowRedirects() || (strJ = Response.j(userResponse, "Location", null, 2, null)) == null || (httpUrlW = userResponse.getRequest().getUrl().w(strJ)) == null) {
            return null;
        }
        if (!Intrinsics.e(httpUrlW.getScheme(), userResponse.getRequest().getUrl().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        Request.a aVarG = userResponse.getRequest().g();
        if (f.b(method)) {
            int code = userResponse.getCode();
            f fVar = f.f39032a;
            boolean z10 = fVar.d(method) || code == 308 || code == 307;
            if (!fVar.c(method) || code == 308 || code == 307) {
                aVarG.o(method, z10 ? userResponse.getRequest().getBody() : null);
            } else {
                aVarG.o("GET", null);
            }
            if (!z10) {
                aVarG.q("Transfer-Encoding");
                aVarG.q("Content-Length");
                aVarG.q("Content-Type");
            }
        }
        if (!Rv.k.f(userResponse.getRequest().getUrl(), httpUrlW)) {
            aVarG.q("Authorization");
        }
        return aVarG.v(httpUrlW).b();
    }

    private final boolean c(IOException e10, boolean requestSendStarted) {
        if (e10 instanceof ProtocolException) {
            return false;
        }
        return e10 instanceof InterruptedIOException ? (e10 instanceof SocketTimeoutException) && !requestSendStarted : (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean d(IOException e10, o call, Request userRequest) {
        boolean z10 = e10 instanceof ConnectionShutdownException;
        boolean z11 = !z10;
        if (this.client.getRetryOnConnectionFailure()) {
            return (z10 || !e(e10, userRequest)) && c(e10, z11) && call.x();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r6 = Rv.c.a(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r7 = r0.n(r6).c();
        r0 = r1.getInterceptorScopedExchange();
        r6 = b(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r0 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r0.getIsDuplex() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        r1.y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r1.getEventListener().o(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
    
        r1.i(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
    
        r0 = r6.getBody();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0069, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r0.isOneShot() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r1.getEventListener().o(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r1.i(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007b, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        Rv.h.f(r7.getBody());
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if (r8 > 20) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0089, code lost:
    
        r1.getEventListener().o(r1, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
    
        r1.getEventListener().o(r1, r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        throw new java.net.ProtocolException("Too many follow-up requests: " + r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
    
        r1.i(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
    
        throw r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r0 = r12.proceed(r0).p().q(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
    
        if (r7 == null) goto L13;
     */
    @Override // okhttp3.Interceptor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r12) throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.j(r12, r0)
            Wv.g r12 = (Wv.g) r12
            okhttp3.Request r0 = r12.getRequest()
            Vv.o r1 = r12.getCall()
            java.util.List r2 = kotlin.collections.CollectionsKt.m()
            r3 = 0
            r4 = 0
            r5 = 1
            r8 = r3
            r7 = r4
        L18:
            r6 = r5
        L19:
            r1.g(r0, r6, r12)
            boolean r6 = r1.getCanceled()     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto Ld2
            okhttp3.Response r6 = r12.proceed(r0)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> Lb3
            okhttp3.Response$a r6 = r6.p()     // Catch: java.lang.Throwable -> L35
            okhttp3.Response$a r0 = r6.q(r0)     // Catch: java.lang.Throwable -> L35
            if (r7 == 0) goto L39
            okhttp3.Response r6 = Rv.c.a(r7)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r12 = move-exception
            r3 = r5
            goto Lda
        L39:
            r6 = r4
        L3a:
            okhttp3.Response$a r0 = r0.n(r6)     // Catch: java.lang.Throwable -> L35
            okhttp3.Response r7 = r0.c()     // Catch: java.lang.Throwable -> L35
            Vv.i r0 = r1.getInterceptorScopedExchange()     // Catch: java.lang.Throwable -> L35
            okhttp3.Request r6 = r11.b(r7, r0)     // Catch: java.lang.Throwable -> L35
            if (r6 != 0) goto L65
            if (r0 == 0) goto L57
            boolean r12 = r0.getIsDuplex()     // Catch: java.lang.Throwable -> L35
            if (r12 == 0) goto L57
            r1.y()     // Catch: java.lang.Throwable -> L35
        L57:
            okhttp3.g r12 = r1.getEventListener()     // Catch: java.lang.Throwable -> L62
            r12.o(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.i(r3)
            return r7
        L62:
            r12 = move-exception
            goto Lda
        L65:
            okhttp3.RequestBody r0 = r6.getBody()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            boolean r0 = r0.isOneShot()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L7c
            okhttp3.g r12 = r1.getEventListener()     // Catch: java.lang.Throwable -> L62
            r12.o(r1, r7, r4)     // Catch: java.lang.Throwable -> L62
            r1.i(r3)
            return r7
        L7c:
            okhttp3.ResponseBody r0 = r7.getBody()     // Catch: java.lang.Throwable -> L35
            Rv.h.f(r0)     // Catch: java.lang.Throwable -> L35
            int r8 = r8 + 1
            r0 = 20
            if (r8 > r0) goto L95
            okhttp3.g r0 = r1.getEventListener()     // Catch: java.lang.Throwable -> L35
            r0.o(r1, r7, r6)     // Catch: java.lang.Throwable -> L35
            r1.i(r5)
            r0 = r6
            goto L18
        L95:
            okhttp3.g r12 = r1.getEventListener()     // Catch: java.lang.Throwable -> L35
            r12.o(r1, r7, r4)     // Catch: java.lang.Throwable -> L35
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = "Too many follow-up requests: "
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            r0.append(r8)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Lb3:
            r6 = move-exception
            boolean r9 = r11.d(r6, r1, r0)     // Catch: java.lang.Throwable -> L35
            okhttp3.g r10 = r1.getEventListener()     // Catch: java.lang.Throwable -> L35
            r10.B(r1, r6, r9)     // Catch: java.lang.Throwable -> L35
            if (r9 == 0) goto Lcd
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.Throwable -> L35
            java.util.List r2 = kotlin.collections.CollectionsKt.Q0(r2, r6)     // Catch: java.lang.Throwable -> L35
            r1.i(r5)
            r6 = r3
            goto L19
        Lcd:
            java.lang.Throwable r12 = Rv.h.G(r6, r2)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Ld2:
            java.io.IOException r12 = new java.io.IOException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "Canceled"
            r12.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r12     // Catch: java.lang.Throwable -> L35
        Lda:
            r1.i(r3)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: Wv.j.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }

    private final boolean e(IOException e10, Request userRequest) {
        RequestBody body = userRequest.getBody();
        if ((body != null && body.isOneShot()) || (e10 instanceof FileNotFoundException)) {
            return true;
        }
        return false;
    }
}
