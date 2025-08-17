package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7103Qi implements InterfaceC7069Pi {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f69626a;

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.f69626a.k((String) map.get("persistentData"));
    }

    public C7103Qi(ZO zo2) {
        com.google.android.gms.common.internal.r.m(zo2, "The Inspector Manager must not be null");
        this.f69626a = zo2;
    }
}
