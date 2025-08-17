package com.google.android.material.textfield;

import ae.C5597b;
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
import ue.C17250a;

/* loaded from: classes4.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: g, reason: collision with root package name */
    private final Rect f87743g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f87744h;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44544u);
    }

    public TextInputEditText(Context context, AttributeSet attributeSet, int i10) {
        super(C17250a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.f87743g = new Rect();
        TypedArray typedArrayI = com.google.android.material.internal.s.i(context, attributeSet, ae.l.f45065V8, i10, ae.k.f44801q, new int[0]);
        setTextInputLayoutFocusedRectEnabled(typedArrayI.getBoolean(ae.l.f45076W8, false));
        typedArrayI.recycle();
    }

    private boolean e(TextInputLayout textInputLayout) {
        return textInputLayout != null && this.f87744h;
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z10) {
        this.f87744h = z10;
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
            textInputLayout.getFocusedRect(this.f87743g);
            rect.bottom = this.f87743g.bottom;
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
            this.f87743g.set(rect.left, rect.top, rect.right, rect.bottom + (textInputLayout.getHeight() - getHeight()));
            return super.requestRectangleOnScreen(this.f87743g);
        }
        return super.requestRectangleOnScreen(rect);
    }
}
