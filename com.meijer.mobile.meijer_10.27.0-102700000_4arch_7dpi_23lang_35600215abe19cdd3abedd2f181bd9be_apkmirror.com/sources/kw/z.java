package kw;

import java.io.IOException;
import java.util.List;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004:\u0001\u001bB!\b\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lkw/z;", "Lkotlin/collections/AbstractList;", "Lkw/h;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "byteStrings", "", "trie", "<init>", "([Lkw/h;[I)V", "", "index", "n", "(I)Lkw/h;", "b", "[Lkw/h;", "o", "()[Lkw/h;", "c", "[I", "p", "()[I", "f", "()I", "size", "d", "a", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class z extends AbstractList<C15331h> implements RandomAccess {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C15331h[] byteStrings;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int[] trie;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\u00020\u00142\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\u0013\"\u00020\u000bH\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0019\u001a\u00020\u0004*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkw/z$a;", "", "<init>", "()V", "", "nodeOffset", "Lkw/e;", "node", "", "byteStringOffset", "", "Lkw/h;", "byteStrings", "fromIndex", "toIndex", "indexes", "", "a", "(JLkw/e;ILjava/util/List;IILjava/util/List;)V", "", "Lkw/z;", "d", "([Lkw/h;)Lkw/z;", "c", "(Lkw/e;)J", "intCount", "okio"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: kw.z$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final void a(long nodeOffset, C15328e node, int byteStringOffset, List<? extends C15331h> byteStrings, int fromIndex, int toIndex, List<Integer> indexes) throws IOException {
            int i10;
            int i11;
            int i12;
            long j10;
            int i13 = byteStringOffset;
            if (fromIndex >= toIndex) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            for (int i14 = fromIndex; i14 < toIndex; i14++) {
                if (byteStrings.get(i14).V() < i13) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            C15331h c15331h = byteStrings.get(fromIndex);
            C15331h c15331h2 = byteStrings.get(toIndex - 1);
            if (i13 == c15331h.V()) {
                int iIntValue = indexes.get(fromIndex).intValue();
                int i15 = fromIndex + 1;
                C15331h c15331h3 = byteStrings.get(i15);
                i10 = i15;
                i11 = iIntValue;
                c15331h = c15331h3;
            } else {
                i10 = fromIndex;
                i11 = -1;
            }
            if (c15331h.u(i13) == c15331h2.u(i13)) {
                int iMin = Math.min(c15331h.V(), c15331h2.V());
                int i16 = 0;
                for (int i17 = i13; i17 < iMin && c15331h.u(i17) == c15331h2.u(i17); i17++) {
                    i16++;
                }
                long jC = nodeOffset + c(node) + 2 + i16 + 1;
                node.writeInt(-i16);
                node.writeInt(i11);
                int i18 = i13 + i16;
                while (i13 < i18) {
                    node.writeInt(c15331h.u(i13) & 255);
                    i13++;
                }
                if (i10 + 1 == toIndex) {
                    if (i18 != byteStrings.get(i10).V()) {
                        throw new IllegalStateException("Check failed.");
                    }
                    node.writeInt(indexes.get(i10).intValue());
                    return;
                } else {
                    C15328e c15328e = new C15328e();
                    node.writeInt(((int) (c(c15328e) + jC)) * (-1));
                    a(jC, c15328e, i18, byteStrings, i10, toIndex, indexes);
                    node.G0(c15328e);
                    return;
                }
            }
            int i19 = 1;
            for (int i20 = i10 + 1; i20 < toIndex; i20++) {
                if (byteStrings.get(i20 - 1).u(i13) != byteStrings.get(i20).u(i13)) {
                    i19++;
                }
            }
            long jC2 = nodeOffset + c(node) + 2 + (i19 * 2);
            node.writeInt(i19);
            node.writeInt(i11);
            for (int i21 = i10; i21 < toIndex; i21++) {
                byte bU = byteStrings.get(i21).u(i13);
                if (i21 == i10 || bU != byteStrings.get(i21 - 1).u(i13)) {
                    node.writeInt(bU & 255);
                }
            }
            C15328e c15328e2 = new C15328e();
            while (i10 < toIndex) {
                byte bU2 = byteStrings.get(i10).u(i13);
                int i22 = i10 + 1;
                int i23 = i22;
                while (true) {
                    if (i23 >= toIndex) {
                        i12 = toIndex;
                        break;
                    } else {
                        if (bU2 != byteStrings.get(i23).u(i13)) {
                            i12 = i23;
                            break;
                        }
                        i23++;
                    }
                }
                if (i22 == i12 && i13 + 1 == byteStrings.get(i10).V()) {
                    node.writeInt(indexes.get(i10).intValue());
                    j10 = jC2;
                } else {
                    node.writeInt(((int) (c(c15328e2) + jC2)) * (-1));
                    j10 = jC2;
                    a(j10, c15328e2, i13 + 1, byteStrings, i10, i12, indexes);
                }
                jC2 = j10;
                i10 = i12;
            }
            node.G0(c15328e2);
        }

        static /* synthetic */ void b(Companion companion, long j10, C15328e c15328e, int i10, List list, int i11, int i12, List list2, int i13, Object obj) throws IOException {
            if ((i13 & 1) != 0) {
                j10 = 0;
            }
            companion.a(j10, c15328e, (i13 & 4) != 0 ? 0 : i10, list, (i13 & 16) != 0 ? 0 : i11, (i13 & 32) != 0 ? list.size() : i12, list2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00cb, code lost:
        
            continue;
         */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kw.z d(kw.C15331h... r17) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kw.z.Companion.d(kw.h[]):kw.z");
        }

        private final long c(C15328e c15328e) {
            return c15328e.getSize() / 4;
        }
    }

    public /* synthetic */ z(C15331h[] c15331hArr, int[] iArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(c15331hArr, iArr);
    }

    @JvmStatic
    public static final z s(C15331h... c15331hArr) {
        return INSTANCE.d(c15331hArr);
    }

    private z(C15331h[] c15331hArr, int[] iArr) {
        this.byteStrings = c15331hArr;
        this.trie = iArr;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof C15331h) {
            return k((C15331h) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    /* renamed from: f */
    public int getSize() {
        return this.byteStrings.length;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof C15331h) {
            return q((C15331h) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof C15331h) {
            return r((C15331h) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C15331h get(int index) {
        return this.byteStrings[index];
    }

    /* renamed from: o, reason: from getter */
    public final C15331h[] getByteStrings() {
        return this.byteStrings;
    }

    /* renamed from: p, reason: from getter */
    public final int[] getTrie() {
        return this.trie;
    }

    public /* bridge */ boolean k(C15331h c15331h) {
        return super.contains(c15331h);
    }

    public /* bridge */ int q(C15331h c15331h) {
        return super.indexOf(c15331h);
    }

    public /* bridge */ int r(C15331h c15331h) {
        return super.lastIndexOf(c15331h);
    }
}
