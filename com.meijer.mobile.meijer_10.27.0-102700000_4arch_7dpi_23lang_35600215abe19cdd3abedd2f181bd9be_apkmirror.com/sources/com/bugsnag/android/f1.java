package com.bugsnag.android;

import Q6.ImmutableConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/f1;", "LR6/c;", "LR6/a;", "configModule", "Lcom/bugsnag/android/U0;", "storageModule", "Lcom/bugsnag/android/p;", "client", "LQ6/a;", "bgTaskService", "Lcom/bugsnag/android/o;", "callbackState", "<init>", "(LR6/a;Lcom/bugsnag/android/U0;Lcom/bugsnag/android/p;LQ6/a;Lcom/bugsnag/android/o;)V", "LQ6/f;", "b", "LQ6/f;", "config", "Lcom/bugsnag/android/r0;", "c", "Lcom/bugsnag/android/r0;", "d", "()Lcom/bugsnag/android/r0;", "launchCrashTracker", "Lcom/bugsnag/android/O0;", "Lcom/bugsnag/android/O0;", "e", "()Lcom/bugsnag/android/O0;", "sessionTracker", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class f1 extends R6.c {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C6491r0 launchCrashTracker;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final O0 sessionTracker;

    /* renamed from: d, reason: from getter */
    public final C6491r0 getLaunchCrashTracker() {
        return this.launchCrashTracker;
    }

    /* renamed from: e, reason: from getter */
    public final O0 getSessionTracker() {
        return this.sessionTracker;
    }

    public f1(R6.a aVar, U0 u02, C6487p c6487p, Q6.a aVar2, CallbackState callbackState) {
        ImmutableConfig config = aVar.getConfig();
        this.config = config;
        this.launchCrashTracker = new C6491r0(config, null, 2, null);
        this.sessionTracker = new O0(config, callbackState, c6487p, u02.j(), config.getLogger(), aVar2);
    }
}
