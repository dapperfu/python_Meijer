package vd;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: vd.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class CallableC17664i implements Callable<String> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f165806a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f165807b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f165808c;

    CallableC17664i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f165806a = sharedPreferences;
        this.f165807b = str;
        this.f165808c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() throws Exception {
        return this.f165806a.getString(this.f165807b, this.f165808c);
    }
}
