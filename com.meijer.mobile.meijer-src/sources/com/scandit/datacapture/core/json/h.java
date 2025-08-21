package com.scandit.datacapture.core.json;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class h extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeJsonValue f126791a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(NativeJsonValue nativeJsonValue) {
        super(0);
        this.f126791a = nativeJsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeJsonValue _0 = this.f126791a;
        Intrinsics.i(_0, "$_0");
        return coreNativeTypeFactory.convert(_0);
    }
}
