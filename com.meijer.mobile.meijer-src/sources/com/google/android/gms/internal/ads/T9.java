package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class T9 extends AbstractC7565a9 {

    /* renamed from: b, reason: collision with root package name */
    public long f71149b;

    /* renamed from: c, reason: collision with root package name */
    public long f71150c;

    @Override // com.google.android.gms.internal.ads.AbstractC7565a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f71149b));
        map.put(1, Long.valueOf(this.f71150c));
        return map;
    }

    public T9(String str) {
        this.f71149b = -1L;
        this.f71150c = -1L;
        HashMap mapA = AbstractC7565a9.a(str);
        if (mapA != null) {
            this.f71149b = ((Long) mapA.get(0)).longValue();
            this.f71150c = ((Long) mapA.get(1)).longValue();
        }
    }
}
