package com.medallia.digital.mobilesdk;

import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.LinearLayout;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.j1;
import com.medallia.digital.mobilesdk.u1;
import com.medallia.digital.mobilesdk.x3;
import org.json.JSONException;
import ye.AbstractC18306a;
import ye.InterfaceC18307b;

/* loaded from: classes8.dex */
class f3 {

    /* renamed from: r, reason: collision with root package name */
    private static final String f92833r = "https://play.google.com/store/apps/details?id=";

    /* renamed from: b, reason: collision with root package name */
    private String f92835b;

    /* renamed from: c, reason: collision with root package name */
    private MDEngagementType f92836c;

    /* renamed from: d, reason: collision with root package name */
    private androidx.appcompat.app.c f92837d;

    /* renamed from: e, reason: collision with root package name */
    private j4 f92838e;

    /* renamed from: i, reason: collision with root package name */
    private q f92842i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f92843j;

    /* renamed from: k, reason: collision with root package name */
    private j2 f92844k;

    /* renamed from: l, reason: collision with root package name */
    private String f92845l;

    /* renamed from: n, reason: collision with root package name */
    private String f92847n;

    /* renamed from: q, reason: collision with root package name */
    private String f92850q;

    /* renamed from: a, reason: collision with root package name */
    private InviteData f92834a = null;

    /* renamed from: f, reason: collision with root package name */
    private long f92839f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f92840g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f92841h = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f92846m = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f92848o = false;

    /* renamed from: p, reason: collision with root package name */
    private boolean f92849p = false;

    class a implements InterfaceC5511e<AbstractC18306a> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC18307b f92851a;

        /* renamed from: com.medallia.digital.mobilesdk.f3$a$a, reason: collision with other inner class name */
        class C1313a implements InterfaceC5511e<Void> {
            C1313a() {
            }

            @Override // Vd.InterfaceC5511e
            public void onComplete(AbstractC5516j<Void> abstractC5516j) {
                a4.e("In App review completed successfully");
            }
        }

        a(InterfaceC18307b interfaceC18307b) {
            this.f92851a = interfaceC18307b;
        }

        @Override // Vd.InterfaceC5511e
        public void onComplete(AbstractC5516j<AbstractC18306a> abstractC5516j) throws JSONException {
            if (abstractC5516j.r()) {
                a4.e("In App review task success - calling show method");
                AbstractC18306a abstractC18306aN = abstractC5516j.n();
                try {
                    AbstractC5516j<Void> abstractC5516jA = this.f92851a.a((Activity) i4.c().d().getBaseContext(), abstractC18306aN);
                    a4.e("In App review launch review called");
                    CollectorsInfrastructure.getInstance().appRatingLastTriggerTimestampCollector.a((u) Long.valueOf(System.currentTimeMillis()));
                    AnalyticsBridge.getInstance().reportPromptTriggeredEvent(f3.this.f92842i.a());
                    Broadcasts.e.a(Broadcasts.e.a.interceptTriggered, f3.this.f92835b);
                    abstractC5516jA.c(new C1313a());
                    return;
                } catch (Exception unused) {
                    a4.c("In App review task failure - unable to get current Activity");
                    f3.this.f92849p = false;
                    return;
                }
            }
            if (abstractC5516j.m() != null) {
                a4.c(abstractC5516j.m().getMessage());
            } else {
                a4.c("In App review Error");
            }
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f92854a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BannerData f92855b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f92856c;

        class a extends x {
            a() {
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void a() {
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void b(e3 e3Var) throws JSONException {
                f3.this.a(e3Var);
                f3.this.f92838e = null;
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void c(e3 e3Var) throws JSONException {
                f3.this.c(e3Var);
                f3.this.f92838e = null;
            }

            @Override // com.medallia.digital.mobilesdk.x
            public void a(e3 e3Var) throws JSONException {
                f3.this.b(e3Var);
                f3.this.f92838e = null;
            }

            @Override // com.medallia.digital.mobilesdk.x
            void a(j4 j4Var) {
            }
        }

        b(long j10, BannerData bannerData, boolean z10) {
            this.f92854a = j10;
            this.f92855b = bannerData;
            this.f92856c = z10;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (!f3.this.a(this.f92854a)) {
                f3.this.b();
                return;
            }
            v5 v5VarA = v7.c().a(this.f92855b.getThemeName());
            f3 f3Var = f3.this;
            f3Var.f92838e = f3Var.a(this.f92855b, this.f92856c, v5VarA, new a());
            if (!f3.this.a(this.f92854a)) {
                f3.this.b();
                f3.this.f92838e = null;
            } else if (f3.this.a(this.f92854a)) {
                f3.this.f92838e.B();
            } else {
                f3.this.a((e3.b) null);
            }
        }
    }

    class c extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f92859a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InviteData f92860b;

        class a implements DialogInterface.OnClickListener {
            a() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
                f3.this.c(new e3(null, false));
                if (f3.this.f92837d == null || !f3.this.f92837d.isShowing()) {
                    return;
                }
                f3.this.f92837d.dismiss();
                f3.this.f92837d = null;
            }
        }

        class b implements DialogInterface.OnClickListener {
            b() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
                f3.this.b(new e3((e3.c) null, e3.a.buttonClicked, false));
                if (f3.this.f92837d == null || !f3.this.f92837d.isShowing()) {
                    return;
                }
                f3.this.f92837d.dismiss();
                f3.this.f92837d = null;
            }
        }

        /* renamed from: com.medallia.digital.mobilesdk.f3$c$c, reason: collision with other inner class name */
        class DialogInterfaceOnClickListenerC1314c implements DialogInterface.OnClickListener {
            DialogInterfaceOnClickListenerC1314c() {
            }

            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
                f3.this.a(new e3((e3.c) null, e3.b.maybeLater, false));
                if (f3.this.f92837d == null || !f3.this.f92837d.isShowing()) {
                    return;
                }
                f3.this.f92837d.dismiss();
                f3.this.f92837d = null;
            }
        }

