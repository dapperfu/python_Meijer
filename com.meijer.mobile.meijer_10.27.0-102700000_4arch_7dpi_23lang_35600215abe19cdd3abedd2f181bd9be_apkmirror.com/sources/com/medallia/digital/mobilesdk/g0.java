package com.medallia.digital.mobilesdk;

import android.os.Handler;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.j2;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes7.dex */
class g0 {

    /* renamed from: g, reason: collision with root package name */
    private static final long f92056g = 7000;

    /* renamed from: a, reason: collision with root package name */
    private MDResultCallback f92057a;

    /* renamed from: b, reason: collision with root package name */
    private h f92058b;

    /* renamed from: c, reason: collision with root package name */
    private Handler f92059c;

    /* renamed from: d, reason: collision with root package name */
    private v4 f92060d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f92061e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f92062f;

    class a implements h2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConfigurationContract f92063a;

        a(ConfigurationContract configurationContract) {
            this.f92063a = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void a() {
            g0.this.a();
            g0.this.a(new MDExternalError(MDExternalError.ExternalError.FORM_NOT_EXISTS_OR_NOT_PUBLISH), g0.this.f92057a);
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void onSuccess() {
            if (g0.this.b(this.f92063a)) {
                g0.this.a();
                g0.this.c();
            } else {
                g0 g0Var = g0.this;
                g0Var.a(true, g0Var.f92058b.f92078a, g0.this.f92058b.f92079b, g0.this.f92057a);
            }
        }
    }

    class b implements h2 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j2 f92065a;

        b(j2 j2Var) {
            this.f92065a = j2Var;
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void a() {
            a4.c("Preload form failed on promoting = " + this.f92065a.getFormId());
        }

        @Override // com.medallia.digital.mobilesdk.h2
        public void onSuccess() {
            j2 j2VarC = r2.e().c(this.f92065a.getFormId());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Preload form SUCCESS = ");
            sb2.append(j2VarC != null ? j2VarC.c() : com.google.maps.android.BuildConfig.TRAVIS);
            a4.b(sb2.toString());
            if (j2VarC == null || j2VarC.c() != j2.a.AVAILABLE) {
                return;
            }
            r2.e().c(this.f92065a);
            y8 y8VarB = y8.b();
            j2 j2Var = this.f92065a;
            MedalliaWebView.f fVar = MedalliaWebView.f.preload;
            Boolean bool = Boolean.TRUE;
            y8VarB.a(j2Var, null, fVar, bool, bool);
        }
    }

    class c extends v4 {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            g0.this.b();
        }
    }

    class d implements MDResultCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ j2 f92068a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FormDisplayType f92069b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f92070c;

        d(j2 j2Var, FormDisplayType formDisplayType, String str) {
            this.f92068a = j2Var;
            this.f92069b = formDisplayType;
            this.f92070c = str;
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError mDExternalError) throws JSONException {
            MDExternalError mDExternalError2;
            if (this.f92069b == FormDisplayType.NOTIFICATION) {
                AnalyticsBridge analyticsBridge = AnalyticsBridge.getInstance();
                String str = this.f92070c;
                j2 j2Var = this.f92068a;
                mDExternalError2 = mDExternalError;
                analyticsBridge.reportHandleNotificationEvent(str, j2Var != null ? j2Var.getFormViewType() : FormViewType.none, g0.this.f92058b != null, AnalyticsBridge.c.failure, mDExternalError2);
                if (this.f92068a.getInviteData() != null && this.f92068a.getInviteData().getType() == InviteData.a.LOCAL_NOTIFICATION) {
                    g0.this.a(this.f92070c);
                }
            } else {
                mDExternalError2 = mDExternalError;
            }
            g0.this.f92058b = null;
            g0.this.a();
            g0 g0Var = g0.this;
            g0Var.a(mDExternalError2, g0Var.f92057a);
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() throws JSONException {
            if (this.f92068a != null) {
                FormDisplayType formDisplayType = this.f92069b;
                if (formDisplayType == FormDisplayType.CODE) {
                    AnalyticsBridge.getInstance().reportShowFormEvent(this.f92070c, this.f92068a.getFormViewType(), this.f92068a.l());
                } else if (formDisplayType == FormDisplayType.NOTIFICATION) {
                    AnalyticsBridge.getInstance().reportHandleNotificationEvent(this.f92070c, this.f92068a.getFormViewType(), g0.this.f92058b != null, AnalyticsBridge.c.success, null);
                    if (this.f92068a.getInviteData() != null && this.f92068a.getInviteData().getType() == InviteData.a.LOCAL_NOTIFICATION) {
                        g0.this.a(this.f92070c);
                    }
                }
            }
            g0.this.f92058b = null;
            g0.this.a();
            g0 g0Var = g0.this;
            g0Var.a(g0Var.f92057a);
        }
    }

