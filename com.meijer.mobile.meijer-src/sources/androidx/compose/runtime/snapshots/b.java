package androidx.compose.runtime.snapshots;

import M0.w;
import M0.y;
import Z.X;
import Z.k0;
import androidx.compose.runtime.C5899z0;
import androidx.compose.runtime.snapshots.h;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u001a\n\u0002\u0010 \n\u0002\b\u0019\b\u0017\u0018\u0000 >2\u00020\u0001:\u0001iBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ%\u0010\u001c\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\tH\u0010¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\tH\u0010¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\tH\u0010¢\u0006\u0004\b$\u0010\u000fJG\u0010-\u001a\u00020\u00182\n\u0010%\u001a\u00060\u0002j\u0002`\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0000¢\u0006\u0004\b/\u0010\u000fJ\u001b\u00101\u001a\u00020\t2\n\u00100\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\t2\u0006\u00100\u001a\u000203H\u0000¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0005H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020'H\u0010¢\u0006\u0004\b>\u0010?R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\"\u0010J\u001a\u0002038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bF\u0010\u0014\u001a\u0004\bG\u0010H\"\u0004\bI\u00105R:\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\bG\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010W\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010Q8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010]\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010<R\"\u0010b\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010^\u001a\u0004\b_\u0010`\"\u0004\ba\u00109R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0014R\"\u0010g\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010c\u001a\u0004\bd\u0010\u0015\"\u0004\be\u0010fR\u0014\u0010h\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0015¨\u0006j"}, d2 = {"Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/g;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/i;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "S", "()V", "T", "A", "O", "", "I", "()Z", "R", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/b;", "Landroidx/compose/runtime/snapshots/h;", "C", "()Landroidx/compose/runtime/snapshots/h;", "d", "x", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/g;", "snapshot", "m", "(Landroidx/compose/runtime/snapshots/g;)V", "n", "o", "c", "r", "nextId", "LZ/X;", "LM0/w;", "modified", "", "LM0/y;", "optimisticMerges", "invalidSnapshots", "J", "(JLZ/X;Ljava/util/Map;Landroidx/compose/runtime/snapshots/i;)Landroidx/compose/runtime/snapshots/h;", "B", PreferencesHelper.PREF_ID, "K", "(J)V", "", "M", "(I)V", "", "handles", "N", "([I)V", "snapshots", "L", "(Landroidx/compose/runtime/snapshots/i;)V", "state", "p", "(LM0/w;)V", "g", "Lkotlin/jvm/functions/Function1;", "H", "()Lkotlin/jvm/functions/Function1;", "h", "k", "i", "j", "()I", "w", "writeCount", "<set-?>", "LZ/X;", "E", "()LZ/X;", "Q", "(LZ/X;)V", "", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", "l", "Landroidx/compose/runtime/snapshots/i;", "F", "()Landroidx/compose/runtime/snapshots/i;", "setPreviousIds$runtime_release", "previousIds", "[I", "G", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "Z", "D", "P", "(Z)V", "applied", "readOnly", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: p, reason: collision with root package name */
    private static final a f50602p = new a(null);

    /* renamed from: q, reason: collision with root package name */
    public static final int f50603q = 8;

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f50604r = new int[0];

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Unit> readObserver;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Function1<Object, Unit> writeObserver;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int writeCount;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private X<w> modified;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<? extends w> merged;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private i previousIds;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int[] previousPinnedSnapshots;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int snapshots;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean applied;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/runtime/snapshots/b$a;", "", "<init>", "()V", "", "EmptyIntArray", "[I", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(long j10, i iVar, Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(j10, iVar, null);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = i.INSTANCE.a();
        this.previousPinnedSnapshots = f50604r;
        this.snapshots = 1;
    }

    public final void N(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = ArraysKt.I(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public boolean h() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A() {
        /*
            r17 = this;
            r0 = r17
            Z.X r1 = r0.E()
            if (r1 == 0) goto L7f
            r0.S()
            r2 = 0
            r0.Q(r2)
            long r2 = r0.getSnapshotId()
            java.lang.Object[] r4 = r1.elements
            long[] r1 = r1.metadata
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L7f
            r6 = 0
            r7 = r6
        L1e:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L7a
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L38:
            if (r12 >= r10) goto L78
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L74
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            M0.w r13 = (M0.w) r13
            M0.y r13 = r13.getFirstStateRecord()
        L4e:
            if (r13 == 0) goto L74
            long r14 = r13.getSnapshotId()
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 == 0) goto L68
            androidx.compose.runtime.snapshots.i r14 = r0.previousIds
            long r15 = r13.getSnapshotId()
            java.lang.Long r15 = java.lang.Long.valueOf(r15)
            boolean r14 = kotlin.collections.CollectionsKt.h0(r14, r15)
            if (r14 == 0) goto L6f
        L68:
            long r14 = androidx.compose.runtime.snapshots.j.i()
            r13.i(r14)
        L6f:
            M0.y r13 = r13.getNext()
            goto L4e
        L74:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L38
        L78:
            if (r10 != r11) goto L7f
        L7a:
            if (r7 == r5) goto L7f
            int r7 = r7 + 1
            goto L1e
        L7f:
            r0.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.b.A():void");
    }

    private final void O() {
        int length = this.previousPinnedSnapshots.length;
        for (int i10 = 0; i10 < length; i10++) {
            j.Y(this.previousPinnedSnapshots[i10]);
        }
    }

    private final void S() {
        if (this.applied) {
            C5899z0.b("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void T() {
        if (!this.applied || ((g) this).pinningTrackingHandle >= 0) {
            return;
        }
        C5899z0.b("Unsupported operation on a disposed or applied snapshot");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.h C() {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.b.C():androidx.compose.runtime.snapshots.h");
    }

    /* renamed from: D, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    public X<w> E() {
        return this.modified;
    }

    /* renamed from: F, reason: from getter */
    public final i getPreviousIds() {
        return this.previousIds;
    }

    /* renamed from: G, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: H */
    public Function1<Object, Unit> g() {
        return this.readObserver;
    }

    public final h J(long nextId, X<w> modified, Map<y, ? extends y> optimisticMerges, i invalidSnapshots) {
        i iVar;
        Object[] objArr;
        long[] jArr;
        i iVar2;
        Object[] objArr2;
        long[] jArr2;
        int i10;
        long j10;
        int i11;
        y yVarK;
        i iVarS = getInvalid().t(getSnapshotId()).s(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList = null;
        List<? extends w> listP0 = null;
        if (length >= 0) {
            int i12 = 0;
            while (true) {
                long j11 = jArr3[i12];
                List<? extends w> arrayList2 = listP0;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j11 & 255) < 128) {
                            i10 = i13;
                            w wVar = (w) objArr3[(i12 << 3) + i15];
                            objArr2 = objArr3;
                            y firstStateRecord = wVar.getFirstStateRecord();
                            jArr2 = jArr3;
                            ArrayList arrayList3 = arrayList;
                            y yVarW = j.W(firstStateRecord, nextId, invalidSnapshots);
                            if (yVarW == null) {
                                j10 = j11;
                            } else {
                                j10 = j11;
                                y yVarW2 = j.W(firstStateRecord, getSnapshotId(), iVarS);
                                if (yVarW2 != null && yVarW2.getSnapshotId() != M0.g.c(1) && !Intrinsics.e(yVarW, yVarW2)) {
                                    i11 = i15;
                                    iVar2 = iVarS;
                                    y yVarW3 = j.W(firstStateRecord, getSnapshotId(), getInvalid());
                                    if (yVarW3 == null) {
                                        j.V();
                                        throw new KotlinNothingValueException();
                                    }
                                    if (optimisticMerges == null || (yVarK = optimisticMerges.get(yVarW)) == null) {
                                        yVarK = wVar.k(yVarW2, yVarW, yVarW3);
                                    }
                                    if (yVarK == null) {
                                        return new h.a(this);
                                    }
                                    if (!Intrinsics.e(yVarK, yVarW3)) {
                                        if (Intrinsics.e(yVarK, yVarW)) {
                                            ArrayList arrayList4 = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList4.add(TuplesKt.a(wVar, yVarW.e(getSnapshotId())));
                                            if (arrayList2 == null) {
                                                arrayList2 = new ArrayList<>();
                                            }
                                            List<? extends w> list = arrayList2;
                                            list.add(wVar);
                                            arrayList = arrayList4;
                                            arrayList2 = list;
                                        } else {
                                            arrayList = arrayList3 == null ? new ArrayList() : arrayList3;
                                            arrayList.add(!Intrinsics.e(yVarK, yVarW2) ? TuplesKt.a(wVar, yVarK) : TuplesKt.a(wVar, yVarW2.e(getSnapshotId())));
                                        }
                                    }
                                }
                                arrayList = arrayList3;
                            }
                            iVar2 = iVarS;
                            i11 = i15;
                            arrayList = arrayList3;
                        } else {
                            iVar2 = iVarS;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i10 = i13;
                            j10 = j11;
                            i11 = i15;
                        }
                        j11 = j10 >> i10;
                        i15 = i11 + 1;
                        objArr3 = objArr2;
                        i13 = i10;
                        jArr3 = jArr2;
                        iVarS = iVar2;
                    }
                    iVar = iVarS;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList5 = arrayList;
                    if (i14 != i13) {
                        listP0 = arrayList2;
                        arrayList = arrayList5;
                        break;
                    }
                    arrayList = arrayList5;
                } else {
                    iVar = iVarS;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listP0 = arrayList2;
                if (i12 == length) {
                    break;
                }
                i12++;
                objArr3 = objArr;
                jArr3 = jArr;
                iVarS = iVar;
            }
        }
        if (arrayList != null) {
            B();
            int size = arrayList.size();
            for (int i16 = 0; i16 < size; i16++) {
                Pair pair = (Pair) arrayList.get(i16);
                w wVar2 = (w) pair.a();
                y yVar = (y) pair.b();
                yVar.i(nextId);
                synchronized (j.J()) {
                    yVar.h(wVar2.getFirstStateRecord());
                    wVar2.f(yVar);
                    Unit unit = Unit.f143329a;
                }
            }
        }
        if (listP0 != null) {
            int size2 = listP0.size();
            for (int i17 = 0; i17 < size2; i17++) {
                modified.y(listP0.get(i17));
            }
            List<? extends w> list2 = this.merged;
            if (list2 != null) {
                listP0 = CollectionsKt.P0(list2, listP0);
            }
            this.merged = listP0;
        }
        return h.b.f50628a;
    }

    public final void M(int id2) {
        if (id2 >= 0) {
            this.previousPinnedSnapshots = ArraysKt.H(this.previousPinnedSnapshots, id2);
        }
    }

    public final void P(boolean z10) {
        this.applied = z10;
    }

    public void Q(X<w> x10) {
        this.modified = x10;
    }

    public b R(Function1<Object, Unit> readObserver, Function1<Object, Unit> writeObserver) {
        Map<N0.b, N0.a> mapD;
        c cVar;
        z();
        T();
        E0.e eVar = N0.c.f20529a;
        Function1<Object, Unit> function1 = readObserver;
        Function1<Object, Unit> function1B = writeObserver;
        if (eVar != null) {
            Pair<N0.a, Map<N0.b, N0.a>> pairE = N0.c.e(eVar, this, false, function1, function1B);
            N0.a aVarC = pairE.c();
            Function1<Object, Unit> function1A = aVarC.a();
            function1B = aVarC.b();
            mapD = pairE.d();
            function1 = function1A;
        } else {
            mapD = null;
        }
        K(getSnapshotId());
        synchronized (j.J()) {
            long j10 = j.f50646f;
            j.f50646f++;
            j.f50645e = j.f50645e.t(j10);
            i invalid = getInvalid();
            u(invalid.t(j10));
            cVar = new c(j10, j.A(invalid, getSnapshotId() + 1, j10), j.L(function1, g(), false, 4, null), j.M(function1B, k()), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (j.J()) {
                long j11 = j.f50646f;
                j.f50646f++;
                v(j11);
                j.f50645e = j.f50645e.t(getSnapshotId());
                Unit unit = Unit.f143329a;
            }
            u(j.A(getInvalid(), snapshotId + 1, getSnapshotId()));
        }
        if (eVar != null) {
            N0.c.b(eVar, this, cVar, mapD);
        }
        return cVar;
    }

    @Override // androidx.compose.runtime.snapshots.g
    /* renamed from: j, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public Function1<Object, Unit> k() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void m(g snapshot) {
        this.snapshots++;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void n(g snapshot) {
        if (!(this.snapshots > 0)) {
            C5899z0.a("no pending nested snapshots");
        }
        int i10 = this.snapshots - 1;
        this.snapshots = i10;
        if (i10 != 0 || this.applied) {
            return;
        }
        A();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void o() {
        if (this.applied || getDisposed()) {
            return;
        }
        B();
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void w(int i10) {
        this.writeCount = i10;
    }

    @Override // androidx.compose.runtime.snapshots.g
    public g x(Function1<Object, Unit> readObserver) {
        Function1<Object, Unit> function1;
        Map<N0.b, N0.a> mapD;
        d dVar;
        z();
        T();
        long snapshotId = getSnapshotId();
        b bVar = this instanceof androidx.compose.runtime.snapshots.a ? null : this;
        E0.e eVar = N0.c.f20529a;
        if (eVar != null) {
            Pair<N0.a, Map<N0.b, N0.a>> pairE = N0.c.e(eVar, bVar, true, readObserver, null);
            N0.a aVarC = pairE.c();
            Function1<Object, Unit> function1A = aVarC.a();
            aVarC.b();
            function1 = function1A;
            mapD = pairE.d();
        } else {
            function1 = readObserver;
            mapD = null;
        }
        K(getSnapshotId());
        synchronized (j.J()) {
            long j10 = j.f50646f;
            j.f50646f++;
            j.f50645e = j.f50645e.t(j10);
            dVar = new d(j10, j.A(getInvalid(), snapshotId + 1, j10), j.L(function1, g(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (j.J()) {
                long j11 = j.f50646f;
                j.f50646f++;
                v(j11);
                j.f50645e = j.f50645e.t(getSnapshotId());
                Unit unit = Unit.f143329a;
            }
            u(j.A(getInvalid(), snapshotId2 + 1, getSnapshotId()));
        }
        if (eVar != null) {
            N0.c.b(eVar, bVar, dVar, mapD);
        }
        return dVar;
    }

    public final void B() {
        K(getSnapshotId());
        Unit unit = Unit.f143329a;
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (j.J()) {
                long j10 = j.f50646f;
                j.f50646f++;
                v(j10);
                j.f50645e = j.f50645e.t(getSnapshotId());
            }
            u(j.A(getInvalid(), snapshotId + 1, getSnapshotId()));
        }
    }

    public boolean I() {
        X<w> xE = E();
        if (xE == null || !xE.e()) {
            return false;
        }
        return true;
    }

    public final void K(long id2) {
        synchronized (j.J()) {
            this.previousIds = this.previousIds.t(id2);
            Unit unit = Unit.f143329a;
        }
    }

    public final void L(i snapshots) {
        synchronized (j.J()) {
            this.previousIds = this.previousIds.s(snapshots);
            Unit unit = Unit.f143329a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void c() {
        j.f50645e = j.f50645e.p(getSnapshotId()).o(this.previousIds);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void d() {
        if (!getDisposed()) {
            super.d();
            n(this);
            N0.c.d(this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void p(w state) {
        X<w> xE = E();
        if (xE == null) {
            xE = k0.a();
            Q(xE);
        }
        xE.h(state);
    }

    @Override // androidx.compose.runtime.snapshots.g
    public void r() {
        O();
        super.r();
    }
}
