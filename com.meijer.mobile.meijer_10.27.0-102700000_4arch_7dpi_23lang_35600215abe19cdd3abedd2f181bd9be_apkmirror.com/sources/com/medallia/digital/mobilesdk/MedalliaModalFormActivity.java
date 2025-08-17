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

/* loaded from: classes7.dex */
public class MedalliaModalFormActivity extends n4 {

    /* renamed from: n, reason: collision with root package name */
    public final int f91565n = 30;

    /* renamed from: o, reason: collision with root package name */
    private ImageView f91566o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f91567p;

    /* renamed from: q, reason: collision with root package name */
    private View f91568q;

    private void o() {
        this.f91566o.setOnClickListener(new View.OnClickListener() { // from class: com.medallia.digital.mobilesdk.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92768a.a(view);
            }
        });
    }

    private void p() {
        y3 localization;
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (localization = t0.c().a().getLocalization()) != null) {
                ResourceContract resourceContractF = localization.f();
                String strA = x3.e().a(resourceContractF != null ? resourceContractF.getLocalUrl() : null, this.f92594a.getFormLanguage(), x3.c.CLOSE, (x3.a) null);
                if (TextUtils.isEmpty(strA)) {
                    return;
                }
                this.f91566o.setContentDescription(strA);
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private void q() {
        v5 v5Var;
        this.f91567p.setText(this.f92594a.getTitle());
        String titleTextColor = this.f92594a.getTitleTextColor();
        String titleBackgroundColor = this.f92594a.getTitleBackgroundColor();
        try {
            if (this.f92594a.isDarkModeEnabled() && (v5Var = this.f92603j) != null) {
                titleBackgroundColor = v5Var.b().b();
                titleTextColor = this.f92603j.c().b();
            }
        } catch (Exception unused) {
            a4.f("Error on set title text and background dark mode color");
        }
        if (!TextUtils.isEmpty(titleTextColor)) {
            try {
                this.f91567p.setTextColor(Color.parseColor(titleTextColor));
                this.f91566o.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.SRC_IN);
            } catch (Exception unused2) {
                a4.f("Error on set title text color");
            }
        }
        if (TextUtils.isEmpty(titleBackgroundColor)) {
            return;
        }
        try {
            int color = Color.parseColor(titleBackgroundColor);
            this.f91567p.setBackgroundColor(color);
            this.f91568q.setBackgroundColor(color);
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
        this.f91566o = (ImageView) findViewById(R.id.medallia_modal_close_button);
        this.f91567p = (TextView) findViewById(R.id.medallia_typ_form_title);
        this.f91568q = findViewById(R.id.medallia_delimiter);
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
