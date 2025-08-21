package l7;

import android.content.Context;
import android.util.Log;
import com.fullstory.FS;
import l7.InterfaceC15471b;

/* loaded from: classes4.dex */
public class e implements InterfaceC15472c {
    @Override // l7.InterfaceC15472c
    public InterfaceC15471b a(Context context, InterfaceC15471b.a aVar) {
        boolean z10 = Z1.b.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            FS.log_d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new n();
    }
}
