package d4;

import U3.k;
import c3.C6476a;
import d3.C13599a;
import d3.P;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
final class j implements k {

    /* renamed from: a, reason: collision with root package name */
    private final List<d> f128026a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f128027b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f128028c;

    @Override // U3.k
    public long e(int i10) {
        C13599a.a(i10 >= 0);
        C13599a.a(i10 < this.f128028c.length);
        return this.f128028c[i10];
    }

    @Override // U3.k
    public int a(long j10) {
        int iD = P.d(this.f128028c, j10, false, false);
        if (iD < this.f128028c.length) {
            return iD;
        }
        return -1;
    }

    @Override // U3.k
    public List<C6476a> b(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f128026a.size(); i10++) {
            long[] jArr = this.f128027b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                d dVar = this.f128026a.get(i10);
                C6476a c6476a = dVar.f127996a;
                if (c6476a.f61194e == -3.4028235E38f) {
                    arrayList2.add(dVar);
                } else {
                    arrayList.add(c6476a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: d4.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((d) obj).f127997b, ((d) obj2).f127997b);
            }
        });
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            arrayList.add(((d) arrayList2.get(i12)).f127996a.a().h((-1) - i12, 1).a());
        }
        return arrayList;
    }

    @Override // U3.k
    public int l() {
        return this.f128028c.length;
    }

    public j(List<d> list) {
        this.f128026a = Collections.unmodifiableList(new ArrayList(list));
        this.f128027b = new long[list.size() * 2];
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = list.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f128027b;
            jArr[i11] = dVar.f127997b;
            jArr[i11 + 1] = dVar.f127998c;
        }
        long[] jArr2 = this.f128027b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f128028c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }
}
