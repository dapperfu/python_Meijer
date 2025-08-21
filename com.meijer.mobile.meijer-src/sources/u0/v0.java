package u0;

import android.view.inputmethod.ExtractedText;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import z1.TextFieldValue;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz1/M;", "Landroid/view/inputmethod/ExtractedText;", "b", "(Lz1/M;)Landroid/view/inputmethod/ExtractedText;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class v0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ExtractedText b(TextFieldValue textFieldValue) {
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = textFieldValue.h();
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = textFieldValue.h().length();
        extractedText.partialStartOffset = -1;
        extractedText.selectionStart = androidx.compose.ui.text.y.l(textFieldValue.getSelection());
        extractedText.selectionEnd = androidx.compose.ui.text.y.k(textFieldValue.getSelection());
        extractedText.flags = !StringsKt.c0(textFieldValue.h(), '\n', false, 2, null) ? 1 : 0;
        return extractedText;
    }
}
