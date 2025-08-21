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
    static final int f88087n = 1;

    /* renamed from: a, reason: collision with root package name */
    private CharSequence f88088a;

    /* renamed from: b, reason: collision with root package name */
    private final TextPaint f88089b;

    /* renamed from: c, reason: collision with root package name */
    private final int f88090c;

    /* renamed from: e, reason: collision with root package name */
    private int f88092e;

    /* renamed from: l, reason: collision with root package name */
    private boolean f88099l;

    /* renamed from: d, reason: collision with root package name */
    private int f88091d = 0;

    /* renamed from: f, reason: collision with root package name */
    private Layout.Alignment f88093f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    private int f88094g = a.e.API_PRIORITY_OTHER;

    /* renamed from: h, reason: collision with root package name */
    private float f88095h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private float f88096i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    private int f88097j = f88087n;

    /* renamed from: k, reason: collision with root package name */
    private boolean f88098k = true;

    /* renamed from: m, reason: collision with root package name */
    private TextUtils.TruncateAt f88100m = null;

    static class a extends Exception {
    }

    public o j(p pVar) {
        return this;
    }

    public static o b(CharSequence charSequence, TextPaint textPaint, int i10) {
        return new o(charSequence, textPaint, i10);
    }

    public StaticLayout a() throws a {
        if (this.f88088a == null) {
            this.f88088a = "";
        }
        int iMax = Math.max(0, this.f88090c);
        CharSequence charSequenceEllipsize = this.f88088a;
        if (this.f88094g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f88089b, iMax, this.f88100m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f88092e);
        this.f88092e = iMin;
        if (this.f88099l && this.f88094g == 1) {
            this.f88093f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f88091d, iMin, this.f88089b, iMax);
        builderObtain.setAlignment(this.f88093f);
        builderObtain.setIncludePad(this.f88098k);
        builderObtain.setTextDirection(this.f88099l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f88100m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f88094g);
        float f10 = this.f88095h;
        if (f10 != 0.0f || this.f88096i != 1.0f) {
            builderObtain.setLineSpacing(f10, this.f88096i);
        }
        if (this.f88094g > 1) {
            builderObtain.setHyphenationFrequency(this.f88097j);
        }
        return builderObtain.build();
    }

    public o c(Layout.Alignment alignment) {
        this.f88093f = alignment;
        return this;
    }

    public o d(TextUtils.TruncateAt truncateAt) {
        this.f88100m = truncateAt;
        return this;
    }

    public o e(int i10) {
        this.f88097j = i10;
        return this;
    }

    public o f(boolean z10) {
        this.f88098k = z10;
        return this;
    }

    public o g(boolean z10) {
        this.f88099l = z10;
        return this;
    }

    public o h(float f10, float f11) {
        this.f88095h = f10;
        this.f88096i = f11;
        return this;
    }

    public o i(int i10) {
        this.f88094g = i10;
        return this;
    }

    private o(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.f88088a = charSequence;
        this.f88089b = textPaint;
        this.f88090c = i10;
        this.f88092e = charSequence.length();
    }
}
