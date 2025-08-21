package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B(\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\r\u001a\u00020\f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ&\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Landroidx/compose/foundation/layout/C;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "Lkotlin/Function1;", "LH1/d;", "LH1/n;", "Lkotlin/ExtensionFunctionType;", "offset", "", "rtlAware", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "", "M2", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "o", "Lkotlin/jvm/functions/Function1;", "K2", "()Lkotlin/jvm/functions/Function1;", "setOffset", "(Lkotlin/jvm/functions/Function1;)V", "p", "Z", "L2", "()Z", "setRtlAware", "(Z)V", "q", "o2", "shouldAutoInvalidate", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class C extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private Function1<? super H1.d, H1.n> offset;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean rtlAware;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldAutoInvalidate;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.K f48634g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f48635h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.K k10, f0 f0Var) {
            super(1);
            this.f48634g = k10;
            this.f48635h = f0Var;
        }

        public final void a(f0.a aVar) {
            long packedValue = C.this.K2().invoke(this.f48634g).getPackedValue();
            if (C.this.getRtlAware()) {
                f0.a.p(aVar, this.f48635h, H1.n.k(packedValue), H1.n.l(packedValue), 0.0f, null, 12, null);
            } else {
                f0.a.v(aVar, this.f48635h, H1.n.k(packedValue), H1.n.l(packedValue), 0.0f, null, 12, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public final Function1<H1.d, H1.n> K2() {
        return this.offset;
    }

    /* renamed from: L2, reason: from getter */
    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    public final void M2(Function1<? super H1.d, H1.n> offset, boolean rtlAware) {
        if (this.offset != offset || this.rtlAware != rtlAware) {
            androidx.compose.ui.node.G.c(this);
        }
        this.offset = offset;
        this.rtlAware = rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2, reason: from getter */
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    public C(Function1<? super H1.d, H1.n> function1, boolean z10) {
        this.offset = function1;
        this.rtlAware = z10;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        f0 f0VarK0 = i10.k0(j10);
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(k10, f0VarK0), 4, null);
    }
}
