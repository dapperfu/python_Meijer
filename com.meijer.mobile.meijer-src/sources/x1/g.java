package x1;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lx1/g;", "Landroid/text/style/LineHeightSpan;", "", "lineHeight", "<init>", "(F)V", "", "text", "", "start", "end", "spanstartVertical", "Landroid/graphics/Paint$FontMetricsInt;", "fontMetricsInt", "", "chooseHeight", "(Ljava/lang/CharSequence;IIIILandroid/graphics/Paint$FontMetricsInt;)V", "a", "F", "getLineHeight", "()F", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g implements LineHeightSpan {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float lineHeight;

    public g(float f10) {
        this.lineHeight = f10;
    }

    @Override // android.text.style.LineHeightSpan
    public void chooseHeight(CharSequence text, int start, int end, int spanstartVertical, int lineHeight, Paint.FontMetricsInt fontMetricsInt) {
        if (i.a(fontMetricsInt) <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = iCeil;
        fontMetricsInt.ascent = iCeil - ((int) Math.ceil(this.lineHeight));
    }
}
