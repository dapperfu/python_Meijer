package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC5774a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H&¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001fÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/b;", "Landroidx/compose/ui/layout/I;", "", "U", "()V", "", "Landroidx/compose/ui/layout/a;", "", "B", "()Ljava/util/Map;", "Lkotlin/Function1;", "block", "o0", "(Lkotlin/jvm/functions/Function1;)V", "requestLayout", "t0", "", "f", "()Z", "isPlaced", "Landroidx/compose/ui/node/NodeCoordinator;", "Y", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "Landroidx/compose/ui/node/a;", "r", "()Landroidx/compose/ui/node/a;", "alignmentLines", "M", "()Landroidx/compose/ui/node/b;", "parentAlignmentLinesOwner", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5801b extends androidx.compose.ui.layout.I {
    Map<AbstractC5774a, Integer> B();

    InterfaceC5801b M();

    void U();

    NodeCoordinator Y();

    /* renamed from: f */
    boolean getIsPlaced();

    void o0(Function1<? super InterfaceC5801b, Unit> block);

    /* renamed from: r */
    AbstractC5799a getAlignmentLines();

    void requestLayout();

    void t0();
}
