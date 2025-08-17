package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Xa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7322Xa extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f71347h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f71348i = new Object();

    public C7322Xa(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "ggyMimGcgIX1dP+eCc2eG2r/GzpvQNgutarsMV1JGh7vOdAlwvnhksZv1ggLA3MH", "V8AFkrWTqIFMlH2T0HF0GHt49h/FZu+6Sm1YbAzJ62A=", c8611l8, i10, 33);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f71347h == null) {
            synchronized (f71348i) {
                try {
                    if (f71347h == null) {
                        f71347h = (Long) this.f73205e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f73204d) {
            this.f73204d.S(f71347h.longValue());
        }
    }
}
