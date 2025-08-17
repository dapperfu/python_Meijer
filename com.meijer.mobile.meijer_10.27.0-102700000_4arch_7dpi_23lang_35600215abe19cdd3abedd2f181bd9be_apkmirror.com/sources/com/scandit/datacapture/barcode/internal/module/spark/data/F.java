package com.scandit.datacapture.barcode.internal.module.spark.data;

import com.scandit.datacapture.core.common.async.Callback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class F extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callback f122841a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(Callback callback) {
        super(1);
        this.f122841a = callback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Callback callback = this.f122841a;
        if (callback != null) {
            callback.run(bool);
        }
        return Unit.f142422a;
    }
}
