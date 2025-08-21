package mn;

import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.C17983Z;
import kotlin.InterfaceC6305e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p1.C16332a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f151190a = new k();

    /* renamed from: b, reason: collision with root package name */
    private static Function3<InterfaceC6305e, Composer, Integer, Unit> f151191b = ComposableLambdaKt.composableLambdaInstance(-1486431666, false, a.f151192a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<InterfaceC6305e, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f151192a = new a();

        public final void a(InterfaceC6305e AnimatedVisibility, Composer composer, int i10) {
            Intrinsics.j(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.M()) {
                ComposerKt.U(-1486431666, i10, -1, "com.meijer.mobile.meijer.activity.orders.screens.ComposableSingletons$StackedPromoExpandableCardKt.lambda$-1486431666.<anonymous> (StackedPromoExpandableCard.kt:120)");
            }
            C17983Z.a(D.k(Modifier.INSTANCE, H1.h.p(16), 0.0f, 2, null), C16332a.a(Cj.g.f4665g, composer, 0), H1.h.p(1), 0.0f, composer, 390, 8);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6305e interfaceC6305e, Composer composer, Integer num) {
            a(interfaceC6305e, composer, num.intValue());
            return Unit.f143329a;
        }

        a() {
        }
    }

    public final Function3<InterfaceC6305e, Composer, Integer, Unit> a() {
        return f151191b;
    }
}
