package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
final class K2 implements com.google.android.gms.internal.measurement.Y5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85925a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ P2 f85926b;

    K2(P2 p22, String str) {
        this.f85925a = str;
        Objects.requireNonNull(p22);
        this.f85926b = p22;
    }

    @Override // com.google.android.gms.internal.measurement.Y5
    public final String zza(String str) {
        Map map = (Map) this.f85926b.n().get(this.f85925a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
