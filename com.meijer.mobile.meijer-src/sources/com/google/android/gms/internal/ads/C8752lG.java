package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8752lG {

    /* renamed from: a, reason: collision with root package name */
    private final List f76610a;

    /* renamed from: b, reason: collision with root package name */
    private final R90 f76611b;

    /* renamed from: c, reason: collision with root package name */
    private final Sc.v f76612c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f76613d;

    public C8752lG(Z50 z50, R90 r90) {
        this.f76610a = z50.f72891p;
        this.f76611b = r90;
        this.f76612c = z50.f72908x0;
    }

    public final void a() {
        if (this.f76613d) {
            return;
        }
        this.f76611b.e(this.f76610a, this.f76612c);
        this.f76613d = true;
    }
}