    class e extends v4 {
        e() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (g0.this.f92057a != null) {
                g0.this.c();
            }
        }
    }

    class f extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f92073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDExternalError f92074b;

        f(MDResultCallback mDResultCallback, MDExternalError mDExternalError) {
            this.f92073a = mDResultCallback;
            this.f92074b = mDExternalError;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f92073a.onError(this.f92074b);
        }
    }

    class g extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f92076a;

        g(MDResultCallback mDResultCallback) {
            this.f92076a = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f92076a.onSuccess();
        }
    }

    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        private final FormDisplayType f92078a;

        /* renamed from: b, reason: collision with root package name */
        private final String f92079b;

        /* renamed from: c, reason: collision with root package name */
        private final Long f92080c;

        private h(FormDisplayType formDisplayType, String str, Long l10) {
            this.f92078a = formDisplayType;
            this.f92079b = str;
            this.f92080c = l10;
        }

        /* synthetic */ h(FormDisplayType formDisplayType, String str, Long l10, a aVar) {
            this(formDisplayType, str, l10);
        }
    }

    g0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.f92058b = null;
        if (this.f92057a != null) {
            a((this.f92062f || this.f92061e) ? new MDExternalError(MDExternalError.ExternalError.FORM_DISPLAY_TIMEOUT) : new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), this.f92057a);
        }
        a4.c("Form Display Timeout");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            this.f92059c.removeCallbacks(this.f92060d);
            this.f92059c.removeCallbacksAndMessages(null);
            this.f92059c = null;
            this.f92060d = null;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f92059c != null) {
            a();
        }
        this.f92059c = new Handler();
        e eVar = new e();
        this.f92060d = eVar;
        this.f92059c.postDelayed(eVar, f92056g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(ConfigurationContract configurationContract) {
        Long formDisplayTimeout;
        return (configurationContract == null || this.f92058b == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null || (formDisplayTimeout = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getFormDisplayTimeout()) == null || formDisplayTimeout.longValue() >= f92056g || formDisplayTimeout.longValue() <= this.f92058b.f92080c.longValue()) ? false : true;
    }

    void a(ConfigurationContract configurationContract) {
        if (this.f92058b != null) {
            if (!b(configurationContract)) {
                r2.e().a(this.f92058b.f92079b, new a(configurationContract));
            } else {
                a();
                c();
            }
        }
    }

    protected void a(FormDisplayType formDisplayType, String str, MDResultCallback mDResultCallback) {
        c3.d().a(formDisplayType == FormDisplayType.CODE ? e3.b.showForm : e3.b.handleNotification);
        s7.e().j();
        a(false, formDisplayType, str, mDResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            return;
        }
        w7.b().c().execute(new f(mDResultCallback, mDExternalError));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            return;
        }
        w7.b().c().execute(new g(mDResultCallback));
    }

    private void a(j2 j2Var) {
        if (j2Var == null) {
            return;
        }
        r2.e().a(j2Var.getFormId(), new b(j2Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) throws JSONException {
        CollectorsInfrastructure.getInstance().invitationDisplayedCollector.a(Boolean.TRUE);
        AnalyticsBridge.getInstance().reportInvitationAcceptedEvent(str, InviteData.a.LOCAL_NOTIFICATION.toString(), null);
    }

    protected void a(ArrayList<j2> arrayList) {
        if (arrayList == null) {
            return;
        }
        Iterator<j2> it = arrayList.iterator();
        while (it.hasNext()) {
            j2 next = it.next();
            if (next.l()) {
                a4.e("Preload form loaded = " + next.getFormId());
                a(next);
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, FormDisplayType formDisplayType, String str, MDResultCallback mDResultCallback) {
        try {
            this.f92057a = mDResultCallback;
            if (mDResultCallback == null) {
                a4.f("Missing listener, however, method will run regardless");
            }
            if (!z10) {
                w7.b().c().execute(new c());
            }
            j2 j2VarC = r2.e().c(str);
            a aVar = null;
            if (!this.f92061e || !r2.e().i()) {
                this.f92058b = new h(formDisplayType, str, Long.valueOf(System.currentTimeMillis()), aVar);
                return;
            }
            if (LifeCycle.b().f()) {
                MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.APP_IS_IN_BG);
                if (formDisplayType == FormDisplayType.NOTIFICATION) {
                    AnalyticsBridge.getInstance().reportHandleNotificationEvent(str, j2VarC != null ? j2VarC.getFormViewType() : FormViewType.none, this.f92058b != null, AnalyticsBridge.c.failure, mDExternalError);
                }
                a(mDExternalError, mDResultCallback);
                return;
            }
            if (j2VarC == null || r2.e().a(j2VarC) || formDisplayType != FormDisplayType.NOTIFICATION) {
                r2.e().a(str, new d(j2VarC, formDisplayType, str));
                return;
            }
            this.f92058b = null;
            a();
            a(new MDExternalError(MDExternalError.ExternalError.FORM_INCORRECT_INVITATION_TYPE), this.f92057a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(boolean z10, boolean z11) {
        this.f92061e = z10;
        this.f92062f = z11;
    }
}
