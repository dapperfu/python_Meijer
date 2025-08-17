package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.j8;
import com.medallia.digital.mobilesdk.o6;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class p5 {

    /* renamed from: b, reason: collision with root package name */
    private static p5 f92702b;

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<String> f92703a;

    class a implements n6<f6> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f92704a;

        a(MDResultCallback mDResultCallback) {
            this.f92704a = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(f6 f6Var) {
            p5.this.a(f6Var);
            MDResultCallback mDResultCallback = this.f92704a;
            if (mDResultCallback != null) {
                mDResultCallback.onSuccess();
            }
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            if (h4Var != null) {
                a4.c(h4Var.getMessage());
            }
            MDResultCallback mDResultCallback = this.f92704a;
            if (mDResultCallback != null) {
                mDResultCallback.onSuccess();
            }
        }
    }

    class b implements o6.a {
        b() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            a4.c((i6Var == null || i6Var.a() == null) ? "Can't fetch Configuration UUID (needed for OCQ UUID)" : i6Var.a().name());
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            if (k6Var == null || k6Var.b() == null) {
                a4.b("Response is null - can't fetch OCQ UUID");
                return;
            }
            ConfigurationUUID configurationUUIDCreateUUID = ModelFactory.getInstance().createUUID(k6Var.b());
            t0.c().a(configurationUUIDCreateUUID);
            j8.b(j8.b.OCQ_UUID, configurationUUIDCreateUUID.getOcqUuid());
            a4.e("OCQ UUID saved in storage");
        }
    }

    public static p5 a() {
        if (f92702b == null) {
            f92702b = new p5();
        }
        return f92702b;
    }

    private void b() {
        s4.f().a(new b());
    }

    private boolean d() {
        boolean zIsOCQEnabled;
        boolean z10;
        boolean zIsTREV2Enabled;
        boolean zB = x8.b();
        boolean z11 = t4.e().a(d7.a.OCQ_USER_ID) != null;
        if (t0.c().a() != null) {
            if (t0.c().a().propertyConfiguration != null) {
                zIsOCQEnabled = t0.c().a().propertyConfiguration.isOCQEnabled();
                if (!zIsOCQEnabled) {
                    z10 = false;
                } else if (t0.c().a().propertyConfiguration.getOmniChannelRulesIds() == null || t0.c().a().propertyConfiguration.getOmniChannelRulesIds().isEmpty()) {
                    f1.a().a(b0.a.QuarantineRule);
                    z10 = false;
                } else {
                    this.f92703a = t0.c().a().propertyConfiguration.getOmniChannelRulesIds();
                    z10 = true;
                }
            } else {
                zIsOCQEnabled = false;
                z10 = false;
            }
            zIsTREV2Enabled = (t0.c().a().sdkConfiguration == null || t0.c().a().sdkConfiguration.getMedalliaDigitalBrain() == null) ? false : t0.c().a().sdkConfiguration.getMedalliaDigitalBrain().isTREV2Enabled();
        } else {
            zIsOCQEnabled = false;
            z10 = false;
            zIsTREV2Enabled = false;
        }
        a4.b("isOCQEnabled - isOCQEnabled: " + zIsOCQEnabled);
        a4.b("isOCQEnabled - isTREV2: " + zIsTREV2Enabled);
        a4.b("isOCQEnabled - isUserIDSet: " + z11);
        a4.b("isOCQEnabled - isOCQRulesExists: " + z10);
        a4.b("isOCQEnabled - isNetWorkAvailable: " + zB);
        return zIsOCQEnabled && zIsTREV2Enabled && z11 && z10 && zB;
    }

    public JSONObject c() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rulesIds", new JSONArray(ModelFactory.getInstance().getStringArrayAsJsonString(this.f92703a)));
            jSONObject.put("cuid", t4.e().a(d7.a.OCQ_USER_ID));
            return jSONObject;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return jSONObject;
        }
    }

    void a(MDResultCallback mDResultCallback) {
        s4.f().a(c(), new a(mDResultCallback));
    }

    void b(MDResultCallback mDResultCallback) {
        if (d()) {
            a4.b("OCQ enabled");
            a(mDResultCallback);
        } else {
            a4.b("OCQ not enabled - can't validate rules");
            mDResultCallback.onSuccess();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(f6 f6Var) {
        if (f6Var != null && f6Var.d()) {
            ArrayList<g6> arrayListC = f6Var.c();
            f1 f1VarA = f1.a();
            b0.a aVar = b0.a.QuarantineRule;
            if (f1VarA.c(aVar) > 0) {
                f1.a().a(aVar);
            }
            Iterator<g6> it = arrayListC.iterator();
            while (it.hasNext()) {
                f1.a().b(it.next());
            }
            if (f6Var.b() != null) {
                j8.c(j8.b.C_UUID, f6Var.b());
            }
            if (f6Var.a() != null) {
                j8.b(j8.b.C_UUID, f6Var.a());
            }
        }
        if (t0.c() != null && t0.c().b() != null) {
            j8.b(j8.b.OCQ_UUID, t0.c().b().getOcqUuid());
        } else if (j8.b(j8.b.OCQ_UUID) == null && t0.c() != null && t0.c().b() == null) {
            b();
        }
        CollectorsInfrastructure.getInstance().isOCQRulesValidCollector.a(Boolean.TRUE);
    }
}
