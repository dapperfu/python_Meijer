package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.s1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11071s1 implements InterfaceC11074t1 {
    C11071s1() {
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11074t1
    public final Object zze(Object obj) {
        ((C11066q1) obj).f();
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11074t1
    public final boolean a(Object obj) {
        return !((C11066q1) obj).g();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11074t1
    public final Object b(Object obj, Object obj2) {
        C11066q1 c11066q1D = (C11066q1) obj;
        C11066q1 c11066q1 = (C11066q1) obj2;
        if (!c11066q1.isEmpty()) {
            if (!c11066q1D.g()) {
                c11066q1D = c11066q1D.d();
            }
            c11066q1D.c(c11066q1);
        }
        return c11066q1D;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11074t1
    public final int c(int i10, Object obj, Object obj2) {
        C11066q1 c11066q1 = (C11066q1) obj;
        if (c11066q1.isEmpty()) {
            return 0;
        }
        Iterator it = c11066q1.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11074t1
    public final Map<?, ?> zza(Object obj) {
        return (C11066q1) obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11074t1
    public final C11068r1<?, ?> zzb(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11074t1
    public final Map<?, ?> zzc(Object obj) {
        return (C11066q1) obj;
    }

    @Override // com.google.android.gms.internal.vision.InterfaceC11074t1
    public final Object zzf(Object obj) {
        return C11066q1.b().d();
    }
}
