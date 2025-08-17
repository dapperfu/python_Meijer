package S2;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.view.AbstractC6023l;
import androidx.view.C5994J;
import androidx.view.InterfaceC6030s;
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
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.P;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001aK\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001aI\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"T", "Ltv/P;", "Landroidx/lifecycle/s;", "lifecycleOwner", "Landroidx/lifecycle/l$b;", "minActiveState", "Lkotlin/coroutines/CoroutineContext;", "context", "Landroidx/compose/runtime/z1;", "c", "(Ltv/P;Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "Ltv/f;", "initialValue", "b", "(Ltv/f;Ljava/lang/Object;Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "Landroidx/lifecycle/l;", "lifecycle", "a", "(Ltv/f;Ljava/lang/Object;Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/z1;", "lifecycle-runtime-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/compose/runtime/D0;", "", "<anonymous>", "(Landroidx/compose/runtime/D0;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {177}, m = "invokeSuspend")
    /* renamed from: S2.a$a, reason: collision with other inner class name */
    static final class C0741a<T> extends SuspendLambda implements Function2<D0<T>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f33136a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f33137b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6023l f33138c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6023l.b f33139d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f33140e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T> f33141f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1", f = "FlowExt.kt", l = {179, 181}, m = "invokeSuspend")
        /* renamed from: S2.a$a$a, reason: collision with other inner class name */
        static final class C0742a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f33142a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f33143b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f<T> f33144c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ D0<T> f33145d;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: S2.a$a$a$a, reason: collision with other inner class name */
            static final class C0743a<T> implements InterfaceC17153g {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ D0<T> f33146a;

                C0743a(D0<T> d02) {
                    this.f33146a = d02;
                }

                @Override // tv.InterfaceC17153g
                public final Object emit(T t10, Continuation<? super Unit> continuation) {
                    this.f33146a.setValue(t10);
                    return Unit.f142422a;
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 0, 0})
            @DebugMetadata(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1$2", f = "FlowExt.kt", l = {182}, m = "invokeSuspend")
            /* renamed from: S2.a$a$a$b */
            static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f33147a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC17152f<T> f33148b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ D0<T> f33149c;

                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                /* renamed from: S2.a$a$a$b$a, reason: collision with other inner class name */
                static final class C0744a<T> implements InterfaceC17153g {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ D0<T> f33150a;

                    C0744a(D0<T> d02) {
                        this.f33150a = d02;
                    }

                    @Override // tv.InterfaceC17153g
                    public final Object emit(T t10, Continuation<? super Unit> continuation) {
                        this.f33150a.setValue(t10);
                        return Unit.f142422a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                b(InterfaceC17152f<? extends T> interfaceC17152f, D0<T> d02, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f33148b = interfaceC17152f;
                    this.f33149c = d02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new b(this.f33148b, this.f33149c, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f33147a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC17152f<T> interfaceC17152f = this.f33148b;
                        C0744a c0744a = new C0744a(this.f33149c);
                        this.f33147a = 1;
                        if (interfaceC17152f.collect(c0744a, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0742a(CoroutineContext coroutineContext, InterfaceC17152f<? extends T> interfaceC17152f, D0<T> d02, Continuation<? super C0742a> continuation) {
                super(2, continuation);
                this.f33143b = coroutineContext;
                this.f33144c = interfaceC17152f;
                this.f33145d = d02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0742a(this.f33143b, this.f33144c, this.f33145d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C0742a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r7.collect(r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                if (qv.C16644i.g(r7, r1, r6) == r0) goto L17;
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
                    int r1 = r6.f33142a
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
                    kotlin.coroutines.CoroutineContext r7 = r6.f33143b
                    kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.f142646a
                    boolean r7 = kotlin.jvm.internal.Intrinsics.e(r7, r1)
                    if (r7 == 0) goto L3a
                    tv.f<T> r7 = r6.f33144c
                    S2.a$a$a$a r1 = new S2.a$a$a$a
                    androidx.compose.runtime.D0<T> r2 = r6.f33145d
                    r1.<init>(r2)
                    r6.f33142a = r3
                    java.lang.Object r7 = r7.collect(r1, r6)
                    if (r7 != r0) goto L4f
                    goto L4e
                L3a:
                    kotlin.coroutines.CoroutineContext r7 = r6.f33143b
                    S2.a$a$a$b r1 = new S2.a$a$a$b
                    tv.f<T> r3 = r6.f33144c
                    androidx.compose.runtime.D0<T> r4 = r6.f33145d
                    r5 = 0
                    r1.<init>(r3, r4, r5)
                    r6.f33142a = r2
                    java.lang.Object r7 = qv.C16644i.g(r7, r1, r6)
                    if (r7 != r0) goto L4f
                L4e:
                    return r0
                L4f:
                    kotlin.Unit r7 = kotlin.Unit.f142422a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: S2.a.C0741a.C0742a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0741a(AbstractC6023l abstractC6023l, AbstractC6023l.b bVar, CoroutineContext coroutineContext, InterfaceC17152f<? extends T> interfaceC17152f, Continuation<? super C0741a> continuation) {
            super(2, continuation);
            this.f33138c = abstractC6023l;
            this.f33139d = bVar;
            this.f33140e = coroutineContext;
            this.f33141f = interfaceC17152f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0741a c0741a = new C0741a(this.f33138c, this.f33139d, this.f33140e, this.f33141f, continuation);
            c0741a.f33137b = obj;
            return c0741a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(D0<T> d02, Continuation<? super Unit> continuation) {
            return ((C0741a) create(d02, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f33136a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                D0 d02 = (D0) this.f33137b;
                AbstractC6023l abstractC6023l = this.f33138c;
                AbstractC6023l.b bVar = this.f33139d;
                C0742a c0742a = new C0742a(this.f33140e, this.f33141f, d02, null);
                this.f33136a = 1;
                if (C5994J.a(abstractC6023l, bVar, c0742a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public static final <T> z1<T> a(InterfaceC17152f<? extends T> interfaceC17152f, T t10, AbstractC6023l abstractC6023l, AbstractC6023l.b bVar, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        if ((i11 & 4) != 0) {
            bVar = AbstractC6023l.b.f55278d;
        }
        AbstractC6023l.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.M()) {
            ComposerKt.U(1977777920, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:174)");
        }
        Object[] objArr = {interfaceC17152f, abstractC6023l, bVar2, coroutineContext2};
        boolean zD = composer.D(abstractC6023l) | ((((i10 & 7168) ^ 3072) > 2048 && composer.d(bVar2.ordinal())) || (i10 & 3072) == 2048) | composer.D(coroutineContext2) | composer.D(interfaceC17152f);
        Object objB = composer.B();
        if (zD || objB == Composer.INSTANCE.a()) {
            C0741a c0741a = new C0741a(abstractC6023l, bVar2, coroutineContext2, interfaceC17152f, null);
            composer.t(c0741a);
            objB = c0741a;
        }
        z1<T> z1VarN = o1.n(t10, objArr, (Function2) objB, composer, (i10 >> 3) & 14);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarN;
    }

    public static final <T> z1<T> b(InterfaceC17152f<? extends T> interfaceC17152f, T t10, InterfaceC6030s interfaceC6030s, AbstractC6023l.b bVar, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        if ((i11 & 2) != 0) {
            interfaceC6030s = (InterfaceC6030s) composer.o(c.c());
        }
        if ((i11 & 4) != 0) {
            bVar = AbstractC6023l.b.f55278d;
        }
        AbstractC6023l.b bVar2 = bVar;
        if ((i11 & 8) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.M()) {
            ComposerKt.U(-1485997211, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:138)");
        }
        z1<T> z1VarA = a(interfaceC17152f, t10, interfaceC6030s.getLifecycle(), bVar2, coroutineContext2, composer, (i10 & 14) | (((i10 >> 3) & 8) << 3) | (i10 & 112) | (i10 & 7168) | (57344 & i10), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarA;
    }

    public static final <T> z1<T> c(P<? extends T> p10, InterfaceC6030s interfaceC6030s, AbstractC6023l.b bVar, CoroutineContext coroutineContext, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            interfaceC6030s = (InterfaceC6030s) composer.o(c.c());
        }
        if ((i11 & 2) != 0) {
            bVar = AbstractC6023l.b.f55278d;
        }
        AbstractC6023l.b bVar2 = bVar;
        if ((i11 & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.M()) {
            ComposerKt.U(743249048, i10, -1, "androidx.lifecycle.compose.collectAsStateWithLifecycle (FlowExt.kt:62)");
        }
        int i12 = i10 << 3;
        z1<T> z1VarA = a(p10, p10.getValue(), interfaceC6030s.getLifecycle(), bVar2, coroutineContext2, composer, (i10 & 14) | (i12 & 7168) | (i12 & 57344), 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return z1VarA;
    }
}
