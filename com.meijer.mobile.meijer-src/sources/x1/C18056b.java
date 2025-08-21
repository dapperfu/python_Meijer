package x1;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lx1/b;", "Landroid/text/style/MetricAffectingSpan;", "", "fontFeatureSettings", "<init>", "(Ljava/lang/String;)V", "Landroid/text/TextPaint;", "textPaint", "", "updateMeasureState", "(Landroid/text/TextPaint;)V", "updateDrawState", "a", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18056b extends MetricAffectingSpan {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String fontFeatureSettings;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }

    @Override // android.text.style.MetricAffectingSpan
    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.fontFeatureSettings);
    }

    public C18056b(String str) {
        this.fontFeatureSettings = str;
    }
}
