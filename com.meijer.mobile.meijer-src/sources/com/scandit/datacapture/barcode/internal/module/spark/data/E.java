package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.source.Camera;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class E extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O f123791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f123792b;

    public final void a() {
        O o10 = this.f123791a;
        Camera camera = o10.f123810e;
        Camera camera2 = Intrinsics.e(camera, o10.f123811f) ? this.f123791a.f123812g : Intrinsics.e(camera, this.f123791a.f123812g) ? this.f123791a.f123811f : this.f123791a.f123811f;
        if (camera2 != null) {
            O o11 = this.f123791a;
            Camera.applySettings$default(camera2, o11.a(o11.f123807b.p(), this.f123791a.c()), null, 2, null);
        }
        final O o12 = this.f123791a;
        DataCaptureContext dataCaptureContext = o12.f123806a;
        final Function0 function0 = this.f123792b;
        dataCaptureContext.setFrameSource(camera2, new Runnable() { // from class: com.scandit.datacapture.barcode.internal.module.spark.data.Q
            @Override // java.lang.Runnable
            public final void run() {
                E.a(o12, function0);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(O o10, com.scandit.datacapture.barcode.internal.module.spark.ui.S s10) {
        super(0);
        this.f123791a = o10;
        this.f123792b = s10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        a();
        return Unit.f143329a;
    }

    public static final void a(O this$0, Function0 onDone) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(onDone, "$onDone");
        O.a(this$0, new D(onDone));
    }
}
