package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Bl0 extends AbstractC7624al0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f66416a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66417b;

    /* renamed from: c, reason: collision with root package name */
    private final int f66418c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final C10294zl0 f66419d;

    /* synthetic */ Bl0(int i10, int i11, int i12, C10294zl0 c10294zl0, Al0 al0) {
        this.f66416a = i10;
        this.f66417b = i11;
        this.f66419d = c10294zl0;
    }

    public static C10187yl0 d() {
        return new C10187yl0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f66419d != C10294zl0.f81309d;
    }

    public final int b() {
        return this.f66417b;
    }

    public final int c() {
        return this.f66416a;
    }

    public final C10294zl0 e() {
        return this.f66419d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Bl0)) {
            return false;
        }
        Bl0 bl0 = (Bl0) obj;
        return bl0.f66416a == this.f66416a && bl0.f66417b == this.f66417b && bl0.f66419d == this.f66419d;
    }

    public final int hashCode() {
        return Objects.hash(Bl0.class, Integer.valueOf(this.f66416a), Integer.valueOf(this.f66417b), 16, this.f66419d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f66419d) + ", " + this.f66417b + "-byte IV, 16-byte tag, and " + this.f66416a + "-byte key)";
    }
}
