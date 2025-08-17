package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
final class PH implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f69302a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f69303b;

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        SH sh2 = (SH) this.f69302a.get();
        if (sh2 == null) {
            return;
        }
        sh2.f70074g.zza();
        if (((Boolean) Mc.A.c().a(C8659lf.f76053Lc)).booleanValue()) {
            sh2.f70067D.a((View) this.f69303b.get(), sh2.f70077j);
        }
    }

    /* synthetic */ PH(SH sh2, View view, RH rh2) {
        this.f69302a = new WeakReference(sh2);
        if (((Boolean) Mc.A.c().a(C8659lf.f76053Lc)).booleanValue()) {
            this.f69303b = new WeakReference(view);
        } else {
            this.f69303b = new WeakReference(null);
        }
    }
}
