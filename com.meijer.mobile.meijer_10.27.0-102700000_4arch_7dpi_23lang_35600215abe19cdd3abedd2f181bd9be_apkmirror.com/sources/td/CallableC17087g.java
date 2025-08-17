package td;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: td.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17087g implements Callable<Long> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f161625a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f161626b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Long f161627c;

    CallableC17087g(SharedPreferences sharedPreferences, String str, Long l10) {
        this.f161625a = sharedPreferences;
        this.f161626b = str;
        this.f161627c = l10;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.f161625a.getLong(this.f161626b, this.f161627c.longValue()));
    }
}
