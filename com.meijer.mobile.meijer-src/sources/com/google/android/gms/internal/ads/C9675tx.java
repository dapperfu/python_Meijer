package com.google.android.gms.internal.ads;

import Oc.InterfaceC4376a;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.tx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9675tx implements ZB, PC, InterfaceC9706uC, InterfaceC4376a, InterfaceC9279qC, YF {

    /* renamed from: a, reason: collision with root package name */
    private final Context f79526a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f79527b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f79528c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f79529d;

    /* renamed from: e, reason: collision with root package name */
    private final C8733l60 f79530e;

    /* renamed from: f, reason: collision with root package name */
    private final Z50 f79531f;

    /* renamed from: g, reason: collision with root package name */
    private final L90 f79532g;

    /* renamed from: h, reason: collision with root package name */
    private final F60 f79533h;

    /* renamed from: i, reason: collision with root package name */
    private final M9 f79534i;

    /* renamed from: j, reason: collision with root package name */
    private final C7290Sf f79535j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f79536k;

    /* renamed from: l, reason: collision with root package name */
    private final WeakReference f79537l;

    /* renamed from: m, reason: collision with root package name */
    private final C10132yB f79538m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f79539n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f79540o = new AtomicBoolean();

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.PC
    public final synchronized void zzs() {
        C10132yB c10132yB;
        try {
            if (this.f79539n) {
                ArrayList arrayList = new ArrayList(d0());
                arrayList.addAll(this.f79531f.f72871f);
                this.f79533h.a(this.f79532g.d(this.f79530e, this.f79531f, true, null, null, arrayList));
            } else {
                F60 f60 = this.f79533h;
                L90 l90 = this.f79532g;
                C8733l60 c8733l60 = this.f79530e;
                Z50 z50 = this.f79531f;
                f60.a(l90.c(c8733l60, z50, z50.f72885m));
                if (((Boolean) Oc.A.c().a(C8784lf.f76856J3)).booleanValue() && (c10132yB = this.f79538m) != null) {
                    List listH = L90.h(L90.g(c10132yB.b().f72885m, c10132yB.a().g()), this.f79538m.a().a());
                    F60 f602 = this.f79533h;
                    L90 l902 = this.f79532g;
                    C10132yB c10132yB2 = this.f79538m;
                    f602.a(l902.c(c10132yB2.c(), c10132yB2.b(), listH));
                }
                F60 f603 = this.f79533h;
                L90 l903 = this.f79532g;
                C8733l60 c8733l602 = this.f79530e;
                Z50 z502 = this.f79531f;
                f603.a(l903.c(c8733l602, z502, z502.f72871f));
            }
            this.f79539n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List d0() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77269mb)).booleanValue()) {
            Nc.v.t();
            if (Rc.D0.c(this.f79526a)) {
                Nc.v.t();
                Integer numY = Rc.D0.Y(this.f79526a);
                if (numY != null) {
                    int iMin = Math.min(numY.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f79531f.f72867d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.f79531f.f72867d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        String strZzh;
        int i10;
        List list = this.f79531f.f72867d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76786E3)).booleanValue()) {
            strZzh = this.f79534i.c().zzh(this.f79526a, (View) this.f79536k.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) Oc.A.c().a(C8784lf.f76741B0)).booleanValue() && this.f79530e.f76589b.f76177b.f73949h) || !((Boolean) C8786lg.f77461h.e()).booleanValue()) {
            this.f79533h.a(this.f79532g.d(this.f79530e, this.f79531f, false, strZzh, null, d0()));
            return;
        }
        if (((Boolean) C8786lg.f77460g.e()).booleanValue() && ((i10 = this.f79531f.f72863b) == 1 || i10 == 2 || i10 == 5)) {
        }
        Mj0.r((Cj0) Mj0.o(Cj0.D(Mj0.h(null)), ((Long) Oc.A.c().a(C8784lf.f77147e1)).longValue(), TimeUnit.MILLISECONDS, this.f79529d), new C9568sx(this, strZzh), this.f79527b);
    }

    private final void k0(final int i10, final int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.f79536k.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            g0();
        } else {
            this.f79529d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.px
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78503a.N(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        }
    }

    final /* synthetic */ void N(final int i10, final int i11) {
        this.f79527b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qx
            @Override // java.lang.Runnable
            public final void run() {
                this.f78710a.Z(i10, i11);
            }
        });
    }

    final /* synthetic */ void Z(int i10, int i11) {
        k0(i10 - 1, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9279qC
    public final void j(Oc.W0 w02) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76770D1)).booleanValue()) {
            this.f79533h.a(this.f79532g.c(this.f79530e, this.f79531f, L90.f(2, w02.f23346a, this.f79531f.f72889o)));
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6963Io interfaceC6963Io, String str, String str2) {
        F60 f60 = this.f79533h;
        L90 l90 = this.f79532g;
        Z50 z50 = this.f79531f;
        f60.a(l90.e(z50, z50.f72875h, interfaceC6963Io));
    }

    @Override // Oc.InterfaceC4376a
    public final void v() {
        if (!(((Boolean) Oc.A.c().a(C8784lf.f76741B0)).booleanValue() && this.f79530e.f76589b.f76177b.f73949h) && ((Boolean) C8786lg.f77457d.e()).booleanValue()) {
            Mj0.r((Cj0) Mj0.e(Cj0.D(this.f79535j.a()), Throwable.class, new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.nx
                @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, C7033Kq.f69020g), new C9461rx(this), this.f79527b);
            return;
        }
        F60 f60 = this.f79533h;
        L90 l90 = this.f79532g;
        C8733l60 c8733l60 = this.f79530e;
        Z50 z50 = this.f79531f;
        f60.c(l90.c(c8733l60, z50, z50.f72865c), true == Nc.v.s().a(this.f79526a) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zze() {
        F60 f60 = this.f79533h;
        L90 l90 = this.f79532g;
        C8733l60 c8733l60 = this.f79530e;
        Z50 z50 = this.f79531f;
        f60.a(l90.c(c8733l60, z50, z50.f72877i));
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzf() {
        F60 f60 = this.f79533h;
        L90 l90 = this.f79532g;
        C8733l60 c8733l60 = this.f79530e;
        Z50 z50 = this.f79531f;
        f60.a(l90.c(c8733l60, z50, z50.f72873g));
    }

    final /* synthetic */ void zzn() {
        this.f79527b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ox
            @Override // java.lang.Runnable
            public final void run() {
                this.f78289a.g0();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9706uC
    public final void zzr() {
        if (this.f79540o.compareAndSet(false, true)) {
            int iIntValue = ((Integer) Oc.A.c().a(C8784lf.f76912N3)).intValue();
            if (iIntValue > 0) {
                k0(iIntValue, ((Integer) Oc.A.c().a(C8784lf.f76926O3)).intValue());
                return;
            }
            if (((Boolean) Oc.A.c().a(C8784lf.f76898M3)).booleanValue()) {
                this.f79528c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f77782a.zzn();
                    }
                });
            } else {
                g0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.YF
    public final void zzt() {
        F60 f60 = this.f79533h;
        L90 l90 = this.f79532g;
        C8733l60 c8733l60 = this.f79530e;
        Z50 z50 = this.f79531f;
        f60.a(l90.c(c8733l60, z50, z50.f72902u0));
    }

    C9675tx(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, C8733l60 c8733l60, Z50 z50, L90 l90, F60 f60, View view, InterfaceC9133ot interfaceC9133ot, M9 m92, C7290Sf c7290Sf, C7358Uf c7358Uf, W80 w80, C10132yB c10132yB) {
        this.f79526a = context;
        this.f79527b = executor;
        this.f79528c = executor2;
        this.f79529d = scheduledExecutorService;
        this.f79530e = c8733l60;
        this.f79531f = z50;
        this.f79532g = l90;
        this.f79533h = f60;
        this.f79534i = m92;
        this.f79536k = new WeakReference(view);
        this.f79537l = new WeakReference(interfaceC9133ot);
        this.f79535j = c7290Sf;
        this.f79538m = c10132yB;
    }
}
