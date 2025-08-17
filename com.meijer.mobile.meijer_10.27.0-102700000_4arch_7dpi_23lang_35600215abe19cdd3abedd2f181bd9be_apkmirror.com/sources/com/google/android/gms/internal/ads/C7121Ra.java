package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ra, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7121Ra extends AbstractCallableC7691cb {
    public C7121Ra(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "VbyGv7sES/oWGQr2qJ1ojtDXkdOVtq/qZqCmKZiE07d+0W3i1KsQhhRGQ9Xgn5dY", "qVy1S3GZ9+f6FFC31TUnbavXTKbKjAeTCoTlnIfZI+M=", c8611l8, i10, 73);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.f73205e.invoke(null, this.f73201a.b())).booleanValue();
            C8611l8 c8611l8 = this.f73204d;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            c8611l8.f0(i10);
        } catch (InvocationTargetException unused) {
            this.f73204d.f0(3);
        }
    }
}
