package Zf;

import Xf.g;
import cg.l;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes8.dex */
public class c<T> implements ResponseHandler<T> {

    /* renamed from: a, reason: collision with root package name */
    private final ResponseHandler<? extends T> f43796a;

    /* renamed from: b, reason: collision with root package name */
    private final l f43797b;

    /* renamed from: c, reason: collision with root package name */
    private final g f43798c;

    @Override // org.apache.http.client.ResponseHandler
    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f43798c.v(this.f43797b.c());
        this.f43798c.k(httpResponse.getStatusLine().getStatusCode());
        Long lA = d.a(httpResponse);
        if (lA != null) {
            this.f43798c.s(lA.longValue());
        }
        String strB = d.b(httpResponse);
        if (strB != null) {
            this.f43798c.r(strB);
        }
        this.f43798c.b();
        return this.f43796a.handleResponse(httpResponse);
    }

    public c(ResponseHandler<? extends T> responseHandler, l lVar, g gVar) {
        this.f43796a = responseHandler;
        this.f43797b = lVar;
        this.f43798c = gVar;
    }
}
