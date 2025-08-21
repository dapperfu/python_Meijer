package com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.fullstory.FS;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.BitmapExtensionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class o implements BarcodePickIcon {

    /* renamed from: a, reason: collision with root package name */
    public final int f123735a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f123736b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.e(o.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.ResourceIcon");
        return this.f123735a == ((o) obj).f123735a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final Drawable a(Context context) {
        Intrinsics.j(context, "context");
        Drawable drawable = this.f123736b;
        if (drawable != null) {
            return drawable;
        }
        Drawable drawableResources_getDrawable = FS.Resources_getDrawable(context, this.f123735a);
        this.f123736b = drawableResources_getDrawable;
        return drawableResources_getDrawable;
    }

    public final int hashCode() {
        return this.f123735a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.ui.highlightstyle.BarcodePickIcon
    public final String toJson() {
        Bitmap bitmapA = h.a(this, AppAndroidEnvironment.INSTANCE.getApplicationContext());
        if (bitmapA != null) {
            return BitmapExtensionsKt.toBase64(bitmapA);
        }
        return null;
    }

    public o(int i10) {
        this.f123735a = i10;
    }
}
