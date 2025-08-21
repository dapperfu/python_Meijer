package androidx.compose.ui;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.D;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/d;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "", "zIndex", "<init>", "(F)V", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "", "toString", "()Ljava/lang/String;", "o", "F", "K2", "()F", "L2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.d, reason: from toString */
/* loaded from: classes.dex */
public final class ZIndexModifier extends Modifier.c implements D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private float zIndex;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.d$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f50759f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ZIndexModifier f50760g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0 f0Var, ZIndexModifier zIndexModifier) {
            super(1);
            this.f50759f = f0Var;
            this.f50760g = zIndexModifier;
        }

        public final void a(f0.a aVar) {
            aVar.g(this.f50759f, 0, 0, this.f50760g.getZIndex());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    /* renamed from: K2, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void L2(float f10) {
        this.zIndex = f10;
    }

    public String toString() {
        return "ZIndexModifier(zIndex=" + this.zIndex + ')';
    }

    public ZIndexModifier(float f10) {
        this.zIndex = f10;
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        f0 f0VarK0 = i10.k0(j10);
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new a(f0VarK0, this), 4, null);
    }
}
