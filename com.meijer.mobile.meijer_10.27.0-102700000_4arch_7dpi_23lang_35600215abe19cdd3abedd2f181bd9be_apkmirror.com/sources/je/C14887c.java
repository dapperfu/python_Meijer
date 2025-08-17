package je;

import ae.d;
import ae.l;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.material.internal.s;

/* renamed from: je.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14887c {
    public static Rect a(Context context, int i10, int i11) {
        TypedArray typedArrayI = s.i(context, null, l.f45271n3, i10, i11, new int[0]);
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(l.f45307q3, context.getResources().getDimensionPixelSize(d.f44586V));
        int dimensionPixelSize2 = typedArrayI.getDimensionPixelSize(l.f45319r3, context.getResources().getDimensionPixelSize(d.f44587W));
        int dimensionPixelSize3 = typedArrayI.getDimensionPixelSize(l.f45295p3, context.getResources().getDimensionPixelSize(d.f44585U));
        int dimensionPixelSize4 = typedArrayI.getDimensionPixelSize(l.f45283o3, context.getResources().getDimensionPixelSize(d.f44584T));
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
