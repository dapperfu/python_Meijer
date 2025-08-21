package androidx.compose.ui.text;

import V0.C5489q0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.TextLayoutResult;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aj\u0010\u0014\u001a\u00020\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0019\u001a\u00020\u0013*\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a&\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"LX0/f;", "Landroidx/compose/ui/text/w;", "textMeasurer", "", "text", "LU0/f;", "topLeft", "Landroidx/compose/ui/text/z;", "style", "LF1/t;", "overflow", "", "softWrap", "", "maxLines", "LU0/k;", "size", "LV0/c0;", "blendMode", "", "b", "(LX0/f;Landroidx/compose/ui/text/w;Ljava/lang/String;JLandroidx/compose/ui/text/z;IZIJI)V", "LX0/h;", "Lu1/v;", "textLayoutResult", "a", "(LX0/h;Lu1/v;)V", "LH1/b;", "d", "(LX0/f;JJ)J", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class x {
    public static final void b(X0.f fVar, w wVar, String str, long j10, TextStyle textStyle, int i10, boolean z10, int i11, long j11, int i12) {
        TextLayoutResult textLayoutResultD = w.d(wVar, new AnnotatedString(str, null, 2, null), textStyle, i10, z10, i11, null, d(fVar, j11, j10), fVar.getLayoutDirection(), fVar, null, false, 1568, null);
        X0.d drawContext = fVar.getDrawContext();
        long jB = drawContext.b();
        drawContext.g().save();
        try {
            X0.h transform = drawContext.getTransform();
            transform.d(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
            a(transform, textLayoutResultD);
            textLayoutResultD.getMultiParagraph().F(fVar.getDrawContext().g(), (30 & 2) != 0 ? C5489q0.INSTANCE.j() : 0L, (30 & 4) != 0 ? null : null, (30 & 8) != 0 ? null : null, (30 & 16) == 0 ? null : null, (30 & 32) != 0 ? X0.f.INSTANCE.a() : i12);
        } finally {
            drawContext.g().i();
            drawContext.h(jB);
        }
    }

    private static final void a(X0.h hVar, TextLayoutResult textLayoutResult) {
        if (textLayoutResult.i() && !F1.t.g(textLayoutResult.getLayoutInput().getOverflow(), F1.t.INSTANCE.e())) {
            X0.h.i(hVar, 0.0f, 0.0f, (int) (textLayoutResult.getSize() >> 32), (int) (textLayoutResult.getSize() & 4294967295L), 0, 16, null);
        }
    }

    private static final long d(X0.f fVar, long j10, long j11) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4 = 0;
        if (j10 == 9205357640488583168L || Float.isNaN(Float.intBitsToFloat((int) (j10 >> 32)))) {
            iRound = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (fVar.b() >> 32)) - Float.intBitsToFloat((int) (j11 >> 32))));
            iRound2 = 0;
        } else {
            iRound2 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j10 >> 32))));
            iRound = iRound2;
        }
        if (j10 == 9205357640488583168L || Float.isNaN(Float.intBitsToFloat((int) (j10 & 4294967295L)))) {
            iRound3 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - Float.intBitsToFloat((int) (j11 & 4294967295L))));
        } else {
            iRound4 = Math.round((float) Math.ceil(Float.intBitsToFloat((int) (j10 & 4294967295L))));
            iRound3 = iRound4;
        }
        return H1.c.a(iRound2, iRound, iRound4, iRound3);
    }
}
