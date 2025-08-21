package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<d> f58367a = new a();

    class a implements Comparator<d> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d dVar, d dVar2) {
            return dVar.f58370a - dVar2.f58370a;
        }

        a() {
        }
    }

    public static abstract class b {
        public abstract boolean a(int i10, int i11);

        public abstract boolean b(int i10, int i11);

        public Object c(int i10, int i11) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    static class c {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f58368a;

        /* renamed from: b, reason: collision with root package name */
        private final int f58369b;

        int[] a() {
            return this.f58368a;
        }

        int b(int i10) {
            return this.f58368a[i10 + this.f58369b];
        }

        void c(int i10, int i11) {
            this.f58368a[i10 + this.f58369b] = i11;
        }

        c(int i10) {
            int[] iArr = new int[i10];
            this.f58368a = iArr;
            this.f58369b = iArr.length / 2;
        }
    }

    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f58370a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58371b;

        /* renamed from: c, reason: collision with root package name */
        public final int f58372c;

        int a() {
            return this.f58370a + this.f58372c;
        }

        int b() {
            return this.f58371b + this.f58372c;
        }

        d(int i10, int i11, int i12) {
            this.f58370a = i10;
            this.f58371b = i11;
            this.f58372c = i12;
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        private final List<d> f58373a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f58374b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f58375c;

        /* renamed from: d, reason: collision with root package name */
        private final b f58376d;

        /* renamed from: e, reason: collision with root package name */
        private final int f58377e;

        /* renamed from: f, reason: collision with root package name */
        private final int f58378f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f58379g;

        private void a() {
            d dVar = this.f58373a.isEmpty() ? null : this.f58373a.get(0);
            if (dVar == null || dVar.f58370a != 0 || dVar.f58371b != 0) {
                this.f58373a.add(0, new d(0, 0, 0));
            }
            this.f58373a.add(new d(this.f58377e, this.f58378f, 0));
        }

        private void d(int i10) {
            int size = this.f58373a.size();
            int iB = 0;
            for (int i11 = 0; i11 < size; i11++) {
                d dVar = this.f58373a.get(i11);
                while (iB < dVar.f58371b) {
                    if (this.f58375c[iB] == 0 && this.f58376d.b(i10, iB)) {
                        int i12 = this.f58376d.a(i10, iB) ? 8 : 4;
                        this.f58374b[i10] = (iB << 4) | i12;
                        this.f58375c[iB] = (i10 << 4) | i12;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        private void e() {
            for (d dVar : this.f58373a) {
                for (int i10 = 0; i10 < dVar.f58372c; i10++) {
                    int i11 = dVar.f58370a + i10;
                    int i12 = dVar.f58371b + i10;
                    int i13 = this.f58376d.a(i11, i12) ? 1 : 2;
                    this.f58374b[i11] = (i12 << 4) | i13;
                    this.f58375c[i12] = (i11 << 4) | i13;
                }
            }
            if (this.f58379g) {
                f();
            }
        }

        private void f() {
            int iA = 0;
            for (d dVar : this.f58373a) {
                while (iA < dVar.f58370a) {
                    if (this.f58374b[iA] == 0) {
                        d(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }

        public void b(r rVar) {
            int i10;
            androidx.recyclerview.widget.e eVar = rVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) rVar : new androidx.recyclerview.widget.e(rVar);
            int i11 = this.f58377e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i12 = this.f58377e;
            int i13 = this.f58378f;
            for (int size = this.f58373a.size() - 1; size >= 0; size--) {
                d dVar = this.f58373a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i12 <= iA) {
                        break;
                    }
                    i12--;
                    int i14 = this.f58374b[i12];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g gVarG = g(arrayDeque, i15, false);
                        if (gVarG != null) {
                            int i16 = (i11 - gVarG.f58381b) - 1;
                            eVar.d(i12, i16);
                            if ((i14 & 4) != 0) {
                                eVar.c(i16, 1, this.f58376d.c(i12, i15));
                            }
                        } else {
                            arrayDeque.add(new g(i12, (i11 - i12) - 1, true));
                        }
                    } else {
                        eVar.b(i12, 1);
                        i11--;
                    }
                }
                while (i13 > iB) {
                    i13--;
                    int i17 = this.f58375c[i13];
                    if ((i17 & 12) != 0) {
                        int i18 = i17 >> 4;
                        g gVarG2 = g(arrayDeque, i18, true);
                        if (gVarG2 == null) {
                            arrayDeque.add(new g(i13, i11 - i12, false));
                        } else {
                            eVar.d((i11 - gVarG2.f58381b) - 1, i12);
                            if ((i17 & 4) != 0) {
                                eVar.c(i12, 1, this.f58376d.c(i18, i13));
                            }
                        }
                    } else {
                        eVar.a(i12, 1);
                        i11++;
                    }
                }
                int i19 = dVar.f58370a;
                int i20 = dVar.f58371b;
                for (i10 = 0; i10 < dVar.f58372c; i10++) {
                    if ((this.f58374b[i19] & 15) == 2) {
                        eVar.c(i19, 1, this.f58376d.c(i19, i20));
                    }
                    i19++;
                    i20++;
                }
                i12 = dVar.f58370a;
                i13 = dVar.f58371b;
            }
            eVar.e();
        }

        public void c(RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z10) {
            this.f58373a = list;
            this.f58374b = iArr;
            this.f58375c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f58376d = bVar;
            this.f58377e = bVar.e();
            this.f58378f = bVar.d();
            this.f58379g = z10;
            a();
            e();
        }

        private static g g(Collection<g> collection, int i10, boolean z10) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.f58380a == i10 && next.f58382c == z10) {
                        it.remove();
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z10) {
                    next2.f58381b--;
                } else {
                    next2.f58381b++;
                }
            }
            return next;
        }
    }

    public static abstract class f<T> {
        public abstract boolean areContentsTheSame(T t10, T t11);

        public abstract boolean areItemsTheSame(T t10, T t11);

        public Object getChangePayload(T t10, T t11) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.h$h, reason: collision with other inner class name */
    static class C1151h {

        /* renamed from: a, reason: collision with root package name */
        int f58383a;

        /* renamed from: b, reason: collision with root package name */
        int f58384b;

        /* renamed from: c, reason: collision with root package name */
        int f58385c;

        /* renamed from: d, reason: collision with root package name */
        int f58386d;

        public C1151h() {
        }

        public C1151h(int i10, int i11, int i12, int i13) {
            this.f58383a = i10;
            this.f58384b = i11;
            this.f58385c = i12;
            this.f58386d = i13;
        }

        int a() {
            return this.f58386d - this.f58385c;
        }

        int b() {
            return this.f58384b - this.f58383a;
        }
    }

    static class i {

        /* renamed from: a, reason: collision with root package name */
        public int f58387a;

        /* renamed from: b, reason: collision with root package name */
        public int f58388b;

        /* renamed from: c, reason: collision with root package name */
        public int f58389c;

        /* renamed from: d, reason: collision with root package name */
        public int f58390d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f58391e;

        int a() {
            return Math.min(this.f58389c - this.f58387a, this.f58390d - this.f58388b);
        }

        boolean b() {
            return this.f58390d - this.f58388b != this.f58389c - this.f58387a;
        }

        boolean c() {
            return this.f58390d - this.f58388b > this.f58389c - this.f58387a;
        }

        i() {
        }

        d d() {
            if (b()) {
                if (this.f58391e) {
                    return new d(this.f58387a, this.f58388b, a());
                }
                if (c()) {
                    return new d(this.f58387a, this.f58388b + 1, a());
                }
                return new d(this.f58387a + 1, this.f58388b, a());
            }
            int i10 = this.f58387a;
            return new d(i10, this.f58388b, this.f58389c - i10);
        }
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    private static class g {

        /* renamed from: a, reason: collision with root package name */
        int f58380a;

        /* renamed from: b, reason: collision with root package name */
        int f58381b;

        /* renamed from: c, reason: collision with root package name */
        boolean f58382c;

        g(int i10, int i11, boolean z10) {
            this.f58380a = i10;
            this.f58381b = i11;
            this.f58382c = z10;
        }
    }

    private static i a(C1151h c1151h, b bVar, c cVar, c cVar2, int i10) {
        boolean z10;
        int iB;
        int i11;
        int i12;
        int i13;
        if ((c1151h.b() - c1151h.a()) % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int iB2 = c1151h.b() - c1151h.a();
        int i14 = -i10;
        for (int i15 = i14; i15 <= i10; i15 += 2) {
            if (i15 != i14 && (i15 == i10 || cVar2.b(i15 + 1) >= cVar2.b(i15 - 1))) {
                iB = cVar2.b(i15 - 1);
                i11 = iB - 1;
            } else {
                iB = cVar2.b(i15 + 1);
                i11 = iB;
            }
            int i16 = c1151h.f58386d - ((c1151h.f58384b - i11) - i15);
            if (i10 != 0 && i11 == iB) {
                i12 = i16 + 1;
            } else {
                i12 = i16;
            }
            while (i11 > c1151h.f58383a && i16 > c1151h.f58385c && bVar.b(i11 - 1, i16 - 1)) {
                i11--;
                i16--;
            }
            cVar2.c(i15, i11);
            if (z10 && (i13 = iB2 - i15) >= i14 && i13 <= i10 && cVar.b(i13) >= i11) {
                i iVar = new i();
                iVar.f58387a = i11;
                iVar.f58388b = i16;
                iVar.f58389c = iB;
                iVar.f58390d = i12;
                iVar.f58391e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e c(b bVar, boolean z10) {
        C1151h c1151h;
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1151h(0, iE, 0, iD));
        int i10 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i10);
        c cVar2 = new c(i10);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1151h c1151h2 = (C1151h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(c1151h2, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                if (arrayList3.isEmpty()) {
                    c1151h = new C1151h();
                } else {
                    c1151h = (C1151h) arrayList3.remove(arrayList3.size() - 1);
                }
                c1151h.f58383a = c1151h2.f58383a;
                c1151h.f58385c = c1151h2.f58385c;
                c1151h.f58384b = iVarE.f58387a;
                c1151h.f58386d = iVarE.f58388b;
                arrayList2.add(c1151h);
                c1151h2.f58384b = c1151h2.f58384b;
                c1151h2.f58386d = c1151h2.f58386d;
                c1151h2.f58383a = iVarE.f58389c;
                c1151h2.f58385c = iVarE.f58390d;
                arrayList2.add(c1151h2);
            } else {
                arrayList3.add(c1151h2);
            }
        }
        Collections.sort(arrayList, f58367a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z10);
    }

    private static i d(C1151h c1151h, b bVar, c cVar, c cVar2, int i10) {
        int iB;
        int i11;
        int i12;
        boolean z10 = true;
        if (Math.abs(c1151h.b() - c1151h.a()) % 2 != 1) {
            z10 = false;
        }
        int iB2 = c1151h.b() - c1151h.a();
        int i13 = -i10;
        for (int i14 = i13; i14 <= i10; i14 += 2) {
            if (i14 != i13 && (i14 == i10 || cVar.b(i14 + 1) <= cVar.b(i14 - 1))) {
                iB = cVar.b(i14 - 1);
                i11 = iB + 1;
            } else {
                iB = cVar.b(i14 + 1);
                i11 = iB;
            }
            int i15 = (c1151h.f58385c + (i11 - c1151h.f58383a)) - i14;
            int i16 = (i10 != 0 && i11 == iB) ? i15 - 1 : i15;
            while (i11 < c1151h.f58384b && i15 < c1151h.f58386d && bVar.b(i11, i15)) {
                i11++;
                i15++;
            }
            cVar.c(i14, i11);
            if (z10 && (i12 = iB2 - i14) >= i13 + 1 && i12 <= i10 - 1 && cVar2.b(i12) <= i11) {
                i iVar = new i();
                iVar.f58387a = iB;
                iVar.f58388b = i16;
                iVar.f58389c = i11;
                iVar.f58390d = i15;
                iVar.f58391e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C1151h c1151h, b bVar, c cVar, c cVar2) {
        if (c1151h.b() >= 1 && c1151h.a() >= 1) {
            int iB = ((c1151h.b() + c1151h.a()) + 1) / 2;
            cVar.c(1, c1151h.f58383a);
            cVar2.c(1, c1151h.f58384b);
            for (int i10 = 0; i10 < iB; i10++) {
                i iVarD = d(c1151h, bVar, cVar, cVar2, i10);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(c1151h, bVar, cVar, cVar2, i10);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
