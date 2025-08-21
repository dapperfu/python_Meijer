package com.scandit.datacapture.core.ui.icon;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import com.fullstory.FS;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class a extends LayerDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final float f127079a;

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(LayerDrawable layerDrawable, int i10) {
        return layerDrawable instanceof Context ? FS.Resources_getDrawable((Context) layerDrawable, i10) : layerDrawable instanceof Resources ? FS.Resources_getDrawable((Resources) layerDrawable, i10) : layerDrawable.getDrawable(i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Drawable[] drawables) {
        super(drawables);
        Intrinsics.j(drawables, "drawables");
        this.f127079a = 0.5f;
        setLayerGravity(1, 17);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i10, int i11, int i12, int i13) {
        int iMin = Math.min(i12 - i10, i13 - i11);
        setLayerSize(0, iMin, iMin);
        Drawable drawable__fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b = __fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b(this, 1);
        if (drawable__fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b == null) {
            super.setBounds(i10, i11, i12, i13);
            return;
        }
        float intrinsicHeight = drawable__fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b.getIntrinsicHeight();
        float intrinsicWidth = drawable__fsTypeCheck_121a4b15f004b7ccb763d7a9ab4ba56b.getIntrinsicWidth();
        boolean z10 = intrinsicHeight >= intrinsicWidth;
        float f10 = iMin * this.f127079a;
        float f11 = f10 / (z10 ? intrinsicHeight / intrinsicWidth : intrinsicWidth / intrinsicHeight);
        int i14 = (int) (z10 ? f11 : f10);
        if (!z10) {
            f10 = f11;
        }
        setLayerSize(1, i14, (int) f10);
        super.setBounds(i10, i11, i12, i13);
    }
}
