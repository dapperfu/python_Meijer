package com.google.android.gms.internal.pal;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class G3 extends M2 {

    /* renamed from: b, reason: collision with root package name */
    public long f83460b;

    /* renamed from: c, reason: collision with root package name */
    public long f83461c;

    @Override // com.google.android.gms.internal.pal.M2
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f83460b));
        map.put(1, Long.valueOf(this.f83461c));
        return map;
    }

    public G3(String str) {
        this.f83460b = -1L;
        this.f83461c = -1L;
        HashMap mapA = M2.a(str);
        if (mapA != null) {
            this.f83460b = ((Long) mapA.get(0)).longValue();
            this.f83461c = ((Long) mapA.get(1)).longValue();
        }
    }
}
