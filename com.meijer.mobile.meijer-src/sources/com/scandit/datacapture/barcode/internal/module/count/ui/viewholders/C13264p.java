package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.scandit.datacapture.barcode.internal.module.count.ui.viewholders.p, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13264p extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C13266q f123004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f123005b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f123006c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13264p(C13266q c13266q, boolean z10, Function0 function0) {
        super(1);
        this.f123004a = c13266q;
        this.f123005b = z10;
        this.f123006c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.count.ui.h hVar = this.f123004a.f123013e;
        if (hVar != null) {
            hVar.setEnabled(this.f123005b);
        }
        this.f123006c.invoke();
        return Unit.f143329a;
    }
}
