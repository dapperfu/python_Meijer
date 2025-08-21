package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.DialogInterface;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.e3;

/* loaded from: classes8.dex */
final class d3 implements LifeCycle.f {

    /* renamed from: k, reason: collision with root package name */
    private static d3 f92602k;

    /* renamed from: a, reason: collision with root package name */
    private final f3 f92603a;

    /* renamed from: b, reason: collision with root package name */
    private InviteData f92604b;

    /* renamed from: c, reason: collision with root package name */
    private androidx.appcompat.app.c f92605c;

    /* renamed from: d, reason: collision with root package name */
    private DialogInterface.OnClickListener f92606d;

    /* renamed from: e, reason: collision with root package name */
    private InviteData f92607e;

    /* renamed from: f, reason: collision with root package name */
    private j4 f92608f;

    /* renamed from: g, reason: collision with root package name */
    private h f92609g;

    /* renamed from: h, reason: collision with root package name */
    private MDAppearanceMode f92610h = MDAppearanceMode.light;

    /* renamed from: i, reason: collision with root package name */
    private boolean f92611i;

    /* renamed from: j, reason: collision with root package name */
    private v5 f92612j;

    class a extends v4 {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            d3.this.g();
        }
    }

    class b extends v4 {
        b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            d3.this.f();
        }
    }

    class c extends x {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.x
        void a() {
            d3.this.a(Boolean.TRUE);
        }

        @Override // com.medallia.digital.mobilesdk.x
        void b(e3 e3Var) {
            d3.this.f92603a.a((e3.b) null);
            d3.this.f92608f = null;
            d3.this.a(Boolean.FALSE);
        }

        @Override // com.medallia.digital.mobilesdk.x
        void c(e3 e3Var) {
            if (d3.this.f92606d != null) {
                d3.this.f92606d.onClick(null, 0);
            }
            d3.this.f92603a.a((e3.b) null);
            d3.this.f92608f = null;
        }

        @Override // com.medallia.digital.mobilesdk.x
        void a(e3 e3Var) {
            d3.this.f92603a.a((e3.b) null);
            d3.this.f92608f = null;
            d3.this.a(Boolean.FALSE);
        }

        @Override // com.medallia.digital.mobilesdk.x
        void a(j4 j4Var) {
        }
    }

    class d implements DialogInterface.OnClickListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (d3.this.f92606d != null) {
                d3.this.f92606d.onClick(dialogInterface, i10);
            }
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                d3.this.f92605c = null;
            }
            d3.this.f92603a.a((e3.b) null);
        }
    }

    class e implements DialogInterface.OnClickListener {
        e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                d3.this.f92605c = null;
            }
            d3.this.f92603a.a((e3.b) null);
            d3.this.a(Boolean.FALSE);
        }
    }

    class f implements DialogInterface.OnClickListener {
        f() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                d3.this.f92605c = null;
            }
            d3.this.f92603a.a((e3.b) null);
            d3.this.a(Boolean.FALSE);
        }
    }

    class g implements DialogInterface.OnCancelListener {
        g() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (dialogInterface != null) {
                dialogInterface.dismiss();
                d3.this.f92605c = null;
            }
            d3.this.f92603a.a((e3.b) null);
            d3.this.a(Boolean.FALSE);
        }
    }

    protected interface h {
        void a(boolean z10);
    }

    private d3() {
        f3 f3Var = new f3();
        this.f92603a = f3Var;
        f3Var.b(true);
        LifeCycle.b().a(this);
    }

    protected static d3 d() {
        if (f92602k == null) {
            f92602k = new d3();
        }
        return f92602k;
    }

    private boolean e() {
        return (LifeCycle.b().f() || LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        this.f92603a.a(false);
        InviteData inviteData = this.f92607e;
        if (inviteData != null) {
            this.f92608f = this.f92603a.a(inviteData.getBannerData(), this.f92612j, new c());
        }
        j4 j4Var = this.f92608f;
        if (j4Var != null) {
            j4Var.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        this.f92603a.a(false);
        androidx.appcompat.app.c cVarA = this.f92603a.a(this.f92604b, this.f92610h, this.f92611i, new d(), new e(), new f(), new g());
        this.f92605c = cVarA;
        if (cVarA != null) {
            a(Boolean.TRUE);
            this.f92605c.show();
        }
    }

    private void h() {
        if (e() && this.f92603a.l()) {
            androidx.appcompat.app.c cVar = this.f92605c;
            if (cVar != null) {
                cVar.dismiss();
                this.f92605c = null;
                try {
                    ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new a());
                } catch (Exception e10) {
                    a4.c(e10.getMessage());
                }
            }
            j4 j4Var = this.f92608f;
            if (j4Var != null) {
                j4Var.b();
                this.f92608f = null;
                try {
                    ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new b());
                } catch (Exception e11) {
                    a4.c(e11.getMessage());
                }
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void b() {
        h();
    }

    public void i() {
        this.f92609g = null;
    }

    public void c() {
        if (this.f92608f != null) {
            this.f92603a.a((e3.b) null);
            this.f92608f.b();
            this.f92608f = null;
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void a() {
        if (this.f92603a.l()) {
            this.f92603a.c();
        }
    }

    public void a(InviteData inviteData, DialogInterface.OnClickListener onClickListener, MDAppearanceMode mDAppearanceMode, boolean z10) {
        this.f92604b = inviteData;
        this.f92606d = onClickListener;
        this.f92610h = mDAppearanceMode;
        this.f92611i = z10;
        g();
    }

    public void a(h hVar) {
        this.f92609g = hVar;
    }

    public void a(j2 j2Var, DialogInterface.OnClickListener onClickListener, v5 v5Var) {
        if (j2Var != null) {
            this.f92612j = v5Var;
            this.f92607e = j2Var.getInviteData();
            this.f92606d = onClickListener;
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Boolean bool) {
        h hVar = this.f92609g;
        if (hVar != null) {
            hVar.a(bool.booleanValue());
        }
    }
}
