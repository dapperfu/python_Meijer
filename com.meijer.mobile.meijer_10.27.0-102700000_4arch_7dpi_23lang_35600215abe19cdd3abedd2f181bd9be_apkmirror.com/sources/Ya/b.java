package Ya;

/* loaded from: classes4.dex */
public abstract class b extends g {

    /* renamed from: m, reason: collision with root package name */
    private long f40214m;

    public b(Za.c cVar, Za.e eVar, String str) {
        this(cVar, eVar, str, 90000000L);
    }

    public b(Za.c cVar, Za.e eVar, String str, long j10) {
        super(cVar, eVar, str);
        this.f40214m = j10;
    }

    @Override // Ya.g
    public long z() {
        return this.f40214m;
    }

    @Override // Ya.g
    protected final long A() {
        return z() / 12;
    }

    @Override // Ya.c
    public long o() {
        return Math.min(w(), z() / 25);
    }
}
