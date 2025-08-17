package d4;

import U3.k;
import c3.C6350a;
import d3.C13466a;
import d3.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    private final List<d> f127224a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f127225b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f127226c;

    @Override // U3.k
    public long e(int i10) {
        C13466a.a(i10 >= 0);
        C13466a.a(i10 < this.f127226c.length);
        return this.f127226c[i10];
    }

    @Override // U3.k
    public int a(long j10) {
        int iD = P.d(this.f127226c, j10, false, false);
        if (iD < this.f127226c.length) {
            return iD;
        }
        return -1;
    }

    @Override // U3.k
    public List<C6350a> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f127224a.size(); i10++) {
            long[] jArr = this.f127225b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = this.f127224a.get(i10);
                C6350a c6350a = dVar.f127194a;
                if (c6350a.f61395e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(c6350a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: d4.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f127195b, ((d) obj2).f127195b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f127194a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // U3.k
    public int l() {
        return this.f127226c.length;
    }

    public j(List<d> list) {
        this.f127224a = Collections.unmodifiableList(new ArrayList(list));
        this.f127225b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f127225b;
            jArr[i11] = dVar.f127195b;
            jArr[i11 + 1] = dVar.f127196c;
        }
        long[] jArr2 = this.f127225b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f127226c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
