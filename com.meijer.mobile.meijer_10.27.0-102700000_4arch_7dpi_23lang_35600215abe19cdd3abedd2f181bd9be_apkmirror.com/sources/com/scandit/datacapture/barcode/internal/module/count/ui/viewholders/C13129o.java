package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.o, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13129o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13133q f122048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f122049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f122050c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13129o(C13133q c13133q, String str, Function0 function0) {
        super(1);
        this.f122048a = c13133q;
        this.f122049b = str;
        this.f122050c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar = this.f122048a.f122061e;
        if (hVar != null) {
            hVar.f121600a.setText(this.f122049b);
        }
        this.f122050c.invoke();
        return Unit.f142422a;
    }
}
