package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class j extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    private final p f54854b;

    /* renamed from: a, reason: collision with root package name */
    private final Paint.FontMetricsInt f54853a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    private short f54855c = -1;

    /* renamed from: d, reason: collision with root package name */
    private short f54856d = -1;

    /* renamed from: e, reason: collision with root package name */
    private float f54857e = 1.0f;

    public final p a() {
        return this.f54854b;
    }

    final int b() {
        return this.f54855c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, @SuppressLint({"UnknownNullness"}) CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f54853a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f54853a;
        this.f54857e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f54854b.e();
        this.f54856d = (short) (this.f54854b.e() * this.f54857e);
        short sI = (short) (this.f54854b.i() * this.f54857e);
        this.f54855c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f54853a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }

    j(p pVar) {
        o2.i.h(pVar, "rasterizer cannot be null");
        this.f54854b = pVar;
    }
}
