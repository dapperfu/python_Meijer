package lw;

import com.medallia.digital.mobilesdk.l3;
import com.medallia.digital.mobilesdk.q2;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kw.B;
import kw.InterfaceC15330g;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0000¢\u0006\u0004\b\t\u0010\n\u001a)\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0005*\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0017\u001a\u00020\u0013*\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a5\u0010\u001f\u001a\u00020\u001d*\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a\u0013\u0010!\u001a\u00020\u001d*\u00020\u0010H\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001b\u0010$\u001a\u00020\u0005*\u00020\u00102\u0006\u0010#\u001a\u00020\u0005H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001f\u0010&\u001a\u0004\u0018\u00010\u0005*\u00020\u00102\b\u0010#\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b&\u0010%\u001a\u0017\u0010(\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u001cH\u0000¢\u0006\u0004\b(\u0010)\u001a!\u0010,\u001a\u0004\u0018\u00010\u001c2\u0006\u0010*\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u0019H\u0000¢\u0006\u0004\b,\u0010-\"\u0018\u00101\u001a\u00020.*\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lkw/B;", "zipPath", "Lkw/l;", "fileSystem", "Lkotlin/Function1;", "Llw/n;", "", "predicate", "Lkw/M;", "h", "(Lkw/B;Lkw/l;Lkotlin/jvm/functions/Function1;)Lkw/M;", "", "entries", "", "d", "(Ljava/util/List;)Ljava/util/Map;", "Lkw/g;", "i", "(Lkw/g;)Llw/n;", "Llw/h;", "l", "(Lkw/g;)Llw/h;", "regularRecord", "q", "(Lkw/g;Llw/h;)Llw/h;", "", "extraSize", "Lkotlin/Function2;", "", "", "block", "m", "(Lkw/g;ILkotlin/jvm/functions/Function2;)V", "r", "(Lkw/g;)V", "centralDirectoryZipEntry", "n", "(Lkw/g;Llw/n;)Llw/n;", "o", "filetime", "f", "(J)J", "date", "time", "e", "(II)Ljava/lang/Long;", "", "g", "(I)Ljava/lang/String;", "hex", "okio"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            return ComparisonsKt.d(((n) t10).getCanonicalPath(), ((n) t11).getCanonicalPath());
        }
    }

    public static final Long e(int i10, int i11) {
        if (i11 == -1) {
            return null;
        }
        return Long.valueOf(t.a(((i10 >> 9) & l3.f92485d) + 1980, (i10 >> 5) & 15, i10 & 31, (i11 >> 11) & 31, (i11 >> 5) & 63, (i11 & 31) << 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Ref.BooleanRef booleanRef, long j10, Ref.LongRef longRef, final InterfaceC15330g interfaceC15330g, Ref.LongRef longRef2, Ref.LongRef longRef3, final Ref.ObjectRef objectRef, final Ref.ObjectRef objectRef2, final Ref.ObjectRef objectRef3, int i10, long j11) throws IOException {
        if (i10 != 1) {
            if (i10 == 10) {
                if (j11 < 4) {
                    throw new IOException("bad zip: NTFS extra too short");
                }
                interfaceC15330g.skip(4L);
                m(interfaceC15330g, (int) (j11 - 4), new Function2() { // from class: lw.q
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.k(objectRef, interfaceC15330g, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
            }
        } else {
            if (booleanRef.f142828a) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            booleanRef.f142828a = true;
            if (j11 < j10) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            long jS1 = longRef.f142834a;
            if (jS1 == 4294967295L) {
                jS1 = interfaceC15330g.s1();
            }
            longRef.f142834a = jS1;
            longRef2.f142834a = longRef2.f142834a == 4294967295L ? interfaceC15330g.s1() : 0L;
            longRef3.f142834a = longRef3.f142834a == 4294967295L ? interfaceC15330g.s1() : 0L;
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Long] */
    public static final Unit k(Ref.ObjectRef objectRef, InterfaceC15330g interfaceC15330g, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i10, long j10) throws IOException {
        if (i10 == 1) {
            if (objectRef.f142835a != 0) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 repeated");
            }
            if (j10 != 24) {
                throw new IOException("bad zip: NTFS extra attribute tag 0x0001 size != 24");
            }
            objectRef.f142835a = Long.valueOf(interfaceC15330g.s1());
            objectRef2.f142835a = Long.valueOf(interfaceC15330g.s1());
            objectRef3.f142835a = Long.valueOf(interfaceC15330g.s1());
        }
        return Unit.f142422a;
    }

    private static final void m(InterfaceC15330g interfaceC15330g, int i10, Function2<? super Integer, ? super Long, Unit> function2) throws IOException {
        long j10 = i10;
        while (j10 != 0) {
            if (j10 < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iN1 = interfaceC15330g.n1() & 65535;
            long jN1 = interfaceC15330g.n1() & 65535;
            long j11 = j10 - 4;
            if (j11 < jN1) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC15330g.B1(jN1);
            long size = interfaceC15330g.e().getSize();
            function2.invoke(Integer.valueOf(iN1), Long.valueOf(jN1));
            long size2 = (interfaceC15330g.e().getSize() + jN1) - size;
            if (size2 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iN1);
            }
            if (size2 > 0) {
                interfaceC15330g.e().skip(size2);
            }
            j10 = j11 - jN1;
        }
    }

    private static final Map<B, n> d(List<n> list) {
        B bE = B.Companion.e(B.INSTANCE, q2.f92724c, false, 1, null);
        Map<B, n> mapR = MapsKt.r(TuplesKt.a(bE, new n(bE, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null)));
        for (n nVar : CollectionsKt.Z0(list, new a())) {
            if (mapR.put(nVar.getCanonicalPath(), nVar) == null) {
                while (true) {
                    B bP = nVar.getCanonicalPath().p();
                    if (bP != null) {
                        n nVar2 = mapR.get(bP);
                        if (nVar2 != null) {
                            nVar2.c().add(nVar.getCanonicalPath());
                            break;
                        }
                        n nVar3 = new n(bP, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, null, null, null, 65532, null);
                        mapR.put(bP, nVar3);
                        nVar3.c().add(nVar.getCanonicalPath());
                        nVar = nVar3;
                    }
                }
            }
        }
        return mapR;
    }

    public static final long f(long j10) {
        return (j10 / 10000) - 11644473600000L;
    }

    private static final String g(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("0x");
        String string = Integer.toString(i10, CharsKt.a(16));
        Intrinsics.i(string, "toString(...)");
        sb2.append(string);
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00de A[Catch: all -> 0x00df, TRY_ENTER, TryCatch #13 {all -> 0x00df, blocks: (B:13:0x0062, B:15:0x006b, B:18:0x007c, B:43:0x00de, B:46:0x00e2, B:47:0x00e9, B:48:0x00ea), top: B:139:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b A[Catch: all -> 0x0103, TryCatch #1 {all -> 0x0103, blocks: (B:3:0x0019, B:5:0x0027, B:6:0x0030, B:10:0x004e, B:12:0x005a, B:65:0x010b, B:59:0x00ff, B:66:0x010c, B:93:0x016e, B:97:0x017f, B:90:0x0168, B:100:0x0182, B:103:0x018e, B:104:0x0195, B:105:0x0196, B:106:0x0199, B:107:0x019a, B:108:0x01b4, B:7:0x0038, B:9:0x0041, B:67:0x011d, B:70:0x0125, B:72:0x0135, B:74:0x0141, B:77:0x0148, B:78:0x014c, B:79:0x0153, B:80:0x0154, B:87:0x0161, B:56:0x00f8), top: B:118:0x0019, inners: #0, #2, #3, #12 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kw.M h(kw.B r18, kw.AbstractC15335l r19, kotlin.jvm.functions.Function1<? super lw.n, java.lang.Boolean> r20) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lw.r.h(kw.B, kw.l, kotlin.jvm.functions.Function1):kw.M");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n i(final InterfaceC15330g interfaceC15330g) throws IOException {
        Intrinsics.j(interfaceC15330g, "<this>");
        int iF3 = interfaceC15330g.f3();
        if (iF3 != 33639248) {
            throw new IOException("bad zip: expected " + g(33639248) + " but was " + g(iF3));
        }
        interfaceC15330g.skip(4L);
        short sN1 = interfaceC15330g.n1();
        int i10 = sN1 & 65535;
        if ((sN1 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + g(i10));
        }
        int iN1 = interfaceC15330g.n1() & 65535;
        int iN12 = interfaceC15330g.n1() & 65535;
        int iN13 = interfaceC15330g.n1() & 65535;
        long jF3 = interfaceC15330g.f3() & 4294967295L;
        final Ref.LongRef longRef = new Ref.LongRef();
        longRef.f142834a = interfaceC15330g.f3() & 4294967295L;
        final Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.f142834a = interfaceC15330g.f3() & 4294967295L;
        int iN14 = interfaceC15330g.n1() & 65535;
        int iN15 = interfaceC15330g.n1() & 65535;
        int iN16 = interfaceC15330g.n1() & 65535;
        interfaceC15330g.skip(8L);
        final Ref.LongRef longRef3 = new Ref.LongRef();
        longRef3.f142834a = interfaceC15330g.f3() & 4294967295L;
        String strK1 = interfaceC15330g.K1(iN14);
        if (StringsKt.b0(strK1, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j10 = longRef2.f142834a == 4294967295L ? 8 : 0L;
        if (longRef.f142834a == 4294967295L) {
            j10 += 8;
        }
        if (longRef3.f142834a == 4294967295L) {
            j10 += 8;
        }
        final long j11 = j10;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        m(interfaceC15330g, iN15, new Function2() { // from class: lw.p
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return r.j(booleanRef, j11, longRef2, interfaceC15330g, longRef, longRef3, objectRef, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
            }
        });
        if (j11 <= 0 || booleanRef.f142828a) {
            return new n(B.Companion.e(B.INSTANCE, q2.f92724c, false, 1, null).u(strK1), StringsKt.G(strK1, q2.f92724c, false, 2, null), interfaceC15330g.K1(iN16), jF3, longRef.f142834a, longRef2.f142834a, iN1, longRef3.f142834a, iN13, iN12, (Long) objectRef.f142835a, (Long) objectRef2.f142835a, (Long) objectRef3.f142835a, null, null, null, 57344, null);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    public static final n n(InterfaceC15330g interfaceC15330g, n centralDirectoryZipEntry) throws IOException {
        Intrinsics.j(interfaceC15330g, "<this>");
        Intrinsics.j(centralDirectoryZipEntry, "centralDirectoryZipEntry");
        n nVarO = o(interfaceC15330g, centralDirectoryZipEntry);
        Intrinsics.g(nVarO);
        return nVarO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r10v2, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v5, types: [T, java.lang.Integer] */
    public static final Unit p(InterfaceC15330g interfaceC15330g, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, Ref.ObjectRef objectRef3, int i10, long j10) throws IOException {
        if (i10 == 21589) {
            if (j10 < 1) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            byte b10 = interfaceC15330g.readByte();
            boolean z10 = (b10 & 1) == 1;
            boolean z11 = (b10 & 2) == 2;
            boolean z12 = (b10 & 4) == 4;
            long j11 = z10 ? 5L : 1L;
            if (z11) {
                j11 += 4;
            }
            if (z12) {
                j11 += 4;
            }
            if (j10 < j11) {
                throw new IOException("bad zip: extended timestamp extra too short");
            }
            if (z10) {
                objectRef.f142835a = Integer.valueOf(interfaceC15330g.f3());
            }
            if (z11) {
                objectRef2.f142835a = Integer.valueOf(interfaceC15330g.f3());
            }
            if (z12) {
                objectRef3.f142835a = Integer.valueOf(interfaceC15330g.f3());
            }
        }
        return Unit.f142422a;
    }

    private static final h q(InterfaceC15330g interfaceC15330g, h hVar) throws IOException {
        interfaceC15330g.skip(12L);
        int iF3 = interfaceC15330g.f3();
        int iF32 = interfaceC15330g.f3();
        long jS1 = interfaceC15330g.s1();
        if (jS1 != interfaceC15330g.s1() || iF3 != 0 || iF32 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC15330g.skip(8L);
        return new h(jS1, interfaceC15330g.s1(), hVar.getCommentByteCount());
    }

    public static final void r(InterfaceC15330g interfaceC15330g) {
        Intrinsics.j(interfaceC15330g, "<this>");
        o(interfaceC15330g, null);
    }

    private static final h l(InterfaceC15330g interfaceC15330g) throws IOException {
        int iN1 = interfaceC15330g.n1() & 65535;
        int iN12 = interfaceC15330g.n1() & 65535;
        long jN1 = interfaceC15330g.n1() & 65535;
        if (jN1 == (interfaceC15330g.n1() & 65535) && iN1 == 0 && iN12 == 0) {
            interfaceC15330g.skip(4L);
            return new h(jN1, 4294967295L & interfaceC15330g.f3(), interfaceC15330g.n1() & 65535);
        }
        throw new IOException("unsupported zip: spanned");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final n o(final InterfaceC15330g interfaceC15330g, n nVar) throws IOException {
        int iF3 = interfaceC15330g.f3();
        if (iF3 == 67324752) {
            interfaceC15330g.skip(2L);
            short sN1 = interfaceC15330g.n1();
            int i10 = sN1 & 65535;
            if ((sN1 & 1) == 0) {
                interfaceC15330g.skip(18L);
                int iN1 = interfaceC15330g.n1() & 65535;
                interfaceC15330g.skip(interfaceC15330g.n1() & 65535);
                if (nVar == null) {
                    interfaceC15330g.skip(iN1);
                    return null;
                }
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                final Ref.ObjectRef objectRef3 = new Ref.ObjectRef();
                m(interfaceC15330g, iN1, new Function2() { // from class: lw.o
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return r.p(interfaceC15330g, objectRef, objectRef2, objectRef3, ((Integer) obj).intValue(), ((Long) obj2).longValue());
                    }
                });
                return nVar.a((Integer) objectRef.f142835a, (Integer) objectRef2.f142835a, (Integer) objectRef3.f142835a);
            }
            throw new IOException("unsupported zip: general purpose bit flag=" + g(i10));
        }
        throw new IOException("bad zip: expected " + g(67324752) + " but was " + g(iF3));
    }
}
