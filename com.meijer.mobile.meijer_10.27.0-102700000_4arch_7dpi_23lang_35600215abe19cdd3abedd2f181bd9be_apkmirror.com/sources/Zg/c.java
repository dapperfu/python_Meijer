package Zg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f42710a;

    /* renamed from: b, reason: collision with root package name */
    public static final c f42711b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f42712c;

    /* renamed from: d, reason: collision with root package name */
    public static final c f42713d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f42714e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f42715f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f42716g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f42717h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ c[] f42718i;

    enum a extends c {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // Zg.c
        boolean a(int i10, int i11) {
            return ((i10 + i11) & 1) == 0;
        }
    }

    private c(String str, int i10) {
    }

    abstract boolean a(int i10, int i11);

    final void b(Gg.b bVar, int i10) {
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
        f42710a = aVar;
        c cVar = new c("DATA_MASK_001", 1) { // from class: Zg.c.b
            {
                a aVar2 = null;
            }

            @Override // Zg.c
            boolean a(int i10, int i11) {
                return (i10 & 1) == 0;
            }
        };
        f42711b = cVar;
        c cVar2 = new c("DATA_MASK_010", 2) { // from class: Zg.c.c
            {
                a aVar2 = null;
            }

            @Override // Zg.c
            boolean a(int i10, int i11) {
                return i11 % 3 == 0;
            }
        };
        f42712c = cVar2;
        c cVar3 = new c("DATA_MASK_011", 3) { // from class: Zg.c.d
            {
                a aVar2 = null;
            }

            @Override // Zg.c
            boolean a(int i10, int i11) {
                return (i10 + i11) % 3 == 0;
            }
        };
        f42713d = cVar3;
        c cVar4 = new c("DATA_MASK_100", 4) { // from class: Zg.c.e
            {
                a aVar2 = null;
            }

            @Override // Zg.c
            boolean a(int i10, int i11) {
                return (((i10 / 2) + (i11 / 3)) & 1) == 0;
            }
        };
        f42714e = cVar4;
        c cVar5 = new c("DATA_MASK_101", 5) { // from class: Zg.c.f
            {
                a aVar2 = null;
            }

            @Override // Zg.c
            boolean a(int i10, int i11) {
                return (i10 * i11) % 6 == 0;
            }
        };
        f42715f = cVar5;
        c cVar6 = new c("DATA_MASK_110", 6) { // from class: Zg.c.g
            {
                a aVar2 = null;
            }

            @Override // Zg.c
            boolean a(int i10, int i11) {
                return (i10 * i11) % 6 < 3;
            }
        };
        f42716g = cVar6;
        c cVar7 = new c("DATA_MASK_111", 7) { // from class: Zg.c.h
            {
                a aVar2 = null;
            }

            @Override // Zg.c
            boolean a(int i10, int i11) {
                return (((i10 + i11) + ((i10 * i11) % 3)) & 1) == 0;
            }
        };
        f42717h = cVar7;
        f42718i = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
    }

    /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f42718i.clone();
    }
}
