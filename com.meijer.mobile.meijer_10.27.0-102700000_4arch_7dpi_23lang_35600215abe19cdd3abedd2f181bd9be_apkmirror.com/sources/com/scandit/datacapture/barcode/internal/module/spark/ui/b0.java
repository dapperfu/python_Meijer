package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.internal.module.spark.data.C13201n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f123055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f123056b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(SparkScanViewPresenter sparkScanViewPresenter, Function0 function0) {
        super(1);
        this.f123055a = sparkScanViewPresenter;
        this.f123056b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        this.f123055a.f123021e.a(this.f123055a.f123018b.u(), C13201n.f122909a);
        this.f123056b.invoke();
        return Unit.f142422a;
    }
}
