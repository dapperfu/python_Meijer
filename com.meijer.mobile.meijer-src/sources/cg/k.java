package cg;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public abstract class k {

    /* renamed from: b, reason: collision with root package name */
    public static final k f62472b = new a("TERABYTES", 0, 1099511627776L);

    /* renamed from: c, reason: collision with root package name */
    public static final k f62473c = new k("GIGABYTES", 1, 1073741824) { // from class: cg.k.b
        {
            a aVar = null;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final k f62474d = new k("MEGABYTES", 2, 1048576) { // from class: cg.k.c
        {
            a aVar = null;
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final k f62475e = new k("KILOBYTES", 3, 1024) { // from class: cg.k.d
        {
            a aVar = null;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final k f62476f = new k("BYTES", 4, 1) { // from class: cg.k.e
        {
            a aVar = null;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ k[] f62477g = a();

    /* renamed from: a, reason: collision with root package name */
    long f62478a;

    enum a extends k {
        a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }
    }

    /* synthetic */ k(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    private k(String str, int i10, long j10) {
        this.f62478a = j10;
    }

    private static /* synthetic */ k[] a() {
        return new k[]{f62472b, f62473c, f62474d, f62475e, f62476f};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f62477g.clone();
    }

    public long b(long j10) {
        return (j10 * this.f62478a) / f62475e.f62478a;
    }
}
