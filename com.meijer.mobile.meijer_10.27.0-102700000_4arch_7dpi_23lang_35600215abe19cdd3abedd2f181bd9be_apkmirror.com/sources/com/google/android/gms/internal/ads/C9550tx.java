package com.google.android.gms.internal.ads;

import Mc.InterfaceC4098a;
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
public final class C9550tx implements ZB, PC, InterfaceC9581uC, InterfaceC4098a, InterfaceC9154qC, YF {

    /* renamed from: a, reason: collision with root package name */
    private final Context f78686a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f78687b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f78688c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f78689d;

    /* renamed from: e, reason: collision with root package name */
    private final C8608l60 f78690e;

    /* renamed from: f, reason: collision with root package name */
    private final Z50 f78691f;

    /* renamed from: g, reason: collision with root package name */
    private final L90 f78692g;

    /* renamed from: h, reason: collision with root package name */
    private final F60 f78693h;

    /* renamed from: i, reason: collision with root package name */
    private final M9 f78694i;

    /* renamed from: j, reason: collision with root package name */
    private final C7165Sf f78695j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f78696k;

    /* renamed from: l, reason: collision with root package name */
    private final WeakReference f78697l;

    /* renamed from: m, reason: collision with root package name */
    private final C10007yB f78698m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f78699n;

