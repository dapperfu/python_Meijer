package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.ho0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8377ho0 {

    /* renamed from: a, reason: collision with root package name */
    final Map f75626a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    final Map f75627b = new HashMap();

    public final C8377ho0 a(Enum r22, Object obj) {
        this.f75626a.put(r22, obj);
        this.f75627b.put(obj, r22);
        return this;
    }

    public final C8589jo0 b() {
        return new C8589jo0(Collections.unmodifiableMap(this.f75626a), Collections.unmodifiableMap(this.f75627b), null);
    }

    /* synthetic */ C8377ho0(C8483io0 c8483io0) {
    }
}
