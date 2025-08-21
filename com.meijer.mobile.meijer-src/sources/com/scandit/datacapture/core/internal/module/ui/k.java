package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f126250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f126251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Subscription f126252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SurfaceTexture surfaceTexture, DataCaptureTextureView dataCaptureTextureView, Subscription subscription) {
        super(1);
        this.f126250a = surfaceTexture;
        this.f126251b = dataCaptureTextureView;
        this.f126252c = subscription;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        SurfaceTexture surfaceTexture = this.f126250a;
        use.a(surfaceTexture, new j(this.f126251b, this.f126252c, surfaceTexture));
        return Unit.f143329a;
    }
}
