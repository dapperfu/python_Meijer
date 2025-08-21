package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataCaptureViewDeserializer.Helper f127106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureView f127107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ JsonValue f127108c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DataCaptureViewDeserializer.Helper helper, DataCaptureView dataCaptureView, JsonValue jsonValue) {
        super(1);
        this.f127106a = helper;
        this.f127107b = dataCaptureView;
        this.f127108c = jsonValue;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataCaptureView it = (DataCaptureView) obj;
        Intrinsics.j(it, "it");
        this.f127106a.a(this.f127107b, this.f127108c);
        return Unit.f143329a;
    }
}
