package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* renamed from: com.google.android.gms.internal.ads.Ja, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6850Ja extends AbstractCallableC7691cb {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f67937h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f67938i = new Object();

    public C6850Ja(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11) {
        super(c8863na, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", c8611l8, i10, 22);
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        if (f67937h == null) {
            synchronized (f67938i) {
                try {
                    if (f67937h == null) {
                        f67937h = (Long) this.f73205e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.f73204d) {
            this.f73204d.F0(f67937h.longValue());
        }
    }
}
