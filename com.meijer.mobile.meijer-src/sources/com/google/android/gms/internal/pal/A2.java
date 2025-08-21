package com.google.android.gms.internal.pal;

import Kc.a;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import com.fullstory.FS;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes6.dex */
public final class A2 extends K2 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f83309e;

    public A2(Handler handler, ExecutorService executorService, Context context) {
        super(handler, executorService, C10783e2.b(2L));
        this.f83309e = context;
    }

    private final AbstractC10995r6 g() {
        if (this.f83309e.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            try {
                ContentResolver contentResolver = this.f83309e.getContentResolver();
                String string = Settings.Secure.getString(contentResolver, "advertising_id");
                boolean z10 = true;
                if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 1) {
                    z10 = false;
                }
                return AbstractC10995r6.f(new C2(string, "afai", z10));
            } catch (Settings.SettingNotFoundException e10) {
                FS.log_e("NonceGenerator", "Failed to retrieve advertising info from amazon fire tv.", e10);
            }
        }
        return AbstractC10995r6.e();
    }

    private final AbstractC10995r6 h() {
        try {
            a.C0277a c0277aA = Kc.a.a(this.f83309e);
            String strA = c0277aA.a();
            if (strA == null) {
                strA = "";
            }
            return AbstractC10995r6.f(new C2(strA, "adid", c0277aA.b()));
        } catch (GooglePlayServicesNotAvailableException e10) {
            FS.log_e("NonceGenerator", "Google Play services is not available entirely.", e10);
            return AbstractC10995r6.e();
        } catch (GooglePlayServicesRepairableException e11) {
            FS.log_e("NonceGenerator", "Obsolete or disabled version of Google Play Services", e11);
            return AbstractC10995r6.e();
        } catch (IOException e12) {
            FS.log_e("NonceGenerator", "Unrecoverable error connecting to Google Play services.", e12);
            return AbstractC10995r6.e();
        } catch (IllegalStateException e13) {
            FS.log_e("NonceGenerator", "IllegalStateException, can't access android advertising info.", e13);
            return AbstractC10995r6.e();
        }
    }

    @Override // com.google.android.gms.internal.pal.K2
    final AbstractC10995r6 a() {
        AbstractC10995r6 abstractC10995r6G = g();
        if (!abstractC10995r6G.d()) {
            return h();
        }
        return abstractC10995r6G;
    }
}
