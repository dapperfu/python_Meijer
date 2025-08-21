package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Da, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6771Da extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f67099h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f67100i = new Object();

    public C6771Da(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", c8736l8, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f67099h == null) {
            synchronized (f67100i) {
                try {
                    if (f67099h == null) {
                        f67099h = (Long) this.f74045e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f74044d) {
            this.f74044d.v0(f67099h.longValue());
        }
    }
}
