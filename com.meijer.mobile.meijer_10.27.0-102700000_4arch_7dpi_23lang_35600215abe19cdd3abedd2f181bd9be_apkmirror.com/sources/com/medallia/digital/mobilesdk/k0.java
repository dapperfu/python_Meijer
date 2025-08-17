package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s4;
import java.util.HashMap;

/* loaded from: classes7.dex */
abstract class k0<T> {

    /* renamed from: a, reason: collision with root package name */
    protected o6 f92391a;

    /* renamed from: b, reason: collision with root package name */
    protected l0 f92392b;

    /* renamed from: c, reason: collision with root package name */
    protected w f92393c;

    /* renamed from: d, reason: collision with root package name */
    protected n6<T> f92394d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f92395e = true;

    /* renamed from: f, reason: collision with root package name */
    private int f92396f;

    k0(o6 o6Var, l0 l0Var, n6<T> n6Var) {
        this.f92391a = o6Var;
        this.f92392b = l0Var == null ? new l0() : l0Var;
        this.f92393c = new w(o6Var);
        this.f92394d = n6Var;
    }

    protected abstract h4 a(i6 i6Var);

    HashMap<String, String> a(s4.c cVar) {
        return this.f92393c.a(cVar);
    }

    protected abstract void b();

    protected void b(i6 i6Var) {
        int i10;
        if (i6Var.b() == 401 && (i10 = this.f92396f) < 2) {
            this.f92396f = i10 + 1;
            a();
        } else {
            n6<T> n6Var = this.f92394d;
            if (n6Var != null) {
                n6Var.a(a(i6Var));
            }
        }
    }

    protected void c() {
        if (this.f92395e) {
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
            k0.this.f92394d.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r12) {
            k0.this.b();
        }
    }

    HashMap<String, String> a(String str) {
        return this.f92393c.a(str);
    }

    protected void a() {
        this.f92393c.a(new a());
    }

    protected void a(boolean z10) {
        this.f92395e = z10;
    }
}
