package C1;

import B1.LocaleList;
import F1.l;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.TextStyle;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC18142l;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.InterfaceC17216h;
import u1.Placeholder;
import u1.PlatformTextStyle;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001aY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\f0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\f0\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u0018\u0010\u001b\u001a\u00020\u0018*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"LF1/l;", "textDirection", "LB1/e;", "localeList", "", "d", "(ILB1/e;)I", "", "text", "Landroidx/compose/ui/text/z;", "style", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "annotations", "Lu1/i;", "placeholders", "LH1/d;", "density", "Ly1/l$b;", "fontFamilyResolver", "Lu1/h;", "a", "(Ljava/lang/String;Landroidx/compose/ui/text/z;Ljava/util/List;Ljava/util/List;LH1/d;Ly1/l$b;)Lu1/h;", "", "c", "(Landroidx/compose/ui/text/z;)Z", "hasEmojiCompat", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class e {
    public static final InterfaceC17216h a(String str, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.a>> list, List<AnnotatedString.Range<Placeholder>> list2, H1.d dVar, AbstractC18142l.b bVar) {
        return new d(str, textStyle, list, list2, bVar, dVar);
    }

    public static final int d(int i10, LocaleList localeList) {
        Locale platformLocale;
        l.Companion companion = F1.l.INSTANCE;
        if (F1.l.j(i10, companion.b())) {
            return 2;
        }
        if (F1.l.j(i10, companion.c())) {
            return 3;
        }
        if (F1.l.j(i10, companion.d())) {
            return 0;
        }
        if (F1.l.j(i10, companion.e())) {
            return 1;
        }
        if (!(F1.l.j(i10, companion.a()) ? true : F1.l.j(i10, companion.f()))) {
            throw new IllegalStateException("Invalid TextDirection.");
        }
        if (localeList == null || (platformLocale = localeList.h(0).getPlatformLocale()) == null) {
            platformLocale = Locale.getDefault();
        }
        int iA = m2.u.a(platformLocale);
        return (iA == 0 || iA != 1) ? 2 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(TextStyle textStyle) {
        androidx.compose.ui.text.e eVarD;
        boolean zG;
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle != null && (paragraphSyle = platformStyle.getParagraphSyle()) != null) {
            eVarD = androidx.compose.ui.text.e.d(paragraphSyle.getEmojiSupportMatch());
        } else {
            eVarD = null;
        }
        int iC = androidx.compose.ui.text.e.INSTANCE.c();
        if (eVarD == null) {
            zG = false;
        } else {
            zG = androidx.compose.ui.text.e.g(eVarD.getValue(), iC);
        }
        return !zG;
    }
}
