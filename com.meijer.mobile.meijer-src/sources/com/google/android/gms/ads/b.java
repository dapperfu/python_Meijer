package com.google.android.gms.ads;

import Jc.j;
import Jc.k;
import Jc.m;
import Oc.A;
import Oc.A1;
import Oc.C4393f1;
import Oc.C4447y;
import Oc.N;
import Oc.Q;
import Oc.Q1;
import Oc.R1;
import Oc.c2;
import Sc.p;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads.BinderC10186yl;
import com.google.android.gms.internal.ads.BinderC7830ci;
import com.google.android.gms.internal.ads.BinderC8480in;
import com.google.android.gms.internal.ads.C7088Mg;
import com.google.android.gms.internal.ads.C7724bi;
import com.google.android.gms.internal.ads.C8679kg;
import com.google.android.gms.internal.ads.C8784lf;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final c2 f65390a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f65391b;

    /* renamed from: c, reason: collision with root package name */
    private final N f65392c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final Context f65393a;

        /* renamed from: b, reason: collision with root package name */
        private final Q f65394b;

        public a(Context context, String str) {
            Context context2 = (Context) r.m(context, "context cannot be null");
            Q qC = C4447y.a().c(context, str, new BinderC10186yl());
            this.f65393a = context2;
            this.f65394b = qC;
        }

        public b a() {
            try {
                return new b(this.f65393a, this.f65394b.zze(), c2.f23399a);
            } catch (RemoteException e10) {
                p.e("Failed to build AdLoader.", e10);
                return new b(this.f65393a, new A1().C9(), c2.f23399a);
            }
        }

        public a b(NativeAd.c cVar) {
            try {
                this.f65394b.e5(new BinderC8480in(cVar));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to add google native ad listener", e10);
                return this;
            }
        }

        public a c(Gc.c cVar) {
            try {
                this.f65394b.V6(new Q1(cVar));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to set AdListener.", e10);
                return this;
            }
        }

        public a d(com.google.android.gms.ads.nativead.a aVar) {
            try {
                this.f65394b.t8(new C7088Mg(4, aVar.e(), -1, aVar.d(), aVar.a(), aVar.c() != null ? new R1(aVar.c()) : null, aVar.h(), aVar.b(), aVar.f(), aVar.g(), aVar.i() - 1));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to specify native ad options", e10);
                return this;
            }
        }

        @Deprecated
        public final a e(String str, k kVar, j jVar) {
            C7724bi c7724bi = new C7724bi(kVar, jVar);
            try {
                this.f65394b.s7(str, c7724bi.d(), c7724bi.c());
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to add custom template ad listener", e10);
                return this;
            }
        }

        @Deprecated
        public final a f(m mVar) {
            try {
                this.f65394b.e5(new BinderC7830ci(mVar));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to add google native ad listener", e10);
                return this;
            }
        }

        @Deprecated
        public final a g(Jc.d dVar) {
            try {
                this.f65394b.t8(new C7088Mg(dVar));
                return this;
            } catch (RemoteException e10) {
                p.h("Failed to specify native ad options", e10);
                return this;
            }
        }
    }

    private final void c(final C4393f1 c4393f1) {
        C8784lf.a(this.f65391b);
        if (((Boolean) C8679kg.f76527c.e()).booleanValue()) {
            if (((Boolean) A.c().a(C8784lf.f77115bb)).booleanValue()) {
                Sc.c.f34487b.execute(new Runnable() { // from class: com.google.android.gms.ads.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f65396a.b(c4393f1);
                    }
                });
                return;
            }
        }
        try {
            this.f65392c.h6(this.f65390a.a(this.f65391b, c4393f1));
        } catch (RemoteException e10) {
            p.e("Failed to load ad.", e10);
        }
    }

    public void a(c cVar) {
        c(cVar.f65395a);
    }

    final /* synthetic */ void b(C4393f1 c4393f1) {
        try {
            this.f65392c.h6(this.f65390a.a(this.f65391b, c4393f1));
        } catch (RemoteException e10) {
            p.e("Failed to load ad.", e10);
        }
    }

    b(Context context, N n10, c2 c2Var) {
        this.f65391b = context;
        this.f65392c = n10;
        this.f65390a = c2Var;
    }
}
