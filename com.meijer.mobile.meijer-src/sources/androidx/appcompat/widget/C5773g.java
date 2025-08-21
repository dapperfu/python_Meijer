package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import i.C14587j;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5773g {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f47203a;

    /* renamed from: b, reason: collision with root package name */
    private final J2.f f47204b;

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f47204b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f47204b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f47203a.getContext().obtainStyledAttributes(attributeSet, C14587j.f136587g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(C14587j.f136657u0) ? typedArrayObtainStyledAttributes.getBoolean(C14587j.f136657u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void d(boolean z10) {
        this.f47204b.c(z10);
    }

    void e(boolean z10) {
        this.f47204b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f47204b.e(transformationMethod);
    }

    C5773g(TextView textView) {
        this.f47203a = textView;
        this.f47204b = new J2.f(textView, false);
    }
}
