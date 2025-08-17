package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class j implements BarcodePickIcon {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f122777a;

    /* renamed from: b, reason: collision with root package name */
    public BitmapDrawable f122778b;

    public j(Bitmap bitmap) {
        Intrinsics.j(bitmap, "bitmap");
        this.f122777a = bitmap;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final Drawable a(Context context) {
        Intrinsics.j(context, "context");
        BitmapDrawable bitmapDrawable = this.f122778b;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), this.f122777a);
        this.f122778b = bitmapDrawable2;
        return bitmapDrawable2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.e(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BitmapIcon");
        return Intrinsics.e(this.f122777a, ((j) obj).f122777a);
    }

    public final int hashCode() {
        return this.f122777a.hashCode();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final String toJson() {
        return BitmapExtensionsKt.toBase64(this.f122777a);
    }
}
