package ph;

import F.k0;
import com.google.maps.android.BuildConfig;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: ph.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C16437n {

    /* renamed from: a, reason: collision with root package name */
    private b f156530a = new b();

    /* renamed from: ph.n$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        long f156531a;

        /* renamed from: b, reason: collision with root package name */
        final LDValue f156532b;

        void a() {
            this.f156531a++;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f156531a == aVar.f156531a && Objects.equals(this.f156532b, aVar.f156532b)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return "(" + this.f156531a + "," + this.f156532b + ")";
        }

        a(long j10, LDValue lDValue) {
            this.f156531a = j10;
            this.f156532b = lDValue;
        }
    }

    /* renamed from: ph.n$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Map<String, c> f156533a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        long f156534b;

        /* renamed from: c, reason: collision with root package name */
        long f156535c;

        public int hashCode() {
            return 0;
        }

        void a(String str, int i10, int i11, LDValue lDValue, LDValue lDValue2, LDContext lDContext) {
            c cVar = this.f156533a.get(str);
            if (cVar == null) {
                cVar = new c(lDValue2, new d(), new HashSet());
                this.f156533a.put(str, cVar);
            }
            for (int i12 = 0; i12 < lDContext.m(); i12++) {
                cVar.f156538c.add(lDContext.k(i12).o().toString());
            }
            d<a> dVarA = cVar.f156537b.a(i10);
            if (dVarA == null) {
                dVarA = new d<>();
                cVar.f156537b.c(i10, dVarA);
            }
            a aVarA = dVarA.a(i11);
            if (aVarA == null) {
                dVarA.c(i11, new a(1L, lDValue));
            } else {
                aVarA.a();
            }
        }

        boolean b() {
            return this.f156533a.isEmpty();
        }

        void c(long j10) {
            long j11 = this.f156534b;
            if (j11 == 0 || j10 < j11) {
                this.f156534b = j10;
            }
            if (j10 > this.f156535c) {
                this.f156535c = j10;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f156533a.equals(this.f156533a) && this.f156534b == bVar.f156534b && this.f156535c == bVar.f156535c) {
                    return true;
                }
            }
            return false;
        }

        b() {
        }
    }

    /* renamed from: ph.n$c */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final LDValue f156536a;

        /* renamed from: b, reason: collision with root package name */
        final d<d<a>> f156537b;

        /* renamed from: c, reason: collision with root package name */
        final Set<String> f156538c;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f156536a.equals(this.f156536a) && cVar.f156537b.equals(this.f156537b) && cVar.f156538c.equals(this.f156538c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f156536a.hashCode() + (this.f156537b.hashCode() * 31);
        }

        public String toString() {
            return "(default=" + this.f156536a + ", counters=" + this.f156537b + ", contextKinds=" + k0.a(",", this.f156538c) + ")";
        }

        c(LDValue lDValue, d<d<a>> dVar, Set<String> set) {
            this.f156536a = lDValue;
            this.f156537b = dVar;
            this.f156538c = set;
        }
    }

    /* renamed from: ph.n$d */
    static final class d<T> {

        /* renamed from: a, reason: collision with root package name */
        private int[] f156539a = new int[4];

        /* renamed from: b, reason: collision with root package name */
        private Object[] f156540b = new Object[4];

        /* renamed from: c, reason: collision with root package name */
        private int f156541c;

        T a(int i10) {
            for (int i11 = 0; i11 < this.f156541c; i11++) {
                if (this.f156539a[i11] == i10) {
                    return (T) this.f156540b[i11];
                }
            }
            return null;
        }

        d<T> c(int i10, T t10) {
            int i11 = 0;
            while (true) {
                int i12 = this.f156541c;
                if (i11 >= i12) {
                    int[] iArr = this.f156539a;
                    if (i12 == iArr.length) {
                        int[] iArr2 = new int[iArr.length * 2];
                        System.arraycopy(iArr, 0, iArr2, 0, i12);
                        Object[] objArr = new Object[this.f156539a.length * 2];
                        System.arraycopy(this.f156540b, 0, objArr, 0, this.f156541c);
                        this.f156539a = iArr2;
                        this.f156540b = objArr;
                    }
                    int[] iArr3 = this.f156539a;
                    int i13 = this.f156541c;
                    iArr3[i13] = i10;
                    this.f156540b[i13] = t10;
                    this.f156541c = i13 + 1;
                    return this;
                }
                if (this.f156539a[i11] == i10) {
                    this.f156540b[i11] = t10;
                    return this;
                }
                i11++;
            }
        }

        int b(int i10) {
            return this.f156539a[i10];
        }

        int d() {
            return this.f156541c;
        }

        T e(int i10) {
            return (T) this.f156540b[i10];
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f156541c == dVar.f156541c) {
                    for (int i10 = 0; i10 < this.f156541c; i10++) {
                        if (!Objects.equals(this.f156540b[i10], dVar.a(this.f156539a[i10]))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("{");
            for (int i10 = 0; i10 < this.f156541c; i10++) {
                sb2.append(this.f156539a[i10]);
                sb2.append("=");
                Object obj = this.f156540b[i10];
                sb2.append(obj == null ? BuildConfig.TRAVIS : obj.toString());
            }
            sb2.append("}");
            return sb2.toString();
        }

        d() {
        }
    }

    void a() {
        this.f156530a = new b();
    }

    b b() {
        b bVar = this.f156530a;
        a();
        return bVar;
    }

    boolean c() {
        return this.f156530a.b();
    }

    void d(b bVar) {
        this.f156530a = bVar;
    }

    void e(long j10, String str, int i10, int i11, LDValue lDValue, LDValue lDValue2, LDContext lDContext) {
        this.f156530a.a(str, i10, i11, lDValue, lDValue2, lDContext);
        this.f156530a.c(j10);
    }

    C16437n() {
    }
}
