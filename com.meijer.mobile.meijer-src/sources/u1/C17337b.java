package u1;

import androidx.compose.ui.text.PlatformParagraphStyle;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\r\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu1/k;", "spanStyle", "Landroidx/compose/ui/text/p;", "paragraphStyle", "Lu1/m;", "a", "(Lu1/k;Landroidx/compose/ui/text/p;)Lu1/m;", "start", "stop", "", "fraction", "b", "(Landroidx/compose/ui/text/p;Landroidx/compose/ui/text/p;F)Landroidx/compose/ui/text/p;", "c", "(Lu1/k;Lu1/k;F)Lu1/k;", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17337b {
    public static final k c(k kVar, k kVar2, float f10) {
        return kVar;
    }

    public static final PlatformTextStyle a(k kVar, PlatformParagraphStyle platformParagraphStyle) {
        return new PlatformTextStyle(kVar, platformParagraphStyle);
    }

    public static final PlatformParagraphStyle b(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f10) {
        if (platformParagraphStyle.getIncludeFontPadding() == platformParagraphStyle2.getIncludeFontPadding()) {
            return platformParagraphStyle;
        }
        return new PlatformParagraphStyle(((androidx.compose.ui.text.e) n.d(androidx.compose.ui.text.e.d(platformParagraphStyle.getEmojiSupportMatch()), androidx.compose.ui.text.e.d(platformParagraphStyle2.getEmojiSupportMatch()), f10)).getValue(), ((Boolean) n.d(Boolean.valueOf(platformParagraphStyle.getIncludeFontPadding()), Boolean.valueOf(platformParagraphStyle2.getIncludeFontPadding()), f10)).booleanValue(), null);
    }
}
