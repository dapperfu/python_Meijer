package aw;

import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kw.C15328e;
import kw.C15331h;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001aR\u001a\u0010\u001f\u001a\u00020\u00048\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010$\u001a\u00020 8\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010'\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Law/d;", "", "<init>", "()V", "", "string", "", "pos", "limit", "Lkw/e;", "result", "", "f", "(Ljava/lang/String;IILkw/e;)Z", "d", "delta", "numpoints", "first", "a", "(IIZ)I", "h", "(Ljava/lang/String;II)Z", "", "b", "(Ljava/lang/String;II)Ljava/util/List;", "e", "(Ljava/lang/String;)Ljava/lang/String;", "c", "Ljava/lang/String;", "getPREFIX_STRING", "()Ljava/lang/String;", "PREFIX_STRING", "Lkw/h;", "Lkw/h;", "getPREFIX", "()Lkw/h;", "PREFIX", "g", "(I)I", "punycodeDigit", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f59504a = new d();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final String PREFIX_STRING = "xn--";

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final C15331h PREFIX = C15331h.INSTANCE.d("xn--");

    private final int a(int delta, int numpoints, boolean first) {
        int i10 = first ? delta / 700 : delta / 2;
        int i11 = i10 + (i10 / numpoints);
        int i12 = 0;
        while (i11 > 455) {
            i11 /= 35;
            i12 += 36;
        }
        return i12 + ((i11 * 36) / (i11 + 38));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [char] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    private final List<Integer> b(String str, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        while (i10 < i11) {
            int iCharAt = str.charAt(i10);
            if (CharsKt.h(iCharAt)) {
                int i12 = i10 + 1;
                char cCharAt = i12 < i11 ? str.charAt(i12) : (char) 0;
                if (Character.isLowSurrogate(iCharAt) || !Character.isLowSurrogate(cCharAt)) {
                    iCharAt = 63;
                } else {
                    iCharAt = 65536 + (((iCharAt & 1023) << 10) | (cCharAt & 1023));
                    i10 = i12;
                }
            }
            arrayList.add(Integer.valueOf(iCharAt));
            i10++;
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean d(String string, int pos, int limit, C15328e result) {
        int i10;
        int i11;
        int i12 = 1;
        if (!StringsKt.K(string, pos, PREFIX_STRING, 0, 4, true)) {
            result.Q0(string, pos, limit);
            return true;
        }
        int i13 = pos + 4;
        ArrayList arrayList = new ArrayList();
        int iV0 = StringsKt.v0(string, '-', limit, false, 4, null);
        char c10 = '0';
        char c11 = '[';
        char c12 = '{';
        boolean z10 = false;
        if (iV0 >= i13) {
            while (i13 < iV0) {
                int i14 = i13 + 1;
                char cCharAt = string.charAt(i13);
                if (('a' > cCharAt || cCharAt >= '{') && (('A' > cCharAt || cCharAt >= '[') && (('0' > cCharAt || cCharAt >= ':') && cCharAt != '-'))) {
                    return false;
                }
                arrayList.add(Integer.valueOf(cCharAt));
                i13 = i14;
            }
            i13++;
        }
        int i15 = 128;
        int iA = 72;
        int i16 = 0;
        while (i13 < limit) {
            int i17 = i12;
            boolean z11 = z10;
            IntProgression intProgressionW = RangesKt.w(RangesKt.x(36, a.e.API_PRIORITY_OTHER), 36);
            int first = intProgressionW.getFirst();
            int last = intProgressionW.getLast();
            int step = intProgressionW.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                i10 = i16;
                int i18 = i17;
                while (i13 != limit) {
                    int i19 = i13 + 1;
                    char cCharAt2 = string.charAt(i13);
                    if ('a' <= cCharAt2 && cCharAt2 < c12) {
                        i11 = cCharAt2 - 'a';
                    } else if ('A' <= cCharAt2 && cCharAt2 < c11) {
                        i11 = cCharAt2 - 'A';
                    } else {
                        if (c10 > cCharAt2 || cCharAt2 >= ':') {
                            return z11;
                        }
                        i11 = cCharAt2 - 22;
                    }
                    int i20 = i18;
                    int i21 = i11 * i20;
                    int i22 = i10;
                    if (i22 > a.e.API_PRIORITY_OTHER - i21) {
                        return z11;
                    }
                    i10 = i22 + i21;
                    int i23 = first <= iA ? i17 : first >= iA + 26 ? 26 : first - iA;
                    if (i11 >= i23) {
                        int i24 = 36 - i23;
                        if (i20 > a.e.API_PRIORITY_OTHER / i24) {
                            return z11;
                        }
                        i18 = i20 * i24;
                        if (first != last) {
                            first += step;
                            i13 = i19;
                            c10 = '0';
                            c11 = '[';
                            c12 = '{';
                        }
                    }
                    i13 = i19;
                }
                return z11;
            }
            i10 = i16;
            iA = a(i10 - i16, arrayList.size() + 1, i16 == 0 ? i17 : z11);
            int size = i10 / (arrayList.size() + 1);
            if (i15 > a.e.API_PRIORITY_OTHER - size) {
                return z11;
            }
            i15 += size;
            int size2 = i10 % (arrayList.size() + 1);
            if (i15 > 1114111) {
                return z11;
            }
            arrayList.add(size2, Integer.valueOf(i15));
            i16 = size2 + 1;
            z10 = z11;
            i12 = i17;
            c10 = '0';
            c11 = '[';
            c12 = '{';
        }
        boolean z12 = i12;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            result.a0(((Number) it.next()).intValue());
        }
        return z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean f(String string, int pos, int limit, C15328e result) {
        int i10;
        int i11;
        int i12;
        int i13 = 1;
        if (!h(string, pos, limit)) {
            result.Q0(string, pos, limit);
            return true;
        }
        result.Z2(PREFIX);
        List<Integer> listB = b(string, pos, limit);
        Iterator<Integer> it = listB.iterator();
        int i14 = 0;
        while (true) {
            i10 = 128;
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = it.next().intValue();
            if (iIntValue < 128) {
                result.writeByte(iIntValue);
                i14++;
            }
        }
        if (i14 > 0) {
            result.writeByte(45);
        }
        int iA = 72;
        int i15 = 0;
        int i16 = i14;
        while (i16 < listB.size()) {
            Iterator<T> it2 = listB.iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIntValue2 = ((Number) next).intValue();
                if (iIntValue2 < i10) {
                    iIntValue2 = Integer.MAX_VALUE;
                }
                do {
                    Object next2 = it2.next();
                    int iIntValue3 = ((Number) next2).intValue();
                    if (iIntValue3 < i10) {
                        iIntValue3 = Integer.MAX_VALUE;
                    }
                    if (iIntValue2 > iIntValue3) {
                        next = next2;
                        iIntValue2 = iIntValue3;
                    }
                } while (it2.hasNext());
            }
            int iIntValue4 = ((Number) next).intValue();
            int i17 = (iIntValue4 - i10) * (i16 + 1);
            if (i15 > a.e.API_PRIORITY_OTHER - i17) {
                return false;
            }
            int i18 = i15 + i17;
            Iterator<Integer> it3 = listB.iterator();
            while (it3.hasNext()) {
                int iIntValue5 = it3.next().intValue();
                if (iIntValue5 < iIntValue4) {
                    if (i18 == Integer.MAX_VALUE) {
                        return false;
                    }
                    i18++;
                } else if (iIntValue5 == iIntValue4) {
                    IntProgression intProgressionW = RangesKt.w(RangesKt.x(36, a.e.API_PRIORITY_OTHER), 36);
                    int first = intProgressionW.getFirst();
                    int last = intProgressionW.getLast();
                    int step = intProgressionW.getStep();
                    if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                        i12 = i18;
                        while (true) {
                            if (first <= iA) {
                                i11 = i13;
                            } else {
                                i11 = i13;
                                i13 = first >= iA + 26 ? 26 : first - iA;
                            }
                            if (i12 < i13) {
                                break;
                            }
                            int i19 = i12 - i13;
                            int i20 = 36 - i13;
                            result.writeByte(g(i13 + (i19 % i20)));
                            i12 = i19 / i20;
                            if (first == last) {
                                break;
                            }
                            first += step;
                            i13 = i11;
                        }
                    } else {
                        i11 = i13;
                        i12 = i18;
                    }
                    result.writeByte(g(i12));
                    int i21 = i16 + 1;
                    iA = a(i18, i21, i16 == i14 ? i11 : false);
                    i16 = i21;
                    i18 = 0;
                    i13 = i11;
                }
            }
            i15 = i18 + 1;
            i10 = iIntValue4 + 1;
        }
        return i13;
    }

    private final int g(int i10) {
        if (i10 < 26) {
            return i10 + 97;
        }
        if (i10 < 36) {
            return i10 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i10).toString());
    }

    private final boolean h(String str, int i10, int i11) {
        while (i10 < i11) {
            if (str.charAt(i10) >= 128) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final String c(String string) {
        Intrinsics.j(string, "string");
        int length = string.length();
        C15328e c15328e = new C15328e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iO0 = StringsKt.o0(str, '.', i10, false, 4, null);
            if (iO0 == -1) {
                iO0 = length;
            }
            if (!d(str, i10, iO0, c15328e)) {
                return null;
            }
            if (iO0 >= length) {
                break;
            }
            c15328e.writeByte(46);
            i10 = iO0 + 1;
            string = str;
        }
        return c15328e.n3();
    }

    public final String e(String string) {
        Intrinsics.j(string, "string");
        int length = string.length();
        C15328e c15328e = new C15328e();
        int i10 = 0;
        while (i10 < length) {
            String str = string;
            int iO0 = StringsKt.o0(str, '.', i10, false, 4, null);
            if (iO0 == -1) {
                iO0 = length;
            }
            if (!f(str, i10, iO0, c15328e)) {
                return null;
            }
            if (iO0 >= length) {
                break;
            }
            c15328e.writeByte(46);
            i10 = iO0 + 1;
            string = str;
        }
        return c15328e.n3();
    }

    private d() {
    }
}
