package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
final class PH implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f70142a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f70143b;

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        SH sh2 = (SH) this.f70142a.get();
        if (sh2 == null) {
            return;
        }
        sh2.f70914g.zza();
        if (((Boolean) Oc.A.c().a(C8784lf.f76893Lc)).booleanValue()) {
            sh2.f70907D.a((View) this.f70143b.get(), sh2.f70917j);
        }
    }

    /* synthetic */ PH(SH sh2, View view, RH rh2) {
        this.f70142a = new WeakReference(sh2);
        if (((Boolean) Oc.A.c().a(C8784lf.f76893Lc)).booleanValue()) {
            this.f70143b = new WeakReference(view);
        } else {
            this.f70143b = new WeakReference(null);
        }
    }
}
