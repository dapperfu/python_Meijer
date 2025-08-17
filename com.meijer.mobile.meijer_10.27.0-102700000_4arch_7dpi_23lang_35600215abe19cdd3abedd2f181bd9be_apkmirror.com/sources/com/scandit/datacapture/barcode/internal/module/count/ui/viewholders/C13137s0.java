package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.s0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13137s0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13139t0 f122069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f122070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122071c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13137s0(C13139t0 c13139t0, String str, Function0 function0) {
        super(1);
        this.f122069a = c13139t0;
        this.f122070b = str;
        this.f122071c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.c cVar = this.f122069a.f122077e;
        if (cVar != null) {
            String str = this.f122070b;
            if (str == null) {
                cVar.f121509b.setText(BarcodeCountViewDefaults.INSTANCE.getRestartButtonText());
            } else {
                cVar.f121509b.setText(str);
            }
        }
        this.f122071c.invoke();
        return Unit.f142422a;
    }
}
