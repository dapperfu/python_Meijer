package qe;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import h2.C14442a;

/* renamed from: qe.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16639h {
    public static Typeface b(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, C14442a.b(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }
}
