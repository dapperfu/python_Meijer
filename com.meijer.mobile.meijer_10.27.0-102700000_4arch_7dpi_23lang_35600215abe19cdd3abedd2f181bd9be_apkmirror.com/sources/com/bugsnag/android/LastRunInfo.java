package com.bugsnag.android;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/p0;", "", "", "consecutiveLaunchCrashes", "", "crashed", "crashedDuringLaunch", "<init>", "(IZZ)V", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "b", "Z", "()Z", "c", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.p0, reason: case insensitive filesystem and from toString */
/* loaded from: classes4.dex */
public final class LastRunInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int consecutiveLaunchCrashes;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean crashed;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean crashedDuringLaunch;

    /* renamed from: a, reason: from getter */
    public final int getConsecutiveLaunchCrashes() {
        return this.consecutiveLaunchCrashes;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getCrashed() {
        return this.crashed;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getCrashedDuringLaunch() {
        return this.crashedDuringLaunch;
    }

    public String toString() {
        return "LastRunInfo(consecutiveLaunchCrashes=" + this.consecutiveLaunchCrashes + ", crashed=" + this.crashed + ", crashedDuringLaunch=" + this.crashedDuringLaunch + ')';
    }

    public LastRunInfo(int i10, boolean z10, boolean z11) {
        this.consecutiveLaunchCrashes = i10;
        this.crashed = z10;
        this.crashedDuringLaunch = z11;
    }
}
