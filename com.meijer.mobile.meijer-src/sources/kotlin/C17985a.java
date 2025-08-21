package kotlin;

import H1.w;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.C5807k;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import j0.C14903g;
import j0.InterfaceC14902f;
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
public final class C17985a {

    /* renamed from: a, reason: collision with root package name */
    private static final Modifier f168647a;

    /* renamed from: b, reason: collision with root package name */
    private static final Modifier f168648b;

    /* renamed from: c, reason: collision with root package name */
    private static final long f168649c;

    /* renamed from: d, reason: collision with root package name */
    private static final long f168650d;

    /* renamed from: e, reason: collision with root package name */
    private static final long f168651e;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a$a */
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        public static final a f168652a = new a();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a$a$a, reason: collision with other inner class name */
        static final class C2686a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f168653f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f168654g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ f0 f168655h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f168656i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2686a(f0 f0Var, int i10, f0 f0Var2, int i11) {
                super(1);
                this.f168653f = f0Var;
                this.f168654g = i10;
                this.f168655h = f0Var2;
                this.f168656i = i11;
            }

            public final void a(f0.a aVar) {
                f0.a aVar2;
                f0 f0Var = this.f168653f;
                if (f0Var != null) {
                    aVar2 = aVar;
                    f0.a.h(aVar2, f0Var, 0, this.f168654g, 0.0f, 4, null);
                } else {
                    aVar2 = aVar;
                }
                f0 f0Var2 = this.f168655h;
                if (f0Var2 != null) {
                    f0.a.h(aVar2, f0Var2, 0, this.f168656i, 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17985a.a.d(androidx.compose.ui.layout.K, java.util.List, long):androidx.compose.ui.layout.J");
        }

        a() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14902f f168657f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168658g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168659h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168660i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC14902f interfaceC14902f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, int i10) {
            super(2);
            this.f168657f = interfaceC14902f;
            this.f168658g = function2;
            this.f168659h = function22;
            this.f168660i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17985a.a(this.f168657f, this.f168658g, this.f168659h, composer, J0.a(this.f168660i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168661f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168662g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168663h;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a$c$a */
        static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f168664f;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.a$c$a$a, reason: collision with other inner class name */
            static final class C2687a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f168665f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2687a(Function2<? super Composer, ? super Integer, Unit> function2) {
                    super(2);
                    this.f168665f = function2;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(770166432, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:216)");
                    }
                    N1.a(C17943E0.f167967a.c(composer, 6).getSubtitle1(), this.f168665f, composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f168664f = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(620104160, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:215)");
                }
                r.a(C17958M.a().d(Float.valueOf(C17956L.f168212a.c(composer, 6))), ComposableLambdaKt.c(770166432, true, new C2687a(this.f168664f), composer, 54), composer, G0.f50200i | 48);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a$c$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f168666f;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.a$c$b$a */
            static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function2<Composer, Integer, Unit> f168667f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(Function2<? super Composer, ? super Integer, Unit> function2) {
                    super(2);
                    this.f168667f = function2;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(2115920639, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:227)");
                    }
                    N1.a(C17943E0.f167967a.c(composer, 6).getBody2(), this.f168667f, composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f168666f = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1965858367, i10, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:224)");
                }
                r.a(C17958M.a().d(Float.valueOf(C17956L.f168212a.d(composer, 6))), ComposableLambdaKt.c(2115920639, true, new a(this.f168666f), composer, 54), composer, G0.f50200i | 48);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23) {
            super(2);
            this.f168661f = function2;
            this.f168662g = function22;
            this.f168663h = function23;
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
            Function2<Composer, Integer, Unit> function2 = this.f168661f;
            Function2<Composer, Integer, Unit> function22 = this.f168662g;
            Function2<Composer, Integer, Unit> function23 = this.f168663h;
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyA = C5807k.a(C5800d.f48779a.h(), P0.e.INSTANCE.k(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.h()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyA, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C14903g c14903g = C14903g.f139698a;
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
            C17985a.a(c14903g, composableLambdaC, composableLambdaC2, composer, 6);
            function23.invoke(composer, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168668f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168669g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168670h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168671i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ V0.D1 f168672j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ long f168673k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f168674l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168675m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f168676n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, V0.D1 d12, long j10, long j11, int i10, int i11) {
            super(2);
            this.f168668f = function2;
            this.f168669g = modifier;
            this.f168670h = function22;
            this.f168671i = function23;
            this.f168672j = d12;
            this.f168673k = j10;
            this.f168674l = j11;
            this.f168675m = i10;
            this.f168676n = i11;
        }

        public final void a(Composer composer, int i10) {
            C17985a.b(this.f168668f, this.f168669g, this.f168670h, this.f168671i, this.f168672j, this.f168673k, this.f168674l, composer, J0.a(this.f168675m | 1), this.f168676n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a$e */
    static final class e implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f168677a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f168678b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.a$e$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<List<f0>> f168679f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ K f168680g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f168681h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f168682i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<Integer> f168683j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<List<f0>> list, K k10, float f10, int i10, List<Integer> list2) {
                super(1);
                this.f168679f = list;
                this.f168680g = k10;
                this.f168681h = f10;
                this.f168682i = i10;
                this.f168683j = list2;
            }

            public final void a(f0.a aVar) {
                List<List<f0>> list = this.f168679f;
                K k10 = this.f168680g;
                float f10 = this.f168681h;
                int i10 = this.f168682i;
                List<Integer> list2 = this.f168683j;
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
                    C5800d.f48779a.a().b(k10, i10, iArr, iArr2);
                    int size3 = list3.size();
                    for (int i13 = 0; i13 < size3; i13++) {
                        f0.a.h(aVar, list3.get(i13), iArr2[i13], list2.get(i11).intValue(), 0.0f, 4, null);
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        private static final void b(List<List<f0>> list, Ref.IntRef intRef, K k10, float f10, List<f0> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
            if (!list.isEmpty()) {
                intRef.f143740a += k10.E0(f10);
            }
            list.add(0, CollectionsKt.j1(list2));
            list3.add(Integer.valueOf(intRef2.f143740a));
            list4.add(Integer.valueOf(intRef.f143740a));
            intRef.f143740a += intRef2.f143740a;
            intRef3.f143740a = Math.max(intRef3.f143740a, intRef4.f143740a);
            list2.clear();
            intRef4.f143740a = 0;
            intRef2.f143740a = 0;
        }

        e(float f10, float f11) {
            this.f168677a = f10;
            this.f168678b = f11;
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
            float f10 = this.f168677a;
            float f11 = this.f168678b;
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
                    intRef3.f143740a += k10.E0(f10);
                }
                arrayList4.add(f0VarK0);
                intRef3.f143740a += f0VarK0.getWidth();
                intRef4.f143740a = Math.max(intRef4.f143740a, f0VarK0.getHeight());
                i10 = i12 + 1;
                f11 = f12;
                jB = j11;
                size = i11;
            }
            if (!arrayList4.isEmpty()) {
                b(arrayList, intRef2, k10, this.f168678b, arrayList4, arrayList2, intRef4, arrayList3, intRef, intRef3);
            }
            int iL = H1.b.l(j10) != Integer.MAX_VALUE ? H1.b.l(j10) : Math.max(intRef.f143740a, H1.b.n(j10));
            return K.G0(k10, iL, Math.max(intRef2.f143740a, H1.b.m(j10)), null, new a(arrayList, k10, this.f168677a, iL, arrayList3), 4, null);
        }

        private static final boolean a(List<f0> list, Ref.IntRef intRef, K k10, float f10, long j10, f0 f0Var) {
            if (!list.isEmpty() && intRef.f143740a + k10.E0(f10) + f0Var.getWidth() > H1.b.l(j10)) {
                return false;
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f168684f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f168685g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168686h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168687i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(float f10, float f11, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f168684f = f10;
            this.f168685g = f11;
            this.f168686h = function2;
            this.f168687i = i10;
        }

        public final void a(Composer composer, int i10) {
            C17985a.c(this.f168684f, this.f168685g, this.f168686h, composer, J0.a(this.f168687i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(InterfaceC14902f interfaceC14902f, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-555573207);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(interfaceC14902f) ? 4 : 2) | i10;
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
            Modifier modifierA = interfaceC14902f.a(Modifier.INSTANCE, 1.0f, false);
            a aVar = a.f168652a;
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierA);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, aVar, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.h() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            if (function2 == null) {
                composerStartRestartGroup.startReplaceGroup(1317321954);
            } else {
                composerStartRestartGroup.startReplaceGroup(1317321955);
                Modifier modifierB = C5937w.b(f168647a, "title");
                e.Companion companion2 = P0.e.INSTANCE;
                Modifier modifierC = interfaceC14902f.c(modifierB, companion2.k());
                MeasurePolicy measurePolicyG = C5804h.g(companion2.o(), false);
                int iA2 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR2 = composerStartRestartGroup.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC);
                Function0<InterfaceC5953g> function0A2 = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A2);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA2 = D1.a(composerStartRestartGroup);
                D1.c(composerA2, measurePolicyG, companion.e());
                D1.c(composerA2, interfaceC5884sR2, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B2 = companion.b();
                if (composerA2.h() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                D1.c(composerA2, modifierE2, companion.f());
                C5806j c5806j = C5806j.f48836a;
                function2.invoke(composerStartRestartGroup, 0);
                composerStartRestartGroup.v();
            }
            composerStartRestartGroup.P();
            if (function22 == null) {
                composerStartRestartGroup.startReplaceGroup(1317454758);
            } else {
                composerStartRestartGroup.startReplaceGroup(1317454759);
                Modifier modifierB2 = C5937w.b(f168648b, "text");
                e.Companion companion3 = P0.e.INSTANCE;
                Modifier modifierC2 = interfaceC14902f.c(modifierB2, companion3.k());
                MeasurePolicy measurePolicyG2 = C5804h.g(companion3.o(), false);
                int iA3 = C5859f.a(composerStartRestartGroup, 0);
                InterfaceC5884s interfaceC5884sR3 = composerStartRestartGroup.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composerStartRestartGroup, modifierC2);
                Function0<InterfaceC5953g> function0A3 = companion.a();
                if (composerStartRestartGroup.k() == null) {
                    C5859f.c();
                }
                composerStartRestartGroup.F();
                if (composerStartRestartGroup.h()) {
                    composerStartRestartGroup.I(function0A3);
                } else {
                    composerStartRestartGroup.s();
                }
                Composer composerA3 = D1.a(composerStartRestartGroup);
                D1.c(composerA3, measurePolicyG2, companion.e());
                D1.c(composerA3, interfaceC5884sR3, companion.g());
                Function2<InterfaceC5953g, Integer, Unit> function2B3 = companion.b();
                if (composerA3.h() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                D1.c(composerA3, modifierE3, companion.f());
                C5806j c5806j2 = C5806j.f48836a;
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
            t0L.a(new b(interfaceC14902f, function2, function22, i10));
        }
    }

    static {
        Modifier.Companion companion = Modifier.INSTANCE;
        float f10 = 24;
        f168647a = D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), 0.0f, 10, null);
        f168648b = D.m(companion, H1.h.p(f10), 0.0f, H1.h.p(f10), H1.h.p(28), 2, null);
        f168649c = w.i(40);
        f168650d = w.i(36);
        f168651e = w.i(38);
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17985a.b(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, V0.D1, long, long, androidx.compose.runtime.Composer, int, int):void");
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
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            int i16 = ((i15 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.h()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
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
