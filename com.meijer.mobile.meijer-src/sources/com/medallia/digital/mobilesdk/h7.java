package com.medallia.digital.mobilesdk;

import android.text.TextUtils;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.h4;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class h7 extends k0<String> {

    /* renamed from: g, reason: collision with root package name */
    private d5 f93046g;

    /* renamed from: h, reason: collision with root package name */
    private final b5 f93047h;

    /* renamed from: i, reason: collision with root package name */
    private final e5 f93048i;

    h7(e5 e5Var, b5 b5Var, o6 o6Var, l0 l0Var, n6<String> n6Var) {
        super(o6Var, l0Var, n6Var);
        this.f93048i = e5Var;
        this.f93047h = b5Var;
        a(false);
    }

    protected void c(n6<String> n6Var) {
        a4.b("LivingLens uploadMediaCapture was called");
        new p8(this.f93230a, new l0(), new c(n6Var), this.f93046g, this.f93048i).c();
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 d() {
        if (TextUtils.isEmpty(this.f93231b.e())) {
            h4.a aVar = h4.a.f92984a0;
            a4.c(aVar.toString());
            return new s1(aVar);
        }
        if (this.f93048i != null) {
            return null;
        }
        h4.a aVar2 = h4.a.f92982Y;
        a4.c(aVar2.toString());
        return new s1(aVar2);
    }

    protected void e() {
        if (this.f93048i == null) {
            return;
        }
        a4.b("LivingLens Media Feedback Delete from DB? " + f1.a().a(this.f93048i) + " " + this.f93048i.d());
        boolean zDelete = new File(this.f93048i.e()).delete();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LivingLens Media File deleted? ");
        sb2.append(zDelete);
        a4.b(sb2.toString());
    }

    protected boolean f() {
        if (this.f93048i == null) {
            return false;
        }
        a4.b("LivingLens Media Feedback Saved in DB: " + this.f93048i.d());
        return f1.a().c(this.f93048i);
    }

    class a implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f93049a;

        /* renamed from: com.medallia.digital.mobilesdk.h7$a$a, reason: collision with other inner class name */
        class C1316a implements n6<String> {
            C1316a() {
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(h4 h4Var) {
                h7.this.f93233d.a(h4Var);
            }

            /* renamed from: com.medallia.digital.mobilesdk.h7$a$a$a, reason: collision with other inner class name */
            class C1317a implements n6<String> {
                C1317a() {
                }

                @Override // com.medallia.digital.mobilesdk.n6
                public void a(h4 h4Var) {
                    h7.this.f93233d.a(h4Var);
                }

                @Override // com.medallia.digital.mobilesdk.n6
                public void a(String str) throws JSONException {
                    h7.this.e();
                    AnalyticsBridge.getInstance().reportMediaCaptureSubmitEvent(h7.this.f93048i, AnalyticsBridge.c.success, null, h7.this.f93047h.b());
                    h7.this.f93233d.a((n6<T>) str);
                }
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(String str) {
                h7.this.b(new C1317a());
            }
        }

        a(boolean z10) {
            this.f93049a = z10;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            h7.this.f93233d.a(h4Var);
            h7 h7Var = h7.this;
            h7Var.a(h7Var.f93048i, this.f93049a);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            try {
                h7.this.f93046g = new d5(new JSONObject(str));
                h7.this.c(new C1316a());
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    class b implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f93053a;

        b(n6 n6Var) {
            this.f93053a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f93053a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f93053a.a((n6) str);
        }
    }

    class c implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f93055a;

        c(n6 n6Var) {
            this.f93055a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f93055a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f93055a.a((n6) str);
        }
    }

    class d implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f93057a;

        d(n6 n6Var) {
            this.f93057a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f93057a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f93057a.a((n6) str);
        }
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
        boolean zF = f();
        if (x8.b()) {
            a(new a(zF));
        } else {
            this.f93233d.a((h4) new s1(h4.a.f92985b0));
        }
    }

    @Override // com.medallia.digital.mobilesdk.k0
    protected h4 a(i6 i6Var) {
        return new s1(h4.a.f92983Z);
    }

    protected void b(n6<String> n6Var) {
        a4.b("LivingLens processMedia was called");
        new a6(this.f93230a, new l0(), this.f93048i, this.f93047h, this.f93046g, new d(n6Var)).c();
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
        analyticsBridge.reportMediaCaptureSubmitEvent(e5Var, cVar, null, this.f93047h.b());
    }

    protected void a(n6<String> n6Var) {
        a4.b("LivingLens getMediaPresignedUrl URL was called");
        new u2(this.f93230a, new l0(this.f93231b.e(), null, this.f93231b.c(), null), new b(n6Var)).c();
    }
}
