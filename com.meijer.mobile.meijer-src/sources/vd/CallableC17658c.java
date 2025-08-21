package vd;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: vd.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17658c implements Callable<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f165797a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f165798b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Boolean f165799c;

    CallableC17658c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f165797a = sharedPreferences;
        this.f165798b = str;
        this.f165799c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf(this.f165797a.getBoolean(this.f165798b, this.f165799c.booleanValue()));
    }
}
