package com.scandit.datacapture.core.internal.module.ui;

import android.graphics.SurfaceTexture;
import com.scandit.datacapture.core.internal.sdk.data.Subscription;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class k extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SurfaceTexture f125298a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureTextureView f125299b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Subscription f125300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SurfaceTexture surfaceTexture, DataCaptureTextureView dataCaptureTextureView, Subscription subscription) {
        super(1);
        this.f125298a = surfaceTexture;
        this.f125299b = dataCaptureTextureView;
        this.f125300c = subscription;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.core.internal.module.gl.l use = (com.scandit.datacapture.core.internal.module.gl.l) obj;
        Intrinsics.j(use, "$this$use");
        SurfaceTexture surfaceTexture = this.f125298a;
        use.a(surfaceTexture, new j(this.f125299b, this.f125300c, surfaceTexture));
        return Unit.f142422a;
    }
}
