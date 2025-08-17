package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Fo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ek0 f66861a;

    /* renamed from: b, reason: collision with root package name */
    private final int f66862b;

    /* renamed from: c, reason: collision with root package name */
    private final String f66863c;

    /* renamed from: d, reason: collision with root package name */
    private final String f66864d;

    /* synthetic */ Fo0(Ek0 ek0, int i10, String str, String str2, Go0 go0) {
        this.f66861a = ek0;
        this.f66862b = i10;
        this.f66863c = str;
        this.f66864d = str2;
    }

    public final int a() {
        return this.f66862b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Fo0)) {
            return false;
        }
        Fo0 fo0 = (Fo0) obj;
        return this.f66861a == fo0.f66861a && this.f66862b == fo0.f66862b && this.f66863c.equals(fo0.f66863c) && this.f66864d.equals(fo0.f66864d);
    }

    public final int hashCode() {
        return Objects.hash(this.f66861a, Integer.valueOf(this.f66862b), this.f66863c, this.f66864d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f66861a, Integer.valueOf(this.f66862b), this.f66863c, this.f66864d);
    }
}
