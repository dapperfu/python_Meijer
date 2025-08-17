package com.google.android.gms.internal.pal;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.k4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10757k4 extends L4 {
    public C10757k4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "6vt+8E5GP5AwoxquDM0Y7lVJzS23/VCjNo5D8xB8rgAaaF6IhToGZhlIAUkgigHl", "jx9F7EAIAhvEI8G+/hWsHBitt0z+K8moFRn7/w45eYc=", ya2, i10, 49);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f82743e.U(3);
        try {
            boolean zBooleanValue = ((Boolean) this.f82744f.invoke(null, this.f82740b.b())).booleanValue();
            Ya ya2 = this.f82743e;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            ya2.U(i10);
        } catch (InvocationTargetException e10) {
            if (!(e10.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e10;
            }
        }
    }
}
