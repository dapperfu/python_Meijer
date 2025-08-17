package td;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: td.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17085e implements Callable<Integer> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f161622a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f161623b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Integer f161624c;

    CallableC17085e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f161622a = sharedPreferences;
        this.f161623b = str;
        this.f161624c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Integer call() throws Exception {
        return Integer.valueOf(this.f161622a.getInt(this.f161623b, this.f161624c.intValue()));
    }
}
