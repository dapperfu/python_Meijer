package com.medallia.digital.mobilesdk;

import android.util.Pair;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.j8;
import com.medallia.digital.mobilesdk.o6;
import j$.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes8.dex */
class h6 implements q0 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f93035h = "uuid";

    /* renamed from: a, reason: collision with root package name */
    private final w f93036a;

    /* renamed from: b, reason: collision with root package name */
    private final o6 f93037b;

    /* renamed from: c, reason: collision with root package name */
    private final String f93038c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, String> f93039d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f93040e;

    /* renamed from: f, reason: collision with root package name */
    private int f93041f;

    /* renamed from: g, reason: collision with root package name */
    private n6<u0> f93042g;

    class a implements o6.a {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            if (i6Var != null && i6Var.b() == 401) {
                a4.b("Remote configuration auth error");
                h6.this.a(i6Var);
            } else if (i6Var == null || i6Var.b() != -45) {
                a4.b("Remote configuration error trying to fetch offline");
                h6.this.a(false);
            } else {
                a4.b("Remote configuration no network errortrying to fetch offline");
                h6.this.a(true);
            }
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) throws JSONException {
            if (k6Var == null) {
                a4.c("Configuration response is null");
                h6.this.a(false);
                return;
            }
            String strB = k6Var.b();
            ConfigurationContract configurationContractCreateConfiguration = ModelFactory.getInstance().createConfiguration(strB);
            if (configurationContractCreateConfiguration == null) {
                a4.b("Remote configuration is broken trying to fetch offline");
                a4.c(h4.a.f92962E.toString());
                h6.this.a(false);
                return;
            }
            List<Pair<String, Boolean>> listA = v0.a(strB);
            if (listA != null) {
                for (Pair<String, Boolean> pair : listA) {
                    if (pair != null) {
                        AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) pair.first, ((Boolean) pair.second).booleanValue());
                    }
                }
            }
            if (configurationContractCreateConfiguration.getConfigurationUUID() != null) {
                a4.e("Saving UUID and UUID url");
                j8.b bVar = j8.b.CONFIGURATION_UUID;
                j8.b(bVar, configurationContractCreateConfiguration.getConfigurationUUID().getUuid());
                j8.c(bVar, configurationContractCreateConfiguration.getConfigurationUUID().getUrl());
            }
            a4.e("Configuration fetch finished - using configuration from remote server");
            a4.b("Configuration updated successfully");
            h6.this.f93042g.a((n6) new u0(configurationContractCreateConfiguration, true));
        }
    }

    h6(o6 o6Var, String str, HashMap<String, String> map, HashMap<String, String> map2) {
        this.f93037b = o6Var;
        this.f93036a = new w(o6Var);
        this.f93038c = str;
        this.f93039d = map;
        this.f93040e = map2;
    }

    class b implements n6<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ i6 f93044a;

        b(i6 i6Var) {
            this.f93044a = i6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            h6.this.a(this.f93044a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r22) {
            h6 h6Var = h6.this;
            h6Var.a(h6Var.f93042g);
        }
    }

    public void a(i6 i6Var) {
        int i10;
        if (i6Var.b() == 401 && (i10 = this.f93041f) < 2) {
            this.f93041f = i10 + 1;
            this.f93036a.a(new b(i6Var));
        } else {
            n6<u0> n6Var = this.f93042g;
            if (n6Var != null) {
                n6Var.a(new h4(h4.a.f92961D));
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.q0
    public void a(n6<u0> n6Var) {
        this.f93042g = n6Var;
        j8.b bVar = j8.b.CONFIGURATION_UUID;
        if (j8.b(bVar) != null) {
            try {
                this.f93039d.put(f93035h, URLEncoder.encode(j8.b(bVar), "UTF-8"));
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
        this.f93037b.a(this.f93038c, this.f93039d, this.f93040e, s4.f().i().c().a().intValue(), new a());
    }

    public void a(boolean z10) {
        (z10 ? new s3(true, new h4(h4.a.f92977T)) : new s3()).a(this.f93042g);
    }
}
