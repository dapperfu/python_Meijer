package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7814dj implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final BinderC9921xP f73462a;

    public C7814dj(BinderC9921xP binderC9921xP) {
        this.f73462a = binderC9921xP;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76427m9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.f73462a.G9(str2, str4, str3);
            } else if (str.equals("show")) {
                this.f73462a.H9(str2, str3);
            }
        }
    }
}
