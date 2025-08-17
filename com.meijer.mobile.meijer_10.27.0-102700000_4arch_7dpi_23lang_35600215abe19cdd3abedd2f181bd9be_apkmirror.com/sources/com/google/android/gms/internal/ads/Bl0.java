package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Bl0 extends AbstractC7499al0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f65576a;

    /* renamed from: b, reason: collision with root package name */
    private final int f65577b;

    /* renamed from: c, reason: collision with root package name */
    private final int f65578c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final C10169zl0 f65579d;

    /* synthetic */ Bl0(int i10, int i11, int i12, C10169zl0 c10169zl0, Al0 al0) {
        this.f65576a = i10;
        this.f65577b = i11;
        this.f65579d = c10169zl0;
    }

    public static C10062yl0 d() {
        return new C10062yl0(null);
    }

    @Override // com.google.android.gms.internal.ads.Qk0
    public final boolean a() {
        return this.f65579d != C10169zl0.f80469d;
    }

    public final int b() {
        return this.f65577b;
    }

    public final int c() {
        return this.f65576a;
    }

    public final C10169zl0 e() {
        return this.f65579d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Bl0)) {
            return false;
        }
        Bl0 bl0 = (Bl0) obj;
        return bl0.f65576a == this.f65576a && bl0.f65577b == this.f65577b && bl0.f65579d == this.f65579d;
    }

    public final int hashCode() {
        return Objects.hash(Bl0.class, Integer.valueOf(this.f65576a), Integer.valueOf(this.f65577b), 16, this.f65579d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.f65579d) + ", " + this.f65577b + "-byte IV, 16-byte tag, and " + this.f65576a + "-byte key)";
    }
}
