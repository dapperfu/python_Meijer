package com.bugsnag.android;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012>\u0010\r\u001a:\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\t¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004j\u0004\u0018\u0001`\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/bugsnag/android/A;", "Lcom/bugsnag/android/y;", "Landroid/content/Context;", "context", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "hasConnection", "", "networkState", "", "Lcom/bugsnag/android/NetworkChangeCallback;", "callback", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "a", "()V", "b", "()Z", "c", "()Ljava/lang/String;", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "cm", "Lcom/bugsnag/android/y;", "connectivity", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class A implements InterfaceC6629y {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager cm;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6629y connectivity;

    @Override // com.bugsnag.android.InterfaceC6629y
    public void a() {
        try {
            Result.Companion companion = Result.INSTANCE;
            this.connectivity.a();
            Result.b(Unit.f143329a);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.b(ResultKt.a(th2));
        }
    }

    @Override // com.bugsnag.android.InterfaceC6629y
    public boolean b() {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(Boolean.valueOf(this.connectivity.b()));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.e(objB) != null) {
            objB = Boolean.TRUE;
        }
        return ((Boolean) objB).booleanValue();
    }

    @Override // com.bugsnag.android.InterfaceC6629y
    public String c() {
        Object objB;
        try {
            Result.Companion companion = Result.INSTANCE;
            objB = Result.b(this.connectivity.c());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objB = Result.b(ResultKt.a(th2));
        }
        if (Result.e(objB) != null) {
            objB = zzbz.UNKNOWN_CONTENT_TYPE;
        }
        return (String) objB;
    }

    public A(Context context, Function2<? super Boolean, ? super String, Unit> function2) {
        InterfaceC6629y c6631z;
        ConnectivityManager connectivityManagerB = B.b(context);
        this.cm = connectivityManagerB;
        if (connectivityManagerB == null) {
            c6631z = r1.f64358a;
        } else {
            c6631z = new C6631z(connectivityManagerB, function2);
        }
        this.connectivity = c6631z;
    }
}
