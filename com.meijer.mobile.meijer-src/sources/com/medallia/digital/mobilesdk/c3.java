package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.view.Window;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import org.json.JSONException;

/* loaded from: classes8.dex */
final class c3 implements LifeCycle.f {

    /* renamed from: g, reason: collision with root package name */
    private static c3 f92521g;

    /* renamed from: b, reason: collision with root package name */
    private long f92523b;

    /* renamed from: c, reason: collision with root package name */
    private long f92524c;

    /* renamed from: d, reason: collision with root package name */
    private long f92525d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f92526e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f92527f = false;

    /* renamed from: a, reason: collision with root package name */
    private final f3 f92522a = new f3();

    class a implements h2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92528a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDEngagementType f92529b;

        a(String str, MDEngagementType mDEngagementType) {
            this.f92528a = str;
            this.f92529b = mDEngagementType;
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void a() throws JSONException {
            c3.this.a(this.f92528a, Reason.formStatusNotAvailable);
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void onSuccess() {
            if (c3.this.a(this.f92528a)) {
                c3.this.a(this.f92528a, this.f92529b);
            }
        }
    }

    class b implements MedalliaWebView.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f92531a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDEngagementType f92532b;

        b(String str, MDEngagementType mDEngagementType) {
            this.f92531a = str;
            this.f92532b = mDEngagementType;
        }

        @Override // com.medallia.digital.mobilesdk.MedalliaWebView.e
        public void a() {
            c3.this.f92525d = System.currentTimeMillis();
            c3 c3Var = c3.this;
            c3Var.a(this.f92531a, this.f92532b, c3Var.f92525d);
        }

        @Override // com.medallia.digital.mobilesdk.MedalliaWebView.e
        public void b() {
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92534a;

        static {
            int[] iArr = new int[MDEngagementType.values().length];
            f92534a = iArr;
            try {
                iArr[MDEngagementType.appRating.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92534a[MDEngagementType.form.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private c3() {
        LifeCycle.b().a(this);
    }

    protected static c3 d() {
        if (f92521g == null) {
            f92521g = new c3();
        }
        return f92521g;
    }

    private void e() {
        if (this.f92522a.l()) {
            this.f92526e = false;
            this.f92527f = false;
            f3 f3Var = this.f92522a;
            f3Var.a(f3Var.g(), this.f92522a.e(), this.f92523b, this.f92524c, this.f92525d);
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void b() {
        e();
    }

    protected boolean c() {
        return this.f92522a.a();
    }

    protected void b(String str, MDEngagementType mDEngagementType, long j10) {
        if (mDEngagementType == null) {
            a4.c("Can't show invitation because of type is null");
            return;
        }
        this.f92523b = System.currentTimeMillis();
        this.f92524c = j10;
        int i10 = c.f92534a[mDEngagementType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            r2.e().a(str, new a(str, mDEngagementType));
        } else if (a(str)) {
            a(str, mDEngagementType, -1L);
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void a() {
        if (this.f92522a.l()) {
            this.f92522a.c();
        }
    }

    private void a(int i10) {
        if (i4.c().d().getBaseContext() instanceof Activity) {
            Window window = ((Activity) i4.c().d().getBaseContext()).getWindow();
            if ((i10 & 4) != 0 || (window.getAttributes().flags & 1024) != 0 || (window.getAttributes().flags & 67108864) != 0) {
                if (!this.f92522a.k() || window.getDecorView().getSystemUiVisibility() == 4) {
                    return;
                }
                this.f92526e = true;
                return;
            }
            if (this.f92526e && this.f92522a.l()) {
                this.f92526e = false;
                this.f92527f = true;
                f3 f3Var = this.f92522a;
                f3Var.a(f3Var.g(), this.f92522a.e(), this.f92523b, this.f92524c, this.f92525d, true);
            }
        }
    }

    protected void a(e3.b bVar) {
        this.f92522a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MDEngagementType mDEngagementType) {
        j2 j2VarC = r2.e().c(str);
        if (j2VarC == null) {
            a4.b("FormId: " + str + " loading failed");
            return;
        }
        r2.e().c(j2VarC);
        y8 y8VarB = y8.b();
        b bVar = new b(str, mDEngagementType);
        MedalliaWebView.f fVar = MedalliaWebView.f.invitationProducer;
        Boolean bool = Boolean.TRUE;
        y8VarB.a(j2VarC, bVar, fVar, bool, bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, MDEngagementType mDEngagementType, long j10) {
        if (LifeCycle.b().f() || !k7.b().c() || this.f92522a.l() || this.f92522a.j()) {
            return;
        }
        if (MDEngagementType.form.equals(mDEngagementType)) {
            CollectorsInfrastructure.getInstance().invitationDisplayedCollector.a(Boolean.TRUE);
        } else if (MDEngagementType.appRating.equals(mDEngagementType) && !x8.b()) {
            a4.e("Device is offline, App Rating prompt won't be displayed");
            return;
        }
        a4.b("Invitation dialog is ready to opened");
        a4.b("displayInvitation called");
        this.f92526e = false;
        this.f92522a.b(str, mDEngagementType, this.f92523b, this.f92524c, j10, this.f92527f);
    }

    protected void a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        a4.e("Custom Intercept was Triggered with engagementId: " + str + " and action type: " + mDInterceptActionType);
        this.f92522a.a(str, mDInterceptActionType, mDFailureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Reason reason) throws JSONException {
        AnalyticsBridge.getInstance().reportInterceptMechanismEvent(this.f92523b, System.currentTimeMillis(), str, reason, AnalyticsBridge.c.failure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(String str) throws JSONException {
        Reason reason;
        if (!k7.b().c()) {
            reason = Reason.interceptDisabled;
        } else if (LifeCycle.b().f()) {
            reason = Reason.formInBackground;
        } else if (LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || LifeCycle.b().a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity")) {
            reason = Reason.formOpened;
        } else {
            if (!this.f92522a.l()) {
                return true;
            }
            reason = Reason.invitationOpened;
        }
        a(str, reason);
        return false;
    }
}
