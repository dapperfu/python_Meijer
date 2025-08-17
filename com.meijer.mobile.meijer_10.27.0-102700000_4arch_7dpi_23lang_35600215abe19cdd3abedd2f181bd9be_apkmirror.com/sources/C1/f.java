package C1;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.C5912a;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import kotlin.AbstractC18142l;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import u1.InterfaceC17214f;
import u1.InterfaceC17216h;
import u1.Placeholder;

@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001at\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a2\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"", "text", "Landroidx/compose/ui/text/z;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "annotations", "Lu1/i;", "placeholders", "", "maxLines", "LF1/t;", "overflow", "LH1/b;", "constraints", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "Lu1/f;", "b", "(Ljava/lang/String;Landroidx/compose/ui/text/z;Ljava/util/List;Ljava/util/List;IIJLH1/d;Ly1/l$b;)Lu1/f;", "Lu1/h;", "paragraphIntrinsics", "a", "(Lu1/h;IIJ)Lu1/f;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName
/* loaded from: classes.dex */
public final class f {
    public static final InterfaceC17214f a(InterfaceC17216h interfaceC17216h, int i10, int i11, long j10) {
        Intrinsics.h(interfaceC17216h, "null cannot be cast to non-null type androidx.compose.ui.text.platform.AndroidParagraphIntrinsics");
        return new C5912a((d) interfaceC17216h, i10, i11, j10, null);
    }

    public static final InterfaceC17214f b(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.a>> list, List<AnnotatedString.Range<Placeholder>> list2, int i10, int i11, long j10, H1.d dVar, AbstractC18142l.b bVar) {
        return new C5912a(new d(str, textStyle, list, list2, bVar, dVar), i10, i11, j10, null);
    }
}
