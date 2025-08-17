package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6951Ma extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private final C7902ea f68667h;

    public C6951Ma(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, C7902ea c7902ea) {
        super(c8863na, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", c8611l8, i10, 94);
        this.f68667h = c7902ea;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.f73205e.invoke(null, this.f68667h.a())).intValue();
        synchronized (this.f73204d) {
            this.f73204d.e0(C10001y8.a(iIntValue));
        }
    }
}
