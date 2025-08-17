package com.bugsnag.android;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/bugsnag/android/Q;", "", "", "notify", "sessions", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String notify;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String sessions;

    public Q(String str, String str2) {
        this.notify = str;
        this.sessions = str2;
    }

    public /* synthetic */ Q(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "https://notify.bugsnag.com" : str, (i10 & 2) != 0 ? "https://sessions.bugsnag.com" : str2);
    }

    /* renamed from: a, reason: from getter */
    public final String getNotify() {
        return this.notify;
    }

    /* renamed from: b, reason: from getter */
    public final String getSessions() {
        return this.sessions;
    }
}
