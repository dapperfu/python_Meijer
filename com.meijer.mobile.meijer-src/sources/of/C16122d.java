package of;

import android.os.Bundle;
import nf.g;
import org.json.JSONException;
import org.json.JSONObject;
import pf.InterfaceC16421a;
import pf.InterfaceC16422b;

/* renamed from: of.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C16122d implements InterfaceC16120b, InterfaceC16422b {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC16421a f153868a;

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

    @Override // of.InterfaceC16120b
    public void N0(String str, Bundle bundle) {
        InterfaceC16421a interfaceC16421a = this.f153868a;
        if (interfaceC16421a != null) {
            try {
                interfaceC16421a.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                g.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // pf.InterfaceC16422b
    public void a(InterfaceC16421a interfaceC16421a) {
        this.f153868a = interfaceC16421a;
        g.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
