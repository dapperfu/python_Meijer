package le;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import ce.d;
import ce.l;
import com.google.android.material.internal.s;

/* renamed from: le.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15486c {
    public static Rect a(Context context, int i10, int i11) {
        TypedArray typedArrayI = s.i(context, null, l.f62286n3, i10, i11, new int[0]);
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f62322q3, context.getResources().getDimensionPixelSize(d.f61601V));
        int dimensionPixelSize2 = typedArrayI.getDimensionPixelSize(l.f62334r3, context.getResources().getDimensionPixelSize(d.f61602W));
        int dimensionPixelSize3 = typedArrayI.getDimensionPixelSize(l.f62310p3, context.getResources().getDimensionPixelSize(d.f61600U));
        int dimensionPixelSize4 = typedArrayI.getDimensionPixelSize(l.f62298o3, context.getResources().getDimensionPixelSize(d.f61599T));
        typedArrayI.recycle();
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            dimensionPixelSize3 = dimensionPixelSize;
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4);
    }

    public static InsetDrawable b(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
