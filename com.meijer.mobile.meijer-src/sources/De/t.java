package De;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private final De.d f6159a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6160b;

    /* renamed from: c, reason: collision with root package name */
    private final d f6161c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6162d;

    class a implements d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ De.d f6163a;

        /* renamed from: De.t$a$a, reason: collision with other inner class name */
        class C0115a extends c {
            C0115a(t tVar, CharSequence charSequence) {
                super(tVar, charSequence);
            }

            @Override // De.t.c
            int f(int i10) {
                return i10 + 1;
            }

            @Override // De.t.c
            int g(int i10) {
                return a.this.f6163a.e(this.f6167c, i10);
            }
        }

        a(De.d dVar) {
            this.f6163a = dVar;
        }

        @Override // De.t.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(t tVar, CharSequence charSequence) {
            return new C0115a(tVar, charSequence);
        }
    }

    class b implements Iterable<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CharSequence f6165a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f6166b;

        b(t tVar, CharSequence charSequence) {
            this.f6165a = charSequence;
            this.f6166b = tVar;
        }

        @Override // java.lang.Iterable
        public Iterator<String> iterator() {
            return this.f6166b.i(this.f6165a);
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

    private static abstract class c extends AbstractC3105b<String> {

        /* renamed from: c, reason: collision with root package name */
        final CharSequence f6167c;

        /* renamed from: d, reason: collision with root package name */
        final De.d f6168d;

        /* renamed from: e, reason: collision with root package name */
        final boolean f6169e;

        /* renamed from: f, reason: collision with root package name */
        int f6170f = 0;

        /* renamed from: g, reason: collision with root package name */
        int f6171g;

        abstract int f(int i10);

        abstract int g(int i10);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // De.AbstractC3105b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public String a() {
            int iG;
            int i10 = this.f6170f;
            while (true) {
                int i11 = this.f6170f;
                if (i11 == -1) {
                    return c();
                }
                iG = g(i11);
                if (iG == -1) {
                    iG = this.f6167c.length();
                    this.f6170f = -1;
                } else {
                    this.f6170f = f(iG);
                }
                int i12 = this.f6170f;
                if (i12 == i10) {
                    int i13 = i12 + 1;
                    this.f6170f = i13;
                    if (i13 > this.f6167c.length()) {
                        this.f6170f = -1;
                    }
                } else {
                    while (i10 < iG && this.f6168d.g(this.f6167c.charAt(i10))) {
                        i10++;
                    }
                    while (iG > i10 && this.f6168d.g(this.f6167c.charAt(iG - 1))) {
                        iG--;
                    }
                    if (!this.f6169e || i10 != iG) {
                        break;
                    }
                    i10 = this.f6170f;
                }
            }
            int i14 = this.f6171g;
            if (i14 == 1) {
                iG = this.f6167c.length();
                this.f6170f = -1;
                while (iG > i10 && this.f6168d.g(this.f6167c.charAt(iG - 1))) {
                    iG--;
                }
            } else {
                this.f6171g = i14 - 1;
            }
            return this.f6167c.subSequence(i10, iG).toString();
        }

        protected c(t tVar, CharSequence charSequence) {
            this.f6168d = tVar.f6159a;
            this.f6169e = tVar.f6160b;
            this.f6171g = tVar.f6162d;
            this.f6167c = charSequence;
        }
    }

    private interface d {
        Iterator<String> a(t tVar, CharSequence charSequence);
    }

    private t(d dVar) {
        this(dVar, false, De.d.i(), a.e.API_PRIORITY_OTHER);
    }

    private t(d dVar, boolean z10, De.d dVar2, int i10) {
        this.f6161c = dVar;
        this.f6160b = z10;
        this.f6159a = dVar2;
        this.f6162d = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Iterator<String> i(CharSequence charSequence) {
        return this.f6161c.a(this, charSequence);
    }

    public static t e(char c10) {
        return f(De.d.f(c10));
    }

    public static t f(De.d dVar) {
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
        return k(De.d.k());
    }

    public t k(De.d dVar) {
        p.q(dVar);
        return new t(this.f6161c, this.f6160b, dVar, this.f6162d);
    }
}
