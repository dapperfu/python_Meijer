package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.z4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11121z4 extends L4 {
    public C11121z4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "WepZYnT/MXyJE28LKN26NT6D3mAA2J2spDFApE1ixrQxTNXRg7wshW7BC/EU90LT", "sjYkfzJTuYKxh1jvZaP9n5dx9JGmzJotOUC/vdvgi4M=", ya2, i10, 73);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.f83584f.invoke(null, this.f83580b.b())).booleanValue();
            Ya ya2 = this.f83583e;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            ya2.Y(i10);
        } catch (InvocationTargetException unused) {
            this.f83583e.Y(3);
        }
    }
}
