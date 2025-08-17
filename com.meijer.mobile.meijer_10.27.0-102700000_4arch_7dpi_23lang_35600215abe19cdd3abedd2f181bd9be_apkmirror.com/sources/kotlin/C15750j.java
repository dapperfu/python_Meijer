package kotlin;

import H1.t;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5782i;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5781h;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.C5815k;
import androidx.compose.ui.node.D;
import androidx.compose.ui.node.G;
import kotlin.C15749i;
import kotlin.EnumC13827z;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 72\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u00018B'\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\u00020\t*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\"\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0017\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\u00020\t*\u00020\u000fH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0011J&\u0010 \u001a\u00020\u001f*\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J=\u0010'\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\"2\u0006\u0010\u0014\u001a\u00020\u000f2\u0019\u0010&\u001a\u0015\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00018\u00000#¢\u0006\u0002\b%H\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010(J-\u0010*\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b*\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Ln0/j;", "Landroidx/compose/ui/Modifier$c;", "Lk1/h;", "Landroidx/compose/ui/layout/h;", "Landroidx/compose/ui/node/D;", "Ln0/k;", "state", "Ln0/i;", "beyondBoundsInfo", "", "reverseLayout", "Lf0/z;", "orientation", "<init>", "(Ln0/k;Ln0/i;ZLf0/z;)V", "Landroidx/compose/ui/layout/h$b;", "N2", "(I)Z", "Ln0/i$a;", "currentInterval", "direction", "L2", "(Ln0/i$a;I)Ln0/i$a;", "M2", "(Ln0/i$a;I)Z", "O2", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "T", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/h$a;", "Lkotlin/ExtensionFunctionType;", "block", "k0", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "", "P2", "o", "Ln0/k;", "p", "Ln0/i;", "q", "Z", "r", "Lf0/z;", "Lk1/g;", "t0", "()Lk1/g;", "providedValues", "s", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15750j extends Modifier.c implements k1.h, InterfaceC5781h, D {

    /* renamed from: t, reason: collision with root package name */
    public static final int f150905t = 8;

    /* renamed from: u, reason: collision with root package name */
    private static final a f150906u = new a();

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private InterfaceC15751k state;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private C15749i beyondBoundsInfo;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean reverseLayout;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private EnumC13827z orientation;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"n0/j$a", "Landroidx/compose/ui/layout/h$a;", "", "a", "Z", "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.j$a */
    public static final class a implements InterfaceC5781h.a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMoreContent;

        @Override // androidx.compose.ui.layout.InterfaceC5781h.a
        /* renamed from: a, reason: from getter */
        public boolean getHasMoreContent() {
            return this.hasMoreContent;
        }

        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"n0/j$d", "Landroidx/compose/ui/layout/h$a;", "", "a", "()Z", "hasMoreContent", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.j$d */
    public static final class d implements InterfaceC5781h.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<C15749i.Interval> f150913b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f150914c;

        d(Ref.ObjectRef<C15749i.Interval> objectRef, int i10) {
            this.f150913b = objectRef;
            this.f150914c = i10;
        }

        @Override // androidx.compose.ui.layout.InterfaceC5781h.a
        /* renamed from: a */
        public boolean getHasMoreContent() {
            return C15750j.this.M2(this.f150913b.f142835a, this.f150914c);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: n0.j$e */
    static final class e extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f150915f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(f0 f0Var) {
            super(1);
            this.f150915f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f150915f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.j$c */
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.f12006a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.f12007b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final boolean N2(int i10) {
        InterfaceC5781h.b.Companion companion = InterfaceC5781h.b.INSTANCE;
        if (InterfaceC5781h.b.h(i10, companion.c())) {
            return false;
        }
        if (InterfaceC5781h.b.h(i10, companion.b())) {
            return true;
        }
        if (InterfaceC5781h.b.h(i10, companion.a())) {
            return this.reverseLayout;
        }
        if (InterfaceC5781h.b.h(i10, companion.d())) {
            return !this.reverseLayout;
        }
        if (InterfaceC5781h.b.h(i10, companion.e())) {
            int i11 = c.$EnumSwitchMapping$0[C5815k.n(this).ordinal()];
            if (i11 == 1) {
                return this.reverseLayout;
            }
            if (i11 == 2) {
                return !this.reverseLayout;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (!InterfaceC5781h.b.h(i10, companion.f())) {
            androidx.compose.foundation.lazy.layout.b.c();
            throw new KotlinNothingValueException();
        }
        int i12 = c.$EnumSwitchMapping$0[C5815k.n(this).ordinal()];
        if (i12 == 1) {
            return !this.reverseLayout;
        }
        if (i12 == 2) {
            return this.reverseLayout;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final boolean O2(int i10) {
        InterfaceC5781h.b.Companion companion = InterfaceC5781h.b.INSTANCE;
        if (InterfaceC5781h.b.h(i10, companion.a()) ? true : InterfaceC5781h.b.h(i10, companion.d())) {
            return this.orientation == EnumC13827z.f130586b;
        }
        if (InterfaceC5781h.b.h(i10, companion.e()) ? true : InterfaceC5781h.b.h(i10, companion.f())) {
            return this.orientation == EnumC13827z.f130585a;
        }
        if (InterfaceC5781h.b.h(i10, companion.c()) ? true : InterfaceC5781h.b.h(i10, companion.b())) {
            return false;
        }
        androidx.compose.foundation.lazy.layout.b.c();
        throw new KotlinNothingValueException();
    }

    public final void P2(InterfaceC15751k state, C15749i beyondBoundsInfo, boolean reverseLayout, EnumC13827z orientation) {
        this.state = state;
        this.beyondBoundsInfo = beyondBoundsInfo;
        this.reverseLayout = reverseLayout;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.layout.InterfaceC5781h
    public <T> T k0(int direction, Function1<? super InterfaceC5781h.a, ? extends T> block) {
        if (this.state.a() <= 0 || !this.state.c() || !getIsAttached()) {
            return block.invoke(f150906u);
        }
        int iE = N2(direction) ? this.state.e() : this.state.d();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f142835a = (T) this.beyondBoundsInfo.a(iE, iE);
        int iK = RangesKt.k(this.state.b() * 2, this.state.a());
        T tInvoke = null;
        int i10 = 0;
        while (tInvoke == null && M2((C15749i.Interval) objectRef.f142835a, direction) && i10 < iK) {
            T t10 = (T) L2((C15749i.Interval) objectRef.f142835a, direction);
            this.beyondBoundsInfo.e((C15749i.Interval) objectRef.f142835a);
            objectRef.f142835a = t10;
            i10++;
            G.d(this);
            tInvoke = block.invoke(new d(objectRef, direction));
        }
        this.beyondBoundsInfo.e((C15749i.Interval) objectRef.f142835a);
        G.d(this);
        return tInvoke;
    }

    public C15750j(InterfaceC15751k interfaceC15751k, C15749i c15749i, boolean z10, EnumC13827z enumC13827z) {
        this.state = interfaceC15751k;
        this.beyondBoundsInfo = c15749i;
        this.reverseLayout = z10;
        this.orientation = enumC13827z;
    }

    private final C15749i.Interval L2(C15749i.Interval currentInterval, int direction) {
        int start = currentInterval.getStart();
        int end = currentInterval.getEnd();
        if (N2(direction)) {
            end++;
        } else {
            start--;
        }
        return this.beyondBoundsInfo.a(start, end);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean M2(C15749i.Interval interval, int i10) {
        if (O2(i10)) {
            return false;
        }
        if (N2(i10)) {
            if (interval.getEnd() >= this.state.a() - 1) {
                return false;
            }
            return true;
        }
        if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        f0 f0VarK0 = i10.k0(j10);
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new e(f0VarK0), 4, null);
    }

    @Override // k1.h
    public k1.g t0() {
        return k1.i.b(TuplesKt.a(C5782i.a(), this));
    }
}
