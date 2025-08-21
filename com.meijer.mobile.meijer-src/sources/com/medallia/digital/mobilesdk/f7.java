package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.i6;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.s4;
import java.util.HashMap;

/* loaded from: classes8.dex */
class f7 extends k0<Void> {

    class a implements o6.a {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            f7.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.e("Submitted digital analytics successfully");
            n6<T> n6Var = f7.this.f93233d;
            if (n6Var != 0) {
                n6Var.a((n6<T>) null);
            }
        }
    }

    f7(o6 o6Var, l0 l0Var, n6<Void> n6Var) {
        super(o6Var, l0Var, n6Var);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 a(i6 i6Var) {
        s1 s1Var = i6.a.NO_CONNECTION.equals(i6Var.a()) ? new s1(h4.a.f92997i) : i6.a.TIMEOUT.equals(i6Var.a()) ? new s1(h4.a.f92973P) : new s1(h4.a.f92973P);
        a4.c(s1Var.getMessage());
        return s1Var;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected void b() {
        a4.b("Submit Digital Analytics started");
        h4 h4VarD = d();
        if (h4VarD != null) {
            n6<T> n6Var = this.f93233d;
            if (n6Var != 0) {
                n6Var.a(h4VarD);
                return;
            }
            return;
        }
        HashMap<String, String> mapB = this.f93231b.b();
        mapB.putAll(a(s4.c.ACCESS_TOKEN));
        a4.b("Submitting digital analytics with body: " + this.f93231b.a().toString());
        this.f93230a.b(this.f93231b.e(), this.f93231b.c(), mapB, this.f93231b.a(), s4.f().i().d().a().intValue(), new a());
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 d() {
        if (w2.c().a() == null) {
            h4.a aVar = h4.a.f93008t;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (!TextUtils.isEmpty(this.f93231b.e())) {
            return null;
        }
        h4.a aVar2 = h4.a.f92974Q;
        a4.c(aVar2.toString());
        return new h4(aVar2);
    }
}
