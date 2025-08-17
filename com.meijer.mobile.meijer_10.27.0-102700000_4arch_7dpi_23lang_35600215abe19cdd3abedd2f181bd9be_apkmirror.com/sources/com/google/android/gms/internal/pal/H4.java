package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class H4 extends L4 {
    public H4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "6CWPidOWJZFxRWI8V7yi3OiMbOhIWZX/jTayTGRwqCM0W8dtKHQOPe60TuQicfhG", "gYPijpNio6OwLgbzbH6IuWSNtvp7bCV5UMbKZJCVNdg=", ya2, i10, 48);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f82743e.Z(3);
        boolean zBooleanValue = ((Boolean) this.f82744f.invoke(null, this.f82740b.b())).booleanValue();
        synchronized (this.f82743e) {
            try {
                if (zBooleanValue) {
                    this.f82743e.Z(2);
                } else {
                    this.f82743e.Z(1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
