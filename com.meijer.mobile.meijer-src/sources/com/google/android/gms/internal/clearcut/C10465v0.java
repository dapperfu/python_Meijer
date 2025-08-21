package com.google.android.gms.internal.clearcut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.clearcut.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10465v0 extends AbstractC10459t0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class<?> f82419c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    private C10465v0() {
        super();
    }

    private static <E> List<E> e(Object obj, long j10) {
        return (List) C10475y1.M(obj, j10);
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10459t0
    final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) C10475y1.M(obj, j10);
        if (list instanceof InterfaceC10456s0) {
            objUnmodifiableList = ((InterfaceC10456s0) list).B3();
        } else if (f82419c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            objUnmodifiableList = Collections.unmodifiableList(list);
        }
        C10475y1.i(obj, j10, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.clearcut.AbstractC10459t0
    final <E> void b(Object obj, Object obj2, long j10) {
        C10453r0 c10453r0;
        List listE = e(obj2, j10);
        int size = listE.size();
        List listE2 = e(obj, j10);
        if (listE2.isEmpty()) {
            listE2 = listE2 instanceof InterfaceC10456s0 ? new C10453r0(size) : new ArrayList(size);
            C10475y1.i(obj, j10, listE2);
        } else {
            if (f82419c.isAssignableFrom(listE2.getClass())) {
                ArrayList arrayList = new ArrayList(listE2.size() + size);
                arrayList.addAll(listE2);
                c10453r0 = arrayList;
            } else if (listE2 instanceof C10466v1) {
                C10453r0 c10453r02 = new C10453r0(listE2.size() + size);
                c10453r02.addAll((C10466v1) listE2);
                c10453r0 = c10453r02;
            }
            C10475y1.i(obj, j10, c10453r0);
            listE2 = c10453r0;
        }
        int size2 = listE2.size();
        int size3 = listE.size();
        if (size2 > 0 && size3 > 0) {
            listE2.addAll(listE);
        }
        if (size2 > 0) {
            listE = listE2;
        }
        C10475y1.i(obj, j10, listE);
    }
}
