package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.i6;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.s4;
import j$.net.URLEncoder;
import java.util.HashMap;

/* loaded from: classes8.dex */
class w {

    /* renamed from: b, reason: collision with root package name */
    private static final String f94038b = "sdkVersion";

    /* renamed from: c, reason: collision with root package name */
    private static final String f94039c = "osType";

    /* renamed from: a, reason: collision with root package name */
    private final o6 f94040a;

    class a implements o6.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f94041a;

        a(n6 n6Var) {
            this.f94041a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            h4 h4VarA = w.this.a(i6Var);
            a4.c("Get access token error = " + i6Var.a());
            n6 n6Var = this.f94041a;
            if (n6Var != null) {
                n6Var.a(h4VarA);
            }
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            h4.a aVarA = w2.c().a(k6Var != null ? k6Var.b() : null);
            if (aVarA == null) {
                a4.e("Access Token updated successfully");
                t4.e().a(d7.a.ACCESS_TOKEN, w2.c().a() != null ? w2.c().a().a() : null);
                this.f94041a.a((n6) null);
            } else {
                a4.c("Could not parse access token");
                n6 n6Var = this.f94041a;
                if (n6Var != null) {
                    n6Var.a((h4) new s1(aVarA));
                }
            }
        }
    }

    w(o6 o6Var) {
        this.f94040a = o6Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h4 a(i6 i6Var) {
        s1 s1Var = i6.a.NO_CONNECTION.equals(i6Var.a()) ? new s1(h4.a.f92998j) : i6.a.TIMEOUT.equals(i6Var.a()) ? new s1(h4.a.f92999k) : new s1(h4.a.f92993g);
        a4.c(s1Var.getMessage());
        return s1Var;
    }

    private boolean b() {
        return System.currentTimeMillis() - w2.c().a().b() > w2.c().a().e() - s4.f().b();
    }

    private HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(f94038b, URLEncoder.encode("4.8.1", "UTF-8"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        try {
            map.put(f94039c, URLEncoder.encode("android", "UTF-8"));
        } catch (Exception e11) {
            a4.c(e11.getMessage());
        }
        return map;
    }

    HashMap<String, String> a(s4.c cVar) {
        String str;
        HashMap<String, String> map = new HashMap<>();
        if (cVar == s4.c.ACCESS_TOKEN && w2.c().a() != null && !TextUtils.isEmpty(w2.c().a().a())) {
            str = String.format("%s%s", "Bearer_", w2.c().a().a());
        } else {
            if (cVar != s4.c.API_TOKEN || w2.c().b() == null || TextUtils.isEmpty(w2.c().b().a())) {
                return map;
            }
            str = String.format("%s%s", "Bearer_", w2.c().b().a());
        }
        map.put("Authorization", str);
        return map;
    }

    HashMap<String, String> a(String str) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Authorization", String.format("%s%s", "Bearer_", str));
        return map;
    }

    protected void a(n6<Void> n6Var) {
        if (w2.c().b() == null) {
            if (n6Var != null) {
                n6Var.a(new s1(h4.a.f93000l));
                return;
            }
            return;
        }
        if (w2.c().a() == null) {
            String strA = t4.e().a(d7.a.ACCESS_TOKEN);
            if (!TextUtils.isEmpty(strA)) {
                w2.c().a(ModelFactory.getInstance().createAccessToken(strA));
                if (w2.c().a() == null) {
                    if (n6Var != null) {
                        n6Var.a(new s1(h4.a.f93001m));
                        return;
                    }
                    return;
                }
            }
        }
        if (w2.c().a() != null && !b()) {
            n6Var.a((n6<Void>) null);
            return;
        }
        if (!TextUtils.isEmpty(w2.c().b().b())) {
            a4.b("Get and store access token started");
            this.f94040a.b(w2.c().b().b(), a(), a(s4.c.API_TOKEN), null, s4.f().i().a().a().intValue(), new a(n6Var));
        } else if (n6Var != null) {
            n6Var.a(new s1(h4.a.f92995h));
        }
    }
}
