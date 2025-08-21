package kotlin;

import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import kotlin.C6456m;
import kotlin.InterfaceC6419F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.l0;
import kotlin.o0;
import kotlin.q0;

@Metadata(d1 = {"\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u001aU\u0010\f\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0083\u0001\u0010\u0013\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042%\b\u0002\u0010\u0012\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00110\t2!\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016²\u0006\u0012\u0010\u0015\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00008\nX\u008a\u0084\u0002"}, d2 = {"T", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lc0/F;", "", "animationSpec", "", "label", "Lkotlin/Function1;", "", "content", "b", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lc0/F;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lc0/k0;", "Lkotlin/ParameterName;", "name", "", "contentKey", "a", "(Lc0/k0;Landroidx/compose/ui/Modifier;Lc0/F;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "alpha", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: b0.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6310j {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.j$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f59800f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f59801g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6419F<Float> f59802h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f59803i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<T, Composer, Integer, Unit> f59804j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f59805k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f59806l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(T t10, Modifier modifier, InterfaceC6419F<Float> interfaceC6419F, String str, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f59800f = t10;
            this.f59801g = modifier;
            this.f59802h = interfaceC6419F;
            this.f59803i = str;
            this.f59804j = function3;
            this.f59805k = i10;
            this.f59806l = i11;
        }

        public final void a(Composer composer, int i10) {
            C6310j.b(this.f59800f, this.f59801g, this.f59802h, this.f59803i, this.f59804j, composer, J0.a(this.f59805k | 1), this.f59806l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.j$b */
    static final class b<T> extends Lambda implements Function1<T, T> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f59807f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final T invoke(T t10) {
            return t10;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b0.j$c */
    static final class c<T> extends Lambda implements Function1<T, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<T> f59808f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(k0<T> k0Var) {
            super(1);
            this.f59808f = k0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.valueOf(!Intrinsics.e(t10, this.f59808f.o()));
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "b", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: b0.j$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<T> f59809f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6419F<Float> f59810g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f59811h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<T, Composer, Integer, Unit> f59812i;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/graphics/e;", "", "a", "(Landroidx/compose/ui/graphics/e;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: b0.j$d$a */
        static final class a extends Lambda implements Function1<androidx.compose.ui.graphics.e, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<Float> f59813f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z1<Float> z1Var) {
                super(1);
                this.f59813f = z1Var;
            }

            public final void a(androidx.compose.ui.graphics.e eVar) {
                eVar.d(d.c(this.f59813f));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.e eVar) {
                a(eVar);
                return Unit.f143329a;
            }
        }

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lc0/k0$b;", "Lc0/F;", "", "a", "(Lc0/k0$b;Landroidx/compose/runtime/Composer;I)Lc0/F;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: b0.j$d$b */
        static final class b<T> extends Lambda implements Function3<k0.b<T>, Composer, Integer, InterfaceC6419F<Float>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC6419F<Float> f59814f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC6419F<Float> interfaceC6419F) {
                super(3);
                this.f59814f = interfaceC6419F;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ InterfaceC6419F<Float> invoke(Object obj, Composer composer, Integer num) {
                return a((k0.b) obj, composer, num.intValue());
            }

            public final InterfaceC6419F<Float> a(k0.b<T> bVar, Composer composer, int i10) {
                composer.startReplaceGroup(438406499);
                if (ComposerKt.M()) {
                    ComposerKt.U(438406499, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:126)");
                }
                InterfaceC6419F<Float> interfaceC6419F = this.f59814f;
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composer.P();
                return interfaceC6419F;
            }
        }

        public final void b(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1426421288, i10, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous> (Crossfade.kt:125)");
            }
            k0<T> k0Var = this.f59809f;
            b bVar = new b(this.f59810g);
            T t10 = this.f59811h;
            o0<Float, C6456m> o0VarI = q0.i(FloatCompanionObject.f143729a);
            Object objH = k0Var.h();
            composer.startReplaceGroup(-438678252);
            if (ComposerKt.M()) {
                ComposerKt.U(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            float f10 = Intrinsics.e(objH, t10) ? 1.0f : 0.0f;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            Float fValueOf = Float.valueOf(f10);
            Object objO = k0Var.o();
            composer.startReplaceGroup(-438678252);
            if (ComposerKt.M()) {
                ComposerKt.U(-438678252, 0, -1, "androidx.compose.animation.Crossfade.<anonymous>.<anonymous>.<anonymous> (Crossfade.kt:127)");
            }
            float f11 = Intrinsics.e(objO, t10) ? 1.0f : 0.0f;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            z1 z1VarF = l0.f(k0Var, fValueOf, Float.valueOf(f11), bVar.invoke(k0Var.m(), composer, 0), o0VarI, "FloatAnimation", composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zV = composer.V(z1VarF);
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(z1VarF);
                composer.t(objB);
            }
            Modifier modifierA = androidx.compose.ui.graphics.d.a(companion, (Function1) objB);
            Function3<T, Composer, Integer, Unit> function3 = this.f59812i;
            T t11 = this.f59811h;
            MeasurePolicy measurePolicyG = C5804h.g(P0.e.INSTANCE.o(), false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierA);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            function3.invoke(t11, composer, 0);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(k0<T> k0Var, InterfaceC6419F<Float> interfaceC6419F, T t10, Function3<? super T, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f59809f = k0Var;
            this.f59810g = interfaceC6419F;
            this.f59811h = t10;
            this.f59812i = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            b(composer, num.intValue());
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float c(z1<Float> z1Var) {
            return z1Var.getValue().floatValue();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.j$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<T> f59815f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f59816g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC6419F<Float> f59817h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<T, Object> f59818i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<T, Composer, Integer, Unit> f59819j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f59820k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f59821l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(k0<T> k0Var, Modifier modifier, InterfaceC6419F<Float> interfaceC6419F, Function1<? super T, ? extends Object> function1, Function3<? super T, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f59815f = k0Var;
            this.f59816g = modifier;
            this.f59817h = interfaceC6419F;
            this.f59818i = function1;
            this.f59819j = function3;
            this.f59820k = i10;
            this.f59821l = i11;
        }

        public final void a(Composer composer, int i10) {
            C6310j.a(this.f59815f, this.f59816g, this.f59817h, this.f59818i, this.f59819j, composer, J0.a(this.f59820k | 1), this.f59821l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void a(kotlin.k0<T> r16, androidx.compose.ui.Modifier r17, kotlin.InterfaceC6419F<java.lang.Float> r18, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r19, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C6310j.a(c0.k0, androidx.compose.ui.Modifier, c0.F, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void b(T r16, androidx.compose.ui.Modifier r17, kotlin.InterfaceC6419F<java.lang.Float> r18, java.lang.String r19, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C6310j.b(java.lang.Object, androidx.compose.ui.Modifier, c0.F, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
