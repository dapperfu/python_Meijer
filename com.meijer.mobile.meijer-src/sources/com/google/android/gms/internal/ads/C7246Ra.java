package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ra, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7246Ra extends AbstractCallableC7816cb {
    public C7246Ra(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", c8736l8, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.f74045e.invoke(null, this.f74041a.b())).booleanValue();
            C8736l8 c8736l8 = this.f74044d;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            c8736l8.f0(i10);
        } catch (InvocationTargetException unused) {
            this.f74044d.f0(3);
        }
    }
}
