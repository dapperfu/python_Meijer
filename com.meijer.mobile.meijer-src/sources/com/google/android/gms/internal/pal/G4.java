package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes6.dex */
public final class G4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f83462i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f83463j = new Object();

    public G4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "5BhEc19mhLCb3gixLpO/usqpdcrz8iDHUvKRNr8tUAX9rUzF0wog6vEOJrftvcpW", "yZHUQ89G8fTgEsMNs0hBrXwZIrb4VL1iE12C/t/Y3UE=", ya2, i10, 33);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f83462i == null) {
            synchronized (f83463j) {
                try {
                    if (f83462i == null) {
                        f83462i = (Long) this.f83584f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f83583e) {
            this.f83583e.N(f83462i.longValue());
        }
    }
}
