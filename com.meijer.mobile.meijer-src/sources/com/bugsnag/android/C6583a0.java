package com.bugsnag.android;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\nR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\nR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\nR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/a0;", "", "", "anrs", "ndkCrashes", "unhandledExceptions", "unhandledRejections", "<init>", "(ZZZZ)V", "detectErrors", "(Z)V", "a", "()Lcom/bugsnag/android/a0;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Z", "b", "()Z", "setAnrs", "c", "setNdkCrashes", "d", "setUnhandledExceptions", "e", "setUnhandledRejections", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.a0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6583a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean anrs;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean ndkCrashes;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean unhandledExceptions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean unhandledRejections;

    public C6583a0() {
        this(false, false, false, false, 15, null);
    }

    public C6583a0(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.anrs = z10;
        this.ndkCrashes = z11;
        this.unhandledExceptions = z12;
        this.unhandledRejections = z13;
    }

    public final C6583a0 a() {
        return new C6583a0(this.anrs, this.ndkCrashes, this.unhandledExceptions, this.unhandledRejections);
    }

    /* renamed from: b, reason: from getter */
    public final boolean getAnrs() {
        return this.anrs;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getNdkCrashes() {
        return this.ndkCrashes;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getUnhandledExceptions() {
        return this.unhandledExceptions;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getUnhandledRejections() {
        return this.unhandledRejections;
    }

    public boolean equals(Object other) {
        if (!(other instanceof C6583a0)) {
            return false;
        }
        C6583a0 c6583a0 = (C6583a0) other;
        return this.anrs == c6583a0.anrs && this.ndkCrashes == c6583a0.ndkCrashes && this.unhandledExceptions == c6583a0.unhandledExceptions && this.unhandledRejections == c6583a0.unhandledRejections;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.anrs) * 31) + Boolean.hashCode(this.ndkCrashes)) * 31) + Boolean.hashCode(this.unhandledExceptions)) * 31) + Boolean.hashCode(this.unhandledRejections);
    }

    public /* synthetic */ C6583a0(boolean z10, boolean z11, boolean z12, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13);
    }

    public C6583a0(boolean z10) {
        this(z10, z10, z10, z10);
    }
}
