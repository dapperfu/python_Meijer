package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes4.dex */
final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f59061b;

    /* renamed from: a, reason: collision with root package name */
    private LinearLayoutManager f59062a;

    /* renamed from: androidx.viewpager2.widget.a$a, reason: collision with other inner class name */
    class C1158a implements Comparator<int[]> {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(int[] iArr, int[] iArr2) {
            return iArr[0] - iArr2[0];
        }

        C1158a() {
        }
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f59061b = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    private boolean a() {
        int top;
        int i10;
        int bottom;
        int i11;
        int iB0 = this.f59062a.b0();
        if (iB0 == 0) {
            return true;
        }
        boolean z10 = this.f59062a.F2() == 0;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, iB0, 2);
        for (int i12 = 0; i12 < iB0; i12++) {
            View viewA0 = this.f59062a.a0(i12);
            if (viewA0 == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            ViewGroup.LayoutParams layoutParams = viewA0.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : f59061b;
            int[] iArr2 = iArr[i12];
            if (z10) {
                top = viewA0.getLeft();
                i10 = marginLayoutParams.leftMargin;
            } else {
                top = viewA0.getTop();
                i10 = marginLayoutParams.topMargin;
            }
            iArr2[0] = top - i10;
            int[] iArr3 = iArr[i12];
            if (z10) {
                bottom = viewA0.getRight();
                i11 = marginLayoutParams.rightMargin;
            } else {
                bottom = viewA0.getBottom();
                i11 = marginLayoutParams.bottomMargin;
            }
            iArr3[1] = bottom + i11;
        }
        Arrays.sort(iArr, new C1158a());
        for (int i13 = 1; i13 < iB0; i13++) {
            if (iArr[i13 - 1][1] != iArr[i13][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i14 = iArr4[1];
        int i15 = iArr4[0];
        return i15 <= 0 && iArr[iB0 - 1][1] >= i14 - i15;
    }

    private boolean b() {
        int iB0 = this.f59062a.b0();
        for (int i10 = 0; i10 < iB0; i10++) {
            if (c(this.f59062a.a0(i10))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (c(viewGroup.getChildAt(i10))) {
                    return true;
                }
            }
        }
        return false;
    }

    a(LinearLayoutManager linearLayoutManager) {
        this.f59062a = linearLayoutManager;
    }

    boolean d() {
        if ((!a() || this.f59062a.b0() <= 1) && b()) {
            return true;
        }
        return false;
    }
}
