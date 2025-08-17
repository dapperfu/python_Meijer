package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.List;
import kotlin.AbstractC18142l;
import kotlin.Metadata;
import u1.InterfaceC17214f;
import u1.InterfaceC17216h;
import u1.Placeholder;

@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ax\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a4\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"", "text", "Landroidx/compose/ui/text/z;", "style", "LH1/b;", "constraints", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/s;", "spanStyles", "Lu1/i;", "placeholders", "", "maxLines", "LF1/t;", "overflow", "Lu1/f;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/z;JLH1/d;Ly1/l$b;Ljava/util/List;Ljava/util/List;II)Lu1/f;", "Lu1/h;", "paragraphIntrinsics", "c", "(Lu1/h;JII)Lu1/f;", "", "d", "(F)I", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class m {
    public static final InterfaceC17214f a(String str, TextStyle textStyle, long j10, H1.d dVar, AbstractC18142l.b bVar, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, int i11) {
        return C1.f.b(str, textStyle, list, list2, i10, i11, j10, dVar, bVar);
    }

    public static final int d(float f10) {
        return (int) Math.ceil(f10);
    }

    public static final InterfaceC17214f c(InterfaceC17216h interfaceC17216h, long j10, int i10, int i11) {
        return C1.f.a(interfaceC17216h, i10, i11, j10);
    }
}
