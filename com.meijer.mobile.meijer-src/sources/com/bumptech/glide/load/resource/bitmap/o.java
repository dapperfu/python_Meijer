package com.bumptech.glide.load.resource.bitmap;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final o f64910a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final o f64911b = new b();

    /* renamed from: c, reason: collision with root package name */
    public static final o f64912c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final o f64913d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final o f64914e;

    /* renamed from: f, reason: collision with root package name */
    public static final o f64915f;

    /* renamed from: g, reason: collision with root package name */
    public static final o f64916g;

    /* renamed from: h, reason: collision with root package name */
    public static final X6.f<o> f64917h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f64918i;

    private static class a extends o {
        @Override // com.bumptech.glide.load.resource.bitmap.o
        public float b(int i10, int i11, int i12, int i13) {
            if (Math.min(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r1);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        a() {
        }
    }

    private static class b extends o {
        @Override // com.bumptech.glide.load.resource.bitmap.o
        public float b(int i10, int i11, int i12, int i13) {
            int iCeil = (int) Math.ceil(Math.max(i11 / i13, i10 / i12));
            return 1.0f / (r2 << (Math.max(1, Integer.highestOneBit(iCeil)) >= iCeil ? 0 : 1));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o
        public g a(int i10, int i11, int i12, int i13) {
            return g.MEMORY;
        }

        b() {
        }
    }

    private static class c extends o {
        @Override // com.bumptech.glide.load.resource.bitmap.o
        public float b(int i10, int i11, int i12, int i13) {
            return Math.min(1.0f, o.f64912c.b(i10, i11, i12, i13));
        }

        c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o
        public g a(int i10, int i11, int i12, int i13) {
            if (b(i10, i11, i12, i13) == 1.0f) {
                return g.QUALITY;
            }
            return o.f64912c.a(i10, i11, i12, i13);
        }
    }

    private static class d extends o {
        @Override // com.bumptech.glide.load.resource.bitmap.o
        public float b(int i10, int i11, int i12, int i13) {
            return Math.max(i12 / i10, i13 / i11);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        d() {
        }
    }

    private static class e extends o {
        @Override // com.bumptech.glide.load.resource.bitmap.o
        public g a(int i10, int i11, int i12, int i13) {
            return o.f64918i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o
        public float b(int i10, int i11, int i12, int i13) {
            if (o.f64918i) {
                return Math.min(i12 / i10, i13 / i11);
            }
            if (Math.max(i11 / i13, i10 / i12) == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(r2);
        }

        e() {
        }
    }

    private static class f extends o {
        @Override // com.bumptech.glide.load.resource.bitmap.o
        public float b(int i10, int i11, int i12, int i13) {
            return 1.0f;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.o
        public g a(int i10, int i11, int i12, int i13) {
            return g.QUALITY;
        }

        f() {
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    public abstract g a(int i10, int i11, int i12, int i13);

    public abstract float b(int i10, int i11, int i12, int i13);

    static {
        d dVar = new d();
        f64914e = dVar;
        f64915f = new f();
        f64916g = dVar;
        f64917h = X6.f.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        f64918i = true;
    }
}
