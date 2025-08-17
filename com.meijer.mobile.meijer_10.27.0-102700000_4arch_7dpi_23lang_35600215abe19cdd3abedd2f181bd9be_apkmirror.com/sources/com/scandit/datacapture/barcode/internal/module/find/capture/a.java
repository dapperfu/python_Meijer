package com.scandit.datacapture.barcode.internal.module.find.capture;

import com.scandit.datacapture.core.common.graphic.ImageBuffer;
import com.scandit.datacapture.core.data.FrameData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f122122a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar) {
        super(1);
        this.f122122a = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FrameData it = (FrameData) obj;
        Intrinsics.j(it, "it");
        ImageBuffer imageBuffer = it.getImageBuffer();
        this.f122122a.f122125c.invoke(Integer.valueOf(imageBuffer.getWidth()), Integer.valueOf(imageBuffer.getHeight()));
        return Unit.f142422a;
    }
}
