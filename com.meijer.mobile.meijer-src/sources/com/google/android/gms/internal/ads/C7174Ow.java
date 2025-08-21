package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Ow, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7174Ow implements InterfaceC9994ww {

    /* renamed from: a, reason: collision with root package name */
    private final Y50 f70043a;

    public C7174Ow(Y50 y50) {
        this.f70043a = y50;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9994ww
    public final void a(Map map) {
        String str = (String) map.get("render_in_browser");
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            this.f70043a.b(Boolean.parseBoolean(str));
        } catch (Exception e10) {
            throw new IllegalStateException("Invalid render_in_browser state", e10);
        }
    }
}
