package androidx.compose.ui.layout;

import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.Owner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\"%\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/node/Q;", "lookaheadCapablePlaceable", "Landroidx/compose/ui/layout/f0$a;", "a", "(Landroidx/compose/ui/node/Q;)Landroidx/compose/ui/layout/f0$a;", "Landroidx/compose/ui/node/Owner;", "owner", "b", "(Landroidx/compose/ui/node/Owner;)Landroidx/compose/ui/layout/f0$a;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "", "Lkotlin/ExtensionFunctionType;", "Lkotlin/jvm/functions/Function1;", "DefaultLayerBlock", "LH1/b;", "J", "DefaultConstraints", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Function1<androidx.compose.ui.graphics.e, Unit> f51085a = a.f51087f;

    /* renamed from: b, reason: collision with root package name */
    private static final long f51086b = H1.c.b(0, 0, 0, 0, 15, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f51087f = new a();

        a() {
            super(1);
        }

        public final void a(androidx.compose.ui.graphics.e eVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
            a(eVar);
            return Unit.f142422a;
        }
    }

    public static final f0.a a(androidx.compose.ui.node.Q q10) {
        return new F(q10);
    }

    public static final f0.a b(Owner owner) {
        return new b0(owner);
    }
}
