package Wv;

import com.google.maps.internal.HttpHeaders;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kw.q;
import kw.w;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011¨\u0006\u0012"}, d2 = {"LWv/a;", "Lokhttp3/Interceptor;", "LQv/j;", "cookieJar", "<init>", "(LQv/j;)V", "", "LQv/i;", "cookies", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "LQv/j;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class a implements Interceptor {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Qv.j cookieJar;

    public a(Qv.j cookieJar) {
        Intrinsics.j(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    private final String a(List<Qv.i> cookies) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : cookies) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            Qv.i iVar = (Qv.i) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(iVar.getName());
            sb2.append('=');
            sb2.append(iVar.getValue());
            i10 = i11;
        }
        return sb2.toString();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        ResponseBody body;
        Intrinsics.j(chain, "chain");
        Request request = chain.request();
        Request.a aVarG = request.g();
        RequestBody body2 = request.getBody();
        if (body2 != null) {
            okhttp3.j contentType = body2.getContentType();
            if (contentType != null) {
                aVarG.m("Content-Type", contentType.getMediaType());
            }
            long jContentLength = body2.contentLength();
            if (jContentLength != -1) {
                aVarG.m("Content-Length", String.valueOf(jContentLength));
                aVarG.q("Transfer-Encoding");
            } else {
                aVarG.m("Transfer-Encoding", "chunked");
                aVarG.q("Content-Length");
            }
        }
        boolean z10 = false;
        if (request.d("Host") == null) {
            aVarG.m("Host", Rv.k.w(request.getUrl(), false, 1, null));
        }
        if (request.d("Connection") == null) {
            aVarG.m("Connection", "Keep-Alive");
        }
        if (request.d("Accept-Encoding") == null && request.d("Range") == null) {
            aVarG.m("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<Qv.i> listA = this.cookieJar.a(request.getUrl());
        if (!listA.isEmpty()) {
            aVarG.m("Cookie", a(listA));
        }
        if (request.d(HttpHeaders.USER_AGENT) == null) {
            aVarG.m(HttpHeaders.USER_AGENT, "okhttp/5.1.0");
        }
        Request requestB = aVarG.b();
        Response responseProceed = chain.proceed(requestB);
        e.f(this.cookieJar, requestB.getUrl(), responseProceed.getHeaders());
        Response.a aVarQ = responseProceed.p().q(requestB);
        if (z10 && StringsKt.H("gzip", Response.j(responseProceed, "Content-Encoding", null, 2, null), true) && e.b(responseProceed) && (body = responseProceed.getBody()) != null) {
            q qVar = new q(body.getSource());
            aVarQ.j(responseProceed.getHeaders().k().i("Content-Encoding").i("Content-Length").f());
            aVarQ.b(new h(Response.j(responseProceed, "Content-Type", null, 2, null), -1L, w.d(qVar)));
        }
        return aVarQ.c();
    }
}
