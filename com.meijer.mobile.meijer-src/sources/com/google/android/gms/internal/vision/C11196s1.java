package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.s1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11196s1 implements InterfaceC11199t1 {
    C11196s1() {
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11199t1
    public final Object zze(Object obj) {
        ((C11191q1) obj).f();
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11199t1
    public final boolean a(Object obj) {
        return !((C11191q1) obj).g();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11199t1
    public final Object b(Object obj, Object obj2) {
        C11191q1 c11191q1D = (C11191q1) obj;
        C11191q1 c11191q1 = (C11191q1) obj2;
        if (!c11191q1.isEmpty()) {
            if (!c11191q1D.g()) {
                c11191q1D = c11191q1D.d();
            }
            c11191q1D.c(c11191q1);
        }
        return c11191q1D;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11199t1
    public final int c(int i10, Object obj, Object obj2) {
        C11191q1 c11191q1 = (C11191q1) obj;
        if (c11191q1.isEmpty()) {
            return 0;
        }
        Iterator it = c11191q1.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11199t1
    public final Map<?, ?> zza(Object obj) {
        return (C11191q1) obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11199t1
    public final C11193r1<?, ?> zzb(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11199t1
    public final Map<?, ?> zzc(Object obj) {
        return (C11191q1) obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11199t1
    public final Object zzf(Object obj) {
        return C11191q1.b().d();
    }
}
