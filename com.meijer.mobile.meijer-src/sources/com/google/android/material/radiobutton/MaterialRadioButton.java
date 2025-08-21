package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.c;
import ce.C6503b;
import ce.k;
import ce.l;
import com.google.android.material.internal.s;
import ke.C15121a;
import qe.C16634c;
import we.C17867a;

/* loaded from: classes4.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: g, reason: collision with root package name */
    private static final int f88150g = k.f61790C;

    /* renamed from: h, reason: collision with root package name */
    private static final int[][] f88151h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f88152e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f88153f;

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61518Y);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f88150g;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f62076V4, i10, i11, new int[0]);
        if (typedArrayI.hasValue(l.f62087W4)) {
            c.d(this, C16634c.a(context2, typedArrayI, l.f62087W4));
        }
        this.f88153f = typedArrayI.getBoolean(l.f62098X4, false);
        typedArrayI.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f88152e == null) {
            int iD = C15121a.d(this, C6503b.f61540k);
            int iD2 = C15121a.d(this, C6503b.f61548o);
            int iD3 = C15121a.d(this, C6503b.f61556s);
            int[][] iArr = f88151h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C15121a.j(iD3, iD, 1.0f);
            iArr2[1] = C15121a.j(iD3, iD2, 0.54f);
            iArr2[2] = C15121a.j(iD3, iD2, 0.38f);
            iArr2[3] = C15121a.j(iD3, iD2, 0.38f);
            this.f88152e = new ColorStateList(iArr, iArr2);
        }
        return this.f88152e;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f88153f = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f88153f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }
}
