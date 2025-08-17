package Od;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.measurement.internal.C11218q2;
import com.google.android.gms.measurement.internal.X2;

/* loaded from: classes6.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final m f23573a;

    public final void a(Context context, Intent intent) {
        X2 x2M = X2.M(context, null, null);
        C11218q2 c11218q2A = x2M.a();
        if (intent == null) {
            c11218q2A.p().a("Receiver called with null intent");
            return;
        }
        x2M.c();
        String action = intent.getAction();
        c11218q2A.u().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                c11218q2A.p().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            c11218q2A.u().a("Starting wakeful intent.");
            this.f23573a.a(context, className);
        }
    }

    public n(m mVar) {
        com.google.android.gms.common.internal.r.l(mVar);
        this.f23573a = mVar;
    }
}
