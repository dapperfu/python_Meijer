package com.scandit.datacapture.barcode.internal.module.spark.ui;

import com.scandit.datacapture.barcode.internal.module.spark.data.C13334n;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SparkScanViewPresenter f124007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f124008b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(SparkScanViewPresenter sparkScanViewPresenter, Function0 function0) {
        super(1);
        this.f124007a = sparkScanViewPresenter;
        this.f124008b = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Boolean) obj).getClass();
        this.f124007a.f123973e.a(this.f124007a.f123970b.u(), C13334n.f123861a);
        this.f124008b.invoke();
        return Unit.f143329a;
    }
}
