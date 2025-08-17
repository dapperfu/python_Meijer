package Fk;

import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0006*\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0015\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014¨\u0006\u001a"}, d2 = {"LFk/g;", "", "<init>", "()V", "", "value", "", "b", "(D)Ljava/lang/String;", "c", "d", "typeAheadText", "searchText", "", "e", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/CharSequence;", "f", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "Ljava/text/NumberFormat;", "dollarFormatter", "dollarWithNegativeFormatter", "dollarWithNegativeFormatterLeadingZero", "groupedNumberFormatter", "gasPriceNumberFormatter", "util_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f10897a = new g();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final NumberFormat dollarFormatter = NumberFormat.getCurrencyInstance(Locale.US);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final NumberFormat dollarWithNegativeFormatter = new DecimalFormat("$#,###.00");

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final NumberFormat dollarWithNegativeFormatterLeadingZero = new DecimalFormat("$#,##0.00");

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final NumberFormat groupedNumberFormatter = new DecimalFormat("#,###,###");

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final NumberFormat gasPriceNumberFormatter = new DecimalFormat("$#,##0.000");

    @JvmStatic
    public static final String b(double value) {
        String str = dollarWithNegativeFormatter.format(value);
        Intrinsics.i(str, "format(...)");
        return str;
    }

    @JvmStatic
    public static final String c(double value) {
        String str = dollarWithNegativeFormatterLeadingZero.format(value);
        Intrinsics.i(str, "format(...)");
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(String text) {
        Intrinsics.j(text, "text");
        String strSubstring = text.substring(0, 1);
        Intrinsics.i(strSubstring, "substring(...)");
        Locale ROOT = Locale.ROOT;
        Intrinsics.i(ROOT, "ROOT");
        String upperCase = strSubstring.toUpperCase(ROOT);
        Intrinsics.i(upperCase, "toUpperCase(...)");
        String strSubstring2 = text.substring(1);
        Intrinsics.i(strSubstring2, "substring(...)");
        Intrinsics.i(ROOT, "ROOT");
        String lowerCase = strSubstring2.toLowerCase(ROOT);
        Intrinsics.i(lowerCase, "toLowerCase(...)");
        return CollectionsKt.B0(CollectionsKt.p(upperCase, lowerCase), "", null, null, 0, null, null, 62, null);
    }

    public final String d(double value) {
        String str = gasPriceNumberFormatter.format(value);
        Intrinsics.i(str, "format(...)");
        return str;
    }

    public final CharSequence e(String typeAheadText, String searchText) {
        Intrinsics.j(typeAheadText, "typeAheadText");
        Intrinsics.j(searchText, "searchText");
        SpannableString spannableString = new SpannableString(typeAheadText);
        TypefaceSpan typefaceSpan = new TypefaceSpan("source-sans-pro-bold");
        int iP0 = StringsKt.p0(typeAheadText, searchText, 0, false, 6, null);
        if (iP0 >= 0 && !StringsKt.r0(typeAheadText) && !StringsKt.r0(searchText) && typeAheadText.length() >= searchText.length()) {
            spannableString.setSpan(typefaceSpan, 0, typeAheadText.length(), 18);
            spannableString.setSpan(new StyleSpan(1), iP0, searchText.length() + iP0, 18);
        }
        return spannableString;
    }

    public final String f(String str) {
        Intrinsics.j(str, "<this>");
        return CollectionsKt.B0(StringsKt.a1(str, new String[]{" "}, false, 0, 6, null), " ", null, null, 0, null, new Function1() { // from class: Fk.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g.g((String) obj);
            }
        }, 30, null);
    }

    private g() {
    }
}
