package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.h4;
import java.io.File;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes7.dex */
class s3 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    private h4 f92970a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f92971b;

    protected s3() {
        this.f92971b = false;
    }

    private void a() throws JSONException {
        List<Pair<String, Boolean>> listA = v0.a();
        if (listA != null) {
            for (Pair<String, Boolean> pair : listA) {
                if (pair != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) pair.first, ((Boolean) pair.second).booleanValue());
                }
            }
        }
    }

    private ConfigurationContract b() throws JSONException {
        File fileC = v0.c();
        ConfigurationContract configurationContractA = v0.a(fileC);
        if (!v0.a(fileC, configurationContractA)) {
            if (!this.f92971b) {
                this.f92970a = new s1(h4.a.f92119A);
                a();
            }
            a4.b("Local configuration is not available");
            return null;
        }
        if (this.f92971b) {
            long jA = d7.b().a(d7.a.LOCAL_CONFIGURATION_TIMESTAMP, 0L);
            if (jA == 0) {
                a4.e("Offline: local configuration timestamp: is not available");
                a();
                this.f92970a = new s1(h4.a.f92120B);
                return null;
            }
            if (v0.a(configurationContractA)) {
                a4.e("Offline: local configuration is expired. timestamp: " + jA);
                a();
                this.f92970a = new s1(h4.a.f92121C);
                return null;
            }
            AnalyticsBridge.getInstance().reportInitOfflineMechanismEvent(jA);
        }
        a4.e("Local configuration fetched successfully");
        return configurationContractA;
    }

    protected s3(boolean z10, h4 h4Var) {
        this.f92970a = h4Var;
        this.f92971b = z10;
    }

    @Override // com.medallia.digital.mobilesdk.q0
    public void a(n6<u0> n6Var) {
        ConfigurationContract configurationContractB = b();
        if (configurationContractB != null) {
            a4.b("Offline configuration fetched successfully");
            if (n6Var != null) {
                n6Var.a((n6<u0>) new u0(configurationContractB, false));
                return;
            }
            return;
        }
        a4.b("Offline configuration is not available");
        if (n6Var != null) {
            h4 h4Var = this.f92970a;
            if (h4Var != null) {
                n6Var.a(h4Var);
            } else {
                n6Var.a(new s1(h4.a.f92172w));
            }
        }
    }
}
