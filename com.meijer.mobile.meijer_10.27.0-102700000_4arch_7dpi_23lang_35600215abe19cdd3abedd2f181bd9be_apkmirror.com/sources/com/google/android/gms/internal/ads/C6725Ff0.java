package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ff0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6725Ff0 implements Serializable, InterfaceC6691Ef0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f66836a;

    @Override // com.google.android.gms.internal.ads.InterfaceC6691Ef0
    public final boolean zza(Object obj) {
        for (int i10 = 0; i10 < this.f66836a.size(); i10++) {
            if (!((InterfaceC6691Ef0) this.f66836a.get(i10)).zza(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6725Ff0) {
            return this.f66836a.equals(((C6725Ff0) obj).f66836a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f66836a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z10 = true;
        for (Object obj : this.f66836a) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
