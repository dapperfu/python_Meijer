package vd;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: vd.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17666k implements Callable<SharedPreferences> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f165810a;

    CallableC17666k(Context context) {
        this.f165810a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ SharedPreferences call() throws Exception {
        return this.f165810a.getSharedPreferences("google_sdk_flags", 0);
    }
}
