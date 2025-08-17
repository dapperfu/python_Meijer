package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7189Ta extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final boolean f70406h;

    public C7189Ta(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "dX06Fls5idqgQp2Q0AyXumriu5IrYF5E5esfObgzR5ftEXiNsSl4lbLxJh6DOYsi", "dGJd9fIaxgnbA6Dc4nB6tFRdL3cXJ8ToAbabnjV7KZM=", c8611l8, i10, 61);
        this.f70406h = c8863na.s();
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.f73205e.invoke(null, this.f73201a.b(), Boolean.valueOf(this.f70406h))).longValue();
        synchronized (this.f73204d) {
            this.f73204d.y(jLongValue);
        }
    }
}
