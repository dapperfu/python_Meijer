package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class W extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X f121935a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f121936b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f121937c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f121938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(X x10, boolean z10, String str, Function0 function0) {
        super(1);
        this.f121935a = x10;
        this.f121936b = z10;
        this.f121937c = str;
        this.f121938d = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        X x10 = this.f121935a;
        boolean z10 = this.f121936b;
        String str = this.f121937c;
        com.scandit.datacapture.barcode.internal.module.count.ui.l lVar = x10.f121941b;
        if (lVar != null) {
            lVar.setVisibility(z10 ? 0 : 4);
            lVar.f121699b.setText(str);
        }
        this.f121938d.invoke();
        return Unit.f142422a;
    }
}
