package vd;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: vd.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17660e implements Callable<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f165800a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f165801b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Integer f165802c;

    CallableC17660e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f165800a = sharedPreferences;
        this.f165801b = str;
        this.f165802c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() throws Exception {
        return Integer.valueOf(this.f165800a.getInt(this.f165801b, this.f165802c.intValue()));
    }
}
