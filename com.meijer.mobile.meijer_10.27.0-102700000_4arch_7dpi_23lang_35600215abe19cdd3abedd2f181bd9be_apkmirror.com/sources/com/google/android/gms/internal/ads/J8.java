package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes6.dex */
public final class J8 {

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f67781a;

    /* renamed from: b, reason: collision with root package name */
    private CharSequence f67782b;

    /* renamed from: c, reason: collision with root package name */
    private CharSequence f67783c;

    /* renamed from: d, reason: collision with root package name */
    private CharSequence f67784d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f67785e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f67786f;

    /* renamed from: g, reason: collision with root package name */
    private Integer f67787g;

    /* renamed from: h, reason: collision with root package name */
    private Integer f67788h;

    /* renamed from: i, reason: collision with root package name */
    private Integer f67789i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f67790j;

    /* renamed from: k, reason: collision with root package name */
    private Boolean f67791k;

    /* renamed from: l, reason: collision with root package name */
    private Integer f67792l;

    /* renamed from: m, reason: collision with root package name */
    private Integer f67793m;

    /* renamed from: n, reason: collision with root package name */
    private Integer f67794n;

    /* renamed from: o, reason: collision with root package name */
    private Integer f67795o;

    /* renamed from: p, reason: collision with root package name */
    private Integer f67796p;

    /* renamed from: q, reason: collision with root package name */
    private Integer f67797q;

    /* renamed from: r, reason: collision with root package name */
    private CharSequence f67798r;

    /* renamed from: s, reason: collision with root package name */
    private CharSequence f67799s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f67800t;

    /* renamed from: u, reason: collision with root package name */
    private CharSequence f67801u;

    /* renamed from: v, reason: collision with root package name */
    private CharSequence f67802v;

    /* renamed from: w, reason: collision with root package name */
    private Integer f67803w;

    /* renamed from: x, reason: collision with root package name */
    private final AbstractC7917eh0 f67804x;

    /* synthetic */ J8(L9 l92, C8506k9 c8506k9) {
        this.f67781a = l92.f68267a;
        this.f67782b = l92.f68268b;
        this.f67783c = l92.f68269c;
        this.f67784d = l92.f68270d;
        this.f67785e = l92.f68271e;
        this.f67786f = l92.f68272f;
        this.f67787g = l92.f68273g;
        this.f67788h = l92.f68274h;
        this.f67789i = l92.f68275i;
        this.f67790j = l92.f68276j;
        this.f67791k = l92.f68277k;
        this.f67792l = l92.f68279m;
        this.f67793m = l92.f68280n;
        this.f67794n = l92.f68281o;
        this.f67795o = l92.f68282p;
        this.f67796p = l92.f68283q;
        this.f67797q = l92.f68284r;
        this.f67798r = l92.f68285s;
        this.f67799s = l92.f68286t;
        this.f67800t = l92.f68287u;
        this.f67801u = l92.f68288v;
        this.f67802v = l92.f68289w;
        this.f67803w = l92.f68290x;
        this.f67804x = l92.f68291y;
    }

    public final J8 A(CharSequence charSequence) {
        this.f67785e = charSequence;
        return this;
    }

    public final J8 B(CharSequence charSequence) {
        this.f67801u = charSequence;
        return this;
    }

    public final J8 C(Integer num) {
        this.f67794n = num;
        return this;
    }

    public final J8 D(Integer num) {
        this.f67793m = num;
        return this;
    }

    public final J8 E(Integer num) {
        this.f67792l = num;
        return this;
    }

    public final J8 F(Integer num) {
        this.f67797q = num;
        return this;
    }

    public final J8 G(Integer num) {
        this.f67796p = num;
        return this;
    }

    public final J8 H(Integer num) {
        this.f67795o = num;
        return this;
    }

    public final J8 I(CharSequence charSequence) {
        this.f67802v = charSequence;
        return this;
    }

    public final J8 J(CharSequence charSequence) {
        this.f67781a = charSequence;
        return this;
    }

    public final J8 K(Integer num) {
        this.f67789i = num;
        return this;
    }

