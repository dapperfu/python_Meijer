package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import i.C14584j;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5630f {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f46977a;

    /* renamed from: b, reason: collision with root package name */
    private final J2.a f46978b;

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f46977a.getContext().obtainStyledAttributes(attributeSet, C14584j.f136830g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(C14584j.f136900u0) ? typedArrayObtainStyledAttributes.getBoolean(C14584j.f136900u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f46978b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f46978b.c(z10);
    }

    C5630f(EditText editText) {
        this.f46977a = editText;
        this.f46978b = new J2.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        if (b(keyListener)) {
            return this.f46978b.a(keyListener);
        }
        return keyListener;
    }
}
