package x1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx1/f;", "Landroid/text/style/MetricAffectingSpan;", "", "letterSpacing", "<init>", "(F)V", "Landroid/text/TextPaint;", "", "a", "(Landroid/text/TextPaint;)V", "textPaint", "updateDrawState", "updateMeasureState", "F", "getLetterSpacing", "()F", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float letterSpacing;

    public f(float f10) {
        this.letterSpacing = f10;
    }

    private final void a(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.letterSpacing / textSize);
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
