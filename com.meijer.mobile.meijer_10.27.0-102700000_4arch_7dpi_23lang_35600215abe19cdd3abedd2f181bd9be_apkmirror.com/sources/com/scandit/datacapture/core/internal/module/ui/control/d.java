package com.scandit.datacapture.core.internal.module.ui.control;

import android.graphics.Bitmap;
import com.scandit.datacapture.core.internal.module.utils.j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes11.dex */
public final class d extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f125191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ToggleImageButton f125192b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Bitmap bitmap, ToggleImageButton toggleImageButton) {
        super(1);
        this.f125191a = bitmap;
        this.f125192b = toggleImageButton;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ToggleImageButton it = (ToggleImageButton) obj;
        Intrinsics.j(it, "it");
        if (this.f125191a != null) {
            this.f125192b.setImageDrawable(new j(this.f125191a, ((Number) ToggleImageButton.f125171e.getValue()).floatValue()));
        } else {
            this.f125192b.setImageDrawable(null);
        }
        return Unit.f142422a;
    }
}
