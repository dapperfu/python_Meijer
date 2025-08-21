package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Xa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7447Xa extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f72187h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f72188i = new Object();

    public C7447Xa(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", c8736l8, i10, 33);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f72187h == null) {
            synchronized (f72188i) {
                try {
                    if (f72187h == null) {
                        f72187h = (Long) this.f74045e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f74044d) {
            this.f74044d.S(f72187h.longValue());
        }
    }
}
