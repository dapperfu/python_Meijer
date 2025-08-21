package com.google.android.gms.measurement.internal;

import Z.C5603a;
import com.google.android.gms.internal.measurement.C10519e3;
import com.google.android.gms.internal.measurement.C10528f3;
import com.google.android.gms.internal.measurement.C10537g3;
import com.google.android.gms.internal.measurement.C10546h3;
import com.google.android.gms.internal.measurement.T6;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
final class I6 {

    /* renamed from: a, reason: collision with root package name */
    private String f85901a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85902b;

    /* renamed from: c, reason: collision with root package name */
    private C10528f3 f85903c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f85904d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f85905e;

    /* renamed from: f, reason: collision with root package name */
    private Map f85906f;

    /* renamed from: g, reason: collision with root package name */
    private Map f85907g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C11250e f85908h;

    /* synthetic */ I6(C11250e c11250e, String str, C10528f3 c10528f3, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(c11250e);
        this.f85908h = c11250e;
        this.f85901a = str;
        this.f85904d = bitSet;
        this.f85905e = bitSet2;
        this.f85906f = map;
        this.f85907g = new C5603a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f85907g.put(num, arrayList);
        }
        this.f85902b = false;
        this.f85903c = c10528f3;
    }

    final /* synthetic */ BitSet c() {
        return this.f85904d;
    }

    final void a(AbstractC11234c abstractC11234c) {
        int iA = abstractC11234c.a();
        if (abstractC11234c.f86210c != null) {
            this.f85905e.set(iA, true);
        }
        Boolean bool = abstractC11234c.f86211d;
        if (bool != null) {
            this.f85904d.set(iA, bool.booleanValue());
        }
        if (abstractC11234c.f86212e != null) {
            Map map = this.f85906f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = abstractC11234c.f86212e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f85906f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (abstractC11234c.f86213f != null) {
            Map map2 = this.f85907g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f85907g.put(numValueOf2, arrayList);
            }
            if (abstractC11234c.b()) {
                arrayList.clear();
            }
            T6.a();
            X2 x22 = this.f85908h.f85708a;
            C11312m c11312mU = x22.u();
            String str = this.f85901a;
            C11237c2 c11237c2 = C11245d2.f86251G0;
            if (c11312mU.F(str, c11237c2) && abstractC11234c.c()) {
                arrayList.clear();
            }
            T6.a();
            if (x22.u().F(this.f85901a, c11237c2)) {
                Long lValueOf = Long.valueOf(abstractC11234c.f86213f.longValue() / 1000);
                if (!arrayList.contains(lValueOf)) {
                    arrayList.add(lValueOf);
                    return;
                }
                return;
            }
            arrayList.add(Long.valueOf(abstractC11234c.f86213f.longValue() / 1000));
        }
    }

    final com.google.android.gms.internal.measurement.C2 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.B2 b2L = com.google.android.gms.internal.measurement.C2.L();
        b2L.t(i10);
        b2L.w(this.f85902b);
        C10528f3 c10528f3 = this.f85903c;
        if (c10528f3 != null) {
            b2L.v(c10528f3);
        }
        C10519e3 c10519e3M = C10528f3.M();
        c10519e3M.v(u6.O(this.f85904d));
        c10519e3M.t(u6.O(this.f85905e));
        Map map = this.f85906f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f85906f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f85906f.get(num);
                if (l10 != null) {
                    com.google.android.gms.internal.measurement.L2 l2I = com.google.android.gms.internal.measurement.M2.I();
                    l2I.t(iIntValue);
                    l2I.u(l10.longValue());
                    arrayList2.add((com.google.android.gms.internal.measurement.M2) l2I.q());
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            c10519e3M.x(arrayList);
        }
        Map map2 = this.f85907g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f85907g.keySet()) {
                C10537g3 c10537g3J = C10546h3.J();
                c10537g3J.t(num2.intValue());
                List list2 = (List) this.f85907g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c10537g3J.u(list2);
                }
                arrayList3.add((C10546h3) c10537g3J.q());
            }
            list = arrayList3;
        }
        c10519e3M.z(list);
        b2L.u(c10519e3M);
        return (com.google.android.gms.internal.measurement.C2) b2L.q();
    }

    /* synthetic */ I6(C11250e c11250e, String str, byte[] bArr) {
        Objects.requireNonNull(c11250e);
        this.f85908h = c11250e;
        this.f85901a = str;
        this.f85902b = true;
        this.f85904d = new BitSet();
        this.f85905e = new BitSet();
        this.f85906f = new C5603a();
        this.f85907g = new C5603a();
    }
}
