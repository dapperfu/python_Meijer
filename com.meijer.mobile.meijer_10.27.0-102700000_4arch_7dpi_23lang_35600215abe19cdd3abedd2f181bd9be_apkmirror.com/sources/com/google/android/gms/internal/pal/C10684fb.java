package com.google.android.gms.internal.pal;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.pal.fb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10684fb {

    /* renamed from: a, reason: collision with root package name */
    private final C7 f83128a;

    /* renamed from: b, reason: collision with root package name */
    private final int f83129b;

    /* renamed from: c, reason: collision with root package name */
    private final L7 f83130c;

    /* synthetic */ C10684fb(C7 c72, int i10, L7 l72, C10667eb c10667eb) {
        this.f83128a = c72;
        this.f83129b = i10;
        this.f83130c = l72;
    }

    public final int a() {
        return this.f83129b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10684fb)) {
            return false;
        }
        C10684fb c10684fb = (C10684fb) obj;
        return this.f83128a == c10684fb.f83128a && this.f83129b == c10684fb.f83129b && this.f83130c.equals(c10684fb.f83130c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f83128a, Integer.valueOf(this.f83129b), Integer.valueOf(this.f83130c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.f83128a, Integer.valueOf(this.f83129b), this.f83130c);
    }
}
