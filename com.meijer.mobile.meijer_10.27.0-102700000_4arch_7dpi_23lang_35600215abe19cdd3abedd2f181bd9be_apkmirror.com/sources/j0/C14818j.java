package j0;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.platform.N0;
import androidx.compose.ui.platform.O0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t\u0012\u001d\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\t¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0017\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R+\u0010\u000e\u001a\u0019\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R+\u0010.\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u00048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b$\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Lj0/j;", "Landroidx/compose/ui/layout/B;", "Lk1/d;", "Landroidx/compose/ui/platform/O0;", "Lj0/O;", "insets", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/N0;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "Lkotlin/Function2;", "LH1/d;", "", "heightCalc", "<init>", "(Lj0/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Lk1/k;", "scope", "l", "(Lk1/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "c", "Lj0/O;", "d", "Lkotlin/jvm/functions/Function2;", "<set-?>", "e", "Landroidx/compose/runtime/l0;", "b", "()Lj0/O;", "(Lj0/O;)V", "unconsumedInsets", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: j0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C14818j extends O0 implements androidx.compose.ui.layout.B, k1.d {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14806O insets;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function2<InterfaceC14806O, H1.d, Integer> heightCalc;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 unconsumedInsets;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j0.j$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f139119f = new a();

        a() {
            super(1);
        }

        public final void a(f0.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: j0.j$b */
    static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f139120f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f0 f0Var) {
            super(1);
            this.f139120f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.l(aVar, this.f139120f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C14818j)) {
            return false;
        }
        C14818j c14818j = (C14818j) other;
        return Intrinsics.e(this.insets, c14818j.insets) && this.heightCalc == c14818j.heightCalc;
    }

    private final InterfaceC14806O b() {
        return (InterfaceC14806O) this.unconsumedInsets.getValue();
    }

    private final void c(InterfaceC14806O interfaceC14806O) {
        this.unconsumedInsets.setValue(interfaceC14806O);
    }

    @Override // androidx.compose.ui.layout.B
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        int iIntValue = this.heightCalc.invoke(b(), k10).intValue();
        if (iIntValue == 0) {
            return androidx.compose.ui.layout.K.G0(k10, 0, 0, null, a.f139119f, 4, null);
        }
        f0 f0VarK0 = i10.k0(H1.b.d(j10, 0, 0, iIntValue, iIntValue, 3, null));
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), iIntValue, null, new b(f0VarK0), 4, null);
    }

    public int hashCode() {
        return (this.insets.hashCode() * 31) + this.heightCalc.hashCode();
    }

    @Override // k1.d
    public void l(k1.k scope) {
        c(C14808Q.f(this.insets, (InterfaceC14806O) scope.q(S.a())));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C14818j(InterfaceC14806O interfaceC14806O, Function1<? super N0, Unit> function1, Function2<? super InterfaceC14806O, ? super H1.d, Integer> function2) {
        super(function1);
        this.insets = interfaceC14806O;
        this.heightCalc = function2;
        this.unconsumedInsets = t1.e(interfaceC14806O, null, 2, null);
    }
}
