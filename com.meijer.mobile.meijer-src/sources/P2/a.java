package P2;

import O4.S;
import android.content.Context;
import androidx.work.WorkerParameters;
import gv.InterfaceC14411a;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends S {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, InterfaceC14411a<b<? extends androidx.work.c>>> f25298a;

    @Override // O4.S
    public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
        InterfaceC14411a<b<? extends androidx.work.c>> interfaceC14411a = this.f25298a.get(str);
        if (interfaceC14411a == null) {
            return null;
        }
        return interfaceC14411a.get().a(context, workerParameters);
    }

    a(Map<String, InterfaceC14411a<b<? extends androidx.work.c>>> map) {
        this.f25298a = map;
    }
}
