package D1;

import android.text.style.TtsSpan;
import androidx.compose.ui.text.A;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/A;", "Landroid/text/style/TtsSpan;", "a", "(Landroidx/compose/ui/text/A;)Landroid/text/style/TtsSpan;", "Landroidx/compose/ui/text/C;", "b", "(Landroidx/compose/ui/text/C;)Landroid/text/style/TtsSpan;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final TtsSpan a(A a10) {
        if (a10 instanceof VerbatimTtsAnnotation) {
            return b((VerbatimTtsAnnotation) a10);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final TtsSpan b(VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return new TtsSpan.VerbatimBuilder(verbatimTtsAnnotation.getVerbatim()).build();
    }
}
