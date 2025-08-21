package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
final class SE0 extends NE0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f70900e = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f70901c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f70902d;

    public static SE0 r(AbstractC7432Wl abstractC7432Wl, Object obj, Object obj2) {
        return new SE0(abstractC7432Wl, obj, obj2);
    }

    public final SE0 p(AbstractC7432Wl abstractC7432Wl) {
        return new SE0(abstractC7432Wl, this.f70901c, this.f70902d);
    }

    public static SE0 q(H7 h72) {
        return new SE0(new UE0(h72), C10079xl.f80684o, f70900e);
    }

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7432Wl
    public final int a(Object obj) {
        Object obj2;
        if (f70900e.equals(obj) && (obj2 = this.f70902d) != null) {
            obj = obj2;
        }
        return this.f69686b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7432Wl
    public final C7431Wk d(int i10, C7431Wk c7431Wk, boolean z10) {
        this.f69686b.d(i10, c7431Wk, z10);
        if (Objects.equals(c7431Wk.f71989b, this.f70902d) && z10) {
            c7431Wk.f71989b = f70900e;
        }
        return c7431Wk;
    }

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7432Wl
    public final C10079xl e(int i10, C10079xl c10079xl, long j10) {
        this.f69686b.e(i10, c10079xl, j10);
        if (Objects.equals(c10079xl.f80686a, this.f70901c)) {
            c10079xl.f80686a = C10079xl.f80684o;
        }
        return c10079xl;
    }

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7432Wl
    public final Object f(int i10) {
        Object objF = this.f69686b.f(i10);
        return Objects.equals(objF, this.f70902d) ? f70900e : objF;
    }

    private SE0(AbstractC7432Wl abstractC7432Wl, Object obj, Object obj2) {
        super(abstractC7432Wl);
        this.f70901c = obj;
        this.f70902d = obj2;
    }
}
