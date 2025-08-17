package j7;

import android.content.Context;
import android.util.Log;
import com.fullstory.FS;
import j7.InterfaceC14872b;

/* loaded from: classes4.dex */
public class e implements InterfaceC14873c {
    @Override // j7.InterfaceC14873c
    public InterfaceC14872b a(Context context, InterfaceC14872b.a aVar) {
        boolean z10 = Z1.b.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            FS.log_d("ConnectivityMonitor", z10 ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z10 ? new d(context, aVar) : new n();
    }
}
