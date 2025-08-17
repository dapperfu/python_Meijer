package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.lG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8627lG {

    /* renamed from: a, reason: collision with root package name */
    private final List f75770a;

    /* renamed from: b, reason: collision with root package name */
    private final R90 f75771b;

    /* renamed from: c, reason: collision with root package name */
    private final Qc.v f75772c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f75773d;

    public C8627lG(Z50 z50, R90 r90) {
        this.f75770a = z50.f72051p;
        this.f75771b = r90;
        this.f75772c = z50.f72068x0;
    }

    public final void a() {
        if (this.f75773d) {
            return;
        }
        this.f75771b.e(this.f75770a, this.f75772c);
        this.f75773d = true;
    }
}
