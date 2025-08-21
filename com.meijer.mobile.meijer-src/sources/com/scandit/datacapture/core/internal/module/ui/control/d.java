package com.scandit.datacapture.core.internal.module.ui.control;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.module.utils.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f126143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToggleImageButton f126144b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Bitmap bitmap, ToggleImageButton toggleImageButton) {
        super(1);
        this.f126143a = bitmap;
        this.f126144b = toggleImageButton;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ToggleImageButton it = (ToggleImageButton) obj;
        Intrinsics.j(it, "it");
        if (this.f126143a != null) {
            this.f126144b.setImageDrawable(new j(this.f126143a, ((Number) ToggleImageButton.f126123e.getValue()).floatValue()));
        } else {
            this.f126144b.setImageDrawable(null);
        }
        return Unit.f143329a;
    }
}
