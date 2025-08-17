package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class OG0 {

    /* renamed from: a, reason: collision with root package name */
    public final C9742vm f69057a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f69058b;

    public OG0(C9742vm c9742vm, int[] iArr, int i10) {
        if (iArr.length == 0) {
            C9917xL.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f69057a = c9742vm;
        this.f69058b = iArr;
    }
}
