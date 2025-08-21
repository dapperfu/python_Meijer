package com.scandit.datacapture.core.internal.module.device;

import android.content.Context;
import android.os.BatteryManager;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f125166a;

    /* renamed from: b, reason: collision with root package name */
    public final Lazy f125167b;

    public c(Context context) {
        Intrinsics.j(context, "context");
        this.f125166a = context;
        this.f125167b = LazyKt.b(new b(this));
    }

    public final NativeBatteryData a() {
        return new NativeBatteryData(((BatteryManager) this.f125167b.getValue()).getIntProperty(4));
    }
}
