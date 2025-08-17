package kotlin.text;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a%\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\t\u0010\u0003\u001a\u001b\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\u0003\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "marginPrefix", "o", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "newIndent", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "n", "(Ljava/lang/String;)Ljava/lang/String;", "l", "indent", "i", "", "h", "(Ljava/lang/String;)I", "Lkotlin/Function1;", "e", "(Ljava/lang/String;)Lkotlin/jvm/functions/Function1;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension
/* loaded from: classes13.dex */
public class i extends e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String f(String line) {
        Intrinsics.j(line, "line");
        return line;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str, String line) {
        Intrinsics.j(line, "line");
        return str + line;
    }

    public static final String i(String str, final String indent) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(indent, "indent");
        return SequencesKt.K(SequencesKt.M(StringsKt__StringsKt.y0(str), new Function1() { // from class: kotlin.text.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.k(indent, (String) obj);
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String j(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "    ";
        }
        return i(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String k(String str, String it) {
        Intrinsics.j(it, "it");
        if (StringsKt__StringsKt.r0(it)) {
            return it.length() < str.length() ? str : it;
        }
        return str + it;
    }

    public static final String l(String str, String newIndent) {
        String strInvoke;
        Intrinsics.j(str, "<this>");
        Intrinsics.j(newIndent, "newIndent");
        List<String> listZ0 = StringsKt__StringsKt.z0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listZ0) {
            if (!StringsKt__StringsKt.r0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Integer.valueOf(h((String) it.next())));
        }
        Integer num = (Integer) CollectionsKt.J0(arrayList2);
        int i10 = 0;
        int iIntValue = num != null ? num.intValue() : 0;
        int length = str.length() + (newIndent.length() * listZ0.size());
        Function1<String, String> function1E = e(newIndent);
        int iO = CollectionsKt.o(listZ0);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : listZ0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            String str2 = (String) obj2;
            if ((i10 == 0 || i10 == iO) && StringsKt__StringsKt.r0(str2)) {
                str2 = null;
            } else {
                String strE1 = u.E1(str2, iIntValue);
                if (strE1 != null && (strInvoke = function1E.invoke(strE1)) != null) {
                    str2 = strInvoke;
                }
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i10 = i11;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.y0(arrayList3, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    public static final String m(String str, String newIndent, String marginPrefix) {
        String str2;
        String strInvoke;
        Intrinsics.j(str, "<this>");
        Intrinsics.j(newIndent, "newIndent");
        Intrinsics.j(marginPrefix, "marginPrefix");
        if (StringsKt__StringsKt.r0(marginPrefix)) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        List<String> listZ0 = StringsKt__StringsKt.z0(str);
        int length = str.length() + (newIndent.length() * listZ0.size());
        Function1<String, String> function1E = e(newIndent);
        int iO = CollectionsKt.o(listZ0);
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (Object obj : listZ0) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.w();
            }
            String str3 = (String) obj;
            String strSubstring = null;
            if ((i10 == 0 || i10 == iO) && StringsKt__StringsKt.r0(str3)) {
                str2 = marginPrefix;
                str3 = null;
            } else {
                int length2 = str3.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!a.c(str3.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 == -1) {
                    str2 = marginPrefix;
                } else {
                    int i13 = i12;
                    str2 = marginPrefix;
                    if (p.V(str3, str2, i13, false, 4, null)) {
                        int length3 = str2.length() + i13;
                        Intrinsics.h(str3, "null cannot be cast to non-null type java.lang.String");
                        strSubstring = str3.substring(length3);
                        Intrinsics.i(strSubstring, "substring(...)");
                    }
                }
                if (strSubstring != null && (strInvoke = function1E.invoke(strSubstring)) != null) {
                    str3 = strInvoke;
                }
            }
            if (str3 != null) {
                arrayList.add(str3);
            }
            i10 = i11;
            marginPrefix = str2;
        }
        return ((StringBuilder) CollectionsKt___CollectionsKt.y0(arrayList, new StringBuilder(length), (124 & 2) != 0 ? ", " : "\n", (124 & 4) != 0 ? "" : null, (124 & 8) == 0 ? null : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : null)).toString();
    }

    @IntrinsicConstEvaluation
    public static String n(String str) {
        Intrinsics.j(str, "<this>");
        return l(str, "");
    }

    @IntrinsicConstEvaluation
    public static final String o(String str, String marginPrefix) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(marginPrefix, "marginPrefix");
        return m(str, "", marginPrefix);
    }

    public static /* synthetic */ String p(String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str2 = "|";
        }
        return o(str, str2);
    }

    private static final Function1<String, String> e(final String str) {
        if (str.length() == 0) {
            return new Function1() { // from class: kotlin.text.g
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.f((String) obj);
                }
            };
        }
        return new Function1() { // from class: kotlin.text.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i.g(str, (String) obj);
            }
        };
    }

    private static final int h(String str) {
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 < length) {
                if (!a.c(str.charAt(i10))) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            return str.length();
        }
        return i10;
    }
}
