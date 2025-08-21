package com.bugsnag.android;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012:\u0010\u000b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bRH\u0010\u000b\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR+\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\n0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/bugsnag/android/t;", "Landroid/content/ComponentCallbacks2;", "Lcom/bugsnag/android/Q;", "deviceDataCollector", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "oldOrientation", "newOrientation", "", "cb", "", "", "memoryCallback", "<init>", "(Lcom/bugsnag/android/Q;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "level", "onTrimMemory", "(I)V", "onLowMemory", "()V", "a", "Lcom/bugsnag/android/Q;", "b", "Lkotlin/jvm/functions/Function2;", "c", "getMemoryCallback", "()Lkotlin/jvm/functions/Function2;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ComponentCallbacks2C6619t implements ComponentCallbacks2 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Q deviceDataCollector;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<String, String, Unit> cb;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function2<Boolean, Integer, Unit> memoryCallback;

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        String strN = this.deviceDataCollector.n();
        if (this.deviceDataCollector.w(newConfig.orientation)) {
            this.cb.invoke(strN, this.deviceDataCollector.n());
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.memoryCallback.invoke(Boolean.TRUE, null);
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        this.memoryCallback.invoke(Boolean.valueOf(level >= 80), Integer.valueOf(level));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ComponentCallbacks2C6619t(Q q10, Function2<? super String, ? super String, Unit> function2, Function2<? super Boolean, ? super Integer, Unit> function22) {
        this.deviceDataCollector = q10;
        this.cb = function2;
        this.memoryCallback = function22;
    }
}
