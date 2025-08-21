package com.google.maps.internal.ratelimiter;

import com.google.maps.internal.ratelimiter.SmoothRateLimiter;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public abstract class RateLimiter {
    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    static abstract class SleepingStopwatch {
        protected abstract long readMicros();

        protected abstract void sleepMicrosUninterruptibly(long j10);

        public static SleepingStopwatch createFromSystemTimer() {
            return new SleepingStopwatch() { // from class: com.google.maps.internal.ratelimiter.RateLimiter.SleepingStopwatch.1
                final Stopwatch stopwatch = Stopwatch.createStarted();

                @Override // com.google.maps.internal.ratelimiter.RateLimiter.SleepingStopwatch
                protected long readMicros() {
                    return this.stopwatch.elapsed(TimeUnit.MICROSECONDS);
                }

                @Override // com.google.maps.internal.ratelimiter.RateLimiter.SleepingStopwatch
                protected void sleepMicrosUninterruptibly(long j10) {
                    if (j10 > 0) {
                        RateLimiter.sleepUninterruptibly(j10, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }

        protected SleepingStopwatch() {
        }
    }

    public static RateLimiter create(double d10) {
        return create(d10, SleepingStopwatch.createFromSystemTimer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sleepUninterruptibly(long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        try {
            long nanos = timeUnit.toNanos(j10);
            long jNanoTime = System.nanoTime() + nanos;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(nanos);
                    break;
                } catch (InterruptedException unused) {
                    z10 = true;
                    nanos = jNanoTime - System.nanoTime();
                }
            }
        } finally {
            if (z10) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public double acquire() {
        return acquire(1);
    }

    abstract double doGetRate();

    abstract void doSetRate(double d10, long j10);

    abstract long queryEarliestAvailable(long j10);

    abstract long reserveEarliestAvailable(int i10, long j10);

    public boolean tryAcquire(long j10, TimeUnit timeUnit) {
        return tryAcquire(1, j10, timeUnit);
    }

    private static void checkPermits(int i10) {
        Preconditions.checkArgument(i10 > 0, "Requested permits (%s) must be positive", Integer.valueOf(i10));
    }

    static RateLimiter create(double d10, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothBursty smoothBursty = new SmoothRateLimiter.SmoothBursty(sleepingStopwatch, 1.0d);
        smoothBursty.setRate(d10);
        return smoothBursty;
    }

    private Object mutex() {
        Object obj;
        Object obj2 = this.mutexDoNotUseDirectly;
        if (obj2 != null) {
            return obj2;
        }
        synchronized (this) {
            try {
                obj = this.mutexDoNotUseDirectly;
                if (obj == null) {
                    obj = new Object();
                    this.mutexDoNotUseDirectly = obj;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return obj;
    }

    public double acquire(int i10) {
        long jReserve = reserve(i10);
        this.stopwatch.sleepMicrosUninterruptibly(jReserve);
        return (jReserve * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public final void setRate(double d10) {
        Preconditions.checkArgument(d10 > 0.0d && !Double.isNaN(d10), "rate must be positive", new Object[0]);
        synchronized (mutex()) {
            doSetRate(d10, this.stopwatch.readMicros());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(int i10) {
        return tryAcquire(i10, 0L, TimeUnit.MICROSECONDS);
    }

    RateLimiter(SleepingStopwatch sleepingStopwatch) {
        this.stopwatch = (SleepingStopwatch) Preconditions.checkNotNull(sleepingStopwatch);
    }

    private boolean canAcquire(long j10, long j11) {
        if (queryEarliestAvailable(j10) - j11 <= j10) {
            return true;
        }
        return false;
    }

    public final double getRate() {
        double dDoGetRate;
        synchronized (mutex()) {
            dDoGetRate = doGetRate();
        }
        return dDoGetRate;
    }

    final long reserve(int i10) {
        long jReserveAndGetWaitLength;
        checkPermits(i10);
        synchronized (mutex()) {
            jReserveAndGetWaitLength = reserveAndGetWaitLength(i10, this.stopwatch.readMicros());
        }
        return jReserveAndGetWaitLength;
    }

    final long reserveAndGetWaitLength(int i10, long j10) {
        return Math.max(reserveEarliestAvailable(i10, j10) - j10, 0L);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public static RateLimiter create(double d10, long j10, TimeUnit timeUnit) {
        Preconditions.checkArgument(j10 >= 0, "warmupPeriod must not be negative: %s", Long.valueOf(j10));
        return create(d10, j10, timeUnit, 3.0d, SleepingStopwatch.createFromSystemTimer());
    }

    public boolean tryAcquire(int i10, long j10, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j10), 0L);
        checkPermits(i10);
        synchronized (mutex()) {
            try {
                long micros = this.stopwatch.readMicros();
                if (!canAcquire(micros, jMax)) {
                    return false;
                }
                this.stopwatch.sleepMicrosUninterruptibly(reserveAndGetWaitLength(i10, micros));
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static RateLimiter create(double d10, long j10, TimeUnit timeUnit, double d11, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new SmoothRateLimiter.SmoothWarmingUp(sleepingStopwatch, j10, timeUnit, d11);
        smoothWarmingUp.setRate(d10);
        return smoothWarmingUp;
    }
}
