package androidx.work.impl.diagnostics;

import N4.AbstractC4333v;
import N4.O;
import N4.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes4.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59233a = AbstractC4333v.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC4333v.e().a(f59233a, "Requesting diagnostics");
        try {
            O.h(context).c(y.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            AbstractC4333v.e().d(f59233a, "WorkManager is not initialized", e10);
        }
    }
}
