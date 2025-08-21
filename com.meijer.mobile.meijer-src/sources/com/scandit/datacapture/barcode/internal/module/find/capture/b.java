package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.FrameSourceState;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f123075a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.f123075a = cVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Camera.Companion companion = Camera.INSTANCE;
        Camera defaultCamera$default = Camera.Companion.getDefaultCamera$default(companion, null, 1, null);
        if (defaultCamera$default != null) {
            FrameSourceState currentState = defaultCamera$default.getCurrentState();
            FrameSourceState frameSourceState = FrameSourceState.OFF;
            if (currentState != frameSourceState) {
                defaultCamera$default.switchToDesiredState(frameSourceState);
                defaultCamera$default.getF126823a().flushPendingTasks();
            }
        }
        Camera defaultCamera = companion.getDefaultCamera(this.f123075a.f123076b);
        c cVar = this.f123075a;
        if (defaultCamera != null) {
            a block = new a(cVar);
            Intrinsics.j(defaultCamera, "<this>");
            Intrinsics.j(block, "block");
            defaultCamera.addListener(new com.scandit.datacapture.barcode.internal.module.pick.a(block));
        }
        return defaultCamera;
    }
}
