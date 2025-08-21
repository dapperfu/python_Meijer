package C1;

import F1.LineHeightStyle;
import F1.TextIndent;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.common.api.a;
import java.util.List;
import kotlin.AbstractC18269l;
import kotlin.C18280w;
import kotlin.C18281x;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import u1.Placeholder;
import u1.PlatformTextStyle;

@Metadata(d1 = {"\u0000[\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\b\u0004*\u0001\u001c\u001a\u0089\u0001\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00070\u00062\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00062\u0006\u0010\r\u001a\u00020\f2&\u0010\u0014\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0013\u0010\u001a\u001a\u00020\u0015*\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d¨\u0006\u001f"}, d2 = {"", "text", "", "contextFontSize", "Landroidx/compose/ui/text/z;", "contextTextStyle", "", "Landroidx/compose/ui/text/AnnotatedString$d;", "Landroidx/compose/ui/text/AnnotatedString$a;", "annotations", "Lu1/i;", "placeholders", "LH1/d;", "density", "Lkotlin/Function4;", "Ly1/l;", "Ly1/B;", "Ly1/w;", "Ly1/x;", "Landroid/graphics/Typeface;", "resolveTypeface", "", "useEmojiCompat", "", "a", "(Ljava/lang/String;FLandroidx/compose/ui/text/z;Ljava/util/List;Ljava/util/List;LH1/d;Lkotlin/jvm/functions/Function4;Z)Ljava/lang/CharSequence;", "b", "(Landroidx/compose/ui/text/z;)Z", "C1/c$a", "LC1/c$a;", "NoopSpan", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final a f4014a = new a();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.emoji2.text.f] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r7v14, types: [android.text.Spannable] */
    public static final CharSequence a(String str, float f10, TextStyle textStyle, List<? extends AnnotatedString.Range<? extends AnnotatedString.a>> list, List<AnnotatedString.Range<Placeholder>> list2, H1.d dVar, Function4<? super AbstractC18269l, ? super FontWeight, ? super C18280w, ? super C18281x, ? extends Typeface> function4, boolean z10) {
        String str2;
        CharSequence charSequenceU;
        float f11;
        H1.d dVar2;
        PlatformParagraphStyle paragraphSyle;
        if (z10 && androidx.emoji2.text.f.k()) {
            PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
            androidx.compose.ui.text.e eVarD = (platformStyle == null || (paragraphSyle = platformStyle.getParagraphSyle()) == null) ? null : androidx.compose.ui.text.e.d(paragraphSyle.getEmojiSupportMatch());
            str2 = str;
            charSequenceU = androidx.emoji2.text.f.c().u(str2, 0, str.length(), a.e.API_PRIORITY_OTHER, eVarD == null ? 0 : androidx.compose.ui.text.e.g(eVarD.getValue(), androidx.compose.ui.text.e.INSTANCE.a()));
            Intrinsics.g(charSequenceU);
        } else {
            str2 = str;
            charSequenceU = str2;
        }
        if (list.isEmpty() && list2.isEmpty() && Intrinsics.e(textStyle.D(), TextIndent.INSTANCE.a()) && H1.v.f(textStyle.s()) == 0) {
            return charSequenceU;
        }
        SpannableString spannableString = charSequenceU instanceof Spannable ? (Spannable) charSequenceU : new SpannableString(charSequenceU);
        if (Intrinsics.e(textStyle.A(), F1.k.INSTANCE.d())) {
            D1.c.w(spannableString, f4014a, 0, str2.length());
        }
        if (b(textStyle) && textStyle.t() == null) {
            D1.c.t(spannableString, textStyle.s(), f10, dVar);
            f11 = f10;
            dVar2 = dVar;
        } else {
            LineHeightStyle lineHeightStyleT = textStyle.t();
            if (lineHeightStyleT == null) {
                lineHeightStyleT = LineHeightStyle.INSTANCE.a();
            }
            f11 = f10;
            dVar2 = dVar;
            D1.c.s(spannableString, textStyle.s(), f11, dVar2, lineHeightStyleT);
        }
        D1.c.A(spannableString, textStyle.D(), f11, dVar2);
        D1.c.y(spannableString, textStyle, list, dVar2, function4);
        D1.c.l(spannableString, list, f11, dVar2, textStyle.D());
        D1.b.d(spannableString, list2, dVar2);
        return spannableString;
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"C1/c$a", "Landroid/text/style/CharacterStyle;", "Landroid/text/TextPaint;", "p0", "", "updateDrawState", "(Landroid/text/TextPaint;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends CharacterStyle {
        @Override // android.text.style.CharacterStyle
        public void updateDrawState(TextPaint p02) {
        }

        a() {
        }
    }

    public static final boolean b(TextStyle textStyle) {
        PlatformParagraphStyle paragraphSyle;
        PlatformTextStyle platformStyle = textStyle.getPlatformStyle();
        if (platformStyle != null && (paragraphSyle = platformStyle.getParagraphSyle()) != null) {
            return paragraphSyle.getIncludeFontPadding();
        }
        return false;
    }
}