    /* renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f78700o = new AtomicBoolean();

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
        C10007yB c10007yB;
        try {
            if (this.f78699n) {
                ArrayList arrayList = new ArrayList(b0());
                arrayList.addAll(this.f78691f.f72031f);
                this.f78693h.a(this.f78692g.d(this.f78690e, this.f78691f, true, null, null, arrayList));
            } else {
                F60 f60 = this.f78693h;
                L90 l90 = this.f78692g;
                C8608l60 c8608l60 = this.f78690e;
                Z50 z50 = this.f78691f;
                f60.a(l90.c(c8608l60, z50, z50.f72045m));
                if (((Boolean) Mc.A.c().a(C8659lf.f76016J3)).booleanValue() && (c10007yB = this.f78698m) != null) {
                    List listH = L90.h(L90.g(c10007yB.b().f72045m, c10007yB.a().g()), this.f78698m.a().a());
                    F60 f602 = this.f78693h;
                    L90 l902 = this.f78692g;
                    C10007yB c10007yB2 = this.f78698m;
                    f602.a(l902.c(c10007yB2.c(), c10007yB2.b(), listH));
                }
                F60 f603 = this.f78693h;
                L90 l903 = this.f78692g;
                C8608l60 c8608l602 = this.f78690e;
                Z50 z502 = this.f78691f;
                f603.a(l903.c(c8608l602, z502, z502.f72031f));
            }
            this.f78699n = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List b0() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76429mb)).booleanValue()) {
            Lc.v.t();
            if (Pc.D0.c(this.f78686a)) {
                Lc.v.t();
                Integer numY = Pc.D0.Y(this.f78686a);
                if (numY != null) {
                    int iMin = Math.min(numY.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.f78691f.f72027d.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.f78691f.f72027d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0() {
        String strZzh;
        int i10;
        List list = this.f78691f.f72027d;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f75946E3)).booleanValue()) {
            strZzh = this.f78694i.c().zzh(this.f78686a, (View) this.f78696k.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) Mc.A.c().a(C8659lf.f75901B0)).booleanValue() && this.f78690e.f75749b.f75337b.f73109h) || !((Boolean) C8661lg.f76621h.e()).booleanValue()) {
            this.f78693h.a(this.f78692g.d(this.f78690e, this.f78691f, false, strZzh, null, b0()));
            return;
        }
        if (((Boolean) C8661lg.f76620g.e()).booleanValue() && ((i10 = this.f78691f.f72023b) == 1 || i10 == 2 || i10 == 5)) {
        }
        Mj0.r((Cj0) Mj0.o(Cj0.D(Mj0.h(null)), ((Long) Mc.A.c().a(C8659lf.f76307e1)).longValue(), TimeUnit.MILLISECONDS, this.f78689d), new C9443sx(this, strZzh), this.f78687b);
    }

    private final void k0(final int i10, final int i11) {
        View view;
        if (i10 <= 0 || !((view = (View) this.f78696k.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            g0();
        } else {
            this.f78689d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.px
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77663a.N(i10, i11);
                }
            }, i11, TimeUnit.MILLISECONDS);
        }
    }

    final /* synthetic */ void N(final int i10, final int i11) {
        this.f78687b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.qx
            @Override // java.lang.Runnable
            public final void run() {
                this.f77870a.Z(i10, i11);
            }
        });
    }

    final /* synthetic */ void Z(int i10, int i11) {
        k0(i10 - 1, i11);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9154qC
    public final void j(Mc.W0 w02) {
        if (((Boolean) Mc.A.c().a(C8659lf.f75930D1)).booleanValue()) {
            this.f78693h.a(this.f78692g.c(this.f78690e, this.f78691f, L90.f(2, w02.f19159a, this.f78691f.f72049o)));
        }
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void p(InterfaceC6838Io interfaceC6838Io, String str, String str2) {
        F60 f60 = this.f78693h;
        L90 l90 = this.f78692g;
        Z50 z50 = this.f78691f;
        f60.a(l90.e(z50, z50.f72035h, interfaceC6838Io));
    }

    @Override // Mc.InterfaceC4098a
    public final void v() {
        if (!(((Boolean) Mc.A.c().a(C8659lf.f75901B0)).booleanValue() && this.f78690e.f75749b.f75337b.f73109h) && ((Boolean) C8661lg.f76617d.e()).booleanValue()) {
            Mj0.r((Cj0) Mj0.e(Cj0.D(this.f78695j.a()), Throwable.class, new InterfaceC9408sf0() { // from class: com.google.android.gms.internal.ads.nx
                @Override // com.google.android.gms.internal.ads.InterfaceC9408sf0
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, C6908Kq.f68180g), new C9336rx(this), this.f78687b);
            return;
        }
        F60 f60 = this.f78693h;
        L90 l90 = this.f78692g;
        C8608l60 c8608l60 = this.f78690e;
        Z50 z50 = this.f78691f;
        f60.c(l90.c(c8608l60, z50, z50.f72025c), true == Lc.v.s().a(this.f78686a) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zze() {
        F60 f60 = this.f78693h;
        L90 l90 = this.f78692g;
        C8608l60 c8608l60 = this.f78690e;
        Z50 z50 = this.f78691f;
        f60.a(l90.c(c8608l60, z50, z50.f72037i));
    }

    @Override // com.google.android.gms.internal.ads.ZB
    public final void zzf() {
        F60 f60 = this.f78693h;
        L90 l90 = this.f78692g;
        C8608l60 c8608l60 = this.f78690e;
        Z50 z50 = this.f78691f;
        f60.a(l90.c(c8608l60, z50, z50.f72033g));
    }

    final /* synthetic */ void zzn() {
        this.f78687b.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ox
            @Override // java.lang.Runnable
            public final void run() {
                this.f77449a.g0();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9581uC
    public final void zzr() {
        if (this.f78700o.compareAndSet(false, true)) {
            int iIntValue = ((Integer) Mc.A.c().a(C8659lf.f76072N3)).intValue();
            if (iIntValue > 0) {
                k0(iIntValue, ((Integer) Mc.A.c().a(C8659lf.f76086O3)).intValue());
                return;
            }
            if (((Boolean) Mc.A.c().a(C8659lf.f76058M3)).booleanValue()) {
                this.f78688c.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f76942a.zzn();
                    }
                });
            } else {
                g0();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.YF
    public final void zzt() {
        F60 f60 = this.f78693h;
        L90 l90 = this.f78692g;
        C8608l60 c8608l60 = this.f78690e;
        Z50 z50 = this.f78691f;
        f60.a(l90.c(c8608l60, z50, z50.f72062u0));
    }

    C9550tx(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, C8608l60 c8608l60, Z50 z50, L90 l90, F60 f60, View view, InterfaceC9008ot interfaceC9008ot, M9 m92, C7165Sf c7165Sf, C7233Uf c7233Uf, W80 w80, C10007yB c10007yB) {
        this.f78686a = context;
        this.f78687b = executor;
        this.f78688c = executor2;
        this.f78689d = scheduledExecutorService;
        this.f78690e = c8608l60;
        this.f78691f = z50;
        this.f78692g = l90;
        this.f78693h = f60;
        this.f78694i = m92;
        this.f78696k = new WeakReference(view);
        this.f78697l = new WeakReference(interfaceC9008ot);
        this.f78695j = c7165Sf;
        this.f78698m = c10007yB;
    }
}
