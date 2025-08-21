package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.WindowManager;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.o4;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class s7 implements LifeCycle.f, o4.e, o4.d, DialogInterface.OnCancelListener {

    /* renamed from: m, reason: collision with root package name */
    private static final long f93844m = 300;

    /* renamed from: n, reason: collision with root package name */
    private static final int f93845n = 1;

    /* renamed from: o, reason: collision with root package name */
    private static s7 f93846o;

    /* renamed from: a, reason: collision with root package name */
    private o4 f93847a;

    /* renamed from: b, reason: collision with root package name */
    private j2 f93848b;

    /* renamed from: c, reason: collision with root package name */
    private r7 f93849c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f93851e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f93852f;

    /* renamed from: j, reason: collision with root package name */
    private v5 f93856j;

    /* renamed from: k, reason: collision with root package name */
    private v5 f93857k;

    /* renamed from: l, reason: collision with root package name */
    private MDAppearanceMode f93858l;

    /* renamed from: d, reason: collision with root package name */
    private Handler f93850d = new Handler(Looper.getMainLooper());

    /* renamed from: g, reason: collision with root package name */
    private boolean f93853g = false;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<d> f93854h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private final ArrayList<e> f93855i = new ArrayList<>();

    class a extends v4 {
        a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            s7.this.k();
            if (s7.this.f93849c == null || s7.this.f93849c.s()) {
                return;
            }
            s7 s7Var = s7.this;
            s7Var.a(s7Var.f93849c.k());
        }
    }

    class b implements Handler.Callback {
        b() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            s7.this.a(true);
            a4.e("Thank You Prompt was closed by timeout");
            return false;
        }
    }

    class c extends v4 {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            s7.this.a(false);
            s7.this.f93847a = new o4(i4.c().d(), s7.this.f93848b, s7.this.f93852f, s7.this.f93856j, s7.this.f93857k, s7.this.f93858l);
            s7.this.f93847a.setOnCancelListener(s7.this);
            s7.this.f93847a.a((o4.e) s7.this);
            s7.this.f93847a.a((o4.d) s7.this);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(s7.this.f93847a.getWindow().getAttributes());
            layoutParams.width = -1;
            s7.this.f93847a.show();
            a4.e("Thank You Prompt was presented");
            s7.this.f93851e = true;
            s7.this.f93847a.getWindow().setAttributes(layoutParams);
        }
    }

    interface d {
        void close();
    }

    interface e {
        void a();
    }

    private s7() {
        LifeCycle.b().a(this);
    }

    protected static s7 e() {
        if (f93846o == null) {
            f93846o = new s7();
        }
        return f93846o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new c());
            ArrayList<e> arrayList = this.f93855i;
            if (arrayList != null) {
                Iterator<e> it = arrayList.iterator();
                while (it.hasNext()) {
                    e next = it.next();
                    if (next != null) {
                        next.a();
                    }
                }
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    @Override // com.medallia.digital.mobilesdk.o4.e
    public void close() {
        this.f93853g = true;
        this.f93850d.removeMessages(1);
        a(true);
    }

    protected void i() {
        a4.e("Thank You Prompt will present = re display");
        k();
    }

    protected void j() {
        if (this.f93847a != null) {
            a(false);
            a4.e("Dismiss dialog after refresh session");
            this.f93850d.removeMessages(1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        a4.e("Thank You Prompt was closed by tapping outside the view");
        this.f93853g = true;
        this.f93850d.removeMessages(1);
        a(true);
    }

    private boolean c() {
        o4 o4Var = this.f93847a;
        if (o4Var == null || !o4Var.isShowing()) {
            return false;
        }
        this.f93847a.dismiss();
        a4.e("Dismiss ThankYouPrompt Dialog");
        this.f93851e = false;
        this.f93847a = null;
        return true;
    }

    private boolean f() {
        if (this.f93852f) {
            return this.f93848b.k();
        }
        if (t0.c().a() != null && t0.c().a().sdkConfiguration != null && t0.c().a().sdkConfiguration.getMedalliaDigitalClientConfig() != null) {
            return t0.c().a().sdkConfiguration.getMedalliaDigitalClientConfig().getBlockNetworkInForm().booleanValue();
        }
        a4.b("Can't get configuration's value of BlockNetworkInForm");
        return true;
    }

    private ArrayList<String> g() {
        if (t0.c().a() != null && t0.c().a().sdkConfiguration != null && t0.c().a().sdkConfiguration.getFormConfigurations() != null) {
            return t0.c().a().sdkConfiguration.getFormConfigurations().getRedirectLinks();
        }
        a4.b("Can't get configuration's value of RedirectLinks");
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void a() {
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.f
    public void b() {
        try {
            o4 o4Var = this.f93847a;
            if (o4Var != null && o4Var.isShowing() && this.f93851e) {
                i();
                a4.e("Redisplay ThankYouPrompt Dialog");
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected boolean d() {
        if (!c()) {
            return false;
        }
        AnalyticsBridge.getInstance().reportCloseEngagementEvent(MDEngagementType.form.toString(), z2.THANK_YOU_PROMPT.toString(), this.f93848b.getFormId());
        a4.e("Thank You Prompt Closed successfully");
        return true;
    }

    public o4 h() {
        return this.f93847a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        Handler handler = new Handler(new b());
        this.f93850d = handler;
        handler.sendEmptyMessageDelayed(1, j10 * 1000);
    }

    void a(j2 j2Var, boolean z10, v5 v5Var, v5 v5Var2, MDAppearanceMode mDAppearanceMode) {
        MDAppearanceMode mDAppearanceModeB;
        MDAppearanceMode mDAppearanceModeA;
        if (j2Var == null) {
            return;
        }
        String formId = j2Var.getFormId();
        this.f93852f = z10;
        this.f93856j = v5Var;
        this.f93848b = j2Var;
        this.f93857k = v5Var2;
        this.f93858l = mDAppearanceMode;
        r7 r7VarI = j2Var.i();
        this.f93849c = r7VarI;
        if (r7VarI == null || !r7VarI.r()) {
            return;
        }
        a4.e("Thank You Prompt will presented");
        this.f93850d.postDelayed(new a(), 300L);
        if (z10) {
            return;
        }
        boolean zIsDarkModeEnabled = j2Var.isDarkModeEnabled();
        Broadcasts.d.a aVar = Broadcasts.d.a.formThankYouPrompt;
        FormTriggerType formType = j2Var.getFormType();
        FormViewType formViewType = j2Var.getFormViewType();
        boolean zP = this.f93849c.p();
        boolean zQ = this.f93849c.q();
        if (zIsDarkModeEnabled) {
            mDAppearanceModeB = v7.c().b();
            mDAppearanceModeA = v7.c().a();
        } else {
            mDAppearanceModeB = MDAppearanceMode.unknown;
            mDAppearanceModeA = MDAppearanceMode.light;
        }
        Broadcasts.d.a(aVar, formId, formType, formViewType, zP, zQ, mDAppearanceModeB, mDAppearanceModeA);
    }

    void b(String str) {
        j2 j2VarC = r2.e().c(str);
        this.f93848b = j2VarC;
        a(j2VarC, false, null, null, null);
    }

    protected void a(d dVar) {
        this.f93854h.add(dVar);
    }

    protected void a(e eVar) {
        this.f93855i.add(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        ArrayList<d> arrayList;
        c();
        if (z10 && (arrayList = this.f93854h) != null) {
            Iterator<d> it = arrayList.iterator();
            while (it.hasNext()) {
                d next = it.next();
                if (next != null) {
                    next.close();
                }
            }
        }
        if (!this.f93853g || this.f93852f) {
            return;
        }
        Broadcasts.d.a(Broadcasts.d.a.formClosed, this.f93848b.getFormId(), this.f93848b.getFormType(), this.f93848b.getFormViewType(), -1L, x3.e().b(), this.f93848b.getFormLanguage(), null, null);
        this.f93853g = false;
    }

    @Override // com.medallia.digital.mobilesdk.o4.d
    public boolean a(String str) {
        return q2.a(str, f(), g(), this.f93848b.getFormId(), this.f93848b.getFormType());
    }
}
