package Xf;

import Vf.g;
import ag.l;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes7.dex */
public class c<T> implements ResponseHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ResponseHandler<? extends T> f39318a;

    /* renamed from: b, reason: collision with root package name */
    private final l f39319b;

    /* renamed from: c, reason: collision with root package name */
    private final g f39320c;

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f39320c.v(this.f39319b.c());
        this.f39320c.k(httpResponse.getStatusLine().getStatusCode());
        Long lA = d.a(httpResponse);
        if (lA != null) {
            this.f39320c.s(lA.longValue());
        }
        String strB = d.b(httpResponse);
        if (strB != null) {
            this.f39320c.r(strB);
        }
        this.f39320c.b();
        return this.f39318a.handleResponse(httpResponse);
    }

    public c(ResponseHandler<? extends T> responseHandler, l lVar, g gVar) {
        this.f39318a = responseHandler;
        this.f39319b = lVar;
        this.f39320c = gVar;
    }
}
