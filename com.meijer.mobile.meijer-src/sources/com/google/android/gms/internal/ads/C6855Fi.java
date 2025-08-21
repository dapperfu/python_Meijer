package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Fi, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C6855Fi implements InterfaceC7194Pi {
    C6855Fi() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
    public final /* bridge */ /* synthetic */ void a(Object obj, Map map) {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) obj;
        try {
            JSONArray jSONArray = new JSONArray((String) map.get("args"));
            SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(interfaceC9133ot.getContext()).edit();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                editorEdit.remove(jSONArray.getString(i10));
            }
            editorEdit.apply();
        } catch (JSONException e10) {
            Nc.v.s().x(e10, "GMSG clear local storage keys handler");
        }
    }
}
