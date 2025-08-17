package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.AbstractC18142l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.Placeholder;

@Metadata(d1 = {"\u0000H\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001av\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u0014H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"", "", "a", "(F)I", "Landroidx/compose/foundation/text/N;", "current", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/z;", "style", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "", "softWrap", "LF1/t;", "overflow", "maxLines", "minLines", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Lu1/i;", "placeholders", "b", "(Landroidx/compose/foundation/text/N;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/text/z;LH1/d;Ly1/l$b;ZIIILjava/util/List;)Landroidx/compose/foundation/text/N;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class O {
    public static final int a(float f10) {
        return Math.round((float) Math.ceil(f10));
    }

    public static /* synthetic */ N c(N n10, AnnotatedString annotatedString, TextStyle textStyle, H1.d dVar, AbstractC18142l.b bVar, boolean z10, int i10, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 32) != 0) {
            z10 = true;
        }
        if ((i13 & 64) != 0) {
            i10 = F1.t.INSTANCE.a();
        }
        if ((i13 & 128) != 0) {
            i11 = a.e.API_PRIORITY_OTHER;
        }
        if ((i13 & 256) != 0) {
            i12 = 1;
        }
        return b(n10, annotatedString, textStyle, dVar, bVar, z10, i10, i11, i12, list);
    }

    public static final N b(N n10, AnnotatedString annotatedString, TextStyle textStyle, H1.d dVar, AbstractC18142l.b bVar, boolean z10, int i10, int i11, int i12, List<AnnotatedString.Range<Placeholder>> list) {
        AbstractC18142l.b bVar2;
        boolean z11;
        int i13;
        int i14;
        int i15;
        List<AnnotatedString.Range<Placeholder>> list2;
        if (Intrinsics.e(n10.getText(), annotatedString) && Intrinsics.e(n10.getStyle(), textStyle)) {
            z11 = z10;
            if (n10.getSoftWrap() == z11) {
                i13 = i10;
                if (F1.t.g(n10.getOverflow(), i13)) {
                    i14 = i11;
                    if (n10.getMaxLines() == i14) {
                        i15 = i12;
                        if (n10.getMinLines() == i15 && Intrinsics.e(n10.getDensity(), dVar)) {
                            list2 = list;
                            if (Intrinsics.e(n10.h(), list2)) {
                                bVar2 = bVar;
                                if (n10.getFontFamilyResolver() == bVar2) {
                                    return n10;
                                }
                            } else {
                                bVar2 = bVar;
                            }
                            return new N(annotatedString, textStyle, i14, i15, z11, i13, dVar, bVar2, list2, null);
                        }
                        bVar2 = bVar;
                        list2 = list;
                        return new N(annotatedString, textStyle, i14, i15, z11, i13, dVar, bVar2, list2, null);
                    }
                    bVar2 = bVar;
                    i15 = i12;
                    list2 = list;
                    return new N(annotatedString, textStyle, i14, i15, z11, i13, dVar, bVar2, list2, null);
                }
                bVar2 = bVar;
                i14 = i11;
                i15 = i12;
                list2 = list;
                return new N(annotatedString, textStyle, i14, i15, z11, i13, dVar, bVar2, list2, null);
            }
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            z11 = z10;
        }
        i13 = i10;
        i14 = i11;
        i15 = i12;
        list2 = list;
        return new N(annotatedString, textStyle, i14, i15, z11, i13, dVar, bVar2, list2, null);
    }
}
