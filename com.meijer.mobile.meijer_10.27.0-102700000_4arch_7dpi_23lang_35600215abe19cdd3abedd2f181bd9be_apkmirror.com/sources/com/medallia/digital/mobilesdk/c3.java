package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.view.Window;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import org.json.JSONException;

/* loaded from: classes7.dex */
final class c3 implements LifeCycle.f {

    /* renamed from: g, reason: collision with root package name */
    private static c3 f91682g;

    /* renamed from: b, reason: collision with root package name */
    private long f91684b;

    /* renamed from: c, reason: collision with root package name */
    private long f91685c;

    /* renamed from: d, reason: collision with root package name */
    private long f91686d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f91687e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f91688f = false;

    /* renamed from: a, reason: collision with root package name */
    private final f3 f91683a = new f3();

    class a implements h2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f91689a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDEngagementType f91690b;

        a(String str, MDEngagementType mDEngagementType) {
            this.f91689a = str;
            this.f91690b = mDEngagementType;
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void a() throws JSONException {
            c3.this.a(this.f91689a, Reason.formStatusNotAvailable);
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void onSuccess() {
            if (c3.this.a(this.f91689a)) {
                c3.this.a(this.f91689a, this.f91690b);
            }
        }
    }

    class b implements MedalliaWebView.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f91692a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDEngagementType f91693b;

        b(String str, MDEngagementType mDEngagementType) {
            this.f91692a = str;
            this.f91693b = mDEngagementType;
        }

        @Override // com.medallia.digital.mobilesdk.MedalliaWebView.e
        public void a() {
            c3.this.f91686d = System.currentTimeMillis();
            c3 c3Var = c3.this;
            c3Var.a(this.f91692a, this.f91693b, c3Var.f91686d);
        }

        @Override // com.medallia.digital.mobilesdk.MedalliaWebView.e
        public void b() {
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f91695a;

        static {
            int[] iArr = new int[MDEngagementType.values().length];
            f91695a = iArr;
            try {
                iArr[MDEngagementType.appRating.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f91695a[MDEngagementType.form.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private c3() {
        LifeCycle.b().a(this);
    }

    protected static c3 d() {
        if (f91682g == null) {
            f91682g = new c3();
        }
        return f91682g;
    }

    private void e() {
        if (this.f91683a.l()) {
            this.f91687e = false;
            this.f91688f = false;
            f3 f3Var = this.f91683a;
            f3Var.a(f3Var.g(), this.f91683a.e(), this.f91684b, this.f91685c, this.f91686d);
        }
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void b() {
        e();
    }

    protected boolean c() {
        return this.f91683a.a();
    }

    protected void b(String str, MDEngagementType mDEngagementType, long j10) {
        if (mDEngagementType == null) {
            a4.c("Can't show invitation because of type is null");
            return;
        }
        this.f91684b = System.currentTimeMillis();
        this.f91685c = j10;
        int i10 = c.f91695a[mDEngagementType.ordinal()];
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
        if (this.f91683a.l()) {
            this.f91683a.c();
        }
    }

    private void a(int i10) {
        if (i4.c().d().getBaseContext() instanceof Activity) {
            Window window = ((Activity) i4.c().d().getBaseContext()).getWindow();
            if ((i10 & 4) != 0 || (window.getAttributes().flags & 1024) != 0 || (window.getAttributes().flags & 67108864) != 0) {
                if (!this.f91683a.k() || window.getDecorView().getSystemUiVisibility() == 4) {
                    return;
                }
                this.f91687e = true;
                return;
            }
            if (this.f91687e && this.f91683a.l()) {
                this.f91687e = false;
                this.f91688f = true;
                f3 f3Var = this.f91683a;
                f3Var.a(f3Var.g(), this.f91683a.e(), this.f91684b, this.f91685c, this.f91686d, true);
            }
        }
    }

    protected void a(e3.b bVar) {
        this.f91683a.a(bVar);
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
        if (LifeCycle.b().f() || !k7.b().c() || this.f91683a.l() || this.f91683a.j()) {
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
        this.f91687e = false;
        this.f91683a.b(str, mDEngagementType, this.f91684b, this.f91685c, j10, this.f91688f);
    }

    protected void a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        a4.e("Custom Intercept was Triggered with engagementId: " + str + " and action type: " + mDInterceptActionType);
        this.f91683a.a(str, mDInterceptActionType, mDFailureCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Reason reason) throws JSONException {
        AnalyticsBridge.getInstance().reportInterceptMechanismEvent(this.f91684b, System.currentTimeMillis(), str, reason, AnalyticsBridge.c.failure);
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
            if (!this.f91683a.l()) {
                return true;
            }
            reason = Reason.invitationOpened;
        }
        a(str, reason);
        return false;
    }
}
