package com.scandit.datacapture.barcode.internal.module.count.ui.viewholders;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class J extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ K f122839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f122840b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f122841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(K k10, int i10, int i11) {
        super(1);
        this.f122839a = k10;
        this.f122840b = i10;
        this.f122841c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup it = (ViewGroup) obj;
        Intrinsics.j(it, "it");
        com.scandit.datacapture.barcode.internal.module.ui.d dVar = this.f122839a.f122859c;
        if (dVar != null) {
            dVar.f124258b = this.f122840b;
            dVar.b();
        }
        com.scandit.datacapture.barcode.internal.module.ui.d dVar2 = this.f122839a.f122859c;
        if (dVar2 != null) {
            dVar2.f124257a = this.f122841c;
            dVar2.b();
        }
        return Unit.f143329a;
    }
}
