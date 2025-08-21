package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8348ha extends AbstractC7565a9 {

    /* renamed from: b, reason: collision with root package name */
    public Long f75585b;

    /* renamed from: c, reason: collision with root package name */
    public Long f75586c;

    @Override // com.google.android.gms.internal.ads.AbstractC7565a9
    protected final HashMap b() {
        HashMap map = new HashMap();
        map.put(0, this.f75585b);
        map.put(1, this.f75586c);
        return map;
    }

    public C8348ha(String str) {
        HashMap mapA = AbstractC7565a9.a(str);
        if (mapA != null) {
            this.f75585b = (Long) mapA.get(0);
            this.f75586c = (Long) mapA.get(1);
        }
    }
}
