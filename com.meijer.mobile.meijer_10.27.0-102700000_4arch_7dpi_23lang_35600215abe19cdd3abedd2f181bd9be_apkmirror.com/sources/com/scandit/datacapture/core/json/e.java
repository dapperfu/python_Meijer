package com.scandit.datacapture.core.json;

import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeJsonValue f125836a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(NativeJsonValue nativeJsonValue) {
        super(0);
        this.f125836a = nativeJsonValue;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CoreNativeTypeFactory coreNativeTypeFactory = CoreNativeTypeFactory.INSTANCE;
        NativeJsonValue _0 = this.f125836a;
        Intrinsics.i(_0, "$_0");
        return coreNativeTypeFactory.convert(_0);
    }
}
