package Oc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C7395Vh;
import com.google.android.gms.internal.ads.C7428Wh;
import com.google.android.gms.internal.ads.C9232pp;
import com.google.android.gms.internal.ads.C9335qn;
import com.google.android.gms.internal.ads.InterfaceC6756Cl;
import com.google.android.gms.internal.ads.InterfaceC7335Tn;
import com.google.android.gms.internal.ads.InterfaceC7828ch;
import com.google.android.gms.internal.ads.InterfaceC7844cp;
import com.google.android.gms.internal.ads.InterfaceC8486iq;
import com.google.android.gms.internal.ads.InterfaceC8800ln;
import com.google.android.gms.internal.ads.InterfaceC9655tn;

/* renamed from: Oc.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4441w {

    /* renamed from: a, reason: collision with root package name */
    private final W1 f23539a;

    /* renamed from: b, reason: collision with root package name */
    private final U1 f23540b;

    /* renamed from: c, reason: collision with root package name */
    private final C4443w1 f23541c;

    /* renamed from: d, reason: collision with root package name */
    private final C7395Vh f23542d;

    /* renamed from: e, reason: collision with root package name */
    private final C9335qn f23543e;

    /* renamed from: f, reason: collision with root package name */
    private final C7428Wh f23544f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC7335Tn f23545g;

    /* renamed from: h, reason: collision with root package name */
    private final X1 f23546h;

    static /* bridge */ /* synthetic */ void q(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C4447y.b().p(context, C4447y.c().f34479a, "gmob-apps", bundle, true);
    }

    public final Q c(Context context, String str, InterfaceC6756Cl interfaceC6756Cl) {
        return (Q) new C4424q(this, context, str, interfaceC6756Cl).d(context, false);
    }

    public final V d(Context context, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl) {
        return (V) new C4412m(this, context, d2Var, str, interfaceC6756Cl).d(context, false);
    }

    public final V e(Context context, d2 d2Var, String str, InterfaceC6756Cl interfaceC6756Cl) {
        return (V) new C4418o(this, context, d2Var, str, interfaceC6756Cl).d(context, false);
    }

    public final Q0 f(Context context, InterfaceC6756Cl interfaceC6756Cl) {
        return (Q0) new C4394g(this, context, interfaceC6756Cl).d(context, false);
    }

    public final InterfaceC7828ch h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (InterfaceC7828ch) new C4435u(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final InterfaceC8800ln j(Context context, InterfaceC6756Cl interfaceC6756Cl) {
        return (InterfaceC8800ln) new C4406k(this, context, interfaceC6756Cl).d(context, false);
    }

    public final InterfaceC9655tn l(Activity activity) {
        C4388e c4388e = new C4388e(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            Sc.p.d("useClientJar flag not found in activity intent extras.");
        }
        return (InterfaceC9655tn) c4388e.d(activity, booleanExtra);
    }

    public final InterfaceC7844cp n(Context context, String str, InterfaceC6756Cl interfaceC6756Cl) {
        return (InterfaceC7844cp) new C4382c(this, context, str, interfaceC6756Cl).d(context, false);
    }

    public final InterfaceC8486iq o(Context context, InterfaceC6756Cl interfaceC6756Cl) {
        return (InterfaceC8486iq) new C4400i(this, context, interfaceC6756Cl).d(context, false);
    }

    public C4441w(W1 w12, U1 u12, C4443w1 c4443w1, C7395Vh c7395Vh, C9232pp c9232pp, C9335qn c9335qn, C7428Wh c7428Wh, X1 x12) {
        this.f23539a = w12;
        this.f23540b = u12;
        this.f23541c = c4443w1;
        this.f23542d = c7395Vh;
        this.f23543e = c9335qn;
        this.f23544f = c7428Wh;
        this.f23546h = x12;
    }
}
