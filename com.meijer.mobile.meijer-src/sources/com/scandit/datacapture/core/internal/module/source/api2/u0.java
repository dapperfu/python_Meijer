package com.scandit.datacapture.core.internal.module.source.api2;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class u0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public final Subscription f125949a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceTexture f125950b;

    /* renamed from: c, reason: collision with root package name */
    public final Lazy f125951c;

    public u0(Subscription subscription, SurfaceTexture surfaceTexture) {
        Intrinsics.j(subscription, "subscription");
        Intrinsics.j(surfaceTexture, "surfaceTexture");
        this.f125949a = subscription;
        this.f125950b = surfaceTexture;
        this.f125951c = LazyKt.b(new t0(this));
    }
}
