package com.google.android.gms.internal.pal;

import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.pal.hb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10841hb {

    /* renamed from: a, reason: collision with root package name */
    private final C10724ab f83997a;

    /* renamed from: b, reason: collision with root package name */
    private final List f83998b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f83999c;

    /* synthetic */ C10841hb(C10724ab c10724ab, List list, Integer num, C10825gb c10825gb) {
        this.f83997a = c10724ab;
        this.f83998b = list;
        this.f83999c = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C10841hb)) {
            return false;
        }
        C10841hb c10841hb = (C10841hb) obj;
        if (this.f83997a.equals(c10841hb.f83997a) && this.f83998b.equals(c10841hb.f83998b)) {
            Integer num = this.f83999c;
            Integer num2 = c10841hb.f83999c;
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
        return Arrays.hashCode(new Object[]{this.f83997a, this.f83998b});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.f83997a, this.f83998b, this.f83999c);
    }
}
