package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.fb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10809fb {

    /* renamed from: a, reason: collision with root package name */
    private final C7 f83968a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83969b;

    /* renamed from: c, reason: collision with root package name */
    private final L7 f83970c;

    /* synthetic */ C10809fb(C7 c72, int i10, L7 l72, C10792eb c10792eb) {
        this.f83968a = c72;
        this.f83969b = i10;
        this.f83970c = l72;
    }

    public final int a() {
        return this.f83969b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10809fb)) {
            return false;
        }
        C10809fb c10809fb = (C10809fb) obj;
        return this.f83968a == c10809fb.f83968a && this.f83969b == c10809fb.f83969b && this.f83970c.equals(c10809fb.f83970c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f83968a, Integer.valueOf(this.f83969b), Integer.valueOf(this.f83970c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.f83968a, Integer.valueOf(this.f83969b), this.f83970c);
    }
}
