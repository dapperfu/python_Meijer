package E1;

import V0.T;
import V0.r1;
import X0.Stroke;
import X0.g;
import X0.j;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LE1/c;", "Landroid/text/style/CharacterStyle;", "Landroid/text/style/UpdateAppearance;", "LX0/g;", "drawStyle", "<init>", "(LX0/g;)V", "Landroid/text/TextPaint;", "textPaint", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "a", "LX0/g;", "getDrawStyle", "()LX0/g;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class c extends CharacterStyle implements UpdateAppearance {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g drawStyle;

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = this.drawStyle;
            if (Intrinsics.e(gVar, j.f39072a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (gVar instanceof Stroke) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((Stroke) this.drawStyle).getWidth());
                textPaint.setStrokeMiter(((Stroke) this.drawStyle).getMiter());
                textPaint.setStrokeJoin(d.b(((Stroke) this.drawStyle).getJoin()));
                textPaint.setStrokeCap(d.a(((Stroke) this.drawStyle).getCap()));
                r1 pathEffect = ((Stroke) this.drawStyle).getPathEffect();
                textPaint.setPathEffect(pathEffect != null ? T.b(pathEffect) : null);
            }
        }
    }

    public c(g gVar) {
        this.drawStyle = gVar;
    }
}
