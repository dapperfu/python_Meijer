package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "", "a", "(Landroidx/compose/ui/text/AnnotatedString$d;)Landroidx/compose/ui/text/AnnotatedString$d;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class u {
    public static final AnnotatedString.Range<String> a(AnnotatedString.Range<? extends AnnotatedString.a> range) {
        AnnotatedString.a aVarG = range.g();
        Intrinsics.h(aVarG, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
        return new AnnotatedString.Range<>(((t) aVarG).getValue(), range.h(), range.f(), range.getTag());
    }
}
