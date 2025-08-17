package C1;

import V0.AbstractC5324i0;
import V0.C5327j0;
import V0.Shadow;
import V0.SolidColor;
import V0.z1;
import android.graphics.Matrix;
import android.graphics.Shader;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.ParagraphInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a^\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aT\u0010\u0012\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/g;", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "LV0/i0;", "brush", "", "alpha", "LV0/B1;", "shadow", "LF1/k;", "decoration", "LX0/g;", "drawStyle", "LV0/c0;", "blendMode", "", "a", "(Landroidx/compose/ui/text/g;Landroidx/compose/ui/graphics/Canvas;LV0/i0;FLV0/B1;LF1/k;LX0/g;I)V", "b", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {
    public static final void a(androidx.compose.ui.text.g gVar, Canvas canvas, AbstractC5324i0 abstractC5324i0, float f10, Shadow shadow, F1.k kVar, X0.g gVar2, int i10) {
        canvas.save();
        if (gVar.z().size() <= 1 || (abstractC5324i0 instanceof SolidColor)) {
            b(gVar, canvas, abstractC5324i0, f10, shadow, kVar, gVar2, i10);
        } else if (abstractC5324i0 instanceof z1) {
            List<ParagraphInfo> listZ = gVar.z();
            int size = listZ.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i11 = 0; i11 < size; i11++) {
                ParagraphInfo paragraphInfo = listZ.get(i11);
                height += paragraphInfo.getParagraph().getHeight();
                fMax = Math.max(fMax, paragraphInfo.getParagraph().getWidth());
            }
            Shader shaderB = ((z1) abstractC5324i0).b(U0.k.d((Float.floatToRawIntBits(fMax) << 32) | (Float.floatToRawIntBits(height) & 4294967295L)));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            List<ParagraphInfo> listZ2 = gVar.z();
            int size2 = listZ2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ParagraphInfo paragraphInfo2 = listZ2.get(i12);
                paragraphInfo2.getParagraph().y(canvas, C5327j0.a(shaderB), f10, shadow, kVar, gVar2, i10);
                canvas.d(0.0f, paragraphInfo2.getParagraph().getHeight());
                matrix.setTranslate(0.0f, -paragraphInfo2.getParagraph().getHeight());
                shaderB.setLocalMatrix(matrix);
            }
        }
        canvas.i();
    }

    private static final void b(androidx.compose.ui.text.g gVar, Canvas canvas, AbstractC5324i0 abstractC5324i0, float f10, Shadow shadow, F1.k kVar, X0.g gVar2, int i10) {
        List<ParagraphInfo> listZ = gVar.z();
        int size = listZ.size();
        for (int i11 = 0; i11 < size; i11++) {
            ParagraphInfo paragraphInfo = listZ.get(i11);
            paragraphInfo.getParagraph().y(canvas, abstractC5324i0, f10, shadow, kVar, gVar2, i10);
            canvas.d(0.0f, paragraphInfo.getParagraph().getHeight());
        }
    }
}
