package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6975Ja extends AbstractCallableC7816cb {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f68777h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f68778i = new Object();

    public C6975Ja(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11) {
        super(c8988na, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", c8736l8, i10, 22);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f68777h == null) {
            synchronized (f68778i) {
                try {
                    if (f68777h == null) {
                        f68777h = (Long) this.f74045e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f74044d) {
            this.f74044d.F0(f68777h.longValue());
        }
    }
}
