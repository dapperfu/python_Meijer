package com.scandit.datacapture.core.internal.module.utils;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f126278a;

    public final boolean equals(Object obj) {
        return (obj instanceof e) && this.f126278a == ((e) obj).f126278a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f126278a);
    }

    public final String toString() {
        return "Timestamp(value=" + this.f126278a + ')';
    }
}
