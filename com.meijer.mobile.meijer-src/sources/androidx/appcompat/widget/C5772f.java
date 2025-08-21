package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import i.C14587j;

/* renamed from: androidx.appcompat.widget.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C5772f {

    /* renamed from: a, reason: collision with root package name */
    private final EditText f47201a;

    /* renamed from: b, reason: collision with root package name */
    private final J2.a f47202b;

    boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    void c(AttributeSet attributeSet, int i10) {
        TypedArray typedArrayObtainStyledAttributes = this.f47201a.getContext().obtainStyledAttributes(attributeSet, C14587j.f136587g0, i10, 0);
        try {
            boolean z10 = typedArrayObtainStyledAttributes.hasValue(C14587j.f136657u0) ? typedArrayObtainStyledAttributes.getBoolean(C14587j.f136657u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z10);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f47202b.b(inputConnection, editorInfo);
    }

    void e(boolean z10) {
        this.f47202b.c(z10);
    }

    C5772f(EditText editText) {
        this.f47201a = editText;
        this.f47202b = new J2.a(editText, false);
    }

    KeyListener a(KeyListener keyListener) {
        if (b(keyListener)) {
            return this.f47202b.a(keyListener);
        }
        return keyListener;
    }
}
