package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.xa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10057xa extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final Activity f80640h;

    /* renamed from: i, reason: collision with root package name */
    private final View f80641i;

    public C10057xa(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, View view, Activity activity) {
        super(c8988na, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", c8736l8, i10, 62);
        this.f80641i = view;
        this.f80640h = activity;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (this.f80641i == null) {
            return;
        }
        Boolean bool = (Boolean) Oc.A.c().a(C8784lf.f76855J2);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.f74045e.invoke(null, this.f80641i, this.f80640h, bool);
        synchronized (this.f74044d) {
            try {
                this.f74044d.i0(((Long) objArr[0]).longValue());
                this.f74044d.k0(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.f74044d.j0((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
