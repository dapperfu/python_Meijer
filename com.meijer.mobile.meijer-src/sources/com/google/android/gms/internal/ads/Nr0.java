package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class Nr0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f69794a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map f69795b;

    public final synchronized Map a() {
        try {
            if (this.f69795b == null) {
                this.f69795b = Collections.unmodifiableMap(new HashMap(this.f69794a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f69795b;
    }
}
