package Lb;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import cb.C6382c;
import cb.C6383d;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private static final C6382c f17943c = C6383d.a("SIGHTINGS");

    /* renamed from: a, reason: collision with root package name */
    private Context f17944a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17945b;

    private boolean a() {
        try {
            Signature[] signatureArr = this.f17944a.getPackageManager().getPackageInfo(this.f17944a.getPackageName(), 64).signatures;
            if (signatureArr == null || signatureArr.length <= 0) {
                return false;
            }
            return new String(signatureArr[0].toByteArray()).contains("Android Debug");
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public g(Context context) {
        this.f17944a = context;
        boolean zA = a();
        this.f17945b = zA;
        if (zA) {
            f17943c.d("SIGHTINGS Debug mode available - Enable with: GimbalDebugger.enableBeaconSightingsLogging();", new Object[0]);
        }
    }
}
