package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import com.fullstory.FS;

/* renamed from: com.google.android.gms.internal.clearcut.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10432k extends AbstractC10417f<Boolean> {
    C10432k(C10447p c10447p, String str, Boolean bool) {
        super(c10447p, str, bool, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.AbstractC10417f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final Boolean f(SharedPreferences sharedPreferences) {
        try {
            return Boolean.valueOf(sharedPreferences.getBoolean(this.f82262b, false));
        } catch (ClassCastException e10) {
            String strValueOf = String.valueOf(this.f82262b);
            FS.log_e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid boolean value in SharedPreferences for ".concat(strValueOf) : new String("Invalid boolean value in SharedPreferences for "), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10417f
    protected final /* synthetic */ Boolean m(String str) {
        if (v2.f82423c.matcher(str).matches()) {
            return Boolean.TRUE;
        }
        if (v2.f82424d.matcher(str).matches()) {
            return Boolean.FALSE;
        }
        String str2 = this.f82262b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 28 + String.valueOf(str).length());
        sb2.append("Invalid boolean value for ");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(str);
        FS.log_e("PhenotypeFlag", sb2.toString());
        return null;
    }
}
