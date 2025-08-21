package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.h4;
import com.medallia.digital.mobilesdk.i6;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.s4;
import java.io.File;

/* loaded from: classes8.dex */
class t2 extends k0<File> {

    /* renamed from: g, reason: collision with root package name */
    private final boolean f93877g;

    /* renamed from: h, reason: collision with root package name */
    private final String f93878h;

    class a implements o6.a {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(i6 i6Var) {
            t2.this.b(i6Var);
        }

        @Override // com.medallia.digital.mobilesdk.o6.a
        public void a(k6 k6Var) {
            a4.e("getResource - success");
            File fileA = g2.a(t2.this.f93878h, k6Var.a());
            n6<T> n6Var = t2.this.f93233d;
            if (n6Var != 0) {
                n6Var.a((n6<T>) fileA);
            }
        }
    }

    t2(o6 o6Var, l0 l0Var, String str, n6<File> n6Var, boolean z10) {
        super(o6Var, l0Var, n6Var);
        this.f93878h = str;
        this.f93877g = z10;
        a(z10);
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 a(i6 i6Var) {
        s1 s1Var = i6.a.NO_CONNECTION.equals(i6Var.a()) ? new s1(h4.a.f92997i) : i6.a.TIMEOUT.equals(i6Var.a()) ? new s1(h4.a.f92976S) : new s1(h4.a.f92975R);
        a4.c(s1Var.getMessage());
        return s1Var;
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected void b() {
        h4 h4VarD = d();
        if (h4VarD == null) {
            this.f93230a.a(l3.a(this.f93231b.e(), true), this.f93877g ? a(s4.c.ACCESS_TOKEN) : null, s4.f().i().h().a().intValue(), new a());
            return;
        }
        n6<T> n6Var = this.f93233d;
        if (n6Var != 0) {
            n6Var.a(h4VarD);
        }
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
        h4.a aVar2 = h4.a.f93010v;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }
}