    public final J8 L(Integer num) {
        this.f67788h = num;
        return this;
    }

    public final J8 M(CharSequence charSequence) {
        this.f67798r = charSequence;
        return this;
    }

    public final J8 v(CharSequence charSequence) {
        this.f67784d = charSequence;
        return this;
    }

    public final J8 w(CharSequence charSequence) {
        this.f67783c = charSequence;
        return this;
    }

    public final J8 x(CharSequence charSequence) {
        this.f67782b = charSequence;
        return this;
    }

    public final J8 y(CharSequence charSequence) {
        this.f67799s = charSequence;
        return this;
    }

    public final J8 z(CharSequence charSequence) {
        this.f67800t = charSequence;
        return this;
    }

    public J8() {
        this.f67804x = AbstractC7917eh0.t();
    }

    public final L9 N() {
        return new L9(this);
    }

    public final J8 t(byte[] bArr, int i10) {
        if (this.f67786f != null && !Integer.valueOf(i10).equals(3) && Objects.equals(this.f67787g, 3)) {
            return this;
        }
        this.f67786f = (byte[]) bArr.clone();
        this.f67787g = Integer.valueOf(i10);
        return this;
    }

    public final J8 u(L9 l92) {
        if (l92 != null) {
            CharSequence charSequence = l92.f68267a;
            if (charSequence != null) {
                this.f67781a = charSequence;
            }
            CharSequence charSequence2 = l92.f68268b;
            if (charSequence2 != null) {
                this.f67782b = charSequence2;
            }
            CharSequence charSequence3 = l92.f68269c;
            if (charSequence3 != null) {
                this.f67783c = charSequence3;
            }
            CharSequence charSequence4 = l92.f68270d;
            if (charSequence4 != null) {
                this.f67784d = charSequence4;
            }
            CharSequence charSequence5 = l92.f68271e;
            if (charSequence5 != null) {
                this.f67785e = charSequence5;
            }
            byte[] bArr = l92.f68272f;
            if (bArr != null) {
                Integer num = l92.f68273g;
                this.f67786f = (byte[]) bArr.clone();
                this.f67787g = num;
            }
            Integer num2 = l92.f68274h;
            if (num2 != null) {
                this.f67788h = num2;
            }
            Integer num3 = l92.f68275i;
            if (num3 != null) {
                this.f67789i = num3;
            }
            Integer num4 = l92.f68276j;
            if (num4 != null) {
                this.f67790j = num4;
            }
            Boolean bool = l92.f68277k;
            if (bool != null) {
                this.f67791k = bool;
            }
            Integer num5 = l92.f68278l;
            if (num5 != null) {
                this.f67792l = num5;
            }
            Integer num6 = l92.f68279m;
            if (num6 != null) {
                this.f67792l = num6;
            }
            Integer num7 = l92.f68280n;
            if (num7 != null) {
                this.f67793m = num7;
            }
            Integer num8 = l92.f68281o;
            if (num8 != null) {
                this.f67794n = num8;
            }
            Integer num9 = l92.f68282p;
            if (num9 != null) {
                this.f67795o = num9;
            }
            Integer num10 = l92.f68283q;
            if (num10 != null) {
                this.f67796p = num10;
            }
            Integer num11 = l92.f68284r;
            if (num11 != null) {
                this.f67797q = num11;
            }
            CharSequence charSequence6 = l92.f68285s;
            if (charSequence6 != null) {
                this.f67798r = charSequence6;
            }
            CharSequence charSequence7 = l92.f68286t;
            if (charSequence7 != null) {
                this.f67799s = charSequence7;
            }
            CharSequence charSequence8 = l92.f68287u;
            if (charSequence8 != null) {
                this.f67800t = charSequence8;
            }
            CharSequence charSequence9 = l92.f68288v;
            if (charSequence9 != null) {
                this.f67801u = charSequence9;
            }
            CharSequence charSequence10 = l92.f68289w;
            if (charSequence10 != null) {
                this.f67802v = charSequence10;
            }
            Integer num12 = l92.f68290x;
            if (num12 != null) {
                this.f67803w = num12;
            }
        }
        return this;
    }
}
