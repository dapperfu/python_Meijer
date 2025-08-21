package com.scandit.datacapture.barcode.internal.module.batch.ui.overlay;

import android.view.View;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.sdk.utils.ObjectOverlayUtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f122220a;

    public c(b bVar) {
        this.f122220a = bVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Intrinsics.j(view, "view");
        if (Intrinsics.e(ObjectOverlayUtilsKt.getSize(view), Size2UtilsKt.getSIZE_2_ZERO())) {
            return;
        }
        this.f122220a.invoke(view);
        view.removeOnLayoutChangeListener(this);
    }
}
