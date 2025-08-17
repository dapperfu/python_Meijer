package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureViewDeserializer.Helper f126154a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureView f126155b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsonValue f126156c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DataCaptureViewDeserializer.Helper helper, DataCaptureView dataCaptureView, JsonValue jsonValue) {
        super(1);
        this.f126154a = helper;
        this.f126155b = dataCaptureView;
        this.f126156c = jsonValue;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataCaptureView it = (DataCaptureView) obj;
        Intrinsics.j(it, "it");
        this.f126154a.a(this.f126155b, this.f126156c);
        return Unit.f142422a;
    }
}
