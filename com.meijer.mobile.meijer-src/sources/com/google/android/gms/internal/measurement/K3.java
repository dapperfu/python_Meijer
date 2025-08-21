package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes6.dex */
final class K3 extends AbstractC10529f4 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f82652a;

    /* renamed from: b, reason: collision with root package name */
    private final De.w f82653b;

    @Override // com.google.android.gms.internal.measurement.AbstractC10529f4
    final Context a() {
        return this.f82652a;
    }

    public final boolean equals(Object obj) {
        De.w wVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC10529f4) {
            AbstractC10529f4 abstractC10529f4 = (AbstractC10529f4) obj;
            if (this.f82652a.equals(abstractC10529f4.a()) && ((wVar = this.f82653b) != null ? wVar.equals(abstractC10529f4.b()) : abstractC10529f4.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10529f4
    final De.w b() {
        return this.f82653b;
    }

    public final int hashCode() {
        int iHashCode = this.f82652a.hashCode() ^ 1000003;
        De.w wVar = this.f82653b;
        return (iHashCode * 1000003) ^ (wVar == null ? 0 : wVar.hashCode());
    }

    public final String toString() {
        String string = this.f82652a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.f82653b);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        sb2.append("FlagsContext{context=");
        sb2.append(string);
        sb2.append(", hermeticFileOverrides=");
        sb2.append(strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    K3(Context context, De.w wVar) {
        this.f82652a = context;
        this.f82653b = wVar;
    }
}
