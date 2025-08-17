package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.xa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10970xa {

    /* renamed from: a, reason: collision with root package name */
    private final Class f84210a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f84211b;

    /* synthetic */ C10970xa(Class cls, Class cls2, C10954wa c10954wa) {
        this.f84210a = cls;
        this.f84211b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10970xa)) {
            return false;
        }
        C10970xa c10970xa = (C10970xa) obj;
        return c10970xa.f84210a.equals(this.f84210a) && c10970xa.f84211b.equals(this.f84211b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f84210a, this.f84211b});
    }

    public final String toString() {
        return this.f84210a.getSimpleName() + " with serialization type: " + this.f84211b.getSimpleName();
    }
}
