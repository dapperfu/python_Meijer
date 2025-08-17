package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class G3 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public long f82620b;

    /* renamed from: c, reason: collision with root package name */
    public long f82621c;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f82620b));
        map.put(1, Long.valueOf(this.f82621c));
        return map;
    }

    public G3(String str) {
        this.f82620b = -1L;
        this.f82621c = -1L;
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f82620b = ((Long) mapA.get(0)).longValue();
            this.f82621c = ((Long) mapA.get(1)).longValue();
        }
    }
}
