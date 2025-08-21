package kotlin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.C6034t0;
import androidx.compose.ui.platform.L0;
import androidx.compose.ui.platform.N0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C13928q;
import kotlin.Deprecated;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13929r;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010 \n\u0002\b\t\u001a\\\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032#\b\u0002\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a¶\u0001\u0010\"\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0001*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u001728\b\u0002\u0010\u001d\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001a\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u001c0\u00192\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010!\u001a\u00020 H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a+\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010$\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040%H\u0002¢\u0006\u0004\b'\u0010(\u001aW\u0010+\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040%2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010*\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010,\u001a/\u0010-\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"", "T", "initialValue", "Lc0/i;", "", "animationSpec", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "newValue", "", "confirmStateChange", "Lx0/w1;", "f", "(Ljava/lang/Object;Lc0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lx0/w1;", "Landroidx/compose/ui/Modifier;", "state", "", "anchors", "Lf0/z;", "orientation", "enabled", "reverseDirection", "Lh0/l;", "interactionSource", "Lkotlin/Function2;", "from", "to", "Lx0/O1;", "thresholds", "Lx0/V0;", "resistance", "LH1/h;", "velocityThreshold", "g", "(Landroidx/compose/ui/Modifier;Lx0/w1;Ljava/util/Map;Lf0/z;ZZLh0/l;Lkotlin/jvm/functions/Function2;Lx0/V0;F)Landroidx/compose/ui/Modifier;", "offset", "", "", "d", "(FLjava/util/Set;)Ljava/util/List;", "lastValue", "velocity", "c", "(FFLjava/util/Set;Lkotlin/jvm/functions/Function2;FF)F", "e", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Float;", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class v1 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a<T> extends Lambda implements Function1<T, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f169829f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(T t10) {
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "T", "Lx0/w1;", "c", "()Lx0/w1;"}, k = 3, mv = {1, 9, 0})
    static final class b<T> extends Lambda implements Function0<w1<T>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f169830f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f169831g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function1<T, Boolean> f169832h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(T t10, InterfaceC6452i<Float> interfaceC6452i, Function1<? super T, Boolean> function1) {
            super(0);
            this.f169830f = t10;
            this.f169831g = interfaceC6452i;
            this.f169832h = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final w1<T> invoke() {
            return new w1<>(this.f169830f, this.f169831g, this.f169832h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "<anonymous parameter 0>", "<anonymous parameter 1>", "Lx0/s0;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Lx0/s0;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class c extends Lambda implements Function2 {

        /* renamed from: f, reason: collision with root package name */
        public static final c f169833f = new c();

        c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FixedThreshold invoke(Object obj, Object obj2) {
            return new FixedThreshold(H1.h.p(56), null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class d extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Map<Float, T> f169834f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ w1<T> f169835g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ ResistanceConfig f169836h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<T, T, O1> f169837i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f169838j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ EnumC13937z f169839k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f169840l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ h0.l f169841m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f169842n;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$3$1", f = "Swipeable.kt", l = {602}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f169843a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ w1<T> f169844b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map<Float, T> f169845c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ResistanceConfig f169846d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ H1.d f169847e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function2<T, T, O1> f169848f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f169849g;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0004"}, d2 = {"T", "", "a", "b", "(FF)Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
            @SourceDebugExtension
            /* renamed from: x0.v1$d$a$a, reason: collision with other inner class name */
            static final class C2721a extends Lambda implements Function2<Float, Float, Float> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Map<Float, T> f169850f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2<T, T, O1> f169851g;

                /* renamed from: h, reason: collision with root package name */
                final /* synthetic */ H1.d f169852h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2721a(Map<Float, ? extends T> map, Function2<? super T, ? super T, ? extends O1> function2, H1.d dVar) {
                    super(2);
                    this.f169850f = map;
                    this.f169851g = function2;
                    this.f169852h = dVar;
                }

                public final Float a(float f10, float f11) {
                    return Float.valueOf(this.f169851g.invoke(MapsKt.l(this.f169850f, Float.valueOf(f10)), MapsKt.l(this.f169850f, Float.valueOf(f11))).a(this.f169852h, f10, f11));
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Float invoke(Float f10, Float f11) {
                    return a(f10.floatValue(), f11.floatValue());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(w1<T> w1Var, Map<Float, ? extends T> map, ResistanceConfig resistanceConfig, H1.d dVar, Function2<? super T, ? super T, ? extends O1> function2, float f10, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f169844b = w1Var;
                this.f169845c = map;
                this.f169846d = resistanceConfig;
                this.f169847e = dVar;
                this.f169848f = function2;
                this.f169849g = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f169844b, this.f169845c, this.f169846d, this.f169847e, this.f169848f, this.f169849g, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f169843a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    Map mapL = this.f169844b.l();
                    this.f169844b.z(this.f169845c);
                    this.f169844b.C(this.f169846d);
                    this.f169844b.D(new C2721a(this.f169845c, this.f169848f, this.f169847e));
                    this.f169844b.E(this.f169847e.I1(this.f169849g));
                    w1<T> w1Var = this.f169844b;
                    Object obj2 = this.f169845c;
                    this.f169843a = 1;
                    if (w1Var.y(mapL, obj2, this) == objF) {
                        return objF;
                    }
                }
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lmv/O;", "", "velocity", "", "<anonymous>", "(Lmv/O;F)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1", f = "Swipeable.kt", l = {}, m = "invokeSuspend")
        static final class b extends SuspendLambda implements Function3<InterfaceC15783O, Float, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f169853a;

            /* renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f169854b;

            /* renamed from: c, reason: collision with root package name */
            /* synthetic */ float f169855c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ w1<T> f169856d;

            @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.material.SwipeableKt$swipeable$3$4$1$1", f = "Swipeable.kt", l = {611}, m = "invokeSuspend")
            static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f169857a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ w1<T> f169858b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ float f169859c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(w1<T> w1Var, float f10, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.f169858b = w1Var;
                    this.f169859c = f10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new a(this.f169858b, this.f169859c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f169857a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        w1<T> w1Var = this.f169858b;
                        float f10 = this.f169859c;
                        this.f169857a = 1;
                        if (w1Var.x(f10, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(w1<T> w1Var, Continuation<? super b> continuation) {
                super(3, continuation);
                this.f169856d = w1Var;
            }

            public final Object d(InterfaceC15783O interfaceC15783O, float f10, Continuation<? super Unit> continuation) {
                b bVar = new b(this.f169856d, continuation);
                bVar.f169854b = interfaceC15783O;
                bVar.f169855c = f10;
                return bVar.invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Float f10, Continuation<? super Unit> continuation) {
                return d(interfaceC15783O, f10.floatValue(), continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f169853a == 0) {
                    ResultKt.b(obj);
                    C15809k.d((InterfaceC15783O) this.f169854b, null, null, new a(this.f169856d, this.f169855c, null), 3, null);
                    return Unit.f143329a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Map<Float, ? extends T> map, w1<T> w1Var, ResistanceConfig resistanceConfig, Function2<? super T, ? super T, ? extends O1> function2, float f10, EnumC13937z enumC13937z, boolean z10, h0.l lVar, boolean z11) {
            super(3);
            this.f169834f = map;
            this.f169835g = w1Var;
            this.f169836h = resistanceConfig;
            this.f169837i = function2;
            this.f169838j = f10;
            this.f169839k = enumC13937z;
            this.f169840l = z10;
            this.f169841m = lVar;
            this.f169842n = z11;
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(43594985);
            if (ComposerKt.M()) {
                ComposerKt.U(43594985, i10, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:585)");
            }
            if (this.f169834f.isEmpty()) {
                throw new IllegalArgumentException("You must have at least one anchor.");
            }
            if (CollectionsKt.i0(this.f169834f.values()).size() != this.f169834f.size()) {
                throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
            }
            H1.d dVar = (H1.d) composer.o(C6034t0.g());
            this.f169835g.k(this.f169834f);
            Object obj = this.f169834f;
            Object obj2 = this.f169835g;
            boolean zV = composer.V(obj2) | composer.D(this.f169834f) | composer.V(this.f169836h) | composer.V(this.f169837i) | composer.V(dVar) | composer.b(this.f169838j);
            w1<T> w1Var = this.f169835g;
            Map<Float, T> map = this.f169834f;
            ResistanceConfig resistanceConfig = this.f169836h;
            Function2<T, T, O1> function2 = this.f169837i;
            float f10 = this.f169838j;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                Object aVar = new a(w1Var, map, resistanceConfig, dVar, function2, f10, null);
                composer.t(aVar);
                objB = aVar;
            }
            J.f(obj, obj2, (Function2) objB, composer, 0);
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zW = this.f169835g.w();
            InterfaceC13929r interfaceC13929rP = this.f169835g.p();
            EnumC13937z enumC13937z = this.f169839k;
            boolean z10 = this.f169840l;
            h0.l lVar = this.f169841m;
            boolean zV2 = composer.V(this.f169835g);
            w1<T> w1Var2 = this.f169835g;
            Object objB2 = composer.B();
            if (zV2 || objB2 == Composer.INSTANCE.a()) {
                objB2 = new b(w1Var2, null);
                composer.t(objB2);
            }
            Modifier modifierH = C13928q.h(companion, interfaceC13929rP, enumC13937z, z10, lVar, zW, null, (Function3) objB2, this.f169842n, 32, null);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierH;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/N0;", "", "a", "(Landroidx/compose/ui/platform/N0;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    public static final class e extends Lambda implements Function1<N0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ w1 f169860f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f169861g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ EnumC13937z f169862h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f169863i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f169864j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ h0.l f169865k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2 f169866l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ ResistanceConfig f169867m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ float f169868n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w1 w1Var, Map map, EnumC13937z enumC13937z, boolean z10, boolean z11, h0.l lVar, Function2 function2, ResistanceConfig resistanceConfig, float f10) {
            super(1);
            this.f169860f = w1Var;
            this.f169861g = map;
            this.f169862h = enumC13937z;
            this.f169863i = z10;
            this.f169864j = z11;
            this.f169865k = lVar;
            this.f169866l = function2;
            this.f169867m = resistanceConfig;
            this.f169868n = f10;
        }

        public final void a(N0 n02) {
            n02.b("swipeable");
            n02.getProperties().c("state", this.f169860f);
            n02.getProperties().c("anchors", this.f169861g);
            n02.getProperties().c("orientation", this.f169862h);
            n02.getProperties().c("enabled", Boolean.valueOf(this.f169863i));
            n02.getProperties().c("reverseDirection", Boolean.valueOf(this.f169864j));
            n02.getProperties().c("interactionSource", this.f169865k);
            n02.getProperties().c("thresholds", this.f169866l);
            n02.getProperties().c("resistance", this.f169867m);
            n02.getProperties().c("velocityThreshold", H1.h.l(this.f169868n));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(N0 n02) {
            a(n02);
            return Unit.f143329a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    private static final List<Float> d(float f10, Set<Float> set) {
        Object obj;
        Set<Float> set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= f10 + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Float f11 = null;
        int i10 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float fFloatValue = ((Number) obj).floatValue();
            int iO = CollectionsKt.o(arrayList);
            if (1 <= iO) {
                int i11 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i11);
                    float fFloatValue2 = ((Number) obj3).floatValue();
                    if (Float.compare(fFloatValue, fFloatValue2) < 0) {
                        obj = obj3;
                        fFloatValue = fFloatValue2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        Float f12 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : set2) {
            if (((Number) obj4).floatValue() >= f10 - 0.001d) {
                arrayList2.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            ?? r13 = arrayList2.get(0);
            float fFloatValue3 = ((Number) r13).floatValue();
            int iO2 = CollectionsKt.o(arrayList2);
            boolean z10 = r13;
            if (1 <= iO2) {
                while (true) {
                    Object obj5 = arrayList2.get(i10);
                    float fFloatValue4 = ((Number) obj5).floatValue();
                    r13 = z10;
                    if (Float.compare(fFloatValue3, fFloatValue4) > 0) {
                        r13 = obj5;
                        fFloatValue3 = fFloatValue4;
                    }
                    if (i10 == iO2) {
                        break;
                    }
                    i10++;
                    z10 = r13;
                }
            }
            f11 = r13;
        }
        Float f13 = f11;
        return f12 == null ? CollectionsKt.q(f13) : f13 == null ? CollectionsKt.e(f12) : Intrinsics.d(f12, f13) ? CollectionsKt.e(f12) : CollectionsKt.p(f12, f13);
    }

    @Deprecated
    public static final <T> w1<T> f(T t10, InterfaceC6452i<Float> interfaceC6452i, Function1<? super T, Boolean> function1, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6452i = u1.f169798a.a();
        }
        if ((i11 & 4) != 0) {
            function1 = a.f169829f;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(-1237755169, i10, -1, "androidx.compose.material.rememberSwipeableState (Swipeable.kt:466)");
        }
        Object[] objArr = new Object[0];
        L0.k<w1<T>, T> kVarA = w1.f169888q.a(interfaceC6452i, function1);
        boolean zD = ((((i10 & 14) ^ 6) > 4 && composer.D(t10)) || (i10 & 6) == 4) | composer.D(interfaceC6452i) | ((((i10 & 896) ^ 384) > 256 && composer.V(function1)) || (i10 & 384) == 256);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            objB = new b(t10, interfaceC6452i, function1);
            composer.t(objB);
        }
        w1<T> w1Var = (w1) L0.c.c(objArr, kVarA, null, (Function0) objB, composer, 0, 4);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return w1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(float f10, float f11, Set<Float> set, Function2<? super Float, ? super Float, Float> function2, float f12, float f13) {
        List<Float> listD = d(f10, set);
        int size = listD.size();
        if (size != 0) {
            if (size != 1) {
                float fFloatValue = listD.get(0).floatValue();
                float fFloatValue2 = listD.get(1).floatValue();
                if (f11 > f10 ? f12 > (-f13) && f10 > function2.invoke(Float.valueOf(fFloatValue2), Float.valueOf(fFloatValue)).floatValue() : f12 >= f13 || f10 >= function2.invoke(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue()) {
                    return fFloatValue2;
                }
                return fFloatValue;
            }
            return listD.get(0).floatValue();
        }
        return f11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Float e(Map<Float, ? extends T> map, T t10) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.e(((Map.Entry) next).getValue(), t10)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (Float) entry.getKey();
    }

    @Deprecated
    public static final <T> Modifier g(Modifier modifier, w1<T> w1Var, Map<Float, ? extends T> map, EnumC13937z enumC13937z, boolean z10, boolean z11, h0.l lVar, Function2<? super T, ? super T, ? extends O1> function2, ResistanceConfig resistanceConfig, float f10) {
        Function1 function1A;
        if (L0.b()) {
            function1A = new e(w1Var, map, enumC13937z, z10, z11, lVar, function2, resistanceConfig, f10);
        } else {
            function1A = L0.a();
        }
        return androidx.compose.ui.b.b(modifier, function1A, new d(map, w1Var, resistanceConfig, function2, f10, enumC13937z, z10, lVar, z11));
    }
}
