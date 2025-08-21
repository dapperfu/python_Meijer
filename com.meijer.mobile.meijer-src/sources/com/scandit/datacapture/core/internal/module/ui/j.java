package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f126247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Subscription f126248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f126249c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DataCaptureTextureView dataCaptureTextureView, Subscription subscription, SurfaceTexture surfaceTexture) {
        super(0);
        this.f126247a = dataCaptureTextureView;
        this.f126248b = subscription;
        this.f126249c = surfaceTexture;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.f126247a.f126085d.set(false);
        this.f126247a.f126082a._impl().releaseGlResources();
        this.f126247a.f126083b.releaseGlResources();
        this.f126248b.dispose();
        this.f126249c.release();
        return Unit.f143329a;
    }
}
