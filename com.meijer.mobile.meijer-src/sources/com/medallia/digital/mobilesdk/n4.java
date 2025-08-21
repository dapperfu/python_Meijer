package com.medallia.digital.mobilesdk;

import android.app.ActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.j;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.MedalliaWebView;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.u1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes8.dex */
abstract class n4 extends AppCompatActivity implements i2, MedalliaWebView.e {

    /* renamed from: a, reason: collision with root package name */
    protected j2 f93433a;

    /* renamed from: d, reason: collision with root package name */
    private long f93436d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f93437e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f93438f;

    /* renamed from: g, reason: collision with root package name */
    private MedalliaWebView f93439g;

    /* renamed from: h, reason: collision with root package name */
    private long f93440h;

    /* renamed from: i, reason: collision with root package name */
    boolean f93441i;

    /* renamed from: j, reason: collision with root package name */
    v5 f93442j;

    /* renamed from: k, reason: collision with root package name */
    private BaseFormCommunicator f93443k;

    /* renamed from: b, reason: collision with root package name */
    private boolean f93434b = true;

    /* renamed from: c, reason: collision with root package name */
    private boolean f93435c = false;

    /* renamed from: l, reason: collision with root package name */
    private Handler f93444l = new Handler();

    /* renamed from: m, reason: collision with root package name */
    private v4 f93445m = new a();

