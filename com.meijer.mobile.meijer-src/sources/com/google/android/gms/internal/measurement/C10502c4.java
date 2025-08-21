package com.google.android.gms.internal.measurement;

import com.fullstory.FS;

/* renamed from: com.google.android.gms.internal.measurement.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10502c4 extends AbstractC10574k4 {
    C10502c4(C10520e4 c10520e4, String str, Double d10, boolean z10) {
        super(c10520e4, "measurement.test.double_flag", d10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10574k4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f83093b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 27 + string.length());
        sb2.append("Invalid double value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        FS.log_e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
