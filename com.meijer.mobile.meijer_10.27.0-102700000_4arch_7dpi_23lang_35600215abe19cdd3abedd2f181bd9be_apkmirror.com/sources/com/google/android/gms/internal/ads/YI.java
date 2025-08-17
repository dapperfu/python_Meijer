package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class YI {

    /* renamed from: k, reason: collision with root package name */
    static final ImageView.ScaleType f71523k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    private final Pc.r0 f71524a;

    /* renamed from: b, reason: collision with root package name */
    private final C9570u60 f71525b;

    /* renamed from: c, reason: collision with root package name */
    private final CI f71526c;

    /* renamed from: d, reason: collision with root package name */
    private final C9914xI f71527d;

    /* renamed from: e, reason: collision with root package name */
    private final C8739mJ f71528e;

    /* renamed from: f, reason: collision with root package name */
    private final C9701vJ f71529f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f71530g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f71531h;

    /* renamed from: i, reason: collision with root package name */
    private final C6963Mg f71532i;

    /* renamed from: j, reason: collision with root package name */
    private final C9593uI f71533j;

    public final boolean f(ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    public final boolean g(ViewGroup viewGroup) {
        return i(viewGroup, true);
    }

    private static void h(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i10 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i10 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean i(ViewGroup viewGroup, boolean z10) {
        View viewS = z10 ? this.f71527d.S() : this.f71527d.T();
        if (viewS == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewS.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewS.getParent()).removeView(viewS);
        }
        viewGroup.addView(viewS, ((Boolean) Mc.A.c().a(C8659lf.f76184V3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(ViewGroup viewGroup) {
        C9914xI c9914xI = this.f71527d;
        if (c9914xI.S() != null) {
            boolean z10 = viewGroup != null;
            if (c9914xI.P() == 2 || c9914xI.P() == 1) {
                this.f71524a.t(this.f71525b.f78740f, String.valueOf(c9914xI.P()), z10);
            } else if (c9914xI.P() == 6) {
                this.f71524a.t(this.f71525b.f78740f, "2", z10);
                this.f71524a.t(this.f71525b.f78740f, "1", z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC9915xJ r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.YI.b(com.google.android.gms.internal.ads.xJ):void");
    }

    public final void c(InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ) {
        if (interfaceViewOnClickListenerC9915xJ == null || this.f71528e == null || interfaceViewOnClickListenerC9915xJ.zzh() == null || !this.f71526c.g()) {
            return;
        }
        try {
            interfaceViewOnClickListenerC9915xJ.zzh().addView(this.f71528e.a());
        } catch (zzcfj e10) {
            Pc.p0.l("web view can not be obtained", e10);
        }
    }

    public final void d(InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ) {
        if (interfaceViewOnClickListenerC9915xJ == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC9915xJ.zzf().getContext();
        if (Pc.X.h(context, this.f71526c.f65755a)) {
            if (!(context instanceof Activity)) {
                Qc.p.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f71529f == null || interfaceViewOnClickListenerC9915xJ.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f71529f.a(interfaceViewOnClickListenerC9915xJ.zzh(), windowManager), Pc.X.b());
            } catch (zzcfj e10) {
                Pc.p0.l("web view can not be obtained", e10);
            }
        }
    }

    public final void e(final InterfaceViewOnClickListenerC9915xJ interfaceViewOnClickListenerC9915xJ) {
        this.f71530g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.WI
            @Override // java.lang.Runnable
            public final void run() {
                this.f71052a.b(interfaceViewOnClickListenerC9915xJ);
            }
        });
    }

    public YI(Pc.r0 r0Var, C9570u60 c9570u60, CI ci2, C9914xI c9914xI, C8739mJ c8739mJ, C9701vJ c9701vJ, Executor executor, Executor executor2, C9593uI c9593uI) {
        this.f71524a = r0Var;
        this.f71525b = c9570u60;
        this.f71532i = c9570u60.f78743i;
        this.f71526c = ci2;
        this.f71527d = c9914xI;
        this.f71528e = c8739mJ;
        this.f71529f = c9701vJ;
        this.f71530g = executor;
        this.f71531h = executor2;
        this.f71533j = c9593uI;
    }
}
