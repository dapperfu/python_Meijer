package Jc;

import Gc.s;

@Deprecated
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15687a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15688b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15689c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15690d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15691e;

    /* renamed from: f, reason: collision with root package name */
    private final s f15692f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f15693g;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        private s f15698e;

        /* renamed from: a, reason: collision with root package name */
        private boolean f15694a = false;

        /* renamed from: b, reason: collision with root package name */
        private int f15695b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f15696c = 0;

        /* renamed from: d, reason: collision with root package name */
        private boolean f15697d = false;

        /* renamed from: f, reason: collision with root package name */
        private int f15699f = 1;

        /* renamed from: g, reason: collision with root package name */
        private boolean f15700g = false;

        public d a() {
            return new d(this, null);
        }

        public a b(int i10) {
            this.f15699f = i10;
            return this;
        }

        @Deprecated
        public a c(int i10) {
            this.f15695b = i10;
            return this;
        }

        public a d(int i10) {
            this.f15696c = i10;
            return this;
        }

        public a e(boolean z10) {
            this.f15700g = z10;
            return this;
        }

        public a f(boolean z10) {
            this.f15697d = z10;
            return this;
        }

        public a g(boolean z10) {
            this.f15694a = z10;
            return this;
        }

        public a h(s sVar) {
            this.f15698e = sVar;
            return this;
        }
    }

    public int a() {
        return this.f15691e;
    }

    @Deprecated
    public int b() {
        return this.f15688b;
    }

    public int c() {
        return this.f15689c;
    }

    public s d() {
        return this.f15692f;
    }

    public boolean e() {
        return this.f15690d;
    }

    public boolean f() {
        return this.f15687a;
    }

    public final boolean g() {
        return this.f15693g;
    }

    /* synthetic */ d(a aVar, h hVar) {
        this.f15687a = aVar.f15694a;
        this.f15688b = aVar.f15695b;
        this.f15689c = aVar.f15696c;
        this.f15690d = aVar.f15697d;
        this.f15691e = aVar.f15699f;
        this.f15692f = aVar.f15698e;
        this.f15693g = aVar.f15700g;
    }
}
