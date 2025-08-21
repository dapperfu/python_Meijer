package com.medallia.digital.mobilesdk;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.medallia.digital.mobilesdk.x3;
import org.json.JSONException;

/* loaded from: classes8.dex */
public class MedalliaModalFormActivity extends n4 {

    /* renamed from: n, reason: collision with root package name */
    public final int f92404n = 30;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f92405o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f92406p;

    /* renamed from: q, reason: collision with root package name */
    private View f92407q;

    private void o() {
        this.f92405o.setOnClickListener(new View.OnClickListener() { // from class: com.medallia.digital.mobilesdk.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93607a.a(view);
            }
        });
    }

    private void p() {
        y3 localization;
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (localization = t0.c().a().getLocalization()) != null) {
                ResourceContract resourceContractF = localization.f();
                String strA = x3.e().a(resourceContractF != null ? resourceContractF.getLocalUrl() : null, this.f93433a.getFormLanguage(), x3.c.CLOSE, (x3.a) null);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                this.f92405o.setContentDescription(strA);
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private void q() {
        v5 v5Var;
        this.f92406p.setText(this.f93433a.getTitle());
        String titleTextColor = this.f93433a.getTitleTextColor();
        String titleBackgroundColor = this.f93433a.getTitleBackgroundColor();
        try {
            if (this.f93433a.isDarkModeEnabled() && (v5Var = this.f93442j) != null) {
                titleBackgroundColor = v5Var.b().b();
                titleTextColor = this.f93442j.c().b();
            }
        } catch (Exception unused) {
            a4.f("Error on set title text and background dark mode color");
        }
        if (!TextUtils.isEmpty(titleTextColor)) {
            try {
                this.f92406p.setTextColor(Color.parseColor(titleTextColor));
                this.f92405o.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.SRC_IN);
            } catch (Exception unused2) {
                a4.f("Error on set title text color");
            }
        }
        if (TextUtils.isEmpty(titleBackgroundColor)) {
            return;
        }
        try {
            int color = Color.parseColor(titleBackgroundColor);
            this.f92406p.setBackgroundColor(color);
            this.f92407q.setBackgroundColor(color);
        } catch (Exception unused3) {
            a4.f("Error on set title background color");
        }
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.MedalliaWebView.e
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.MedalliaWebView.e
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.medallia.digital.mobilesdk.n4, android.app.Activity, android.view.Window.Callback
    public /* bridge */ /* synthetic */ boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.medallia.digital.mobilesdk.n4
    protected View f() {
        return findViewById(R.id.medallia_modal_root_view);
    }

    @Override // com.medallia.digital.mobilesdk.n4, android.app.Activity
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    @Override // com.medallia.digital.mobilesdk.n4
    protected int g() {
        return 30;
    }

    @Override // com.medallia.digital.mobilesdk.n4
    protected void j() {
        setContentView(R.layout.medallia_activity_modal_form);
        this.f92405o = (ImageView) findViewById(R.id.medallia_modal_close_button);
        this.f92406p = (TextView) findViewById(R.id.medallia_typ_form_title);
        this.f92407q = findViewById(R.id.medallia_delimiter);
        p();
        q();
        o();
    }

    @Override // com.medallia.digital.mobilesdk.i2
    public void mediaCaptureResult(String str) {
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.view.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.i2
    public /* bridge */ /* synthetic */ void onClose() {
        super.onClose();
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onDestroy() throws JSONException {
        super.onDestroy();
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public /* bridge */ /* synthetic */ boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.i2
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        e();
    }
}
