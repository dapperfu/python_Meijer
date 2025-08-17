package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import com.fullstory.FS;

/* renamed from: com.google.android.gms.internal.clearcut.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10307k extends AbstractC10292f<Boolean> {
    C10307k(C10322p c10322p, String str, Boolean bool) {
        super(c10322p, str, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.AbstractC10292f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Boolean f(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f81422b, false));
        } catch (ClassCastException e10) {
            String strValueOf = String.valueOf(this.f81422b);
            FS.log_e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(strValueOf) : new String("Invalid boolean value in SharedPreferences for "), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10292f
    protected final /* synthetic */ Boolean m(String str) {
        if (v2.f81583c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (v2.f81584d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f81422b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str);
        FS.log_e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
