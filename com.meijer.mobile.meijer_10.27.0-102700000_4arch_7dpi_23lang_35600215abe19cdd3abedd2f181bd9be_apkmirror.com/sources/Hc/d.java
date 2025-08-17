package Hc;

import Ec.s;

@Deprecated
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12377a;

    /* renamed from: b, reason: collision with root package name */
    private final int f12378b;

    /* renamed from: c, reason: collision with root package name */
    private final int f12379c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12380d;

    /* renamed from: e, reason: collision with root package name */
    private final int f12381e;

    /* renamed from: f, reason: collision with root package name */
    private final s f12382f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f12383g;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private s f12388e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f12384a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f12385b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f12386c = 0;

        /* renamed from: d, reason: collision with root package name */
        private boolean f12387d = false;

        /* renamed from: f, reason: collision with root package name */
        private int f12389f = 1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f12390g = false;

        public d a() {
            return new d(this, null);
        }

        public a b(int i10) {
            this.f12389f = i10;
            return this;
        }

        @Deprecated
        public a c(int i10) {
            this.f12385b = i10;
            return this;
        }

        public a d(int i10) {
            this.f12386c = i10;
            return this;
        }

        public a e(boolean z10) {
            this.f12390g = z10;
            return this;
        }

        public a f(boolean z10) {
            this.f12387d = z10;
            return this;
        }

        public a g(boolean z10) {
            this.f12384a = z10;
            return this;
        }

        public a h(s sVar) {
            this.f12388e = sVar;
            return this;
        }
    }

    public int a() {
        return this.f12381e;
    }

    @Deprecated
    public int b() {
        return this.f12378b;
    }

    public int c() {
        return this.f12379c;
    }

    public s d() {
        return this.f12382f;
    }

    public boolean e() {
        return this.f12380d;
    }

    public boolean f() {
        return this.f12377a;
    }

    public final boolean g() {
        return this.f12383g;
    }

    /* synthetic */ d(a aVar, h hVar) {
        this.f12377a = aVar.f12384a;
        this.f12378b = aVar.f12385b;
        this.f12379c = aVar.f12386c;
        this.f12380d = aVar.f12387d;
        this.f12381e = aVar.f12389f;
        this.f12382f = aVar.f12388e;
        this.f12383g = aVar.f12390g;
    }
}
