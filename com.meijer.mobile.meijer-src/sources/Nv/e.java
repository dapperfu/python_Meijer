package Nv;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.Headers;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\f0\u000b*\u00020\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0013\u0010\u0019\u001a\u00020\u0003*\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001d\u001a\u0004\u0018\u00010\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a#\u0010 \u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$\u001a#\u0010%\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b%\u0010!\u001a\u001b\u0010&\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b&\u0010'\u001a#\u0010(\u001a\u00020\u000f*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010!\u001a\u001d\u0010)\u001a\u0004\u0018\u00010\u0003*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b)\u0010*\u001a\u0013\u0010+\u001a\u00020\u0000*\u00020\u000fH\u0000¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010.\u001a\u00020-2\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b.\u0010/\u001a\u001f\u00100\u001a\u00020-2\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H\u0000¢\u0006\u0004\b0\u00101\u001a\u0013\u00103\u001a\u00020\u0003*\u000202H\u0002¢\u0006\u0004\b3\u00104\u001a#\u00106\u001a\u00020\u00002\u0012\u00105\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b\"\u00020\u0003H\u0000¢\u0006\u0004\b6\u00107\u001a\u001f\u00109\u001a\u00020\u0000*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000308H\u0000¢\u0006\u0004\b9\u0010:¨\u0006;"}, d2 = {"Lokhttp3/Headers;", "", "index", "", "l", "(Lokhttp3/Headers;I)Ljava/lang/String;", "r", "name", "", "s", "(Lokhttp3/Headers;Ljava/lang/String;)Ljava/util/List;", "", "Lkotlin/Pair;", "k", "(Lokhttp3/Headers;)Ljava/util/Iterator;", "Lokhttp3/Headers$a;", "m", "(Lokhttp3/Headers;)Lokhttp3/Headers$a;", "", "other", "", "f", "(Lokhttp3/Headers;Ljava/lang/Object;)Z", "h", "(Lokhttp3/Headers;)I", "q", "(Lokhttp3/Headers;)Ljava/lang/String;", "", "namesAndValues", "i", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "value", "b", "(Lokhttp3/Headers$a;Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Headers$a;", "headers", "c", "(Lokhttp3/Headers$a;Lokhttp3/Headers;)Lokhttp3/Headers$a;", "d", "n", "(Lokhttp3/Headers$a;Ljava/lang/String;)Lokhttp3/Headers$a;", "o", "g", "(Lokhttp3/Headers$a;Ljava/lang/String;)Ljava/lang/String;", "e", "(Lokhttp3/Headers$a;)Lokhttp3/Headers;", "", "t", "(Ljava/lang/String;)V", "u", "(Ljava/lang/String;Ljava/lang/String;)V", "", "a", "(C)Ljava/lang/String;", "inputNamesAndValues", "j", "([Ljava/lang/String;)Lokhttp3/Headers;", "", "p", "(Ljava/util/Map;)Lokhttp3/Headers;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class e {
    private static final String a(char c10) {
        String string = Integer.toString(c10, CharsKt.a(16));
        Intrinsics.i(string, "toString(...)");
        if (string.length() >= 2) {
            return string;
        }
        return '0' + string;
    }

    public static final Headers.a b(Headers.a aVar, String name, String value) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        t(name);
        u(value, name);
        d(aVar, name, value);
        return aVar;
    }

    public static final Headers.a c(Headers.a aVar, Headers headers) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(headers, "headers");
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            d(aVar, headers.h(i10), headers.p(i10));
        }
        return aVar;
    }

    public static final Headers.a d(Headers.a aVar, String name, String value) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        aVar.h().add(name);
        aVar.h().add(StringsKt.C1(value).toString());
        return aVar;
    }

    public static final Headers e(Headers.a aVar) {
        Intrinsics.j(aVar, "<this>");
        return new Headers((String[]) aVar.h().toArray(new String[0]));
    }

    public static final boolean f(Headers headers, Object obj) {
        Intrinsics.j(headers, "<this>");
        return (obj instanceof Headers) && Arrays.equals(headers.getNamesAndValues(), ((Headers) obj).getNamesAndValues());
    }

    public static final String g(Headers.a aVar, String name) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(name, "name");
        int size = aVar.h().size() - 2;
        int iC = ProgressionUtilKt.c(size, 0, -2);
        if (iC > size) {
            return null;
        }
        while (!StringsKt.H(name, aVar.h().get(size), true)) {
            if (size == iC) {
                return null;
            }
            size -= 2;
        }
        return aVar.h().get(size + 1);
    }

    public static final int h(Headers headers) {
        Intrinsics.j(headers, "<this>");
        return Arrays.hashCode(headers.getNamesAndValues());
    }

    public static final String i(String[] namesAndValues, String name) {
        Intrinsics.j(namesAndValues, "namesAndValues");
        Intrinsics.j(name, "name");
        int length = namesAndValues.length - 2;
        int iC = ProgressionUtilKt.c(length, 0, -2);
        if (iC > length) {
            return null;
        }
        while (!StringsKt.H(name, namesAndValues[length], true)) {
            if (length == iC) {
                return null;
            }
            length -= 2;
        }
        return namesAndValues[length + 1];
    }

    public static final Headers j(String... inputNamesAndValues) {
        Intrinsics.j(inputNamesAndValues, "inputNamesAndValues");
        if (inputNamesAndValues.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr = (String[]) Arrays.copyOf(inputNamesAndValues, inputNamesAndValues.length);
        int length = strArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (strArr[i11] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i11] = StringsKt.C1(inputNamesAndValues[i11]).toString();
        }
        int iC = ProgressionUtilKt.c(0, strArr.length - 1, 2);
        if (iC >= 0) {
            while (true) {
                String str = strArr[i10];
                String str2 = strArr[i10 + 1];
                t(str);
                u(str2, str);
                if (i10 == iC) {
                    break;
                }
                i10 += 2;
            }
        }
        return new Headers(strArr);
    }

    public static final Iterator<Pair<String, String>> k(Headers headers) {
        Intrinsics.j(headers, "<this>");
        int size = headers.size();
        Pair[] pairArr = new Pair[size];
        for (int i10 = 0; i10 < size; i10++) {
            pairArr[i10] = TuplesKt.a(headers.h(i10), headers.p(i10));
        }
        return ArrayIteratorKt.a(pairArr);
    }

    public static final String l(Headers headers, int i10) {
        Intrinsics.j(headers, "<this>");
        String str = (String) ArraysKt.o0(headers.getNamesAndValues(), i10 * 2);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i10 + ']');
    }

    public static final Headers.a m(Headers headers) {
        Intrinsics.j(headers, "<this>");
        Headers.a aVar = new Headers.a();
        CollectionsKt.D(aVar.h(), headers.getNamesAndValues());
        return aVar;
    }

    public static final Headers.a n(Headers.a aVar, String name) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(name, "name");
        int i10 = 0;
        while (i10 < aVar.h().size()) {
            if (StringsKt.H(name, aVar.h().get(i10), true)) {
                aVar.h().remove(i10);
                aVar.h().remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
        return aVar;
    }

    public static final Headers.a o(Headers.a aVar, String name, String value) {
        Intrinsics.j(aVar, "<this>");
        Intrinsics.j(name, "name");
        Intrinsics.j(value, "value");
        t(name);
        u(value, name);
        aVar.i(name);
        d(aVar, name, value);
        return aVar;
    }

    public static final Headers p(Map<String, String> map) {
        Intrinsics.j(map, "<this>");
        String[] strArr = new String[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            String string = StringsKt.C1(key).toString();
            String string2 = StringsKt.C1(value).toString();
            t(string);
            u(string2, string);
            strArr[i10] = string;
            strArr[i10 + 1] = string2;
            i10 += 2;
        }
        return new Headers(strArr);
    }

    public static final String q(Headers headers) {
        Intrinsics.j(headers, "<this>");
        StringBuilder sb2 = new StringBuilder();
        int size = headers.size();
        for (int i10 = 0; i10 < size; i10++) {
            String strH = headers.h(i10);
            String strP = headers.p(i10);
            sb2.append(strH);
            sb2.append(": ");
            if (h.y(strH)) {
                strP = "██";
            }
            sb2.append(strP);
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public static final String r(Headers headers, int i10) {
        Intrinsics.j(headers, "<this>");
        String str = (String) ArraysKt.o0(headers.getNamesAndValues(), (i10 * 2) + 1);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i10 + ']');
    }

    public static final List<String> s(Headers headers, String name) {
        Intrinsics.j(headers, "<this>");
        Intrinsics.j(name, "name");
        int size = headers.size();
        List<String> listUnmodifiableList = null;
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            if (StringsKt.H(name, headers.h(i10), true)) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(headers.p(i10));
            }
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            Intrinsics.i(listUnmodifiableList, "unmodifiableList(...)");
        }
        return listUnmodifiableList == null ? CollectionsKt.m() : listUnmodifiableList;
    }

    public static final void t(String name) {
        Intrinsics.j(name, "name");
        if (name.length() <= 0) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = name.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = name.charAt(i10);
            if ('!' > cCharAt || cCharAt >= 127) {
                throw new IllegalArgumentException(("Unexpected char 0x" + a(cCharAt) + " at " + i10 + " in header name: " + name).toString());
            }
        }
    }

    public static final void u(String value, String name) {
        Intrinsics.j(value, "value");
        Intrinsics.j(name, "name");
        int length = value.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = value.charAt(i10);
            if (cCharAt != '\t' && (' ' > cCharAt || cCharAt >= 127)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unexpected char 0x");
                sb2.append(a(cCharAt));
                sb2.append(" at ");
                sb2.append(i10);
                sb2.append(" in ");
                sb2.append(name);
                sb2.append(" value");
                sb2.append(h.y(name) ? "" : ": " + value);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }
}
