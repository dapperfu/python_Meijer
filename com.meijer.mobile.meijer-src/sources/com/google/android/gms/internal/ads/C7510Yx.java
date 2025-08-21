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
public final class C7510Yx {

    /* renamed from: A, reason: collision with root package name */
    private static final String f72705A;

    /* renamed from: B, reason: collision with root package name */
    private static final String f72706B;

    /* renamed from: C, reason: collision with root package name */
    private static final String f72707C;

    /* renamed from: D, reason: collision with root package name */
    private static final String f72708D;

    /* renamed from: E, reason: collision with root package name */
    private static final String f72709E;

    /* renamed from: F, reason: collision with root package name */
    private static final String f72710F;

    /* renamed from: G, reason: collision with root package name */
    private static final String f72711G;

    /* renamed from: p, reason: collision with root package name */
    private static final String f72712p;

    /* renamed from: q, reason: collision with root package name */
    private static final String f72713q;

    /* renamed from: r, reason: collision with root package name */
    private static final String f72714r;

    /* renamed from: s, reason: collision with root package name */
    private static final String f72715s;

    /* renamed from: t, reason: collision with root package name */
    private static final String f72716t;

    /* renamed from: u, reason: collision with root package name */
    private static final String f72717u;

    /* renamed from: v, reason: collision with root package name */
    private static final String f72718v;

    /* renamed from: w, reason: collision with root package name */
    private static final String f72719w;

    /* renamed from: x, reason: collision with root package name */
    private static final String f72720x;

    /* renamed from: y, reason: collision with root package name */
    private static final String f72721y;

    /* renamed from: z, reason: collision with root package name */
    private static final String f72722z;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f72723a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f72724b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f72725c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f72726d;

    /* renamed from: e, reason: collision with root package name */
    public final float f72727e;

    /* renamed from: f, reason: collision with root package name */
    public final int f72728f;

    /* renamed from: g, reason: collision with root package name */
    public final int f72729g;

    /* renamed from: h, reason: collision with root package name */
    public final float f72730h;

    /* renamed from: i, reason: collision with root package name */
    public final int f72731i;

    /* renamed from: j, reason: collision with root package name */
    public final float f72732j;

    /* renamed from: k, reason: collision with root package name */
    public final float f72733k;

    /* renamed from: l, reason: collision with root package name */
    public final int f72734l;

    /* renamed from: m, reason: collision with root package name */
    public final float f72735m;

    /* renamed from: n, reason: collision with root package name */
    public final int f72736n;

    /* renamed from: o, reason: collision with root package name */
    public final float f72737o;

    public final C7443Ww b() {
        return new C7443Ww(this, null);
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj != null && C7510Yx.class == obj.getClass()) {
            C7510Yx c7510Yx = (C7510Yx) obj;
            if (TextUtils.equals(this.f72723a, c7510Yx.f72723a) && this.f72724b == c7510Yx.f72724b && this.f72725c == c7510Yx.f72725c && ((bitmap = this.f72726d) != null ? !((bitmap2 = c7510Yx.f72726d) == null || !bitmap.sameAs(bitmap2)) : c7510Yx.f72726d == null) && this.f72727e == c7510Yx.f72727e && this.f72728f == c7510Yx.f72728f && this.f72729g == c7510Yx.f72729g && this.f72730h == c7510Yx.f72730h && this.f72731i == c7510Yx.f72731i && this.f72732j == c7510Yx.f72732j && this.f72733k == c7510Yx.f72733k && this.f72734l == c7510Yx.f72734l && this.f72735m == c7510Yx.f72735m && this.f72736n == c7510Yx.f72736n && this.f72737o == c7510Yx.f72737o) {
                return true;
            }
        }
        return false;
    }

    static {
        C7443Ww c7443Ww = new C7443Ww();
        c7443Ww.l("");
        c7443Ww.p();
        f72712p = Integer.toString(0, 36);
        f72713q = Integer.toString(17, 36);
        f72714r = Integer.toString(1, 36);
        f72715s = Integer.toString(2, 36);
        Integer.toString(3, 36);
        f72716t = Integer.toString(18, 36);
        f72717u = Integer.toString(4, 36);
        f72718v = Integer.toString(5, 36);
        f72719w = Integer.toString(6, 36);
        f72720x = Integer.toString(7, 36);
        f72721y = Integer.toString(8, 36);
        f72722z = Integer.toString(9, 36);
        f72705A = Integer.toString(10, 36);
        f72706B = Integer.toString(11, 36);
        f72707C = Integer.toString(12, 36);
        f72708D = Integer.toString(13, 36);
        f72709E = Integer.toString(14, 36);
        f72710F = Integer.toString(15, 36);
        f72711G = Integer.toString(16, 36);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f72723a;
        if (charSequence != null) {
            bundle.putCharSequence(f72712p, charSequence);
            CharSequence charSequence2 = this.f72723a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<? extends Parcelable> arrayListA = C7757bz.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f72713q, arrayListA);
                }
            }
        }
        bundle.putSerializable(f72714r, this.f72724b);
        bundle.putSerializable(f72715s, this.f72725c);
        bundle.putFloat(f72717u, this.f72727e);
        bundle.putInt(f72718v, this.f72728f);
        bundle.putInt(f72719w, this.f72729g);
        bundle.putFloat(f72720x, this.f72730h);
        bundle.putInt(f72721y, this.f72731i);
        bundle.putInt(f72722z, this.f72734l);
        bundle.putFloat(f72705A, this.f72735m);
        bundle.putFloat(f72706B, this.f72732j);
        bundle.putFloat(f72707C, this.f72733k);
        bundle.putBoolean(f72709E, false);
        bundle.putInt(f72708D, -16777216);
        bundle.putInt(f72710F, this.f72736n);
        bundle.putFloat(f72711G, this.f72737o);
        if (this.f72726d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C8211gC.f(this.f72726d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundle.putByteArray(f72716t, byteArrayOutputStream.toByteArray());
        }
        return bundle;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f72723a, this.f72724b, this.f72725c, this.f72726d, Float.valueOf(this.f72727e), Integer.valueOf(this.f72728f), Integer.valueOf(this.f72729g), Float.valueOf(this.f72730h), Integer.valueOf(this.f72731i), Float.valueOf(this.f72732j), Float.valueOf(this.f72733k), Boolean.FALSE, -16777216, Integer.valueOf(this.f72734l), Float.valueOf(this.f72735m), Integer.valueOf(this.f72736n), Float.valueOf(this.f72737o)});
    }

    /* synthetic */ C7510Yx(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15, C10103xx c10103xx) {
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
            C8211gC.d(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f72723a = SpannedString.valueOf(charSequence);
        } else {
            if (charSequence != null) {
                string = charSequence.toString();
            } else {
                string = null;
            }
            this.f72723a = string;
        }
        this.f72724b = alignment;
        this.f72725c = alignment2;
        this.f72726d = bitmap;
        this.f72727e = f10;
        this.f72728f = i10;
        this.f72729g = i11;
        this.f72730h = f11;
        this.f72731i = i12;
        this.f72732j = f13;
        this.f72733k = f14;
        this.f72734l = i13;
        this.f72735m = f12;
        this.f72736n = i15;
        this.f72737o = f15;
    }
}
