package com.scandit.datacapture.core.internal.module.utils;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f125326a;

    public final boolean equals(Object obj) {
        return (obj instanceof e) && this.f125326a == ((e) obj).f125326a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f125326a);
    }

    public final String toString() {
        return "Timestamp(value=" + this.f125326a + ')';
    }
}
