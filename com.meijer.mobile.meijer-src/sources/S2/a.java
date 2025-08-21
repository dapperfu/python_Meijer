package S2;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.view.AbstractC6165l;
import androidx.view.C6136J;
import androidx.view.InterfaceC6172s;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;
import pv.P;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Lpv/P;", "Landroidx/lifecycle/s;", "lifecycleOwner", "Landroidx/lifecycle/l$b;", "minActiveState", "Lkotlin/coroutines/CoroutineContext;", "context", "Landroidx/compose/runtime/z1;", "c", "(Lpv/P;Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "Lpv/f;", "initialValue", "b", "(Lpv/f;Ljava/lang/Object;Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "Landroidx/lifecycle/l;", "lifecycle", "a", "(Lpv/f;Ljava/lang/Object;Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/D0;", "", "<anonymous>", "(Landroidx/compose/runtime/D0;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend")
    /* renamed from: S2.a$a, reason: collision with other inner class name */
    static final class C0761a<T> extends SuspendLambda implements Function2<D0<T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34315a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f34316b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6165l f34317c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6165l.b f34318d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f34319e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC16561f<T> f34320f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend")
        /* renamed from: S2.a$a$a, reason: collision with other inner class name */
        static final class C0762a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f34321a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f34322b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f<T> f34323c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ D0<T> f34324d;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: S2.a$a$a$a, reason: collision with other inner class name */
            static final class C0763a<T> implements InterfaceC16562g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ D0<T> f34325a;

                C0763a(D0<T> d02) {
                    this.f34325a = d02;
                }

                @Override // pv.InterfaceC16562g
                public final Object emit(T t10, Continuation<? super Unit> continuation) {
                    this.f34325a.setValue(t10);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend")
            /* renamed from: S2.a$a$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f34326a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC16561f<T> f34327b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ D0<T> f34328c;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: S2.a$a$a$b$a, reason: collision with other inner class name */
                static final class C0764a<T> implements InterfaceC16562g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ D0<T> f34329a;

                    C0764a(D0<T> d02) {
                        this.f34329a = d02;
                    }

                    @Override // pv.InterfaceC16562g
                    public final Object emit(T t10, Continuation<? super Unit> continuation) {
                        this.f34329a.setValue(t10);
                        return Unit.f143329a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC16561f<? extends T> interfaceC16561f, D0<T> d02, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f34327b = interfaceC16561f;
                    this.f34328c = d02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f34327b, this.f34328c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f34326a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16561f<T> interfaceC16561f = this.f34327b;
                        C0764a c0764a = new C0764a(this.f34328c);
                        this.f34326a = 1;
                        if (interfaceC16561f.collect(c0764a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0762a(CoroutineContext coroutineContext, InterfaceC16561f<? extends T> interfaceC16561f, D0<T> d02, Continuation<? super C0762a> continuation) {
                super(2, continuation);
                this.f34322b = coroutineContext;
                this.f34323c = interfaceC16561f;
                this.f34324d = d02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0762a(this.f34322b, this.f34323c, this.f34324d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C0762a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r7.collect(r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                if (mv.C15805i.g(r7, r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r6.f34321a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L17:
                    kotlin.ResultKt.b(r7)
                    goto L4f
                L1b:
                    kotlin.ResultKt.b(r7)
                    kotlin.coroutines.CoroutineContext r7 = r6.f34322b
                    kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f143553a
                    boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r1)
                    if (r7 == 0) goto L3a
                    pv.f<T> r7 = r6.f34323c
                    S2.a$a$a$a r1 = new S2.a$a$a$a
                    androidx.compose.runtime.D0<T> r2 = r6.f34324d
                    r1.<init>(r2)
                    r6.f34321a = r3
                    java.lang.Object r7 = r7.collect(r1, r6)
                    if (r7 != r0) goto L4f
                    goto L4e
                L3a:
                    kotlin.coroutines.CoroutineContext r7 = r6.f34322b
                    S2.a$a$a$b r1 = new S2.a$a$a$b
                    pv.f<T> r3 = r6.f34323c
                    androidx.compose.runtime.D0<T> r4 = r6.f34324d
                    r5 = 0
                    r1.<init>(r3, r4, r5)
                    r6.f34321a = r2
                    java.lang.Object r7 = mv.C15805i.g(r7, r1, r6)
                    if (r7 != r0) goto L4f
                L4e:
                    return r0
                L4f:
                    kotlin.Unit r7 = kotlin.Unit.f143329a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: S2.a.C0761a.C0762a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0761a(AbstractC6165l abstractC6165l, AbstractC6165l.b bVar, CoroutineContext coroutineContext, InterfaceC16561f<? extends T> interfaceC16561f, Continuation<? super C0761a> continuation) {
            super(2, continuation);
            this.f34317c = abstractC6165l;
            this.f34318d = bVar;
            this.f34319e = coroutineContext;
            this.f34320f = interfaceC16561f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0761a c0761a = new C0761a(this.f34317c, this.f34318d, this.f34319e, this.f34320f, continuation);
            c0761a.f34316b = obj;
            return c0761a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D0<T> d02, Continuation<? super Unit> continuation) {
            return ((C0761a) create(d02, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34315a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                D0 d02 = (D0) this.f34316b;
                AbstractC6165l abstractC6165l = this.f34317c;
                AbstractC6165l.b bVar = this.f34318d;
                C0762a c0762a = new C0762a(this.f34319e, this.f34320f, d02, null);
                this.f34315a = 1;
                if (C6136J.a(abstractC6165l, bVar, c0762a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public static final <T> z1<T> a(InterfaceC16561f<? extends T> interfaceC16561f, T t10, AbstractC6165l abstractC6165l, AbstractC6165l.b bVar, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            bVar = AbstractC6165l.b.f55502d;
        }
        AbstractC6165l.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.M()) {
            ComposerKt.U(1977777920, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {interfaceC16561f, abstractC6165l, bVar2, coroutineContext2};
        boolean zD = composer.D(abstractC6165l) | ((((i10 & 7168) ^ 3072) > 2048 && composer.d(bVar2.ordinal())) || (i10 & 3072) == 2048) | composer.D(coroutineContext2) | composer.D(interfaceC16561f);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            C0761a c0761a = new C0761a(abstractC6165l, bVar2, coroutineContext2, interfaceC16561f, null);
            composer.t(c0761a);
            objB = c0761a;
        }
        z1<T> z1VarN = o1.n(t10, objArr, (Function2) objB, composer, (i10 >> 3) & 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarN;
    }

    public static final <T> z1<T> b(InterfaceC16561f<? extends T> interfaceC16561f, T t10, InterfaceC6172s interfaceC6172s, AbstractC6165l.b bVar, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6172s = (InterfaceC6172s) composer.o(c.c());
        }
        if ((i11 & 4) != 0) {
            bVar = AbstractC6165l.b.f55502d;
        }
        AbstractC6165l.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.M()) {
            ComposerKt.U(-1485997211, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        z1<T> z1VarA = a(interfaceC16561f, t10, interfaceC6172s.getLifecycle(), bVar2, coroutineContext2, composer, (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & 112) | (i10 & 7168) | (57344 & i10), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarA;
    }

    public static final <T> z1<T> c(P<? extends T> p10, InterfaceC6172s interfaceC6172s, AbstractC6165l.b bVar, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC6172s = (InterfaceC6172s) composer.o(c.c());
        }
        if ((i11 & 2) != 0) {
            bVar = AbstractC6165l.b.f55502d;
        }
        AbstractC6165l.b bVar2 = bVar;
        if ((i11 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.f143553a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.M()) {
            ComposerKt.U(743249048, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i12 = i10 << 3;
        z1<T> z1VarA = a(p10, p10.getValue(), interfaceC6172s.getLifecycle(), bVar2, coroutineContext2, composer, (i10 & 14) | (i12 & 7168) | (i12 & 57344), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarA;
    }
}
