package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class J8 {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f68621a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f68622b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f68623c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f68624d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f68625e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f68626f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f68627g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f68628h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f68629i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f68630j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f68631k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f68632l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f68633m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f68634n;

    /* renamed from: o, reason: collision with root package name */
    private Integer f68635o;

    /* renamed from: p, reason: collision with root package name */
    private Integer f68636p;

    /* renamed from: q, reason: collision with root package name */
    private Integer f68637q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f68638r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f68639s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f68640t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f68641u;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f68642v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f68643w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC8042eh0 f68644x;

    /* synthetic */ J8(L9 l92, C8631k9 c8631k9) {
        this.f68621a = l92.f69107a;
        this.f68622b = l92.f69108b;
        this.f68623c = l92.f69109c;
        this.f68624d = l92.f69110d;
        this.f68625e = l92.f69111e;
        this.f68626f = l92.f69112f;
        this.f68627g = l92.f69113g;
        this.f68628h = l92.f69114h;
        this.f68629i = l92.f69115i;
        this.f68630j = l92.f69116j;
        this.f68631k = l92.f69117k;
        this.f68632l = l92.f69119m;
        this.f68633m = l92.f69120n;
        this.f68634n = l92.f69121o;
        this.f68635o = l92.f69122p;
        this.f68636p = l92.f69123q;
        this.f68637q = l92.f69124r;
        this.f68638r = l92.f69125s;
        this.f68639s = l92.f69126t;
        this.f68640t = l92.f69127u;
        this.f68641u = l92.f69128v;
        this.f68642v = l92.f69129w;
        this.f68643w = l92.f69130x;
        this.f68644x = l92.f69131y;
    }

    public final J8 A(CharSequence charSequence) {
        this.f68625e = charSequence;
        return this;
    }

    public final J8 B(CharSequence charSequence) {
        this.f68641u = charSequence;
        return this;
    }

    public final J8 C(Integer num) {
        this.f68634n = num;
        return this;
    }

    public final J8 D(Integer num) {
        this.f68633m = num;
        return this;
    }

    public final J8 E(Integer num) {
        this.f68632l = num;
        return this;
    }

    public final J8 F(Integer num) {
        this.f68637q = num;
        return this;
    }

    public final J8 G(Integer num) {
        this.f68636p = num;
        return this;
    }

    public final J8 H(Integer num) {
        this.f68635o = num;
        return this;
    }

    public final J8 I(CharSequence charSequence) {
        this.f68642v = charSequence;
        return this;
    }

    public final J8 J(CharSequence charSequence) {
        this.f68621a = charSequence;
        return this;
    }

    public final J8 K(Integer num) {
        this.f68629i = num;
        return this;
    }

    public final J8 L(Integer num) {
        this.f68628h = num;
        return this;
    }

    public final J8 M(CharSequence charSequence) {
        this.f68638r = charSequence;
        return this;
    }

    public final J8 v(CharSequence charSequence) {
        this.f68624d = charSequence;
        return this;
    }

    public final J8 w(CharSequence charSequence) {
        this.f68623c = charSequence;
        return this;
    }

    public final J8 x(CharSequence charSequence) {
        this.f68622b = charSequence;
        return this;
    }

    public final J8 y(CharSequence charSequence) {
        this.f68639s = charSequence;
        return this;
    }

    public final J8 z(CharSequence charSequence) {
        this.f68640t = charSequence;
        return this;
    }

    public J8() {
        this.f68644x = AbstractC8042eh0.t();
    }

    public final L9 N() {
        return new L9(this);
    }

    public final J8 t(byte[] bArr, int i10) {
        if (this.f68626f != null && !Integer.valueOf(i10).equals(3) && Objects.equals(this.f68627g, 3)) {
            return this;
        }
        this.f68626f = (byte[]) bArr.clone();
        this.f68627g = Integer.valueOf(i10);
        return this;
    }

    public final J8 u(L9 l92) {
        if (l92 != null) {
            CharSequence charSequence = l92.f69107a;
            if (charSequence != null) {
                this.f68621a = charSequence;
            }
            CharSequence charSequence2 = l92.f69108b;
            if (charSequence2 != null) {
                this.f68622b = charSequence2;
            }
            CharSequence charSequence3 = l92.f69109c;
            if (charSequence3 != null) {
                this.f68623c = charSequence3;
            }
            CharSequence charSequence4 = l92.f69110d;
            if (charSequence4 != null) {
                this.f68624d = charSequence4;
            }
            CharSequence charSequence5 = l92.f69111e;
            if (charSequence5 != null) {
                this.f68625e = charSequence5;
            }
            byte[] bArr = l92.f69112f;
            if (bArr != null) {
                Integer num = l92.f69113g;
                this.f68626f = (byte[]) bArr.clone();
                this.f68627g = num;
            }
            Integer num2 = l92.f69114h;
            if (num2 != null) {
                this.f68628h = num2;
            }
            Integer num3 = l92.f69115i;
            if (num3 != null) {
                this.f68629i = num3;
            }
            Integer num4 = l92.f69116j;
            if (num4 != null) {
                this.f68630j = num4;
            }
            Boolean bool = l92.f69117k;
            if (bool != null) {
                this.f68631k = bool;
            }
            Integer num5 = l92.f69118l;
            if (num5 != null) {
                this.f68632l = num5;
            }
            Integer num6 = l92.f69119m;
            if (num6 != null) {
                this.f68632l = num6;
            }
            Integer num7 = l92.f69120n;
            if (num7 != null) {
                this.f68633m = num7;
            }
            Integer num8 = l92.f69121o;
            if (num8 != null) {
                this.f68634n = num8;
            }
            Integer num9 = l92.f69122p;
            if (num9 != null) {
                this.f68635o = num9;
            }
            Integer num10 = l92.f69123q;
            if (num10 != null) {
                this.f68636p = num10;
            }
            Integer num11 = l92.f69124r;
            if (num11 != null) {
                this.f68637q = num11;
            }
            CharSequence charSequence6 = l92.f69125s;
            if (charSequence6 != null) {
                this.f68638r = charSequence6;
            }
            CharSequence charSequence7 = l92.f69126t;
            if (charSequence7 != null) {
                this.f68639s = charSequence7;
            }
            CharSequence charSequence8 = l92.f69127u;
            if (charSequence8 != null) {
                this.f68640t = charSequence8;
            }
            CharSequence charSequence9 = l92.f69128v;
            if (charSequence9 != null) {
                this.f68641u = charSequence9;
            }
            CharSequence charSequence10 = l92.f69129w;
            if (charSequence10 != null) {
                this.f68642v = charSequence10;
            }
            Integer num12 = l92.f69130x;
            if (num12 != null) {
                this.f68643w = num12;
            }
        }
        return this;
    }
}
