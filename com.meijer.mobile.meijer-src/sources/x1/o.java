package x1;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lx1/o;", "Landroid/text/style/MetricAffectingSpan;", "Landroid/graphics/Typeface;", "typeface", "<init>", "(Landroid/graphics/Typeface;)V", "Landroid/graphics/Paint;", "paint", "", "a", "(Landroid/graphics/Paint;)V", "Landroid/text/TextPaint;", "ds", "updateDrawState", "(Landroid/text/TextPaint;)V", "updateMeasureState", "Landroid/graphics/Typeface;", "getTypeface", "()Landroid/graphics/Typeface;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class o extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Typeface typeface;

    private final void a(Paint paint) {
        paint.setTypeface(this.typeface);
    }

    public o(Typeface typeface) {
        this.typeface = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint ds2) {
        a(ds2);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint paint) {
        a(paint);
    }
}
