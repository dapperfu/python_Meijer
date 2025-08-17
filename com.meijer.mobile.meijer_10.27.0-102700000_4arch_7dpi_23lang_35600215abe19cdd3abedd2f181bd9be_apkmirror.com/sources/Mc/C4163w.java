package Mc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.C7270Vh;
import com.google.android.gms.internal.ads.C7303Wh;
import com.google.android.gms.internal.ads.C9107pp;
import com.google.android.gms.internal.ads.C9210qn;
import com.google.android.gms.internal.ads.InterfaceC6631Cl;
import com.google.android.gms.internal.ads.InterfaceC7210Tn;
import com.google.android.gms.internal.ads.InterfaceC7703ch;
import com.google.android.gms.internal.ads.InterfaceC7719cp;
import com.google.android.gms.internal.ads.InterfaceC8361iq;
import com.google.android.gms.internal.ads.InterfaceC8675ln;
import com.google.android.gms.internal.ads.InterfaceC9530tn;

/* renamed from: Mc.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4163w {

    /* renamed from: a, reason: collision with root package name */
    private final W1 f19352a;

    /* renamed from: b, reason: collision with root package name */
    private final U1 f19353b;

    /* renamed from: c, reason: collision with root package name */
    private final C4165w1 f19354c;

    /* renamed from: d, reason: collision with root package name */
    private final C7270Vh f19355d;

    /* renamed from: e, reason: collision with root package name */
    private final C9210qn f19356e;

    /* renamed from: f, reason: collision with root package name */
    private final C7303Wh f19357f;

    /* renamed from: g, reason: collision with root package name */
    private InterfaceC7210Tn f19358g;

    /* renamed from: h, reason: collision with root package name */
    private final X1 f19359h;

    static /* bridge */ /* synthetic */ void q(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C4169y.b().p(context, C4169y.c().f29929a, "gmob-apps", bundle, true);
    }

    public final Q c(Context context, String str, InterfaceC6631Cl interfaceC6631Cl) {
        return (Q) new C4146q(this, context, str, interfaceC6631Cl).d(context, false);
    }

    public final V d(Context context, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl) {
        return (V) new C4134m(this, context, d2Var, str, interfaceC6631Cl).d(context, false);
    }

    public final V e(Context context, d2 d2Var, String str, InterfaceC6631Cl interfaceC6631Cl) {
        return (V) new C4140o(this, context, d2Var, str, interfaceC6631Cl).d(context, false);
    }

    public final Q0 f(Context context, InterfaceC6631Cl interfaceC6631Cl) {
        return (Q0) new C4116g(this, context, interfaceC6631Cl).d(context, false);
    }

    public final InterfaceC7703ch h(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (InterfaceC7703ch) new C4157u(this, frameLayout, frameLayout2, context).d(context, false);
    }

    public final InterfaceC8675ln j(Context context, InterfaceC6631Cl interfaceC6631Cl) {
        return (InterfaceC8675ln) new C4128k(this, context, interfaceC6631Cl).d(context, false);
    }

    public final InterfaceC9530tn l(Activity activity) {
        C4110e c4110e = new C4110e(this, activity);
        Intent intent = activity.getIntent();
        boolean booleanExtra = false;
        if (intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            booleanExtra = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        } else {
            Qc.p.d("useClientJar flag not found in activity intent extras.");
        }
        return (InterfaceC9530tn) c4110e.d(activity, booleanExtra);
    }

    public final InterfaceC7719cp n(Context context, String str, InterfaceC6631Cl interfaceC6631Cl) {
        return (InterfaceC7719cp) new C4104c(this, context, str, interfaceC6631Cl).d(context, false);
    }

    public final InterfaceC8361iq o(Context context, InterfaceC6631Cl interfaceC6631Cl) {
        return (InterfaceC8361iq) new C4122i(this, context, interfaceC6631Cl).d(context, false);
    }

    public C4163w(W1 w12, U1 u12, C4165w1 c4165w1, C7270Vh c7270Vh, C9107pp c9107pp, C9210qn c9210qn, C7303Wh c7303Wh, X1 x12) {
        this.f19352a = w12;
        this.f19353b = u12;
        this.f19354c = c4165w1;
        this.f19355d = c7270Vh;
        this.f19356e = c9210qn;
        this.f19357f = c7303Wh;
        this.f19359h = x12;
    }
}
