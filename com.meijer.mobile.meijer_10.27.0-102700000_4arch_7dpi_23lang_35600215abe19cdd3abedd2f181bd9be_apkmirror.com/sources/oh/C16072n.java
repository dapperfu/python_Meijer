package oh;

import F.k0;
import com.google.maps.android.BuildConfig;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* renamed from: oh.n, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C16072n {

    /* renamed from: a, reason: collision with root package name */
    private b f153770a = new b();

    /* renamed from: oh.n$a */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        long f153771a;

        /* renamed from: b, reason: collision with root package name */
        final LDValue f153772b;

        void a() {
            this.f153771a++;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f153771a == aVar.f153771a && Objects.equals(this.f153772b, aVar.f153772b)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return "(" + this.f153771a + "," + this.f153772b + ")";
        }

        a(long j10, LDValue lDValue) {
            this.f153771a = j10;
            this.f153772b = lDValue;
        }
    }

    /* renamed from: oh.n$b */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Map<String, c> f153773a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        long f153774b;

        /* renamed from: c, reason: collision with root package name */
        long f153775c;

        public int hashCode() {
            return 0;
        }

        void a(String str, int i10, int i11, LDValue lDValue, LDValue lDValue2, LDContext lDContext) {
            c cVar = this.f153773a.get(str);
            if (cVar == null) {
                cVar = new c(lDValue2, new d(), new HashSet());
                this.f153773a.put(str, cVar);
            }
            for (int i12 = 0; i12 < lDContext.m(); i12++) {
                cVar.f153778c.add(lDContext.k(i12).o().toString());
            }
            d<a> dVarA = cVar.f153777b.a(i10);
            if (dVarA == null) {
                dVarA = new d<>();
                cVar.f153777b.c(i10, dVarA);
            }
            a aVarA = dVarA.a(i11);
            if (aVarA == null) {
                dVarA.c(i11, new a(1L, lDValue));
            } else {
                aVarA.a();
            }
        }

        boolean b() {
            return this.f153773a.isEmpty();
        }

        void c(long j10) {
            long j11 = this.f153774b;
            if (j11 == 0 || j10 < j11) {
                this.f153774b = j10;
            }
            if (j10 > this.f153775c) {
                this.f153775c = j10;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (bVar.f153773a.equals(this.f153773a) && this.f153774b == bVar.f153774b && this.f153775c == bVar.f153775c) {
                    return true;
                }
            }
            return false;
        }

        b() {
        }
    }

    /* renamed from: oh.n$c */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final LDValue f153776a;

        /* renamed from: b, reason: collision with root package name */
        final d<d<a>> f153777b;

        /* renamed from: c, reason: collision with root package name */
        final Set<String> f153778c;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f153776a.equals(this.f153776a) && cVar.f153777b.equals(this.f153777b) && cVar.f153778c.equals(this.f153778c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f153776a.hashCode() + (this.f153777b.hashCode() * 31);
        }

        public String toString() {
            return "(default=" + this.f153776a + ", counters=" + this.f153777b + ", contextKinds=" + k0.a(",", this.f153778c) + ")";
        }

        c(LDValue lDValue, d<d<a>> dVar, Set<String> set) {
            this.f153776a = lDValue;
            this.f153777b = dVar;
            this.f153778c = set;
        }
    }

    /* renamed from: oh.n$d */
    static final class d<T> {

        /* renamed from: a, reason: collision with root package name */
        private int[] f153779a = new int[4];

        /* renamed from: b, reason: collision with root package name */
        private Object[] f153780b = new Object[4];

        /* renamed from: c, reason: collision with root package name */
        private int f153781c;

        T a(int i10) {
            for (int i11 = 0; i11 < this.f153781c; i11++) {
                if (this.f153779a[i11] == i10) {
                    return (T) this.f153780b[i11];
                }
            }
            return null;
        }

        d<T> c(int i10, T t10) {
            int i11 = 0;
            while (true) {
                int i12 = this.f153781c;
                if (i11 >= i12) {
                    int[] iArr = this.f153779a;
                    if (i12 == iArr.length) {
                        int[] iArr2 = new int[iArr.length * 2];
                        System.arraycopy(iArr, 0, iArr2, 0, i12);
                        Object[] objArr = new Object[this.f153779a.length * 2];
                        System.arraycopy(this.f153780b, 0, objArr, 0, this.f153781c);
                        this.f153779a = iArr2;
                        this.f153780b = objArr;
                    }
                    int[] iArr3 = this.f153779a;
                    int i13 = this.f153781c;
                    iArr3[i13] = i10;
                    this.f153780b[i13] = t10;
                    this.f153781c = i13 + 1;
                    return this;
                }
                if (this.f153779a[i11] == i10) {
                    this.f153780b[i11] = t10;
                    return this;
                }
                i11++;
            }
        }

        int b(int i10) {
            return this.f153779a[i10];
        }

        int d() {
            return this.f153781c;
        }

        T e(int i10) {
            return (T) this.f153780b[i10];
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f153781c == dVar.f153781c) {
                    for (int i10 = 0; i10 < this.f153781c; i10++) {
                        if (!Objects.equals(this.f153780b[i10], dVar.a(this.f153779a[i10]))) {
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
            for (int i10 = 0; i10 < this.f153781c; i10++) {
                sb2.append(this.f153779a[i10]);
                sb2.append("=");
                Object obj = this.f153780b[i10];
                sb2.append(obj == null ? BuildConfig.TRAVIS : obj.toString());
            }
            sb2.append("}");
            return sb2.toString();
        }

        d() {
        }
    }

    void a() {
        this.f153770a = new b();
    }

    b b() {
        b bVar = this.f153770a;
        a();
        return bVar;
    }

    boolean c() {
        return this.f153770a.b();
    }

    void d(b bVar) {
        this.f153770a = bVar;
    }

    void e(long j10, String str, int i10, int i11, LDValue lDValue, LDValue lDValue2, LDContext lDContext) {
        this.f153770a.a(str, i10, i11, lDValue, lDValue2, lDContext);
        this.f153770a.c(j10);
    }

    C16072n() {
    }
}
