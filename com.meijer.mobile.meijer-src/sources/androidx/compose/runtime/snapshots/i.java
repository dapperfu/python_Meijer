package androidx.compose.runtime.snapshots;

import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 '2\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0001:\u0001!B5\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0002j\u0002`\u0003\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00002\n\u0010\f\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u001a\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0002j\u0002`\u00030\u0018H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001c\u001a\u00060\u0002j\u0002`\u00032\n\u0010\u001b\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0018\u0010\u0006\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u001c\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "upperSet", "lowerSet", "lowerBound", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "belowBound", "<init>", "(JJJ[J)V", PreferencesHelper.PREF_ID, "", "q", "(J)Z", "t", "(J)Landroidx/compose/runtime/snapshots/i;", "p", "ids", "o", "(Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/i;", "bits", "s", "", "iterator", "()Ljava/util/Iterator;", "default", "r", "(J)J", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "c", "d", "[J", "e", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class i implements Iterable<Long>, KMappedMarker {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    private static final i f50630f = new i(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long upperSet;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long lowerSet;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long lowerBound;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long[] belowBound;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/snapshots/i$a;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/i;", "EMPTY", "Landroidx/compose/runtime/snapshots/i;", "a", "()Landroidx/compose/runtime/snapshots/i;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final i a() {
            return i.f50630f;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\f\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {252, 256, 263}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Long>, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        Object f50635b;

        /* renamed from: c, reason: collision with root package name */
        int f50636c;

        /* renamed from: d, reason: collision with root package name */
        int f50637d;

        /* renamed from: e, reason: collision with root package name */
        int f50638e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f50639f;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = i.this.new b(continuation);
            bVar.f50639f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SequenceScope<? super Long> sequenceScope, Continuation<? super Unit> continuation) {
            return ((b) create(sequenceScope, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0079, code lost:
        
            if (r15.c(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00b5, code lost:
        
            if (r13.c(r4, r20) == r1) goto L40;
         */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00c8  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009b -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00b5 -> B:30:0x00b8). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d3 -> B:43:0x00f4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f2 -> B:42:0x00f3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // java.lang.Iterable
    public Iterator<Long> iterator() {
        return SequencesKt.b(new b(null)).iterator();
    }

    public final i o(i ids) {
        i iVarP;
        i iVar = f50630f;
        if (ids == iVar) {
            return this;
        }
        if (this == iVar) {
            return iVar;
        }
        long j10 = ids.lowerBound;
        long j11 = this.lowerBound;
        if (j10 == j11) {
            long[] jArr = ids.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new i((~ids.upperSet) & this.upperSet, (~ids.lowerSet) & this.lowerSet, j11, jArr2);
            }
        }
        long[] jArr3 = ids.belowBound;
        if (jArr3 != null) {
            iVarP = this;
            for (long j12 : jArr3) {
                iVarP = iVarP.p(j12);
            }
        } else {
            iVarP = this;
        }
        if (ids.lowerSet != 0) {
            for (int i10 = 0; i10 < 64; i10++) {
                if ((ids.lowerSet & (1 << i10)) != 0) {
                    iVarP = iVarP.p(ids.lowerBound + i10);
                }
            }
        }
        if (ids.upperSet != 0) {
            for (int i11 = 0; i11 < 64; i11++) {
                if ((ids.upperSet & (1 << i11)) != 0) {
                    iVarP = iVarP.p(ids.lowerBound + i11 + 64);
                }
            }
        }
        return iVarP;
    }

    public final i p(long id2) {
        long[] jArr;
        int iA;
        long j10 = this.lowerBound;
        long j11 = id2 - j10;
        if (j11 >= 0 && j11 < 64) {
            long j12 = 1 << ((int) j11);
            long j13 = this.lowerSet;
            if ((j13 & j12) != 0) {
                return new i(this.upperSet, j13 & (~j12), j10, this.belowBound);
            }
        } else if (j11 >= 64 && j11 < 128) {
            long j14 = 1 << (((int) j11) - 64);
            long j15 = this.upperSet;
            if ((j15 & j14) != 0) {
                return new i(j15 & (~j14), this.lowerSet, j10, this.belowBound);
            }
        } else if (j11 < 0 && (jArr = this.belowBound) != null && (iA = M0.g.a(jArr, id2)) >= 0) {
            return new i(this.upperSet, this.lowerSet, this.lowerBound, M0.g.e(jArr, iA));
        }
        return this;
    }

    public final boolean q(long id2) {
        long[] jArr;
        long j10 = id2 - this.lowerBound;
        return (j10 < 0 || j10 >= 64) ? (j10 < 64 || j10 >= 128) ? j10 <= 0 && (jArr = this.belowBound) != null && M0.g.a(jArr, id2) >= 0 : ((1 << (((int) j10) + (-64))) & this.upperSet) != 0 : ((1 << ((int) j10)) & this.lowerSet) != 0;
    }

    public final long r(long j10) {
        long[] jArr = this.belowBound;
        if (jArr != null) {
            return jArr[0];
        }
        if (this.lowerSet != 0) {
            return this.lowerBound + Long.numberOfTrailingZeros(r0);
        }
        return this.upperSet != 0 ? this.lowerBound + 64 + Long.numberOfTrailingZeros(r0) : j10;
    }

    public final i s(i bits) {
        i iVarT;
        i iVar = f50630f;
        if (bits == iVar) {
            return this;
        }
        if (this == iVar) {
            return bits;
        }
        long j10 = bits.lowerBound;
        long j11 = this.lowerBound;
        if (j10 == j11) {
            long[] jArr = bits.belowBound;
            long[] jArr2 = this.belowBound;
            if (jArr == jArr2) {
                return new i(bits.upperSet | this.upperSet, bits.lowerSet | this.lowerSet, j11, jArr2);
            }
        }
        int i10 = 0;
        if (this.belowBound == null) {
            long[] jArr3 = this.belowBound;
            if (jArr3 != null) {
                for (long j12 : jArr3) {
                    bits = bits.t(j12);
                }
            }
            if (this.lowerSet != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if ((this.lowerSet & (1 << i11)) != 0) {
                        bits = bits.t(this.lowerBound + i11);
                    }
                }
            }
            if (this.upperSet != 0) {
                while (i10 < 64) {
                    if ((this.upperSet & (1 << i10)) != 0) {
                        bits = bits.t(this.lowerBound + i10 + 64);
                    }
                    i10++;
                }
            }
            return bits;
        }
        long[] jArr4 = bits.belowBound;
        if (jArr4 != null) {
            iVarT = this;
            for (long j13 : jArr4) {
                iVarT = iVarT.t(j13);
            }
        } else {
            iVarT = this;
        }
        if (bits.lowerSet != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if ((bits.lowerSet & (1 << i12)) != 0) {
                    iVarT = iVarT.t(bits.lowerBound + i12);
                }
            }
        }
        if (bits.upperSet != 0) {
            while (i10 < 64) {
                if ((bits.upperSet & (1 << i10)) != 0) {
                    iVarT = iVarT.t(bits.lowerBound + i10 + 64);
                }
                i10++;
            }
        }
        return iVarT;
    }

    public final i t(long id2) {
        long j10;
        long j11;
        long[] jArrB;
        long j12 = this.lowerBound;
        long j13 = id2 - j12;
        long j14 = 0;
        if (j13 >= 0 && j13 < 64) {
            long j15 = 1 << ((int) j13);
            long j16 = this.lowerSet;
            if ((j16 & j15) == 0) {
                return new i(this.upperSet, j16 | j15, j12, this.belowBound);
            }
        } else if (j13 >= 64 && j13 < 128) {
            long j17 = 1 << (((int) j13) - 64);
            long j18 = this.upperSet;
            if ((j18 & j17) == 0) {
                return new i(j18 | j17, this.lowerSet, j12, this.belowBound);
            }
        } else if (j13 < 128) {
            long[] jArr = this.belowBound;
            if (jArr == null) {
                return new i(this.upperSet, this.lowerSet, j12, new long[]{id2});
            }
            int iA = M0.g.a(jArr, id2);
            if (iA < 0) {
                return new i(this.upperSet, this.lowerSet, this.lowerBound, M0.g.d(jArr, -(iA + 1), id2));
            }
        } else if (!q(id2)) {
            long j19 = this.upperSet;
            long j20 = this.lowerSet;
            long j21 = this.lowerBound;
            long j22 = 64;
            long j23 = ((id2 + 1) / j22) * j22;
            if (j23 < 0) {
                j23 = 9223372036854775680L;
            }
            M0.f fVar = null;
            long j24 = j19;
            while (true) {
                if (j21 >= j23) {
                    j10 = j20;
                    j11 = j21;
                    break;
                }
                if (j20 != j14) {
                    if (fVar == null) {
                        fVar = new M0.f(this.belowBound);
                    }
                    int i10 = 0;
                    while (i10 < 64) {
                        long j25 = j14;
                        if ((j20 & (1 << i10)) != j14) {
                            fVar.a(j21 + i10);
                        }
                        i10++;
                        j14 = j25;
                    }
                }
                j10 = j14;
                if (j24 == j10) {
                    j11 = j23;
                    break;
                }
                j21 += j22;
                j20 = j24;
                j14 = j10;
                j24 = j14;
            }
            if (fVar == null || (jArrB = fVar.b()) == null) {
                jArrB = this.belowBound;
            }
            return new i(j24, j10, j11, jArrB).t(id2);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(CollectionsKt.x(this, 10));
        Iterator<Long> it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().longValue()));
        }
        sb2.append(M0.a.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }

    private i(long j10, long j11, long j12, long[] jArr) {
        this.upperSet = j10;
        this.lowerSet = j11;
        this.lowerBound = j12;
        this.belowBound = jArr;
    }
}
