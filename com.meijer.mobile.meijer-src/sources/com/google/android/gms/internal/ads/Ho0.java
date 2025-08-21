package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class Ho0 {

    /* renamed from: a, reason: collision with root package name */
    private final Bo0 f68348a;

    /* renamed from: b, reason: collision with root package name */
    private final List f68349b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f68350c;

    /* synthetic */ Ho0(Bo0 bo0, List list, Integer num, Go0 go0) {
        this.f68348a = bo0;
        this.f68349b = list;
        this.f68350c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ho0)) {
            return false;
        }
        Ho0 ho0 = (Ho0) obj;
        return this.f68348a.equals(ho0.f68348a) && this.f68349b.equals(ho0.f68349b) && Objects.equals(this.f68350c, ho0.f68350c);
    }

    public final int hashCode() {
        return Objects.hash(this.f68348a, this.f68349b);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f68348a, this.f68349b, this.f68350c);
    }
}
