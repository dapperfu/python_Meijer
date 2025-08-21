package com.bugsnag.android;

import R6.ImmutableConfig;
import com.bugsnag.android.e1;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/B0;", "Lcom/bugsnag/android/m;", "LR6/k;", "config", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "executor", "<init>", "(LR6/k;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V", "", "e", "()V", "", "d", "()Z", "a", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "launching", "Lcom/bugsnag/android/D0;", "c", "Lcom/bugsnag/android/D0;", "logger", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class B0 extends C6606m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ScheduledThreadPoolExecutor executor;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean launching;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    public /* synthetic */ B0(ImmutableConfig immutableConfig, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(immutableConfig, (i10 & 2) != 0 ? new ScheduledThreadPoolExecutor(1) : scheduledThreadPoolExecutor);
    }

    public final boolean d() {
        return this.launching.get();
    }

    public final void e() {
        this.executor.shutdown();
        this.launching.set(false);
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            e1.o oVar = new e1.o(false);
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((R6.r) it.next()).onStateChange(oVar);
            }
        }
        this.logger.d("App launch period marked as complete");
    }

    @JvmOverloads
    public B0(ImmutableConfig immutableConfig, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.executor = scheduledThreadPoolExecutor;
        this.launching = new AtomicBoolean(true);
        this.logger = immutableConfig.getLogger();
        long launchDurationMillis = immutableConfig.getLaunchDurationMillis();
        if (launchDurationMillis > 0) {
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            try {
                scheduledThreadPoolExecutor.schedule(new Runnable() { // from class: com.bugsnag.android.A0
                    @Override // java.lang.Runnable
                    public final void run() {
                        B0.c(this.f63871a);
                    }
                }, launchDurationMillis, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                this.logger.b("Failed to schedule timer for LaunchCrashTracker", e10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(B0 b02) {
        b02.e();
    }
}
