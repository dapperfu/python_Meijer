package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.appcompat.widget.AppCompatEditText;
import ce.C6503b;
import we.C17867a;

/* loaded from: classes4.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: g, reason: collision with root package name */
    private final Rect f88583g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f88584h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61559u);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(C17867a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f88583g = new Rect();
        TypedArray typedArrayI = com.google.android.material.internal.s.i(context, attributeSet, ce.l.f62080V8, i10, ce.k.f61816q, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayI.getBoolean(ce.l.f62091W8, false));
        typedArrayI.recycle();
    }

    private boolean e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f88584h;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f88584h = z10;
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (e(textInputLayout) && rect != null) {
            textInputLayout.getFocusedRect(this.f88583g);
            rect.bottom = this.f88583g.bottom;
        }
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (e(textInputLayout)) {
            boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.R()) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.R() && super.getHint() == null && com.google.android.material.internal.h.b()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (inputConnectionOnCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return inputConnectionOnCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        getTextInputLayout();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (e(textInputLayout) && rect != null) {
            this.f88583g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.f88583g);
        }
        return super.requestRectangleOnScreen(rect);
    }
}
