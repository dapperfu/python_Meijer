package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class L extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f123801a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Callback callback) {
        super(0);
        this.f123801a = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Callback callback = this.f123801a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        return Unit.f143329a;
    }
}
