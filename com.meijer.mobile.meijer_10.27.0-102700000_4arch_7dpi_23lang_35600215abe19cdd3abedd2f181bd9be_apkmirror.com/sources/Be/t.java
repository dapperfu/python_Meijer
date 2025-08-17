package Be;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final Be.d f2214a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f2215b;

    /* renamed from: c, reason: collision with root package name */
    private final d f2216c;

    /* renamed from: d, reason: collision with root package name */
    private final int f2217d;

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Be.d f2218a;

        /* renamed from: Be.t$a$a, reason: collision with other inner class name */
        class C0046a extends c {
            C0046a(t tVar, CharSequence charSequence) {
                super(tVar, charSequence);
            }

            @Override // Be.t.c
            int f(int i10) {
                return i10 + 1;
            }

            @Override // Be.t.c
            int g(int i10) {
                return a.this.f2218a.e(this.f2222c, i10);
            }
        }

        a(Be.d dVar) {
            this.f2218a = dVar;
        }

        @Override // Be.t.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(t tVar, CharSequence charSequence) {
            return new C0046a(tVar, charSequence);
        }
    }

    class b implements Iterable<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f2220a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f2221b;

        b(t tVar, CharSequence charSequence) {
            this.f2220a = charSequence;
            this.f2221b = tVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f2221b.i(this.f2220a);
        }

        public String toString() {
            i iVarH = i.h(", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            StringBuilder sbC = iVarH.c(sb2, this);
            sbC.append(']');
            return sbC.toString();
        }
    }

    private static abstract class c extends AbstractC2956b<String> {

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f2222c;

        /* renamed from: d, reason: collision with root package name */
        final Be.d f2223d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f2224e;

        /* renamed from: f, reason: collision with root package name */
        int f2225f = 0;

        /* renamed from: g, reason: collision with root package name */
        int f2226g;

        abstract int f(int i10);

        abstract int g(int i10);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Be.AbstractC2956b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String a() {
            int iG;
            int i10 = this.f2225f;
            while (true) {
                int i11 = this.f2225f;
                if (i11 == -1) {
                    return c();
                }
                iG = g(i11);
                if (iG == -1) {
                    iG = this.f2222c.length();
                    this.f2225f = -1;
                } else {
                    this.f2225f = f(iG);
                }
                int i12 = this.f2225f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f2225f = i13;
                    if (i13 > this.f2222c.length()) {
                        this.f2225f = -1;
                    }
                } else {
                    while (i10 < iG && this.f2223d.g(this.f2222c.charAt(i10))) {
                        i10++;
                    }
                    while (iG > i10 && this.f2223d.g(this.f2222c.charAt(iG - 1))) {
                        iG--;
                    }
                    if (!this.f2224e || i10 != iG) {
                        break;
                    }
                    i10 = this.f2225f;
                }
            }
            int i14 = this.f2226g;
            if (i14 == 1) {
                iG = this.f2222c.length();
                this.f2225f = -1;
                while (iG > i10 && this.f2223d.g(this.f2222c.charAt(iG - 1))) {
                    iG--;
                }
            } else {
                this.f2226g = i14 - 1;
            }
            return this.f2222c.subSequence(i10, iG).toString();
        }

        protected c(t tVar, CharSequence charSequence) {
            this.f2223d = tVar.f2214a;
            this.f2224e = tVar.f2215b;
            this.f2226g = tVar.f2217d;
            this.f2222c = charSequence;
        }
    }

    private interface d {
        Iterator<String> a(t tVar, CharSequence charSequence);
    }

    private t(d dVar) {
        this(dVar, false, Be.d.i(), a.e.API_PRIORITY_OTHER);
    }

    private t(d dVar, boolean z10, Be.d dVar2, int i10) {
        this.f2216c = dVar;
        this.f2215b = z10;
        this.f2214a = dVar2;
        this.f2217d = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> i(CharSequence charSequence) {
        return this.f2216c.a(this, charSequence);
    }

    public static t e(char c10) {
        return f(Be.d.f(c10));
    }

    public static t f(Be.d dVar) {
        p.q(dVar);
        return new t(new a(dVar));
    }

    public Iterable<String> g(CharSequence charSequence) {
        p.q(charSequence);
        return new b(this, charSequence);
    }

    public List<String> h(CharSequence charSequence) {
        p.q(charSequence);
        Iterator<String> itI = i(charSequence);
        ArrayList arrayList = new ArrayList();
        while (itI.hasNext()) {
            arrayList.add(itI.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public t j() {
        return k(Be.d.k());
    }

    public t k(Be.d dVar) {
        p.q(dVar);
        return new t(this.f2216c, this.f2215b, dVar, this.f2217d);
    }
}
