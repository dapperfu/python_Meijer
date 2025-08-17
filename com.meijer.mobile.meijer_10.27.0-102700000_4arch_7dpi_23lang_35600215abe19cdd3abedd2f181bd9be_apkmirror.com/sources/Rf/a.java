package Rf;

import android.content.Context;
import com.google.firebase.n;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public class a {
    public a(com.google.firebase.f fVar, n nVar, Executor executor) {
        Context contextK = fVar.k();
        com.google.firebase.perf.config.a.g().O(contextK);
        com.google.firebase.perf.application.a aVarB = com.google.firebase.perf.application.a.b();
        aVarB.i(contextK);
        aVarB.j(new e());
        if (nVar != null) {
            AppStartTrace appStartTraceJ = AppStartTrace.j();
            appStartTraceJ.t(contextK);
            executor.execute(new AppStartTrace.c(appStartTraceJ));
        }
        SessionManager.getInstance().initializeGaugeCollection();
    }
}
