package Nb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import eb.C13786c;
import eb.C13787d;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final C13786c f20763c = C13787d.a("SIGHTINGS");

    /* renamed from: a, reason: collision with root package name */
    private Context f20764a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f20765b;

    private boolean a() {
        try {
            Signature[] signatureArr = this.f20764a.getPackageManager().getPackageInfo(this.f20764a.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return false;
            }
            return new String(signatureArr[0].toByteArray()).contains("Android Debug");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public g(Context context) {
        this.f20764a = context;
        boolean zA = a();
        this.f20765b = zA;
        if (zA) {
            f20763c.d("SIGHTINGS Debug mode available - Enable with: GimbalDebugger.enableBeaconSightingsLogging();", new Object[0]);
        }
    }
}
