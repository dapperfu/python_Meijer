package androidx.compose.ui.platform;

import android.text.Annotation;
import android.text.SpannableString;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003*\n\u0010\u0005\"\u00020\u00042\u00020\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/AnnotatedString;", "", "a", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/CharSequence;", "Landroid/content/ClipboardManager;", "NativeClipboard", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.platform.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5868l {
    public static final CharSequence a(AnnotatedString annotatedString) {
        if (annotatedString.h().isEmpty()) {
            return annotatedString.getText();
        }
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        A0 a02 = new A0();
        List<AnnotatedString.Range<SpanStyle>> listH = annotatedString.h();
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<SpanStyle> range = listH.get(i10);
            SpanStyle sVarA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            a02.q();
            a02.g(sVarA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", a02.p()), start, end, 33);
        }
        return spannableString;
    }
}
