package com.scandit.datacapture.core.internal.module.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToggleImageButton f125177a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f125178b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ToggleImageButton toggleImageButton, boolean z10) {
        super(1);
        this.f125177a = toggleImageButton;
        this.f125178b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ToggleImageButton it = (ToggleImageButton) obj;
        Intrinsics.j(it, "it");
        this.f125177a.setVisibility(this.f125178b ? 0 : 8);
        return Unit.f142422a;
    }
}
