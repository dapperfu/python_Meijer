package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class j implements BarcodePickIcon {

    /* renamed from: a, reason: collision with root package name */
    public final Bitmap f123729a;

    /* renamed from: b, reason: collision with root package name */
    public BitmapDrawable f123730b;

    public j(Bitmap bitmap) {
        Intrinsics.j(bitmap, "bitmap");
        this.f123729a = bitmap;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final Drawable a(Context context) {
        Intrinsics.j(context, "context");
        BitmapDrawable bitmapDrawable = this.f123730b;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(context.getResources(), this.f123729a);
        this.f123730b = bitmapDrawable2;
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
        return Intrinsics.e(this.f123729a, ((j) obj).f123729a);
    }

    public final int hashCode() {
        return this.f123729a.hashCode();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final String toJson() {
        return BitmapExtensionsKt.toBase64(this.f123729a);
    }
}
