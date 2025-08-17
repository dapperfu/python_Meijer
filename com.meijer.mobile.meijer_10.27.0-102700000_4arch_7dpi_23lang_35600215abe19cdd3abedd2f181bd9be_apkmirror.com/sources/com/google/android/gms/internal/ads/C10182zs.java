package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10182zs {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f80505a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f80506b;

    final long a() throws NumberFormatException {
        Iterator it = this.f80505a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((C8785mo0) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f80506b = Math.max(this.f80506b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f80506b;
    }

    final void b(C8785mo0 c8785mo0) {
        this.f80505a.add(c8785mo0);
    }

    C10182zs() {
    }
}
