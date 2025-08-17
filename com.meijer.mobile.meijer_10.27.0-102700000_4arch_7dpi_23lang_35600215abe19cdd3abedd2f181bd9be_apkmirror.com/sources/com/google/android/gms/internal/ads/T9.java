package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class T9 extends AbstractC7440a9 {

    /* renamed from: b, reason: collision with root package name */
    public long f70309b;

    /* renamed from: c, reason: collision with root package name */
    public long f70310c;

    @Override // com.google.android.gms.internal.ads.AbstractC7440a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, Long.valueOf(this.f70309b));
        map.put(1, Long.valueOf(this.f70310c));
        return map;
    }

    public T9(String str) {
        this.f70309b = -1L;
        this.f70310c = -1L;
        HashMap mapA = AbstractC7440a9.a(str);
        if (mapA != null) {
            this.f70309b = ((Long) mapA.get(0)).longValue();
            this.f70310c = ((Long) mapA.get(1)).longValue();
        }
    }
}
