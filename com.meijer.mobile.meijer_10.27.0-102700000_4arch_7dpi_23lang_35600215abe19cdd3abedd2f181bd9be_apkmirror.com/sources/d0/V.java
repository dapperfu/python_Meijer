package d0;

import androidx.compose.runtime.C5702c1;
import androidx.compose.runtime.InterfaceC5726j0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.runtime.z1;
import com.google.android.gms.common.api.a;
import kotlin.C13786D;
import kotlin.C13791I;
import kotlin.C6320d0;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC13790H;
import kotlin.InterfaceC6326i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001&B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JA\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\b¢\u0006\u0002\b\rH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J(\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bR+\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u0005R+\u0010$\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u00028F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010\u0005R\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\u001dR\u0016\u00100\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00101R\u001b\u00107\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b.\u00106R\u001b\u00109\u001a\u0002038VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b,\u00106R$\u0010=\u001a\u00020\u00022\u0006\u0010:\u001a\u00020\u00028F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010\u0005R\u0014\u0010>\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u00106¨\u0006@"}, d2 = {"Ld0/V;", "Lf0/H;", "", "initial", "<init>", "(I)V", "Ld0/E;", "scrollPriority", "Lkotlin/Function2;", "Lf0/E;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Ld0/E;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "f", "(F)F", "value", "Lc0/i;", "animationSpec", "k", "(ILc0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "Landroidx/compose/runtime/j0;", "o", "()I", "r", "b", "getViewportSize", "s", "viewportSize", "Lh0/l;", "c", "Lh0/l;", "m", "()Lh0/l;", "internalInteractionSource", "Landroidx/compose/runtime/j0;", "d", "_maxValueState", "e", "F", "accumulator", "Lf0/H;", "scrollableState", "", "g", "Landroidx/compose/runtime/z1;", "()Z", "canScrollForward", "h", "canScrollBackward", "newMax", "n", "q", "maxValue", "isScrollInProgress", "i", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class V implements InterfaceC13790H {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: j, reason: collision with root package name */
    private static final L0.k<V, ?> f126904j = L0.l.a(a.f126913f, b.f126914f);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5726j0 value;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5726j0 viewportSize = C5702c1.a(0);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h0.l internalInteractionSource = h0.k.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5726j0 _maxValueState = C5702c1.a(a.e.API_PRIORITY_OTHER);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13790H scrollableState = C13791I.a(new f());

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final z1 canScrollForward = o1.e(new e());

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z1 canScrollBackward = o1.e(new d());

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ld0/V;", "a", "(I)Ld0/V;"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<Integer, V> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f126914f = new b();

        b() {
            super(1);
        }

        public final V a(int i10) {
            return new V(i10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ V invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ld0/V$c;", "", "<init>", "()V", "LL0/k;", "Ld0/V;", "Saver", "LL0/k;", "a", "()LL0/k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: d0.V$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final L0.k<V, ?> a() {
            return V.f126904j;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function0<Boolean> {
        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(V.this.o() > 0);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function0<Boolean> {
        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(V.this.o() < V.this.n());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "b", "(F)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class f extends Lambda implements Function1<Float, Float> {
        f() {
            super(1);
        }

        public final Float b(float f10) {
            float fO = V.this.o() + f10 + V.this.accumulator;
            float fN = RangesKt.n(fO, 0.0f, V.this.n());
            boolean z10 = fO == fN;
            float fO2 = fN - V.this.o();
            int iRound = Math.round(fO2);
            V v10 = V.this;
            v10.r(v10.o() + iRound);
            V.this.accumulator = fO2 - iRound;
            if (!z10) {
                f10 = fO2;
            }
            return Float.valueOf(f10);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Float invoke(Float f10) {
            return b(f10.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LL0/m;", "Ld0/V;", "it", "", "a", "(LL0/m;Ld0/V;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<L0.m, V, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f126913f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(L0.m mVar, V v10) {
            return Integer.valueOf(v10.o());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object l(V v10, int i10, InterfaceC6326i interfaceC6326i, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            interfaceC6326i = new C6320d0(0.0f, 0.0f, null, 7, null);
        }
        return v10.k(i10, interfaceC6326i, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(int i10) {
        this.value.j(i10);
    }

    @Override // kotlin.InterfaceC13790H
    public Object a(EnumC13431E enumC13431E, Function2<? super InterfaceC13787E, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objA = this.scrollableState.a(enumC13431E, function2, continuation);
        return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
    }

    @Override // kotlin.InterfaceC13790H
    public boolean b() {
        return this.scrollableState.b();
    }

    @Override // kotlin.InterfaceC13790H
    public boolean d() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // kotlin.InterfaceC13790H
    public boolean e() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // kotlin.InterfaceC13790H
    public float f(float delta) {
        return this.scrollableState.f(delta);
    }

    /* renamed from: m, reason: from getter */
    public final h0.l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int n() {
        return this._maxValueState.a();
    }

    public final int o() {
        return this.value.a();
    }

    public final void q(int i10) {
        this._maxValueState.j(i10);
        g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
        androidx.compose.runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            if (o() > i10) {
                r(i10);
            }
            Unit unit = Unit.f142422a;
            companion.l(gVarD, gVarE, function1G);
        } catch (Throwable th2) {
            companion.l(gVarD, gVarE, function1G);
            throw th2;
        }
    }

    public final void s(int i10) {
        this.viewportSize.j(i10);
    }

    public V(int i10) {
        this.value = C5702c1.a(i10);
    }

    public final Object k(int i10, InterfaceC6326i<Float> interfaceC6326i, Continuation<? super Unit> continuation) {
        Object objA = C13786D.a(this, i10 - o(), interfaceC6326i, continuation);
        if (objA == IntrinsicsKt.f()) {
            return objA;
        }
        return Unit.f142422a;
    }

    public final Object p(int i10, Continuation<? super Float> continuation) {
        return C13786D.c(this, i10 - o(), continuation);
    }
}
