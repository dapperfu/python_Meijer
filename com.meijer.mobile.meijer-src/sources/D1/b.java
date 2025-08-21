package D1;

import H1.v;
import H1.x;
import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.emoji2.text.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.C17345j;
import u1.Placeholder;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\"\u001e\u0010\u0015\u001a\u00020\u000b*\u00020\u00108BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\"\u001e\u0010\u001b\u001a\u00020\u000b*\u00020\u00168BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "LH1/d;", "density", "", "d", "(Landroid/text/Spannable;Ljava/util/List;LH1/d;)V", "placeholder", "", "start", "end", "c", "(Landroid/text/Spannable;Lu1/i;IILH1/d;)V", "LH1/v;", "a", "(J)I", "getSpanUnit--R2X_6o$annotations", "(J)V", "spanUnit", "Lu1/j;", "b", "(I)I", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "spanVerticalAlign", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b {
    public static final void d(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, H1.d dVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<Placeholder> range = list.get(i10);
            c(spannable, range.a(), range.getStart(), range.getEnd(), dVar);
        }
    }

    private static final int b(int i10) {
        C17345j.Companion companion = C17345j.INSTANCE;
        if (C17345j.i(i10, companion.a())) {
            return 0;
        }
        if (C17345j.i(i10, companion.g())) {
            return 1;
        }
        if (C17345j.i(i10, companion.b())) {
            return 2;
        }
        if (C17345j.i(i10, companion.c())) {
            return 3;
        }
        if (C17345j.i(i10, companion.f())) {
            return 4;
        }
        if (C17345j.i(i10, companion.d())) {
            return 5;
        }
        if (C17345j.i(i10, companion.e())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    private static final void c(Spannable spannable, Placeholder placeholder, int i10, int i11, H1.d dVar) {
        for (Object obj : spannable.getSpans(i10, i11, j.class)) {
            spannable.removeSpan((j) obj);
        }
        c.w(spannable, new x1.j(v.h(placeholder.getWidth()), a(placeholder.getWidth()), v.h(placeholder.getHeight()), a(placeholder.getHeight()), dVar.getFontScale() * dVar.getDensity(), b(placeholder.getPlaceholderVerticalAlign())), i10, i11);
    }

    private static final int a(long j10) {
        long jG = v.g(j10);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            return 0;
        }
        if (x.g(jG, companion.a())) {
            return 1;
        }
        return 2;
    }
}
