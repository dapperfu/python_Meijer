package com.google.firebase.perf.network;

import Xf.g;
import bg.k;
import cg.l;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes8.dex */
public class d implements Mv.b {

    /* renamed from: a, reason: collision with root package name */
    private final Mv.b f89945a;

    /* renamed from: b, reason: collision with root package name */
    private final g f89946b;

    /* renamed from: c, reason: collision with root package name */
    private final l f89947c;

    /* renamed from: d, reason: collision with root package name */
    private final long f89948d;

    @Override // Mv.b
    public void onResponse(okhttp3.d dVar, Response response) throws IOException {
        FirebasePerfOkHttpClient.a(response, this.f89946b, this.f89948d, this.f89947c.c());
        this.f89945a.onResponse(dVar, response);
    }

    public d(Mv.b bVar, k kVar, l lVar, long j10) {
        this.f89945a = bVar;
        this.f89946b = g.c(kVar);
        this.f89948d = j10;
        this.f89947c = lVar;
    }

    @Override // Mv.b
    public void onFailure(okhttp3.d dVar, IOException iOException) {
        Request request = dVar.request();
        if (request != null) {
            HttpUrl url = request.getUrl();
            if (url != null) {
                this.f89946b.x(url.z().toString());
            }
            if (request.getMethod() != null) {
                this.f89946b.j(request.getMethod());
            }
        }
        this.f89946b.q(this.f89948d);
        this.f89946b.v(this.f89947c.c());
        Zf.d.d(this.f89946b);
        this.f89945a.onFailure(dVar, iOException);
    }
}
