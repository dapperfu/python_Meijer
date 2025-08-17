package androidx.compose.runtime;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b*\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\u00072\u0018\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\t¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00102\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0018J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b.\u0010/R\u0016\u00101\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00100R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R$\u0010;\u001a\u0004\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u001e\u0010A\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010@R*\u0010C\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010BR$\u0010H\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010K\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bI\u0010E\"\u0004\bJ\u0010GR\u0011\u0010M\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bL\u0010ER\u0011\u0010O\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bN\u0010ER$\u0010R\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010E\"\u0004\bQ\u0010GR$\u0010U\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bS\u0010E\"\u0004\bT\u0010GR$\u0010X\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010E\"\u0004\bW\u0010GR$\u0010[\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bY\u0010E\"\u0004\bZ\u0010GR$\u0010^\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\\\u0010E\"\u0004\b]\u0010GR$\u0010a\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b_\u0010E\"\u0004\b`\u0010GR$\u0010c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010E\"\u0004\b0\u0010GR$\u0010f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010E\"\u0004\be\u0010GR\u0011\u0010h\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bg\u0010E¨\u0006i"}, d2 = {"Landroidx/compose/runtime/I0;", "Landroidx/compose/runtime/T0;", "Landroidx/compose/runtime/H0;", "Landroidx/compose/runtime/K0;", "owner", "<init>", "(Landroidx/compose/runtime/K0;)V", "Landroidx/compose/runtime/B;", "LZ/W;", "", "dependencies", "", "f", "(Landroidx/compose/runtime/B;LZ/W;)Z", "Landroidx/compose/runtime/Composer;", "composer", "", "g", "(Landroidx/compose/runtime/Composer;)V", "value", "Landroidx/compose/runtime/T;", "v", "(Ljava/lang/Object;)Landroidx/compose/runtime/T;", "A", "()V", "e", "invalidate", "Lkotlin/Function2;", "", "block", "a", "(Lkotlin/jvm/functions/Function2;)V", "token", "N", "(I)V", "C", "instance", "z", "(Ljava/lang/Object;)Z", "y", "(Landroidx/compose/runtime/B;Ljava/lang/Object;)V", "instances", "x", "B", "Lkotlin/Function1;", "Landroidx/compose/runtime/j;", "h", "(I)Lkotlin/jvm/functions/Function1;", "I", "flags", "b", "Landroidx/compose/runtime/K0;", "Landroidx/compose/runtime/Anchor;", "c", "Landroidx/compose/runtime/Anchor;", "i", "()Landroidx/compose/runtime/Anchor;", "D", "(Landroidx/compose/runtime/Anchor;)V", "anchor", "d", "Lkotlin/jvm/functions/Function2;", "currentToken", "LZ/S;", "LZ/S;", "trackedInstances", "LZ/W;", "trackedDependencies", "p", "()Z", "J", "(Z)V", "rereading", "s", "L", "skipped", "u", "valid", "j", "canRecompose", "t", "M", "used", "r", "setReusing", "reusing", "n", "H", "paused", "q", "K", "resuming", "k", "E", "defaultsInScope", "l", "F", "defaultsInvalid", "o", "requiresRecompose", "m", "G", "forcedRecompose", "w", "isConditional", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class I0 implements T0, H0 {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f49990i = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int flags;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private K0 owner;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Anchor anchor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Composer, ? super Integer, Unit> block;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Z.S<Object> trackedInstances;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Z.W<B<?>, Object> trackedDependencies;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/I0$a;", "", "<init>", "()V", "Landroidx/compose/runtime/SlotWriter;", "slots", "", "Landroidx/compose/runtime/Anchor;", "anchors", "Landroidx/compose/runtime/K0;", "newOwner", "", "a", "(Landroidx/compose/runtime/SlotWriter;Ljava/util/List;Landroidx/compose/runtime/K0;)V", "Landroidx/compose/runtime/SlotTable;", "", "b", "(Landroidx/compose/runtime/SlotTable;Ljava/util/List;)Z", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: androidx.compose.runtime.I0$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(SlotWriter slots, List<Anchor> anchors, K0 newOwner) {
            List<Anchor> list = anchors;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objB1 = slots.b1(anchors.get(i10), 0);
                I0 i02 = objB1 instanceof I0 ? (I0) objB1 : null;
                if (i02 != null) {
                    i02.e(newOwner);
                }
            }
        }

        public final boolean b(SlotTable slots, List<Anchor> anchors) {
            List<Anchor> list = anchors;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Anchor anchor = anchors.get(i10);
                    if (slots.D(anchor) && (slots.F(slots.f(anchor), 0) instanceof I0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/j;", "composition", "", "a", "(Landroidx/compose/runtime/j;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<InterfaceC5725j, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f49999g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Z.S<Object> f50000h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Z.S<Object> s10) {
            super(1);
            this.f49999g = i10;
            this.f50000h = s10;
        }

        public final void a(InterfaceC5725j interfaceC5725j) {
            int i10;
            if (I0.this.currentToken != this.f49999g || !Intrinsics.e(this.f50000h, I0.this.trackedInstances) || !(interfaceC5725j instanceof C5733n)) {
                return;
            }
            Z.S<Object> s10 = this.f50000h;
            int i11 = this.f49999g;
            I0 i02 = I0.this;
            long[] jArr = s10.metadata;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j10 = jArr[i12];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8;
                    int i14 = 8 - ((~(i12 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((255 & j10) < 128) {
                            int i16 = (i12 << 3) + i15;
                            Object obj = s10.keys[i16];
                            boolean z10 = s10.values[i16] != i11;
                            i10 = i13;
                            if (z10) {
                                C5733n c5733n = (C5733n) interfaceC5725j;
                                c5733n.K(obj, i02);
                                if (obj instanceof B) {
                                    c5733n.J((B) obj);
                                    Z.W w10 = i02.trackedDependencies;
                                    if (w10 != null) {
                                        w10.u(obj);
                                    }
                                }
                            }
                            if (z10) {
                                s10.s(i16);
                            }
                        } else {
                            i10 = i13;
                        }
                        j10 >>= i10;
                        i15++;
                        i13 = i10;
                    }
                    if (i14 != i13) {
                        return;
                    }
                }
                if (i12 == length) {
                    return;
                } else {
                    i12++;
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5725j interfaceC5725j) {
            a(interfaceC5725j);
            return Unit.f142422a;
        }
    }

    private final void J(boolean z10) {
        if (z10) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void L(boolean z10) {
        if (z10) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    private final boolean f(B<?> b10, Z.W<B<?>, Object> w10) {
        Intrinsics.h(b10, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        n1<?> n1VarE = b10.e();
        if (n1VarE == null) {
            n1VarE = o1.r();
        }
        return !n1VarE.b(b10.J().a(), w10.e(b10));
    }

    private final boolean p() {
        return (this.flags & 32) != 0;
    }

    public final void A() {
        K0 k02 = this.owner;
        if (k02 != null) {
            k02.h(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B() {
        /*
            r17 = this;
            r1 = r17
            androidx.compose.runtime.K0 r0 = r1.owner
            if (r0 == 0) goto L60
            Z.S<java.lang.Object> r2 = r1.trackedInstances
            if (r2 == 0) goto L60
            r3 = 1
            r1.J(r3)
            r3 = 0
            java.lang.Object[] r4 = r2.keys     // Catch: java.lang.Throwable -> L4b
            int[] r5 = r2.values     // Catch: java.lang.Throwable -> L4b
            long[] r2 = r2.metadata     // Catch: java.lang.Throwable -> L4b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L4b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L58
            r7 = r3
        L1b:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L4b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L4b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L53
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L4b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L35:
            if (r12 >= r10) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L4b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L4b
            r0.a(r14)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L51:
            if (r10 != r11) goto L58
        L53:
            if (r7 == r6) goto L58
            int r7 = r7 + 1
            goto L1b
        L58:
            r1.J(r3)
            return
        L5c:
            r1.J(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.I0.B():void");
    }

    public final void D(Anchor anchor) {
        this.anchor = anchor;
    }

    public final void E(boolean z10) {
        if (z10) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void F(boolean z10) {
        if (z10) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void G(boolean z10) {
        if (z10) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final void H(boolean z10) {
        this.flags = z10 ? this.flags | 256 : this.flags & (-257);
    }

    public final void I(boolean z10) {
        if (z10) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void K(boolean z10) {
        this.flags = z10 ? this.flags | 512 : this.flags & (-513);
    }

    public final void M(boolean z10) {
        this.flags = z10 ? this.flags | 1 : this.flags & (-2);
    }

    public final void N(int token) {
        this.currentToken = token;
        L(false);
    }

    @Override // androidx.compose.runtime.T0
    public void a(Function2<? super Composer, ? super Integer, Unit> block) {
        this.block = block;
    }

    public final void e(K0 owner) {
        this.owner = owner;
    }

    public final void g(Composer composer) {
        Unit unit;
        Function2<? super Composer, ? super Integer, Unit> function2 = this.block;
        if (function2 != null) {
            function2.invoke(composer, 1);
            unit = Unit.f142422a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.jvm.functions.Function1<androidx.compose.runtime.InterfaceC5725j, kotlin.Unit> h(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            Z.S<java.lang.Object> r2 = r0.trackedInstances
            r3 = 0
            if (r2 == 0) goto L5b
            boolean r4 = r0.s()
            if (r4 != 0) goto L5b
            java.lang.Object[] r4 = r2.keys
            int[] r5 = r2.values
            long[] r6 = r2.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L5b
            r8 = 0
            r9 = r8
        L1c:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L56
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L36:
            if (r14 >= r12) goto L54
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L50
            int r15 = r9 << 3
            int r15 = r15 + r14
            r16 = r4[r15]
            r15 = r5[r15]
            if (r15 == r1) goto L50
            androidx.compose.runtime.I0$b r3 = new androidx.compose.runtime.I0$b
            r3.<init>(r1, r2)
            return r3
        L50:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L36
        L54:
            if (r12 != r13) goto L5b
        L56:
            if (r9 == r7) goto L5b
            int r9 = r9 + 1
            goto L1c
        L5b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.I0.h(int):kotlin.jvm.functions.Function1");
    }

    /* renamed from: i, reason: from getter */
    public final Anchor getAnchor() {
        return this.anchor;
    }

    @Override // androidx.compose.runtime.H0
    public void invalidate() {
        K0 k02 = this.owner;
        if (k02 != null) {
            k02.k(this, null);
        }
    }

    public final boolean j() {
        return this.block != null;
    }

    public final boolean k() {
        return (this.flags & 2) != 0;
    }

    public final boolean l() {
        return (this.flags & 4) != 0;
    }

    public final boolean m() {
        return (this.flags & 64) != 0;
    }

    public final boolean n() {
        return (this.flags & 256) != 0;
    }

    public final boolean o() {
        return (this.flags & 8) != 0;
    }

    public final boolean q() {
        return (this.flags & 512) != 0;
    }

    public final boolean r() {
        return (this.flags & 128) != 0;
    }

    public final boolean s() {
        return (this.flags & 16) != 0;
    }

    public final boolean t() {
        return (this.flags & 1) != 0;
    }

    public final boolean u() {
        if (this.owner != null) {
            Anchor anchor = this.anchor;
            if (anchor != null ? anchor.b() : false) {
                return true;
            }
        }
        return false;
    }

    public final T v(Object value) {
        T tK;
        K0 k02 = this.owner;
        return (k02 == null || (tK = k02.k(this, value)) == null) ? T.f50152a : tK;
    }

    public final boolean w() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0065, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 1
            if (r1 != 0) goto L8
            return r2
        L8:
            Z.W<androidx.compose.runtime.B<?>, java.lang.Object> r3 = r0.trackedDependencies
            if (r3 != 0) goto Ld
            return r2
        Ld:
            boolean r4 = r1 instanceof androidx.compose.runtime.B
            if (r4 == 0) goto L18
            androidx.compose.runtime.B r1 = (androidx.compose.runtime.B) r1
            boolean r1 = r0.f(r1, r3)
            return r1
        L18:
            boolean r4 = r1 instanceof Z.j0
            if (r4 == 0) goto L72
            Z.j0 r1 = (Z.j0) r1
            boolean r4 = r1.e()
            r5 = 0
            if (r4 == 0) goto L71
            java.lang.Object[] r4 = r1.elements
            long[] r1 = r1.metadata
            int r6 = r1.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L71
            r7 = r5
        L2f:
            r8 = r1[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6c
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r5
        L49:
            if (r12 >= r10) goto L6a
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L66
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            boolean r14 = r13 instanceof androidx.compose.runtime.B
            if (r14 == 0) goto L65
            androidx.compose.runtime.B r13 = (androidx.compose.runtime.B) r13
            boolean r13 = r0.f(r13, r3)
            if (r13 == 0) goto L66
        L65:
            return r2
        L66:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L49
        L6a:
            if (r10 != r11) goto L71
        L6c:
            if (r7 == r6) goto L71
            int r7 = r7 + 1
            goto L2f
        L71:
            return r5
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.I0.x(java.lang.Object):boolean");
    }

    public final void y(B<?> instance, Object value) {
        Z.W<B<?>, Object> w10 = this.trackedDependencies;
        if (w10 == null) {
            w10 = new Z.W<>(0, 1, null);
            this.trackedDependencies = w10;
        }
        w10.x(instance, value);
    }

    public I0(K0 k02) {
        this.owner = k02;
    }

    public final void C() {
        if (!r()) {
            L(true);
        }
    }

    public final boolean z(Object instance) {
        int i10 = 0;
        if (p()) {
            return false;
        }
        Z.S<Object> s10 = this.trackedInstances;
        int i11 = 1;
        if (s10 == null) {
            s10 = new Z.S<>(i10, i11, null);
            this.trackedInstances = s10;
        }
        if (s10.q(instance, this.currentToken, -1) != this.currentToken) {
            return false;
        }
        return true;
    }
}
