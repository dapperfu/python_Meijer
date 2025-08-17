package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Wa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7289Wa extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final ViewOnAttachStateChangeListenerC9611ua f71117h;

    /* renamed from: i, reason: collision with root package name */
    private long f71118i;

    public C7289Wa(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, ViewOnAttachStateChangeListenerC9611ua viewOnAttachStateChangeListenerC9611ua) {
        super(c8863na, "IhZL/A+AP3q6BJHYZzhe50ZZY+joh9QA4Yw9iPAZ5epuj4PBIlbCfCRKNYc+Lpx6", "aH+LkkSrrb3t9z/9chsxYBmeH34qaSymsmB0IYlZ8kA=", c8611l8, i10, 53);
        this.f71117h = viewOnAttachStateChangeListenerC9611ua;
        if (viewOnAttachStateChangeListenerC9611ua != null) {
            this.f71118i = viewOnAttachStateChangeListenerC9611ua.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f71117h != null) {
            this.f73204d.M(((Long) this.f73205e.invoke(null, Long.valueOf(this.f71118i))).longValue());
        }
    }
}
