package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import b2.C6327h;
import com.fullstory.FS;
import j.C14879a;

/* loaded from: classes.dex */
public class M {

    /* renamed from: a, reason: collision with root package name */
    private final Context f46926a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f46927b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f46928c;

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
        return this.f46927b.getBoolean(i10, z10);
    }

    public int b(int i10, int i11) {
        return this.f46927b.getColor(i10, i11);
    }

    public ColorStateList c(int i10) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f46927b.hasValue(i10) || (resourceId = this.f46927b.getResourceId(i10, 0)) == 0 || (colorStateListA = C14879a.a(this.f46926a, resourceId)) == null) ? this.f46927b.getColorStateList(i10) : colorStateListA;
    }

    public float d(int i10, float f10) {
        return this.f46927b.getDimension(i10, f10);
    }

    public int e(int i10, int i11) {
        return this.f46927b.getDimensionPixelOffset(i10, i11);
    }

    public int f(int i10, int i11) {
        return this.f46927b.getDimensionPixelSize(i10, i11);
    }

    public Drawable g(int i10) {
        int resourceId;
        return (!this.f46927b.hasValue(i10) || (resourceId = this.f46927b.getResourceId(i10, 0)) == 0) ? __fsTypeCheck_7aed730c0cb897b271b15a3fca45c160(this.f46927b, i10) : C14879a.b(this.f46926a, resourceId);
    }

    public Drawable h(int i10) {
        int resourceId;
        if (!this.f46927b.hasValue(i10) || (resourceId = this.f46927b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return C5771e.b().d(this.f46926a, resourceId, true);
    }

    public float i(int i10, float f10) {
        return this.f46927b.getFloat(i10, f10);
    }

    public Typeface j(int i10, int i11, C6327h.e eVar) {
        int resourceId = this.f46927b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f46928c == null) {
            this.f46928c = new TypedValue();
        }
        return C6327h.i(this.f46926a, resourceId, this.f46928c, i11, eVar);
    }

    public int k(int i10, int i11) {
        return this.f46927b.getInt(i10, i11);
    }

    public int l(int i10, int i11) {
        return this.f46927b.getInteger(i10, i11);
    }

    public int m(int i10, int i11) {
        return this.f46927b.getLayoutDimension(i10, i11);
    }

    public int n(int i10, int i11) {
        return this.f46927b.getResourceId(i10, i11);
    }

    public String o(int i10) {
        return this.f46927b.getString(i10);
    }

    public CharSequence p(int i10) {
        return this.f46927b.getText(i10);
    }

    public CharSequence[] q(int i10) {
        return this.f46927b.getTextArray(i10);
    }

    public TypedArray r() {
        return this.f46927b;
    }

    public boolean s(int i10) {
        return this.f46927b.hasValue(i10);
    }

    public TypedValue w(int i10) {
        return this.f46927b.peekValue(i10);
    }

    public void x() {
        this.f46927b.recycle();
    }

    private M(Context context, TypedArray typedArray) {
        this.f46926a = context;
        this.f46927b = typedArray;
    }
}
