package com.scandit.datacapture.barcode.internal.module.batch.ui.overlay;

import android.view.View;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.Augmentation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f121266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Augmentation f121267b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, Augmentation augmentation) {
        super(1);
        this.f121266a = eVar;
        this.f121267b = augmentation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        Intrinsics.j(view, "view");
        this.f121266a.a(this.f121267b);
        view.setVisibility(0);
        return Unit.f142422a;
    }
}
