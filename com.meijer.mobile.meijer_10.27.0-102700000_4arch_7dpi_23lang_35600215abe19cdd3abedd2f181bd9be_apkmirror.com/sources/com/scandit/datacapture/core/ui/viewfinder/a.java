package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeRectangularViewfinderAnimation f126197a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NativeRectangularViewfinderAnimation nativeRectangularViewfinderAnimation) {
        super(0);
        this.f126197a = nativeRectangularViewfinderAnimation;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeRectangularViewfinderAnimation _0 = this.f126197a;
        Intrinsics.i(_0, "$_0");
        return coreNativeTypeFactory.convert(_0);
    }
}
