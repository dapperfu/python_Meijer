package com.scandit.datacapture.core.ui;

import android.widget.Toast;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList f126972a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DataCaptureView f126973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ArrayList arrayList, DataCaptureView dataCaptureView) {
        super(1);
        this.f126972a = arrayList;
        this.f126973b = dataCaptureView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DataCaptureView it = (DataCaptureView) obj;
        Intrinsics.j(it, "it");
        Toast.makeText(this.f126973b.getContext(), CollectionsKt.B0(this.f126972a, "\n", null, null, 0, null, a.f126926a, 30, null), 1).show();
        return Unit.f143329a;
    }
}
