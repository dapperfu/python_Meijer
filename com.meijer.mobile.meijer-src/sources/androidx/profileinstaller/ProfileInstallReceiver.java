package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import androidx.privacysandbox.ads.adservices.measurement.k;
import androidx.profileinstaller.f;
import java.io.IOException;

/* loaded from: classes4.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    class a implements f.c {
        a() {
        }

        @Override // androidx.profileinstaller.f.c
        public void a(int i10, Object obj) {
            f.f58040b.a(i10, obj);
            ProfileInstallReceiver.this.setResultCode(i10);
        }

        @Override // androidx.profileinstaller.f.c
        public void b(int i10, Object obj) {
            f.f58040b.b(i10, obj);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) throws PackageManager.NameNotFoundException, IOException {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            f.j(context, new k(), new a(), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    f.k(context, new k(), new a());
                    return;
                } else {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        f.c(context, new k(), new a());
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            a(new a());
            return;
        }
        if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
            return;
        }
        String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
        a aVar = new a();
        if ("DROP_SHADER_CACHE".equals(string2)) {
            androidx.profileinstaller.a.b(context, aVar);
        } else {
            aVar.a(16, null);
        }
    }

    static void a(f.c cVar) {
        Process.sendSignal(Process.myPid(), 10);
        cVar.a(12, null);
    }
}
