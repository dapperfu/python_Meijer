package j4;

import M0.SnapshotStateList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.platform.M0;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6169p;
import androidx.view.InterfaceC6172s;
import j4.g;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.C14667h;
import kotlin.C14675p;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\t\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0012²\u0006\u0012\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00108\nX\u008a\u0084\u0002"}, d2 = {"Lj4/g;", "dialogNavigator", "", "a", "(Lj4/g;Landroidx/compose/runtime/Composer;I)V", "", "Li4/h;", "", "backStack", "d", "(Ljava/util/List;Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)V", "LM0/m;", "f", "(Ljava/util/Collection;Landroidx/compose/runtime/Composer;I)LM0/m;", "", "dialogBackStack", "", "transitionInProgress", "navigation-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class f {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f139852f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C14667h f139853g;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, C14667h c14667h) {
            super(0);
            this.f139852f = gVar;
            this.f139853g = c14667h;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f139852f.m(this.f139853g);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14667h f139854f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ L0.e f139855g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<C14667h> f139856h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ g f139857i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ g.b f139858j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 8, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function1<F, E> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<C14667h> f139859f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C14667h f139860g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ g f139861h;

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"j4/f$b$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: j4.f$b$a$a, reason: collision with other inner class name */
            public static final class C2215a implements E {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ g f139862a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C14667h f139863b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ SnapshotStateList f139864c;

                public C2215a(g gVar, C14667h c14667h, SnapshotStateList snapshotStateList) {
                    this.f139862a = gVar;
                    this.f139863b = c14667h;
                    this.f139864c = snapshotStateList;
                }

                @Override // androidx.compose.runtime.E
                public void dispose() {
                    this.f139862a.p(this.f139863b);
                    this.f139864c.remove(this.f139863b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(SnapshotStateList<C14667h> snapshotStateList, C14667h c14667h, g gVar) {
                super(1);
                this.f139859f = snapshotStateList;
                this.f139860g = c14667h;
                this.f139861h = gVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final E invoke(F f10) {
                this.f139859f.add(this.f139860g);
                return new C2215a(this.f139861h, this.f139860g, this.f139859f);
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: j4.f$b$b, reason: collision with other inner class name */
        static final class C2216b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g.b f139865f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ C14667h f139866g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2216b(g.b bVar, C14667h c14667h) {
                super(2);
                this.f139865f = bVar;
                this.f139866g = c14667h;
            }

            public final void a(Composer composer, int i10) {
                if ((i10 & 11) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-497631156, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous>.<anonymous> (DialogHost.kt:66)");
                }
                this.f139865f.H().invoke(this.f139866g, composer, 8);
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
        b(C14667h c14667h, L0.e eVar, SnapshotStateList<C14667h> snapshotStateList, g gVar, g.b bVar) {
            super(2);
            this.f139854f = c14667h;
            this.f139855g = eVar;
            this.f139856h = snapshotStateList;
            this.f139857i = gVar;
            this.f139858j = bVar;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 11) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1129586364, i10, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
            }
            C14667h c14667h = this.f139854f;
            J.c(c14667h, new a(this.f139856h, c14667h, this.f139857i), composer, 8);
            C14667h c14667h2 = this.f139854f;
            h.a(c14667h2, this.f139855g, ComposableLambdaKt.composableLambda(composer, -497631156, true, new C2216b(this.f139858j, c14667h2)), composer, 456);
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.navigation.compose.DialogHostKt$DialogHost$2$1", f = "DialogHost.kt", l = {}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f139867a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ z1<Set<C14667h>> f139868b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f139869c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<C14667h> f139870d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(z1<? extends Set<C14667h>> z1Var, g gVar, SnapshotStateList<C14667h> snapshotStateList, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f139868b = z1Var;
            this.f139869c = gVar;
            this.f139870d = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new c(this.f139868b, this.f139869c, this.f139870d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f139867a == 0) {
                ResultKt.b(obj);
                Set<C14667h> setC = f.c(this.f139868b);
                g gVar = this.f139869c;
                SnapshotStateList<C14667h> snapshotStateList = this.f139870d;
                for (C14667h c14667h : setC) {
                    if (!gVar.n().getValue().contains(c14667h) && !snapshotStateList.contains(c14667h)) {
                        gVar.p(c14667h);
                    }
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ g f139871f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f139872g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g gVar, int i10) {
            super(2);
            this.f139871f = gVar;
            this.f139872g = i10;
        }

        public final void a(Composer composer, int i10) {
            f.a(this.f139871f, composer, J0.a(this.f139872g | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 8, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function1<F, E> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C14667h f139873f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f139874g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<C14667h> f139875h;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"j4/f$e$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a implements E {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C14667h f139876a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC6169p f139877b;

            public a(C14667h c14667h, InterfaceC6169p interfaceC6169p) {
                this.f139876a = c14667h;
                this.f139877b = interfaceC6169p;
            }

            @Override // androidx.compose.runtime.E
            public void dispose() {
                this.f139876a.getLifecycle().d(this.f139877b);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/lifecycle/s;", "<anonymous parameter 0>", "Landroidx/lifecycle/l$a;", "event", "", "<anonymous>", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V"}, k = 3, mv = {1, 8, 0})
        static final class b implements InterfaceC6169p {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f139878a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ List<C14667h> f139879b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C14667h f139880c;

            b(boolean z10, List<C14667h> list, C14667h c14667h) {
                this.f139878a = z10;
                this.f139879b = list;
                this.f139880c = c14667h;
            }

            @Override // androidx.view.InterfaceC6169p
            public final void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a aVar) {
                if (this.f139878a && !this.f139879b.contains(this.f139880c)) {
                    this.f139879b.add(this.f139880c);
                }
                if (aVar == AbstractC6165l.a.ON_START && !this.f139879b.contains(this.f139880c)) {
                    this.f139879b.add(this.f139880c);
                }
                if (aVar == AbstractC6165l.a.ON_STOP) {
                    this.f139879b.remove(this.f139880c);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(C14667h c14667h, boolean z10, List<C14667h> list) {
            super(1);
            this.f139873f = c14667h;
            this.f139874g = z10;
            this.f139875h = list;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final E invoke(F f10) {
            b bVar = new b(this.f139874g, this.f139875h, this.f139873f);
            this.f139873f.getLifecycle().a(bVar);
            return new a(this.f139873f, bVar);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j4.f$f, reason: collision with other inner class name */
    static final class C2217f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<C14667h> f139881f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Collection<C14667h> f139882g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f139883h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2217f(List<C14667h> list, Collection<C14667h> collection, int i10) {
            super(2);
            this.f139881f = list;
            this.f139882g = collection;
            this.f139883h = i10;
        }

        public final void a(Composer composer, int i10) {
            f.d(this.f139881f, this.f139882g, composer, J0.a(this.f139883h | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public static final void a(g gVar, Composer composer, int i10) {
        int i11;
        g gVar2;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(294589392);
        if ((i10 & 14) == 0) {
            if (composerStartRestartGroup.V(gVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
            gVar2 = gVar;
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(294589392, i11, -1, "androidx.navigation.compose.DialogHost (DialogHost.kt:40)");
            }
            L0.e eVarA = L0.g.a(composerStartRestartGroup, 0);
            z1 z1VarB = o1.b(gVar.n(), null, composerStartRestartGroup, 8, 1);
            SnapshotStateList<C14667h> snapshotStateListF = f(b(z1VarB), composerStartRestartGroup, 8);
            d(snapshotStateListF, b(z1VarB), composerStartRestartGroup, 64);
            z1 z1VarB2 = o1.b(gVar.o(), null, composerStartRestartGroup, 8, 1);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objB = composerStartRestartGroup.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = o1.f();
                composerStartRestartGroup.t(objB);
            }
            composerStartRestartGroup.U();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objB;
            composerStartRestartGroup.startReplaceableGroup(875188318);
            for (C14667h c14667h : snapshotStateListF) {
                C14675p destination = c14667h.getDestination();
                Intrinsics.h(destination, "null cannot be cast to non-null type androidx.navigation.compose.DialogNavigator.Destination");
                g.b bVar = (g.b) destination;
                g gVar3 = gVar;
                androidx.compose.ui.window.a.a(new a(gVar, c14667h), bVar.getDialogProperties(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1129586364, true, new b(c14667h, eVarA, snapshotStateList, gVar3, bVar)), composerStartRestartGroup, 384, 0);
                gVar = gVar3;
            }
            gVar2 = gVar;
            composerStartRestartGroup.U();
            Set<C14667h> setC = c(z1VarB2);
            composerStartRestartGroup.startReplaceableGroup(1618982084);
            boolean zV = composerStartRestartGroup.V(z1VarB2) | composerStartRestartGroup.V(gVar2) | composerStartRestartGroup.V(snapshotStateList);
            Object objB2 = composerStartRestartGroup.B();
            if (zV || objB2 == Composer.INSTANCE.a()) {
                objB2 = new c(z1VarB2, gVar2, snapshotStateList, null);
                composerStartRestartGroup.t(objB2);
            }
            composerStartRestartGroup.U();
            J.f(setC, snapshotStateList, (Function2) objB2, composerStartRestartGroup, 568);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new d(gVar2, i10));
    }

    private static final List<C14667h> b(z1<? extends List<C14667h>> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set<C14667h> c(z1<? extends Set<C14667h>> z1Var) {
        return z1Var.getValue();
    }

    public static final void d(List<C14667h> list, Collection<C14667h> collection, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1537894851);
        if (ComposerKt.M()) {
            ComposerKt.U(1537894851, i10, -1, "androidx.navigation.compose.PopulateVisibleList (DialogHost.kt:86)");
        }
        boolean zBooleanValue = ((Boolean) composerStartRestartGroup.o(M0.a())).booleanValue();
        for (C14667h c14667h : collection) {
            J.c(c14667h.getLifecycle(), new e(c14667h, zBooleanValue, list), composerStartRestartGroup, 8);
        }
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new C2217f(list, collection, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final M0.SnapshotStateList<kotlin.C14667h> f(java.util.Collection<kotlin.C14667h> r5, androidx.compose.runtime.Composer r6, int r7) {
        /*
            r0 = 467378629(0x1bdba1c5, float:3.6335052E-22)
            r6.startReplaceableGroup(r0)
            boolean r1 = androidx.compose.runtime.ComposerKt.M()
            if (r1 == 0) goto L12
            r1 = -1
            java.lang.String r2 = "androidx.navigation.compose.rememberVisibleList (DialogHost.kt:119)"
            androidx.compose.runtime.ComposerKt.U(r0, r7, r1, r2)
        L12:
            androidx.compose.runtime.F0 r7 = androidx.compose.ui.platform.M0.a()
            java.lang.Object r7 = r6.o(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r0 = 1157296644(0x44faf204, float:2007.563)
            r6.startReplaceableGroup(r0)
            boolean r0 = r6.V(r5)
            java.lang.Object r1 = r6.B()
            if (r0 != 0) goto L38
            androidx.compose.runtime.Composer$a r0 = androidx.compose.runtime.Composer.INSTANCE
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L72
        L38:
            M0.m r1 = androidx.compose.runtime.o1.f()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L47:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L6c
            java.lang.Object r2 = r5.next()
            r3 = r2
            i4.h r3 = (kotlin.C14667h) r3
            if (r7 == 0) goto L58
            r3 = 1
            goto L66
        L58:
            androidx.lifecycle.l r3 = r3.getLifecycle()
            androidx.lifecycle.l$b r3 = r3.getState()
            androidx.lifecycle.l$b r4 = androidx.view.AbstractC6165l.b.f55502d
            boolean r3 = r3.b(r4)
        L66:
            if (r3 == 0) goto L47
            r0.add(r2)
            goto L47
        L6c:
            r1.addAll(r0)
            r6.t(r1)
        L72:
            r6.U()
            M0.m r1 = (M0.SnapshotStateList) r1
            boolean r5 = androidx.compose.runtime.ComposerKt.M()
            if (r5 == 0) goto L80
            androidx.compose.runtime.ComposerKt.T()
        L80:
            r6.U()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.f.f(java.util.Collection, androidx.compose.runtime.Composer, int):M0.m");
    }
}
