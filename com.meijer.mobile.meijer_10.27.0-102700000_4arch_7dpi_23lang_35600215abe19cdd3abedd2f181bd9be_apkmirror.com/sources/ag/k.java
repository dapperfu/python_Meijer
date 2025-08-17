package ag;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f45457b = new a("TERABYTES", 0, 1099511627776L);

    /* renamed from: c, reason: collision with root package name */
    public static final k f45458c = new k("GIGABYTES", 1, 1073741824) { // from class: ag.k.b
        {
            a aVar = null;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final k f45459d = new k("MEGABYTES", 2, 1048576) { // from class: ag.k.c
        {
            a aVar = null;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final k f45460e = new k("KILOBYTES", 3, 1024) { // from class: ag.k.d
        {
            a aVar = null;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final k f45461f = new k("BYTES", 4, 1) { // from class: ag.k.e
        {
            a aVar = null;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ k[] f45462g = a();

    /* renamed from: a, reason: collision with root package name */
    long f45463a;

    enum a extends k {
        a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }
    }

    /* synthetic */ k(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    private k(String str, int i10, long j10) {
        this.f45463a = j10;
    }

    private static /* synthetic */ k[] a() {
        return new k[]{f45457b, f45458c, f45459d, f45460e, f45461f};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f45462g.clone();
    }

    public long b(long j10) {
        return (j10 * this.f45463a) / f45460e.f45463a;
    }
}
