package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6544Aa extends AbstractCallableC7691cb {

    /* renamed from: i, reason: collision with root package name */
    private static final C7798db f65137i = new C7798db();

    /* renamed from: h, reason: collision with root package name */
    private final Context f65138h;

    public C6544Aa(C8863na c8863na, String str, String str2, C8611l8 c8611l8, int i10, int i11, Context context) {
        super(c8863na, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", c8611l8, i10, 29);
        this.f65138h = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7691cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f73204d.u0("E");
        AtomicReference atomicReferenceA = f65137i.a(this.f65138h.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                try {
                    if (atomicReferenceA.get() == null) {
                        atomicReferenceA.set((String) this.f73205e.invoke(null, this.f65138h));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceA.get();
        synchronized (this.f73204d) {
            this.f73204d.u0(C7547b9.a(str.getBytes(), true));
        }
    }
}
