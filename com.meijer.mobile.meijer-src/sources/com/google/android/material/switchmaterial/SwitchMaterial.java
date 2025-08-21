package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import ce.C6503b;
import ce.d;
import ce.k;
import ce.l;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import ke.C15121a;
import me.C15711a;
import we.C17867a;

/* loaded from: classes4.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: b0, reason: collision with root package name */
    private static final int f88419b0 = k.f61791D;

    /* renamed from: c0, reason: collision with root package name */
    private static final int[][] f88420c0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: U, reason: collision with root package name */
    private final C15711a f88421U;

    /* renamed from: V, reason: collision with root package name */
    private ColorStateList f88422V;

    /* renamed from: W, reason: collision with root package name */
    private ColorStateList f88423W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f88424a0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C6503b.f61541k0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f88419b0;
        super(C17867a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f88421U = new C15711a(context2);
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f62123Z7, i10, i11, new int[0]);
        this.f88424a0 = typedArrayI.getBoolean(l.f62135a8, false);
        typedArrayI.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() throws Resources.NotFoundException {
        if (this.f88422V == null) {
            int iD = C15121a.d(this, C6503b.f61556s);
            int iD2 = C15121a.d(this, C6503b.f61540k);
            float dimension = getResources().getDimension(d.f61655y0);
            if (this.f88421U.e()) {
                dimension += x.j(this);
            }
            int iC = this.f88421U.c(iD, dimension);
            int[][] iArr = f88420c0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C15121a.j(iD, iD2, 1.0f);
            iArr2[1] = iC;
            iArr2[2] = C15121a.j(iD, iD2, 0.38f);
            iArr2[3] = iC;
            this.f88422V = new ColorStateList(iArr, iArr2);
        }
        return this.f88422V;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f88423W == null) {
            int[][] iArr = f88420c0;
            int[] iArr2 = new int[iArr.length];
            int iD = C15121a.d(this, C6503b.f61556s);
            int iD2 = C15121a.d(this, C6503b.f61540k);
            int iD3 = C15121a.d(this, C6503b.f61548o);
            iArr2[0] = C15121a.j(iD, iD2, 0.54f);
            iArr2[1] = C15121a.j(iD, iD3, 0.32f);
            iArr2[2] = C15121a.j(iD, iD2, 0.12f);
            iArr2[3] = C15121a.j(iD, iD3, 0.12f);
            this.f88423W = new ColorStateList(iArr, iArr2);
        }
        return this.f88423W;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f88424a0 = z10;
        if (z10) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f88424a0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f88424a0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }
}
