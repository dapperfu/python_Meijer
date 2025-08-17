package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Uw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7252Uw implements InterfaceC9869ww {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f70734a;

    C7252Uw(ZO zo2) {
        this.f70734a = zo2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9869ww
    public final void a(Map map) throws JSONException {
        String str = (String) map.get("test_mode_enabled");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f70734a.p(str.equals("true"));
    }
}
