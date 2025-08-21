package com.scandit.datacapture.barcode.internal.module.batch.ui.overlay;

import android.view.View;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.Augmentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f122218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Augmentation f122219b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Augmentation augmentation) {
        super(1);
        this.f122218a = eVar;
        this.f122219b = augmentation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        Intrinsics.j(view, "view");
        this.f122218a.a(this.f122219b);
        view.setVisibility(0);
        return Unit.f143329a;
    }
}
