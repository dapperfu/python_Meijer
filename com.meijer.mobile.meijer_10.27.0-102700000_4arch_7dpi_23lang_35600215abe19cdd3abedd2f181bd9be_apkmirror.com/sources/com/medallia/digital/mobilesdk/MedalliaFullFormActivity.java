package com.medallia.digital.mobilesdk;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.medallia.digital.mobilesdk.x3;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class MedalliaFullFormActivity extends n4 {

    /* renamed from: n, reason: collision with root package name */
    private Toolbar f91562n;

    /* renamed from: o, reason: collision with root package name */
    private View f91563o;

    /* renamed from: p, reason: collision with root package name */
    private TextView f91564p;

    private String o() {
        y3 localization;
        String string = getString(R.string.back);
        try {
            AccessibilityManager accessibilityManager = (AccessibilityManager) getSystemService("accessibility");
            if (accessibilityManager != null && accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (localization = t0.c().a().getLocalization()) != null) {
                ResourceContract resourceContractF = localization.f();
                String strA = x3.e().a(resourceContractF != null ? resourceContractF.getLocalUrl() : null, this.f92594a.getFormLanguage(), x3.c.BACK, (x3.a) null);
                if (!TextUtils.isEmpty(strA)) {
                    return strA;
                }
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void p() {
        /*
            r5 = this;
            com.medallia.digital.mobilesdk.j2 r0 = r5.f92594a
            if (r0 == 0) goto Lae
            java.lang.String r0 = r0.getTitle()
            com.medallia.digital.mobilesdk.j2 r1 = r5.f92594a
            java.lang.String r1 = r1.getTitleTextColor()
            com.medallia.digital.mobilesdk.j2 r2 = r5.f92594a
            java.lang.String r2 = r2.getTitleBackgroundColor()
            com.medallia.digital.mobilesdk.j2 r3 = r5.f92594a     // Catch: java.lang.Exception -> L33
            boolean r3 = r3.isDarkModeEnabled()     // Catch: java.lang.Exception -> L33
            if (r3 == 0) goto L38
            com.medallia.digital.mobilesdk.v5 r3 = r5.f92603j     // Catch: java.lang.Exception -> L33
            if (r3 == 0) goto L38
            com.medallia.digital.mobilesdk.y0 r3 = r3.b()     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = r3.b()     // Catch: java.lang.Exception -> L33
            com.medallia.digital.mobilesdk.v5 r3 = r5.f92603j     // Catch: java.lang.Exception -> L33
            com.medallia.digital.mobilesdk.i8 r3 = r3.c()     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = r3.b()     // Catch: java.lang.Exception -> L33
            goto L38
        L33:
            java.lang.String r3 = "Error on set title text and background dark mode color"
            com.medallia.digital.mobilesdk.a4.f(r3)
        L38:
            com.medallia.digital.mobilesdk.j2 r3 = r5.f92594a
            boolean r3 = r3.isRtl()
            if (r3 == 0) goto L53
            androidx.appcompat.widget.Toolbar r3 = r5.f91562n     // Catch: java.lang.Exception -> L4d
            r4 = 1
            r3.setLayoutDirection(r4)     // Catch: java.lang.Exception -> L4d
            androidx.appcompat.widget.Toolbar r3 = r5.f91562n     // Catch: java.lang.Exception -> L4d
            r4 = 4
            r3.setTextDirection(r4)     // Catch: java.lang.Exception -> L4d
            goto L63
        L4d:
            java.lang.String r3 = "Error on set toolbar direction to RTL"
        L4f:
            com.medallia.digital.mobilesdk.a4.f(r3)
            goto L63
        L53:
            androidx.appcompat.widget.Toolbar r3 = r5.f91562n     // Catch: java.lang.Exception -> L60
            r4 = 0
            r3.setLayoutDirection(r4)     // Catch: java.lang.Exception -> L60
            androidx.appcompat.widget.Toolbar r3 = r5.f91562n     // Catch: java.lang.Exception -> L60
            r4 = 3
            r3.setTextDirection(r4)     // Catch: java.lang.Exception -> L60
            goto L63
        L60:
            java.lang.String r3 = "Error on set toolbar direction to LTR"
            goto L4f
        L63:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L6e
            android.widget.TextView r3 = r5.f91564p
            r3.setText(r0)
        L6e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L88
            int r0 = android.graphics.Color.parseColor(r2)     // Catch: java.lang.Exception -> L83
            androidx.appcompat.widget.Toolbar r2 = r5.f91562n     // Catch: java.lang.Exception -> L83
            r2.setBackgroundColor(r0)     // Catch: java.lang.Exception -> L83
            android.view.View r2 = r5.f91563o     // Catch: java.lang.Exception -> L83
            r2.setBackgroundColor(r0)     // Catch: java.lang.Exception -> L83
            goto L88
        L83:
            java.lang.String r0 = "Error on set title background color"
            com.medallia.digital.mobilesdk.a4.f(r0)
        L88:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lae
            android.widget.TextView r0 = r5.f91564p     // Catch: java.lang.Exception -> La9
            int r2 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> La9
            r0.setTextColor(r2)     // Catch: java.lang.Exception -> La9
            androidx.appcompat.widget.Toolbar r0 = r5.f91562n     // Catch: java.lang.Exception -> La9
            android.graphics.drawable.Drawable r0 = r0.getNavigationIcon()     // Catch: java.lang.Exception -> La9
            if (r0 == 0) goto Lae
            int r1 = android.graphics.Color.parseColor(r1)     // Catch: java.lang.Exception -> La9
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY     // Catch: java.lang.Exception -> La9
            r0.setColorFilter(r1, r2)     // Catch: java.lang.Exception -> La9
            goto Lae
        La9:
            java.lang.String r0 = "Error on set title text color"
            com.medallia.digital.mobilesdk.a4.f(r0)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.MedalliaFullFormActivity.p():void");
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
        return findViewById(R.id.medallia_form_layout);
    }

    @Override // com.medallia.digital.mobilesdk.n4, android.app.Activity
    public /* bridge */ /* synthetic */ void finish() {
        super.finish();
    }

    @Override // com.medallia.digital.mobilesdk.n4
    protected int g() {
        return 0;
    }

    @Override // com.medallia.digital.mobilesdk.n4
    protected void j() {
        setContentView(R.layout.medallia_activity_full_form);
        this.f91562n = (Toolbar) findViewById(R.id.medallia_toolbar);
        this.f91563o = findViewById(R.id.medallia_delimiter);
        setSupportActionBar(this.f91562n);
        if (getSupportActionBar() != null) {
            getSupportActionBar().t(false);
            getSupportActionBar().s(true);
            getSupportActionBar().w(o());
        }
        this.f91564p = (TextView) findViewById(R.id.medallia_title_text_view);
        p();
    }

    @Override // com.medallia.digital.mobilesdk.n4
    protected boolean m() {
        if (Build.VERSION.SDK_INT < 29) {
            return true;
        }
        try {
            return Settings.Secure.getInt(getContentResolver(), "navigation_mode") != 2;
        } catch (Exception e10) {
            a4.b(e10.getMessage());
            return true;
        }
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

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        e();
        return true;
    }

    @Override // com.medallia.digital.mobilesdk.n4, com.medallia.digital.mobilesdk.i2
    public /* bridge */ /* synthetic */ void onReady() {
        super.onReady();
    }

    @Override // com.medallia.digital.mobilesdk.n4, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }
}
