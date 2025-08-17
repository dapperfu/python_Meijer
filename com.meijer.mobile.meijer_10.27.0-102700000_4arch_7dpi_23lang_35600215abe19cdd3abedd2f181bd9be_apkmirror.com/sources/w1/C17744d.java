package w1;

import android.text.TextPaint;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lw1/d;", "Lw1/b;", "", "text", "Landroid/text/TextPaint;", "textPaint", "<init>", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)V", "", "offset", "f", "(I)I", "e", "a", "Ljava/lang/CharSequence;", "b", "Landroid/text/TextPaint;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: w1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17744d extends AbstractC17742b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CharSequence text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextPaint textPaint;

    @Override // w1.AbstractC17742b
    public int e(int offset) {
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.text;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, offset, 0);
    }

    @Override // w1.AbstractC17742b
    public int f(int offset) {
        TextPaint textPaint = this.textPaint;
        CharSequence charSequence = this.text;
        return textPaint.getTextRunCursor(charSequence, 0, charSequence.length(), false, offset, 2);
    }

    public C17744d(CharSequence charSequence, TextPaint textPaint) {
        this.text = charSequence;
        this.textPaint = textPaint;
    }
}
