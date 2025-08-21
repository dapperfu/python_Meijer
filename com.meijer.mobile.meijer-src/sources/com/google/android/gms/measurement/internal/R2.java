package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* loaded from: classes6.dex */
final class R2 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    private final long f86027a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f86028b;

    /* renamed from: c, reason: collision with root package name */
    private final String f86029c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ T2 f86030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R2(T2 t22, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        Objects.requireNonNull(t22);
        this.f86030d = t22;
        com.google.android.gms.common.internal.r.l(str);
        long andIncrement = T2.f86065k.getAndIncrement();
        this.f86027a = andIncrement;
        this.f86029c = str;
        this.f86028b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            t22.f85708a.a().m().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        R2 r22 = (R2) obj;
        boolean z10 = r22.f86028b;
        boolean z11 = this.f86028b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.f86027a;
        long j11 = r22.f86027a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f86030d.f85708a.a().n().b("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th2) {
        this.f86030d.f85708a.a().m().b(this.f86029c, th2);
        super.setException(th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    R2(T2 t22, Callable callable, boolean z10, String str) {
        super(callable);
        Objects.requireNonNull(t22);
        this.f86030d = t22;
        com.google.android.gms.common.internal.r.l("Task exception on worker thread");
        long andIncrement = T2.f86065k.getAndIncrement();
        this.f86027a = andIncrement;
        this.f86029c = "Task exception on worker thread";
        this.f86028b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            t22.f85708a.a().m().a("Tasks index overflow");
        }
    }
}
