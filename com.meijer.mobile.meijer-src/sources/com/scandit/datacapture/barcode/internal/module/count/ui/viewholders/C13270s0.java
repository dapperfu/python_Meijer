package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.s0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13270s0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13272t0 f123021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f123022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f123023c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13270s0(C13272t0 c13272t0, String str, Function0 function0) {
        super(1);
        this.f123021a = c13272t0;
        this.f123022b = str;
        this.f123023c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c cVar = this.f123021a.f123029e;
        if (cVar != null) {
            String str = this.f123022b;
            if (str == null) {
                cVar.f122461b.setText(BarcodeCountViewDefaults.INSTANCE.getRestartButtonText());
            } else {
                cVar.f122461b.setText(str);
            }
        }
        this.f123023c.invoke();
        return Unit.f143329a;
    }
}
