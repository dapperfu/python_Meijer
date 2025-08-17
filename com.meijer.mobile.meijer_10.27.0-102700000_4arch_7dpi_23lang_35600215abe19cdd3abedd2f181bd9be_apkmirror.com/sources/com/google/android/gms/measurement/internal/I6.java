package com.google.android.gms.measurement.internal;

import Z.C5503a;
import com.google.android.gms.internal.measurement.C10394e3;
import com.google.android.gms.internal.measurement.C10403f3;
import com.google.android.gms.internal.measurement.C10412g3;
import com.google.android.gms.internal.measurement.C10421h3;
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
    private String f85061a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f85062b;

    /* renamed from: c, reason: collision with root package name */
    private C10403f3 f85063c;

    /* renamed from: d, reason: collision with root package name */
    private BitSet f85064d;

    /* renamed from: e, reason: collision with root package name */
    private BitSet f85065e;

    /* renamed from: f, reason: collision with root package name */
    private Map f85066f;

    /* renamed from: g, reason: collision with root package name */
    private Map f85067g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ C11125e f85068h;

    /* synthetic */ I6(C11125e c11125e, String str, C10403f3 c10403f3, BitSet bitSet, BitSet bitSet2, Map map, Map map2, byte[] bArr) {
        Objects.requireNonNull(c11125e);
        this.f85068h = c11125e;
        this.f85061a = str;
        this.f85064d = bitSet;
        this.f85065e = bitSet2;
        this.f85066f = map;
        this.f85067g = new C5503a();
        for (Integer num : map2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((Long) map2.get(num));
            this.f85067g.put(num, arrayList);
        }
        this.f85062b = false;
        this.f85063c = c10403f3;
    }

    final /* synthetic */ BitSet c() {
        return this.f85064d;
    }

    final void a(AbstractC11109c abstractC11109c) {
        int iA = abstractC11109c.a();
        if (abstractC11109c.f85370c != null) {
            this.f85065e.set(iA, true);
        }
        Boolean bool = abstractC11109c.f85371d;
        if (bool != null) {
            this.f85064d.set(iA, bool.booleanValue());
        }
        if (abstractC11109c.f85372e != null) {
            Map map = this.f85066f;
            Integer numValueOf = Integer.valueOf(iA);
            Long l10 = (Long) map.get(numValueOf);
            long jLongValue = abstractC11109c.f85372e.longValue() / 1000;
            if (l10 == null || jLongValue > l10.longValue()) {
                this.f85066f.put(numValueOf, Long.valueOf(jLongValue));
            }
        }
        if (abstractC11109c.f85373f != null) {
            Map map2 = this.f85067g;
            Integer numValueOf2 = Integer.valueOf(iA);
            List arrayList = (List) map2.get(numValueOf2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f85067g.put(numValueOf2, arrayList);
            }
            if (abstractC11109c.b()) {
                arrayList.clear();
            }
            T6.a();
            X2 x22 = this.f85068h.f84868a;
            C11187m c11187mU = x22.u();
            String str = this.f85061a;
            C11112c2 c11112c2 = C11120d2.f85411G0;
            if (c11187mU.F(str, c11112c2) && abstractC11109c.c()) {
                arrayList.clear();
            }
            T6.a();
            if (x22.u().F(this.f85061a, c11112c2)) {
                Long lValueOf = Long.valueOf(abstractC11109c.f85373f.longValue() / 1000);
                if (!arrayList.contains(lValueOf)) {
                    arrayList.add(lValueOf);
                    return;
                }
                return;
            }
            arrayList.add(Long.valueOf(abstractC11109c.f85373f.longValue() / 1000));
        }
    }

    final com.google.android.gms.internal.measurement.C2 b(int i10) {
        ArrayList arrayList;
        List list;
        com.google.android.gms.internal.measurement.B2 b2L = com.google.android.gms.internal.measurement.C2.L();
        b2L.t(i10);
        b2L.w(this.f85062b);
        C10403f3 c10403f3 = this.f85063c;
        if (c10403f3 != null) {
            b2L.v(c10403f3);
        }
        C10394e3 c10394e3M = C10403f3.M();
        c10394e3M.v(u6.O(this.f85064d));
        c10394e3M.t(u6.O(this.f85065e));
        Map map = this.f85066f;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(map.size());
            for (Integer num : this.f85066f.keySet()) {
                int iIntValue = num.intValue();
                Long l10 = (Long) this.f85066f.get(num);
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
            c10394e3M.x(arrayList);
        }
        Map map2 = this.f85067g;
        if (map2 == null) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList3 = new ArrayList(map2.size());
            for (Integer num2 : this.f85067g.keySet()) {
                C10412g3 c10412g3J = C10421h3.J();
                c10412g3J.t(num2.intValue());
                List list2 = (List) this.f85067g.get(num2);
                if (list2 != null) {
                    Collections.sort(list2);
                    c10412g3J.u(list2);
                }
                arrayList3.add((C10421h3) c10412g3J.q());
            }
            list = arrayList3;
        }
        c10394e3M.z(list);
        b2L.u(c10394e3M);
        return (com.google.android.gms.internal.measurement.C2) b2L.q();
    }

    /* synthetic */ I6(C11125e c11125e, String str, byte[] bArr) {
        Objects.requireNonNull(c11125e);
        this.f85068h = c11125e;
        this.f85061a = str;
        this.f85062b = true;
        this.f85064d = new BitSet();
        this.f85065e = new BitSet();
        this.f85066f = new C5503a();
        this.f85067g = new C5503a();
    }
}
