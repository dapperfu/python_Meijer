package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class G extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f122842a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Callback callback) {
        super(0);
        this.f122842a = callback;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Callback callback = this.f122842a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
        return Unit.f142422a;
    }
}
