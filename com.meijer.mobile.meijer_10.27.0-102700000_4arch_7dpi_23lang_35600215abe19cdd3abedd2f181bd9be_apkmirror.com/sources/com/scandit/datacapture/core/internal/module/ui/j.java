package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f125295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Subscription f125296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f125297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DataCaptureTextureView dataCaptureTextureView, Subscription subscription, SurfaceTexture surfaceTexture) {
        super(0);
        this.f125295a = dataCaptureTextureView;
        this.f125296b = subscription;
        this.f125297c = surfaceTexture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f125295a.f125133d.set(false);
        this.f125295a.f125130a._impl().releaseGlResources();
        this.f125295a.f125131b.releaseGlResources();
        this.f125296b.dispose();
        this.f125297c.release();
        return Unit.f142422a;
    }
}
