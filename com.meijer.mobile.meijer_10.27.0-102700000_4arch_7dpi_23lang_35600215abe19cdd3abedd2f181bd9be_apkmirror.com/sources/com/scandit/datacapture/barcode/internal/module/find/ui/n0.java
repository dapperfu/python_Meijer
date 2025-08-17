package com.scandit.datacapture.barcode.internal.module.find.ui;

import com.scandit.datacapture.core.internal.sdk.extensions.ViewExtensionsKt;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class n0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u0 f122250a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f122251b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f122252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(u0 u0Var, List list, float f10) {
        super(1);
        this.f122250a = u0Var;
        this.f122251b = list;
        this.f122252c = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.scandit.datacapture.barcode.internal.module.find.ui.camera.e it = (com.scandit.datacapture.barcode.internal.module.find.ui.camera.e) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.find.ui.camera.e eVar = this.f122250a.f122290j;
        List zoomLevels = this.f122251b;
        float f10 = this.f122252c;
        eVar.getClass();
        Intrinsics.j(zoomLevels, "zoomLevels");
        eVar.f122195a = CollectionsKt.Y0(CollectionsKt.i0(zoomLevels));
        if (eVar.f122196b != f10) {
            eVar.f122196b = f10;
            eVar.a();
        }
        u0 u0Var = this.f122250a;
        if (!u0Var.f122294n) {
            u0Var.f122294n = true;
            ViewExtensionsKt.runOnMainThread(u0Var.f122290j, new i0(u0Var));
        }
        return Unit.f142422a;
    }
}
