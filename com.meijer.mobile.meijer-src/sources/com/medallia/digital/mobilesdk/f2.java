package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.b0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes8.dex */
class f2 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f92828b = 90;

    /* renamed from: a, reason: collision with root package name */
    private final Queue<c2> f92829a = new LinkedList();

    class a implements n6<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ c2 f92830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f92831b;

        a(c2 c2Var, b bVar) {
            this.f92830a = c2Var;
            this.f92831b = bVar;
        }

        private void a(c2 c2Var) {
            f2.this.f92829a.remove(c2Var);
            if (f2.this.f92829a.isEmpty()) {
                f2.this.a(null, this.f92831b);
                this.f92831b.onSuccess();
            } else {
                f2 f2Var = f2.this;
                f2Var.a((c2) f2Var.f92829a.poll(), this.f92831b);
            }
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("Stored feedback failed to submit. Feedback UUID: " + this.f92830a.b());
            a(this.f92830a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(Void r22) {
            a4.b("Stored feedback was submitted successfully. Feedback UUID: " + this.f92830a.b());
            a(this.f92830a);
        }
    }

    interface b {
        void a();

        void onSuccess();
    }

    f2() {
    }

    protected void a() {
        p4.d().c();
    }

    protected void a(c2 c2Var, b bVar) {
        if (c2Var == null) {
            return;
        }
        f1.a().a(c2Var);
        c2Var.f();
        s4.f().a(c2Var, new a(c2Var, bVar));
    }

    protected void a(b bVar) {
        f1 f1VarA = f1.a();
        b0.a aVar = b0.a.Feedback;
        ArrayList<? extends b0> arrayListC = f1VarA.c(aVar, new Object[0]);
        if (arrayListC == null || arrayListC.isEmpty()) {
            return;
        }
        AnalyticsBridge.getInstance().reportFeedbackRetryMechanismEvent(arrayListC.size());
        this.f92829a.addAll(arrayListC);
        a(this.f92829a.poll(), bVar);
        f1.a().a(aVar, Long.valueOf(System.currentTimeMillis() - 7776000000L));
    }
}
