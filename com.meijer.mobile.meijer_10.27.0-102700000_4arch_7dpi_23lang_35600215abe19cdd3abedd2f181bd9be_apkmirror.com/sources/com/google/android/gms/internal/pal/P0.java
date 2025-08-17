package com.google.android.gms.internal.pal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
final class P0 extends T0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f82826c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ P0(O0 o02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.pal.T0
    final List a(Object obj, long j10) {
        return f(obj, j10, 10);
    }

    private static List f(Object obj, long j10, int i10) {
        List arrayList;
        List list = (List) T1.k(obj, j10);
        if (list.isEmpty()) {
            if (list instanceof N0) {
                arrayList = new M0(i10);
            } else if ((list instanceof InterfaceC10802n1) && (list instanceof I0)) {
                arrayList = ((I0) list).zzd(i10);
            } else {
                arrayList = new ArrayList(i10);
            }
            T1.x(obj, j10, arrayList);
            return arrayList;
        }
        if (f82826c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList2 = new ArrayList(list.size() + i10);
            arrayList2.addAll(list);
            T1.x(obj, j10, arrayList2);
            return arrayList2;
        }
        if (list instanceof O1) {
            M0 m02 = new M0(list.size() + i10);
            m02.addAll(m02.size(), (O1) list);
            T1.x(obj, j10, m02);
            return m02;
        }
        if ((list instanceof InterfaceC10802n1) && (list instanceof I0)) {
            I0 i02 = (I0) list;
            if (!i02.zzc()) {
                I0 i0Zzd = i02.zzd(list.size() + i10);
                T1.x(obj, j10, i0Zzd);
                return i0Zzd;
            }
        }
        return list;
    }

    @Override // com.google.android.gms.internal.pal.T0
    final void b(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) T1.k(obj, j10);
        if (list instanceof N0) {
            objUnmodifiableList = ((N0) list).zze();
        } else if (!f82826c.isAssignableFrom(list.getClass())) {
            if ((list instanceof InterfaceC10802n1) && (list instanceof I0)) {
                I0 i02 = (I0) list;
                if (i02.zzc()) {
                    i02.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        T1.x(obj, j10, objUnmodifiableList);
    }

    @Override // com.google.android.gms.internal.pal.T0
    final void c(Object obj, Object obj2, long j10) {
        List list = (List) T1.k(obj2, j10);
        List listF = f(obj, j10, list.size());
        int size = listF.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            listF.addAll(list);
        }
        if (size > 0) {
            list = listF;
        }
        T1.x(obj, j10, list);
    }
}
