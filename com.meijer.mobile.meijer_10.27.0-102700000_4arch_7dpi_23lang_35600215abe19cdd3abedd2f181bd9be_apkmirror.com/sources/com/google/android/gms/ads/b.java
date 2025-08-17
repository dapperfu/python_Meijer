package com.google.android.gms.ads;

import Hc.j;
import Hc.k;
import Hc.m;
import Mc.A;
import Mc.A1;
import Mc.C4115f1;
import Mc.C4169y;
import Mc.N;
import Mc.Q;
import Mc.Q1;
import Mc.R1;
import Mc.c2;
import Qc.p;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.BinderC10061yl;
import com.google.android.gms.internal.ads.BinderC7705ci;
import com.google.android.gms.internal.ads.BinderC8355in;
import com.google.android.gms.internal.ads.C6963Mg;
import com.google.android.gms.internal.ads.C7599bi;
import com.google.android.gms.internal.ads.C8554kg;
import com.google.android.gms.internal.ads.C8659lf;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f64550a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f64551b;

    /* renamed from: c, reason: collision with root package name */
    private final N f64552c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f64553a;

        /* renamed from: b, reason: collision with root package name */
        private final Q f64554b;

        public a(Context context, String str) {
            Context context2 = (Context) r.m(context, "context cannot be null");
            Q qC = C4169y.a().c(context, str, new BinderC10061yl());
            this.f64553a = context2;
            this.f64554b = qC;
        }

        public b a() {
            try {
                return new b(this.f64553a, this.f64554b.zze(), c2.f19212a);
            } catch (RemoteException e10) {
                p.e("Failed to build AdLoader.", e10);
                return new b(this.f64553a, new A1().C9(), c2.f19212a);
            }
        }

        public a b(NativeAd.c cVar) {
            try {
                this.f64554b.O4(new BinderC8355in(cVar));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to add google native ad listener", e10);
                return this;
            }
        }

        public a c(Ec.c cVar) {
            try {
                this.f64554b.W6(new Q1(cVar));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to set AdListener.", e10);
                return this;
            }
        }

        public a d(com.google.android.gms.ads.nativead.a aVar) {
            try {
                this.f64554b.y8(new C6963Mg(4, aVar.e(), -1, aVar.d(), aVar.a(), aVar.c() != null ? new R1(aVar.c()) : null, aVar.h(), aVar.b(), aVar.f(), aVar.g(), aVar.i() - 1));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to specify native ad options", e10);
                return this;
            }
        }

        @Deprecated
        public final a e(String str, k kVar, j jVar) {
            C7599bi c7599bi = new C7599bi(kVar, jVar);
            try {
                this.f64554b.l7(str, c7599bi.d(), c7599bi.c());
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to add custom template ad listener", e10);
                return this;
            }
        }

        @Deprecated
        public final a f(m mVar) {
            try {
                this.f64554b.O4(new BinderC7705ci(mVar));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to add google native ad listener", e10);
                return this;
            }
        }

        @Deprecated
        public final a g(Hc.d dVar) {
            try {
                this.f64554b.y8(new C6963Mg(dVar));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to specify native ad options", e10);
                return this;
            }
        }
    }

    private final void c(final C4115f1 c4115f1) {
        C8659lf.a(this.f64551b);
        if (((Boolean) C8554kg.f75687c.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8659lf.f76275bb)).booleanValue()) {
                Qc.c.f29937b.execute(new Runnable() { // from class: com.google.android.gms.ads.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64556a.b(c4115f1);
                    }
                });
                return;
            }
        }
        try {
            this.f64552c.w7(this.f64550a.a(this.f64551b, c4115f1));
        } catch (RemoteException e10) {
            p.e("Failed to load ad.", e10);
        }
    }

    public void a(c cVar) {
        c(cVar.f64555a);
    }

    final /* synthetic */ void b(C4115f1 c4115f1) {
        try {
            this.f64552c.w7(this.f64550a.a(this.f64551b, c4115f1));
        } catch (RemoteException e10) {
            p.e("Failed to load ad.", e10);
        }
    }

    b(Context context, N n10, c2 c2Var) {
        this.f64551b = context;
        this.f64552c = n10;
        this.f64550a = c2Var;
    }
}
