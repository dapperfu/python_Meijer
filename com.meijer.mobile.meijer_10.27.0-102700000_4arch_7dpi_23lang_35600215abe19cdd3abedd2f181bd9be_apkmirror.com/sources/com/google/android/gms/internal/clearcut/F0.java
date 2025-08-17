package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes6.dex */
final class F0 implements E0 {
    F0() {
    }

    @Override // com.google.android.gms.internal.clearcut.E0
    public final Object a(Object obj) {
        return D0.c().d();
    }

    @Override // com.google.android.gms.internal.clearcut.E0
    public final Object b(Object obj) {
        ((D0) obj).i();
        return obj;
    }

    @Override // com.google.android.gms.internal.clearcut.E0
    public final int c(int i10, Object obj, Object obj2) {
        D0 d02 = (D0) obj;
        if (d02.isEmpty()) {
            return 0;
        }
        Iterator it = d02.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.clearcut.E0
    public final Map<?, ?> d(Object obj) {
        return (D0) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.E0
    public final Object zzb(Object obj, Object obj2) {
        D0 d0D = (D0) obj;
        D0 d02 = (D0) obj2;
        if (!d02.isEmpty()) {
            if (!d0D.a()) {
                d0D = d0D.d();
            }
            d0D.b(d02);
        }
        return d0D;
    }

    @Override // com.google.android.gms.internal.clearcut.E0
    public final Map<?, ?> zzh(Object obj) {
        return (D0) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.E0
    public final boolean zzi(Object obj) {
        return !((D0) obj).a();
    }

    @Override // com.google.android.gms.internal.clearcut.E0
    public final C0<?, ?> zzl(Object obj) {
        throw new NoSuchMethodError();
    }
}
