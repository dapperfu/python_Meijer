package com.google.firebase.perf.network;

import Vf.g;
import Zf.k;
import ag.l;
import java.io.IOException;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes7.dex */
public class d implements Qv.b {

    /* renamed from: a, reason: collision with root package name */
    private final Qv.b f89103a;

    /* renamed from: b, reason: collision with root package name */
    private final g f89104b;

    /* renamed from: c, reason: collision with root package name */
    private final l f89105c;

    /* renamed from: d, reason: collision with root package name */
    private final long f89106d;

    @Override // Qv.b
    public void onResponse(okhttp3.d dVar, Response response) throws IOException {
        FirebasePerfOkHttpClient.a(response, this.f89104b, this.f89106d, this.f89105c.c());
        this.f89103a.onResponse(dVar, response);
    }

    public d(Qv.b bVar, k kVar, l lVar, long j10) {
        this.f89103a = bVar;
        this.f89104b = g.c(kVar);
        this.f89106d = j10;
        this.f89105c = lVar;
    }

    @Override // Qv.b
    public void onFailure(okhttp3.d dVar, IOException iOException) {
        Request request = dVar.request();
        if (request != null) {
            HttpUrl url = request.getUrl();
            if (url != null) {
                this.f89104b.x(url.z().toString());
            }
            if (request.getMethod() != null) {
                this.f89104b.j(request.getMethod());
            }
        }
        this.f89104b.q(this.f89106d);
        this.f89104b.v(this.f89105c.c());
        Xf.d.d(this.f89104b);
        this.f89103a.onFailure(dVar, iOException);
    }
}
