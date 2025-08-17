package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13144w extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13146x f122089a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f122090b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122091c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13144w(C13146x c13146x, String str, Function0 function0) {
        super(1);
        this.f122089a = c13146x;
        this.f122090b = str;
        this.f122091c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = this.f122089a.f122100d;
        if (cVar != null) {
            String str = this.f122090b;
            if (str == null) {
                cVar.f123318b.setText(BarcodeCountViewDefaults.INSTANCE.getExitButtonText());
            } else {
                cVar.f123318b.setText(str);
            }
        }
        this.f122091c.invoke();
        return Unit.f142422a;
    }
}
