package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class OG0 {

    /* renamed from: a, reason: collision with root package name */
    public final C9867vm f69897a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f69898b;

    public OG0(C9867vm c9867vm, int[] iArr, int i10) {
        if (iArr.length == 0) {
            C10042xL.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f69897a = c9867vm;
        this.f69898b = iArr;
    }
}
