package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
final class NH implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f69701a;

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        SH sh2 = (SH) this.f69701a.get();
        if (sh2 != null && "_ac".equals((String) map.get("eventName"))) {
            sh2.f70915h.v();
            if (((Boolean) Oc.A.c().a(C8784lf.f76807Fa)).booleanValue()) {
                sh2.f70916i.Z();
                if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                    return;
                }
                sh2.f70916i.zzu();
            }
        }
    }

    /* synthetic */ NH(SH sh2, RH rh2) {
        this.f69701a = new WeakReference(sh2);
    }
}
