package ag;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f45452a;

    /* renamed from: b, reason: collision with root package name */
    private long f45453b;

    /* renamed from: c, reason: collision with root package name */
    private TimeUnit f45454c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45455a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f45455a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45455a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45455a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public double a() {
        int i10 = a.f45455a[this.f45454c.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f45452a / this.f45454c.toSeconds(this.f45453b) : (this.f45452a / this.f45453b) * TimeUnit.SECONDS.toMillis(1L) : (this.f45452a / this.f45453b) * TimeUnit.SECONDS.toMicros(1L) : (this.f45452a / this.f45453b) * TimeUnit.SECONDS.toNanos(1L);
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f45452a = j10;
        this.f45453b = j11;
        this.f45454c = timeUnit;
    }
}
