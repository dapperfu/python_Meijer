package com.google.android.gms.internal.pal;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.pal.o4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10821o4 extends L4 {

    /* renamed from: i, reason: collision with root package name */
    private static volatile Long f83256i;

    /* renamed from: j, reason: collision with root package name */
    private static final Object f83257j = new Object();

    public C10821o4(X3 x32, String str, String str2, Ya ya2, int i10, int i11) {
        super(x32, "XFxH1z0dBuMDP7aWA+P/3WKwW9qr8sC2ASjEfciaKHfSLryjCNl4cmJgfsh2Tylb", "r0MNv9zqwvoUwASL1pBJjOA1OkDa8Kcs5NaA6VOkJEI=", ya2, i10, 44);
    }

    @Override // com.google.android.gms.internal.pal.L4
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f83256i == null) {
            synchronized (f83257j) {
                try {
                    if (f83256i == null) {
                        f83256i = (Long) this.f82744f.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f82743e) {
            this.f82743e.o0(f83256i.longValue());
        }
    }
}
