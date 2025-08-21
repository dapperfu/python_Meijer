package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f123789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(O o10, Function0 function0) {
        super(0);
        this.f123788a = o10;
        this.f123789b = function0;
    }

    public static final void a(O this$0, Function0 whenDone) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(whenDone, "$whenDone");
        Camera camera = this$0.f123810e;
        if (camera != null) {
            camera.switchToDesiredState(FrameSourceState.STANDBY, LambdaExtensionsKt.Callback(new B(this$0, whenDone)));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f143329a;
    }

    public final void a() {
        Unit unit;
        O o10 = this.f123788a;
        Camera camera = o10.f123810e;
        if (camera != null) {
            CameraSettings cameraSettingsA = o10.a(o10.f123807b.p(), this.f123788a.c());
            final O o11 = this.f123788a;
            final Function0 function0 = this.f123789b;
            camera.applySettings(cameraSettingsA, new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.data.P
                @Override // java.lang.Runnable
                public final void run() {
                    C.a(o11, function0);
                }
            });
            unit = Unit.f143329a;
        } else {
            unit = null;
        }
        if (unit == null) {
            O.a(this.f123788a, this.f123789b);
        }
    }
}
