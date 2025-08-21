package com.google.android.gms.internal.pal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public final class M4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f83605a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                if (!this.f83605a.containsKey(str)) {
                    this.f83605a.put(str, new AtomicReference());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (AtomicReference) this.f83605a.get(str);
    }
}
