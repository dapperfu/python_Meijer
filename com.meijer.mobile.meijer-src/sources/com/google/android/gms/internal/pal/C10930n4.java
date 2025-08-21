package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.n4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10930n4 extends L4 {
    public C10930n4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "C6OPKdOx6rUdfDdOmaUimt8yM1FrOv7bKCITdJ0Uo74WwXDfvXouJ4oz4kHBjTSk", "dTWRHHPyYq/fNXOTAS/wjayGzv2SlrSwyDcB+vX+h5Q=", ya2, i10, 5);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f83583e.m0(-1L);
        this.f83583e.l0(-1L);
        int[] iArr = (int[]) this.f83584f.invoke(null, this.f83580b.b());
        synchronized (this.f83583e) {
            try {
                this.f83583e.m0(iArr[0]);
                this.f83583e.l0(iArr[1]);
                int i10 = iArr[2];
                if (i10 != Integer.MIN_VALUE) {
                    this.f83583e.k0(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
