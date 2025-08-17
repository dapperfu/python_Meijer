package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Da, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6646Da extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f66259h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f66260i = new Object();

    public C6646Da(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", c8611l8, i10, 44);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f66259h == null) {
            synchronized (f66260i) {
                try {
                    if (f66259h == null) {
                        f66259h = (Long) this.f73205e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f73204d) {
            this.f73204d.v0(f66259h.longValue());
        }
    }
}
