package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.k0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13255k0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13257l0 f122976a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f122977b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13255k0(C13257l0 c13257l0, String str, Function0 function0) {
        super(1);
        this.f122976a = c13257l0;
        this.f122977b = str;
        this.f122978c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.b bVar = this.f122976a.f122984d;
        if (bVar != null) {
            String str = this.f122977b;
            if (str == null) {
                bVar.f122459a.setText(BarcodeCountViewDefaults.INSTANCE.getRedoScanButtonText());
            } else {
                bVar.f122459a.setText(str);
            }
        }
        this.f122978c.invoke();
        return Unit.f143329a;
    }
}
