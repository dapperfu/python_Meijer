package j$.time.temporal;

/* loaded from: classes3.dex */
public final /* synthetic */ class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f139545b;

    public /* synthetic */ l(int i10, int i11) {
        this.f139544a = i11;
        this.f139545b = i10;
    }

    @Override // j$.time.temporal.k
    public final Temporal f(Temporal temporal) {
        switch (this.f139544a) {
            case 0:
                int i10 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i11 = this.f139545b;
                if (i10 == i11) {
                    return temporal;
                }
                return temporal.b(i10 - i11 >= 0 ? 7 - r0 : -r0, ChronoUnit.DAYS);
            default:
                int i12 = temporal.get(ChronoField.DAY_OF_WEEK);
                int i13 = this.f139545b;
                if (i12 == i13) {
                    return temporal;
                }
                return temporal.c(i13 - i12 >= 0 ? 7 - r1 : -r1, ChronoUnit.DAYS);
        }
    }
}
