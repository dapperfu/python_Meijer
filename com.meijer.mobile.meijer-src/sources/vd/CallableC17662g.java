package vd;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: vd.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17662g implements Callable<Long> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f165803a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f165804b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Long f165805c;

    CallableC17662g(SharedPreferences sharedPreferences, String str, Long l10) {
        this.f165803a = sharedPreferences;
        this.f165804b = str;
        this.f165805c = l10;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Long call() throws Exception {
        return Long.valueOf(this.f165803a.getLong(this.f165804b, this.f165805c.longValue()));
    }
}
