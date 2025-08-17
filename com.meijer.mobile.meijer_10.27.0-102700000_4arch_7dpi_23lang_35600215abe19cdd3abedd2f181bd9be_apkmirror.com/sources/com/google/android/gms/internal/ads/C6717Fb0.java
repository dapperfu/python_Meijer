package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Fb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6717Fb0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8012fb0 f66832a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f66833b;

    public final C8012fb0 a() {
        return this.f66832a;
    }

    public final ArrayList b() {
        return this.f66833b;
    }

    public final void c(String str) {
        this.f66833b.add(str);
    }

    public C6717Fb0(C8012fb0 c8012fb0, String str) {
        ArrayList arrayList = new ArrayList();
        this.f66833b = arrayList;
        this.f66832a = c8012fb0;
        arrayList.add(str);
    }
}
