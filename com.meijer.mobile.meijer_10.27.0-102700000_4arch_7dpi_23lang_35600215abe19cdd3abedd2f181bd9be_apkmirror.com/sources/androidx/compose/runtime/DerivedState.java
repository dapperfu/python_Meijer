package androidx.compose.runtime;

import J0.IntRef;
import androidx.compose.runtime.B;
import androidx.compose.runtime.snapshots.g;
import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001/B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010\u0018\u001a\u00028\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u00060"}, d2 = {"Landroidx/compose/runtime/A;", "T", "LM0/x;", "Landroidx/compose/runtime/B;", "Lkotlin/Function0;", "calculation", "Landroidx/compose/runtime/n1;", "policy", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/n1;)V", "Landroidx/compose/runtime/A$a;", "readable", "Landroidx/compose/runtime/snapshots/g;", "snapshot", "", "forceDependencyReads", "N", "(Landroidx/compose/runtime/A$a;Landroidx/compose/runtime/snapshots/g;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/A$a;", "", "O", "()Ljava/lang/String;", "LM0/y;", "M", "(Landroidx/compose/runtime/snapshots/g;)LM0/y;", "value", "", "f", "(LM0/y;)V", "toString", "b", "Lkotlin/jvm/functions/Function0;", "c", "Landroidx/compose/runtime/n1;", "e", "()Landroidx/compose/runtime/n1;", "d", "Landroidx/compose/runtime/A$a;", "first", "v", "()LM0/y;", "firstStateRecord", "getValue", "()Ljava/lang/Object;", "Landroidx/compose/runtime/B$a;", "J", "()Landroidx/compose/runtime/B$a;", "currentRecord", "a", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.runtime.A, reason: from toString */
/* loaded from: classes.dex */
final class DerivedState<T> extends M0.x implements B<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<T> calculation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final n1<T> policy;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private a<T> first = new a<>(androidx.compose.runtime.snapshots.j.I().getSnapshotId());

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0007\u0018\u0000 <*\u0004\b\u0001\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001:B\u0013\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0016\u001a\u00020\u00152\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\u00020\u00182\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aR&\u0010\u001f\u001a\u00060\u0004j\u0002`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\bR\"\u0010%\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R(\u0010-\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00105\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00109\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u0010$R\u0014\u0010;\u001a\u00028\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00102¨\u0006="}, d2 = {"Landroidx/compose/runtime/A$a;", "T", "LM0/y;", "Landroidx/compose/runtime/B$a;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "<init>", "(J)V", "value", "", "c", "(LM0/y;)V", "d", "()LM0/y;", "e", "(J)LM0/y;", "Landroidx/compose/runtime/B;", "derivedState", "Landroidx/compose/runtime/snapshots/g;", "snapshot", "", "l", "(Landroidx/compose/runtime/B;Landroidx/compose/runtime/snapshots/g;)Z", "", "m", "(Landroidx/compose/runtime/B;Landroidx/compose/runtime/snapshots/g;)I", "J", "getValidSnapshotId", "()J", "q", "validSnapshotId", "I", "getValidSnapshotWriteCount", "()I", "r", "(I)V", "validSnapshotWriteCount", "LZ/a0;", "LM0/w;", "LZ/a0;", "b", "()LZ/a0;", "n", "(LZ/a0;)V", "dependencies", "", "f", "Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "result", "g", "getResultHash", "p", "resultHash", "a", "currentValue", "h", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.A$a */
    public static final class a<T> extends M0.y implements B.a<T> {

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f49882i = 8;

        /* renamed from: j, reason: collision with root package name */
        private static final Object f49883j = new Object();

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long validSnapshotId;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int validSnapshotWriteCount;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private Z.a0<M0.w> dependencies;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Object result;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private int resultHash;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/A$a$a;", "", "<init>", "()V", "Unset", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.A$a$a, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Object a() {
                return a.f49883j;
            }
        }

        @Override // androidx.compose.runtime.B.a
        public T a() {
            return (T) this.result;
        }

        @Override // androidx.compose.runtime.B.a
        public Z.a0<M0.w> b() {
            return this.dependencies;
        }

        @Override // M0.y
        public void c(M0.y value) {
            Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) value;
            n(aVar.b());
            this.result = aVar.result;
            this.resultHash = aVar.resultHash;
        }

        @Override // M0.y
        public M0.y e(long snapshotId) {
            return new a(snapshotId);
        }

        /* renamed from: k, reason: from getter */
        public final Object getResult() {
            return this.result;
        }

        public final int m(B<?> derivedState, androidx.compose.runtime.snapshots.g snapshot) {
            Z.a0<M0.w> a0VarB;
            int iA;
            int i10;
            int i11;
            int i12;
            synchronized (androidx.compose.runtime.snapshots.j.J()) {
                a0VarB = b();
            }
            int i13 = 7;
            if (!a0VarB.h()) {
                return 7;
            }
            D0.c<C> cVarC = o1.c();
            C[] cArr = cVarC.content;
            int size = cVarC.getSize();
            for (int i14 = 0; i14 < size; i14++) {
                cArr[i14].b(derivedState);
            }
            try {
                Object[] objArr = a0VarB.keys;
                int[] iArr = a0VarB.values;
                long[] jArr = a0VarB.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    iA = 7;
                    int i15 = 0;
                    while (true) {
                        long j10 = jArr[i15];
                        if ((((~j10) << i13) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i16 = 8;
                            int i17 = 8 - ((~(i15 - length)) >>> 31);
                            int i18 = 0;
                            while (i18 < i17) {
                                if ((j10 & 255) < 128) {
                                    int i19 = (i15 << 3) + i18;
                                    i11 = i13;
                                    M0.w wVar = (M0.w) objArr[i19];
                                    i12 = i16;
                                    if (iArr[i19] == 1) {
                                        M0.y yVarM = wVar instanceof DerivedState ? ((DerivedState) wVar).M(snapshot) : androidx.compose.runtime.snapshots.j.H(wVar.getFirstStateRecord(), snapshot);
                                        iA = (((iA * 31) + J0.q.a(yVarM)) * 31) + Long.hashCode(yVarM.getSnapshotId());
                                    }
                                } else {
                                    i11 = i13;
                                    i12 = i16;
                                }
                                j10 >>= i12;
                                i18++;
                                i16 = i12;
                                i13 = i11;
                            }
                            i10 = i13;
                            if (i17 != i16) {
                                break;
                            }
                        } else {
                            i10 = i13;
                        }
                        if (i15 == length) {
                            i13 = iA;
                            break;
                        }
                        i15++;
                        i13 = i10;
                    }
                }
                iA = i13;
                Unit unit = Unit.f142422a;
                C[] cArr2 = cVarC.content;
                int size2 = cVarC.getSize();
                for (int i20 = 0; i20 < size2; i20++) {
                    cArr2[i20].a(derivedState);
                }
                return iA;
            } catch (Throwable th2) {
                C[] cArr3 = cVarC.content;
                int size3 = cVarC.getSize();
                for (int i21 = 0; i21 < size3; i21++) {
                    cArr3[i21].a(derivedState);
                }
                throw th2;
            }
        }

        public void n(Z.a0<M0.w> a0Var) {
            this.dependencies = a0Var;
        }

        public final void o(Object obj) {
            this.result = obj;
        }

        public final void p(int i10) {
            this.resultHash = i10;
        }

        public final void q(long j10) {
            this.validSnapshotId = j10;
        }

        public final void r(int i10) {
            this.validSnapshotWriteCount = i10;
        }

        public a(long j10) {
            super(j10);
            this.dependencies = Z.b0.a();
            this.result = f49883j;
        }

        @Override // M0.y
        public M0.y d() {
            return e(androidx.compose.runtime.snapshots.j.I().getSnapshotId());
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean l(androidx.compose.runtime.B<?> r6, androidx.compose.runtime.snapshots.g r7) {
            /*
                r5 = this;
                java.lang.Object r0 = androidx.compose.runtime.snapshots.j.J()
                monitor-enter(r0)
                long r1 = r5.validSnapshotId     // Catch: java.lang.Throwable -> L1c
                long r3 = r7.getSnapshotId()     // Catch: java.lang.Throwable -> L1c
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L1e
                int r1 = r5.validSnapshotWriteCount     // Catch: java.lang.Throwable -> L1c
                int r4 = r7.getWriteCount()     // Catch: java.lang.Throwable -> L1c
                if (r1 == r4) goto L1a
                goto L1e
            L1a:
                r1 = r3
                goto L1f
            L1c:
                r6 = move-exception
                goto L4f
            L1e:
                r1 = r2
            L1f:
                monitor-exit(r0)
                java.lang.Object r0 = r5.result
                java.lang.Object r4 = androidx.compose.runtime.DerivedState.a.f49883j
                if (r0 == r4) goto L31
                if (r1 == 0) goto L32
                int r0 = r5.resultHash
                int r6 = r5.m(r6, r7)
                if (r0 != r6) goto L31
                goto L32
            L31:
                r2 = r3
            L32:
                if (r2 == 0) goto L4e
                if (r1 == 0) goto L4e
                java.lang.Object r6 = androidx.compose.runtime.snapshots.j.J()
                monitor-enter(r6)
                long r0 = r7.getSnapshotId()     // Catch: java.lang.Throwable -> L4b
                r5.validSnapshotId = r0     // Catch: java.lang.Throwable -> L4b
                int r7 = r7.getWriteCount()     // Catch: java.lang.Throwable -> L4b
                r5.validSnapshotWriteCount = r7     // Catch: java.lang.Throwable -> L4b
                kotlin.Unit r7 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L4b
                monitor-exit(r6)
                return r2
            L4b:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            L4e:
                return r2
            L4f:
                monitor-exit(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedState.a.l(androidx.compose.runtime.B, androidx.compose.runtime.snapshots.g):boolean");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.A$b */
    static final class b extends Lambda implements Function1<Object, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ DerivedState<T> f49889f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ IntRef f49890g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Z.S<M0.w> f49891h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f49892i;

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke2(obj);
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(DerivedState<T> derivedState, IntRef intRef, Z.S<M0.w> s10, int i10) {
            super(1);
            this.f49889f = derivedState;
            this.f49890g = intRef;
            this.f49891h = s10;
            this.f49892i = i10;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Object obj) {
            if (obj == this.f49889f) {
                throw new IllegalStateException("A derived state calculation cannot read itself");
            }
            if (obj instanceof M0.w) {
                int element = this.f49890g.getElement();
                Z.S<M0.w> s10 = this.f49891h;
                s10.u(obj, Math.min(element - this.f49892i, s10.e(obj, a.e.API_PRIORITY_OTHER)));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.DerivedState.a<T> N(androidx.compose.runtime.DerivedState.a<T> r22, androidx.compose.runtime.snapshots.g r23, boolean r24, kotlin.jvm.functions.Function0<? extends T> r25) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.DerivedState.N(androidx.compose.runtime.A$a, androidx.compose.runtime.snapshots.g, boolean, kotlin.jvm.functions.Function0):androidx.compose.runtime.A$a");
    }

    private final String O() {
        a aVar = (a) androidx.compose.runtime.snapshots.j.G(this.first);
        return aVar.l(this, androidx.compose.runtime.snapshots.g.INSTANCE.c()) ? String.valueOf(aVar.getResult()) : "<Not calculated>";
    }

    @Override // androidx.compose.runtime.B
    public B.a<T> J() {
        androidx.compose.runtime.snapshots.g gVarC = androidx.compose.runtime.snapshots.g.INSTANCE.c();
        return N((a) androidx.compose.runtime.snapshots.j.H(this.first, gVarC), gVarC, false, this.calculation);
    }

    public final M0.y M(androidx.compose.runtime.snapshots.g snapshot) {
        return N((a) androidx.compose.runtime.snapshots.j.H(this.first, snapshot), snapshot, false, this.calculation);
    }

    @Override // androidx.compose.runtime.B
    public n1<T> e() {
        return this.policy;
    }

    @Override // M0.w
    public void f(M0.y value) {
        Intrinsics.h(value, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.first = (a) value;
    }

    @Override // androidx.compose.runtime.z1
    public T getValue() {
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        Function1<Object, Unit> function1G = companion.c().g();
        if (function1G != null) {
            function1G.invoke(this);
        }
        androidx.compose.runtime.snapshots.g gVarC = companion.c();
        return (T) N((a) androidx.compose.runtime.snapshots.j.H(this.first, gVarC), gVarC, true, this.calculation).getResult();
    }

    public String toString() {
        return "DerivedState(value=" + O() + ")@" + hashCode();
    }

    @Override // M0.w
    /* renamed from: v */
    public M0.y getFirstStateRecord() {
        return this.first;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DerivedState(Function0<? extends T> function0, n1<T> n1Var) {
        this.calculation = function0;
        this.policy = n1Var;
    }
}
