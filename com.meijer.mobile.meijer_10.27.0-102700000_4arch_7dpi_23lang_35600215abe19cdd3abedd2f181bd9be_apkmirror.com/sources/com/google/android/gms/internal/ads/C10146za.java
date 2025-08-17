package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.za, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10146za extends AbstractCallableC7691cb {
    public C10146za(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", c8611l8, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f73204d.Z(3);
        try {
            boolean zBooleanValue = ((Boolean) this.f73205e.invoke(null, this.f73201a.b())).booleanValue();
            C8611l8 c8611l8 = this.f73204d;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            c8611l8.Z(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
