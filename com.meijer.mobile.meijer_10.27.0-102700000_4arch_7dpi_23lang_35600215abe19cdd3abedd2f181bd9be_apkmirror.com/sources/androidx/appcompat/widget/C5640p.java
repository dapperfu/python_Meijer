package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.fullstory.FS;
import com.google.android.gms.common.api.a;
import i.C14584j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.appcompat.widget.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5640p {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f47020l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f47021m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f47022a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f47023b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f47024c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f47025d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f47026e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f47027f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f47028g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f47029h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f47030i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f47031j;

    /* renamed from: k, reason: collision with root package name */
    private final d f47032k;

    /* renamed from: androidx.appcompat.widget.p$a */
    private static final class a {
        static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i10);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i11 == -1) {
                i11 = a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i11);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                FS.log_w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* renamed from: androidx.appcompat.widget.p$b */
    private static class b extends d {
        @Override // androidx.appcompat.widget.C5640p.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C5640p.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }

        b() {
        }
    }

    /* renamed from: androidx.appcompat.widget.p$d */
    private static class d {
        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) C5640p.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }

        d() {
        }
    }

    private int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i10 : iArr) {
                if (i10 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i10)) < 0) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i11 = 0; i11 < size; i11++) {
                    iArr2[i11] = ((Integer) arrayList.get(i11)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private void c() {
        this.f47022a = 0;
        this.f47025d = -1.0f;
        this.f47026e = -1.0f;
        this.f47024c = -1.0f;
        this.f47027f = new int[0];
        this.f47023b = false;
    }

    private static Method k(String str) throws SecurityException {
        try {
            Method declaredMethod = f47021m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f47021m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            FS.log_w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    private void z(float f10, float f11, float f12) throws IllegalArgumentException {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f10 + "px) is less or equal to (0px)");
        }
        if (f11 <= f10) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f10 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f12 + "px) is less or equal to (0px)");
        }
        this.f47022a = 1;
        this.f47025d = f10;
        this.f47026e = f11;
        this.f47024c = f12;
        this.f47028g = false;
    }

    /* renamed from: androidx.appcompat.widget.p$c */
    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.C5640p.b, androidx.appcompat.widget.C5640p.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // androidx.appcompat.widget.C5640p.d
        boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    private int e(RectF rectF) {
        int length = this.f47027f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i10 = 1;
        int i11 = length - 1;
        int i12 = 0;
        while (i10 <= i11) {
            int i13 = (i10 + i11) / 2;
            if (x(this.f47027f[i13], rectF)) {
                int i14 = i13 + 1;
                i12 = i10;
                i10 = i14;
            } else {
                i12 = i13 - 1;
                i11 = i12;
            }
        }
        return this.f47027f[i12];
    }

    @SuppressLint({"BanUncheckedReflection"})
    private void s(float f10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f10 != this.f47030i.getPaint().getTextSize()) {
            this.f47030i.getPaint().setTextSize(f10);
            boolean zIsInLayout = this.f47030i.isInLayout();
            if (this.f47030i.getLayout() != null) {
                this.f47023b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f47030i, null);
                    }
                } catch (Exception e10) {
                    FS.log_w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (zIsInLayout) {
                    this.f47030i.forceLayout();
                } else {
                    this.f47030i.requestLayout();
                }
                this.f47030i.invalidate();
            }
        }
    }

    private boolean w() {
        boolean z10 = this.f47027f.length > 0;
        this.f47028g = z10;
        if (z10) {
            this.f47022a = 1;
            this.f47025d = r0[0];
            this.f47026e = r0[r1 - 1];
            this.f47024c = -1.0f;
        }
        return z10;
    }

    private boolean x(int i10, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f47030i.getText();
        TransformationMethod transformationMethod = this.f47030i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f47030i)) != null) {
            text = transformation;
        }
        int maxLines = this.f47030i.getMaxLines();
        l(i10);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f47030i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    private boolean y() {
        return !(this.f47030i instanceof AppCompatEditText);
    }

    StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i10, int i11) {
        return a.a(charSequence, alignment, i10, i11, this.f47030i, this.f47029h, this.f47032k);
    }

    int f() {
        return Math.round(this.f47026e);
    }

    int g() {
        return Math.round(this.f47025d);
    }

    int h() {
        return Math.round(this.f47024c);
    }

    int[] i() {
        return this.f47027f;
    }

    int j() {
        return this.f47022a;
    }

    void l(int i10) {
        TextPaint textPaint = this.f47029h;
        if (textPaint == null) {
            this.f47029h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f47029h.set(this.f47030i.getPaint());
        this.f47029h.setTextSize(i10);
    }

    void o(AttributeSet attributeSet, int i10) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f47031j.obtainStyledAttributes(attributeSet, C14584j.f136830g0, i10, 0);
        TextView textView = this.f47030i;
        ViewCompat.k0(textView, textView.getContext(), C14584j.f136830g0, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        if (typedArrayObtainStyledAttributes.hasValue(C14584j.f136855l0)) {
            this.f47022a = typedArrayObtainStyledAttributes.getInt(C14584j.f136855l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(C14584j.f136850k0) ? typedArrayObtainStyledAttributes.getDimension(C14584j.f136850k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(C14584j.f136840i0) ? typedArrayObtainStyledAttributes.getDimension(C14584j.f136840i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(C14584j.f136835h0) ? typedArrayObtainStyledAttributes.getDimension(C14584j.f136835h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(C14584j.f136845j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(C14584j.f136845j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f47022a = 0;
            return;
        }
        if (this.f47022a == 1) {
            if (!this.f47028g) {
                DisplayMetrics displayMetrics = this.f47031j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    void t(int i10, float f10) {
        Context context = this.f47031j;
        s(TypedValue.applyDimension(i10, f10, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    C5640p(TextView textView) {
        this.f47030i = textView;
        this.f47031j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f47032k = new c();
        } else {
            this.f47032k = new b();
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    static <T> T m(Object obj, String str, T t10) {
        try {
            return (T) k(str).invoke(obj, null);
        } catch (Exception e10) {
            FS.log_w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e10);
            return t10;
        }
    }

    private boolean u() {
        if (y() && this.f47022a == 1) {
            if (!this.f47028g || this.f47027f.length == 0) {
                int iFloor = ((int) Math.floor((this.f47026e - this.f47025d) / this.f47024c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i10 = 0; i10 < iFloor; i10++) {
                    iArr[i10] = Math.round(this.f47025d + (i10 * this.f47024c));
                }
                this.f47027f = b(iArr);
            }
            this.f47023b = true;
        } else {
            this.f47023b = false;
        }
        return this.f47023b;
    }

    private void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i10 = 0; i10 < length; i10++) {
                iArr[i10] = typedArray.getDimensionPixelSize(i10, -1);
            }
            this.f47027f = b(iArr);
            w();
        }
    }

    void a() {
        int measuredWidth;
        if (n()) {
            if (this.f47023b) {
                if (this.f47030i.getMeasuredHeight() > 0 && this.f47030i.getMeasuredWidth() > 0) {
                    if (this.f47032k.b(this.f47030i)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (this.f47030i.getMeasuredWidth() - this.f47030i.getTotalPaddingLeft()) - this.f47030i.getTotalPaddingRight();
                    }
                    int height = (this.f47030i.getHeight() - this.f47030i.getCompoundPaddingBottom()) - this.f47030i.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = f47020l;
                        synchronized (rectF) {
                            try {
                                rectF.setEmpty();
                                rectF.right = measuredWidth;
                                rectF.bottom = height;
                                float fE = e(rectF);
                                if (fE != this.f47030i.getTextSize()) {
                                    t(0, fE);
                                }
                            } finally {
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.f47023b = true;
        }
    }

    boolean n() {
        if (y() && this.f47022a != 0) {
            return true;
        }
        return false;
    }

    void p(int i10, int i11, int i12, int i13) throws IllegalArgumentException {
        if (y()) {
            DisplayMetrics displayMetrics = this.f47031j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    void q(int[] iArr, int i10) throws IllegalArgumentException {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i10 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f47031j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArrCopyOf[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                this.f47027f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f47028g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    void r(int i10) {
        if (y()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = this.f47031j.getResources().getDisplayMetrics();
                    z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (u()) {
                        a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Unknown auto-size text type: " + i10);
            }
            c();
        }
    }
}
