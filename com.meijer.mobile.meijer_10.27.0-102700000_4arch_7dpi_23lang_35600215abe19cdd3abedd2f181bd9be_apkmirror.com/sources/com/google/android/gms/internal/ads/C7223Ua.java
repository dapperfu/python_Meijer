package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7223Ua extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final StackTraceElement[] f70632h;

    public C7223Ua(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(c8863na, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", c8611l8, i10, 45);
        this.f70632h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f70632h;
        if (stackTraceElementArr != null) {
            C7796da c7796da = new C7796da((String) this.f73205e.invoke(null, stackTraceElementArr));
            synchronized (this.f73204d) {
                try {
                    this.f73204d.z(c7796da.f73429b.longValue());
                    if (c7796da.f73430c.booleanValue()) {
                        this.f73204d.b0(true != c7796da.f73431d.booleanValue() ? 2 : 1);
                    } else {
                        this.f73204d.b0(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
