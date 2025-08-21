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
    static final ImageView.ScaleType f72363k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    private final Rc.r0 f72364a;

    /* renamed from: b, reason: collision with root package name */
    private final C9695u60 f72365b;

    /* renamed from: c, reason: collision with root package name */
    private final CI f72366c;

    /* renamed from: d, reason: collision with root package name */
    private final C10039xI f72367d;

    /* renamed from: e, reason: collision with root package name */
    private final C8864mJ f72368e;

    /* renamed from: f, reason: collision with root package name */
    private final C9826vJ f72369f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f72370g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f72371h;

    /* renamed from: i, reason: collision with root package name */
    private final C7088Mg f72372i;

    /* renamed from: j, reason: collision with root package name */
    private final C9718uI f72373j;

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
        View viewS = z10 ? this.f72367d.S() : this.f72367d.T();
        if (viewS == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewS.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewS.getParent()).removeView(viewS);
        }
        viewGroup.addView(viewS, ((Boolean) Oc.A.c().a(C8784lf.f77024V3)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    final /* synthetic */ void a(ViewGroup viewGroup) {
        C10039xI c10039xI = this.f72367d;
        if (c10039xI.S() != null) {
            boolean z10 = viewGroup != null;
            if (c10039xI.P() == 2 || c10039xI.P() == 1) {
                this.f72364a.t(this.f72365b.f79580f, String.valueOf(c10039xI.P()), z10);
            } else if (c10039xI.P() == 6) {
                this.f72364a.t(this.f72365b.f79580f, "2", z10);
                this.f72364a.t(this.f72365b.f79580f, "1", z10);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ void b(com.google.android.gms.internal.ads.InterfaceViewOnClickListenerC10040xJ r10) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.YI.b(com.google.android.gms.internal.ads.xJ):void");
    }

    public final void c(InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ) {
        if (interfaceViewOnClickListenerC10040xJ == null || this.f72368e == null || interfaceViewOnClickListenerC10040xJ.zzh() == null || !this.f72366c.g()) {
            return;
        }
        try {
            interfaceViewOnClickListenerC10040xJ.zzh().addView(this.f72368e.a());
        } catch (zzcfj e10) {
            Rc.p0.l("web view can not be obtained", e10);
        }
    }

    public final void d(InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ) {
        if (interfaceViewOnClickListenerC10040xJ == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC10040xJ.zzf().getContext();
        if (Rc.X.h(context, this.f72366c.f66595a)) {
            if (!(context instanceof Activity)) {
                Sc.p.b("Activity context is needed for policy validator.");
                return;
            }
            if (this.f72369f == null || interfaceViewOnClickListenerC10040xJ.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.f72369f.a(interfaceViewOnClickListenerC10040xJ.zzh(), windowManager), Rc.X.b());
            } catch (zzcfj e10) {
                Rc.p0.l("web view can not be obtained", e10);
            }
        }
    }

    public final void e(final InterfaceViewOnClickListenerC10040xJ interfaceViewOnClickListenerC10040xJ) {
        this.f72370g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.WI
            @Override // java.lang.Runnable
            public final void run() {
                this.f71892a.b(interfaceViewOnClickListenerC10040xJ);
            }
        });
    }

    public YI(Rc.r0 r0Var, C9695u60 c9695u60, CI ci2, C10039xI c10039xI, C8864mJ c8864mJ, C9826vJ c9826vJ, Executor executor, Executor executor2, C9718uI c9718uI) {
        this.f72364a = r0Var;
        this.f72365b = c9695u60;
        this.f72372i = c9695u60.f79583i;
        this.f72366c = ci2;
        this.f72367d = c10039xI;
        this.f72368e = c8864mJ;
        this.f72369f = c9826vJ;
        this.f72370g = executor;
        this.f72371h = executor2;
        this.f72373j = c9718uI;
    }
}
