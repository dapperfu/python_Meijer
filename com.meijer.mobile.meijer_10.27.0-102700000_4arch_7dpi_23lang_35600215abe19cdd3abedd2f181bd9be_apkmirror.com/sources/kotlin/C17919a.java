package kotlin;

import H1.w;
import P0.e;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5795w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import j0.C14815g;
import j0.InterfaceC14814f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u001al\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a3\u0010\u000f\u001a\u00020\u0001*\u00020\u000e2\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017\"\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017\"\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b\"\u0014\u0010\u001e\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b\"\u0014\u0010 \u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lkotlin/Function0;", "", "buttons", "Landroidx/compose/ui/Modifier;", "modifier", "title", "text", "LV0/D1;", "shape", "LV0/q0;", "backgroundColor", "contentColor", "b", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;LV0/D1;JJLandroidx/compose/runtime/Composer;II)V", "Lj0/f;", "a", "(Lj0/f;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "LH1/h;", "mainAxisSpacing", "crossAxisSpacing", "content", "c", "(FFLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "TitlePadding", "TextPadding", "LH1/v;", "J", "TitleBaselineDistanceFromTop", "d", "TextBaselineDistanceFromTitle", "e", "TextBaselineDistanceFromTop", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.a, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17919a {

    /* renamed from: a, reason: collision with root package name */
    private static final Modifier f167559a;

    /* renamed from: b, reason: collision with root package name */
    private static final Modifier f167560b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f167561c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f167562d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f167563e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a$a */
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f167564a = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a$a$a, reason: collision with other inner class name */
        static final class C2662a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f167565f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f167566g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ f0 f167567h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f167568i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2662a(f0 f0Var, int i10, f0 f0Var2, int i11) {
                super(1);
                this.f167565f = f0Var;
                this.f167566g = i10;
                this.f167567h = f0Var2;
                this.f167568i = i11;
            }

            public final void a(f0.a aVar) {
                f0.a aVar2;
                f0 f0Var = this.f167565f;
                if (f0Var != null) {
                    aVar2 = aVar;
                    f0.a.h(aVar2, f0Var, 0, this.f167566g, 0.0f, 4, null);
                } else {
                    aVar2 = aVar;
                }
                f0 f0Var2 = this.f167567h;
                if (f0Var2 != null) {
                    f0.a.h(aVar2, f0Var2, 0, this.f167568i, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
        @Override // androidx.compose.ui.layout.MeasurePolicy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K r20, java.util.List<? extends androidx.compose.ui.layout.I> r21, long r22) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17919a.a.d(androidx.compose.ui.layout.K, java.util.List, long):androidx.compose.ui.layout.J");
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14814f f167569f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167570g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167571h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f167572i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC14814f interfaceC14814f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i10) {
            super(2);
            this.f167569f = interfaceC14814f;
            this.f167570g = function2;
            this.f167571h = function22;
            this.f167572i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17919a.a(this.f167569f, this.f167570g, this.f167571h, composer, J0.a(this.f167572i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167573f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167574g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167575h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a$c$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167576f;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.a$c$a$a, reason: collision with other inner class name */
            static final class C2663a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f167577f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2663a(Function2<? super Composer, ? super Integer, Unit> function2) {
                    super(2);
                    this.f167577f = function2;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(770166432, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:216)");
                    }
                    N1.a(C17877E0.f166879a.c(composer, 6).getSubtitle1(), this.f167577f, composer, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f167576f = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(620104160, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:215)");
                }
                r.a(C17892M.a().d(Float.valueOf(C17890L.f167124a.c(composer, 6))), ComposableLambdaKt.c(770166432, true, new C2663a(this.f167576f), composer, 54), composer, G0.f49976i | 48);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a$c$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167578f;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.a$c$b$a */
            static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f167579f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(Function2<? super Composer, ? super Integer, Unit> function2) {
                    super(2);
                    this.f167579f = function2;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2115920639, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:227)");
                    }
                    N1.a(C17877E0.f166879a.c(composer, 6).getBody2(), this.f167579f, composer, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f167578f = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1965858367, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:224)");
                }
                r.a(C17892M.a().d(Float.valueOf(C17890L.f167124a.d(composer, 6))), ComposableLambdaKt.c(2115920639, true, new a(this.f167578f), composer, 54), composer, G0.f49976i | 48);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23) {
            super(2);
            this.f167573f = function2;
            this.f167574g = function22;
            this.f167575h = function23;
        }

        public final void a(Composer composer, int i10) {
            ComposableLambda composableLambdaC;
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(629950291, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous> (AlertDialog.kt:210)");
            }
            Function2<Composer, Integer, Unit> function2 = this.f167573f;
            Function2<Composer, Integer, Unit> function22 = this.f167574g;
            Function2<Composer, Integer, Unit> function23 = this.f167575h;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5665k.a(C5658d.f48555a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5717f.a(composer, 0);
            InterfaceC5742s interfaceC5742sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14815g c14815g = C14815g.f139108a;
            ComposableLambda composableLambdaC2 = null;
            if (function2 == null) {
                composer.startReplaceGroup(-366997612);
                composer.P();
                composableLambdaC = null;
            } else {
                composer.startReplaceGroup(-366997611);
                composableLambdaC = ComposableLambdaKt.c(620104160, true, new a(function2), composer, 54);
                composer.P();
            }
            if (function22 == null) {
                composer.startReplaceGroup(-366576167);
            } else {
                composer.startReplaceGroup(-366576166);
                composableLambdaC2 = ComposableLambdaKt.c(1965858367, true, new b(function22), composer, 54);
            }
            composer.P();
            C17919a.a(c14815g, composableLambdaC, composableLambdaC2, composer, 6);
            function23.invoke(composer, 0);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167580f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f167581g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167582h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167583i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V0.D1 f167584j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f167585k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f167586l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167587m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167588n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, V0.D1 d12, long j10, long j11, int i10, int i11) {
            super(2);
            this.f167580f = function2;
            this.f167581g = modifier;
            this.f167582h = function22;
            this.f167583i = function23;
            this.f167584j = d12;
            this.f167585k = j10;
            this.f167586l = j11;
            this.f167587m = i10;
            this.f167588n = i11;
        }

        public final void a(Composer composer, int i10) {
            C17919a.b(this.f167580f, this.f167581g, this.f167582h, this.f167583i, this.f167584j, this.f167585k, this.f167586l, composer, J0.a(this.f167587m | 1), this.f167588n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a$e */
    static final class e implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f167589a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f167590b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.a$e$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<List<f0>> f167591f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ K f167592g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f167593h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f167594i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<Integer> f167595j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<List<f0>> list, K k10, float f10, int i10, List<Integer> list2) {
                super(1);
                this.f167591f = list;
                this.f167592g = k10;
                this.f167593h = f10;
                this.f167594i = i10;
                this.f167595j = list2;
            }

            public final void a(f0.a aVar) {
                List<List<f0>> list = this.f167591f;
                K k10 = this.f167592g;
                float f10 = this.f167593h;
                int i10 = this.f167594i;
                List<Integer> list2 = this.f167595j;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    List<f0> list3 = list.get(i11);
                    int size2 = list3.size();
                    int[] iArr = new int[size2];
                    int i12 = 0;
                    while (i12 < size2) {
                        iArr[i12] = list3.get(i12).getWidth() + (i12 < CollectionsKt.o(list3) ? k10.E0(f10) : 0);
                        i12++;
                    }
                    int[] iArr2 = new int[size2];
                    C5658d.f48555a.a().b(k10, i10, iArr, iArr2);
                    int size3 = list3.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        f0.a.h(aVar, list3.get(i13), iArr2[i13], list2.get(i11).intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        private static final void b(List<List<f0>> list, Ref.IntRef intRef, K k10, float f10, List<f0> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
            if (!list.isEmpty()) {
                intRef.f142833a += k10.E0(f10);
            }
            list.add(0, CollectionsKt.j1(list2));
            list3.add(Integer.valueOf(intRef2.f142833a));
            list4.add(Integer.valueOf(intRef.f142833a));
            intRef.f142833a += intRef2.f142833a;
            intRef3.f142833a = Math.max(intRef3.f142833a, intRef4.f142833a);
            list2.clear();
            intRef4.f142833a = 0;
            intRef2.f142833a = 0;
        }

        e(float f10, float f11) {
            this.f167589a = f10;
            this.f167590b = f11;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K k10, List<? extends I> list, long j10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            ArrayList arrayList4 = new ArrayList();
            Ref.IntRef intRef3 = new Ref.IntRef();
            Ref.IntRef intRef4 = new Ref.IntRef();
            int i10 = 0;
            long jB = H1.c.b(0, H1.b.l(j10), 0, 0, 13, null);
            float f10 = this.f167589a;
            float f11 = this.f167590b;
            int size = list.size();
            while (i10 < size) {
                ArrayList arrayList5 = arrayList;
                f0 f0VarK0 = list.get(i10).k0(jB);
                long j11 = jB;
                float f12 = f11;
                int i11 = size;
                int i12 = i10;
                Ref.IntRef intRef5 = intRef3;
                intRef3 = intRef5;
                if (a(arrayList4, intRef5, k10, f10, j10, f0VarK0)) {
                    arrayList = arrayList5;
                } else {
                    arrayList = arrayList5;
                    b(arrayList, intRef2, k10, f12, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
                }
                if (!arrayList4.isEmpty()) {
                    intRef3.f142833a += k10.E0(f10);
                }
                arrayList4.add(f0VarK0);
                intRef3.f142833a += f0VarK0.getWidth();
                intRef4.f142833a = Math.max(intRef4.f142833a, f0VarK0.getHeight());
                i10 = i12 + 1;
                f11 = f12;
                jB = j11;
                size = i11;
            }
            if (!arrayList4.isEmpty()) {
                b(arrayList, intRef2, k10, this.f167590b, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
            }
            int iL = H1.b.l(j10) != Integer.MAX_VALUE ? H1.b.l(j10) : Math.max(intRef.f142833a, H1.b.n(j10));
            return K.G0(k10, iL, Math.max(intRef2.f142833a, H1.b.m(j10)), null, new a(arrayList, k10, this.f167589a, iL, arrayList3), 4, null);
        }

        private static final boolean a(List<f0> list, Ref.IntRef intRef, K k10, float f10, long j10, f0 f0Var) {
            if (!list.isEmpty() && intRef.f142833a + k10.E0(f10) + f0Var.getWidth() > H1.b.l(j10)) {
                return false;
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f167596f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f167597g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167598h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f167599i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(float f10, float f11, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f167596f = f10;
            this.f167597g = f11;
            this.f167598h = function2;
            this.f167599i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17919a.c(this.f167596f, this.f167597g, this.f167598h, composer, J0.a(this.f167599i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final void a(InterfaceC14814f interfaceC14814f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-555573207);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(interfaceC14814f) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.D(function22) ? 256 : 128;
        }
        if (composerStartRestartGroup.p((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-555573207, i11, -1, "androidx.compose.material.AlertDialogBaselineLayout (AlertDialog.kt:249)");
            }
            Modifier modifierA = interfaceC14814f.a(Modifier.INSTANCE, 1.0f, false);
            a aVar = a.f167564a;
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA);
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, aVar, companion.e());
            D1.c(composerA, interfaceC5742sR, companion.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            if (function2 == null) {
                composerStartRestartGroup.startReplaceGroup(1317321954);
            } else {
                composerStartRestartGroup.startReplaceGroup(1317321955);
                Modifier modifierB = C5795w.b(f167559a, "title");
                e.Companion companion2 = P0.e.INSTANCE;
                Modifier modifierC = interfaceC14814f.c(modifierB, companion2.k());
                MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
                int iA2 = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
                Function0<InterfaceC5811g> function0A2 = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5717f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A2);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA2 = D1.a(composerStartRestartGroup);
                D1.c(composerA2, measurePolicyG, companion.e());
                D1.c(composerA2, interfaceC5742sR2, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion.b();
                if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion.f());
                C5664j c5664j = C5664j.f48612a;
                function2.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.v();
            }
            composerStartRestartGroup.P();
            if (function22 == null) {
                composerStartRestartGroup.startReplaceGroup(1317454758);
            } else {
                composerStartRestartGroup.startReplaceGroup(1317454759);
                Modifier modifierB2 = C5795w.b(f167560b, "text");
                e.Companion companion3 = P0.e.INSTANCE;
                Modifier modifierC2 = interfaceC14814f.c(modifierB2, companion3.k());
                MeasurePolicy measurePolicyG2 = C5662h.g(companion3.o(), false);
                int iA3 = C5717f.a(composerStartRestartGroup, 0);
                InterfaceC5742s interfaceC5742sR3 = composerStartRestartGroup.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC2);
                Function0<InterfaceC5811g> function0A3 = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5717f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A3);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA3 = D1.a(composerStartRestartGroup);
                D1.c(composerA3, measurePolicyG2, companion.e());
                D1.c(composerA3, interfaceC5742sR3, companion.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion.b();
                if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion.f());
                C5664j c5664j2 = C5664j.f48612a;
                function22.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.v();
            }
            composerStartRestartGroup.P();
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(interfaceC14814f, function2, function22, i10));
        }
    }

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        float f10 = 24;
        f167559a = D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null);
        f167560b = D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(28), 2, null);
        f167561c = w.i(40);
        f167562d = w.i(36);
        f167563e = w.i(38);
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r23, androidx.compose.ui.Modifier r24, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r26, V0.D1 r27, long r28, long r30, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17919a.b(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, V0.D1, long, long, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(float f10, float f11, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(73434452);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.b(f10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.b(f11)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        boolean z12 = true;
        if ((i11 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(73434452, i11, -1, "androidx.compose.material.AlertDialogFlowRow (AlertDialog.kt:351)");
            }
            if ((i11 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((i11 & 112) != 32) {
                z12 = false;
            }
            boolean z13 = z11 | z12;
            Object objB = composerStartRestartGroup.B();
            if (z13 || objB == Composer.INSTANCE.a()) {
                objB = new e(f10, f11);
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            int i15 = (i11 >> 6) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iA = C5717f.a(composerStartRestartGroup, 0);
            InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion2.a();
            int i16 = ((i15 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5742sR, companion2.g());
            Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new f(f10, f11, function2, i10));
        }
    }
}
