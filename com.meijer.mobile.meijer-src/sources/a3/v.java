package a3;

import Ee.L;
import android.net.Uri;
import android.os.Bundle;
import d3.C13599a;
import d3.P;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: i, reason: collision with root package name */
    public static final v f44822i = new c().a();

    /* renamed from: j, reason: collision with root package name */
    private static final String f44823j = P.y0(0);

    /* renamed from: k, reason: collision with root package name */
    private static final String f44824k = P.y0(1);

    /* renamed from: l, reason: collision with root package name */
    private static final String f44825l = P.y0(2);

    /* renamed from: m, reason: collision with root package name */
    private static final String f44826m = P.y0(3);

    /* renamed from: n, reason: collision with root package name */
    private static final String f44827n = P.y0(4);

    /* renamed from: o, reason: collision with root package name */
    private static final String f44828o = P.y0(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f44829a;

    /* renamed from: b, reason: collision with root package name */
    public final h f44830b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final h f44831c;

    /* renamed from: d, reason: collision with root package name */
    public final g f44832d;

    /* renamed from: e, reason: collision with root package name */
    public final x f44833e;

    /* renamed from: f, reason: collision with root package name */
    public final d f44834f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public final e f44835g;

    /* renamed from: h, reason: collision with root package name */
    public final i f44836h;

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final String f44837c = P.y0(0);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44838a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f44839b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f44840a;

            /* renamed from: b, reason: collision with root package name */
            private Object f44841b;

            public b c() {
                return new b(this);
            }

            public a(Uri uri) {
                this.f44840a = uri;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f44838a.equals(bVar.f44838a) && Objects.equals(this.f44839b, bVar.f44839b);
        }

        private b(a aVar) {
            this.f44838a = aVar.f44840a;
            this.f44839b = aVar.f44841b;
        }

        public int hashCode() {
            int iHashCode = this.f44838a.hashCode() * 31;
            Object obj = this.f44839b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f44842a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f44843b;

        /* renamed from: c, reason: collision with root package name */
        private String f44844c;

        /* renamed from: d, reason: collision with root package name */
        private d.a f44845d;

        /* renamed from: e, reason: collision with root package name */
        private f.a f44846e;

        /* renamed from: f, reason: collision with root package name */
        private List<Object> f44847f;

        /* renamed from: g, reason: collision with root package name */
        private String f44848g;

        /* renamed from: h, reason: collision with root package name */
        private Ee.L<k> f44849h;

        /* renamed from: i, reason: collision with root package name */
        private b f44850i;

        /* renamed from: j, reason: collision with root package name */
        private Object f44851j;

        /* renamed from: k, reason: collision with root package name */
        private long f44852k;

        /* renamed from: l, reason: collision with root package name */
        private x f44853l;

        /* renamed from: m, reason: collision with root package name */
        private g.a f44854m;

        /* renamed from: n, reason: collision with root package name */
        private i f44855n;

        public c() {
            this.f44845d = new d.a();
            this.f44846e = new f.a();
            this.f44847f = Collections.EMPTY_LIST;
            this.f44849h = Ee.L.x();
            this.f44854m = new g.a();
            this.f44855n = i.f44938d;
            this.f44852k = -9223372036854775807L;
        }

        public v a() {
            h hVar;
            C13599a.g(this.f44846e.f44897b == null || this.f44846e.f44896a != null);
            Uri uri = this.f44843b;
            if (uri != null) {
                hVar = new h(uri, this.f44844c, this.f44846e.f44896a != null ? this.f44846e.i() : null, this.f44850i, this.f44847f, this.f44848g, this.f44849h, this.f44851j, this.f44852k);
            } else {
                hVar = null;
            }
            String str = this.f44842a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f44845d.g();
            g gVarF = this.f44854m.f();
            x xVar = this.f44853l;
            if (xVar == null) {
                xVar = x.f44971I;
            }
            return new v(str2, eVarG, hVar, gVarF, xVar, this.f44855n);
        }

        public c b(b bVar) {
            this.f44850i = bVar;
            return this;
        }

        public c c(f fVar) {
            this.f44846e = fVar != null ? fVar.b() : new f.a();
            return this;
        }

        public c f(String str) {
            this.f44844c = str;
            return this;
        }

        public c h(Object obj) {
            this.f44851j = obj;
            return this;
        }

        public c i(Uri uri) {
            this.f44843b = uri;
            return this;
        }

        public c j(String str) {
            return i(str == null ? null : Uri.parse(str));
        }

        public c d(g gVar) {
            this.f44854m = gVar.a();
            return this;
        }

        public c e(String str) {
            this.f44842a = (String) C13599a.e(str);
            return this;
        }

        public c g(List<k> list) {
            this.f44849h = Ee.L.s(list);
            return this;
        }

        private c(v vVar) {
            f.a aVar;
            this();
            this.f44845d = vVar.f44834f.a();
            this.f44842a = vVar.f44829a;
            this.f44853l = vVar.f44833e;
            this.f44854m = vVar.f44832d.a();
            this.f44855n = vVar.f44836h;
            h hVar = vVar.f44830b;
            if (hVar != null) {
                this.f44848g = hVar.f44933f;
                this.f44844c = hVar.f44929b;
                this.f44843b = hVar.f44928a;
                this.f44847f = hVar.f44932e;
                this.f44849h = hVar.f44934g;
                this.f44851j = hVar.f44936i;
                f fVar = hVar.f44930c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f44846e = aVar;
                this.f44850i = hVar.f44931d;
                this.f44852k = hVar.f44937j;
            }
        }
    }

    public static class d {

        /* renamed from: h, reason: collision with root package name */
        public static final d f44856h = new a().f();

        /* renamed from: i, reason: collision with root package name */
        private static final String f44857i = P.y0(0);

        /* renamed from: j, reason: collision with root package name */
        private static final String f44858j = P.y0(1);

        /* renamed from: k, reason: collision with root package name */
        private static final String f44859k = P.y0(2);

        /* renamed from: l, reason: collision with root package name */
        private static final String f44860l = P.y0(3);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44861m = P.y0(4);

        /* renamed from: n, reason: collision with root package name */
        static final String f44862n = P.y0(5);

        /* renamed from: o, reason: collision with root package name */
        static final String f44863o = P.y0(6);

        /* renamed from: a, reason: collision with root package name */
        public final long f44864a;

        /* renamed from: b, reason: collision with root package name */
        public final long f44865b;

        /* renamed from: c, reason: collision with root package name */
        public final long f44866c;

        /* renamed from: d, reason: collision with root package name */
        public final long f44867d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f44868e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f44869f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f44870g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f44871a;

            /* renamed from: b, reason: collision with root package name */
            private long f44872b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f44873c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f44874d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f44875e;

            public a() {
                this.f44872b = Long.MIN_VALUE;
            }

            public d f() {
                return new d(this);
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            private a(d dVar) {
                this.f44871a = dVar.f44865b;
                this.f44872b = dVar.f44867d;
                this.f44873c = dVar.f44868e;
                this.f44874d = dVar.f44869f;
                this.f44875e = dVar.f44870g;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f44865b == dVar.f44865b && this.f44867d == dVar.f44867d && this.f44868e == dVar.f44868e && this.f44869f == dVar.f44869f && this.f44870g == dVar.f44870g;
        }

        private d(a aVar) {
            this.f44864a = P.j1(aVar.f44871a);
            this.f44866c = P.j1(aVar.f44872b);
            this.f44865b = aVar.f44871a;
            this.f44867d = aVar.f44872b;
            this.f44868e = aVar.f44873c;
            this.f44869f = aVar.f44874d;
            this.f44870g = aVar.f44875e;
        }

        public a a() {
            return new a();
        }

        public int hashCode() {
            long j10 = this.f44865b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f44867d;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f44868e ? 1 : 0)) * 31) + (this.f44869f ? 1 : 0)) * 31) + (this.f44870g ? 1 : 0);
        }
    }

    @Deprecated
    public static final class e extends d {

        /* renamed from: p, reason: collision with root package name */
        public static final e f44876p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* renamed from: l, reason: collision with root package name */
        private static final String f44877l = P.y0(0);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44878m = P.y0(1);

        /* renamed from: n, reason: collision with root package name */
        private static final String f44879n = P.y0(2);

        /* renamed from: o, reason: collision with root package name */
        private static final String f44880o = P.y0(3);

        /* renamed from: p, reason: collision with root package name */
        static final String f44881p = P.y0(4);

        /* renamed from: q, reason: collision with root package name */
        private static final String f44882q = P.y0(5);

        /* renamed from: r, reason: collision with root package name */
        private static final String f44883r = P.y0(6);

        /* renamed from: s, reason: collision with root package name */
        private static final String f44884s = P.y0(7);

        /* renamed from: a, reason: collision with root package name */
        public final UUID f44885a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f44886b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f44887c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Ee.M<String, String> f44888d;

        /* renamed from: e, reason: collision with root package name */
        public final Ee.M<String, String> f44889e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f44890f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f44891g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f44892h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public final Ee.L<Integer> f44893i;

        /* renamed from: j, reason: collision with root package name */
        public final Ee.L<Integer> f44894j;

        /* renamed from: k, reason: collision with root package name */
        private final byte[] f44895k;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private UUID f44896a;

            /* renamed from: b, reason: collision with root package name */
            private Uri f44897b;

            /* renamed from: c, reason: collision with root package name */
            private Ee.M<String, String> f44898c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f44899d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f44900e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f44901f;

            /* renamed from: g, reason: collision with root package name */
            private Ee.L<Integer> f44902g;

            /* renamed from: h, reason: collision with root package name */
            private byte[] f44903h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.f44898c = Ee.M.n();
                this.f44900e = true;
                this.f44902g = Ee.L.x();
            }

            private a(f fVar) {
                this.f44896a = fVar.f44885a;
                this.f44897b = fVar.f44887c;
                this.f44898c = fVar.f44889e;
                this.f44899d = fVar.f44890f;
                this.f44900e = fVar.f44891g;
                this.f44901f = fVar.f44892h;
                this.f44902g = fVar.f44894j;
                this.f44903h = fVar.f44895k;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f44885a.equals(fVar.f44885a) && Objects.equals(this.f44887c, fVar.f44887c) && Objects.equals(this.f44889e, fVar.f44889e) && this.f44890f == fVar.f44890f && this.f44892h == fVar.f44892h && this.f44891g == fVar.f44891g && this.f44894j.equals(fVar.f44894j) && Arrays.equals(this.f44895k, fVar.f44895k);
        }

        private f(a aVar) {
            C13599a.g((aVar.f44901f && aVar.f44897b == null) ? false : true);
            UUID uuid = (UUID) C13599a.e(aVar.f44896a);
            this.f44885a = uuid;
            this.f44886b = uuid;
            this.f44887c = aVar.f44897b;
            this.f44888d = aVar.f44898c;
            this.f44889e = aVar.f44898c;
            this.f44890f = aVar.f44899d;
            this.f44892h = aVar.f44901f;
            this.f44891g = aVar.f44900e;
            this.f44893i = aVar.f44902g;
            this.f44894j = aVar.f44902g;
            this.f44895k = aVar.f44903h != null ? Arrays.copyOf(aVar.f44903h, aVar.f44903h.length) : null;
        }

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f44895k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = this.f44885a.hashCode() * 31;
            Uri uri = this.f44887c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f44889e.hashCode()) * 31) + (this.f44890f ? 1 : 0)) * 31) + (this.f44892h ? 1 : 0)) * 31) + (this.f44891g ? 1 : 0)) * 31) + this.f44894j.hashCode()) * 31) + Arrays.hashCode(this.f44895k);
        }
    }

    public static final class g {

        /* renamed from: f, reason: collision with root package name */
        public static final g f44904f = new a().f();

        /* renamed from: g, reason: collision with root package name */
        private static final String f44905g = P.y0(0);

        /* renamed from: h, reason: collision with root package name */
        private static final String f44906h = P.y0(1);

        /* renamed from: i, reason: collision with root package name */
        private static final String f44907i = P.y0(2);

        /* renamed from: j, reason: collision with root package name */
        private static final String f44908j = P.y0(3);

        /* renamed from: k, reason: collision with root package name */
        private static final String f44909k = P.y0(4);

        /* renamed from: a, reason: collision with root package name */
        public final long f44910a;

        /* renamed from: b, reason: collision with root package name */
        public final long f44911b;

        /* renamed from: c, reason: collision with root package name */
        public final long f44912c;

        /* renamed from: d, reason: collision with root package name */
        public final float f44913d;

        /* renamed from: e, reason: collision with root package name */
        public final float f44914e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f44915a;

            /* renamed from: b, reason: collision with root package name */
            private long f44916b;

            /* renamed from: c, reason: collision with root package name */
            private long f44917c;

            /* renamed from: d, reason: collision with root package name */
            private float f44918d;

            /* renamed from: e, reason: collision with root package name */
            private float f44919e;

            public a() {
                this.f44915a = -9223372036854775807L;
                this.f44916b = -9223372036854775807L;
                this.f44917c = -9223372036854775807L;
                this.f44918d = -3.4028235E38f;
                this.f44919e = -3.4028235E38f;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f44917c = j10;
                return this;
            }

            public a h(float f10) {
                this.f44919e = f10;
                return this;
            }

            public a i(long j10) {
                this.f44916b = j10;
                return this;
            }

            public a j(float f10) {
                this.f44918d = f10;
                return this;
            }

            public a k(long j10) {
                this.f44915a = j10;
                return this;
            }

            private a(g gVar) {
                this.f44915a = gVar.f44910a;
                this.f44916b = gVar.f44911b;
                this.f44917c = gVar.f44912c;
                this.f44918d = gVar.f44913d;
                this.f44919e = gVar.f44914e;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f44910a == gVar.f44910a && this.f44911b == gVar.f44911b && this.f44912c == gVar.f44912c && this.f44913d == gVar.f44913d && this.f44914e == gVar.f44914e;
        }

        private g(a aVar) {
            this(aVar.f44915a, aVar.f44916b, aVar.f44917c, aVar.f44918d, aVar.f44919e);
        }

        public a a() {
            return new a();
        }

        public int hashCode() {
            long j10 = this.f44910a;
            long j11 = this.f44911b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f44912c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f44913d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f44914e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f44910a = j10;
            this.f44911b = j11;
            this.f44912c = j12;
            this.f44913d = f10;
            this.f44914e = f11;
        }
    }

    public static final class h {

        /* renamed from: k, reason: collision with root package name */
        private static final String f44920k = P.y0(0);

        /* renamed from: l, reason: collision with root package name */
        private static final String f44921l = P.y0(1);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44922m = P.y0(2);

        /* renamed from: n, reason: collision with root package name */
        private static final String f44923n = P.y0(3);

        /* renamed from: o, reason: collision with root package name */
        private static final String f44924o = P.y0(4);

        /* renamed from: p, reason: collision with root package name */
        private static final String f44925p = P.y0(5);

        /* renamed from: q, reason: collision with root package name */
        private static final String f44926q = P.y0(6);

        /* renamed from: r, reason: collision with root package name */
        private static final String f44927r = P.y0(7);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44928a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44929b;

        /* renamed from: c, reason: collision with root package name */
        public final f f44930c;

        /* renamed from: d, reason: collision with root package name */
        public final b f44931d;

        /* renamed from: e, reason: collision with root package name */
        public final List<Object> f44932e;

        /* renamed from: f, reason: collision with root package name */
        public final String f44933f;

        /* renamed from: g, reason: collision with root package name */
        public final Ee.L<k> f44934g;

        /* renamed from: h, reason: collision with root package name */
        @Deprecated
        public final List<j> f44935h;

        /* renamed from: i, reason: collision with root package name */
        public final Object f44936i;

        /* renamed from: j, reason: collision with root package name */
        public final long f44937j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f44928a.equals(hVar.f44928a) && Objects.equals(this.f44929b, hVar.f44929b) && Objects.equals(this.f44930c, hVar.f44930c) && Objects.equals(this.f44931d, hVar.f44931d) && this.f44932e.equals(hVar.f44932e) && Objects.equals(this.f44933f, hVar.f44933f) && this.f44934g.equals(hVar.f44934g) && Objects.equals(this.f44936i, hVar.f44936i) && this.f44937j == hVar.f44937j;
        }

        private h(Uri uri, String str, f fVar, b bVar, List<Object> list, String str2, Ee.L<k> l10, Object obj, long j10) {
            this.f44928a = uri;
            this.f44929b = z.r(str);
            this.f44930c = fVar;
            this.f44931d = bVar;
            this.f44932e = list;
            this.f44933f = str2;
            this.f44934g = l10;
            L.a aVarP = Ee.L.p();
            for (int i10 = 0; i10 < l10.size(); i10++) {
                aVarP.a(l10.get(i10).a().i());
            }
            this.f44935h = aVarP.k();
            this.f44936i = obj;
            this.f44937j = j10;
        }

        public int hashCode() {
            int iHashCode = this.f44928a.hashCode() * 31;
            String str = this.f44929b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f44930c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f44931d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f44932e.hashCode()) * 31;
            String str2 = this.f44933f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f44934g.hashCode()) * 31;
            return (int) (((iHashCode5 + (this.f44936i != null ? r1.hashCode() : 0)) * 31) + this.f44937j);
        }
    }

    public static final class i {

        /* renamed from: d, reason: collision with root package name */
        public static final i f44938d = new a().d();

        /* renamed from: e, reason: collision with root package name */
        private static final String f44939e = P.y0(0);

        /* renamed from: f, reason: collision with root package name */
        private static final String f44940f = P.y0(1);

        /* renamed from: g, reason: collision with root package name */
        private static final String f44941g = P.y0(2);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44942a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44943b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f44944c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f44945a;

            /* renamed from: b, reason: collision with root package name */
            private String f44946b;

            /* renamed from: c, reason: collision with root package name */
            private Bundle f44947c;

            public i d() {
                return new i(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            if (Objects.equals(this.f44942a, iVar.f44942a) && Objects.equals(this.f44943b, iVar.f44943b)) {
                if ((this.f44944c == null) == (iVar.f44944c == null)) {
                    return true;
                }
            }
            return false;
        }

        private i(a aVar) {
            this.f44942a = aVar.f44945a;
            this.f44943b = aVar.f44946b;
            this.f44944c = aVar.f44947c;
        }

        public int hashCode() {
            Uri uri = this.f44942a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f44943b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f44944c != null ? 1 : 0);
        }
    }

    @Deprecated
    public static final class j extends k {
        private j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k {

        /* renamed from: h, reason: collision with root package name */
        private static final String f44948h = P.y0(0);

        /* renamed from: i, reason: collision with root package name */
        private static final String f44949i = P.y0(1);

        /* renamed from: j, reason: collision with root package name */
        private static final String f44950j = P.y0(2);

        /* renamed from: k, reason: collision with root package name */
        private static final String f44951k = P.y0(3);

        /* renamed from: l, reason: collision with root package name */
        private static final String f44952l = P.y0(4);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44953m = P.y0(5);

        /* renamed from: n, reason: collision with root package name */
        private static final String f44954n = P.y0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44955a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44956b;

        /* renamed from: c, reason: collision with root package name */
        public final String f44957c;

        /* renamed from: d, reason: collision with root package name */
        public final int f44958d;

        /* renamed from: e, reason: collision with root package name */
        public final int f44959e;

        /* renamed from: f, reason: collision with root package name */
        public final String f44960f;

        /* renamed from: g, reason: collision with root package name */
        public final String f44961g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f44962a;

            /* renamed from: b, reason: collision with root package name */
            private String f44963b;

            /* renamed from: c, reason: collision with root package name */
            private String f44964c;

            /* renamed from: d, reason: collision with root package name */
            private int f44965d;

            /* renamed from: e, reason: collision with root package name */
            private int f44966e;

            /* renamed from: f, reason: collision with root package name */
            private String f44967f;

            /* renamed from: g, reason: collision with root package name */
            private String f44968g;

            private a(k kVar) {
                this.f44962a = kVar.f44955a;
                this.f44963b = kVar.f44956b;
                this.f44964c = kVar.f44957c;
                this.f44965d = kVar.f44958d;
                this.f44966e = kVar.f44959e;
                this.f44967f = kVar.f44960f;
                this.f44968g = kVar.f44961g;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public j i() {
                return new j(this);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f44955a.equals(kVar.f44955a) && Objects.equals(this.f44956b, kVar.f44956b) && Objects.equals(this.f44957c, kVar.f44957c) && this.f44958d == kVar.f44958d && this.f44959e == kVar.f44959e && Objects.equals(this.f44960f, kVar.f44960f) && Objects.equals(this.f44961g, kVar.f44961g);
        }

        private k(a aVar) {
            this.f44955a = aVar.f44962a;
            this.f44956b = aVar.f44963b;
            this.f44957c = aVar.f44964c;
            this.f44958d = aVar.f44965d;
            this.f44959e = aVar.f44966e;
            this.f44960f = aVar.f44967f;
            this.f44961g = aVar.f44968g;
        }

        public a a() {
            return new a();
        }

        public int hashCode() {
            int iHashCode = this.f44955a.hashCode() * 31;
            String str = this.f44956b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f44957c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f44958d) * 31) + this.f44959e) * 31;
            String str3 = this.f44960f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f44961g;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Objects.equals(this.f44829a, vVar.f44829a) && this.f44834f.equals(vVar.f44834f) && Objects.equals(this.f44830b, vVar.f44830b) && Objects.equals(this.f44832d, vVar.f44832d) && Objects.equals(this.f44833e, vVar.f44833e) && Objects.equals(this.f44836h, vVar.f44836h);
    }

    private v(String str, e eVar, h hVar, g gVar, x xVar, i iVar) {
        this.f44829a = str;
        this.f44830b = hVar;
        this.f44831c = hVar;
        this.f44832d = gVar;
        this.f44833e = xVar;
        this.f44834f = eVar;
        this.f44835g = eVar;
        this.f44836h = iVar;
    }

    public static v b(String str) {
        return new c().j(str).a();
    }

    public c a() {
        return new c();
    }

    public int hashCode() {
        int iHashCode = this.f44829a.hashCode() * 31;
        h hVar = this.f44830b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f44832d.hashCode()) * 31) + this.f44834f.hashCode()) * 31) + this.f44833e.hashCode()) * 31) + this.f44836h.hashCode();
    }
}
