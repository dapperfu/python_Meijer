package ph;

import com.launchdarkly.sdk.EvaluationReason;
import com.launchdarkly.sdk.LDContext;
import com.launchdarkly.sdk.LDValue;

/* renamed from: ph.i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C16432i {

    /* renamed from: a, reason: collision with root package name */
    private final long f156499a;

    /* renamed from: b, reason: collision with root package name */
    private final LDContext f156500b;

    /* renamed from: ph.i$a */
    public static final class a extends C16432i {

        /* renamed from: c, reason: collision with root package name */
        private final String f156501c;

        /* renamed from: d, reason: collision with root package name */
        private final LDValue f156502d;

        /* renamed from: e, reason: collision with root package name */
        private final Double f156503e;

        public LDValue d() {
            return this.f156502d;
        }

        public String e() {
            return this.f156501c;
        }

        public Double f() {
            return this.f156503e;
        }
    }

    /* renamed from: ph.i$b */
    public static final class b extends C16432i {

        /* renamed from: c, reason: collision with root package name */
        private final String f156504c;

        /* renamed from: d, reason: collision with root package name */
        private final int f156505d;

        /* renamed from: e, reason: collision with root package name */
        private final LDValue f156506e;

        /* renamed from: f, reason: collision with root package name */
        private final LDValue f156507f;

        /* renamed from: g, reason: collision with root package name */
        private final int f156508g;

        /* renamed from: h, reason: collision with root package name */
        private final String f156509h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f156510i;

        /* renamed from: j, reason: collision with root package name */
        private final Long f156511j;

        /* renamed from: k, reason: collision with root package name */
        private final EvaluationReason f156512k;

        /* renamed from: l, reason: collision with root package name */
        private final boolean f156513l;

        /* renamed from: m, reason: collision with root package name */
        private final long f156514m;

        /* renamed from: n, reason: collision with root package name */
        private final boolean f156515n;

        public b(long j10, String str, LDContext lDContext, int i10, int i11, LDValue lDValue, LDValue lDValue2, EvaluationReason evaluationReason, String str2, boolean z10, Long l10, boolean z11, long j11, boolean z12) {
            super(j10, lDContext);
            this.f156504c = str;
            this.f156508g = i10;
            this.f156505d = i11;
            this.f156506e = lDValue;
            this.f156507f = lDValue2;
            this.f156509h = str2;
            this.f156510i = z10;
            this.f156511j = l10;
            this.f156512k = evaluationReason;
            this.f156513l = z11;
            this.f156515n = z12;
            this.f156514m = j11;
        }

        @Override // ph.C16432i
        public long c() {
            return this.f156514m;
        }

        public Long d() {
            return this.f156511j;
        }

        public LDValue e() {
            return this.f156507f;
        }

        public String f() {
            return this.f156504c;
        }

        public String g() {
            return this.f156509h;
        }

        public EvaluationReason h() {
            return this.f156512k;
        }

        public LDValue i() {
            return this.f156506e;
        }

        public int j() {
            return this.f156505d;
        }

        public int k() {
            return this.f156508g;
        }

        public boolean l() {
            return this.f156513l;
        }

        public boolean m() {
            return this.f156515n;
        }

        public boolean n() {
            return this.f156510i;
        }

        public b o() {
            return new b(b(), f(), a(), k(), j(), i(), e(), h(), g(), false, null, true, this.f156514m, this.f156515n);
        }

        public b(long j10, String str, LDContext lDContext, int i10, int i11, LDValue lDValue, LDValue lDValue2, EvaluationReason evaluationReason, String str2, boolean z10, Long l10, boolean z11) {
            this(j10, str, lDContext, i10, i11, lDValue, lDValue2, evaluationReason, str2, z10, l10, z11, 1L, false);
        }
    }

    /* renamed from: ph.i$d */
    public static final class d extends C16432i {
    }

    /* renamed from: ph.i$e */
    public static final class e extends C16432i {

        /* renamed from: c, reason: collision with root package name */
        private final String f156516c;

        /* renamed from: d, reason: collision with root package name */
        private final int f156517d;

        /* renamed from: e, reason: collision with root package name */
        private final LDValue f156518e;

        /* renamed from: f, reason: collision with root package name */
        private final LDValue f156519f;

        /* renamed from: g, reason: collision with root package name */
        private final EvaluationReason f156520g;

        /* renamed from: h, reason: collision with root package name */
        private final long f156521h;

        /* renamed from: i, reason: collision with root package name */
        private final String f156522i;

        /* renamed from: j, reason: collision with root package name */
        private final int f156523j;

        /* renamed from: ph.i$e$a */
        public static final class a {
        }

        /* renamed from: ph.i$e$b */
        public static final class b {
        }

        /* renamed from: ph.i$e$c */
        public static final class c {
        }

        /* renamed from: ph.i$e$d */
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

        @Override // ph.C16432i
        public long c() {
            return this.f156521h;
        }

        public LDValue e() {
            return this.f156519f;
        }

        public String g() {
            return this.f156516c;
        }

        public int h() {
            return this.f156523j;
        }

        public String k() {
            return this.f156522i;
        }

        public EvaluationReason l() {
            return this.f156520g;
        }

        public LDValue m() {
            return this.f156518e;
        }

        public int n() {
            return this.f156517d;
        }
    }

    /* renamed from: ph.i$c */
    public static final class c extends C16432i {
        public c(long j10, LDContext lDContext) {
            super(j10, lDContext);
        }
    }

    public LDContext a() {
        return this.f156500b;
    }

    public long b() {
        return this.f156499a;
    }

    public long c() {
        return 1L;
    }

    public C16432i(long j10, LDContext lDContext) {
        this.f156499a = j10;
        this.f156500b = lDContext;
    }
}
