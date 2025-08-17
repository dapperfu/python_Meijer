package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
final class SE0 extends NE0 {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f70060e = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final Object f70061c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f70062d;

    public static SE0 r(AbstractC7307Wl abstractC7307Wl, Object obj, Object obj2) {
        return new SE0(abstractC7307Wl, obj, obj2);
    }

    public final SE0 p(AbstractC7307Wl abstractC7307Wl) {
        return new SE0(abstractC7307Wl, this.f70061c, this.f70062d);
    }

    public static SE0 q(H7 h72) {
        return new SE0(new UE0(h72), C9954xl.f79844o, f70060e);
    }

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7307Wl
    public final int a(Object obj) {
        Object obj2;
        if (f70060e.equals(obj) && (obj2 = this.f70062d) != null) {
            obj = obj2;
        }
        return this.f68846b.a(obj);
    }

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7307Wl
    public final C7306Wk d(int i10, C7306Wk c7306Wk, boolean z10) {
        this.f68846b.d(i10, c7306Wk, z10);
        if (Objects.equals(c7306Wk.f71149b, this.f70062d) && z10) {
            c7306Wk.f71149b = f70060e;
        }
        return c7306Wk;
    }

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7307Wl
    public final C9954xl e(int i10, C9954xl c9954xl, long j10) {
        this.f68846b.e(i10, c9954xl, j10);
        if (Objects.equals(c9954xl.f79846a, this.f70061c)) {
            c9954xl.f79846a = C9954xl.f79844o;
        }
        return c9954xl;
    }

    @Override // com.google.android.gms.internal.ads.NE0, com.google.android.gms.internal.ads.AbstractC7307Wl
    public final Object f(int i10) {
        Object objF = this.f68846b.f(i10);
        return Objects.equals(objF, this.f70062d) ? f70060e : objF;
    }

    private SE0(AbstractC7307Wl abstractC7307Wl, Object obj, Object obj2) {
        super(abstractC7307Wl);
        this.f70061c = obj;
        this.f70062d = obj2;
    }
}
