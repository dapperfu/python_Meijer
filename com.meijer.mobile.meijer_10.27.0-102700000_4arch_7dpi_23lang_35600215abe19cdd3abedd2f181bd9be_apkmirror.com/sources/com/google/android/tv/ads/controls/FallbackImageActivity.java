package com.google.android.tv.ads.controls;

import android.R;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.internal.atv_ads_framework.B1;
import com.google.android.gms.internal.atv_ads_framework.o2;
import com.google.android.gms.internal.atv_ads_framework.p2;
import ze.AbstractC18449d;
import ze.e;

/* loaded from: classes4.dex */
public final class FallbackImageActivity extends AppCompatActivity {
    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        Bundle bundle2 = new Bundle();
        if (extras != null) {
            bundle2.putBoolean("render_error_message", extras.getBoolean("render_error_message"));
            e eVar = (e) extras.getParcelable("icon_click_fallback_images");
            if (eVar != null && !eVar.b().isEmpty() && eVar.b().get(0).c() != null) {
                AbstractC18449d abstractC18449d = eVar.b().get(0);
                bundle2.putString("wta_uri", abstractC18449d.c());
                bundle2.putString("wta_alt_text", abstractC18449d.F0());
            } else {
                B1 b1A = B1.a(this);
                o2 o2VarQ = p2.q();
                o2VarQ.g(2);
                o2VarQ.j(2);
                o2VarQ.i(6);
                b1A.b((p2) o2VarQ.c());
                bundle2.putBoolean("render_error_message", true);
            }
        } else {
            B1 b1A2 = B1.a(this);
            o2 o2VarQ2 = p2.q();
            o2VarQ2.g(2);
            o2VarQ2.j(2);
            o2VarQ2.i(5);
            b1A2.b((p2) o2VarQ2.c());
            bundle2.putBoolean("render_error_message", true);
        }
        getSupportFragmentManager().beginTransaction().x(true).t(R.id.content, SideDrawerFragment.class, bundle2).h();
    }
}
