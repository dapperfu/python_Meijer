package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.d0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13241d0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13243e0 f122930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f122931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13241d0(C13243e0 c13243e0, String str, Function0 function0) {
        super(1);
        this.f122930a = c13243e0;
        this.f122931b = str;
        this.f122932c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a aVar = this.f122930a.f122938d;
        if (aVar != null) {
            String str = this.f122931b;
            if (str == null) {
                aVar.f122458a.setText(BarcodeCountViewDefaults.INSTANCE.getNextButtonText());
            } else {
                aVar.f122458a.setText(str);
            }
        }
        this.f122932c.invoke();
        return Unit.f143329a;
    }
}
