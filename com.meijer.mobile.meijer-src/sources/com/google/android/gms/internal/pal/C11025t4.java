package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.t4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11025t4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f84885i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f84886j = new Object();

    public C11025t4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "N0mA2OgFUnHXhnZTWHrO10/LZw/fChWm76LMkbZzvR9G3lxQkMoE65IWMn9zBWSu", "uxIInGM9FQ+1gujg5A7z9IJxIqStl6tvqqzSbuEi494=", ya2, i10, 22);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f84885i == null) {
            synchronized (f84886j) {
                try {
                    if (f84885i == null) {
                        f84885i = (Long) this.f83584f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f83583e) {
            this.f83583e.z0(f84885i.longValue());
        }
    }
}
