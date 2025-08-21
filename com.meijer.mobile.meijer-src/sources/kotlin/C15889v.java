package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.layout.r0;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001aR\u0010\u000e\u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u001d\u0010\f\u001a\u0019\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkotlin/Function0;", "Ln0/r;", "itemProvider", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/lazy/layout/d;", "prefetchState", "Lkotlin/Function2;", "Ln0/w;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "Lkotlin/ExtensionFunctionType;", "measurePolicy", "", "a", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/d;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.v, reason: from Kotlin metadata and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15889v {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL0/e;", "saveableStateHolder", "", "a", "(LL0/e;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: n0.v$a */
    static final class a extends Lambda implements Function3<L0.e, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f151976f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f151977g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC15890w, H1.b, J> f151978h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z1<Function0<InterfaceC15885r>> f151979i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: n0.v$a$a, reason: collision with other inner class name */
        static final class C2346a extends Lambda implements Function1<F, E> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.lazy.layout.d f151980f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C15883p f151981g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ q0 f151982h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ InterfaceC15864X f151983i;

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"n0/v$a$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: n0.v$a$a$a, reason: collision with other inner class name */
            public static final class C2347a implements E {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.lazy.layout.d f151984a;

                public C2347a(androidx.compose.foundation.lazy.layout.d dVar) {
                    this.f151984a = dVar;
                }

                @Override // androidx.compose.runtime.E
                public void dispose() {
                    this.f151984a.f(null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2346a(androidx.compose.foundation.lazy.layout.d dVar, C15883p c15883p, q0 q0Var, InterfaceC15864X interfaceC15864X) {
                super(1);
                this.f151980f = dVar;
                this.f151981g = c15883p;
                this.f151982h = q0Var;
                this.f151983i = interfaceC15864X;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke(F f10) {
                this.f151980f.f(new androidx.compose.foundation.lazy.layout.h(this.f151981g, this.f151982h, this.f151983i));
                return new C2347a(this.f151980f);
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: n0.v$a$b */
        static final class b extends Lambda implements Function2<r0, H1.b, J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C15883p f151985f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<InterfaceC15890w, H1.b, J> f151986g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(C15883p c15883p, Function2<? super InterfaceC15890w, ? super H1.b, ? extends J> function2) {
                super(2);
                this.f151985f = c15883p;
                this.f151986g = function2;
            }

            public final J a(r0 r0Var, long j10) {
                return this.f151986g.invoke(new C15891x(this.f151985f, r0Var), H1.b.a(j10));
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ J invoke(r0 r0Var, H1.b bVar) {
                return a(r0Var, bVar.getValue());
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln0/r;", "c", "()Ln0/r;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: n0.v$a$c */
        static final class c extends Lambda implements Function0<InterfaceC15885r> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ z1<Function0<InterfaceC15885r>> f151987f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(z1<? extends Function0<? extends InterfaceC15885r>> z1Var) {
                super(0);
                this.f151987f = z1Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final InterfaceC15885r invoke() {
                return this.f151987f.getValue().invoke();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.foundation.lazy.layout.d dVar, Modifier modifier, Function2<? super InterfaceC15890w, ? super H1.b, ? extends J> function2, z1<? extends Function0<? extends InterfaceC15885r>> z1Var) {
            super(3);
            this.f151976f = dVar;
            this.f151977g = modifier;
            this.f151978h = function2;
            this.f151979i = z1Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(L0.e eVar, Composer composer, Integer num) {
            a(eVar, composer, num.intValue());
            return Unit.f143329a;
        }

        public final void a(L0.e eVar, Composer composer, int i10) {
            if (ComposerKt.M()) {
                ComposerKt.U(-1488997347, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:56)");
            }
            z1<Function0<InterfaceC15885r>> z1Var = this.f151979i;
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new C15883p(eVar, new c(z1Var));
                composer.t(objB);
            }
            C15883p c15883p = (C15883p) objB;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new q0(new C15887t(c15883p));
                composer.t(objB2);
            }
            q0 q0Var = (q0) objB2;
            if (this.f151976f != null) {
                composer.startReplaceGroup(204281539);
                InterfaceC15864X prefetchScheduler = this.f151976f.getPrefetchScheduler();
                if (prefetchScheduler == null) {
                    composer.startReplaceGroup(6591363);
                    prefetchScheduler = C15865Y.a(composer, 0);
                } else {
                    composer.startReplaceGroup(6590278);
                }
                composer.P();
                Object obj = this.f151976f;
                Object[] objArr = {obj, c15883p, q0Var, prefetchScheduler};
                boolean zV = composer.V(obj) | composer.D(c15883p) | composer.D(q0Var) | composer.D(prefetchScheduler);
                androidx.compose.foundation.lazy.layout.d dVar = this.f151976f;
                Object objB3 = composer.B();
                if (zV || objB3 == companion.a()) {
                    objB3 = new C2346a(dVar, c15883p, q0Var, prefetchScheduler);
                    composer.t(objB3);
                }
                androidx.compose.runtime.J.d(objArr, (Function1) objB3, composer, 0);
                composer.P();
            } else {
                composer.startReplaceGroup(204710145);
                composer.P();
            }
            Modifier modifierB = androidx.compose.foundation.lazy.layout.e.b(this.f151977g, this.f151976f);
            boolean zV2 = composer.V(c15883p) | composer.V(this.f151978h);
            Function2<InterfaceC15890w, H1.b, J> function2 = this.f151978h;
            Object objB4 = composer.B();
            if (zV2 || objB4 == companion.a()) {
                objB4 = new b(c15883p, function2);
                composer.t(objB4);
            }
            p0.b(q0Var, modifierB, (Function2) objB4, composer, q0.f51357f, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: n0.v$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function0<InterfaceC15885r> f151988f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f151989g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.layout.d f151990h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC15890w, H1.b, J> f151991i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f151992j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f151993k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function0<? extends InterfaceC15885r> function0, Modifier modifier, androidx.compose.foundation.lazy.layout.d dVar, Function2<? super InterfaceC15890w, ? super H1.b, ? extends J> function2, int i10, int i11) {
            super(2);
            this.f151988f = function0;
            this.f151989g = modifier;
            this.f151990h = dVar;
            this.f151991i = function2;
            this.f151992j = i10;
            this.f151993k = i11;
        }

        public final void a(Composer composer, int i10) {
            C15889v.a(this.f151988f, this.f151989g, this.f151990h, this.f151991i, composer, J0.a(this.f151992j | 1), this.f151993k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(Function0<? extends InterfaceC15885r> function0, Modifier modifier, androidx.compose.foundation.lazy.layout.d dVar, Function2<? super InterfaceC15890w, ? super H1.b, ? extends J> function2, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        Composer composerStartRestartGroup = composer.startRestartGroup(2002163445);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(function0)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.V(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i18 = i11 & 4;
        if (i18 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(dVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (composerStartRestartGroup.D(function2)) {
                i16 = RecyclerView.m.FLAG_MOVED;
            } else {
                i16 = 1024;
            }
            i12 |= i16;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (composerStartRestartGroup.p(z10, i12 & 1)) {
            if (i17 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i18 != 0) {
                dVar = null;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2002163445, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:52)");
            }
            C15855N.a(ComposableLambdaKt.c(-1488997347, true, new a(dVar, modifier, function2, o1.p(function0, composerStartRestartGroup, i12 & 14)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        Modifier modifier2 = modifier;
        androidx.compose.foundation.lazy.layout.d dVar2 = dVar;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(function0, modifier2, dVar2, function2, i10, i11));
        }
    }
}
