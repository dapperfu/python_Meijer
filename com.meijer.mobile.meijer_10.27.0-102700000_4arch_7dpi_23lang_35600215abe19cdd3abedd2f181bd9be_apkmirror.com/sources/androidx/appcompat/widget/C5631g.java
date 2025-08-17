package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import i.C14584j;

/* renamed from: androidx.appcompat.widget.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5631g {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f46979a;

    /* renamed from: b, reason: collision with root package name */
    private final J2.f f46980b;

    InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f46980b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f46980b.b();
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f46979a.getContext().obtainStyledAttributes(attributeSet, C14584j.f136830g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(C14584j.f136900u0) ? typedArrayObtainStyledAttributes.getBoolean(C14584j.f136900u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void d(boolean z10) {
        this.f46980b.c(z10);
    }

    void e(boolean z10) {
        this.f46980b.d(z10);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f46980b.e(transformationMethod);
    }

    C5631g(TextView textView) {
        this.f46979a = textView;
        this.f46980b = new J2.f(textView, false);
    }
}
