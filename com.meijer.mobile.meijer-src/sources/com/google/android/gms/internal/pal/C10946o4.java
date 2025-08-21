package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.o4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10946o4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f84096i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f84097j = new Object();

    public C10946o4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "XFxH1z0dBuMDP7aWA+P/3WKwW9qr8sC2ASjEfciaKHfSLryjCNl4cmJgfsh2Tylb", "r0MNv9zqwvoUwASL1pBJjOA1OkDa8Kcs5NaA6VOkJEI=", ya2, i10, 44);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f84096i == null) {
            synchronized (f84097j) {
                try {
                    if (f84096i == null) {
                        f84096i = (Long) this.f83584f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f83583e) {
            this.f83583e.o0(f84096i.longValue());
        }
    }
}
