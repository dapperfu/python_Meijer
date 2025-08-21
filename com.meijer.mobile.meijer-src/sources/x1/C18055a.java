package x1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx1/a;", "Landroid/text/style/MetricAffectingSpan;", "", "multiplier", "<init>", "(F)V", "Landroid/text/TextPaint;", "textPaint", "", "updateMeasureState", "(Landroid/text/TextPaint;)V", "updateDrawState", "a", "F", "getMultiplier", "()F", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C18055a extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float multiplier;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.multiplier);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.multiplier);
    }

    public C18055a(float f10) {
        this.multiplier = f10;
    }
}
