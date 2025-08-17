package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class d implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f62900a;

    class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f62901a;

        a(Handler handler) {
            this.f62901a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f62901a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final i f62903a;

        /* renamed from: b, reason: collision with root package name */
        private final k f62904b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f62905c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f62903a.isCanceled()) {
                this.f62903a.finish("canceled-at-delivery");
                return;
            }
            if (this.f62904b.b()) {
                this.f62903a.deliverResponse(this.f62904b.f62938a);
            } else {
                this.f62903a.deliverError(this.f62904b.f62940c);
            }
            if (this.f62904b.f62941d) {
                this.f62903a.addMarker("intermediate-response");
            } else {
                this.f62903a.finish("done");
            }
            Runnable runnable = this.f62905c;
            if (runnable != null) {
                runnable.run();
            }
        }

        public b(i iVar, k kVar, Runnable runnable) {
            this.f62903a = iVar;
            this.f62904b = kVar;
            this.f62905c = runnable;
        }
    }

    @Override // com.android.volley.l
    public void a(i<?> iVar, k<?> kVar) {
        b(iVar, kVar, null);
    }

    @Override // com.android.volley.l
    public void c(i<?> iVar, VolleyError volleyError) {
        iVar.addMarker("post-error");
        this.f62900a.execute(new b(iVar, k.a(volleyError), null));
    }

    public d(Handler handler) {
        this.f62900a = new a(handler);
    }

    @Override // com.android.volley.l
    public void b(i<?> iVar, k<?> kVar, Runnable runnable) {
        iVar.markDelivered();
        iVar.addMarker("post-response");
        this.f62900a.execute(new b(iVar, kVar, runnable));
    }
}
