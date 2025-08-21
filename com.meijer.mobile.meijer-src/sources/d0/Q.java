package d0;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import r1.C16819m;
import r1.ProgressBarRangeInfo;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "value", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "b", "(Landroidx/compose/ui/Modifier;FLkotlin/ranges/ClosedFloatingPointRange;I)Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Q {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f127688f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ClosedFloatingPointRange<Float> f127689g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f127690h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10) {
            super(1);
            this.f127688f = f10;
            this.f127689g = closedFloatingPointRange;
            this.f127690h = i10;
        }

        public final void a(r1.u uVar) {
            r1.s.r0(uVar, new ProgressBarRangeInfo(((Number) RangesKt.r(Float.valueOf(this.f127688f), this.f127689g)).floatValue(), this.f127689g, this.f127690h));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<r1.u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f127691f = new b();

        b() {
            super(1);
        }

        public final void a(r1.u uVar) {
            r1.s.r0(uVar, ProgressBarRangeInfo.INSTANCE.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(r1.u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    public static final Modifier a(Modifier modifier) {
        return C16819m.c(modifier, true, b.f127691f);
    }

    public static final Modifier b(Modifier modifier, float f10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10) {
        return C16819m.c(modifier, true, new a(f10, closedFloatingPointRange, i10));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, float f10, ClosedFloatingPointRange closedFloatingPointRange, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            closedFloatingPointRange = RangesKt.b(0.0f, 1.0f);
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return b(modifier, f10, closedFloatingPointRange, i10);
    }
}
