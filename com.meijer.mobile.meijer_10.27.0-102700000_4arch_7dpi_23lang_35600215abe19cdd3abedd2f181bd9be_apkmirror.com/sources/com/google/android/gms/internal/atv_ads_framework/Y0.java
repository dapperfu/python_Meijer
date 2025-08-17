package com.google.android.gms.internal.atv_ads_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
final class Y0 extends AbstractC10211d1 {

    /* renamed from: c, reason: collision with root package name */
    private static final Class f80912c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

    /* synthetic */ Y0(X0 x02) {
        super(null);
    }

    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10211d1
    final void a(Object obj, long j10) {
        Object objUnmodifiableList;
        List list = (List) C10201a2.k(obj, j10);
        if (list instanceof W0) {
            objUnmodifiableList = ((W0) list).zzd();
        } else if (!f80912c.isAssignableFrom(list.getClass())) {
            if ((list instanceof InterfaceC10267w1) && (list instanceof R0)) {
                R0 r02 = (R0) list;
                if (r02.zzc()) {
                    r02.zzb();
                    return;
                }
                return;
            }
            objUnmodifiableList = Collections.unmodifiableList(list);
        } else {
            return;
        }
        C10201a2.x(obj, j10, objUnmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.atv_ads_framework.AbstractC10211d1
    final void b(Object obj, Object obj2, long j10) {
        V0 v02;
        List list = (List) C10201a2.k(obj2, j10);
        int size = list.size();
        List listZzg = (List) C10201a2.k(obj, j10);
        if (listZzg.isEmpty()) {
            if (listZzg instanceof W0) {
                listZzg = new V0(size);
            } else if ((listZzg instanceof InterfaceC10267w1) && (listZzg instanceof R0)) {
                listZzg = ((R0) listZzg).zzg(size);
            } else {
                listZzg = new ArrayList(size);
            }
            C10201a2.x(obj, j10, listZzg);
        } else {
            if (f80912c.isAssignableFrom(listZzg.getClass())) {
                ArrayList arrayList = new ArrayList(listZzg.size() + size);
                arrayList.addAll(listZzg);
                C10201a2.x(obj, j10, arrayList);
                v02 = arrayList;
            } else if (listZzg instanceof V1) {
                V0 v03 = new V0(listZzg.size() + size);
                v03.addAll(v03.size(), (V1) listZzg);
                C10201a2.x(obj, j10, v03);
                v02 = v03;
            } else if ((listZzg instanceof InterfaceC10267w1) && (listZzg instanceof R0)) {
                R0 r02 = (R0) listZzg;
                if (!r02.zzc()) {
                    listZzg = r02.zzg(listZzg.size() + size);
                    C10201a2.x(obj, j10, listZzg);
                }
            }
            listZzg = v02;
        }
        int size2 = listZzg.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            listZzg.addAll(list);
        }
        if (size2 > 0) {
            list = listZzg;
        }
        C10201a2.x(obj, j10, list);
    }
}
