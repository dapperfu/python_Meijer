package androidx.work.impl.diagnostics;

import O4.AbstractC4373v;
import O4.O;
import O4.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes4.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final String f59419a = AbstractC4373v.i("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC4373v.e().a(f59419a, "Requesting diagnostics");
        try {
            O.h(context).c(y.e(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            AbstractC4373v.e().d(f59419a, "WorkManager is not initialized", e10);
        }
    }
}
