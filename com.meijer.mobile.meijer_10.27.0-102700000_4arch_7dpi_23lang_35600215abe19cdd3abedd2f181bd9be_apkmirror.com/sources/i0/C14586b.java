package i0;

import android.text.Annotation;
import android.text.SpannableString;
import android.text.Spanned;
import androidx.compose.ui.platform.C5881p0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\u0007\u001a\u00020\u0006*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/p0;", "Landroidx/compose/ui/text/AnnotatedString;", "d", "(Landroidx/compose/ui/platform/p0;)Landroidx/compose/ui/text/AnnotatedString;", "e", "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/platform/p0;", "", "c", "(Landroidx/compose/ui/platform/p0;)Z", "", "b", "(Landroidx/compose/ui/text/AnnotatedString;)Ljava/lang/CharSequence;", "a", "(Ljava/lang/CharSequence;)Landroidx/compose/ui/text/AnnotatedString;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14586b {
    public static final AnnotatedString a(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Spanned)) {
            return new AnnotatedString(charSequence.toString(), null, 2, null);
        }
        Spanned spanned = (Spanned) charSequence;
        int i10 = 0;
        Annotation[] annotationArr = (Annotation[]) spanned.getSpans(0, charSequence.length(), Annotation.class);
        ArrayList arrayList = new ArrayList();
        int iM0 = ArraysKt.m0(annotationArr);
        if (iM0 >= 0) {
            while (true) {
                Annotation annotation = annotationArr[i10];
                if (Intrinsics.e(annotation.getKey(), "androidx.compose.text.SpanStyle")) {
                    arrayList.add(new AnnotatedString.Range(new C14587c(annotation.getValue()).k(), spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation)));
                }
                if (i10 == iM0) {
                    break;
                }
                i10++;
            }
        }
        return new AnnotatedString(charSequence.toString(), arrayList, null, 4, null);
    }

    public static final CharSequence b(AnnotatedString annotatedString) {
        if (annotatedString.h().isEmpty()) {
            return annotatedString.getText();
        }
        SpannableString spannableString = new SpannableString(annotatedString.getText());
        C14588d c14588d = new C14588d();
        List<AnnotatedString.Range<SpanStyle>> listH = annotatedString.h();
        int size = listH.size();
        for (int i10 = 0; i10 < size; i10++) {
            AnnotatedString.Range<SpanStyle> range = listH.get(i10);
            SpanStyle spanStyleA = range.a();
            int start = range.getStart();
            int end = range.getEnd();
            c14588d.q();
            c14588d.g(spanStyleA);
            spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", c14588d.p()), start, end, 33);
        }
        return spannableString;
    }

    public static final boolean c(C5881p0 c5881p0) {
        return C14585a.a(c5881p0);
    }

    public static final AnnotatedString d(C5881p0 c5881p0) {
        return C14585a.b(c5881p0);
    }

    public static final C5881p0 e(AnnotatedString annotatedString) {
        return C14585a.c(annotatedString);
    }
}
