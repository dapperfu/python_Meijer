package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public class d implements l {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f63739a;

    class a implements Executor {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Handler f63740a;

        a(Handler handler) {
            this.f63740a = handler;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f63740a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private final i f63742a;

        /* renamed from: b, reason: collision with root package name */
        private final k f63743b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f63744c;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f63742a.isCanceled()) {
                this.f63742a.finish("canceled-at-delivery");
                return;
            }
            if (this.f63743b.b()) {
                this.f63742a.deliverResponse(this.f63743b.f63777a);
            } else {
                this.f63742a.deliverError(this.f63743b.f63779c);
            }
            if (this.f63743b.f63780d) {
                this.f63742a.addMarker("intermediate-response");
            } else {
                this.f63742a.finish("done");
            }
            Runnable runnable = this.f63744c;
            if (runnable != null) {
                runnable.run();
            }
        }

        public b(i iVar, k kVar, Runnable runnable) {
            this.f63742a = iVar;
            this.f63743b = kVar;
            this.f63744c = runnable;
        }
    }

    @Override // com.android.volley.l
    public void a(i<?> iVar, k<?> kVar) {
        b(iVar, kVar, null);
    }

    @Override // com.android.volley.l
    public void c(i<?> iVar, VolleyError volleyError) {
        iVar.addMarker("post-error");
        this.f63739a.execute(new b(iVar, k.a(volleyError), null));
    }

    public d(Handler handler) {
        this.f63739a = new a(handler);
    }

    @Override // com.android.volley.l
    public void b(i<?> iVar, k<?> kVar, Runnable runnable) {
        iVar.markDelivered();
        iVar.addMarker("post-response");
        this.f63739a.execute(new b(iVar, kVar, runnable));
    }
}
