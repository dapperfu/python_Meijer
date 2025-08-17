package com.meijer.mobile.meijer.activity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import com.meijer.mobile.authentication.okta.ux.OktaLoginActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/meijer/mobile/meijer/activity/ShortcutRedirectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "LCl/e;", "v", "LCl/e;", "getMeijerIntent", "()LCl/e;", "setMeijerIntent", "(LCl/e;)V", "meijerIntent", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ShortcutRedirectActivity extends Hilt_ShortcutRedirectActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Cl.e meijerIntent;

    public final Cl.e getMeijerIntent() {
        Cl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.y("meijerIntent");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_ShortcutRedirectActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        String className;
        ComponentName component;
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("com.meijer.intent.extra.EXTRA_SHORTCUT_ID");
        Intent intentN = getMeijerIntent().n(this, stringExtra);
        if (intentN != null && (component = intentN.getComponent()) != null) {
            className = component.getClassName();
        } else {
            className = null;
        }
        if (intentN != null && Intrinsics.e(className, OktaLoginActivity.class.getName())) {
            intentN.addFlags(268468224);
        }
        Cl.e meijerIntent = getMeijerIntent();
        Cl.e meijerIntent2 = getMeijerIntent();
        Intrinsics.g(stringExtra);
        if (meijerIntent.i0(meijerIntent2.P(stringExtra))) {
            return;
        }
        if (intentN == null) {
            intentN = getMeijerIntent().q(this, true, stringExtra);
        }
        startActivity(intentN);
    }
}
