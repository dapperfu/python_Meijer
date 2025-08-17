package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.xa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9932xa extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final Activity f79800h;

    /* renamed from: i, reason: collision with root package name */
    private final View f79801i;

    public C9932xa(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, View view, Activity activity) {
        super(c8863na, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", c8611l8, i10, 62);
        this.f79801i = view;
        this.f79800h = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f79801i == null) {
            return;
        }
        Boolean bool = (Boolean) Mc.A.c().a(C8659lf.f76015J2);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f73205e.invoke(null, this.f79801i, this.f79800h, bool);
        synchronized (this.f73204d) {
            try {
                this.f73204d.i0(((Long) objArr[0]).longValue());
                this.f73204d.k0(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f73204d.j0((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
