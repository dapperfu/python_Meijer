package com.scandit.datacapture.core.internal.sdk.utils;

import android.content.Context;
import android.util.TypedValue;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.extensions.ContextExtensionsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\b\u001a\u00020\u0005*\u00020\u00052\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0006¨\u0006\n"}, d2 = {"", "Landroid/content/Context;", "context", "pxFromDp", "(ILandroid/content/Context;)I", "", "(FLandroid/content/Context;)F", "pxFromSp", "dpFromPx", "(ILandroid/content/Context;)F", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class PixelExtensionsKt {
    public static final float dpFromPx(int i10, Context context) {
        Intrinsics.j(context, "context");
        return i10 / ContextExtensionsKt.getDisplayDensity(context);
    }

    public static /* synthetic */ float dpFromPx$default(int i10, Context context, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        }
        return dpFromPx(i10, context);
    }

    public static final int pxFromDp(int i10, Context context) {
        Intrinsics.j(context, "context");
        return (int) ((i10 * ContextExtensionsKt.getDisplayDensity(context)) + 0.5f);
    }

    public static /* synthetic */ int pxFromDp$default(int i10, Context context, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        }
        return pxFromDp(i10, context);
    }

    public static final float dpFromPx(float f10, Context context) {
        Intrinsics.j(context, "context");
        return f10 / ContextExtensionsKt.getDisplayDensity(context);
    }

    public static /* synthetic */ float dpFromPx$default(float f10, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        }
        return dpFromPx(f10, context);
    }

    public static final float pxFromDp(float f10, Context context) {
        Intrinsics.j(context, "context");
        return ContextExtensionsKt.getDisplayDensity(context) * f10;
    }

    public static /* synthetic */ float pxFromDp$default(float f10, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        }
        return pxFromDp(f10, context);
    }

    public static final float pxFromSp(float f10, Context context) {
        Intrinsics.j(context, "context");
        return TypedValue.applyDimension(2, f10, context.getResources().getDisplayMetrics());
    }

    public static /* synthetic */ float pxFromSp$default(float f10, Context context, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            context = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        }
        return pxFromSp(f10, context);
    }
}
