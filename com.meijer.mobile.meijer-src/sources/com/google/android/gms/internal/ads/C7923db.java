package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.db, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7923db {

    /* renamed from: a, reason: collision with root package name */
    private final Map f74273a = new HashMap();

    public final AtomicReference a(String str) {
        synchronized (this) {
            try {
                if (!this.f74273a.containsKey(str)) {
                    this.f74273a.put(str, new AtomicReference());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (AtomicReference) this.f74273a.get(str);
    }
}
