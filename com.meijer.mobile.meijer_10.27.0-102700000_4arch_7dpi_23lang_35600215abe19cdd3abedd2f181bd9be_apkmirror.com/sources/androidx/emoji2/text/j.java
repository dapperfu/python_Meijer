package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    private final p f54630b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f54629a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f54631c = -1;

    /* renamed from: d, reason: collision with root package name */
    private short f54632d = -1;

    /* renamed from: e, reason: collision with root package name */
    private float f54633e = 1.0f;

    public final p a() {
        return this.f54630b;
    }

    final int b() {
        return this.f54631c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f54629a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f54629a;
        this.f54633e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f54630b.e();
        this.f54632d = (short) (this.f54630b.e() * this.f54633e);
        short sI = (short) (this.f54630b.i() * this.f54633e);
        this.f54631c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f54629a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }

    j(p pVar) {
        o2.i.h(pVar, "rasterizer cannot be null");
        this.f54630b = pVar;
    }
}
