package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CharIterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000f\n\u0002\u0010\u000e\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0015\u001a\u001d\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\n\u0010\u0003\u001a\u00020\u0001\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0011\u0010\t\u001a\u00020\b*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a#\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0013\u001a\u00020\u0012*\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0014\u0010\u0016\u001a\u00020\u0015*\u00020\bH\u0086\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010\u001c\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001d\u001a#\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b \u0010!\u001a#\u0010\"\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#\u001a#\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b$\u0010!\u001a#\u0010%\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b%\u0010#\u001a#\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b&\u0010!\u001a#\u0010'\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b'\u0010#\u001a#\u0010(\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b(\u0010!\u001a#\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b)\u0010#\u001a)\u0010-\u001a\u00020\b*\u00020\b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b-\u0010.\u001a!\u0010/\u001a\u00020\b*\u00020\b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b¢\u0006\u0004\b/\u00100\u001a\u0019\u00102\u001a\u00020\u0000*\u00020\u00002\u0006\u00101\u001a\u00020\b¢\u0006\u0004\b2\u00103\u001a\u0019\u00105\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b5\u00103\u001a!\u00106\u001a\u00020\u0000*\u00020\u00002\u0006\u00101\u001a\u00020\b2\u0006\u00104\u001a\u00020\b¢\u0006\u0004\b6\u00107\u001a\u0019\u00108\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b8\u00103\u001a+\u00109\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b9\u0010:\u001a+\u0010;\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b;\u0010:\u001a+\u0010<\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u0000¢\u0006\u0004\b<\u0010:\u001a;\u0010A\u001a\u00020\u0012*\u00020\b2\u0006\u0010=\u001a\u00020\u000b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u0012H\u0000¢\u0006\u0004\bA\u0010B\u001a#\u0010D\u001a\u00020\u0012*\u00020\b2\u0006\u0010C\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bD\u0010E\u001a#\u0010F\u001a\u00020\u0012*\u00020\b2\u0006\u0010C\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bF\u0010E\u001a#\u0010G\u001a\u00020\u0012*\u00020\b2\u0006\u00101\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bG\u0010H\u001a#\u0010I\u001a\u00020\u0012*\u00020\b2\u0006\u00104\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bI\u0010H\u001a-\u0010J\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bJ\u0010K\u001a-\u0010L\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bL\u0010K\u001a=\u0010N\u001a\u00020\u000b*\u00020\b2\u0006\u0010>\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u0012H\u0002¢\u0006\u0004\bN\u0010O\u001aG\u0010S\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010R*\u00020\b2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00000P2\u0006\u0010*\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020\u00122\u0006\u0010M\u001a\u00020\u0012H\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010U\u001a\u00020\u000b*\u00020\b2\u0006\u0010C\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bU\u0010V\u001a-\u0010X\u001a\u00020\u000b*\u00020\b2\u0006\u0010W\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bX\u0010Y\u001a-\u0010Z\u001a\u00020\u000b*\u00020\b2\u0006\u0010C\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\bZ\u0010V\u001a-\u0010[\u001a\u00020\u000b*\u00020\b2\u0006\u0010W\u001a\u00020\u00002\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u0012¢\u0006\u0004\b[\u0010Y\u001a&\u0010\\\u001a\u00020\u0012*\u00020\b2\u0006\u0010>\u001a\u00020\b2\b\b\u0002\u0010@\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b\\\u0010H\u001a&\u0010]\u001a\u00020\u0012*\u00020\b2\u0006\u0010C\u001a\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u0012H\u0086\u0002¢\u0006\u0004\b]\u0010E\u001a?\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00180`*\u00020\b2\u0006\u0010^\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010_\u001a\u00020\u000bH\u0002¢\u0006\u0004\ba\u0010b\u001aG\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00180`*\u00020\b2\u000e\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000c2\b\b\u0002\u0010*\u001a\u00020\u000b2\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010_\u001a\u00020\u000bH\u0002¢\u0006\u0004\bd\u0010e\u001a\u0017\u0010g\u001a\u00020f2\u0006\u0010_\u001a\u00020\u000bH\u0000¢\u0006\u0004\bg\u0010h\u001a?\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00000i*\u00020\b2\u0012\u0010^\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000c\"\u00020\u00002\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010_\u001a\u00020\u000b¢\u0006\u0004\bj\u0010k\u001a7\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00000`*\u00020\b2\n\u0010^\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010_\u001a\u00020\u000b¢\u0006\u0004\bl\u0010m\u001a7\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00000i*\u00020\b2\n\u0010^\u001a\u00020\u0001\"\u00020\u00022\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u0010_\u001a\u00020\u000b¢\u0006\u0004\bn\u0010o\u001a1\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00000i*\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00122\u0006\u0010_\u001a\u00020\u000bH\u0002¢\u0006\u0004\bp\u0010q\u001a\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00000`*\u00020\b¢\u0006\u0004\br\u0010s\u001a\u0017\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00000i*\u00020\b¢\u0006\u0004\bt\u0010u\u001a\u0015\u0010v\u001a\u0004\u0018\u00010\u0012*\u00020\u0000H\u0007¢\u0006\u0004\bv\u0010w\"\u0015\u0010z\u001a\u00020\u0018*\u00020\b8F¢\u0006\u0006\u001a\u0004\bx\u0010y\"\u0015\u0010}\u001a\u00020\u000b*\u00020\b8F¢\u0006\u0006\u001a\u0004\b{\u0010|¨\u0006~"}, d2 = {"", "", "", "chars", "D1", "(Ljava/lang/String;[C)Ljava/lang/String;", "F1", "E1", "", "C1", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "", "length", "padChar", "B0", "(Ljava/lang/CharSequence;IC)Ljava/lang/CharSequence;", "C0", "(Ljava/lang/String;IC)Ljava/lang/String;", "", "s0", "(Ljava/lang/CharSequence;)Z", "Lkotlin/collections/CharIterator;", "t0", "(Ljava/lang/CharSequence;)Lkotlin/collections/CharIterator;", "Lkotlin/ranges/IntRange;", "range", "k1", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "j1", "(Ljava/lang/CharSequence;Lkotlin/ranges/IntRange;)Ljava/lang/String;", "delimiter", "missingDelimiterValue", "t1", "(Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;", "u1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "l1", "m1", "x1", "y1", "p1", "q1", "startIndex", "endIndex", "replacement", "V0", "(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/CharSequence;", "L0", "(Ljava/lang/CharSequence;II)Ljava/lang/CharSequence;", "prefix", "K0", "(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "suffix", "M0", "O0", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "N0", "T0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "P0", "R0", "thisOffset", "other", "otherOffset", "ignoreCase", "J0", "(Ljava/lang/CharSequence;ILjava/lang/CharSequence;IIZ)Z", "char", "f1", "(Ljava/lang/CharSequence;CZ)Z", "e0", "g1", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z", "f0", "r0", "(Ljava/lang/CharSequence;[CIZ)I", "y0", "last", "n0", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", "", "strings", "Lkotlin/Pair;", "i0", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Lkotlin/Pair;", "l0", "(Ljava/lang/CharSequence;CIZ)I", "string", "m0", "(Ljava/lang/CharSequence;Ljava/lang/String;IZ)I", "u0", "v0", "b0", "a0", "delimiters", "limit", "Lkotlin/sequences/Sequence;", "D0", "(Ljava/lang/CharSequence;[CIZI)Lkotlin/sequences/Sequence;", "", "E0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "", "W0", "(I)V", "", "Y0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "c1", "(Ljava/lang/CharSequence;[CZI)Lkotlin/sequences/Sequence;", "X0", "(Ljava/lang/CharSequence;[CZI)Ljava/util/List;", "Z0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "z0", "(Ljava/lang/CharSequence;)Lkotlin/sequences/Sequence;", "A0", "(Ljava/lang/CharSequence;)Ljava/util/List;", "B1", "(Ljava/lang/String;)Ljava/lang/Boolean;", "j0", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "indices", "k0", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension
/* loaded from: classes14.dex */
public class StringsKt__StringsKt extends p {
    private static final Pair<Integer, String> i0(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        CharSequence charSequence2;
        Object next;
        boolean z12;
        Object next2;
        if (!z10 && collection.size() == 1) {
            String str = (String) CollectionsKt.T0(collection);
            int iQ0 = !z11 ? q0(charSequence, str, i10, false, 4, null) : x0(charSequence, str, i10, false, 4, null);
            if (iQ0 < 0) {
                return null;
            }
            return TuplesKt.a(Integer.valueOf(iQ0), str);
        }
        CharSequence charSequence3 = charSequence;
        IntProgression intRange = !z11 ? new IntRange(RangesKt.f(i10, 0), charSequence3.length()) : RangesKt.t(RangesKt.k(i10, k0(charSequence3)), 0);
        if (charSequence3 instanceof String) {
            int iF = intRange.getFirst();
            int iH = intRange.getLast();
            int iK = intRange.getStep();
            if ((iK > 0 && iF <= iH) || (iK < 0 && iH <= iF)) {
                int i11 = iF;
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z12 = z10;
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                        String str2 = (String) next2;
                        z12 = z10;
                        if (p.K(str2, 0, (String) charSequence3, i11, str2.length(), z12)) {
                            break;
                        }
                        z10 = z12;
                    }
                    String str3 = (String) next2;
                    if (str3 == null) {
                        if (i11 == iH) {
                            break;
                        }
                        i11 += iK;
                        z10 = z12;
                    } else {
                        return TuplesKt.a(Integer.valueOf(i11), str3);
                    }
                }
            }
        } else {
            boolean z13 = z10;
            int iF2 = intRange.getFirst();
            int iH2 = intRange.getLast();
            int iK2 = intRange.getStep();
            if ((iK2 > 0 && iF2 <= iH2) || (iK2 < 0 && iH2 <= iF2)) {
                int i12 = iF2;
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            charSequence2 = charSequence3;
                            next = null;
                            break;
                        }
                        next = it2.next();
                        String str4 = (String) next;
                        boolean z14 = z13;
                        charSequence2 = charSequence3;
                        z13 = z14;
                        if (J0(str4, 0, charSequence2, i12, str4.length(), z14)) {
                            break;
                        }
                        charSequence3 = charSequence2;
                    }
                    String str5 = (String) next;
                    if (str5 == null) {
                        if (i12 == iH2) {
                            break;
                        }
                        i12 += iK2;
                        charSequence3 = charSequence2;
                    } else {
                        return TuplesKt.a(Integer.valueOf(i12), str5);
                    }
                }
            }
        }
        return null;
    }

    private static final int n0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        IntProgression intRange = !z11 ? new IntRange(RangesKt.f(i10, 0), RangesKt.k(i11, charSequence.length())) : RangesKt.t(RangesKt.k(i10, k0(charSequence)), RangesKt.f(i11, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int iF = intRange.getFirst();
            int iH = intRange.getLast();
            int iK = intRange.getStep();
            if ((iK <= 0 || iF > iH) && (iK >= 0 || iH > iF)) {
                return -1;
            }
            int i12 = iF;
            while (true) {
                String str = (String) charSequence2;
                boolean z12 = z10;
                if (p.K(str, 0, (String) charSequence, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == iH) {
                    return -1;
                }
                i12 += iK;
                z10 = z12;
            }
        } else {
            boolean z13 = z10;
            int iF2 = intRange.getFirst();
            int iH2 = intRange.getLast();
            int iK2 = intRange.getStep();
            if ((iK2 <= 0 || iF2 > iH2) && (iK2 >= 0 || iH2 > iF2)) {
                return -1;
            }
            int i13 = iF2;
            while (true) {
                boolean z14 = z13;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z13 = z14;
                if (J0(charSequence4, 0, charSequence3, i13, charSequence2.length(), z14)) {
                    return i13;
                }
                if (i13 == iH2) {
                    return -1;
                }
                i13 += iK2;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static List<String> A0(CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        return SequencesKt.X(z0(charSequence));
    }

    public static /* synthetic */ String A1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return y1(str, str2, str3);
    }

    public static final CharSequence B0(CharSequence charSequence, int i10, char c10) {
        Intrinsics.j(charSequence, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException("Desired length " + i10 + " is less than zero.");
        }
        if (i10 <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(i10);
        int length = i10 - charSequence.length();
        int i11 = 1;
        if (1 <= length) {
            while (true) {
                sb2.append(c10);
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        sb2.append(charSequence);
        return sb2;
    }

    @SinceKotlin
    public static Boolean B1(String str) {
        Intrinsics.j(str, "<this>");
        if (Intrinsics.e(str, "true")) {
            return Boolean.TRUE;
        }
        if (Intrinsics.e(str, "false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static String C0(String str, int i10, char c10) {
        Intrinsics.j(str, "<this>");
        return B0(str, i10, c10).toString();
    }

    public static CharSequence C1(CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zC = a.c(charSequence.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zC) {
                    break;
                }
                length--;
            } else if (zC) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static String D1(String str, char... chars) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(chars, "chars");
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean zV = ArraysKt.V(chars, str.charAt(!z10 ? i10 : length));
            if (z10) {
                if (!zV) {
                    break;
                }
                length--;
            } else if (zV) {
                i10++;
            } else {
                z10 = true;
            }
        }
        return str.subSequence(i10, length + 1).toString();
    }

    public static String E1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.j(str, "<this>");
        Intrinsics.j(chars, "chars");
        int length = str.length() - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (!ArraysKt.V(chars, str.charAt(length))) {
                    charSequenceSubSequence = str.subSequence(0, length + 1);
                    break;
                }
                if (i10 < 0) {
                    break;
                }
                length = i10;
            }
            charSequenceSubSequence = "";
        } else {
            charSequenceSubSequence = "";
        }
        return charSequenceSubSequence.toString();
    }

    static /* synthetic */ Sequence F0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return D0(charSequence, cArr, i10, z10, i11);
    }

    public static String F1(String str, char... chars) {
        CharSequence charSequenceSubSequence;
        Intrinsics.j(str, "<this>");
        Intrinsics.j(chars, "chars");
        int length = str.length();
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!ArraysKt.V(chars, str.charAt(i10))) {
                charSequenceSubSequence = str.subSequence(i10, str.length());
                break;
            }
            i10++;
        }
        return charSequenceSubSequence.toString();
    }

    static /* synthetic */ Sequence G0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return E0(charSequence, strArr, i10, z10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair H0(char[] cArr, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.j(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        int iR0 = r0(DelimitedRangesSequence, cArr, i10, z10);
        if (iR0 < 0) {
            return null;
        }
        return TuplesKt.a(Integer.valueOf(iR0), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pair I0(List list, boolean z10, CharSequence DelimitedRangesSequence, int i10) {
        Intrinsics.j(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        Pair<Integer, String> pairI0 = i0(DelimitedRangesSequence, list, i10, z10, false);
        if (pairI0 != null) {
            return TuplesKt.a(pairI0.c(), Integer.valueOf(pairI0.d().length()));
        }
        return null;
    }

    public static final boolean J0(CharSequence charSequence, int i10, CharSequence other, int i11, int i12, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(other, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > other.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!b.g(charSequence.charAt(i10 + i13), other.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String K0(String str, CharSequence prefix) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(prefix, "prefix");
        if (!i1(str, prefix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length());
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence L0(CharSequence charSequence, int i10, int i11) {
        Intrinsics.j(charSequence, "<this>");
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
        }
        if (i11 == i10) {
            return charSequence.subSequence(0, charSequence.length());
        }
        StringBuilder sb2 = new StringBuilder(charSequence.length() - (i11 - i10));
        sb2.append(charSequence, 0, i10);
        Intrinsics.i(sb2, "append(...)");
        sb2.append(charSequence, i11, charSequence.length());
        Intrinsics.i(sb2, "append(...)");
        return sb2;
    }

    public static String M0(String str, CharSequence suffix) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(suffix, "suffix");
        if (!h0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - suffix.length());
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String N0(String str, CharSequence delimiter) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiter, "delimiter");
        return O0(str, delimiter, delimiter);
    }

    public static final String O0(String str, CharSequence prefix, CharSequence suffix) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(prefix, "prefix");
        Intrinsics.j(suffix, "suffix");
        if (str.length() < prefix.length() + suffix.length() || !i1(str, prefix, false, 2, null) || !h0(str, suffix, false, 2, null)) {
            return str;
        }
        String strSubstring = str.substring(prefix.length(), str.length() - suffix.length());
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String P0(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiter, "delimiter");
        Intrinsics.j(replacement, "replacement");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iQ0 = q0(str, delimiter, 0, false, 6, null);
        return iQ0 == -1 ? missingDelimiterValue : V0(str, iQ0 + delimiter.length(), str.length(), replacement).toString();
    }

    public static /* synthetic */ String Q0(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return P0(str, str2, str3, str4);
    }

    public static final String R0(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiter, "delimiter");
        Intrinsics.j(replacement, "replacement");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iX0 = x0(str, delimiter, 0, false, 6, null);
        return iX0 == -1 ? missingDelimiterValue : V0(str, iX0 + delimiter.length(), str.length(), replacement).toString();
    }

    public static /* synthetic */ String S0(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return R0(str, str2, str3, str4);
    }

    public static final String T0(String str, String delimiter, String replacement, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiter, "delimiter");
        Intrinsics.j(replacement, "replacement");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iQ0 = q0(str, delimiter, 0, false, 6, null);
        return iQ0 == -1 ? missingDelimiterValue : V0(str, 0, iQ0, replacement).toString();
    }

    public static /* synthetic */ String U0(String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str4 = str;
        }
        return T0(str, str2, str3, str4);
    }

    public static CharSequence V0(CharSequence charSequence, int i10, int i11, CharSequence replacement) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(replacement, "replacement");
        if (i11 >= i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(charSequence, 0, i10);
            Intrinsics.i(sb2, "append(...)");
            sb2.append(replacement);
            sb2.append(charSequence, i11, charSequence.length());
            Intrinsics.i(sb2, "append(...)");
            return sb2;
        }
        throw new IndexOutOfBoundsException("End index (" + i11 + ") is less than start index (" + i10 + ").");
    }

    public static final void W0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> X0(CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(delimiters, "delimiters");
        if (delimiters.length == 1) {
            return Z0(charSequence, String.valueOf(delimiters[0]), z10, i10);
        }
        Iterable iterableY = SequencesKt.y(F0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterableY, 10));
        Iterator it = iterableY.iterator();
        while (it.hasNext()) {
            arrayList.add(j1(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final List<String> Y0(CharSequence charSequence, String[] delimiters, boolean z10, int i10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(delimiters, "delimiters");
        if (delimiters.length == 1) {
            String str = delimiters[0];
            if (str.length() != 0) {
                return Z0(charSequence, str, z10, i10);
            }
        }
        Iterable iterableY = SequencesKt.y(G0(charSequence, delimiters, 0, z10, i10, 2, null));
        ArrayList arrayList = new ArrayList(CollectionsKt.x(iterableY, 10));
        Iterator it = iterableY.iterator();
        while (it.hasNext()) {
            arrayList.add(j1(charSequence, (IntRange) it.next()));
        }
        return arrayList;
    }

    public static final boolean a0(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        return p0(charSequence, c10, 0, z10, 2, null) >= 0;
    }

    public static /* synthetic */ List a1(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return X0(charSequence, cArr, z10, i10);
    }

    public static boolean b0(CharSequence charSequence, CharSequence other, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(other, "other");
        return other instanceof String ? q0(charSequence, (String) other, 0, z10, 2, null) >= 0 : o0(charSequence, other, 0, charSequence.length(), z10, false, 16, null) >= 0;
    }

    public static /* synthetic */ List b1(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return Y0(charSequence, strArr, z10, i10);
    }

    public static /* synthetic */ boolean c0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a0(charSequence, c10, z10);
    }

    public static final Sequence<String> c1(final CharSequence charSequence, char[] delimiters, boolean z10, int i10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(delimiters, "delimiters");
        return SequencesKt.M(F0(charSequence, delimiters, 0, z10, i10, 2, null), new Function1() { // from class: kotlin.text.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StringsKt__StringsKt.e1(charSequence, (IntRange) obj);
            }
        });
    }

    public static /* synthetic */ boolean d0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b0(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ Sequence d1(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return c1(charSequence, cArr, z10, i10);
    }

    public static final boolean e0(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        return charSequence.length() > 0 && b.g(charSequence.charAt(k0(charSequence)), c10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String e1(CharSequence charSequence, IntRange it) {
        Intrinsics.j(it, "it");
        return j1(charSequence, it);
    }

    public static final boolean f0(CharSequence charSequence, CharSequence suffix, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(suffix, "suffix");
        return (!z10 && (charSequence instanceof String) && (suffix instanceof String)) ? p.G((String) charSequence, (String) suffix, false, 2, null) : J0(charSequence, charSequence.length() - suffix.length(), suffix, 0, suffix.length(), z10);
    }

    public static final boolean f1(CharSequence charSequence, char c10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        return charSequence.length() > 0 && b.g(charSequence.charAt(0), c10, z10);
    }

    public static /* synthetic */ boolean g0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e0(charSequence, c10, z10);
    }

    public static final boolean g1(CharSequence charSequence, CharSequence prefix, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(prefix, "prefix");
        return (!z10 && (charSequence instanceof String) && (prefix instanceof String)) ? p.W((String) charSequence, (String) prefix, false, 2, null) : J0(charSequence, 0, prefix, 0, prefix.length(), z10);
    }

    public static /* synthetic */ boolean h0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return f0(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ boolean h1(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return f1(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean i1(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return g1(charSequence, charSequence2, z10);
    }

    public static IntRange j0(CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        return new IntRange(0, charSequence.length() - 1);
    }

    public static final String j1(CharSequence charSequence, IntRange range) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(range, "range");
        return charSequence.subSequence(range.getStart().intValue(), range.getEndInclusive().intValue() + 1).toString();
    }

    public static int k0(CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static String k1(String str, IntRange range) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(range, "range");
        String strSubstring = str.substring(range.getStart().intValue(), range.getEndInclusive().intValue() + 1);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int l0(CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? r0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static String l1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iP0 = p0(str, c10, 0, false, 6, null);
        if (iP0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iP0 + 1, str.length());
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int m0(CharSequence charSequence, String string, int i10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(string, "string");
        return (z10 || !(charSequence instanceof String)) ? o0(charSequence, string, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(string, i10);
    }

    public static final String m1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiter, "delimiter");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iQ0 = q0(str, delimiter, 0, false, 6, null);
        if (iQ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iQ0 + delimiter.length(), str.length());
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ String n1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return l1(str, c10, str2);
    }

    static /* synthetic */ int o0(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return n0(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ String o1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return m1(str, str2, str3);
    }

    public static /* synthetic */ int p0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return l0(charSequence, c10, i10, z10);
    }

    public static String p1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iW0 = w0(str, c10, 0, false, 6, null);
        if (iW0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iW0 + 1, str.length());
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ int q0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return m0(charSequence, str, i10, z10);
    }

    public static final String q1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiter, "delimiter");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iX0 = x0(str, delimiter, 0, false, 6, null);
        if (iX0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(iX0 + delimiter.length(), str.length());
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int r0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.Q0(chars), i10);
        }
        int iF = RangesKt.f(i10, 0);
        int iK0 = k0(charSequence);
        if (iF > iK0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(iF);
            for (char c10 : chars) {
                if (b.g(c10, cCharAt, z10)) {
                    return iF;
                }
            }
            if (iF == iK0) {
                return -1;
            }
            iF++;
        }
    }

    public static /* synthetic */ String r1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return p1(str, c10, str2);
    }

    public static boolean s0(CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        for (int i10 = 0; i10 < charSequence.length(); i10++) {
            if (!a.c(charSequence.charAt(i10))) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String s1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return q1(str, str2, str3);
    }

    public static final CharIterator t0(final CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        return new CharIterator() { // from class: kotlin.text.StringsKt__StringsKt$iterator$1

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private int index;

            @Override // kotlin.collections.CharIterator
            public char a() {
                CharSequence charSequence2 = charSequence;
                int i10 = this.index;
                this.index = i10 + 1;
                return charSequence2.charAt(i10);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.index < charSequence.length();
            }
        };
    }

    public static final String t1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iP0 = p0(str, c10, 0, false, 6, null);
        if (iP0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iP0);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int u0(CharSequence charSequence, char c10, int i10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? y0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static String u1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiter, "delimiter");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iQ0 = q0(str, delimiter, 0, false, 6, null);
        if (iQ0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iQ0);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int v0(CharSequence charSequence, String string, int i10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(string, "string");
        return (z10 || !(charSequence instanceof String)) ? n0(charSequence, string, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(string, i10);
    }

    public static /* synthetic */ String v1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return t1(str, c10, str2);
    }

    public static /* synthetic */ int w0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = k0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return u0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ String w1(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return u1(str, str2, str3);
    }

    public static /* synthetic */ int x0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = k0(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return v0(charSequence, str, i10, z10);
    }

    public static final String x1(String str, char c10, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iW0 = w0(str, c10, 0, false, 6, null);
        if (iW0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iW0);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final int y0(CharSequence charSequence, char[] chars, int i10, boolean z10) {
        Intrinsics.j(charSequence, "<this>");
        Intrinsics.j(chars, "chars");
        if (!z10 && chars.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(ArraysKt.Q0(chars), i10);
        }
        for (int iK = RangesKt.k(i10, k0(charSequence)); -1 < iK; iK--) {
            char cCharAt = charSequence.charAt(iK);
            for (char c10 : chars) {
                if (b.g(c10, cCharAt, z10)) {
                    return iK;
                }
            }
        }
        return -1;
    }

    public static String y1(String str, String delimiter, String missingDelimiterValue) {
        Intrinsics.j(str, "<this>");
        Intrinsics.j(delimiter, "delimiter");
        Intrinsics.j(missingDelimiterValue, "missingDelimiterValue");
        int iX0 = x0(str, delimiter, 0, false, 6, null);
        if (iX0 == -1) {
            return missingDelimiterValue;
        }
        String strSubstring = str.substring(0, iX0);
        Intrinsics.i(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final Sequence<String> z0(final CharSequence charSequence) {
        Intrinsics.j(charSequence, "<this>");
        return new Sequence<String>() { // from class: kotlin.text.StringsKt__StringsKt$lineSequence$$inlined$Sequence$1
            @Override // kotlin.sequences.Sequence
            public Iterator<String> iterator() {
                return new d(charSequence);
            }
        };
    }

    public static /* synthetic */ String z1(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return x1(str, c10, str2);
    }

    private static final Sequence<IntRange> D0(CharSequence charSequence, final char[] cArr, int i10, final boolean z10, int i11) {
        W0(i11);
        return new DelimitedRangesSequence(charSequence, i10, i11, new Function2() { // from class: kotlin.text.r
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.H0(cArr, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final Sequence<IntRange> E0(CharSequence charSequence, String[] strArr, int i10, final boolean z10, int i11) {
        W0(i11);
        final List listG = ArraysKt.g(strArr);
        return new DelimitedRangesSequence(charSequence, i10, i11, new Function2() { // from class: kotlin.text.s
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return StringsKt__StringsKt.I0(listG, z10, (CharSequence) obj, ((Integer) obj2).intValue());
            }
        });
    }

    private static final List<String> Z0(CharSequence charSequence, String str, boolean z10, int i10) {
        boolean z11;
        W0(i10);
        int length = 0;
        int iM0 = m0(charSequence, str, 0, z10);
        if (iM0 != -1 && i10 != 1) {
            if (i10 > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int iK = 10;
            if (z11) {
                iK = RangesKt.k(i10, 10);
            }
            ArrayList arrayList = new ArrayList(iK);
            do {
                arrayList.add(charSequence.subSequence(length, iM0).toString());
                length = str.length() + iM0;
                if (z11 && arrayList.size() == i10 - 1) {
                    break;
                }
                iM0 = m0(charSequence, str, length, z10);
            } while (iM0 != -1);
            arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
            return arrayList;
        }
        return CollectionsKt.e(charSequence.toString());
    }
}
