package kotlin;

import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
@SourceDebugExtension
/* renamed from: x0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17922b extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function2<Composer, Integer, Unit> f167706f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function2<Composer, Integer, Unit> f167707g;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.b$a */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167708f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167709g;

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-563890224, i10, -1, "androidx.compose.material.AlertDialogImpl.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:155)");
            }
            Function2<Composer, Integer, Unit> function2 = this.f167708f;
            if (function2 == null) {
                composer.startReplaceGroup(-1324738946);
            } else {
                composer.startReplaceGroup(1481287139);
                function2.invoke(composer, 0);
            }
            composer.P();
            this.f167709g.invoke(composer, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
            super(2);
            this.f167708f = function2;
            this.f167709g = function22;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C17922b(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22) {
        super(2);
        this.f167706f = function2;
        this.f167707g = function22;
    }

    public final void a(Composer composer, int i10) {
        if (!composer.p((i10 & 3) != 2, i10 & 1)) {
            composer.K();
            return;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1167440211, i10, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:153)");
        }
        float f10 = 8;
        Modifier modifierJ = D.j(J.h(Modifier.INSTANCE, 0.0f, 1, null), H1.h.p(f10), H1.h.p(2));
        Function2<Composer, Integer, Unit> function2 = this.f167706f;
        Function2<Composer, Integer, Unit> function22 = this.f167707g;
        MeasurePolicy measurePolicyG = C5662h.g(P0.e.INSTANCE.o(), false);
        int iA = C5717f.a(composer, 0);
        InterfaceC5742s interfaceC5742sR = composer.r();
        Modifier modifierE = androidx.compose.ui.b.e(composer, modifierJ);
        InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
        Function0<InterfaceC5811g> function0A = companion.a();
        if (composer.k() == null) {
            C5717f.c();
        }
        composer.F();
        if (composer.h()) {
            composer.I(function0A);
        } else {
            composer.s();
        }
        Composer composerA = D1.a(composer);
        D1.c(composerA, measurePolicyG, companion.e());
        D1.c(composerA, interfaceC5742sR, companion.g());
        Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
        if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
            composerA.t(Integer.valueOf(iA));
            composerA.n(Integer.valueOf(iA), function2B);
        }
        D1.c(composerA, modifierE, companion.f());
        C5664j c5664j = C5664j.f48612a;
        C17919a.c(H1.h.p(f10), H1.h.p(12), ComposableLambdaKt.c(-563890224, true, new a(function2, function22), composer, 54), composer, 438);
        composer.v();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        a(composer, num.intValue());
        return Unit.f142422a;
    }
}
