package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.xa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11095xa {

    /* renamed from: a, reason: collision with root package name */
    private final Class f85050a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f85051b;

    /* synthetic */ C11095xa(Class cls, Class cls2, C11079wa c11079wa) {
        this.f85050a = cls;
        this.f85051b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11095xa)) {
            return false;
        }
        C11095xa c11095xa = (C11095xa) obj;
        return c11095xa.f85050a.equals(this.f85050a) && c11095xa.f85051b.equals(this.f85051b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f85050a, this.f85051b});
    }

    public final String toString() {
        return this.f85050a.getSimpleName() + " with serialization type: " + this.f85051b.getSimpleName();
    }
}
