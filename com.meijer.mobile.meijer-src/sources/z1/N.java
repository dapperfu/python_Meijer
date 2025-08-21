package z1;

import androidx.compose.ui.text.AnnotatedString;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lz1/M;", "", "maxChars", "Landroidx/compose/ui/text/AnnotatedString;", "c", "(Lz1/M;I)Landroidx/compose/ui/text/AnnotatedString;", "b", "a", "(Lz1/M;)Landroidx/compose/ui/text/AnnotatedString;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class N {
    public static final AnnotatedString a(TextFieldValue textFieldValue) {
        return textFieldValue.getText().t(textFieldValue.getSelection());
    }

    public static final AnnotatedString b(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getText().subSequence(androidx.compose.ui.text.y.k(textFieldValue.getSelection()), Math.min(androidx.compose.ui.text.y.k(textFieldValue.getSelection()) + i10, textFieldValue.h().length()));
    }

    public static final AnnotatedString c(TextFieldValue textFieldValue, int i10) {
        return textFieldValue.getText().subSequence(Math.max(0, androidx.compose.ui.text.y.l(textFieldValue.getSelection()) - i10), androidx.compose.ui.text.y.l(textFieldValue.getSelection()));
    }
}
