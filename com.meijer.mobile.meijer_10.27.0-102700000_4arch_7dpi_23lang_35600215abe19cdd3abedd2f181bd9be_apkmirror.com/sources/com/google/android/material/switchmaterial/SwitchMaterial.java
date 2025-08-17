package com.google.android.material.switchmaterial;

import ae.C5597b;
import ae.d;
import ae.k;
import ae.l;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.s;
import com.google.android.material.internal.x;
import ie.C14718a;
import ke.C15140a;
import ue.C17250a;

/* loaded from: classes4.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: b0, reason: collision with root package name */
    private static final int f87579b0 = k.f44776D;

    /* renamed from: c0, reason: collision with root package name */
    private static final int[][] f87580c0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: U, reason: collision with root package name */
    private final C15140a f87581U;

    /* renamed from: V, reason: collision with root package name */
    private ColorStateList f87582V;

    /* renamed from: W, reason: collision with root package name */
    private ColorStateList f87583W;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f87584a0;

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5597b.f44526k0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchMaterial(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f87579b0;
        super(C17250a.c(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        this.f87581U = new C15140a(context2);
        TypedArray typedArrayI = s.i(context2, attributeSet, l.f45108Z7, i10, i11, new int[0]);
        this.f87584a0 = typedArrayI.getBoolean(l.f45120a8, false);
        typedArrayI.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() throws Resources.NotFoundException {
        if (this.f87582V == null) {
            int iD = C14718a.d(this, C5597b.f44541s);
            int iD2 = C14718a.d(this, C5597b.f44525k);
            float dimension = getResources().getDimension(d.f44640y0);
            if (this.f87581U.e()) {
                dimension += x.j(this);
            }
            int iC = this.f87581U.c(iD, dimension);
            int[][] iArr = f87580c0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C14718a.j(iD, iD2, 1.0f);
            iArr2[1] = iC;
            iArr2[2] = C14718a.j(iD, iD2, 0.38f);
            iArr2[3] = iC;
            this.f87582V = new ColorStateList(iArr, iArr2);
        }
        return this.f87582V;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f87583W == null) {
            int[][] iArr = f87580c0;
            int[] iArr2 = new int[iArr.length];
            int iD = C14718a.d(this, C5597b.f44541s);
            int iD2 = C14718a.d(this, C5597b.f44525k);
            int iD3 = C14718a.d(this, C5597b.f44533o);
            iArr2[0] = C14718a.j(iD, iD2, 0.54f);
            iArr2[1] = C14718a.j(iD, iD3, 0.32f);
            iArr2[2] = C14718a.j(iD, iD2, 0.12f);
            iArr2[3] = C14718a.j(iD, iD3, 0.12f);
            this.f87583W = new ColorStateList(iArr, iArr2);
        }
        return this.f87583W;
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f87584a0 = z10;
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
        if (this.f87584a0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f87584a0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }
}
