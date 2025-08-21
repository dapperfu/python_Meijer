package V0;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B \u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R3\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\tR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LV0/h0;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/e;", "", "Lkotlin/ExtensionFunctionType;", "layerBlock", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "L2", "()V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "", "toString", "()Ljava/lang/String;", "o", "Lkotlin/jvm/functions/Function1;", "K2", "()Lkotlin/jvm/functions/Function1;", "M2", "", "o2", "()Z", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: V0.h0, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private Function1<? super androidx.compose.ui.graphics.e, Unit> block;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: V0.h0$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.f0 f39349f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ BlockGraphicsLayerModifier f39350g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(androidx.compose.ui.layout.f0 f0Var, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
            super(1);
            this.f39349f = f0Var;
            this.f39350g = blockGraphicsLayerModifier;
        }

        public final void a(f0.a aVar) {
            f0.a.v(aVar, this.f39349f, 0, 0, 0.0f, this.f39350g.K2(), 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    public final void L2() {
        NodeCoordinator wrapped = C5957k.j(this, C5952f0.a(2)).getWrapped();
        if (wrapped != null) {
            wrapped.H3(this.block, true);
        }
    }

    @Override // androidx.compose.ui.Modifier.c
    /* renamed from: o2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final Function1<androidx.compose.ui.graphics.e, Unit> K2() {
        return this.block;
    }

    public final void M2(Function1<? super androidx.compose.ui.graphics.e, Unit> function1) {
        this.block = function1;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.block + ')';
    }

    public BlockGraphicsLayerModifier(Function1<? super androidx.compose.ui.graphics.e, Unit> function1) {
        this.block = function1;
    }

    @Override // androidx.compose.ui.node.D
    public androidx.compose.ui.layout.J a(androidx.compose.ui.layout.K k10, androidx.compose.ui.layout.I i10, long j10) {
        androidx.compose.ui.layout.f0 f0VarK0 = i10.k0(j10);
        return androidx.compose.ui.layout.K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0, this), 4, null);
    }
}
