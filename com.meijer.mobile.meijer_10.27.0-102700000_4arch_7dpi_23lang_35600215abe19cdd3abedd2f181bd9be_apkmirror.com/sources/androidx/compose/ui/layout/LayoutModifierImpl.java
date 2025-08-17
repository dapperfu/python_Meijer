package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B,\u0012#\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u000e\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R?\u0010\t\u001a\u001f\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0002\b\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/layout/C;", "Landroidx/compose/ui/node/D;", "Landroidx/compose/ui/Modifier$c;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "Lkotlin/ExtensionFunctionType;", "measureBlock", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "measurable", "constraints", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "", "toString", "()Ljava/lang/String;", "o", "Lkotlin/jvm/functions/Function3;", "getMeasureBlock", "()Lkotlin/jvm/functions/Function3;", "K2", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.layout.C, reason: from toString */
/* loaded from: classes.dex */
public final class LayoutModifierImpl extends Modifier.c implements androidx.compose.ui.node.D {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private Function3<? super K, ? super I, ? super H1.b, ? extends J> measureBlock;

    public final void K2(Function3<? super K, ? super I, ? super H1.b, ? extends J> function3) {
        this.measureBlock = function3;
    }

    @Override // androidx.compose.ui.node.D
    public J a(K k10, I i10, long j10) {
        return this.measureBlock.invoke(k10, i10, H1.b.a(j10));
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }

    public LayoutModifierImpl(Function3<? super K, ? super I, ? super H1.b, ? extends J> function3) {
        this.measureBlock = function3;
    }
}
