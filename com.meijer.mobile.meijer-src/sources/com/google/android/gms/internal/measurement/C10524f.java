package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10524f implements Iterable, InterfaceC10623q, InterfaceC10587m {

    /* renamed from: a, reason: collision with root package name */
    final SortedMap f83014a;

    /* renamed from: b, reason: collision with root package name */
    final Map f83015b;

    public C10524f() {
        this.f83014a = new TreeMap();
        this.f83015b = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10524f)) {
            return false;
        }
        C10524f c10524f = (C10524f) obj;
        if (m() != c10524f.m()) {
            return false;
        }
        SortedMap sortedMap = this.f83014a;
        if (sortedMap.isEmpty()) {
            return c10524f.f83014a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!o(iIntValue).equals(c10524f.o(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final boolean S(String str) {
        return "length".equals(str) || this.f83015b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final InterfaceC10623q X(String str) {
        InterfaceC10623q interfaceC10623q;
        return "length".equals(str) ? new C10560j(Double.valueOf(m())) : (!S(str) || (interfaceC10623q = (InterfaceC10623q) this.f83015b.get(str)) == null) ? InterfaceC10623q.f83182i3 : interfaceC10623q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10587m
    public final void e(String str, InterfaceC10623q interfaceC10623q) {
        if (interfaceC10623q == null) {
            this.f83015b.remove(str);
        } else {
            this.f83015b.put(str, interfaceC10623q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q f(String str, U1 u12, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? D.a(str, this, u12, list) : InterfaceC10587m.a(this, new C10658u(str), u12, list);
    }

    public final int hashCode() {
        return this.f83014a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10515e(this);
    }

    public final List k() {
        ArrayList arrayList = new ArrayList(m());
        for (int i10 = 0; i10 < m(); i10++) {
            arrayList.add(o(i10));
        }
        return arrayList;
    }

    public final Iterator l() {
        return this.f83014a.keySet().iterator();
    }

    public final int m() {
        SortedMap sortedMap = this.f83014a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int n() {
        return this.f83014a.size();
    }

    public final void p(int i10, InterfaceC10623q interfaceC10623q) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (interfaceC10623q == null) {
            this.f83014a.remove(Integer.valueOf(i10));
        } else {
            this.f83014a.put(Integer.valueOf(i10), interfaceC10623q);
        }
    }

    public final boolean q(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f83014a;
            if (i10 <= ((Integer) sortedMap.lastKey()).intValue()) {
                return sortedMap.containsKey(Integer.valueOf(i10));
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i10);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void r() {
        this.f83014a.clear();
    }

    public final void s(int i10, InterfaceC10623q interfaceC10623q) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= m()) {
            p(i10, interfaceC10623q);
            return;
        }
        SortedMap sortedMap = this.f83014a;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            InterfaceC10623q interfaceC10623q2 = (InterfaceC10623q) sortedMap.get(numValueOf);
            if (interfaceC10623q2 != null) {
                p(iIntValue + 1, interfaceC10623q2);
                sortedMap.remove(numValueOf);
            }
        }
        p(i10, interfaceC10623q);
    }

    public final void t(int i10) {
        SortedMap sortedMap = this.f83014a;
        int iIntValue = ((Integer) sortedMap.lastKey()).intValue();
        if (i10 > iIntValue || i10 < 0) {
            return;
        }
        sortedMap.remove(Integer.valueOf(i10));
        if (i10 == iIntValue) {
            int i11 = i10 - 1;
            Integer numValueOf = Integer.valueOf(i11);
            if (sortedMap.containsKey(numValueOf) || i11 < 0) {
                return;
            }
            sortedMap.put(numValueOf, InterfaceC10623q.f83182i3);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC10623q interfaceC10623q = (InterfaceC10623q) sortedMap.get(numValueOf2);
            if (interfaceC10623q != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), interfaceC10623q);
                sortedMap.remove(numValueOf2);
            }
        }
    }

    public final String toString() {
        return u(",");
    }

    public final String u(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (!this.f83014a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= m()) {
                    break;
                }
                InterfaceC10623q interfaceC10623qO = o(i10);
                sb2.append(str2);
                if (!(interfaceC10623qO instanceof C10667v) && !(interfaceC10623qO instanceof C10605o)) {
                    sb2.append(interfaceC10623qO.zzc());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final String zzc() {
        return u(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Double zzd() {
        SortedMap sortedMap = this.f83014a;
        return sortedMap.size() == 1 ? o(0).zzd() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final Iterator zzf() {
        return new C10506d(this, this.f83014a.keySet().iterator(), this.f83015b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10623q
    public final InterfaceC10623q zzt() {
        C10524f c10524f = new C10524f();
        for (Map.Entry entry : this.f83014a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC10587m) {
                c10524f.f83014a.put((Integer) entry.getKey(), (InterfaceC10623q) entry.getValue());
            } else {
                c10524f.f83014a.put((Integer) entry.getKey(), ((InterfaceC10623q) entry.getValue()).zzt());
            }
        }
        return c10524f;
    }

    public C10524f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                p(i10, (InterfaceC10623q) list.get(i10));
            }
        }
    }

    public final InterfaceC10623q o(int i10) {
        InterfaceC10623q interfaceC10623q;
        if (i10 < m()) {
            if (q(i10) && (interfaceC10623q = (InterfaceC10623q) this.f83014a.get(Integer.valueOf(i10))) != null) {
                return interfaceC10623q;
            }
            return InterfaceC10623q.f83182i3;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }
}
