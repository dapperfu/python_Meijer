package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Fi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6730Fi implements InterfaceC7069Pi {
    C6730Fi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(interfaceC9008ot.getContext()).edit();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                editorEdit.remove(jSONArray.getString(i10));
            }
            editorEdit.apply();
        } catch (JSONException e10) {
            Lc.v.s().x(e10, "GMSG clear local storage keys handler");
        }
    }
}
