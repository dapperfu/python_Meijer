package androidx.compose.ui.layout;

import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.h0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u0004*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0012\u001a\u00020\u0011*\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0015\u001a\u00020\u0011*\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001e\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ#\u0010\u001f\u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ#\u0010 \u001a\u00020\u0019*\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010\u001cø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006!À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/layout/e;", "Landroidx/compose/ui/node/D;", "LH1/r;", "lookaheadSize", "", "Z0", "(J)Z", "Landroidx/compose/ui/layout/f0$a;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadCoordinates", "c2", "(Landroidx/compose/ui/layout/f0$a;Landroidx/compose/ui/layout/LayoutCoordinates;)Z", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/f;", "Q0", "(Landroidx/compose/ui/layout/f;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/c;", "Landroidx/compose/ui/layout/r;", "", "height", "M0", "(Landroidx/compose/ui/layout/c;Landroidx/compose/ui/layout/r;I)I", "width", "A1", "l1", "q1", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.layout.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC5920e extends androidx.compose.ui.node.D {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/layout/I;", "intrinsicMeasurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/f;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.layout.e$a */
    static final class a implements h0.a {
        a() {
        }

        @Override // androidx.compose.ui.node.h0.a
        public final J a(InterfaceC5921f interfaceC5921f, I i10, long j10) {
            return InterfaceC5920e.this.Q0(interfaceC5921f, i10, j10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/layout/I;", "intrinsicMeasurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/f;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.layout.e$b */
    static final class b implements h0.a {
        b() {
        }

        @Override // androidx.compose.ui.node.h0.a
        public final J a(InterfaceC5921f interfaceC5921f, I i10, long j10) {
            return InterfaceC5920e.this.Q0(interfaceC5921f, i10, j10);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.layout.e$c */
    static final class c extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f51289f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f0 f0Var) {
            super(1);
            this.f51289f = f0Var;
        }

        public final void a(f0.a aVar) {
            f0.a.h(aVar, this.f51289f, 0, 0, 0.0f, 4, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/layout/I;", "intrinsicMeasurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/f;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.layout.e$d */
    static final class d implements h0.a {
        d() {
        }

        @Override // androidx.compose.ui.node.h0.a
        public final J a(InterfaceC5921f interfaceC5921f, I i10, long j10) {
            return InterfaceC5920e.this.Q0(interfaceC5921f, i10, j10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/f;", "Landroidx/compose/ui/layout/I;", "intrinsicMeasurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/f;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.layout.e$e, reason: collision with other inner class name */
    static final class C1064e implements h0.a {
        C1064e() {
        }

        @Override // androidx.compose.ui.node.h0.a
        public final J a(InterfaceC5921f interfaceC5921f, I i10, long j10) {
            return InterfaceC5920e.this.Q0(interfaceC5921f, i10, j10);
        }
    }

    J Q0(InterfaceC5921f interfaceC5921f, I i10, long j10);

    boolean Z0(long lookaheadSize);

    default boolean c2(f0.a aVar, LayoutCoordinates layoutCoordinates) {
        return false;
    }

    default int A1(InterfaceC5918c interfaceC5918c, r rVar, int i10) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.g(coordinator);
        androidx.compose.ui.node.S lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        if (lookaheadDelegate.r1()) {
            return androidx.compose.ui.node.h0.f51757a.e(new d(), interfaceC5918c, rVar, i10);
        }
        return rVar.W(i10);
    }

    default int M0(InterfaceC5918c interfaceC5918c, r rVar, int i10) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.g(coordinator);
        androidx.compose.ui.node.S lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        if (lookaheadDelegate.r1()) {
            return androidx.compose.ui.node.h0.f51757a.g(new C1064e(), interfaceC5918c, rVar, i10);
        }
        return rVar.d0(i10);
    }

    @Override // androidx.compose.ui.node.D
    default J a(K k10, I i10, long j10) {
        f0 f0VarK0 = i10.k0(j10);
        return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new c(f0VarK0), 4, null);
    }

    default int l1(InterfaceC5918c interfaceC5918c, r rVar, int i10) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.g(coordinator);
        androidx.compose.ui.node.S lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        if (lookaheadDelegate.r1()) {
            return androidx.compose.ui.node.h0.f51757a.c(new b(), interfaceC5918c, rVar, i10);
        }
        return rVar.j0(i10);
    }

    default int q1(InterfaceC5918c interfaceC5918c, r rVar, int i10) {
        NodeCoordinator coordinator = getNode().getCoordinator();
        Intrinsics.g(coordinator);
        androidx.compose.ui.node.S lookaheadDelegate = coordinator.getLookaheadDelegate();
        Intrinsics.g(lookaheadDelegate);
        if (lookaheadDelegate.r1()) {
            return androidx.compose.ui.node.h0.f51757a.a(new a(), interfaceC5918c, rVar, i10);
        }
        return rVar.A(i10);
    }
}