        class d implements DialogInterface.OnCancelListener {
            d() {
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) throws JSONException {
                f3.this.a(new e3((e3.c) null, e3.b.androidBackButton, false));
                if (f3.this.f92837d != null) {
                    f3.this.f92837d.dismiss();
                    f3.this.f92837d = null;
                }
            }
        }

        c(long j10, InviteData inviteData) {
            this.f92859a = j10;
            this.f92860b = inviteData;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (!f3.this.a(this.f92859a)) {
                f3.this.b();
                return;
            }
            f3 f3Var = f3.this;
            f3Var.f92837d = f3Var.b(this.f92860b, MDAppearanceMode.unknown, (f3Var.f92844k != null && f3.this.f92844k.isRtl()) || this.f92860b.isRtl(), new a(), new b(), new DialogInterfaceOnClickListenerC1314c(), new d());
            if (!f3.this.a(this.f92859a)) {
                f3.this.b();
                f3.this.f92837d = null;
                return;
            }
            if (f3.this.f92837d != null) {
                f3.this.f92837d.show();
            }
            f3.this.a(-1, R.id.invitation_positive);
            f3.this.a(-2, R.id.invitation_negative);
            f3.this.a(-3, R.id.invitation_neutral);
        }
    }

    class d extends v4 {
        d() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            y8.b().a(MedalliaWebView.f.invitationProducer);
        }
    }

    static /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f92867a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f92868b;

        static {
            int[] iArr = new int[MDInterceptActionType.values().length];
            f92868b = iArr;
            try {
                iArr[MDInterceptActionType.accepted.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92868b[MDInterceptActionType.declined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92868b[MDInterceptActionType.skipped.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f92868b[MDInterceptActionType.deferred.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[MDEngagementType.values().length];
            f92867a = iArr2;
            try {
                iArr2[MDEngagementType.appRating.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f92867a[MDEngagementType.form.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    f3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public androidx.appcompat.app.c b(InviteData inviteData, MDAppearanceMode mDAppearanceMode, boolean z10, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        String invitationTitle;
        String invitationBody;
        Context contextB;
        int i10;
        String provideButtonText = inviteData.getProvideButtonText();
        String declineButtonText = inviteData.getDeclineButtonText();
        String laterButtonText = inviteData.getLaterButtonText();
        if (inviteData.getType() == InviteData.a.ALERT) {
            invitationTitle = inviteData.getInvitationHeadline();
            invitationBody = inviteData.getInvitationText();
        } else if (inviteData.getBannerData().getInvitationTitle() == null && inviteData.getBannerData().getInvitationBody() == null) {
            if (MDEngagementType.form.equals(this.f92836c)) {
                invitationTitle = i4.c().b().getString(R.string.alert_app_rating_default_title);
                contextB = i4.c().b();
                i10 = R.string.alert_app_rating_default_message;
            } else {
                invitationTitle = i4.c().b().getString(R.string.alert_form_default_title);
                contextB = i4.c().b();
                i10 = R.string.alert_form_default_message;
            }
            invitationBody = contextB.getString(i10);
        } else {
            invitationTitle = inviteData.getBannerData().getInvitationTitle();
            invitationBody = inviteData.getBannerData().getInvitationBody();
        }
        androidx.appcompat.app.c cVarCreate = v7.c().a(this.f92848o, provideButtonText, declineButtonText, laterButtonText, invitationTitle, invitationBody, onClickListener, onClickListener2, onClickListener3, onCancelListener, this.f92846m, mDAppearanceMode).create();
        try {
            if (z10) {
                Window window = cVarCreate.getWindow();
                if (window != null) {
                    window.getDecorView().setLayoutDirection(1);
                    window.getDecorView().setTextDirection(4);
                    a4.e("Dialog direction set to RTL");
                    return cVarCreate;
                }
            } else {
                Window window2 = cVarCreate.getWindow();
                if (window2 != null) {
                    window2.getDecorView().setLayoutDirection(0);
                    window2.getDecorView().setTextDirection(3);
                    a4.e("Dialog direction set to LTR");
                }
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        return cVarCreate;
    }

    private String d() {
        MDEngagementType mDEngagementType = this.f92836c;
        if (mDEngagementType == MDEngagementType.form) {
            j2 j2Var = this.f92844k;
            if (j2Var == null) {
                return null;
            }
            return j2Var.getFormLanguage();
        }
        if (mDEngagementType != MDEngagementType.appRating) {
            if (this.f92846m) {
                return this.f92847n;
            }
            return null;
        }
        q qVar = this.f92842i;
        if (qVar == null) {
            return null;
        }
        return qVar.b();
    }

    private Intent f() {
        boolean zIsVulnEnabled;
        boolean zIsRemoveTaskContainingFormActivityOnly;
        ConfigurationContract configurationContractA = t0.c().a();
        if (configurationContractA == null || configurationContractA.getSdkConfiguration() == null || configurationContractA.getSdkConfiguration().getFormConfigurations() == null) {
            zIsVulnEnabled = true;
            zIsRemoveTaskContainingFormActivityOnly = false;
        } else {
            zIsVulnEnabled = configurationContractA.getSdkConfiguration().getFormConfigurations().isVulnEnabled();
            boolean zIsInheritOrientation = configurationContractA.getSdkConfiguration().getFormConfigurations().isInheritOrientation();
            zIsRemoveTaskContainingFormActivityOnly = configurationContractA.getSdkConfiguration().getMedalliaDigitalBrain() != null ? configurationContractA.getSdkConfiguration().getMedalliaDigitalBrain().isRemoveTaskContainingFormActivityOnly() : false;
            z = zIsInheritOrientation;
        }
        j2 j2VarC = r2.e().c(this.f92835b);
        Intent intent = new Intent(i4.c().b(), (Class<?>) ((j2VarC == null || j2VarC.getFormViewType() != FormViewType.modal) ? MedalliaFullFormActivity.class : MedalliaModalFormActivity.class));
        intent.putExtra("com.medallia.digital.mobilesdk.form_data", j2VarC);
        intent.putExtra("com.medallia.digital.mobilesdk.vuln_enabled", zIsVulnEnabled);
        intent.putExtra("com.medallia.digital.mobilesdk.inherit_orientation", z);
        intent.putExtra("com.medallia.digital.mobilesdk.remove_task", zIsRemoveTaskContainingFormActivityOnly);
        InviteData inviteData = this.f92834a;
        if (inviteData != null && inviteData.getType() != null) {
            intent.putExtra("com.medallia.digital.mobilesdk.extra_invite_type", this.f92834a.getType().name());
        }
        intent.addFlags(268435456);
        return intent;
    }

    private e3.c h() {
        j4 j4Var = this.f92838e;
        if (j4Var == null) {
            return null;
        }
        return j4Var.p();
    }

    private boolean i() {
        AccessibilityManager accessibilityManager = (AccessibilityManager) i4.c().a().getSystemService("accessibility");
        return accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    private void m() {
        try {
            this.f92849p = true;
            InterfaceC18307b interfaceC18307bA = ye.c.a(i4.c().b());
            AbstractC5516j<AbstractC18306a> abstractC5516jB = interfaceC18307bA.b();
            a4.e("In App review calling API");
            abstractC5516jB.c(new a(interfaceC18307bA));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        this.f92849p = false;
    }

    protected androidx.appcompat.app.c a(InviteData inviteData, MDAppearanceMode mDAppearanceMode, boolean z10, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, DialogInterface.OnClickListener onClickListener3, DialogInterface.OnCancelListener onCancelListener) {
        androidx.appcompat.app.c cVarB = b(inviteData, mDAppearanceMode, z10, onClickListener, onClickListener2, onClickListener3, onCancelListener);
        this.f92837d = cVarB;
        return cVarB;
    }

    protected MDEngagementType e() {
        return this.f92836c;
    }

    protected String g() {
        return this.f92835b;
    }

    boolean j() {
        return this.f92849p;
    }

    protected boolean k() {
        InviteData inviteData = this.f92834a;
        return (inviteData == null || inviteData.getType() == null || this.f92834a.getType() != InviteData.a.BANNER) ? false : true;
    }

    boolean l() {
        androidx.appcompat.app.c cVar = this.f92837d;
        if (cVar != null && cVar.isShowing()) {
            return true;
        }
        j4 j4Var = this.f92838e;
        return (j4Var != null && j4Var.x()) || this.f92843j;
    }

    void c() {
        this.f92843j = true;
        try {
            androidx.appcompat.app.c cVar = this.f92837d;
            if (cVar != null && cVar.isShowing()) {
                this.f92837d.dismiss();
                this.f92837d = null;
            }
            j4 j4Var = this.f92838e;
            if (j4Var == null || !j4Var.x()) {
                return;
            }
            this.f92839f = this.f92838e.i();
            this.f92840g = this.f92838e.w();
            this.f92838e.b();
            this.f92838e = null;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        d dVar = new d();
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(dVar);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            try {
                w7.b().c().execute(dVar);
            } catch (Exception unused) {
                a4.c(e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(e3 e3Var) throws JSONException {
        String strA = a(this.f92834a);
        if (strA != null && !InviteData.a.CUSTOM.toString().equals(strA) && !InviteData.a.SKIP_INVITE.toString().equals(strA)) {
            Broadcasts.e.a(Broadcasts.e.a.interceptAccepted, this.f92835b, strA, this.f92836c, e3Var);
        }
        int i10 = e.f92867a[this.f92836c.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            if (InviteData.a.SKIP_INVITE.toString().equals(strA)) {
                a4.e("Invitation Skip event");
            } else if (strA != null && !InviteData.a.CUSTOM.toString().equals(strA)) {
                AnalyticsBridge.getInstance().reportInvitationAcceptedEvent(this.f92835b, strA, e3Var);
            }
            Intent intentF = f();
            if (intentF != null) {
                i4.c().b().startActivity(intentF);
                return;
            }
            return;
        }
        if (strA != null && !InviteData.a.CUSTOM.toString().equals(strA)) {
            AnalyticsBridge.getInstance().reportPromptAcceptedEvent(this.f92835b, strA, e3Var);
            Broadcasts.h.a(Broadcasts.h.a.promptAccepted);
        }
        Intent intent = new Intent("com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollectorFilter");
        intent.putExtra("com.medallia.digital.mobilesdk.AppRatingLastAcceptedTimestampCollector", System.currentTimeMillis());
        q4.a(i4.c().b()).a(intent);
        Context contextB = i4.c().b();
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setFlags(268435456);
        String str = f92833r + contextB.getPackageName();
        q qVar = this.f92842i;
        if (qVar != null && qVar.c() != null) {
            str = f92833r + this.f92842i.c();
        }
        intent2.setData(Uri.parse(str));
        contextB.startActivity(intent2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(e3 e3Var) throws JSONException {
        String strA = a(this.f92834a);
        if (strA != null && !strA.equals("CUSTOM")) {
            Broadcasts.e.a(Broadcasts.e.a.interceptDeclined, this.f92835b, strA, this.f92836c, e3Var);
        }
        int i10 = e.f92867a[this.f92836c.ordinal()];
        if (i10 == 1) {
            AnalyticsBridge.getInstance().reportPromptDeclinedEvent(this.f92835b, strA, e3Var);
            Intent intent = new Intent("com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollectorFilter");
            intent.putExtra("com.medallia.digital.mobilesdk.AppRatingLastDeclineTimestampCollector", System.currentTimeMillis());
            q4.a(i4.c().b()).a(intent);
            return;
        }
        if (i10 != 2) {
            return;
        }
        AnalyticsBridge.getInstance().reportInvitationDeclinedEvent(this.f92835b, strA, e3Var);
        Intent intent2 = new Intent("com.medallia.digital.mobilesdk.LastDeclineTimestampCollectorFilter");
        intent2.putExtra("com.medallia.digital.mobilesdk.LastDeclineTimestampCollector", System.currentTimeMillis());
        q4.a(i4.c().b()).a(intent2);
        b();
        k7.b().a(u1.b.declineInvitation);
    }

    protected j4 a(BannerData bannerData, v5 v5Var, x xVar) {
        j4 j4VarA = a(bannerData, false, v5Var, xVar);
        this.f92838e = j4VarA;
        return j4VarA;
    }

    protected j4 a(BannerData bannerData, boolean z10, v5 v5Var, x xVar) {
        l4 l4Var = new l4();
        j1.c position = j1.c.getPosition(bannerData.getPosition());
        l4Var.d(bannerData.getBackgroundColor());
        l4Var.h(bannerData.getTextColor());
        l4Var.a(bannerData.getAcceptButtonBackgroundColor());
        l4Var.e(bannerData.getCloseButtonColor());
        l4Var.c(bannerData.getAcceptButtonTextColor());
        if ((this.f92846m || this.f92848o) && v5Var != null && v5Var.b() != null && v5Var.c() != null && v5Var.a() != null) {
            l4Var.d(v5Var.b().a());
            l4Var.h(v5Var.c().c());
            l4Var.a(v5Var.a().a());
            l4Var.e(v5Var.a().b());
            l4Var.c(v5Var.c().a());
        }
        l4Var.a(position);
        l4Var.g(bannerData.getInvitationBody());
        l4Var.i(bannerData.getInvitationTitle());
        l4Var.b(bannerData.getAcceptButtonText());
        l4Var.b(bannerData.isPartial());
        l4Var.c(bannerData.isSticky());
        l4Var.a(bannerData.isButtonsDisplay());
        l4Var.f(bannerData.getFont());
        return j4.a(this.f92839f, this.f92840g, (Activity) i4.c().d().getBaseContext(), l4Var.a(i4.c().d().getBaseContext(), d()), new j1.b().a(bannerData.getInvitationTimeout()).a(position).a(z10).a(), xVar);
    }

    protected void b(String str, MDEngagementType mDEngagementType, long j10, long j11, long j12, boolean z10) {
        long j13;
        this.f92836c = mDEngagementType;
        this.f92835b = str;
        this.f92843j = false;
        int i10 = e.f92867a[mDEngagementType.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            j2 j2VarC = r2.e().c(str);
            this.f92844k = j2VarC;
            if (j2VarC != null) {
                this.f92834a = j2VarC.getInviteData();
                this.f92848o = this.f92844k.isDarkModeEnabled();
                j13 = j10;
            } else {
                a(j10, (String) null, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
                j13 = j10;
            }
            a(j13, j11, j12, z10);
            return;
        }
        q qVarB = r2.e().b(str);
        this.f92842i = qVarB;
        if (qVarB == null) {
            a(j10, (String) null, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
            return;
        }
        if (qVarB.e()) {
            m();
            return;
        }
        this.f92834a = this.f92842i.d();
        this.f92848o = this.f92842i.f();
        CollectorsInfrastructure.getInstance().promptDisplayedCollector.a((b6) Boolean.TRUE);
        a(j10, j11, j12, z10);
    }

    protected void b(boolean z10) {
        this.f92846m = z10;
    }

    private String a(InviteData inviteData) {
        if (inviteData == null) {
            return null;
        }
        return inviteData.getType() != null ? inviteData.getType().toString() : "";
    }

    private String a(x3.c cVar) {
        AccessibilityManager accessibilityManager;
        String strD;
        y3 localization;
        try {
            accessibilityManager = (AccessibilityManager) i4.c().b().getSystemService("accessibility");
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        if (accessibilityManager == null || !accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (strD = d()) == null || (localization = t0.c().a().getLocalization()) == null) {
            return "";
        }
        ResourceContract resourceContractF = localization.f();
        String strA = x3.e().a(resourceContractF != null ? resourceContractF.getLocalUrl() : null, strD, cVar, (x3.a) null);
        return !TextUtils.isEmpty(strA) ? strA : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11) {
        Button buttonI = this.f92837d.i(i10);
        buttonI.setMaxLines(1);
        buttonI.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) buttonI.getLayoutParams();
        layoutParams.gravity = 8388613;
        buttonI.setLayoutParams(layoutParams);
        buttonI.setId(i11);
    }

    private void a(long j10, long j11, long j12, boolean z10) throws JSONException {
        Broadcasts.h.a aVar;
        Broadcasts.e.a aVar2;
        String str;
        MDEngagementType mDEngagementType;
        MDAppearanceMode mDAppearanceModeB;
        MDAppearanceMode mDAppearanceModeA;
        if (this.f92834a == null) {
            a(j10, this.f92835b, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
            return;
        }
        if (i4.c().d() == null) {
            a(j10, this.f92835b, Reason.formInBackground, AnalyticsBridge.c.failure);
            return;
        }
        androidx.appcompat.app.c cVar = this.f92837d;
        if (cVar != null && cVar.isShowing()) {
            a(j10, this.f92835b, Reason.invitationOpened, AnalyticsBridge.c.failure);
            return;
        }
        if (this.f92834a.getType() == InviteData.a.CUSTOM) {
            if (!a(this.f92834a.getCustomInterceptData(), j10, j11, j12)) {
                return;
            }
        } else if (this.f92834a.getType() == InviteData.a.ALERT) {
            if (!a(this.f92834a, j10)) {
                return;
            }
        } else if (this.f92834a.getType() == InviteData.a.LOCAL_NOTIFICATION) {
            v3.f().i();
            v3.f().b(this.f92834a.getLocalNotificationData(), f());
        } else if (this.f92834a.getType() == InviteData.a.SKIP_INVITE) {
            if (a(j10)) {
                c((e3) null);
                return;
            }
            return;
        } else if (!a(this.f92834a.getBannerData(), j10, z10)) {
            return;
        }
        if (this.f92841h) {
            return;
        }
        String strA = a(this.f92834a);
        if (strA != null && !strA.equals("CUSTOM")) {
            if (this.f92848o) {
                aVar2 = Broadcasts.e.a.interceptDisplayed;
                str = this.f92835b;
                mDEngagementType = this.f92836c;
                mDAppearanceModeB = v7.c().b();
                mDAppearanceModeA = v7.c().a();
            } else {
                aVar2 = Broadcasts.e.a.interceptDisplayed;
                str = this.f92835b;
                mDEngagementType = this.f92836c;
                mDAppearanceModeB = MDAppearanceMode.unknown;
                mDAppearanceModeA = MDAppearanceMode.light;
            }
            Broadcasts.e.a(aVar2, str, strA, mDEngagementType, null, mDAppearanceModeB, mDAppearanceModeA);
        }
        InviteData inviteData = this.f92834a;
        boolean z11 = (inviteData == null || inviteData.getBannerData() == null || !this.f92834a.getBannerData().isButtonsDisplay()) ? false : true;
        InviteData inviteData2 = this.f92834a;
        e3.c cVar2 = (inviteData2 == null || inviteData2.getBannerData() == null || !this.f92834a.getBannerData().isSticky()) ? e3.c.No : e3.c.StickyByConfiguration;
        if (!MDEngagementType.form.equals(this.f92836c) || strA == null || strA.equals("CUSTOM")) {
            if (MDEngagementType.appRating.equals(this.f92836c)) {
                AnalyticsBridge.getInstance().reportPromptDisplayedEvent(this.f92835b, strA, new e3(cVar2, z11), v7.c().b());
                aVar = Broadcasts.h.a.promptDisplayed;
            }
            a(j10, this.f92835b, (Reason) null, AnalyticsBridge.c.success);
        }
        AnalyticsBridge.getInstance().reportInvitationDisplayedEvent(this.f92835b, strA, new e3(cVar2, z11), v7.c().b());
        aVar = Broadcasts.h.a.invitationDisplayed;
        Broadcasts.h.a(aVar);
        a(j10, this.f92835b, (Reason) null, AnalyticsBridge.c.success);
    }

    private void a(long j10, String str, Reason reason, AnalyticsBridge.c cVar) throws JSONException {
        AnalyticsBridge.getInstance().reportInterceptMechanismEvent(j10, System.currentTimeMillis(), str, reason, cVar);
    }

    protected void a(e3.b bVar) {
        try {
            this.f92841h = false;
            this.f92843j = false;
            androidx.appcompat.app.c cVar = this.f92837d;
            if (cVar != null && cVar.isShowing()) {
                this.f92837d.dismiss();
                this.f92837d = null;
                if (bVar != null) {
                    a(new e3((e3.c) null, bVar, false));
                }
            }
            j4 j4Var = this.f92838e;
            if (j4Var != null && j4Var.x()) {
                boolean zU = this.f92838e.u();
                this.f92838e.b();
                this.f92838e = null;
                if (bVar != null) {
                    a(new e3(h(), bVar, zU));
                }
            }
            this.f92839f = 0L;
            this.f92840g = false;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(e3 e3Var) throws JSONException {
        String strA = a(this.f92834a);
        if (e3Var.a().equals(e3.b.closed.toString())) {
            Broadcasts.e.a(Broadcasts.e.a.interceptClosed, this.f92835b, this.f92850q, this.f92836c, null, v7.c().b(), v7.c().a());
            AnalyticsBridge.getInstance().reportCloseEngagementEvent(this.f92836c.toString(), this.f92850q, this.f92835b);
        } else {
            Broadcasts.e.a(Broadcasts.e.a.interceptDeferred, this.f92835b, strA, this.f92836c, e3Var);
            int i10 = e.f92867a[this.f92836c.ordinal()];
            if (i10 == 1) {
                AnalyticsBridge.getInstance().reportPromptDeferredEvent(this.f92835b, strA, e3Var);
            } else if (i10 == 2) {
                AnalyticsBridge.getInstance().reportInvitationDeferredEvent(this.f92835b, strA, e3Var);
            }
        }
        MDEngagementType mDEngagementType = this.f92836c;
        if (mDEngagementType == null || !mDEngagementType.equals(MDEngagementType.form)) {
            return;
        }
        b();
    }

    protected void a(String str) {
        this.f92847n = str;
    }

    void a(String str, MDEngagementType mDEngagementType, long j10, long j11, long j12) {
        a(str, mDEngagementType, j10, j11, j12, false);
    }

    void a(String str, MDEngagementType mDEngagementType, long j10, long j11, long j12, boolean z10) {
        this.f92841h = true;
        try {
            androidx.appcompat.app.c cVar = this.f92837d;
            if (cVar != null && cVar.isShowing()) {
                this.f92837d.dismiss();
                this.f92837d = null;
            }
            j4 j4Var = this.f92838e;
            if (j4Var != null && j4Var.x()) {
                this.f92839f = this.f92838e.i();
                this.f92840g = this.f92838e.w();
                this.f92838e.b();
                this.f92838e = null;
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        b(str, mDEngagementType, j10, j11, j12, z10);
    }

    protected void a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) throws JSONException {
        StringBuilder sb2;
        String str2;
        MDEngagementType mDEngagementType = this.f92836c;
        String string = mDEngagementType != null ? mDEngagementType.toString() : null;
        String str3 = this.f92845l;
        if (str3 == null || !str3.equals(str)) {
            MDExternalError mDExternalError = new MDExternalError(MDExternalError.ExternalError.FORM_INVALID_ENGAGEMENT_ID);
            mDFailureCallback.onError(mDExternalError);
            AnalyticsBridge.getInstance().reportCustomInterceptTriggerCallbackEvent(AnalyticsBridge.c.failure, str, string, Integer.valueOf(mDExternalError.getErrorCode()), mDExternalError.getMessage());
            a4.c(mDExternalError.getMessage() + ", engagementId ID: " + str);
            return;
        }
        AnalyticsBridge.getInstance().reportCustomInterceptTriggerCallbackEvent(AnalyticsBridge.c.success, str, string, null, null);
        if (mDInterceptActionType != null) {
            int i10 = e.f92868b[mDInterceptActionType.ordinal()];
            if (i10 == 1) {
                c((e3) null);
                AnalyticsBridge.getInstance().reportCustomInterceptAcceptedEvent(str);
                sb2 = new StringBuilder();
                str2 = "Custom Intercept was Accepted engagementId: ";
            } else if (i10 == 2) {
                b((e3) null);
                AnalyticsBridge.getInstance().reportCustomInterceptDeclinedEvent(str);
                sb2 = new StringBuilder();
                str2 = "Custom Intercept was Declined engagementId: ";
            } else if (i10 == 3) {
                c((e3) null);
                AnalyticsBridge.getInstance().reportCustomInterceptSkippedEvent(str);
                sb2 = new StringBuilder();
                str2 = "Custom Intercept was Skipped engagementId: ";
            } else if (i10 == 4) {
                b();
                AnalyticsBridge.getInstance().reportCustomInterceptDeferredEvent(str);
                sb2 = new StringBuilder();
                str2 = "Custom Intercept was Deferred engagementId: ";
            }
            sb2.append(str2);
            sb2.append(str);
            sb2.append(", engagementType: ");
            sb2.append(string);
            a4.e(sb2.toString());
        } else {
            a4.b("Custom Intercept ActionType is null");
        }
        this.f92845l = null;
    }

    protected void a(boolean z10) {
        this.f92843j = z10;
    }

    protected boolean a() {
        if (!l()) {
            return false;
        }
        a(e3.b.closed);
        this.f92850q = (this.f92834a.getType() == InviteData.a.BANNER ? z2.BANNER : z2.ALERT).toString();
        a4.e(this.f92850q + " Closed successfully");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(long j10) throws JSONException {
        j4 j4Var;
        String str;
        Reason reason;
        if (!k7.b().c()) {
            str = this.f92835b;
            reason = Reason.interceptDisabled;
        } else if (LifeCycle.b().e()) {
            str = this.f92835b;
            reason = Reason.formOpened;
        } else {
            androidx.appcompat.app.c cVar = this.f92837d;
            if ((cVar == null || !cVar.isShowing()) && ((j4Var = this.f92838e) == null || !j4Var.x())) {
                o4 o4VarH = s7.e().h();
                if (o4VarH == null || !o4VarH.isShowing()) {
                    return true;
                }
                str = this.f92835b;
                reason = Reason.thankYouPromptOpened;
            } else {
                str = this.f92835b;
                reason = Reason.invitationOpened;
            }
        }
        a(j10, str, reason, AnalyticsBridge.c.failure);
        return false;
    }

    private boolean a(BannerData bannerData, long j10, boolean z10) throws JSONException {
        if (bannerData == null || bannerData.getInvitationBody() == null || bannerData.getInvitationTitle() == null) {
            a(j10, this.f92835b, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
            return false;
        }
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new b(j10, bannerData, z10));
            return true;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return false;
        }
    }

    private boolean a(InviteData inviteData, long j10) throws JSONException {
        if (inviteData.getProvideButtonText() == null || inviteData.getDeclineButtonText() == null || inviteData.getLaterButtonText() == null) {
            a(j10, this.f92835b, Reason.inviteDataMissing, AnalyticsBridge.c.failure);
            return false;
        }
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new c(j10, inviteData));
            return true;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return false;
        }
    }

    private boolean a(b1 b1Var, long j10, long j11, long j12) {
        String str;
        String str2;
        String str3;
        String strA;
        String strD;
        this.f92845l = this.f92835b;
        if (!a(j10)) {
            return false;
        }
        if (b1Var != null) {
            String strC = b1Var.c();
            String strB = b1Var.b();
            String strE = b1Var.e();
            strA = b1Var.a();
            strD = b1Var.d();
            str2 = strB;
            str3 = strE;
            str = strC;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            strA = null;
            strD = null;
        }
        Broadcasts.b.a(Broadcasts.b.a.TargetEvaluationSuccess, this.f92835b, j12, j11, this.f92836c, new MDCustomInterceptPayload(str, str2, str3, strA, strD));
        return true;
    }
}
