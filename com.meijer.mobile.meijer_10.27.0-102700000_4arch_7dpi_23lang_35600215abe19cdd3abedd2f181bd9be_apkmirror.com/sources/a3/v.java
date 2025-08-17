package a3;

import Ce.L;
import android.net.Uri;
import android.os.Bundle;
import d3.C13466a;
import d3.P;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: i, reason: collision with root package name */
    public static final v f44004i = new c().a();

    /* renamed from: j, reason: collision with root package name */
    private static final String f44005j = P.y0(0);

    /* renamed from: k, reason: collision with root package name */
    private static final String f44006k = P.y0(1);

    /* renamed from: l, reason: collision with root package name */
    private static final String f44007l = P.y0(2);

    /* renamed from: m, reason: collision with root package name */
    private static final String f44008m = P.y0(3);

    /* renamed from: n, reason: collision with root package name */
    private static final String f44009n = P.y0(4);

    /* renamed from: o, reason: collision with root package name */
    private static final String f44010o = P.y0(5);

    /* renamed from: a, reason: collision with root package name */
    public final String f44011a;

    /* renamed from: b, reason: collision with root package name */
    public final h f44012b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final h f44013c;

    /* renamed from: d, reason: collision with root package name */
    public final g f44014d;

    /* renamed from: e, reason: collision with root package name */
    public final x f44015e;

    /* renamed from: f, reason: collision with root package name */
    public final d f44016f;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public final e f44017g;

    /* renamed from: h, reason: collision with root package name */
    public final i f44018h;

    public static final class b {

        /* renamed from: c, reason: collision with root package name */
        private static final String f44019c = P.y0(0);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44020a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f44021b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f44022a;

            /* renamed from: b, reason: collision with root package name */
            private Object f44023b;

            public b c() {
                return new b(this);
            }

            public a(Uri uri) {
                this.f44022a = uri;
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
            return this.f44020a.equals(bVar.f44020a) && Objects.equals(this.f44021b, bVar.f44021b);
        }

        private b(a aVar) {
            this.f44020a = aVar.f44022a;
            this.f44021b = aVar.f44023b;
        }

        public int hashCode() {
            int iHashCode = this.f44020a.hashCode() * 31;
            Object obj = this.f44021b;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private String f44024a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f44025b;

        /* renamed from: c, reason: collision with root package name */
        private String f44026c;

        /* renamed from: d, reason: collision with root package name */
        private d.a f44027d;

        /* renamed from: e, reason: collision with root package name */
        private f.a f44028e;

        /* renamed from: f, reason: collision with root package name */
        private List<Object> f44029f;

        /* renamed from: g, reason: collision with root package name */
        private String f44030g;

        /* renamed from: h, reason: collision with root package name */
        private Ce.L<k> f44031h;

        /* renamed from: i, reason: collision with root package name */
        private b f44032i;

        /* renamed from: j, reason: collision with root package name */
        private Object f44033j;

        /* renamed from: k, reason: collision with root package name */
        private long f44034k;

        /* renamed from: l, reason: collision with root package name */
        private x f44035l;

        /* renamed from: m, reason: collision with root package name */
        private g.a f44036m;

        /* renamed from: n, reason: collision with root package name */
        private i f44037n;

        public c() {
            this.f44027d = new d.a();
            this.f44028e = new f.a();
            this.f44029f = Collections.EMPTY_LIST;
            this.f44031h = Ce.L.x();
            this.f44036m = new g.a();
            this.f44037n = i.f44120d;
            this.f44034k = -9223372036854775807L;
        }

        public v a() {
            h hVar;
            C13466a.g(this.f44028e.f44079b == null || this.f44028e.f44078a != null);
            Uri uri = this.f44025b;
            if (uri != null) {
                hVar = new h(uri, this.f44026c, this.f44028e.f44078a != null ? this.f44028e.i() : null, this.f44032i, this.f44029f, this.f44030g, this.f44031h, this.f44033j, this.f44034k);
            } else {
                hVar = null;
            }
            String str = this.f44024a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f44027d.g();
            g gVarF = this.f44036m.f();
            x xVar = this.f44035l;
            if (xVar == null) {
                xVar = x.f44153I;
            }
            return new v(str2, eVarG, hVar, gVarF, xVar, this.f44037n);
        }

        public c b(b bVar) {
            this.f44032i = bVar;
            return this;
        }

        public c c(f fVar) {
            this.f44028e = fVar != null ? fVar.b() : new f.a();
            return this;
        }

        public c f(String str) {
            this.f44026c = str;
            return this;
        }

        public c h(Object obj) {
            this.f44033j = obj;
            return this;
        }

        public c i(Uri uri) {
            this.f44025b = uri;
            return this;
        }

        public c j(String str) {
            return i(str == null ? null : Uri.parse(str));
        }

        public c d(g gVar) {
            this.f44036m = gVar.a();
            return this;
        }

        public c e(String str) {
            this.f44024a = (String) C13466a.e(str);
            return this;
        }

        public c g(List<k> list) {
            this.f44031h = Ce.L.s(list);
            return this;
        }

        private c(v vVar) {
            f.a aVar;
            this();
            this.f44027d = vVar.f44016f.a();
            this.f44024a = vVar.f44011a;
            this.f44035l = vVar.f44015e;
            this.f44036m = vVar.f44014d.a();
            this.f44037n = vVar.f44018h;
            h hVar = vVar.f44012b;
            if (hVar != null) {
                this.f44030g = hVar.f44115f;
                this.f44026c = hVar.f44111b;
                this.f44025b = hVar.f44110a;
                this.f44029f = hVar.f44114e;
                this.f44031h = hVar.f44116g;
                this.f44033j = hVar.f44118i;
                f fVar = hVar.f44112c;
                if (fVar != null) {
                    aVar = fVar.b();
                } else {
                    aVar = new f.a();
                }
                this.f44028e = aVar;
                this.f44032i = hVar.f44113d;
                this.f44034k = hVar.f44119j;
            }
        }
    }

    public static class d {

        /* renamed from: h, reason: collision with root package name */
        public static final d f44038h = new a().f();

        /* renamed from: i, reason: collision with root package name */
        private static final String f44039i = P.y0(0);

        /* renamed from: j, reason: collision with root package name */
        private static final String f44040j = P.y0(1);

        /* renamed from: k, reason: collision with root package name */
        private static final String f44041k = P.y0(2);

        /* renamed from: l, reason: collision with root package name */
        private static final String f44042l = P.y0(3);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44043m = P.y0(4);

        /* renamed from: n, reason: collision with root package name */
        static final String f44044n = P.y0(5);

        /* renamed from: o, reason: collision with root package name */
        static final String f44045o = P.y0(6);

        /* renamed from: a, reason: collision with root package name */
        public final long f44046a;

        /* renamed from: b, reason: collision with root package name */
        public final long f44047b;

        /* renamed from: c, reason: collision with root package name */
        public final long f44048c;

        /* renamed from: d, reason: collision with root package name */
        public final long f44049d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f44050e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f44051f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f44052g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f44053a;

            /* renamed from: b, reason: collision with root package name */
            private long f44054b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f44055c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f44056d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f44057e;

            public a() {
                this.f44054b = Long.MIN_VALUE;
            }

            public d f() {
                return new d(this);
            }

            @Deprecated
            public e g() {
                return new e(this);
            }

            private a(d dVar) {
                this.f44053a = dVar.f44047b;
                this.f44054b = dVar.f44049d;
                this.f44055c = dVar.f44050e;
                this.f44056d = dVar.f44051f;
                this.f44057e = dVar.f44052g;
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
            return this.f44047b == dVar.f44047b && this.f44049d == dVar.f44049d && this.f44050e == dVar.f44050e && this.f44051f == dVar.f44051f && this.f44052g == dVar.f44052g;
        }

        private d(a aVar) {
            this.f44046a = P.j1(aVar.f44053a);
            this.f44048c = P.j1(aVar.f44054b);
            this.f44047b = aVar.f44053a;
            this.f44049d = aVar.f44054b;
            this.f44050e = aVar.f44055c;
            this.f44051f = aVar.f44056d;
            this.f44052g = aVar.f44057e;
        }

        public a a() {
            return new a();
        }

        public int hashCode() {
            long j10 = this.f44047b;
            int i10 = ((int) (j10 ^ (j10 >>> 32))) * 31;
            long j11 = this.f44049d;
            return ((((((i10 + ((int) ((j11 >>> 32) ^ j11))) * 31) + (this.f44050e ? 1 : 0)) * 31) + (this.f44051f ? 1 : 0)) * 31) + (this.f44052g ? 1 : 0);
        }
    }

    @Deprecated
    public static final class e extends d {

        /* renamed from: p, reason: collision with root package name */
        public static final e f44058p = new d.a().g();

        private e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f {

        /* renamed from: l, reason: collision with root package name */
        private static final String f44059l = P.y0(0);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44060m = P.y0(1);

        /* renamed from: n, reason: collision with root package name */
        private static final String f44061n = P.y0(2);

        /* renamed from: o, reason: collision with root package name */
        private static final String f44062o = P.y0(3);

        /* renamed from: p, reason: collision with root package name */
        static final String f44063p = P.y0(4);

        /* renamed from: q, reason: collision with root package name */
        private static final String f44064q = P.y0(5);

        /* renamed from: r, reason: collision with root package name */
        private static final String f44065r = P.y0(6);

        /* renamed from: s, reason: collision with root package name */
        private static final String f44066s = P.y0(7);

        /* renamed from: a, reason: collision with root package name */
        public final UUID f44067a;

        /* renamed from: b, reason: collision with root package name */
        @Deprecated
        public final UUID f44068b;

        /* renamed from: c, reason: collision with root package name */
        public final Uri f44069c;

        /* renamed from: d, reason: collision with root package name */
        @Deprecated
        public final Ce.M<String, String> f44070d;

        /* renamed from: e, reason: collision with root package name */
        public final Ce.M<String, String> f44071e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f44072f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f44073g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f44074h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public final Ce.L<Integer> f44075i;

        /* renamed from: j, reason: collision with root package name */
        public final Ce.L<Integer> f44076j;

        /* renamed from: k, reason: collision with root package name */
        private final byte[] f44077k;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private UUID f44078a;

            /* renamed from: b, reason: collision with root package name */
            private Uri f44079b;

            /* renamed from: c, reason: collision with root package name */
            private Ce.M<String, String> f44080c;

            /* renamed from: d, reason: collision with root package name */
            private boolean f44081d;

            /* renamed from: e, reason: collision with root package name */
            private boolean f44082e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f44083f;

            /* renamed from: g, reason: collision with root package name */
            private Ce.L<Integer> f44084g;

            /* renamed from: h, reason: collision with root package name */
            private byte[] f44085h;

            public f i() {
                return new f(this);
            }

            @Deprecated
            private a() {
                this.f44080c = Ce.M.n();
                this.f44082e = true;
                this.f44084g = Ce.L.x();
            }

            private a(f fVar) {
                this.f44078a = fVar.f44067a;
                this.f44079b = fVar.f44069c;
                this.f44080c = fVar.f44071e;
                this.f44081d = fVar.f44072f;
                this.f44082e = fVar.f44073g;
                this.f44083f = fVar.f44074h;
                this.f44084g = fVar.f44076j;
                this.f44085h = fVar.f44077k;
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
            return this.f44067a.equals(fVar.f44067a) && Objects.equals(this.f44069c, fVar.f44069c) && Objects.equals(this.f44071e, fVar.f44071e) && this.f44072f == fVar.f44072f && this.f44074h == fVar.f44074h && this.f44073g == fVar.f44073g && this.f44076j.equals(fVar.f44076j) && Arrays.equals(this.f44077k, fVar.f44077k);
        }

        private f(a aVar) {
            C13466a.g((aVar.f44083f && aVar.f44079b == null) ? false : true);
            UUID uuid = (UUID) C13466a.e(aVar.f44078a);
            this.f44067a = uuid;
            this.f44068b = uuid;
            this.f44069c = aVar.f44079b;
            this.f44070d = aVar.f44080c;
            this.f44071e = aVar.f44080c;
            this.f44072f = aVar.f44081d;
            this.f44074h = aVar.f44083f;
            this.f44073g = aVar.f44082e;
            this.f44075i = aVar.f44084g;
            this.f44076j = aVar.f44084g;
            this.f44077k = aVar.f44085h != null ? Arrays.copyOf(aVar.f44085h, aVar.f44085h.length) : null;
        }

        public a b() {
            return new a();
        }

        public byte[] c() {
            byte[] bArr = this.f44077k;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public int hashCode() {
            int iHashCode = this.f44067a.hashCode() * 31;
            Uri uri = this.f44069c;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f44071e.hashCode()) * 31) + (this.f44072f ? 1 : 0)) * 31) + (this.f44074h ? 1 : 0)) * 31) + (this.f44073g ? 1 : 0)) * 31) + this.f44076j.hashCode()) * 31) + Arrays.hashCode(this.f44077k);
        }
    }

    public static final class g {

        /* renamed from: f, reason: collision with root package name */
        public static final g f44086f = new a().f();

        /* renamed from: g, reason: collision with root package name */
        private static final String f44087g = P.y0(0);

        /* renamed from: h, reason: collision with root package name */
        private static final String f44088h = P.y0(1);

        /* renamed from: i, reason: collision with root package name */
        private static final String f44089i = P.y0(2);

        /* renamed from: j, reason: collision with root package name */
        private static final String f44090j = P.y0(3);

        /* renamed from: k, reason: collision with root package name */
        private static final String f44091k = P.y0(4);

        /* renamed from: a, reason: collision with root package name */
        public final long f44092a;

        /* renamed from: b, reason: collision with root package name */
        public final long f44093b;

        /* renamed from: c, reason: collision with root package name */
        public final long f44094c;

        /* renamed from: d, reason: collision with root package name */
        public final float f44095d;

        /* renamed from: e, reason: collision with root package name */
        public final float f44096e;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private long f44097a;

            /* renamed from: b, reason: collision with root package name */
            private long f44098b;

            /* renamed from: c, reason: collision with root package name */
            private long f44099c;

            /* renamed from: d, reason: collision with root package name */
            private float f44100d;

            /* renamed from: e, reason: collision with root package name */
            private float f44101e;

            public a() {
                this.f44097a = -9223372036854775807L;
                this.f44098b = -9223372036854775807L;
                this.f44099c = -9223372036854775807L;
                this.f44100d = -3.4028235E38f;
                this.f44101e = -3.4028235E38f;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j10) {
                this.f44099c = j10;
                return this;
            }

            public a h(float f10) {
                this.f44101e = f10;
                return this;
            }

            public a i(long j10) {
                this.f44098b = j10;
                return this;
            }

            public a j(float f10) {
                this.f44100d = f10;
                return this;
            }

            public a k(long j10) {
                this.f44097a = j10;
                return this;
            }

            private a(g gVar) {
                this.f44097a = gVar.f44092a;
                this.f44098b = gVar.f44093b;
                this.f44099c = gVar.f44094c;
                this.f44100d = gVar.f44095d;
                this.f44101e = gVar.f44096e;
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
            return this.f44092a == gVar.f44092a && this.f44093b == gVar.f44093b && this.f44094c == gVar.f44094c && this.f44095d == gVar.f44095d && this.f44096e == gVar.f44096e;
        }

        private g(a aVar) {
            this(aVar.f44097a, aVar.f44098b, aVar.f44099c, aVar.f44100d, aVar.f44101e);
        }

        public a a() {
            return new a();
        }

        public int hashCode() {
            long j10 = this.f44092a;
            long j11 = this.f44093b;
            int i10 = ((((int) (j10 ^ (j10 >>> 32))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            long j12 = this.f44094c;
            int i11 = (i10 + ((int) ((j12 >>> 32) ^ j12))) * 31;
            float f10 = this.f44095d;
            int iFloatToIntBits = (i11 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31;
            float f11 = this.f44096e;
            return iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0);
        }

        @Deprecated
        public g(long j10, long j11, long j12, float f10, float f11) {
            this.f44092a = j10;
            this.f44093b = j11;
            this.f44094c = j12;
            this.f44095d = f10;
            this.f44096e = f11;
        }
    }

    public static final class h {

        /* renamed from: k, reason: collision with root package name */
        private static final String f44102k = P.y0(0);

        /* renamed from: l, reason: collision with root package name */
        private static final String f44103l = P.y0(1);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44104m = P.y0(2);

        /* renamed from: n, reason: collision with root package name */
        private static final String f44105n = P.y0(3);

        /* renamed from: o, reason: collision with root package name */
        private static final String f44106o = P.y0(4);

        /* renamed from: p, reason: collision with root package name */
        private static final String f44107p = P.y0(5);

        /* renamed from: q, reason: collision with root package name */
        private static final String f44108q = P.y0(6);

        /* renamed from: r, reason: collision with root package name */
        private static final String f44109r = P.y0(7);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44110a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44111b;

        /* renamed from: c, reason: collision with root package name */
        public final f f44112c;

        /* renamed from: d, reason: collision with root package name */
        public final b f44113d;

        /* renamed from: e, reason: collision with root package name */
        public final List<Object> f44114e;

        /* renamed from: f, reason: collision with root package name */
        public final String f44115f;

        /* renamed from: g, reason: collision with root package name */
        public final Ce.L<k> f44116g;

        /* renamed from: h, reason: collision with root package name */
        @Deprecated
        public final List<j> f44117h;

        /* renamed from: i, reason: collision with root package name */
        public final Object f44118i;

        /* renamed from: j, reason: collision with root package name */
        public final long f44119j;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f44110a.equals(hVar.f44110a) && Objects.equals(this.f44111b, hVar.f44111b) && Objects.equals(this.f44112c, hVar.f44112c) && Objects.equals(this.f44113d, hVar.f44113d) && this.f44114e.equals(hVar.f44114e) && Objects.equals(this.f44115f, hVar.f44115f) && this.f44116g.equals(hVar.f44116g) && Objects.equals(this.f44118i, hVar.f44118i) && this.f44119j == hVar.f44119j;
        }

        private h(Uri uri, String str, f fVar, b bVar, List<Object> list, String str2, Ce.L<k> l10, Object obj, long j10) {
            this.f44110a = uri;
            this.f44111b = z.r(str);
            this.f44112c = fVar;
            this.f44113d = bVar;
            this.f44114e = list;
            this.f44115f = str2;
            this.f44116g = l10;
            L.a aVarP = Ce.L.p();
            for (int i10 = 0; i10 < l10.size(); i10++) {
                aVarP.a(l10.get(i10).a().i());
            }
            this.f44117h = aVarP.k();
            this.f44118i = obj;
            this.f44119j = j10;
        }

        public int hashCode() {
            int iHashCode = this.f44110a.hashCode() * 31;
            String str = this.f44111b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f44112c;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f44113d;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f44114e.hashCode()) * 31;
            String str2 = this.f44115f;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f44116g.hashCode()) * 31;
            return (int) (((iHashCode5 + (this.f44118i != null ? r1.hashCode() : 0)) * 31) + this.f44119j);
        }
    }

    public static final class i {

        /* renamed from: d, reason: collision with root package name */
        public static final i f44120d = new a().d();

        /* renamed from: e, reason: collision with root package name */
        private static final String f44121e = P.y0(0);

        /* renamed from: f, reason: collision with root package name */
        private static final String f44122f = P.y0(1);

        /* renamed from: g, reason: collision with root package name */
        private static final String f44123g = P.y0(2);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44124a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44125b;

        /* renamed from: c, reason: collision with root package name */
        public final Bundle f44126c;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f44127a;

            /* renamed from: b, reason: collision with root package name */
            private String f44128b;

            /* renamed from: c, reason: collision with root package name */
            private Bundle f44129c;

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
            if (Objects.equals(this.f44124a, iVar.f44124a) && Objects.equals(this.f44125b, iVar.f44125b)) {
                if ((this.f44126c == null) == (iVar.f44126c == null)) {
                    return true;
                }
            }
            return false;
        }

        private i(a aVar) {
            this.f44124a = aVar.f44127a;
            this.f44125b = aVar.f44128b;
            this.f44126c = aVar.f44129c;
        }

        public int hashCode() {
            Uri uri = this.f44124a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f44125b;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f44126c != null ? 1 : 0);
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
        private static final String f44130h = P.y0(0);

        /* renamed from: i, reason: collision with root package name */
        private static final String f44131i = P.y0(1);

        /* renamed from: j, reason: collision with root package name */
        private static final String f44132j = P.y0(2);

        /* renamed from: k, reason: collision with root package name */
        private static final String f44133k = P.y0(3);

        /* renamed from: l, reason: collision with root package name */
        private static final String f44134l = P.y0(4);

        /* renamed from: m, reason: collision with root package name */
        private static final String f44135m = P.y0(5);

        /* renamed from: n, reason: collision with root package name */
        private static final String f44136n = P.y0(6);

        /* renamed from: a, reason: collision with root package name */
        public final Uri f44137a;

        /* renamed from: b, reason: collision with root package name */
        public final String f44138b;

        /* renamed from: c, reason: collision with root package name */
        public final String f44139c;

        /* renamed from: d, reason: collision with root package name */
        public final int f44140d;

        /* renamed from: e, reason: collision with root package name */
        public final int f44141e;

        /* renamed from: f, reason: collision with root package name */
        public final String f44142f;

        /* renamed from: g, reason: collision with root package name */
        public final String f44143g;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private Uri f44144a;

            /* renamed from: b, reason: collision with root package name */
            private String f44145b;

            /* renamed from: c, reason: collision with root package name */
            private String f44146c;

            /* renamed from: d, reason: collision with root package name */
            private int f44147d;

            /* renamed from: e, reason: collision with root package name */
            private int f44148e;

            /* renamed from: f, reason: collision with root package name */
            private String f44149f;

            /* renamed from: g, reason: collision with root package name */
            private String f44150g;

            private a(k kVar) {
                this.f44144a = kVar.f44137a;
                this.f44145b = kVar.f44138b;
                this.f44146c = kVar.f44139c;
                this.f44147d = kVar.f44140d;
                this.f44148e = kVar.f44141e;
                this.f44149f = kVar.f44142f;
                this.f44150g = kVar.f44143g;
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
            return this.f44137a.equals(kVar.f44137a) && Objects.equals(this.f44138b, kVar.f44138b) && Objects.equals(this.f44139c, kVar.f44139c) && this.f44140d == kVar.f44140d && this.f44141e == kVar.f44141e && Objects.equals(this.f44142f, kVar.f44142f) && Objects.equals(this.f44143g, kVar.f44143g);
        }

        private k(a aVar) {
            this.f44137a = aVar.f44144a;
            this.f44138b = aVar.f44145b;
            this.f44139c = aVar.f44146c;
            this.f44140d = aVar.f44147d;
            this.f44141e = aVar.f44148e;
            this.f44142f = aVar.f44149f;
            this.f44143g = aVar.f44150g;
        }

        public a a() {
            return new a();
        }

        public int hashCode() {
            int iHashCode = this.f44137a.hashCode() * 31;
            String str = this.f44138b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f44139c;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f44140d) * 31) + this.f44141e) * 31;
            String str3 = this.f44142f;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f44143g;
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
        return Objects.equals(this.f44011a, vVar.f44011a) && this.f44016f.equals(vVar.f44016f) && Objects.equals(this.f44012b, vVar.f44012b) && Objects.equals(this.f44014d, vVar.f44014d) && Objects.equals(this.f44015e, vVar.f44015e) && Objects.equals(this.f44018h, vVar.f44018h);
    }

    private v(String str, e eVar, h hVar, g gVar, x xVar, i iVar) {
        this.f44011a = str;
        this.f44012b = hVar;
        this.f44013c = hVar;
        this.f44014d = gVar;
        this.f44015e = xVar;
        this.f44016f = eVar;
        this.f44017g = eVar;
        this.f44018h = iVar;
    }

    public static v b(String str) {
        return new c().j(str).a();
    }

    public c a() {
        return new c();
    }

    public int hashCode() {
        int iHashCode = this.f44011a.hashCode() * 31;
        h hVar = this.f44012b;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f44014d.hashCode()) * 31) + this.f44016f.hashCode()) * 31) + this.f44015e.hashCode()) * 31) + this.f44018h.hashCode();
    }
}
