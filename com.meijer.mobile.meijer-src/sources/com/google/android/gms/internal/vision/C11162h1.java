package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.h1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11162h1 extends AbstractC11154f1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f85389c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private C11162h1() {
        super();
    }

    private static <L> List<L> e(Object obj, long j10, int i10) {
        List<L> arrayList;
        List<L> listF = f(obj, j10);
        if (listF.isEmpty()) {
            if (listF instanceof InterfaceC11158g1) {
                arrayList = new C11146d1(i10);
            } else if ((listF instanceof H1) && (listF instanceof X0)) {
                arrayList = ((X0) listF).zza(i10);
            } else {
                arrayList = new ArrayList<>(i10);
            }
            l2.j(obj, j10, arrayList);
            return arrayList;
        }
        if (f85389c.isAssignableFrom(listF.getClass())) {
            ArrayList arrayList2 = new ArrayList(listF.size() + i10);
            arrayList2.addAll(listF);
            l2.j(obj, j10, arrayList2);
            return arrayList2;
        }
        if (listF instanceof j2) {
            C11146d1 c11146d1 = new C11146d1(listF.size() + i10);
            c11146d1.addAll((j2) listF);
            l2.j(obj, j10, c11146d1);
            return c11146d1;
        }
        if ((listF instanceof H1) && (listF instanceof X0)) {
            X0 x02 = (X0) listF;
            if (!x02.zza()) {
                X0 x0Zza = x02.zza(listF.size() + i10);
                l2.j(obj, j10, x0Zza);
                return x0Zza;
            }
        }
        return listF;
    }

    private static <E> List<E> f(Object obj, long j10) {
        return (List) l2.F(obj, j10);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11154f1
    final <E> void b(Object obj, Object obj2, long j10) {
        List listF = f(obj2, j10);
        List listE = e(obj, j10, listF.size());
        int size = listE.size();
        int size2 = listF.size();
        if (size > 0 && size2 > 0) {
            listE.addAll(listF);
        }
        if (size > 0) {
            listF = listE;
        }
        l2.j(obj, j10, listF);
    }

    @Override // com.google.android.gms.internal.vision.AbstractC11154f1
    final void d(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) l2.F(obj, j10);
        if (list instanceof InterfaceC11158g1) {
            objUnmodifiableList = ((InterfaceC11158g1) list).zze();
        } else if (!f85389c.isAssignableFrom(list.getClass())) {
            if ((list instanceof H1) && (list instanceof X0)) {
                X0 x02 = (X0) list;
                if (x02.zza()) {
                    x02.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        l2.j(obj, j10, objUnmodifiableList);
    }
}
