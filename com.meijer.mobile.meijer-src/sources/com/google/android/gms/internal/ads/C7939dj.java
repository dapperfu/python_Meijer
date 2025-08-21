package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7939dj implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final BinderC10046xP f74302a;

    public C7939dj(BinderC10046xP binderC10046xP) {
        this.f74302a = binderC10046xP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        if (((Boolean) Oc.A.c().a(C8784lf.f77267m9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.f74302a.G9(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f74302a.H9(str2, str3);
            }
        }
    }
}
