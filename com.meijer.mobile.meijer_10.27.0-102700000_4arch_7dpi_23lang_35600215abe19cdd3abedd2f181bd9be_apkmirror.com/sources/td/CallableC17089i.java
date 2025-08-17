package td;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: td.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17089i implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f161628a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f161629b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f161630c;

    CallableC17089i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f161628a = sharedPreferences;
        this.f161629b = str;
        this.f161630c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.f161628a.getString(this.f161629b, this.f161630c);
    }
}
