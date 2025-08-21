package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;
import com.fullstory.FS;

/* renamed from: com.google.android.gms.internal.clearcut.l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10435l extends AbstractC10417f<String> {
    C10435l(C10447p c10447p, String str, String str2) {
        super(c10447p, str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.AbstractC10417f
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final String f(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.f82262b, null);
        } catch (ClassCastException e10) {
            String strValueOf = String.valueOf(this.f82262b);
            FS.log_e("PhenotypeFlag", strValueOf.length() != 0 ? "Invalid string value in SharedPreferences for ".concat(strValueOf) : new String("Invalid string value in SharedPreferences for "), e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.AbstractC10417f
    protected final /* synthetic */ String m(String str) {
        return str;
    }
}