    class a extends v4 {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (n4.this.f93439g.isRenderFinished() || n4.this.isFinishing()) {
                return;
            }
            if (!n4.this.f93441i) {
                AnalyticsBridge.getInstance().reportFormLoadSpinnerEvent(n4.this.f93433a.getFormId(), Long.valueOf(n4.this.f93436d), n4.this.f93433a.getFormViewType(), n4.this.f93433a.getFormType());
            }
            n4.this.a(true);
        }
    }

    class b extends v4 {
        b() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            n4.this.f93434b = false;
            n4.this.e();
        }
    }

    class c extends v4 {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            n4.this.a(false);
        }
    }

    class d extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n4 f93449a;

        d(n4 n4Var) {
            this.f93449a = n4Var;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            n4.this.f93439g.setFormCommunicatorListener(this.f93449a);
            n4.this.f93439g.setLoadingListener(this.f93449a);
            if (n4.this.f93439g.isRenderFinished()) {
                n4.this.a(false);
            }
            n4.this.f93439g.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            if (n4.this.f93439g.getParent() != null) {
                ((ViewGroup) n4.this.f93439g.getParent()).removeView(n4.this.f93439g);
            }
            ((RelativeLayout) n4.this.findViewById(R.id.medallia_form_webview_layout)).addView(n4.this.f93439g);
            if (n4.this.f93439g.isRenderFinished()) {
                n4.this.f93435c = true;
                n4 n4Var = n4.this;
                if (n4Var.f93441i) {
                    return;
                }
                n4Var.l();
            }
        }
    }

    n4() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ androidx.core.view.j a(View view, androidx.core.view.j jVar) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = jVar.f(j.n.h()).f61162b + g();
        if (m()) {
            marginLayoutParams.bottomMargin = jVar.f(j.n.g()).f61164d + g();
        }
        marginLayoutParams.leftMargin = jVar.f(j.n.g()).f61161a + g();
        marginLayoutParams.rightMargin = jVar.f(j.n.g()).f61163c + g();
        view.setLayoutParams(marginLayoutParams);
        return jVar;
    }

    private void d() throws JSONException {
        if (this.f93433a != null) {
            a4.e("FormId: " + this.f93433a.getFormId() + " close was called");
            if (this.f93439g != null) {
                ((RelativeLayout) findViewById(R.id.medallia_form_webview_layout)).removeView(this.f93439g);
                if (this.f93439g.getParent() != null) {
                    ((ViewGroup) this.f93439g.getParent()).removeView(this.f93439g);
                }
                y8.b().a(this.f93439g);
            }
            if (this.f93441i) {
                return;
            }
            if (!this.f93435c) {
                l();
            }
            if (!this.f93434b) {
                if (this.f93433a.i().r()) {
                    return;
                }
                n();
                return;
            }
            Broadcasts.d.a(Broadcasts.d.a.formDismissed, this.f93433a.getFormId(), this.f93433a.getFormType(), this.f93433a.getFormViewType(), 0L, x3.e().b(), this.f93433a.getFormLanguage(), null, null);
            n();
            h();
            if (!k() || this.f93437e) {
                return;
            }
            AnalyticsBridge.getInstance().reportLoadingIndicatorClosedEvent(this.f93433a.getFormId(), this.f93433a.getFormType(), this.f93433a.getFormViewType());
        }
    }

    private void h() {
        if (this.f93433a.getInviteData() == null || this.f93433a.getInviteData().getType().equals(InviteData.a.PUSH_NOTIFICATION) || t0.c().a() == null || t0.c().a().getSdkConfiguration() == null || t0.c().a().getSdkConfiguration().getFormConfigurations() == null || !t0.c().a().getSdkConfiguration().getFormConfigurations().isCloseFormQuarantine()) {
            return;
        }
        a4.b("Form closed - updating quarantine");
        Intent intent = new Intent("com.medallia.digital.mobilesdk.LastDeclineTimestampCollectorFilter");
        intent.putExtra("com.medallia.digital.mobilesdk.LastDeclineTimestampCollector", System.currentTimeMillis());
        q4.a(i4.c().b()).a(intent);
        Intent intent2 = new Intent("com.medallia.digital.mobilesdk.EvaluateReceiverFilter");
        intent2.putExtra("com.medallia.digital.mobilesdk.EvaluateReceiverInitiator", u1.b.declineInvitation);
        q4.a(i4.c().b()).a(intent2);
    }

    private void i() {
        ViewCompat.A0(f(), new p2.G() { // from class: com.medallia.digital.mobilesdk.B
            @Override // p2.G
            public final androidx.core.view.j onApplyWindowInsets(View view, androidx.core.view.j jVar) {
                return this.f92219a.a(view, jVar);
            }
        });
    }

    private boolean k() {
        return findViewById(R.id.medallia_progress_bar).getVisibility() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (this.f93433a.isDarkModeEnabled()) {
            Broadcasts.d.a(Broadcasts.d.a.formDisplayed, this.f93433a.getFormId(), this.f93433a.getFormType(), this.f93433a.getFormViewType(), System.currentTimeMillis() - this.f93440h, x3.e().b(), this.f93433a.getFormLanguage(), v7.c().b(), v7.c().a());
        } else {
            Broadcasts.d.a(Broadcasts.d.a.formDisplayed, this.f93433a.getFormId(), this.f93433a.getFormType(), this.f93433a.getFormViewType(), System.currentTimeMillis() - this.f93440h, x3.e().b(), this.f93433a.getFormLanguage(), MDAppearanceMode.unknown, MDAppearanceMode.light);
        }
    }

    void c() {
        runOnUiThread(new d(this));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a4.b("Activity dispatchTouchEvent");
        Broadcasts.j.a(Broadcasts.j.a.TouchEvent, motionEvent.getAction());
        return super.dispatchTouchEvent(motionEvent);
    }

    protected void e() {
        ActivityManager activityManager;
        v4 v4Var;
        Handler handler = this.f93444l;
        if (handler != null && (v4Var = this.f93445m) != null) {
            handler.removeCallbacks(v4Var);
            this.f93444l.removeCallbacksAndMessages(null);
            this.f93444l = null;
            this.f93445m = null;
        }
        if (this.f93438f && (activityManager = (ActivityManager) getSystemService("activity")) != null) {
            List<ActivityManager.AppTask> appTasks = activityManager.getAppTasks();
            int taskId = getTaskId();
            for (ActivityManager.AppTask appTask : appTasks) {
                if (appTask.getTaskInfo().id == taskId && appTask.getTaskInfo().numActivities == 1) {
                    finishAndRemoveTask();
                    a4.e("FormActivity finished and removed the task");
                    return;
                }
            }
        }
        finish();
    }

    protected abstract View f();

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        p2 p2VarB = d8.b(this.f93433a.j());
        overridePendingTransition(p2VarB.a(), p2VarB.b());
    }

    protected abstract int g();

    protected abstract void j();

    protected boolean m() {
        return true;
    }

    protected void n() {
        Broadcasts.d.a(Broadcasts.d.a.formClosed, this.f93433a.getFormId(), this.f93433a.getFormType(), this.f93433a.getFormViewType(), -1L, x3.e().b(), this.f93433a.getFormLanguage(), null, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (intent != null) {
            try {
                this.f93443k.handleVideoMediaCapture(intent);
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        e();
    }

    public void onClose() {
        runOnUiThread(new b());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws JSONException {
        v5 v5VarA;
        Intent intent = getIntent();
        if (intent == null || !intent.hasExtra("com.medallia.digital.mobilesdk.form_data")) {
            e();
            return;
        }
        this.f93440h = System.currentTimeMillis();
        this.f93433a = (j2) intent.getSerializableExtra("com.medallia.digital.mobilesdk.form_data");
        boolean booleanExtra = intent.getBooleanExtra("com.medallia.digital.mobilesdk.is_show_form", false);
        this.f93437e = intent.getBooleanExtra("com.medallia.digital.mobilesdk.is_form_available", false);
        this.f93441i = intent.getBooleanExtra("com.medallia.digital.mobilesdk.form_is_preview_app", false);
        String stringExtra = intent.getStringExtra("com.medallia.digital.mobilesdk.extra_invite_type");
        InviteData.a aVar = InviteData.a.LOCAL_NOTIFICATION;
        if (aVar.name().equals(stringExtra)) {
            AnalyticsBridge.getInstance().reportInvitationAcceptedEvent(this.f93433a.getFormId(), aVar.name(), new e3((e3.c) null, e3.b.closed, false));
        }
        if (this.f93441i) {
            this.f93439g = y8.b().c(MedalliaWebView.f.preview);
            v5VarA = (v5) intent.getSerializableExtra("com.medallia.digital.mobilesdk.form_header_palette");
        } else {
            this.f93439g = y8.b().c(a(this.f93433a, booleanExtra));
            v5VarA = v7.c().a(this.f93433a.getHeaderThemeName());
        }
        this.f93442j = v5VarA;
        MedalliaWebView medalliaWebView = this.f93439g;
        if (medalliaWebView != null) {
            this.f93443k = medalliaWebView.getFormCommunicator();
        }
        boolean booleanExtra2 = intent.getBooleanExtra("com.medallia.digital.mobilesdk.vuln_enabled", true);
        long longExtra = intent.getLongExtra("com.medallia.digital.mobilesdk.spinner_delay", q6.f93596d.longValue());
        this.f93436d = longExtra;
        if (booleanExtra) {
            if (!this.f93437e) {
                longExtra = 0;
            }
            this.f93444l.postDelayed(this.f93445m, longExtra);
        }
        setRequestedOrientation(intent.getBooleanExtra("com.medallia.digital.mobilesdk.inherit_orientation", false) ? 3 : 10);
        this.f93438f = intent.getBooleanExtra("com.medallia.digital.mobilesdk.remove_task", false);
        if (!this.f93441i && booleanExtra2 && getWindow() != null) {
            getWindow().addFlags(8192);
        }
        p2 p2VarA = d8.a(this.f93433a.j());
        overridePendingTransition(p2VarA.a(), p2VarA.b());
        j2 j2Var = this.f93433a;
        if (j2Var != null && j2Var.isDarkModeEnabled() && MDAppearanceMode.dark.equals(v7.c().a())) {
            getDelegate().N(2);
        } else {
            getDelegate().N(1);
        }
        super.onCreate(bundle);
        j();
        i();
        c();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() throws JSONException {
        super.onDestroy();
        BaseFormCommunicator baseFormCommunicator = this.f93443k;
        if (baseFormCommunicator != null && !baseFormCommunicator.getHasMediaData() && this.f93443k.getMediaData() != null) {
            g2.c(this.f93443k.getMediaData().e());
        }
        if (isFinishing()) {
            d();
            MedalliaWebView medalliaWebView = this.f93439g;
            if (medalliaWebView == null || !medalliaWebView.isPreload()) {
                return;
            }
            this.f93439g.reloadWebView();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 111) {
            return super.onKeyDown(i10, keyEvent);
        }
        e();
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        MedalliaWebView medalliaWebView = this.f93439g;
        if (medalliaWebView != null) {
            medalliaWebView.setFormCommunicatorListener(null);
            this.f93439g.setLoadingListener(null);
        }
    }

    public void onReady() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        super.onRequestPermissionsResult(i10, strArr, iArr);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (iArr[i11] == 0) {
                arrayList.add(strArr[i11]);
            }
        }
        BaseFormCommunicator baseFormCommunicator = this.f93443k;
        if (baseFormCommunicator != null) {
            baseFormCommunicator.checkWhichPermissionsGranted(arrayList);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        MedalliaWebView medalliaWebView = this.f93439g;
        if (medalliaWebView != null) {
            medalliaWebView.setFormCommunicatorListener(this);
            this.f93439g.setLoadingListener(this);
        }
    }

    private MedalliaWebView.f a(j2 j2Var, boolean z10) {
        return j2Var.l() ? MedalliaWebView.f.preload : z10 ? MedalliaWebView.f.showForm : MedalliaWebView.f.invitationProducer;
    }

    public void b() {
        if (this.f93435c) {
            return;
        }
        this.f93435c = true;
        if (this.f93441i) {
            return;
        }
        l();
    }

    public void a() {
        runOnUiThread(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        findViewById(R.id.medallia_progress_bar).setVisibility(z10 ? 0 : 8);
    }
}
