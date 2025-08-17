package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.d0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13108d0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13110e0 f121978a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f121979b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f121980c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13108d0(C13110e0 c13110e0, String str, Function0 function0) {
        super(1);
        this.f121978a = c13110e0;
        this.f121979b = str;
        this.f121980c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.buttons.a aVar = this.f121978a.f121986d;
        if (aVar != null) {
            String str = this.f121979b;
            if (str == null) {
                aVar.f121506a.setText(BarcodeCountViewDefaults.INSTANCE.getNextButtonText());
            } else {
                aVar.f121506a.setText(str);
            }
        }
        this.f121980c.invoke();
        return Unit.f142422a;
    }
}
