package com.bugsnag.android;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/X;", "", "", "notify", "sessions", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String notify;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessions;

    /* JADX WARN: Multi-variable type inference failed */
    public X() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.e(X.class, other == null ? null : other.getClass())) {
            return false;
        }
        if (other == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.bugsnag.android.EndpointConfiguration");
        }
        X x10 = (X) other;
        return Intrinsics.e(this.notify, x10.notify) && Intrinsics.e(this.sessions, x10.sessions);
    }

    public X(String str, String str2) {
        this.notify = str;
        this.sessions = str2;
    }

    /* renamed from: a, reason: from getter */
    public final String getNotify() {
        return this.notify;
    }

    /* renamed from: b, reason: from getter */
    public final String getSessions() {
        return this.sessions;
    }

    public int hashCode() {
        return (this.notify.hashCode() * 31) + this.sessions.hashCode();
    }

    public /* synthetic */ X(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "https://notify.bugsnag.com" : str, (i10 & 2) != 0 ? "https://sessions.bugsnag.com" : str2);
    }
}
