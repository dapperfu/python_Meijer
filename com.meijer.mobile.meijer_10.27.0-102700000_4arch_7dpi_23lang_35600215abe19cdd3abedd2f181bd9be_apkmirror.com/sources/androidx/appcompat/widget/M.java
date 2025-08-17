package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b2.C6187h;
import com.fullstory.FS;
import j.C14791a;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    private final Context f46702a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f46703b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f46704c;

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(TypedArray typedArray, int i10) {
        return typedArray instanceof Context ? FS.Resources_getDrawable((Context) typedArray, i10) : typedArray instanceof Resources ? FS.Resources_getDrawable((Resources) typedArray, i10) : typedArray.getDrawable(i10);
    }

    public static M t(Context context, int i10, int[] iArr) {
        return new M(context, context.obtainStyledAttributes(i10, iArr));
    }

    public static M u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new M(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static M v(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new M(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public boolean a(int i10, boolean z10) {
        return this.f46703b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f46703b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f46703b.hasValue(i10) || (resourceId = this.f46703b.getResourceId(i10, 0)) == 0 || (colorStateListA = C14791a.a(this.f46702a, resourceId)) == null) ? this.f46703b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f46703b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f46703b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f46703b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f46703b.hasValue(i10) || (resourceId = this.f46703b.getResourceId(i10, 0)) == 0) ? __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(this.f46703b, i10) : C14791a.b(this.f46702a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f46703b.hasValue(i10) || (resourceId = this.f46703b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C5629e.b().d(this.f46702a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f46703b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, C6187h.e eVar) {
        int resourceId = this.f46703b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f46704c == null) {
            this.f46704c = new TypedValue();
        }
        return C6187h.i(this.f46702a, resourceId, this.f46704c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f46703b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f46703b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f46703b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f46703b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f46703b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f46703b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f46703b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f46703b;
    }

    public boolean s(int i10) {
        return this.f46703b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f46703b.peekValue(i10);
    }

    public void x() {
        this.f46703b.recycle();
    }

    private M(Context context, TypedArray typedArray) {
        this.f46702a = context;
        this.f46703b = typedArray;
    }
}
