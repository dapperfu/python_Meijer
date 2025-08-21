package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import i0.C14592e;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import z1.InterfaceC18417E;
import z1.TransformedText;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000f\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lz1/W;", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Lz1/U;", "c", "(Lz1/W;Landroidx/compose/ui/text/AnnotatedString;)Lz1/U;", "", "originalLength", "limit", "", "e", "(Lz1/U;II)V", "originalOffset", "offset", "h", "(III)V", "transformedOffset", "transformedLength", "g", "Lz1/E;", "a", "Lz1/E;", "d", "()Lz1/E;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC18417E f50014a = new v0(InterfaceC18417E.INSTANCE.a(), 0, 0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        C14592e.c("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(int i10, int i11, int i12) {
        boolean z10 = false;
        if (i10 >= 0 && i10 <= i11) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        C14592e.c("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + ']');
    }

    public static final InterfaceC18417E d() {
        return f50014a;
    }

    public static /* synthetic */ void f(TransformedText transformedText, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        e(transformedText, i10, i11);
    }

    public static final TransformedText c(z1.W w10, AnnotatedString annotatedString) {
        TransformedText transformedTextA = w10.a(annotatedString);
        f(transformedTextA, annotatedString.length(), 0, 2, null);
        return new TransformedText(transformedTextA.getText(), new v0(transformedTextA.getOffsetMapping(), annotatedString.length(), transformedTextA.getText().length()));
    }

    public static final void e(TransformedText transformedText, int i10, int i11) {
        int length = transformedText.getText().length();
        int iMin = Math.min(i10, i11);
        for (int i12 = 0; i12 < iMin; i12++) {
            g(transformedText.getOffsetMapping().b(i12), length, i12);
        }
        g(transformedText.getOffsetMapping().b(i10), length, i10);
        int iMin2 = Math.min(length, i11);
        for (int i13 = 0; i13 < iMin2; i13++) {
            h(transformedText.getOffsetMapping().a(i13), i10, i13);
        }
        h(transformedText.getOffsetMapping().a(length), i10, length);
    }
}
