package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ho0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8252ho0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f74786a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final Map f74787b = new HashMap();

    public final C8252ho0 a(Enum r22, Object obj) {
        this.f74786a.put(r22, obj);
        this.f74787b.put(obj, r22);
        return this;
    }

    public final C8464jo0 b() {
        return new C8464jo0(Collections.unmodifiableMap(this.f74786a), Collections.unmodifiableMap(this.f74787b), null);
    }

    /* synthetic */ C8252ho0(C8358io0 c8358io0) {
    }
}
