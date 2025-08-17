package com.google.android.gms.internal.measurement;

import com.fullstory.FS;

/* renamed from: com.google.android.gms.internal.measurement.b4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10368b4 extends AbstractC10449k4 {
    C10368b4(C10395e4 c10395e4, String str, Boolean bool, boolean z10) {
        super(c10395e4, str, bool, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10449k4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (E3.f81755c.matcher(str).matches()) {
                return Boolean.TRUE;
            }
            if (E3.f81756d.matcher(str).matches()) {
                return Boolean.FALSE;
            }
        }
        String str2 = this.f82253b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str2.length() + 28 + string.length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(string);
        FS.log_e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
