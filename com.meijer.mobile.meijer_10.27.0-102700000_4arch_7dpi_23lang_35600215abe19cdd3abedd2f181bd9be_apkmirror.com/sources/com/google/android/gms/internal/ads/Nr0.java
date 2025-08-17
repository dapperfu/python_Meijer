package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Nr0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f68954a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map f68955b;

    public final synchronized Map a() {
        try {
            if (this.f68955b == null) {
                this.f68955b = Collections.unmodifiableMap(new HashMap(this.f68954a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f68955b;
    }
}
