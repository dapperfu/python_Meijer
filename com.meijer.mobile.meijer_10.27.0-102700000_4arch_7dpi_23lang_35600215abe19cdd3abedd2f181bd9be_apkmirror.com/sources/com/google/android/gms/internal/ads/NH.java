package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
final class NH implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f68861a;

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        SH sh2 = (SH) this.f68861a.get();
        if (sh2 != null && "_ac".equals((String) map.get("eventName"))) {
            sh2.f70075h.v();
            if (((Boolean) Mc.A.c().a(C8659lf.f75967Fa)).booleanValue()) {
                sh2.f70076i.Z();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                sh2.f70076i.zzu();
            }
        }
    }

    /* synthetic */ NH(SH sh2, RH rh2) {
        this.f68861a = new WeakReference(sh2);
    }
}
