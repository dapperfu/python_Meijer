package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.BarcodeCountViewDefaults;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.w, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13277w extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13279x f123041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f123042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f123043c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13277w(C13279x c13279x, String str, Function0 function0) {
        super(1);
        this.f123041a = c13279x;
        this.f123042b = str;
        this.f123043c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.ui.exitbutton.c cVar = this.f123041a.f123052d;
        if (cVar != null) {
            String str = this.f123042b;
            if (str == null) {
                cVar.f124270b.setText(BarcodeCountViewDefaults.INSTANCE.getExitButtonText());
            } else {
                cVar.f124270b.setText(str);
            }
        }
        this.f123043c.invoke();
        return Unit.f143329a;
    }
}
