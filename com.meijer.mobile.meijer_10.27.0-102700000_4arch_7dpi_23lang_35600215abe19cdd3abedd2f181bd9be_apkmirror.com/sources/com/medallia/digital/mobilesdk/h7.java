package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.h4;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
class h7 extends k0<String> {

    /* renamed from: g, reason: collision with root package name */
    private d5 f92207g;

    /* renamed from: h, reason: collision with root package name */
    private final b5 f92208h;

    /* renamed from: i, reason: collision with root package name */
    private final e5 f92209i;

    h7(e5 e5Var, b5 b5Var, o6 o6Var, l0 l0Var, n6<String> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.f92209i = e5Var;
        this.f92208h = b5Var;
        a(false);
    }

    protected void c(n6<String> n6Var) {
        a4.b("LivingLens uploadMediaCapture was called");
        new p8(this.f92391a, new l0(), new c(n6Var), this.f92207g, this.f92209i).c();
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 d() {
        if (TextUtils.isEmpty(this.f92392b.e())) {
            h4.a aVar = h4.a.f92145a0;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (this.f92209i != null) {
            return null;
        }
        h4.a aVar2 = h4.a.f92143Y;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }

    protected void e() {
        if (this.f92209i == null) {
            return;
        }
        a4.b("LivingLens Media Feedback Delete from DB? " + f1.a().a(this.f92209i) + " " + this.f92209i.d());
        boolean zDelete = new File(this.f92209i.e()).delete();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LivingLens Media File deleted? ");
        sb2.append(zDelete);
        a4.b(sb2.toString());
    }

    protected boolean f() {
        if (this.f92209i == null) {
            return false;
        }
        a4.b("LivingLens Media Feedback Saved in DB: " + this.f92209i.d());
        return f1.a().c(this.f92209i);
    }

    class a implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f92210a;

        /* renamed from: com.medallia.digital.mobilesdk.h7$a$a, reason: collision with other inner class name */
        class C1307a implements n6<String> {
            C1307a() {
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(h4 h4Var) {
                h7.this.f92394d.a(h4Var);
            }

            /* renamed from: com.medallia.digital.mobilesdk.h7$a$a$a, reason: collision with other inner class name */
            class C1308a implements n6<String> {
                C1308a() {
                }

                @Override // com.medallia.digital.mobilesdk.n6
                public void a(h4 h4Var) {
                    h7.this.f92394d.a(h4Var);
                }

                @Override // com.medallia.digital.mobilesdk.n6
                public void a(String str) throws JSONException {
                    h7.this.e();
                    AnalyticsBridge.getInstance().reportMediaCaptureSubmitEvent(h7.this.f92209i, AnalyticsBridge.c.success, null, h7.this.f92208h.b());
                    h7.this.f92394d.a((n6<T>) str);
                }
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(String str) {
                h7.this.b(new C1308a());
            }
        }

        a(boolean z10) {
            this.f92210a = z10;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            h7.this.f92394d.a(h4Var);
            h7 h7Var = h7.this;
            h7Var.a(h7Var.f92209i, this.f92210a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            try {
                h7.this.f92207g = new d5(new JSONObject(str));
                h7.this.c(new C1307a());
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    class b implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f92214a;

        b(n6 n6Var) {
            this.f92214a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f92214a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f92214a.a((n6) str);
        }
    }

    class c implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f92216a;

        c(n6 n6Var) {
            this.f92216a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f92216a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f92216a.a((n6) str);
        }
    }

    class d implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f92218a;

        d(n6 n6Var) {
            this.f92218a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f92218a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f92218a.a((n6) str);
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected void b() {
        h4 h4VarD = d();
        if (h4VarD != null) {
            n6<T> n6Var = this.f92394d;
            if (n6Var != 0) {
                n6Var.a(h4VarD);
                return;
            }
            return;
        }
        boolean zF = f();
        if (x8.b()) {
            a(new a(zF));
        } else {
            this.f92394d.a((h4) new s1(h4.a.f92146b0));
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 a(i6 i6Var) {
        return new s1(h4.a.f92144Z);
    }

    protected void b(n6<String> n6Var) {
        a4.b("LivingLens processMedia was called");
        new a6(this.f92391a, new l0(), this.f92209i, this.f92208h, this.f92207g, new d(n6Var)).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e5 e5Var, boolean z10) throws JSONException {
        AnalyticsBridge analyticsBridge;
        AnalyticsBridge.c cVar;
        if (z10) {
            analyticsBridge = AnalyticsBridge.getInstance();
            cVar = AnalyticsBridge.c.pending;
        } else {
            analyticsBridge = AnalyticsBridge.getInstance();
            cVar = AnalyticsBridge.c.failure;
        }
        analyticsBridge.reportMediaCaptureSubmitEvent(e5Var, cVar, null, this.f92208h.b());
    }

    protected void a(n6<String> n6Var) {
        a4.b("LivingLens getMediaPresignedUrl URL was called");
        new u2(this.f92391a, new l0(this.f92392b.e(), null, this.f92392b.c(), null), new b(n6Var)).c();
    }
}
