package com.bugsnag.android;

import Q6.ImmutableConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u001b\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 ¨\u0006\""}, d2 = {"Lcom/bugsnag/android/q0;", "", "LQ6/f;", "config", "<init>", "(LQ6/f;)V", "Lcom/bugsnag/android/p0;", "lastRunInfo", "", "g", "(Lcom/bugsnag/android/p0;)V", "e", "()Lcom/bugsnag/android/p0;", "", "key", "", "b", "(Ljava/lang/String;Ljava/lang/String;)I", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "f", "d", "Ljava/io/File;", "Ljava/io/File;", "c", "()Ljava/io/File;", "file", "Lcom/bugsnag/android/t0;", "Lcom/bugsnag/android/t0;", "logger", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "lock", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.q0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6490q0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File file;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    private final boolean a(String str, String str2) {
        return Boolean.parseBoolean(StringsKt.k1(str, str2 + '=', null, 2, null));
    }

    private final int b(String str, String str2) {
        return Integer.parseInt(StringsKt.k1(str, str2 + '=', null, 2, null));
    }

    private final LastRunInfo e() {
        if (!this.file.exists()) {
            return null;
        }
        List listA1 = StringsKt.a1(FilesKt.f(this.file, null, 1, null), new String[]{"\n"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA1) {
            if (!StringsKt.r0((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != 3) {
            this.logger.g("Unexpected number of lines when loading LastRunInfo. Skipping load. " + arrayList);
            return null;
        }
        try {
            LastRunInfo lastRunInfo = new LastRunInfo(b((String) arrayList.get(0), "consecutiveLaunchCrashes"), a((String) arrayList.get(1), "crashed"), a((String) arrayList.get(2), "crashedDuringLaunch"));
            this.logger.d("Loaded: " + lastRunInfo);
            return lastRunInfo;
        } catch (NumberFormatException e10) {
            this.logger.b("Failed to read consecutiveLaunchCrashes from saved lastRunInfo", e10);
            return null;
        }
    }

    private final void g(LastRunInfo lastRunInfo) {
        C6486o0 c6486o0 = new C6486o0();
        c6486o0.a("consecutiveLaunchCrashes", Integer.valueOf(lastRunInfo.getConsecutiveLaunchCrashes()));
        c6486o0.a("crashed", Boolean.valueOf(lastRunInfo.getCrashed()));
        c6486o0.a("crashedDuringLaunch", Boolean.valueOf(lastRunInfo.getCrashedDuringLaunch()));
        String string = c6486o0.toString();
        FilesKt.h(this.file, string, null, 2, null);
        this.logger.d("Persisted: " + string);
    }

    /* renamed from: c, reason: from getter */
    public final File getFile() {
        return this.file;
    }

    public final LastRunInfo d() {
        LastRunInfo lastRunInfoE;
        ReentrantReadWriteLock.ReadLock lock = this.lock.readLock();
        Intrinsics.f(lock, "lock.readLock()");
        lock.lock();
        try {
            lastRunInfoE = e();
        } catch (Throwable th2) {
            try {
                this.logger.b("Unexpectedly failed to load LastRunInfo.", th2);
                lastRunInfoE = null;
            } finally {
                lock.unlock();
            }
        }
        return lastRunInfoE;
    }

    public final void f(LastRunInfo lastRunInfo) {
        ReentrantReadWriteLock.WriteLock writeLock = this.lock.writeLock();
        Intrinsics.f(writeLock, "lock.writeLock()");
        writeLock.lock();
        try {
            g(lastRunInfo);
        } catch (Throwable th2) {
            this.logger.b("Unexpectedly failed to persist LastRunInfo.", th2);
        } finally {
        }
        Unit unit = Unit.f142422a;
    }

    public C6490q0(ImmutableConfig immutableConfig) {
        this.file = new File(immutableConfig.v().getValue(), "last-run-info");
        this.logger = immutableConfig.getLogger();
    }
}
