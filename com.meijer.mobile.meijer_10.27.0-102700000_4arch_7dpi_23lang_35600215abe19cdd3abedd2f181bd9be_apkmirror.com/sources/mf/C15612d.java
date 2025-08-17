package mf;

import android.os.Bundle;
import lf.g;
import nf.InterfaceC15793a;
import nf.InterfaceC15794b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: mf.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C15612d implements InterfaceC15610b, InterfaceC15794b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC15793a f150081a;

    private static String b(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // mf.InterfaceC15610b
    public void N0(String str, Bundle bundle) {
        InterfaceC15793a interfaceC15793a = this.f150081a;
        if (interfaceC15793a != null) {
            try {
                interfaceC15793a.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // nf.InterfaceC15794b
    public void a(InterfaceC15793a interfaceC15793a) {
        this.f150081a = interfaceC15793a;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
