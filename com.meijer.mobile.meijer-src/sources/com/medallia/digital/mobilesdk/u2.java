package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.o6;

/* loaded from: classes8.dex */
class u2 extends k0<String> {

    /* renamed from: g, reason: collision with root package name */
    private final String f93975g;

    class a implements o6.a {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            u2.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.e("LivingLens GetUrlMediaClient - success");
            u2.this.f93233d.a((n6<T>) k6Var.b());
        }
    }

    u2(o6 o6Var, l0 l0Var, n6<String> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.f93975g = l0Var.e();
        a(false);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 a(i6 i6Var) {
        return new s1(h4.a.f92978U);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected void b() {
        h4 h4VarD = d();
        if (h4VarD == null) {
            this.f93230a.a(this.f93975g, this.f93231b.c(), null, s4.f().i().f().a().intValue(), new a());
            return;
        }
        n6<T> n6Var = this.f93233d;
        if (n6Var != 0) {
            n6Var.a(h4VarD);
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 d() {
        if (!TextUtils.isEmpty(this.f93975g)) {
            return null;
        }
        h4.a aVar = h4.a.f92978U;
        a4.c(aVar.toString());
        return new s1(aVar);
    }
}
