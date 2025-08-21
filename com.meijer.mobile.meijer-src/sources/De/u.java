package De;

import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final A f6172a = A.b();

    /* renamed from: b, reason: collision with root package name */
    private boolean f6173b;

    /* renamed from: c, reason: collision with root package name */
    private long f6174c;

    /* renamed from: d, reason: collision with root package name */
    private long f6175d;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6176a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f6176a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6176a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6176a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6176a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6176a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6176a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6176a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static String a(TimeUnit timeUnit) {
        switch (a.f6176a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    private static TimeUnit b(long j10) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j10, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j10, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j10, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j10, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j10, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j10, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static u c() {
        return new u();
    }

    private long e() {
        return this.f6173b ? (this.f6172a.a() - this.f6175d) + this.f6174c : this.f6174c;
    }

    public u f() {
        this.f6174c = 0L;
        this.f6173b = false;
        return this;
    }

    public u g() {
        p.x(!this.f6173b, "This stopwatch is already running.");
        this.f6173b = true;
        this.f6175d = this.f6172a.a();
        return this;
    }

    u() {
    }

    public long d(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jE = e();
        TimeUnit timeUnitB = b(jE);
        return o.b(jE / TimeUnit.NANOSECONDS.convert(1L, timeUnitB)) + " " + a(timeUnitB);
    }
}
