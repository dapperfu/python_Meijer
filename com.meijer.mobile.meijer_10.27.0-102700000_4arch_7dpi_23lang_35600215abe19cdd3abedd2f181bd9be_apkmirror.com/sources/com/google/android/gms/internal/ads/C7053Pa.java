package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Pa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7053Pa extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private static volatile String f69361h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f69362i = new Object();

    public C7053Pa(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "IDxTpItZJ7MAk3i5HMuj4prUf4vKa3D9/OjYTr4UdlN9pm9gEn8oAVH4br8ui6F4", "/bkPoQedf8H6er/z22s5Ugb2zQK/aJlVqqMiarhu0YY=", c8611l8, i10, 1);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f73204d.v("E");
        if (f69361h == null) {
            synchronized (f69362i) {
                try {
                    if (f69361h == null) {
                        f69361h = (String) this.f73205e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f73204d) {
            this.f73204d.v(f69361h);
        }
    }
}
