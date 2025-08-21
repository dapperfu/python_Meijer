package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.internal.ads.Aa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6669Aa extends AbstractCallableC7816cb {

    /* renamed from: i, reason: collision with root package name */
    private static final C7923db f65977i = new C7923db();

    /* renamed from: h, reason: collision with root package name */
    private final Context f65978h;

    public C6669Aa(C8988na c8988na, String str, String str2, C8736l8 c8736l8, int i10, int i11, Context context) {
        super(c8988na, "dWdd1c55O832EgswVA7EDPTVX/IpvF08MBnEPy7r0t3O9D/V1qjYDXzsPAH/Vbkj", "bxwXOoEQUxH5XWh5SE6sIt1AlD2mR+aN5LSYX3ZGs5Q=", c8736l8, i10, 29);
        this.f65978h = context;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC7816cb
    protected final void a() throws IllegalAccessException, InvocationTargetException {
        this.f74044d.u0("E");
        AtomicReference atomicReferenceA = f65977i.a(this.f65978h.getPackageName());
        if (atomicReferenceA.get() == null) {
            synchronized (atomicReferenceA) {
                try {
                    if (atomicReferenceA.get() == null) {
                        atomicReferenceA.set((String) this.f74045e.invoke(null, this.f65978h));
                    }
                } finally {
                }
            }
        }
        String str = (String) atomicReferenceA.get();
        synchronized (this.f74044d) {
            this.f74044d.u0(C7672b9.a(str.getBytes(), true));
        }
    }
}
