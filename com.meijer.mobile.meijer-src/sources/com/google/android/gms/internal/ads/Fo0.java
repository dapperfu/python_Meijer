package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class Fo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Ek0 f67701a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67702b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67703c;

    /* renamed from: d, reason: collision with root package name */
    private final String f67704d;

    /* synthetic */ Fo0(Ek0 ek0, int i10, String str, String str2, Go0 go0) {
        this.f67701a = ek0;
        this.f67702b = i10;
        this.f67703c = str;
        this.f67704d = str2;
    }

    public final int a() {
        return this.f67702b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Fo0)) {
            return false;
        }
        Fo0 fo0 = (Fo0) obj;
        return this.f67701a == fo0.f67701a && this.f67702b == fo0.f67702b && this.f67703c.equals(fo0.f67703c) && this.f67704d.equals(fo0.f67704d);
    }

    public final int hashCode() {
        return Objects.hash(this.f67701a, Integer.valueOf(this.f67702b), this.f67703c, this.f67704d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.f67701a, Integer.valueOf(this.f67702b), this.f67703c, this.f67704d);
    }
}
