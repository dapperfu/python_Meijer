package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Ho0 {

    /* renamed from: a, reason: collision with root package name */
    private final Bo0 f67508a;

    /* renamed from: b, reason: collision with root package name */
    private final List f67509b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f67510c;

    /* synthetic */ Ho0(Bo0 bo0, List list, Integer num, Go0 go0) {
        this.f67508a = bo0;
        this.f67509b = list;
        this.f67510c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ho0)) {
            return false;
        }
        Ho0 ho0 = (Ho0) obj;
        return this.f67508a.equals(ho0.f67508a) && this.f67509b.equals(ho0.f67509b) && Objects.equals(this.f67510c, ho0.f67510c);
    }

    public final int hashCode() {
        return Objects.hash(this.f67508a, this.f67509b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f67508a, this.f67509b, this.f67510c);
    }
}
