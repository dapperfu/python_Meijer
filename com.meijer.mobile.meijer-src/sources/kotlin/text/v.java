package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.SlidingWindowKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u00002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a\u0019\u0010\u000b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u0019\u0010\r\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\f\u001a\u0019\u0010\u000e\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\f\u001a\u0019\u0010\u000f\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\f\u001a!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0011*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aO\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0019*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0014\u001a\u00020\u00012\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"", "", "index", "", "K1", "(Ljava/lang/CharSequence;I)Ljava/lang/Character;", "L1", "(Ljava/lang/CharSequence;)C", "M1", "", "n", "I1", "(Ljava/lang/String;I)Ljava/lang/String;", "J1", "N1", "O1", "size", "", "H1", "(Ljava/lang/CharSequence;I)Ljava/util/List;", "step", "", "partialWindows", "P1", "(Ljava/lang/CharSequence;IIZ)Ljava/util/List;", "R", "Lkotlin/Function1;", "transform", "Q1", "(Ljava/lang/CharSequence;IIZLkotlin/jvm/functions/Function1;)Ljava/util/List;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension
/* loaded from: classes14.dex */
public class v extends t {
    @SinceKotlin
    public static List<String> H1(CharSequence charSequence, int i10) {
        Intrinsics.j(charSequence, "<this>");
        return P1(charSequence, i10, i10, true);
    }

    public static String I1(String str, int i10) {
        Intrinsics.j(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(RangesKt.k(i10, str.length()));
            Intrinsics.i(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String J1(String str, int i10) {
        Intrinsics.j(str, "<this>");
        if (i10 >= 0) {
            return N1(str, RangesKt.f(str.length() - i10, 0));
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static Character K1(CharSequence charSequence, int i10) {
        Intrinsics.j(charSequence, "<this>");
        if (i10 < 0 || i10 >= charSequence.length()) {
            return null;
        }
        return Character.valueOf(charSequence.charAt(i10));
    }

    public static char L1(CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(StringsKt__StringsKt.k0(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }

    public static char M1(CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        int length = charSequence.length();
        if (length == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (length == 1) {
            return charSequence.charAt(0);
        }
        throw new IllegalArgumentException("Char sequence has more than one element.");
    }

    public static String N1(String str, int i10) {
        Intrinsics.j(str, "<this>");
        if (i10 >= 0) {
            String strSubstring = str.substring(0, RangesKt.k(i10, str.length()));
            Intrinsics.i(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    public static String O1(String str, int i10) {
        Intrinsics.j(str, "<this>");
        if (i10 >= 0) {
            int length = str.length();
            String strSubstring = str.substring(length - RangesKt.k(i10, length));
            Intrinsics.i(strSubstring, "substring(...)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i10 + " is less than zero.").toString());
    }

    @SinceKotlin
    public static final List<String> P1(CharSequence charSequence, int i10, int i11, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        return Q1(charSequence, i10, i11, z10, new Function1() { // from class: kotlin.text.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return v.R1((CharSequence) obj);
            }
        });
    }

    @SinceKotlin
    public static final <R> List<R> Q1(CharSequence charSequence, int i10, int i11, boolean z10, Function1<? super CharSequence, ? extends R> transform) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(transform, "transform");
        SlidingWindowKt.a(i10, i11);
        int length = charSequence.length();
        int i12 = 0;
        ArrayList arrayList = new ArrayList((length / i11) + (length % i11 == 0 ? 0 : 1));
        while (i12 >= 0 && i12 < length) {
            int i13 = i12 + i10;
            if (i13 < 0 || i13 > length) {
                if (!z10) {
                    break;
                }
                i13 = length;
            }
            arrayList.add(transform.invoke(charSequence.subSequence(i12, i13)));
            i12 += i11;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String R1(CharSequence it) {
        Intrinsics.j(it, "it");
        return it.toString();
    }
}
