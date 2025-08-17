package pe;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.StateSet;
import c2.c;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.l3;

/* renamed from: pe.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16292b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f155717a = true;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f155718b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f155719c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f155720d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f155721e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f155722f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f155723g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f155724h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f155725i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f155726j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f155727k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    static final String f155728l = C16292b.class.getSimpleName();

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f155727k, 0)) != 0) {
            FS.log_w(f155728l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
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
        if (f155717a) {
            int[] iArr = f155720d;
            return new ColorStateList(new int[][]{f155726j, iArr, StateSet.NOTHING}, new int[]{c(colorStateList, f155722f), c(colorStateList, iArr), c(colorStateList, f155718b)});
        }
        int[] iArr2 = f155722f;
        int[] iArr3 = f155723g;
        int[] iArr4 = f155724h;
        int[] iArr5 = f155725i;
        int[] iArr6 = f155718b;
        int[] iArr7 = f155719c;
        int[] iArr8 = f155720d;
        int[] iArr9 = f155721e;
        return new ColorStateList(new int[][]{iArr2, iArr3, iArr4, iArr5, f155726j, iArr6, iArr7, iArr8, iArr9, StateSet.NOTHING}, new int[]{c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), c(colorStateList, iArr5), 0, c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), c(colorStateList, iArr9), 0});
    }

    private static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f155717a ? b(colorForState) : colorForState;
    }

    private C16292b() {
    }

    @TargetApi(21)
    private static int b(int i10) {
        return c.k(i10, Math.min(Color.alpha(i10) * 2, l3.f92484c));
    }
}
