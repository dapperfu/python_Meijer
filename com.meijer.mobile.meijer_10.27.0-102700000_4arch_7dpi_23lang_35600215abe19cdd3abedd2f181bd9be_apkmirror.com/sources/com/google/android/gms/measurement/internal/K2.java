package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
final class K2 implements com.google.android.gms.internal.measurement.Y5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P2 f85086b;

    K2(P2 p22, String str) {
        this.f85085a = str;
        Objects.requireNonNull(p22);
        this.f85086b = p22;
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final String zza(String str) {
        Map map = (Map) this.f85086b.n().get(this.f85085a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
