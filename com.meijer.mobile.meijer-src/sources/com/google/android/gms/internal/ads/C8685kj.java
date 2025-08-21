package com.google.android.gms.internal.ads;

import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.kj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8685kj implements InterfaceC7194Pi {

    /* renamed from: a, reason: collision with root package name */
    private final ZO f76540a;

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final void a(Object obj, Map map) throws NumberFormatException {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j10 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j10 = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.f76540a.j((String) map.get("extras"), j10);
    }

    public C8685kj(ZO zo2) {
        com.google.android.gms.common.internal.r.m(zo2, "The Inspector Manager must not be null");
        this.f76540a = zo2;
    }
}
