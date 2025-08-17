package ue;

import ae.C5597b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.view.d;

/* renamed from: ue.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17250a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f162903a = {R.attr.theme, C5597b.f44538q0};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f162904b = {C5597b.f44486H};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f162903a);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f162904b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i10, int i11) {
        boolean z10;
        int iB = b(context, attributeSet, i10, i11);
        if ((context instanceof d) && ((d) context).c() == iB) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (iB != 0 && !z10) {
            d dVar = new d(context, iB);
            int iA = a(context, attributeSet);
            if (iA != 0) {
                dVar.getTheme().applyStyle(iA, true);
            }
            return dVar;
        }
        return context;
    }
}
