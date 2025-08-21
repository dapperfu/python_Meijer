package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.Qi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7228Qi implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f70466a;

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("persistentData") || TextUtils.isEmpty((CharSequence) map.get("persistentData"))) {
            return;
        }
        this.f70466a.k((String) map.get("persistentData"));
    }

    public C7228Qi(ZO zo2) {
        com.google.android.gms.common.internal.r.m(zo2, "The Inspector Manager must not be null");
        this.f70466a = zo2;
    }
}
