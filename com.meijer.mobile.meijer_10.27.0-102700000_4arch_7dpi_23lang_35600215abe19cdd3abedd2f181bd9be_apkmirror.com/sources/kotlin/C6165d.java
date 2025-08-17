package kotlin;

import H1.r;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.recyclerview.widget.RecyclerView;
import j0.InterfaceC14814f;
import kotlin.C6307U;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import kotlin.l0;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000\\\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001aX\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\\\u0010\u0012\u001a\u00020\f*\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a^\u0010\u0016\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00000\u00142\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001ah\u0010\u001b\u001a\u00020\f\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u008e\u0001\u0010\"\u001a\u00020\f\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00000\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\u0017\u0010\u000e\u001a\u0013\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\rH\u0001¢\u0006\u0004\b\"\u0010#\u001a;\u0010%\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010$\u001a\u00028\u0000H\u0003¢\u0006\u0004\b%\u0010&\"\u001e\u0010)\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u001e0\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,²\u0006$\u0010*\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00000\u001d\"\u0004\b\u0000\u0010\u00188\nX\u008a\u0084\u0002²\u0006\u0012\u0010+\u001a\u00020\u0000\"\u0004\b\u0000\u0010\u00188\nX\u008a\u0084\u0002"}, d2 = {"", "visible", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/animation/h;", "enter", "Landroidx/compose/animation/j;", "exit", "", "label", "Lkotlin/Function1;", "Lb0/e;", "", "Lkotlin/ExtensionFunctionType;", "content", "f", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lj0/f;", "e", "(Lj0/f;ZLandroidx/compose/ui/Modifier;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Lc0/U;", "visibleState", "d", "(Lc0/U;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "T", "Lc0/k0;", "transition", "g", "(Lc0/k0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "Lkotlin/Function2;", "Lb0/k;", "shouldDisposeBlock", "Lb0/r;", "onLookaheadMeasured", "a", "(Lc0/k0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/h;Landroidx/compose/animation/j;Lkotlin/jvm/functions/Function2;Lb0/r;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "targetState", "k", "(Lc0/k0;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lb0/k;", "j", "(Lc0/k0;)Z", "exitFinished", "shouldDisposeBlockUpdated", "shouldDisposeAfterExit", "animation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: b0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6165d {

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: b0.d$a */
    static final class a extends Lambda implements Function3<K, I, H1.b, J> {

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: b0.d$a$a, reason: collision with other inner class name */
        static final class C1172a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f59522f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1172a(f0 f0Var) {
                super(1);
                this.f59522f = f0Var;
            }

            public final void a(f0.a aVar) {
                f0.a.h(aVar, this.f59522f, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        a(r rVar) {
            super(3);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ J invoke(K k10, I i10, H1.b bVar) {
            return a(k10, i10, bVar.getValue());
        }

        public final J a(K k10, I i10, long j10) {
            f0 f0VarK0 = i10.k0(j10);
            if (!k10.v0()) {
                return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight(), null, new C1172a(f0VarK0), 4, null);
            }
            r.c((f0VarK0.getHeight() & 4294967295L) | (f0VarK0.getWidth() << 32));
            throw null;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.d$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<T> f59523f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f59524g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f59525h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f59526i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f59527j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<EnumC6171k, EnumC6171k, Boolean> f59528k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC6166e, Composer, Integer, Unit> f59529l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f59530m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f59531n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(k0<T> k0Var, Function1<? super T, Boolean> function1, Modifier modifier, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function2<? super EnumC6171k, ? super EnumC6171k, Boolean> function2, r rVar, Function3<? super InterfaceC6166e, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f59523f = k0Var;
            this.f59524g = function1;
            this.f59525h = modifier;
            this.f59526i = hVar;
            this.f59527j = jVar;
            this.f59528k = function2;
            this.f59529l = function3;
            this.f59530m = i10;
            this.f59531n = i11;
        }

        public final void a(Composer composer, int i10) {
            C6165d.a(this.f59523f, this.f59524g, this.f59525h, this.f59526i, this.f59527j, this.f59528k, null, this.f59529l, composer, J0.a(this.f59530m | 1), this.f59531n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Landroidx/compose/runtime/D0;", "", "", "<anonymous>", "(Landroidx/compose/runtime/D0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$shouldDisposeAfterExit$2$1", f = "AnimatedVisibility.kt", l = {739}, m = "invokeSuspend")
    /* renamed from: b0.d$c */
    static final class c extends SuspendLambda implements Function2<D0<Boolean>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f59532a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f59533b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k0<EnumC6171k> f59534c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ z1<Function2<EnumC6171k, EnumC6171k, Boolean>> f59535d;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: b0.d$c$a */
        static final class a extends Lambda implements Function0<Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ k0<EnumC6171k> f59536f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k0<EnumC6171k> k0Var) {
                super(0);
                this.f59536f = k0Var;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(C6165d.j(this.f59536f));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: b0.d$c$b */
        static final class b<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ D0<Boolean> f59537a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ k0<EnumC6171k> f59538b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ z1<Function2<EnumC6171k, EnumC6171k, Boolean>> f59539c;

            /* JADX WARN: Multi-variable type inference failed */
            b(D0<Boolean> d02, k0<EnumC6171k> k0Var, z1<? extends Function2<? super EnumC6171k, ? super EnumC6171k, Boolean>> z1Var) {
                this.f59537a = d02;
                this.f59538b = k0Var;
                this.f59539c = z1Var;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                this.f59537a.setValue(Boxing.a(z10 ? ((Boolean) C6165d.b(this.f59539c).invoke(this.f59538b.h(), this.f59538b.o())).booleanValue() : false));
                return Unit.f142422a;
            }

            @Override // tv.InterfaceC17153g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(k0<EnumC6171k> k0Var, z1<? extends Function2<? super EnumC6171k, ? super EnumC6171k, Boolean>> z1Var, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f59534c = k0Var;
            this.f59535d = z1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f59534c, this.f59535d, continuation);
            cVar.f59533b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D0<Boolean> d02, Continuation<? super Unit> continuation) {
            return ((c) create(d02, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f59532a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                D0 d02 = (D0) this.f59533b;
                InterfaceC17152f interfaceC17152fQ = o1.q(new a(this.f59534c));
                b bVar = new b(d02, this.f59534c, this.f59535d);
                this.f59532a = 1;
                if (interfaceC17152fQ.collect(bVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b0.d$d, reason: collision with other inner class name */
    static final class C1173d extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final C1173d f59540f = new C1173d();

        C1173d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.d$e */
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f59541f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f59542g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f59543h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f59544i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f59545j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC6166e, Composer, Integer, Unit> f59546k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f59547l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f59548m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(boolean z10, Modifier modifier, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, String str, Function3<? super InterfaceC6166e, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f59541f = z10;
            this.f59542g = modifier;
            this.f59543h = hVar;
            this.f59544i = jVar;
            this.f59545j = str;
            this.f59546k = function3;
            this.f59547l = i10;
            this.f59548m = i11;
        }

        public final void a(Composer composer, int i10) {
            C6165d.f(this.f59541f, this.f59542g, this.f59543h, this.f59544i, this.f59545j, this.f59546k, composer, J0.a(this.f59547l | 1), this.f59548m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b0.d$f */
    static final class f extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f59549f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.d$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14814f f59550f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f59551g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f59552h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f59553i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f59554j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ String f59555k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC6166e, Composer, Integer, Unit> f59556l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f59557m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f59558n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(InterfaceC14814f interfaceC14814f, boolean z10, Modifier modifier, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, String str, Function3<? super InterfaceC6166e, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f59550f = interfaceC14814f;
            this.f59551g = z10;
            this.f59552h = modifier;
            this.f59553i = hVar;
            this.f59554j = jVar;
            this.f59555k = str;
            this.f59556l = function3;
            this.f59557m = i10;
            this.f59558n = i11;
        }

        public final void a(Composer composer, int i10) {
            C6165d.e(this.f59550f, this.f59551g, this.f59552h, this.f59553i, this.f59554j, this.f59555k, this.f59556l, composer, J0.a(this.f59557m | 1), this.f59558n);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b0.d$h */
    static final class h extends Lambda implements Function1<Boolean, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f59559f = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
            return a(bool.booleanValue());
        }

        public final Boolean a(boolean z10) {
            return Boolean.valueOf(z10);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.d$i */
    static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C6307U<Boolean> f59560f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f59561g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f59562h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f59563i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ String f59564j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC6166e, Composer, Integer, Unit> f59565k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f59566l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f59567m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(C6307U<Boolean> c6307u, Modifier modifier, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, String str, Function3<? super InterfaceC6166e, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f59560f = c6307u;
            this.f59561g = modifier;
            this.f59562h = hVar;
            this.f59563i = jVar;
            this.f59564j = str;
            this.f59565k = function3;
            this.f59566l = i10;
            this.f59567m = i11;
        }

        public final void a(Composer composer, int i10) {
            C6165d.d(this.f59560f, this.f59561g, this.f59562h, this.f59563i, this.f59564j, this.f59565k, composer, J0.a(this.f59566l | 1), this.f59567m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"T", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: b0.d$j */
    static final class j extends Lambda implements Function3<K, I, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f59568f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k0<T> f59569g;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: b0.d$j$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f59570f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var) {
                super(1);
                this.f59570f = f0Var;
            }

            public final void a(f0.a aVar) {
                f0.a.h(aVar, this.f59570f, 0, 0, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(Function1<? super T, Boolean> function1, k0<T> k0Var) {
            super(3);
            this.f59568f = function1;
            this.f59569g = k0Var;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ J invoke(K k10, I i10, H1.b bVar) {
            return a(k10, i10, bVar.getValue());
        }

        public final J a(K k10, I i10, long j10) {
            long jC;
            f0 f0VarK0 = i10.k0(j10);
            if (k10.v0() && !this.f59568f.invoke(this.f59569g.o()).booleanValue()) {
                jC = r.INSTANCE.a();
            } else {
                jC = r.c((f0VarK0.getWidth() << 32) | (f0VarK0.getHeight() & 4294967295L));
            }
            return K.G0(k10, (int) (jC >> 32), (int) (jC & 4294967295L), null, new a(f0VarK0), 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lb0/k;", "current", "target", "", "a", "(Lb0/k;Lb0/k;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: b0.d$k */
    static final class k extends Lambda implements Function2<EnumC6171k, EnumC6171k, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f59571f = new k();

        k() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC6171k enumC6171k, EnumC6171k enumC6171k2) {
            return Boolean.valueOf(enumC6171k == enumC6171k2 && enumC6171k2 == EnumC6171k.f59617c);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: b0.d$l */
    static final class l extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ k0<T> f59572f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f59573g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f59574h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.h f59575i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.j f59576j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC6166e, Composer, Integer, Unit> f59577k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f59578l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(k0<T> k0Var, Function1<? super T, Boolean> function1, Modifier modifier, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function3<? super InterfaceC6166e, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f59572f = k0Var;
            this.f59573g = function1;
            this.f59574h = modifier;
            this.f59575i = hVar;
            this.f59576j = jVar;
            this.f59577k = function3;
            this.f59578l = i10;
        }

        public final void a(Composer composer, int i10) {
            C6165d.g(this.f59572f, this.f59573g, this.f59574h, this.f59575i, this.f59576j, this.f59577k, composer, J0.a(this.f59578l | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public static final <T> void a(k0<T> k0Var, Function1<? super T, Boolean> function1, Modifier modifier, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function2<? super EnumC6171k, ? super EnumC6171k, Boolean> function2, r rVar, Function3<? super InterfaceC6166e, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        int i12;
        androidx.compose.animation.j jVar2;
        r rVar2;
        EnumC6171k enumC6171k;
        int i13;
        Modifier modifierA;
        r rVar3 = rVar;
        Composer composerStartRestartGroup = composer.startRestartGroup(-891967166);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(k0Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(function1) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= composerStartRestartGroup.V(hVar) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if ((i10 & 24576) == 0) {
                i12 |= composerStartRestartGroup.V(jVar2) ? 16384 : 8192;
            }
        }
        if ((i11 & 32) != 0) {
            i12 |= 196608;
        } else if ((i10 & 196608) == 0) {
            i12 |= composerStartRestartGroup.D(function2) ? 131072 : 65536;
        }
        int i14 = i11 & 64;
        int i15 = 1572864;
        if (i14 != 0) {
            i12 |= i15;
        } else if ((i10 & 1572864) == 0) {
            i15 = (i10 & 2097152) == 0 ? composerStartRestartGroup.V(rVar3) : composerStartRestartGroup.D(rVar3) ? 1048576 : 524288;
            i12 |= i15;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.D(function3) ? 8388608 : 4194304;
        }
        int i16 = i12;
        int i17 = 1;
        if (composerStartRestartGroup.p((4793491 & i16) != 4793490, i16 & 1)) {
            if (i14 != 0) {
                rVar3 = null;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-891967166, i16, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:718)");
            }
            if (function1.invoke(k0Var.o()).booleanValue() || function1.invoke(k0Var.h()).booleanValue() || k0Var.t() || k0Var.i()) {
                composerStartRestartGroup.startReplaceGroup(1788522886);
                int i18 = i16 & 14;
                int i19 = i18 | 48;
                int i20 = i19 & 14;
                r rVar4 = rVar3;
                boolean z10 = ((i20 ^ 6) > 4 && composerStartRestartGroup.V(k0Var)) || (i19 & 6) == 4;
                Object objB = composerStartRestartGroup.B();
                if (z10 || objB == Composer.INSTANCE.a()) {
                    objB = k0Var.h();
                    composerStartRestartGroup.t(objB);
                }
                if (k0Var.t()) {
                    objB = k0Var.h();
                }
                composerStartRestartGroup.startReplaceGroup(-466616829);
                if (ComposerKt.M()) {
                    ComposerKt.U(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)");
                }
                int i21 = i16 & 126;
                EnumC6171k enumC6171kK = k(k0Var, function1, objB, composerStartRestartGroup, i21);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composerStartRestartGroup.P();
                T tO = k0Var.o();
                composerStartRestartGroup.startReplaceGroup(-466616829);
                if (ComposerKt.M()) {
                    enumC6171k = enumC6171kK;
                    i13 = 0;
                    ComposerKt.U(-466616829, 0, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:727)");
                } else {
                    enumC6171k = enumC6171kK;
                    i13 = 0;
                }
                EnumC6171k enumC6171kK2 = k(k0Var, function1, tO, composerStartRestartGroup, i21);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
                composerStartRestartGroup.P();
                int i22 = i13;
                rVar2 = rVar4;
                k0 k0VarD = l0.d(k0Var, enumC6171k, enumC6171kK2, "EnterExitTransition", composerStartRestartGroup, i20 | 3072);
                z1 z1VarP = o1.p(function2, composerStartRestartGroup, (i16 >> 15) & 14);
                Boolean boolInvoke = function2.invoke(k0VarD.h(), k0VarD.o());
                boolean zV = composerStartRestartGroup.V(k0VarD) | composerStartRestartGroup.V(z1VarP);
                Object objB2 = composerStartRestartGroup.B();
                if (zV || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new c(k0VarD, z1VarP, null);
                    composerStartRestartGroup.t(objB2);
                }
                z1 z1VarM = o1.m(boolInvoke, (Function2) objB2, composerStartRestartGroup, i22);
                if (j(k0VarD) && c(z1VarM)) {
                    composerStartRestartGroup.startReplaceGroup(1790688794);
                    composerStartRestartGroup.P();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1789551931);
                    int i23 = i18 == 4 ? 1 : i22;
                    Object objB3 = composerStartRestartGroup.B();
                    if (i23 != 0 || objB3 == Composer.INSTANCE.a()) {
                        objB3 = new C6167f(k0VarD);
                        composerStartRestartGroup.t(objB3);
                    }
                    C6167f c6167f = (C6167f) objB3;
                    int i24 = i16 >> 6;
                    Modifier modifierG = androidx.compose.animation.f.g(k0VarD, hVar, jVar2, null, "Built-in", composerStartRestartGroup, (i24 & 112) | 24576 | (i24 & 896), 4);
                    if (rVar2 != null) {
                        composerStartRestartGroup.startReplaceGroup(1789971299);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        if ((3670016 & i16) != 1048576 && ((i16 & 2097152) == 0 || !composerStartRestartGroup.D(rVar2))) {
                            i17 = i22;
                        }
                        Object objB4 = composerStartRestartGroup.B();
                        if (i17 != 0 || objB4 == Composer.INSTANCE.a()) {
                            objB4 = new a(rVar2);
                            composerStartRestartGroup.t(objB4);
                        }
                        modifierA = D.a(companion, (Function3) objB4);
                        composerStartRestartGroup.P();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1581779440);
                        composerStartRestartGroup.P();
                        modifierA = Modifier.INSTANCE;
                    }
                    Modifier modifierThen = modifier.then(modifierG.then(modifierA));
                    Object objB5 = composerStartRestartGroup.B();
                    if (objB5 == Composer.INSTANCE.a()) {
                        objB5 = new C6164c(c6167f);
                        composerStartRestartGroup.t(objB5);
                    }
                    C6164c c6164c = (C6164c) objB5;
                    int iA = C5717f.a(composerStartRestartGroup, i22);
                    InterfaceC5742s interfaceC5742sR = composerStartRestartGroup.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, modifierThen);
                    InterfaceC5811g.Companion companion2 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion2.a();
                    if (composerStartRestartGroup.k() == null) {
                        C5717f.c();
                    }
                    composerStartRestartGroup.F();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.I(function0A);
                    } else {
                        composerStartRestartGroup.s();
                    }
                    Composer composerA = D1.a(composerStartRestartGroup);
                    D1.c(composerA, c6164c, companion2.e());
                    D1.c(composerA, interfaceC5742sR, companion2.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion2.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    D1.c(composerA, modifierE, companion2.f());
                    function3.invoke(c6167f, composerStartRestartGroup, Integer.valueOf((i16 >> 18) & 112));
                    composerStartRestartGroup.v();
                    composerStartRestartGroup.P();
                }
                composerStartRestartGroup.P();
            } else {
                composerStartRestartGroup.startReplaceGroup(1790694746);
                composerStartRestartGroup.P();
                rVar2 = rVar3;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
            rVar2 = rVar3;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new b(k0Var, function1, modifier, hVar, jVar, function2, rVar2, function3, i10, i11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(kotlin.C6307U<java.lang.Boolean> r23, androidx.compose.ui.Modifier r24, androidx.compose.animation.h r25, androidx.compose.animation.j r26, java.lang.String r27, kotlin.jvm.functions.Function3<? super kotlin.InterfaceC6166e, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C6165d.d(c0.U, androidx.compose.ui.Modifier, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(j0.InterfaceC14814f r23, boolean r24, androidx.compose.ui.Modifier r25, androidx.compose.animation.h r26, androidx.compose.animation.j r27, java.lang.String r28, kotlin.jvm.functions.Function3<? super kotlin.InterfaceC6166e, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C6165d.e(j0.f, boolean, androidx.compose.ui.Modifier, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(boolean r23, androidx.compose.ui.Modifier r24, androidx.compose.animation.h r25, androidx.compose.animation.j r26, java.lang.String r27, kotlin.jvm.functions.Function3<? super kotlin.InterfaceC6166e, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C6165d.f(boolean, androidx.compose.ui.Modifier, androidx.compose.animation.h, androidx.compose.animation.j, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final <T> void g(k0<T> k0Var, Function1<? super T, Boolean> function1, Modifier modifier, androidx.compose.animation.h hVar, androidx.compose.animation.j jVar, Function3<? super InterfaceC6166e, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        int i11;
        androidx.compose.animation.j jVar2;
        Composer composerStartRestartGroup = composer.startRestartGroup(429978603);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.V(k0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.D(function1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= composerStartRestartGroup.V(hVar) ? RecyclerView.m.FLAG_MOVED : 1024;
        }
        if ((i10 & 24576) == 0) {
            jVar2 = jVar;
            i11 |= composerStartRestartGroup.V(jVar2) ? 16384 : 8192;
        } else {
            jVar2 = jVar;
        }
        if ((i10 & 196608) == 0) {
            i11 |= composerStartRestartGroup.D(function3) ? 131072 : 65536;
        }
        if (composerStartRestartGroup.p((74899 & i11) != 74898, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(429978603, i11, -1, "androidx.compose.animation.AnimatedVisibilityImpl (AnimatedVisibility.kt:677)");
            }
            int i12 = i11 & 112;
            int i13 = i11 & 14;
            boolean z10 = (i12 == 32) | (i13 == 4);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new j(function1, k0Var);
                composerStartRestartGroup.t(objB);
            }
            a(k0Var, function1, D.a(modifier, (Function3) objB), hVar, jVar2, k.f59571f, null, function3, composerStartRestartGroup, i12 | i13 | 196608 | (i11 & 7168) | (57344 & i11) | ((i11 << 6) & 29360128), 64);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new l(k0Var, function1, modifier, hVar, jVar, function3, i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<EnumC6171k, EnumC6171k, Boolean> b(z1<? extends Function2<? super EnumC6171k, ? super EnumC6171k, Boolean>> z1Var) {
        return (Function2) z1Var.getValue();
    }

    private static final boolean c(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean j(k0<EnumC6171k> k0Var) {
        EnumC6171k enumC6171kH = k0Var.h();
        EnumC6171k enumC6171k = EnumC6171k.f59617c;
        if (enumC6171kH == enumC6171k && k0Var.o() == enumC6171k) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> EnumC6171k k(k0<T> k0Var, Function1<? super T, Boolean> function1, T t10, Composer composer, int i10) {
        EnumC6171k enumC6171k;
        if (ComposerKt.M()) {
            ComposerKt.U(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:836)");
        }
        composer.startMovableGroup(-902032957, k0Var);
        if (k0Var.t()) {
            composer.startReplaceGroup(2101770115);
            composer.P();
            if (function1.invoke(t10).booleanValue()) {
                enumC6171k = EnumC6171k.f59616b;
            } else if (function1.invoke(k0Var.h()).booleanValue()) {
                enumC6171k = EnumC6171k.f59617c;
            } else {
                enumC6171k = EnumC6171k.f59615a;
            }
        } else {
            composer.startReplaceGroup(2102044248);
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = t1.e(Boolean.FALSE, null, 2, null);
                composer.t(objB);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB;
            if (function1.invoke(k0Var.h()).booleanValue()) {
                interfaceC5730l0.setValue(Boolean.TRUE);
            }
            if (function1.invoke(t10).booleanValue()) {
                enumC6171k = EnumC6171k.f59616b;
            } else if (((Boolean) interfaceC5730l0.getValue()).booleanValue()) {
                enumC6171k = EnumC6171k.f59617c;
            } else {
                enumC6171k = EnumC6171k.f59615a;
            }
            composer.P();
        }
        composer.T();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return enumC6171k;
    }
}
