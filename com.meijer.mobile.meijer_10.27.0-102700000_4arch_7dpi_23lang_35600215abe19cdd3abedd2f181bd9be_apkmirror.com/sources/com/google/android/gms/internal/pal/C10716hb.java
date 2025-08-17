package com.google.android.gms.internal.pal;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.pal.hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10716hb {

    /* renamed from: a, reason: collision with root package name */
    private final C10599ab f83157a;

    /* renamed from: b, reason: collision with root package name */
    private final List f83158b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f83159c;

    /* synthetic */ C10716hb(C10599ab c10599ab, List list, Integer num, C10700gb c10700gb) {
        this.f83157a = c10599ab;
        this.f83158b = list;
        this.f83159c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10716hb)) {
            return false;
        }
        C10716hb c10716hb = (C10716hb) obj;
        if (this.f83157a.equals(c10716hb.f83157a) && this.f83158b.equals(c10716hb.f83158b)) {
            Integer num = this.f83159c;
            Integer num2 = c10716hb.f83159c;
            if (num == num2) {
                return true;
            }
            if (num != null && num.equals(num2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f83157a, this.f83158b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f83157a, this.f83158b, this.f83159c);
    }
}
