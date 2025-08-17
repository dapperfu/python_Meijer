package td;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: td.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17083c implements Callable<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f161619a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f161620b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Boolean f161621c;

    CallableC17083c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f161619a = sharedPreferences;
        this.f161620b = str;
        this.f161621c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf(this.f161619a.getBoolean(this.f161620b, this.f161621c.booleanValue()));
    }
}
