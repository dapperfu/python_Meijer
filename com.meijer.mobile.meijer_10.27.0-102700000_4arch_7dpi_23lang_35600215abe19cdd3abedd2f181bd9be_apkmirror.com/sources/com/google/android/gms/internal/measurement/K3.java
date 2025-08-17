package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes6.dex */
final class K3 extends AbstractC10404f4 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f81812a;

    /* renamed from: b, reason: collision with root package name */
    private final Be.w f81813b;

    @Override // com.google.android.gms.internal.measurement.AbstractC10404f4
    final Context a() {
        return this.f81812a;
    }

    public final boolean equals(Object obj) {
        Be.w wVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10404f4) {
            AbstractC10404f4 abstractC10404f4 = (AbstractC10404f4) obj;
            if (this.f81812a.equals(abstractC10404f4.a()) && ((wVar = this.f81813b) != null ? wVar.equals(abstractC10404f4.b()) : abstractC10404f4.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10404f4
    final Be.w b() {
        return this.f81813b;
    }

    public final int hashCode() {
        int iHashCode = this.f81812a.hashCode() ^ 1000003;
        Be.w wVar = this.f81813b;
        return (iHashCode * 1000003) ^ (wVar == null ? 0 : wVar.hashCode());
    }

    public final String toString() {
        String string = this.f81812a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f81813b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    K3(Context context, Be.w wVar) {
        this.f81812a = context;
        this.f81813b = wVar;
    }
}
