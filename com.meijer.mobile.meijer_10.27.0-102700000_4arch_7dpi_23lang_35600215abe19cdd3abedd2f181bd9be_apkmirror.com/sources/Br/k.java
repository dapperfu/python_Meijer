package Br;

import V0.C5349s0;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import kotlin.C18153w;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/text/Spanned;", "Landroidx/compose/ui/text/AnnotatedString;", "a", "(Landroid/text/Spanned;)Landroidx/compose/ui/text/AnnotatedString;", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class k {
    public static final AnnotatedString a(Spanned spanned) {
        Intrinsics.j(spanned, "<this>");
        AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
        bVar.g(spanned.toString());
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        Intrinsics.i(spans, "getSpans(...)");
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    bVar.a(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65531, null), spanStart, spanEnd);
                } else if (style == 2) {
                    bVar.a(new SpanStyle(0L, 0L, null, C18153w.c(C18153w.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65527, null), spanStart, spanEnd);
                } else if (style == 3) {
                    bVar.a(new SpanStyle(0L, 0L, FontWeight.INSTANCE.a(), C18153w.c(C18153w.INSTANCE.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65523, null), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                bVar.a(new SpanStyle(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, F1.k.INSTANCE.d(), null, null, null, 61439, null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                bVar.a(new SpanStyle(C5349s0.b(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null), spanStart, spanEnd);
            }
        }
        return bVar.q();
    }
}
