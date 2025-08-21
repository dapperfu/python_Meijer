package cg;

import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f62467a;

    /* renamed from: b, reason: collision with root package name */
    private long f62468b;

    /* renamed from: c, reason: collision with root package name */
    private TimeUnit f62469c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62470a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f62470a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62470a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f62470a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public double a() {
        int i10 = a.f62470a[this.f62469c.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? this.f62467a / this.f62469c.toSeconds(this.f62468b) : (this.f62467a / this.f62468b) * TimeUnit.SECONDS.toMillis(1L) : (this.f62467a / this.f62468b) * TimeUnit.SECONDS.toMicros(1L) : (this.f62467a / this.f62468b) * TimeUnit.SECONDS.toNanos(1L);
    }

    public i(long j10, long j11, TimeUnit timeUnit) {
        this.f62467a = j10;
        this.f62468b = j11;
        this.f62469c = timeUnit;
    }
}
