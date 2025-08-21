package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Uw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7377Uw implements InterfaceC9994ww {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f71574a;

    C7377Uw(ZO zo2) {
        this.f71574a = zo2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9994ww
    public final void a(Map map) throws JSONException {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f71574a.p(str.equals("true"));
    }
}
