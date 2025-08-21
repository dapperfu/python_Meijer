package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.o6;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class p8 extends k0<String> {

    /* renamed from: g, reason: collision with root package name */
    private final e5 f93551g;

    /* renamed from: h, reason: collision with root package name */
    private final d5 f93552h;

    class a implements o6.a {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            p8.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.b("LivingLens UploadMediaClient - success");
            p8.this.f93233d.a((n6<T>) k6Var.b());
        }
    }

    p8(o6 o6Var, l0 l0Var, n6<String> n6Var, d5 d5Var, e5 e5Var) {
        super(o6Var, l0Var, n6Var);
        this.f93551g = e5Var;
        this.f93552h = d5Var;
        a(false);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 a(i6 i6Var) {
        return new s1(h4.a.f92979V);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected void b() {
        h4 h4VarD = d();
        if (h4VarD != null) {
            n6<T> n6Var = this.f93233d;
            if (n6Var != 0) {
                n6Var.a(h4VarD);
                return;
            }
            return;
        }
        try {
            this.f93230a.a(this.f93552h.b(), (HashMap<String, String>) null, (HashMap<String, String>) null, (JSONObject) null, this.f93551g.e(), s4.f().i().f().a().intValue(), new a());
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 d() {
        if (TextUtils.isEmpty(this.f93552h.b())) {
            h4.a aVar = h4.a.f92978U;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (this.f93551g != null) {
            return null;
        }
        h4.a aVar2 = h4.a.f92979V;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }
}
