package P2;

import N4.S;
import android.content.Context;
import androidx.work.WorkerParameters;
import java.util.Map;
import kv.InterfaceC15323a;

/* loaded from: classes.dex */
public final class a extends S {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, InterfaceC15323a<b<? extends androidx.work.c>>> f24600a;

    @Override // N4.S
    public androidx.work.c a(Context context, String str, WorkerParameters workerParameters) {
        InterfaceC15323a<b<? extends androidx.work.c>> interfaceC15323a = this.f24600a.get(str);
        if (interfaceC15323a == null) {
            return null;
        }
        return interfaceC15323a.get().a(context, workerParameters);
    }

    a(Map<String, InterfaceC15323a<b<? extends androidx.work.c>>> map) {
        this.f24600a = map;
    }
}
