package androidx.compose.animation;

import H1.r;
import M0.SnapshotStateList;
import Z.W;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.E;
import androidx.compose.runtime.F;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import kotlin.C6165d;
import kotlin.C6167f;
import kotlin.C6169i;
import kotlin.C6320d0;
import kotlin.C6327j;
import kotlin.E0;
import kotlin.EnumC6171k;
import kotlin.InterfaceC6163b;
import kotlin.InterfaceC6166e;
import kotlin.InterfaceC6293F;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.u;

@Metadata(d1 = {"\u0000t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a±\u0001\u0010\u0015\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aW\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\u0018\u001a\u00020\u00172>\b\u0002\u0010\u001d\u001a8\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00110\u0019¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u001c0\u0011¢\u0006\u0004\b\u001f\u0010 \u001a\u001c\u0010$\u001a\u00020\u0006*\u00020!2\u0006\u0010#\u001a\u00020\"H\u0086\u0004¢\u0006\u0004\b$\u0010%\u001a©\u0001\u0010'\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000&2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001f\b\u0002\u0010\b\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u00072\b\b\u0002\u0010\n\u001a\u00020\t2%\b\u0002\u0010\u0010\u001a\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00042,\u0010\u0014\u001a(\u0012\u0004\u0012\u00020\u0012\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010)¨\u0006+"}, d2 = {"S", "targetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/animation/d;", "Lb0/i;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "LP0/e;", "contentAlignment", "", "label", "Lkotlin/ParameterName;", "name", "", "contentKey", "Lkotlin/Function2;", "Lb0/b;", "", "content", "b", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;LP0/e;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "", "clip", "LH1/r;", "initialSize", "targetSize", "Lc0/F;", "sizeAnimationSpec", "Lb0/u;", "c", "(ZLkotlin/jvm/functions/Function2;)Lb0/u;", "Landroidx/compose/animation/h;", "Landroidx/compose/animation/j;", "exit", "f", "(Landroidx/compose/animation/h;Landroidx/compose/animation/j;)Lb0/i;", "Lc0/k0;", "a", "(Lc0/k0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;LP0/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;II)V", "J", "UnspecifiedSize", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f47756a;

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.animation.a$a, reason: collision with other inner class name */
    static final class C0969a<S> extends Lambda implements Function1<androidx.compose.animation.d<S>, C6169i> {

        /* renamed from: f, reason: collision with root package name */
        public static final C0969a f47757f = new C0969a();

        C0969a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6169i invoke(androidx.compose.animation.d<S> dVar) {
            return a.f(androidx.compose.animation.f.m(C6327j.l(220, 90, null, 4, null), 0.0f, 2, null).c(androidx.compose.animation.f.q(C6327j.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.f.o(C6327j.l(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b<S> extends Lambda implements Function1<S, S> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f47758f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s10) {
            return s10;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ S f47759f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f47760g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<S>, C6169i> f47761h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ P0.e f47762i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f47763j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1<S, Object> f47764k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC6163b, S, Composer, Integer, Unit> f47765l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f47766m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f47767n;

        public final void a(Composer composer, int i10) {
            a.b(this.f47759f, this.f47760g, this.f47761h, this.f47762i, this.f47763j, this.f47764k, this.f47765l, composer, J0.a(this.f47766m | 1), this.f47767n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(S s10, Modifier modifier, Function1<? super androidx.compose.animation.d<S>, C6169i> function1, P0.e eVar, String str, Function1<? super S, ? extends Object> function12, Function4<? super InterfaceC6163b, ? super S, ? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f47759f = s10;
            this.f47760g = modifier;
            this.f47761h = function1;
            this.f47762i = eVar;
            this.f47763j = str;
            this.f47764k = function12;
            this.f47765l = function4;
            this.f47766m = i10;
            this.f47767n = i11;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d<S> extends Lambda implements Function1<androidx.compose.animation.d<S>, C6169i> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f47768f = new d();

        d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6169i invoke(androidx.compose.animation.d<S> dVar) {
            return a.f(androidx.compose.animation.f.m(C6327j.l(220, 90, null, 4, null), 0.0f, 2, null).c(androidx.compose.animation.f.q(C6327j.l(220, 90, null, 4, null), 0.92f, 0L, 4, null)), androidx.compose.animation.f.o(C6327j.l(90, 0, null, 6, null), 0.0f, 2, null));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [S] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e<S> extends Lambda implements Function1<S, S> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f47769f = new e();

        e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final S invoke(S s10) {
            return s10;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"S", "", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<S> f47770f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ S f47771g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<S>, C6169i> f47772h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f47773i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<S> f47774j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC6163b, S, Composer, Integer, Unit> f47775k;

        @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"S", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.animation.a$f$a, reason: collision with other inner class name */
        static final class C0970a extends Lambda implements Function3<K, I, H1.b, J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C6169i f47776f;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.animation.a$f$a$a, reason: collision with other inner class name */
            static final class C0971a extends Lambda implements Function1<f0.a, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ f0 f47777f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C6169i f47778g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0971a(f0 f0Var, C6169i c6169i) {
                    super(1);
                    this.f47777f = f0Var;
                    this.f47778g = c6169i;
                }

                public final void a(f0.a aVar) {
                    aVar.g(this.f47777f, 0, 0, this.f47778g.d());
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                    a(aVar);
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0970a(C6169i c6169i) {
                super(3);
                this.f47776f = c6169i;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ J invoke(K k10, I i10, H1.b bVar) {
                return a(k10, i10, bVar.getValue());
            }

            public final J a(K k10, I i10, long j10) {
                f0 f0VarK0 = i10.k0(j10);
                return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new C0971a(f0VarK0, this.f47776f), 4, null);
            }
        }

        /* JADX INFO: Add missing generic type declarations: [S] */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class b<S> extends Lambda implements Function1<S, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ S f47779f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(S s10) {
                super(1);
                this.f47779f = s10;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(S s10) {
                return Boolean.valueOf(Intrinsics.e(s10, this.f47779f));
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"S", "Lb0/k;", "currentState", "targetState", "", "a", "(Lb0/k;Lb0/k;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class c extends Lambda implements Function2<EnumC6171k, EnumC6171k, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ j f47780f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(j jVar) {
                super(2);
                this.f47780f = jVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(EnumC6171k enumC6171k, EnumC6171k enumC6171k2) {
                EnumC6171k enumC6171k3 = EnumC6171k.f59617c;
                return Boolean.valueOf(enumC6171k == enumC6171k3 && enumC6171k2 == enumC6171k3 && !this.f47780f.getData().getHold());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Lb0/e;", "", "a", "(Lb0/e;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class d extends Lambda implements Function3<InterfaceC6166e, Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<S> f47781f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ S f47782g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f47783h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function4<InterfaceC6163b, S, Composer, Integer, Unit> f47784i;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: androidx.compose.animation.a$f$d$a, reason: collision with other inner class name */
            static final class C0972a extends Lambda implements Function1<F, E> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ SnapshotStateList<S> f47785f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ S f47786g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ AnimatedContentTransitionScopeImpl<S> f47787h;

                @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/animation/a$f$d$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                @SourceDebugExtension
                /* renamed from: androidx.compose.animation.a$f$d$a$a, reason: collision with other inner class name */
                public static final class C0973a implements E {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ SnapshotStateList f47788a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ Object f47789b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ AnimatedContentTransitionScopeImpl f47790c;

                    public C0973a(SnapshotStateList snapshotStateList, Object obj, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
                        this.f47788a = snapshotStateList;
                        this.f47789b = obj;
                        this.f47790c = animatedContentTransitionScopeImpl;
                    }

                    @Override // androidx.compose.runtime.E
                    public void dispose() {
                        this.f47788a.remove(this.f47789b);
                        this.f47790c.h().u(this.f47789b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0972a(SnapshotStateList<S> snapshotStateList, S s10, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl) {
                    super(1);
                    this.f47785f = snapshotStateList;
                    this.f47786g = s10;
                    this.f47787h = animatedContentTransitionScopeImpl;
                }

                @Override // kotlin.jvm.functions.Function1
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final E invoke(F f10) {
                    return new C0973a(this.f47785f, this.f47786g, this.f47787h);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            d(SnapshotStateList<S> snapshotStateList, S s10, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, Function4<? super InterfaceC6163b, ? super S, ? super Composer, ? super Integer, Unit> function4) {
                super(3);
                this.f47781f = snapshotStateList;
                this.f47782g = s10;
                this.f47783h = animatedContentTransitionScopeImpl;
                this.f47784i = function4;
            }

            public final void a(InterfaceC6166e interfaceC6166e, Composer composer, int i10) {
                if ((i10 & 6) == 0) {
                    i10 |= (i10 & 8) == 0 ? composer.V(interfaceC6166e) : composer.D(interfaceC6166e) ? 4 : 2;
                }
                if (!composer.p((i10 & 19) != 18, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-616195562, i10, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous>.<anonymous> (AnimatedContent.kt:853)");
                }
                boolean zV = composer.V(this.f47781f) | composer.D(this.f47782g) | composer.D(this.f47783h);
                SnapshotStateList<S> snapshotStateList = this.f47781f;
                S s10 = this.f47782g;
                AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl = this.f47783h;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new C0972a(snapshotStateList, s10, animatedContentTransitionScopeImpl);
                    composer.t(objB);
                }
                androidx.compose.runtime.J.c(interfaceC6166e, (Function1) objB, composer, i10 & 14);
                W wH = this.f47783h.h();
                S s11 = this.f47782g;
                Intrinsics.h(interfaceC6166e, "null cannot be cast to non-null type androidx.compose.animation.AnimatedVisibilityScopeImpl");
                wH.x(s11, ((C6167f) interfaceC6166e).a());
                Object objB2 = composer.B();
                if (objB2 == Composer.INSTANCE.a()) {
                    objB2 = new androidx.compose.animation.c(interfaceC6166e);
                    composer.t(objB2);
                }
                this.f47784i.invoke((androidx.compose.animation.c) objB2, this.f47782g, composer, 0);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC6166e interfaceC6166e, Composer composer, Integer num) {
                a(interfaceC6166e, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(885640742, i10, -1, "androidx.compose.animation.AnimatedContent.<anonymous>.<anonymous> (AnimatedContent.kt:817)");
            }
            Function1<androidx.compose.animation.d<S>, C6169i> function1 = this.f47772h;
            Object obj = this.f47773i;
            C6169i c6169iB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (c6169iB == companion.a()) {
                c6169iB = function1.invoke(obj);
                composer.t(c6169iB);
            }
            C6169i c6169i = (C6169i) c6169iB;
            boolean zA = composer.a(Intrinsics.e(this.f47770f.m().a(), this.f47771g));
            k0<S> k0Var = this.f47770f;
            S s10 = this.f47771g;
            Function1<androidx.compose.animation.d<S>, C6169i> function12 = this.f47772h;
            Object obj2 = this.f47773i;
            Object objB = composer.B();
            if (zA || objB == companion.a()) {
                objB = Intrinsics.e(k0Var.m().a(), s10) ? j.INSTANCE.a() : function12.invoke(obj2).getInitialContentExit();
                composer.t(objB);
            }
            j jVar = (j) objB;
            S s11 = this.f47771g;
            k0<S> k0Var2 = this.f47770f;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = new AnimatedContentTransitionScopeImpl.a(Intrinsics.e(s11, k0Var2.o()));
                composer.t(objB2);
            }
            AnimatedContentTransitionScopeImpl.a aVar = (AnimatedContentTransitionScopeImpl.a) objB2;
            androidx.compose.animation.h targetContentEnter = c6169i.getTargetContentEnter();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            boolean zD = composer.D(c6169i);
            Object objB3 = composer.B();
            if (zD || objB3 == companion.a()) {
                objB3 = new C0970a(c6169i);
                composer.t(objB3);
            }
            Modifier modifierA = D.a(companion2, (Function3) objB3);
            aVar.c(Intrinsics.e(this.f47771g, this.f47770f.o()));
            Modifier modifierThen = modifierA.then(aVar);
            k0<S> k0Var3 = this.f47770f;
            boolean zD2 = composer.D(this.f47771g);
            S s12 = this.f47771g;
            Object objB4 = composer.B();
            if (zD2 || objB4 == companion.a()) {
                objB4 = new b(s12);
                composer.t(objB4);
            }
            Function1 function13 = (Function1) objB4;
            boolean zV = composer.V(jVar);
            Object objB5 = composer.B();
            if (zV || objB5 == companion.a()) {
                objB5 = new c(jVar);
                composer.t(objB5);
            }
            C6165d.a(k0Var3, function13, modifierThen, targetContentEnter, jVar, (Function2) objB5, null, ComposableLambdaKt.c(-616195562, true, new d(this.f47774j, this.f47771g, this.f47773i, this.f47775k), composer, 54), composer, 12582912, 64);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(k0<S> k0Var, S s10, Function1<? super androidx.compose.animation.d<S>, C6169i> function1, AnimatedContentTransitionScopeImpl<S> animatedContentTransitionScopeImpl, SnapshotStateList<S> snapshotStateList, Function4<? super InterfaceC6163b, ? super S, ? super Composer, ? super Integer, Unit> function4) {
            super(2);
            this.f47770f = k0Var;
            this.f47771g = s10;
            this.f47772h = function1;
            this.f47773i = animatedContentTransitionScopeImpl;
            this.f47774j = snapshotStateList;
            this.f47775k = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<S> f47791f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f47792g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<androidx.compose.animation.d<S>, C6169i> f47793h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ P0.e f47794i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function1<S, Object> f47795j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function4<InterfaceC6163b, S, Composer, Integer, Unit> f47796k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f47797l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f47798m;

        public final void a(Composer composer, int i10) {
            a.a(this.f47791f, this.f47792g, this.f47793h, this.f47794i, this.f47795j, this.f47796k, composer, J0.a(this.f47797l | 1), this.f47798m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(k0<S> k0Var, Modifier modifier, Function1<? super androidx.compose.animation.d<S>, C6169i> function1, P0.e eVar, Function1<? super S, ? extends Object> function12, Function4<? super InterfaceC6163b, ? super S, ? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f47791f = k0Var;
            this.f47792g = modifier;
            this.f47793h = function1;
            this.f47794i = eVar;
            this.f47795j = function12;
            this.f47796k = function4;
            this.f47797l = i10;
            this.f47798m = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LH1/r;", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lc0/d0;", "a", "(JJ)Lc0/d0;"}, k = 3, mv = {1, 9, 0})
    public static final class h extends Lambda implements Function2<r, r, C6320d0<r>> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f47799f = new h();

        h() {
            super(2);
        }

        public final C6320d0<r> a(long j10, long j11) {
            return C6327j.j(0.0f, 400.0f, r.b(E0.d(r.INSTANCE)), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C6320d0<r> invoke(r rVar, r rVar2) {
            return a(rVar.getPackedValue(), rVar2.getPackedValue());
        }
    }

    static {
        long j10 = Integer.MIN_VALUE;
        f47756a = r.c((j10 & 4294967295L) | (j10 << 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void a(kotlin.k0<S> r17, androidx.compose.ui.Modifier r18, kotlin.jvm.functions.Function1<? super androidx.compose.animation.d<S>, kotlin.C6169i> r19, P0.e r20, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r21, kotlin.jvm.functions.Function4<? super kotlin.InterfaceC6163b, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.a(c0.k0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, P0.e, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S> void b(S r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function1<? super androidx.compose.animation.d<S>, kotlin.C6169i> r21, P0.e r22, java.lang.String r23, kotlin.jvm.functions.Function1<? super S, ? extends java.lang.Object> r24, kotlin.jvm.functions.Function4<? super kotlin.InterfaceC6163b, ? super S, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.a.b(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, P0.e, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function4, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final u c(boolean z10, Function2<? super r, ? super r, ? extends InterfaceC6293F<r>> function2) {
        return new m(z10, function2);
    }

    public static /* synthetic */ u d(boolean z10, Function2 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            function2 = h.f47799f;
        }
        return c(z10, function2);
    }

    public static final C6169i f(androidx.compose.animation.h hVar, j jVar) {
        return new C6169i(hVar, jVar, 0.0f, null, 12, null);
    }
}
