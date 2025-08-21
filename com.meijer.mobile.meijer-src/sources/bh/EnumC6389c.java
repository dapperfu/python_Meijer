package bh;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: bh.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
abstract class EnumC6389c {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC6389c f60377a;

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC6389c f60378b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC6389c f60379c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC6389c f60380d;

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC6389c f60381e;

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC6389c f60382f;

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC6389c f60383g;

    /* renamed from: h, reason: collision with root package name */
    public static final EnumC6389c f60384h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumC6389c[] f60385i;

    /* renamed from: bh.c$a */
    enum a extends EnumC6389c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // bh.EnumC6389c
        boolean a(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    private EnumC6389c(String str, int i10) {
    }

    abstract boolean a(int i10, int i11);

    final void b(Ig.b bVar, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            for (int i12 = 0; i12 < i10; i12++) {
                if (a(i11, i12)) {
                    bVar.e(i12, i11);
                }
            }
        }
    }

    static {
        a aVar = new a("DATA_MASK_000", 0);
        f60377a = aVar;
        EnumC6389c enumC6389c = new EnumC6389c("DATA_MASK_001", 1) { // from class: bh.c.b
            {
                a aVar2 = null;
            }

            @Override // bh.EnumC6389c
            boolean a(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f60378b = enumC6389c;
        EnumC6389c enumC6389c2 = new EnumC6389c("DATA_MASK_010", 2) { // from class: bh.c.c
            {
                a aVar2 = null;
            }

            @Override // bh.EnumC6389c
            boolean a(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f60379c = enumC6389c2;
        EnumC6389c enumC6389c3 = new EnumC6389c("DATA_MASK_011", 3) { // from class: bh.c.d
            {
                a aVar2 = null;
            }

            @Override // bh.EnumC6389c
            boolean a(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        f60380d = enumC6389c3;
        EnumC6389c enumC6389c4 = new EnumC6389c("DATA_MASK_100", 4) { // from class: bh.c.e
            {
                a aVar2 = null;
            }

            @Override // bh.EnumC6389c
            boolean a(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        f60381e = enumC6389c4;
        EnumC6389c enumC6389c5 = new EnumC6389c("DATA_MASK_101", 5) { // from class: bh.c.f
            {
                a aVar2 = null;
            }

            @Override // bh.EnumC6389c
            boolean a(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        f60382f = enumC6389c5;
        EnumC6389c enumC6389c6 = new EnumC6389c("DATA_MASK_110", 6) { // from class: bh.c.g
            {
                a aVar2 = null;
            }

            @Override // bh.EnumC6389c
            boolean a(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        f60383g = enumC6389c6;
        EnumC6389c enumC6389c7 = new EnumC6389c("DATA_MASK_111", 7) { // from class: bh.c.h
            {
                a aVar2 = null;
            }

            @Override // bh.EnumC6389c
            boolean a(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        f60384h = enumC6389c7;
        f60385i = new EnumC6389c[]{aVar, enumC6389c, enumC6389c2, enumC6389c3, enumC6389c4, enumC6389c5, enumC6389c6, enumC6389c7};
    }

    /* synthetic */ EnumC6389c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static EnumC6389c valueOf(String str) {
        return (EnumC6389c) Enum.valueOf(EnumC6389c.class, str);
    }

    public static EnumC6389c[] values() {
        return (EnumC6389c[]) f60385i.clone();
    }
}
