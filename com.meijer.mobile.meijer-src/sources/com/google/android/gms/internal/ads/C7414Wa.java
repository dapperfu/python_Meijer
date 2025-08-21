package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Wa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7414Wa extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC9736ua f71957h;

    /* renamed from: i, reason: collision with root package name */
    private long f71958i;

    public C7414Wa(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, ViewOnAttachStateChangeListenerC9736ua viewOnAttachStateChangeListenerC9736ua) {
        super(c8988na, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", c8736l8, i10, 53);
        this.f71957h = viewOnAttachStateChangeListenerC9736ua;
        if (viewOnAttachStateChangeListenerC9736ua != null) {
            this.f71958i = viewOnAttachStateChangeListenerC9736ua.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f71957h != null) {
            this.f74044d.M(((Long) this.f74045e.invoke(null, Long.valueOf(this.f71958i))).longValue());
        }
    }
}
