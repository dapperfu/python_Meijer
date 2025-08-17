package oh;

import com.launchdarkly.sdk.EvaluationReason;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;

/* renamed from: oh.i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16067i {

    /* renamed from: a, reason: collision with root package name */
    private final long f153739a;

    /* renamed from: b, reason: collision with root package name */
    private final LDContext f153740b;

    /* renamed from: oh.i$a */
    public static final class a extends C16067i {

        /* renamed from: c, reason: collision with root package name */
        private final String f153741c;

        /* renamed from: d, reason: collision with root package name */
        private final LDValue f153742d;

        /* renamed from: e, reason: collision with root package name */
        private final Double f153743e;

        public LDValue d() {
            return this.f153742d;
        }

        public String e() {
            return this.f153741c;
        }

        public Double f() {
            return this.f153743e;
        }
    }

    /* renamed from: oh.i$b */
    public static final class b extends C16067i {

        /* renamed from: c, reason: collision with root package name */
        private final String f153744c;

        /* renamed from: d, reason: collision with root package name */
        private final int f153745d;

        /* renamed from: e, reason: collision with root package name */
        private final LDValue f153746e;

        /* renamed from: f, reason: collision with root package name */
        private final LDValue f153747f;

        /* renamed from: g, reason: collision with root package name */
        private final int f153748g;

        /* renamed from: h, reason: collision with root package name */
        private final String f153749h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f153750i;

        /* renamed from: j, reason: collision with root package name */
        private final Long f153751j;

        /* renamed from: k, reason: collision with root package name */
        private final EvaluationReason f153752k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f153753l;

        /* renamed from: m, reason: collision with root package name */
        private final long f153754m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f153755n;

        public b(long j10, String str, LDContext lDContext, int i10, int i11, LDValue lDValue, LDValue lDValue2, EvaluationReason evaluationReason, String str2, boolean z10, Long l10, boolean z11, long j11, boolean z12) {
            super(j10, lDContext);
            this.f153744c = str;
            this.f153748g = i10;
            this.f153745d = i11;
            this.f153746e = lDValue;
            this.f153747f = lDValue2;
            this.f153749h = str2;
            this.f153750i = z10;
            this.f153751j = l10;
            this.f153752k = evaluationReason;
            this.f153753l = z11;
            this.f153755n = z12;
            this.f153754m = j11;
        }

        @Override // oh.C16067i
        public long c() {
            return this.f153754m;
        }

        public Long d() {
            return this.f153751j;
        }

        public LDValue e() {
            return this.f153747f;
        }

        public String f() {
            return this.f153744c;
        }

        public String g() {
            return this.f153749h;
        }

        public EvaluationReason h() {
            return this.f153752k;
        }

        public LDValue i() {
            return this.f153746e;
        }

        public int j() {
            return this.f153745d;
        }

        public int k() {
            return this.f153748g;
        }

        public boolean l() {
            return this.f153753l;
        }

        public boolean m() {
            return this.f153755n;
        }

        public boolean n() {
            return this.f153750i;
        }

        public b o() {
            return new b(b(), f(), a(), k(), j(), i(), e(), h(), g(), false, null, true, this.f153754m, this.f153755n);
        }

        public b(long j10, String str, LDContext lDContext, int i10, int i11, LDValue lDValue, LDValue lDValue2, EvaluationReason evaluationReason, String str2, boolean z10, Long l10, boolean z11) {
            this(j10, str, lDContext, i10, i11, lDValue, lDValue2, evaluationReason, str2, z10, l10, z11, 1L, false);
        }
    }

    /* renamed from: oh.i$d */
    public static final class d extends C16067i {
    }

    /* renamed from: oh.i$e */
    public static final class e extends C16067i {

        /* renamed from: c, reason: collision with root package name */
        private final String f153756c;

        /* renamed from: d, reason: collision with root package name */
        private final int f153757d;

        /* renamed from: e, reason: collision with root package name */
        private final LDValue f153758e;

        /* renamed from: f, reason: collision with root package name */
        private final LDValue f153759f;

        /* renamed from: g, reason: collision with root package name */
        private final EvaluationReason f153760g;

        /* renamed from: h, reason: collision with root package name */
        private final long f153761h;

        /* renamed from: i, reason: collision with root package name */
        private final String f153762i;

        /* renamed from: j, reason: collision with root package name */
        private final int f153763j;

        /* renamed from: oh.i$e$a */
        public static final class a {
        }

        /* renamed from: oh.i$e$b */
        public static final class b {
        }

        /* renamed from: oh.i$e$c */
        public static final class c {
        }

        /* renamed from: oh.i$e$d */
        public static final class d {
        }

        public a d() {
            return null;
        }

        public b f() {
            return null;
        }

        public c i() {
            return null;
        }

        public d j() {
            return null;
        }

        @Override // oh.C16067i
        public long c() {
            return this.f153761h;
        }

        public LDValue e() {
            return this.f153759f;
        }

        public String g() {
            return this.f153756c;
        }

        public int h() {
            return this.f153763j;
        }

        public String k() {
            return this.f153762i;
        }

        public EvaluationReason l() {
            return this.f153760g;
        }

        public LDValue m() {
            return this.f153758e;
        }

        public int n() {
            return this.f153757d;
        }
    }

    /* renamed from: oh.i$c */
    public static final class c extends C16067i {
        public c(long j10, LDContext lDContext) {
            super(j10, lDContext);
        }
    }

    public LDContext a() {
        return this.f153740b;
    }

    public long b() {
        return this.f153739a;
    }

    public long c() {
        return 1L;
    }

    public C16067i(long j10, LDContext lDContext) {
        this.f153739a = j10;
        this.f153740b = lDContext;
    }
}
