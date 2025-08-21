package com.scandit.datacapture.core.internal.module.source;

import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class I extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraFactory f125734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CameraPosition f125735b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(CameraFactory cameraFactory, CameraPosition cameraPosition) {
        super(1);
        this.f125734a = cameraFactory;
        this.f125735b = cameraPosition;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        NativeAndroidCamera f126823a;
        FrameSourceState highPriorityState = (FrameSourceState) obj;
        Intrinsics.j(highPriorityState, "highPriorityState");
        D d10 = this.f125734a.f125727c;
        CameraPosition position = this.f125735b;
        d10.getClass();
        Intrinsics.j(position, "position");
        Camera camera = (Camera) d10.f125728a.get(D.a(position));
        if (camera != null && (f126823a = camera.getF126823a()) != null) {
            f126823a.switchToPriorityStateAsyncAndroid(highPriorityState);
        }
        return Unit.f143329a;
    }
}
