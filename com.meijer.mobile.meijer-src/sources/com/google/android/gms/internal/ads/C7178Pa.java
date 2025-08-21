package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Pa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7178Pa extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private static volatile String f70201h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f70202i = new Object();

    public C7178Pa(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", c8736l8, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f74044d.v("E");
        if (f70201h == null) {
            synchronized (f70202i) {
                try {
                    if (f70201h == null) {
                        f70201h = (String) this.f74045e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f74044d) {
            this.f74044d.v(f70201h);
        }
    }
}
