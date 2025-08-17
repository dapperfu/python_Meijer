package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\"\u0010!J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b#\u0010!R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\"\u0010.\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010(\u001a\u0004\b$\u0010*\"\u0004\b,\u0010-R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000201008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00102R-\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0003048FX\u0086\u0084\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b+\u00107R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0003098F¢\u0006\u0006\u001a\u0004\b5\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Landroidx/compose/runtime/x0;", "", "", "Landroidx/compose/runtime/V;", "keyInfos", "", "startIndex", "<init>", "(Ljava/util/List;I)V", "key", "dataKey", "d", "(ILjava/lang/Object;)Landroidx/compose/runtime/V;", "keyInfo", "", "h", "(Landroidx/compose/runtime/V;)Z", "from", "to", "", "k", "(II)V", "count", "j", "(III)V", "insertIndex", "i", "(Landroidx/compose/runtime/V;I)V", "group", "newCount", "n", "(II)Z", "m", "(Landroidx/compose/runtime/V;)I", "g", "o", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "e", "()I", "c", "l", "(I)V", "groupIndex", "usedKeys", "LZ/K;", "Landroidx/compose/runtime/M;", "LZ/K;", "groupInfos", "LD0/b;", "f", "Lkotlin/Lazy;", "()LZ/W;", "keyMap", "", "used", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5753x0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<V> keyInfos;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int startIndex;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int groupIndex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<V> usedKeys;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Z.K<M> groupInfos;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy keyMap;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LD0/b;", "", "Landroidx/compose/runtime/V;", "c", "()LZ/W;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.runtime.x0$a */
    static final class a extends Lambda implements Function0<D0.b<Object, V>> {
        a() {
            super(0);
        }

        public final Z.W<Object, Object> c() {
            Z.W<Object, Object> wN = ComposerKt.N(C5753x0.this.b().size());
            C5753x0 c5753x0 = C5753x0.this;
            int size = c5753x0.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                V v10 = c5753x0.b().get(i10);
                D0.b.a(wN, ComposerKt.E(v10), v10);
            }
            return wN;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ D0.b<Object, V> invoke() {
            return D0.b.b(c());
        }
    }

    /* renamed from: a, reason: from getter */
    public final int getGroupIndex() {
        return this.groupIndex;
    }

    public final List<V> b() {
        return this.keyInfos;
    }

    public final Z.W<Object, Object> c() {
        return ((D0.b) this.keyMap.getValue()).getMap();
    }

    public final V d(int key, Object dataKey) {
        return (V) D0.b.l(c(), dataKey != null ? new JoinedKey(Integer.valueOf(key), dataKey) : Integer.valueOf(key));
    }

    /* renamed from: e, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    public final List<V> f() {
        return this.usedKeys;
    }

    public final int g(V keyInfo) {
        M mB = this.groupInfos.b(keyInfo.getLocation());
        if (mB != null) {
            return mB.getNodeIndex();
        }
        return -1;
    }

    public final boolean h(V keyInfo) {
        return this.usedKeys.add(keyInfo);
    }

    public final void i(V keyInfo, int insertIndex) {
        this.groupInfos.r(keyInfo.getLocation(), new M(-1, insertIndex, 0));
    }

    public final void j(int from, int to2, int count) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (from > to2) {
            Z.K<M> k10 = this.groupInfos;
            Object[] objArr = k10.values;
            long[] jArr = k10.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j13 = jArr[i10];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            M m10 = (M) objArr[(i10 << 3) + i12];
                            j11 = j12;
                            int nodeIndex = m10.getNodeIndex();
                            if (from <= nodeIndex && nodeIndex < from + count) {
                                m10.e((nodeIndex - from) + to2);
                            } else if (to2 <= nodeIndex && nodeIndex < from) {
                                m10.e(nodeIndex + count);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i12++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i11 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (to2 <= from) {
                return;
            }
            Z.K<M> k11 = this.groupInfos;
            Object[] objArr2 = k11.values;
            long[] jArr2 = k11.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j14 = jArr2[i13];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j14 & 255) < 128) {
                            M m11 = (M) objArr2[(i13 << 3) + i15];
                            int nodeIndex2 = m11.getNodeIndex();
                            if (from <= nodeIndex2 && nodeIndex2 < from + count) {
                                m11.e((nodeIndex2 - from) + to2);
                            } else if (from + 1 <= nodeIndex2 && nodeIndex2 < to2) {
                                m11.e(nodeIndex2 - count);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i14 != 8) {
                        return;
                    }
                }
                if (i13 == length2) {
                    return;
                } else {
                    i13++;
                }
            }
        }
    }

    public final void k(int from, int to2) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        long j12 = -9187201950435737472L;
        if (from > to2) {
            Z.K<M> k10 = this.groupInfos;
            Object[] objArr = k10.values;
            long[] jArr = k10.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                long j13 = jArr[i10];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            M m10 = (M) objArr[(i10 << 3) + i12];
                            j11 = j12;
                            int slotIndex = m10.getSlotIndex();
                            if (slotIndex == from) {
                                m10.f(to2);
                            } else if (to2 <= slotIndex && slotIndex < from) {
                                m10.f(slotIndex + 1);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i12++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i11 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i10 == length) {
                    return;
                }
                i10++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (to2 <= from) {
                return;
            }
            Z.K<M> k11 = this.groupInfos;
            Object[] objArr2 = k11.values;
            long[] jArr2 = k11.metadata;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j14 = jArr2[i13];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j14 & 255) < 128) {
                            M m11 = (M) objArr2[(i13 << 3) + i15];
                            int slotIndex2 = m11.getSlotIndex();
                            if (slotIndex2 == from) {
                                m11.f(to2);
                            } else if (from + 1 <= slotIndex2 && slotIndex2 < to2) {
                                m11.f(slotIndex2 - 1);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i14 != 8) {
                        return;
                    }
                }
                if (i13 == length2) {
                    return;
                } else {
                    i13++;
                }
            }
        }
    }

    public final void l(int i10) {
        this.groupIndex = i10;
    }

    public final int m(V keyInfo) {
        M mB = this.groupInfos.b(keyInfo.getLocation());
        if (mB != null) {
            return mB.getSlotIndex();
        }
        return -1;
    }

    public final boolean n(int group, int newCount) {
        int nodeIndex;
        M mB = this.groupInfos.b(group);
        if (mB == null) {
            return false;
        }
        int nodeIndex2 = mB.getNodeIndex();
        int nodeCount = newCount - mB.getNodeCount();
        mB.d(newCount);
        if (nodeCount == 0) {
            return true;
        }
        Z.K<M> k10 = this.groupInfos;
        Object[] objArr = k10.values;
        long[] jArr = k10.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        M m10 = (M) objArr[(i10 << 3) + i12];
                        if (m10.getNodeIndex() >= nodeIndex2 && !Intrinsics.e(m10, mB) && (nodeIndex = m10.getNodeIndex() + nodeCount) >= 0) {
                            m10.e(nodeIndex);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final int o(V keyInfo) {
        M mB = this.groupInfos.b(keyInfo.getLocation());
        return mB != null ? mB.getNodeCount() : keyInfo.getNodes();
    }

    public C5753x0(List<V> list, int i10) {
        boolean z10;
        this.keyInfos = list;
        this.startIndex = i10;
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            C5757z0.a("Invalid start index");
        }
        this.usedKeys = new ArrayList();
        Z.K<M> k10 = new Z.K<>(0, 1, null);
        int size = list.size();
        int nodes = 0;
        for (int i11 = 0; i11 < size; i11++) {
            V v10 = this.keyInfos.get(i11);
            k10.r(v10.getLocation(), new M(i11, nodes, v10.getNodes()));
            nodes += v10.getNodes();
        }
        this.groupInfos = k10;
        this.keyMap = LazyKt.b(new a());
    }
}
