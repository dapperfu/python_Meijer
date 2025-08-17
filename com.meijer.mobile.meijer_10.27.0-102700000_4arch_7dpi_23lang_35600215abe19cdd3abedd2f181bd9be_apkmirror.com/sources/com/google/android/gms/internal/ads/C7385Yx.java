package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.Yx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7385Yx {

    /* renamed from: A, reason: collision with root package name */
    private static final String f71865A;

    /* renamed from: B, reason: collision with root package name */
    private static final String f71866B;

    /* renamed from: C, reason: collision with root package name */
    private static final String f71867C;

    /* renamed from: D, reason: collision with root package name */
    private static final String f71868D;

    /* renamed from: E, reason: collision with root package name */
    private static final String f71869E;

    /* renamed from: F, reason: collision with root package name */
    private static final String f71870F;

    /* renamed from: G, reason: collision with root package name */
    private static final String f71871G;

    /* renamed from: p, reason: collision with root package name */
    private static final String f71872p;

    /* renamed from: q, reason: collision with root package name */
    private static final String f71873q;

    /* renamed from: r, reason: collision with root package name */
    private static final String f71874r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f71875s;

    /* renamed from: t, reason: collision with root package name */
    private static final String f71876t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f71877u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f71878v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f71879w;

    /* renamed from: x, reason: collision with root package name */
    private static final String f71880x;

    /* renamed from: y, reason: collision with root package name */
    private static final String f71881y;

    /* renamed from: z, reason: collision with root package name */
    private static final String f71882z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f71883a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f71884b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f71885c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f71886d;

    /* renamed from: e, reason: collision with root package name */
    public final float f71887e;

    /* renamed from: f, reason: collision with root package name */
    public final int f71888f;

    /* renamed from: g, reason: collision with root package name */
    public final int f71889g;

    /* renamed from: h, reason: collision with root package name */
    public final float f71890h;

    /* renamed from: i, reason: collision with root package name */
    public final int f71891i;

    /* renamed from: j, reason: collision with root package name */
    public final float f71892j;

    /* renamed from: k, reason: collision with root package name */
    public final float f71893k;

    /* renamed from: l, reason: collision with root package name */
    public final int f71894l;

    /* renamed from: m, reason: collision with root package name */
    public final float f71895m;

    /* renamed from: n, reason: collision with root package name */
    public final int f71896n;

    /* renamed from: o, reason: collision with root package name */
    public final float f71897o;

    public final C7318Ww b() {
        return new C7318Ww(this, null);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C7385Yx.class == obj.getClass()) {
            C7385Yx c7385Yx = (C7385Yx) obj;
            if (TextUtils.equals(this.f71883a, c7385Yx.f71883a) && this.f71884b == c7385Yx.f71884b && this.f71885c == c7385Yx.f71885c && ((bitmap = this.f71886d) != null ? !((bitmap2 = c7385Yx.f71886d) == null || !bitmap.sameAs(bitmap2)) : c7385Yx.f71886d == null) && this.f71887e == c7385Yx.f71887e && this.f71888f == c7385Yx.f71888f && this.f71889g == c7385Yx.f71889g && this.f71890h == c7385Yx.f71890h && this.f71891i == c7385Yx.f71891i && this.f71892j == c7385Yx.f71892j && this.f71893k == c7385Yx.f71893k && this.f71894l == c7385Yx.f71894l && this.f71895m == c7385Yx.f71895m && this.f71896n == c7385Yx.f71896n && this.f71897o == c7385Yx.f71897o) {
                return true;
            }
        }
        return false;
    }

    static {
        C7318Ww c7318Ww = new C7318Ww();
        c7318Ww.l("");
        c7318Ww.p();
        f71872p = Integer.toString(0, 36);
        f71873q = Integer.toString(17, 36);
        f71874r = Integer.toString(1, 36);
        f71875s = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f71876t = Integer.toString(18, 36);
        f71877u = Integer.toString(4, 36);
        f71878v = Integer.toString(5, 36);
        f71879w = Integer.toString(6, 36);
        f71880x = Integer.toString(7, 36);
        f71881y = Integer.toString(8, 36);
        f71882z = Integer.toString(9, 36);
        f71865A = Integer.toString(10, 36);
        f71866B = Integer.toString(11, 36);
        f71867C = Integer.toString(12, 36);
        f71868D = Integer.toString(13, 36);
        f71869E = Integer.toString(14, 36);
        f71870F = Integer.toString(15, 36);
        f71871G = Integer.toString(16, 36);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f71883a;
        if (charSequence != null) {
            bundle.putCharSequence(f71872p, charSequence);
            CharSequence charSequence2 = this.f71883a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListA = C7632bz.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f71873q, arrayListA);
                }
            }
        }
        bundle.putSerializable(f71874r, this.f71884b);
        bundle.putSerializable(f71875s, this.f71885c);
        bundle.putFloat(f71877u, this.f71887e);
        bundle.putInt(f71878v, this.f71888f);
        bundle.putInt(f71879w, this.f71889g);
        bundle.putFloat(f71880x, this.f71890h);
        bundle.putInt(f71881y, this.f71891i);
        bundle.putInt(f71882z, this.f71894l);
        bundle.putFloat(f71865A, this.f71895m);
        bundle.putFloat(f71866B, this.f71892j);
        bundle.putFloat(f71867C, this.f71893k);
        bundle.putBoolean(f71869E, false);
        bundle.putInt(f71868D, -16777216);
        bundle.putInt(f71870F, this.f71896n);
        bundle.putFloat(f71871G, this.f71897o);
        if (this.f71886d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C8086gC.f(this.f71886d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f71876t, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f71883a, this.f71884b, this.f71885c, this.f71886d, Float.valueOf(this.f71887e), Integer.valueOf(this.f71888f), Integer.valueOf(this.f71889g), Float.valueOf(this.f71890h), Integer.valueOf(this.f71891i), Float.valueOf(this.f71892j), Float.valueOf(this.f71893k), Boolean.FALSE, -16777216, Integer.valueOf(this.f71894l), Float.valueOf(this.f71895m), Integer.valueOf(this.f71896n), Float.valueOf(this.f71897o)});
    }

    /* synthetic */ C7385Yx(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, C9978xx c9978xx) {
        boolean z11;
        String string;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            C8086gC.d(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f71883a = SpannedString.valueOf(charSequence);
        } else {
            if (charSequence != null) {
                string = charSequence.toString();
            } else {
                string = null;
            }
            this.f71883a = string;
        }
        this.f71884b = alignment;
        this.f71885c = alignment2;
        this.f71886d = bitmap;
        this.f71887e = f10;
        this.f71888f = i10;
        this.f71889g = i11;
        this.f71890h = f11;
        this.f71891i = i12;
        this.f71892j = f13;
        this.f71893k = f14;
        this.f71894l = i13;
        this.f71895m = f12;
        this.f71896n = i15;
        this.f71897o = f15;
    }
}
