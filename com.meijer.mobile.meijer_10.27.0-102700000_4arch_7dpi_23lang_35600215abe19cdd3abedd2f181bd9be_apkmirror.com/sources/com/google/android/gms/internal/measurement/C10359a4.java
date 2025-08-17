package com.google.android.gms.internal.measurement;

import com.fullstory.FS;

/* renamed from: com.google.android.gms.internal.measurement.a4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10359a4 extends AbstractC10449k4 {
    C10359a4(C10395e4 c10395e4, String str, Long l10, boolean z10) {
        super(c10395e4, str, l10, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC10449k4
    final /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.f82253b;
        String string = obj.toString();
        StringBuilder sb2 = new StringBuilder(str.length() + 25 + string.length());
        sb2.append("Invalid long value for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(string);
        FS.log_e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
