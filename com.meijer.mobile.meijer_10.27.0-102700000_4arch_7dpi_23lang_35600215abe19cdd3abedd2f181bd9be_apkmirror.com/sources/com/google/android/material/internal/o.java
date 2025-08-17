package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;

/* loaded from: classes4.dex */
final class o {

    /* renamed from: n, reason: collision with root package name */
    static final int f87247n = 1;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f87248a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f87249b;

    /* renamed from: c, reason: collision with root package name */
    private final int f87250c;

    /* renamed from: e, reason: collision with root package name */
    private int f87252e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f87259l;

    /* renamed from: d, reason: collision with root package name */
    private int f87251d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f87253f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f87254g = a.e.API_PRIORITY_OTHER;

    /* renamed from: h, reason: collision with root package name */
    private float f87255h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f87256i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f87257j = f87247n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f87258k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f87260m = null;

    static class a extends Exception {
    }

    public o j(p pVar) {
        return this;
    }

    public static o b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new o(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        if (this.f87248a == null) {
            this.f87248a = "";
        }
        int iMax = Math.max(0, this.f87250c);
        CharSequence charSequenceEllipsize = this.f87248a;
        if (this.f87254g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f87249b, iMax, this.f87260m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f87252e);
        this.f87252e = iMin;
        if (this.f87259l && this.f87254g == 1) {
            this.f87253f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f87251d, iMin, this.f87249b, iMax);
        builderObtain.setAlignment(this.f87253f);
        builderObtain.setIncludePad(this.f87258k);
        builderObtain.setTextDirection(this.f87259l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f87260m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f87254g);
        float f10 = this.f87255h;
        if (f10 != 0.0f || this.f87256i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f87256i);
        }
        if (this.f87254g > 1) {
            builderObtain.setHyphenationFrequency(this.f87257j);
        }
        return builderObtain.build();
    }

    public o c(Layout.Alignment alignment) {
        this.f87253f = alignment;
        return this;
    }

    public o d(TextUtils.TruncateAt truncateAt) {
        this.f87260m = truncateAt;
        return this;
    }

    public o e(int i10) {
        this.f87257j = i10;
        return this;
    }

    public o f(boolean z10) {
        this.f87258k = z10;
        return this;
    }

    public o g(boolean z10) {
        this.f87259l = z10;
        return this;
    }

    public o h(float f10, float f11) {
        this.f87255h = f10;
        this.f87256i = f11;
        return this;
    }

    public o i(int i10) {
        this.f87254g = i10;
        return this;
    }

    private o(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f87248a = charSequence;
        this.f87249b = textPaint;
        this.f87250c = i10;
        this.f87252e = charSequence.length();
    }
}
