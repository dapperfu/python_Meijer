package w1;

import android.os.Build;
import android.text.TextPaint;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "text", "Landroid/text/TextPaint;", "textPaint", "Lw1/f;", "a", "(Ljava/lang/CharSequence;Landroid/text/TextPaint;)Lw1/f;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: w1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17817g {
    public static final InterfaceC17816f a(CharSequence charSequence, TextPaint textPaint) {
        return Build.VERSION.SDK_INT >= 29 ? new C17814d(charSequence, textPaint) : new C17815e(charSequence);
    }
}
