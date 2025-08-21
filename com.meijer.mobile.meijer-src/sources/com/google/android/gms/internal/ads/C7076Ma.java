package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ma, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7076Ma extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private final C8027ea f69507h;

    public C7076Ma(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, C8027ea c8027ea) {
        super(c8988na, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", c8736l8, i10, 94);
        this.f69507h = c8027ea;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        int iIntValue = ((Integer) this.f74045e.invoke(null, this.f69507h.a())).intValue();
        synchronized (this.f74044d) {
            this.f74044d.e0(C10126y8.a(iIntValue));
        }
    }
}
