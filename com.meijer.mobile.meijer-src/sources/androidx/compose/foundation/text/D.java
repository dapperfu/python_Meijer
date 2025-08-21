package androidx.compose.foundation.text;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u000e\u001a\u00020\r*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text/D;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "a", "Lkotlin/jvm/functions/Function0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class D implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function0<Boolean> shouldMeasureLinks;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.ui.layout.I> f49401f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ D f49402g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends androidx.compose.ui.layout.I> list, D d10) {
            super(1);
            this.f49401f = list;
            this.f49402g = d10;
        }

        public final void a(f0.a aVar) {
            List listK = C5816f.k(this.f49401f, this.f49402g.shouldMeasureLinks);
            if (listK != null) {
                int size = listK.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Pair pair = (Pair) listK.get(i10);
                    androidx.compose.ui.layout.f0 f0Var = (androidx.compose.ui.layout.f0) pair.a();
                    Function0 function0 = (Function0) pair.b();
                    f0.a.j(aVar, f0Var, function0 != null ? ((H1.n) function0.invoke()).getPackedValue() : H1.n.INSTANCE.b(), 0.0f, 2, null);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public D(Function0<Boolean> function0) {
        this.shouldMeasureLinks = function0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
        return androidx.compose.ui.layout.K.G0(k10, H1.b.l(j10), H1.b.k(j10), null, new a(list, this), 4, null);
    }
}
