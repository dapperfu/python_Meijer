package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.measurement.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10399f implements Iterable, InterfaceC10498q, InterfaceC10462m {

    /* renamed from: a, reason: collision with root package name */
    final SortedMap f82174a;

    /* renamed from: b, reason: collision with root package name */
    final Map f82175b;

    public C10399f() {
        this.f82174a = new TreeMap();
        this.f82175b = new TreeMap();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10399f)) {
            return false;
        }
        C10399f c10399f = (C10399f) obj;
        if (m() != c10399f.m()) {
            return false;
        }
        SortedMap sortedMap = this.f82174a;
        if (sortedMap.isEmpty()) {
            return c10399f.f82174a.isEmpty();
        }
        for (int iIntValue = ((Integer) sortedMap.firstKey()).intValue(); iIntValue <= ((Integer) sortedMap.lastKey()).intValue(); iIntValue++) {
            if (!o(iIntValue).equals(c10399f.o(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final boolean S(String str) {
        return "length".equals(str) || this.f82175b.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final InterfaceC10498q W(String str) {
        InterfaceC10498q interfaceC10498q;
        return "length".equals(str) ? new C10435j(Double.valueOf(m())) : (!S(str) || (interfaceC10498q = (InterfaceC10498q) this.f82175b.get(str)) == null) ? InterfaceC10498q.f82342i3 : interfaceC10498q;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10462m
    public final void e(String str, InterfaceC10498q interfaceC10498q) {
        if (interfaceC10498q == null) {
            this.f82175b.remove(str);
        } else {
            this.f82175b.put(str, interfaceC10498q);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q f(String str, U1 u12, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? D.a(str, this, u12, list) : InterfaceC10462m.a(this, new C10533u(str), u12, list);
    }

    public final int hashCode() {
        return this.f82174a.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C10390e(this);
    }

    public final List k() {
        ArrayList arrayList = new ArrayList(m());
        for (int i10 = 0; i10 < m(); i10++) {
            arrayList.add(o(i10));
        }
        return arrayList;
    }

    public final Iterator l() {
        return this.f82174a.keySet().iterator();
    }

    public final int m() {
        SortedMap sortedMap = this.f82174a;
        if (sortedMap.isEmpty()) {
            return 0;
        }
        return ((Integer) sortedMap.lastKey()).intValue() + 1;
    }

    public final int n() {
        return this.f82174a.size();
    }

    public final void p(int i10, InterfaceC10498q interfaceC10498q) {
        if (i10 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Out of bounds index: ");
            sb2.append(i10);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (interfaceC10498q == null) {
            this.f82174a.remove(Integer.valueOf(i10));
        } else {
            this.f82174a.put(Integer.valueOf(i10), interfaceC10498q);
        }
    }

    public final boolean q(int i10) {
        if (i10 >= 0) {
            SortedMap sortedMap = this.f82174a;
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
        this.f82174a.clear();
    }

    public final void s(int i10, InterfaceC10498q interfaceC10498q) {
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Invalid value index: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i10 >= m()) {
            p(i10, interfaceC10498q);
            return;
        }
        SortedMap sortedMap = this.f82174a;
        for (int iIntValue = ((Integer) sortedMap.lastKey()).intValue(); iIntValue >= i10; iIntValue--) {
            Integer numValueOf = Integer.valueOf(iIntValue);
            InterfaceC10498q interfaceC10498q2 = (InterfaceC10498q) sortedMap.get(numValueOf);
            if (interfaceC10498q2 != null) {
                p(iIntValue + 1, interfaceC10498q2);
                sortedMap.remove(numValueOf);
            }
        }
        p(i10, interfaceC10498q);
    }

    public final void t(int i10) {
        SortedMap sortedMap = this.f82174a;
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
            sortedMap.put(numValueOf, InterfaceC10498q.f82342i3);
            return;
        }
        while (true) {
            i10++;
            if (i10 > ((Integer) sortedMap.lastKey()).intValue()) {
                return;
            }
            Integer numValueOf2 = Integer.valueOf(i10);
            InterfaceC10498q interfaceC10498q = (InterfaceC10498q) sortedMap.get(numValueOf2);
            if (interfaceC10498q != null) {
                sortedMap.put(Integer.valueOf(i10 - 1), interfaceC10498q);
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
        if (!this.f82174a.isEmpty()) {
            int i10 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i10 >= m()) {
                    break;
                }
                InterfaceC10498q interfaceC10498qO = o(i10);
                sb2.append(str2);
                if (!(interfaceC10498qO instanceof C10542v) && !(interfaceC10498qO instanceof C10480o)) {
                    sb2.append(interfaceC10498qO.zzc());
                }
                i10++;
            }
            sb2.delete(0, str2.length());
        }
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final String zzc() {
        return u(",");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Double zzd() {
        SortedMap sortedMap = this.f82174a;
        return sortedMap.size() == 1 ? o(0).zzd() : sortedMap.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Boolean zze() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final Iterator zzf() {
        return new C10381d(this, this.f82174a.keySet().iterator(), this.f82175b.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC10498q
    public final InterfaceC10498q zzt() {
        C10399f c10399f = new C10399f();
        for (Map.Entry entry : this.f82174a.entrySet()) {
            if (entry.getValue() instanceof InterfaceC10462m) {
                c10399f.f82174a.put((Integer) entry.getKey(), (InterfaceC10498q) entry.getValue());
            } else {
                c10399f.f82174a.put((Integer) entry.getKey(), ((InterfaceC10498q) entry.getValue()).zzt());
            }
        }
        return c10399f;
    }

    public C10399f(List list) {
        this();
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                p(i10, (InterfaceC10498q) list.get(i10));
            }
        }
    }

    public final InterfaceC10498q o(int i10) {
        InterfaceC10498q interfaceC10498q;
        if (i10 < m()) {
            if (q(i10) && (interfaceC10498q = (InterfaceC10498q) this.f82174a.get(Integer.valueOf(i10))) != null) {
                return interfaceC10498q;
            }
            return InterfaceC10498q.f82342i3;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }
}
