package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.T0;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/bugsnag/android/r0;", "Lcom/bugsnag/android/j;", "LQ6/f;", "config", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "executor", "<init>", "(LQ6/f;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V", "", "b", "()V", "", "a", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "launching", "Lcom/bugsnag/android/t0;", "Lcom/bugsnag/android/t0;", "logger", "c", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.r0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6491r0 extends C6475j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean launching;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ScheduledThreadPoolExecutor executor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.r0$a */
    static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C6491r0.this.b();
        }
    }

    public /* synthetic */ C6491r0(ImmutableConfig immutableConfig, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableConfig, (i10 & 2) != 0 ? new ScheduledThreadPoolExecutor(1) : scheduledThreadPoolExecutor);
    }

    @JvmOverloads
    public C6491r0(ImmutableConfig immutableConfig, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.executor = scheduledThreadPoolExecutor;
        this.launching = new AtomicBoolean(true);
        this.logger = immutableConfig.getLogger();
        long launchDurationMillis = immutableConfig.getLaunchDurationMillis();
        if (launchDurationMillis > 0) {
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                scheduledThreadPoolExecutor.schedule(new a(), launchDurationMillis, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                this.logger.b("Failed to schedule timer for LaunchCrashTracker", e10);
            }
        }
    }

    public final boolean a() {
        return this.launching.get();
    }

    public final void b() {
        this.executor.shutdown();
        this.launching.set(false);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            T0.o oVar = new T0.o(false);
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((Q6.l) it.next()).onStateChange(oVar);
            }
        }
        this.logger.d("App launch period marked as complete");
    }
}
