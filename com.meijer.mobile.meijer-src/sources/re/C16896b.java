package re;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import c2.c;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;

/* renamed from: re.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16896b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f159474a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f159475b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f159476c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f159477d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f159478e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f159479f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f159480g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f159481h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f159482i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f159483j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f159484k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    static final String f159485l = C16896b.class.getSimpleName();

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f159484k, 0)) != 0) {
            FS.log_w(f159485l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z10 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z11 = true;
            }
        }
        return z10 && z11;
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f159474a) {
            int[] iArr = f159477d;
            return new ColorStateList(new int[][]{f159483j, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f159479f), c(colorStateList, iArr), c(colorStateList, f159475b)});
        }
        int[] iArr2 = f159479f;
        int[] iArr3 = f159480g;
        int[] iArr4 = f159481h;
        int[] iArr5 = f159482i;
        int[] iArr6 = f159475b;
        int[] iArr7 = f159476c;
        int[] iArr8 = f159477d;
        int[] iArr9 = f159478e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f159483j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), c(colorStateList, iArr5), 0, c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), c(colorStateList, iArr9), 0});
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f159474a ? b(colorForState) : colorForState;
    }

    private C16896b() {
    }

    @TargetApi(21)
    private static int b(int i10) {
        return c.k(i10, Math.min(Color.alpha(i10) * 2, l3.f93323c));
    }
}
