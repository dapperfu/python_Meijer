package com.scandit.datacapture.core.internal.module.ui.control;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToggleImageButton f126129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f126130b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ToggleImageButton toggleImageButton, boolean z10) {
        super(1);
        this.f126129a = toggleImageButton;
        this.f126130b = z10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ToggleImageButton it = (ToggleImageButton) obj;
        Intrinsics.j(it, "it");
        this.f126129a.setVisibility(this.f126130b ? 0 : 8);
        return Unit.f143329a;
    }
}
