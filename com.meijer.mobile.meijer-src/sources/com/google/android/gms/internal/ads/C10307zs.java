package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.zs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10307zs {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f81345a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private long f81346b;

    final long a() throws NumberFormatException {
        Iterator it = this.f81345a.iterator();
        while (it.hasNext()) {
            for (Map.Entry entry : ((C8910mo0) it.next()).zze().entrySet()) {
                try {
                    if ("content-length".equalsIgnoreCase((String) entry.getKey())) {
                        this.f81346b = Math.max(this.f81346b, Long.parseLong((String) ((List) entry.getValue()).get(0)));
                    }
                } catch (RuntimeException unused) {
                }
            }
            it.remove();
        }
        return this.f81346b;
    }

    final void b(C8910mo0 c8910mo0) {
        this.f81345a.add(c8910mo0);
    }

    C10307zs() {
    }
}
