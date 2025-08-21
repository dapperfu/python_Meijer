package com.google.android.gms.internal.ads;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.za, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10271za extends AbstractCallableC7816cb {
    public C10271za(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "IuqhWQe4tlbVfr7yvxlVNsd5e/l7lVHvlqpkvK+6tt5EoeON2tkyyhuv1x7KBAeM", "CXimWsgId9Q4NJ7Th/z0oZbD0fgxUqQs1m5HYkmnDaE=", c8736l8, i10, 49);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f74044d.Z(3);
        try {
            boolean zBooleanValue = ((Boolean) this.f74045e.invoke(null, this.f74041a.b())).booleanValue();
            C8736l8 c8736l8 = this.f74044d;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            c8736l8.Z(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
