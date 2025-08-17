package j$.time.temporal;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f138955b;

    public /* synthetic */ l(int i10, int i11) {
        this.f138954a = i11;
        this.f138955b = i10;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        switch (this.f138954a) {
            case 0:
                int i10 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i11 = this.f138955b;
                if (i10 == i11) {
                    return temporal;
                }
                return temporal.b(i10 - i11 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int i12 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i13 = this.f138955b;
                if (i12 == i13) {
                    return temporal;
                }
                return temporal.c(i13 - i12 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
