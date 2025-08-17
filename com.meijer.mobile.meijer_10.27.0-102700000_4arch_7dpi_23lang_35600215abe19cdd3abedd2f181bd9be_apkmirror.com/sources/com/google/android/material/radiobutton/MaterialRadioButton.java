package com.google.android.material.radiobutton;

import ae.C5597b;
import ae.k;
import ae.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.c;
import com.google.android.material.internal.s;
import ie.C14718a;
import oe.C16026c;
import ue.C17250a;

/* loaded from: classes4.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: g, reason: collision with root package name */
    private static final int f87310g = k.f44775C;

    /* renamed from: h, reason: collision with root package name */
    private static final int[][] f87311h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f87312e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f87313f;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44503Y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87310g;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f45061V4, i10, i11, new int[0]);
        if (typedArrayI.hasValue(l.f45072W4)) {
            c.d(this, C16026c.a(context2, typedArrayI, l.f45072W4));
        }
        this.f87313f = typedArrayI.getBoolean(l.f45083X4, false);
        typedArrayI.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f87312e == null) {
            int iD = C14718a.d(this, C5597b.f44525k);
            int iD2 = C14718a.d(this, C5597b.f44533o);
            int iD3 = C14718a.d(this, C5597b.f44541s);
            int[][] iArr = f87311h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C14718a.j(iD3, iD, 1.0f);
            iArr2[1] = C14718a.j(iD3, iD2, 0.54f);
            iArr2[2] = C14718a.j(iD3, iD2, 0.38f);
            iArr2[3] = C14718a.j(iD3, iD2, 0.38f);
            this.f87312e = new ColorStateList(iArr, iArr2);
        }
        return this.f87312e;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f87313f = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f87313f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
