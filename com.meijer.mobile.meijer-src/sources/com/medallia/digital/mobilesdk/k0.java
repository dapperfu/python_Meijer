package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s4;
import java.util.HashMap;

/* loaded from: classes8.dex */
abstract class k0<T> {

    /* renamed from: a, reason: collision with root package name */
    protected o6 f93230a;

    /* renamed from: b, reason: collision with root package name */
    protected l0 f93231b;

    /* renamed from: c, reason: collision with root package name */
    protected w f93232c;

    /* renamed from: d, reason: collision with root package name */
    protected n6<T> f93233d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f93234e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f93235f;

    k0(o6 o6Var, l0 l0Var, n6<T> n6Var) {
        this.f93230a = o6Var;
        this.f93231b = l0Var == null ? new l0() : l0Var;
        this.f93232c = new w(o6Var);
        this.f93233d = n6Var;
    }

    protected abstract h4 a(i6 i6Var);

    HashMap<String, String> a(s4.c cVar) {
        return this.f93232c.a(cVar);
    }

    protected abstract void b();

    protected void b(i6 i6Var) {
        int i10;
        if (i6Var.b() == 401 && (i10 = this.f93235f) < 2) {
            this.f93235f = i10 + 1;
            a();
        } else {
            n6<T> n6Var = this.f93233d;
            if (n6Var != null) {
                n6Var.a(a(i6Var));
            }
        }
    }

    protected void c() {
        if (this.f93234e) {
            a();
        } else {
            b();
        }
    }

    protected abstract h4 d();

    class a implements n6<Void> {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            k0.this.f93233d.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r12) {
            k0.this.b();
        }
    }

    HashMap<String, String> a(String str) {
        return this.f93232c.a(str);
    }

    protected void a() {
        this.f93232c.a(new a());
    }

    protected void a(boolean z10) {
        this.f93234e = z10;
    }
}
