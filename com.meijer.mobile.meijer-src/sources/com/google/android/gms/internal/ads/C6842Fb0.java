package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Fb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6842Fb0 {

    /* renamed from: a, reason: collision with root package name */
    private final C8137fb0 f67672a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f67673b;

    public final C8137fb0 a() {
        return this.f67672a;
    }

    public final ArrayList b() {
        return this.f67673b;
    }

    public final void c(String str) {
        this.f67673b.add(str);
    }

    public C6842Fb0(C8137fb0 c8137fb0, String str) {
        ArrayList arrayList = new ArrayList();
        this.f67673b = arrayList;
        this.f67672a = c8137fb0;
        arrayList.add(str);
    }
}
