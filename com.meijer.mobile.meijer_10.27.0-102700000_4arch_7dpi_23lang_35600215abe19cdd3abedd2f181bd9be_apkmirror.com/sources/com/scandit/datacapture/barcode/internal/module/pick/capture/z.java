package com.scandit.datacapture.barcode.internal.module.pick.capture;

import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class z extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f122459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A f122460b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.scandit.datacapture.barcode.pick.ui.l lVar, A a10) {
        super(1);
        this.f122459a = lVar;
        this.f122460b = a10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FrameData frame = (FrameData) obj;
        Intrinsics.j(frame, "frame");
        ImageBuffer imageBuffer = frame.getImageBuffer();
        int width = imageBuffer.getWidth();
        int height = imageBuffer.getHeight();
        this.f122459a.invoke(Float.valueOf(Math.max(height, width) / Math.min(height, width)));
        this.f122460b.f122407a = null;
        return Unit.f142422a;
    }
}
