package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.o, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13262o extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13266q f123000a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f123001b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f123002c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13262o(C13266q c13266q, String str, Function0 function0) {
        super(1);
        this.f123000a = c13266q;
        this.f123001b = str;
        this.f123002c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar = this.f123000a.f123013e;
        if (hVar != null) {
            hVar.f122552a.setText(this.f123001b);
        }
        this.f123002c.invoke();
        return Unit.f143329a;
    }
}
