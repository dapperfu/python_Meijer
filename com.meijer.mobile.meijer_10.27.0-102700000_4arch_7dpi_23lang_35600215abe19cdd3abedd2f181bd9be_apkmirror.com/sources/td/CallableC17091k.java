package td;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: td.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17091k implements Callable<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f161632a;

    CallableC17091k(Context context) {
        this.f161632a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() throws Exception {
        return this.f161632a.getSharedPreferences("google_sdk_flags", 0);
    }
}
