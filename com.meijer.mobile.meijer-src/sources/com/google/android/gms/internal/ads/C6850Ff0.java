package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.Ff0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6850Ff0 implements Serializable, InterfaceC6816Ef0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f67676a;

    @Override // com.google.android.gms.internal.ads.InterfaceC6816Ef0
    public final boolean zza(Object obj) {
        for (int i10 = 0; i10 < this.f67676a.size(); i10++) {
            if (!((InterfaceC6816Ef0) this.f67676a.get(i10)).zza(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6850Ff0) {
            return this.f67676a.equals(((C6850Ff0) obj).f67676a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f67676a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append("and(");
        boolean z10 = true;
        for (Object obj : this.f67676a) {
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
