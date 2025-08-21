package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7348Ua extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final StackTraceElement[] f71472h;

    public C7348Ua(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(c8988na, "xFbi3+W8aerwW3eqFbTnh9hURu39XqgquwTPQwngps2D/g9L7GAvkI7gDJEB4z+M", "K8GEBKnLvE9ILfJGB5b9krvXjFIAigM9H8Mu/ozNfRc=", c8736l8, i10, 45);
        this.f71472h = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.f71472h;
        if (stackTraceElementArr != null) {
            C7921da c7921da = new C7921da((String) this.f74045e.invoke(null, stackTraceElementArr));
            synchronized (this.f74044d) {
                try {
                    this.f74044d.z(c7921da.f74269b.longValue());
                    if (c7921da.f74270c.booleanValue()) {
                        this.f74044d.c0(true != c7921da.f74271d.booleanValue() ? 2 : 1);
                    } else {
                        this.f74044d.c0(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
