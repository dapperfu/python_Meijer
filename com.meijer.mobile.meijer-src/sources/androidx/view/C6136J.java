package androidx.view;

import androidx.view.AbstractC6165l;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15784P;
import mv.C15800f0;
import mv.C15805i;
import mv.C15809k;
import mv.InterfaceC15783O;
import mv.InterfaceC15815n;
import mv.L0;
import wv.InterfaceC17929a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\n\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\n\u0010\u000b\u001aE\u0010\r\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u0002\u001a\u00020\u00012'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\u0002\b\bH\u0086@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/l;", "Landroidx/lifecycle/l$b;", "state", "Lkotlin/Function2;", "Lmv/O;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "a", "(Landroidx/lifecycle/l;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/s;", "b", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: androidx.lifecycle.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6136J {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {83}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.J$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f55390a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f55391b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC6165l f55392c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ AbstractC6165l.b f55393d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super Unit>, Object> f55394e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
        @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {161}, m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: androidx.lifecycle.J$a$a, reason: collision with other inner class name */
        static final class C1126a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f55395a;

            /* renamed from: b, reason: collision with root package name */
            Object f55396b;

            /* renamed from: c, reason: collision with root package name */
            Object f55397c;

            /* renamed from: d, reason: collision with root package name */
            Object f55398d;

            /* renamed from: e, reason: collision with root package name */
            Object f55399e;

            /* renamed from: f, reason: collision with root package name */
            Object f55400f;

            /* renamed from: g, reason: collision with root package name */
            int f55401g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ AbstractC6165l f55402h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ AbstractC6165l.b f55403i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f55404j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super Unit>, Object> f55405k;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            /* renamed from: androidx.lifecycle.J$a$a$a, reason: collision with other inner class name */
            static final class C1127a implements InterfaceC6169p {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ AbstractC6165l.a f55406a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Ref.ObjectRef<C0> f55407b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f55408c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbstractC6165l.a f55409d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC15815n<Unit> f55410e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ InterfaceC17929a f55411f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super Unit>, Object> f55412g;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
                @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: androidx.lifecycle.J$a$a$a$a, reason: collision with other inner class name */
                static final class C1128a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    Object f55413a;

                    /* renamed from: b, reason: collision with root package name */
                    Object f55414b;

                    /* renamed from: c, reason: collision with root package name */
                    int f55415c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ InterfaceC17929a f55416d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super Unit>, Object> f55417e;

                    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 0, 0})
                    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {110}, m = "invokeSuspend")
                    /* renamed from: androidx.lifecycle.J$a$a$a$a$a, reason: collision with other inner class name */
                    static final class C1129a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                        /* renamed from: a, reason: collision with root package name */
                        int f55418a;

                        /* renamed from: b, reason: collision with root package name */
                        private /* synthetic */ Object f55419b;

                        /* renamed from: c, reason: collision with root package name */
                        final /* synthetic */ Function2<InterfaceC15783O, Continuation<? super Unit>, Object> f55420c;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        C1129a(Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C1129a> continuation) {
                            super(2, continuation);
                            this.f55420c = function2;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            C1129a c1129a = new C1129a(this.f55420c, continuation);
                            c1129a.f55419b = obj;
                            return c1129a;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                            return ((C1129a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object objF = IntrinsicsKt.f();
                            int i10 = this.f55418a;
                            if (i10 != 0) {
                                if (i10 == 1) {
                                    ResultKt.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                ResultKt.b(obj);
                                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f55419b;
                                Function2<InterfaceC15783O, Continuation<? super Unit>, Object> function2 = this.f55420c;
                                this.f55418a = 1;
                                if (function2.invoke(interfaceC15783O, this) == objF) {
                                    return objF;
                                }
                            }
                            return Unit.f143329a;
                        }
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1128a(this.f55416d, this.f55417e, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    C1128a(InterfaceC17929a interfaceC17929a, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C1128a> continuation) {
                        super(2, continuation);
                        this.f55416d = interfaceC17929a;
                        this.f55417e = function2;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1128a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) throws Throwable {
                        InterfaceC17929a interfaceC17929a;
                        Function2<InterfaceC15783O, Continuation<? super Unit>, Object> function2;
                        InterfaceC17929a interfaceC17929a2;
                        Throwable th2;
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f55415c;
                        try {
                            if (i10 != 0) {
                                if (i10 != 1) {
                                    if (i10 == 2) {
                                        interfaceC17929a2 = (InterfaceC17929a) this.f55413a;
                                        try {
                                            ResultKt.b(obj);
                                            Unit unit = Unit.f143329a;
                                            interfaceC17929a2.h(null);
                                            return Unit.f143329a;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            interfaceC17929a2.h(null);
                                            throw th2;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                function2 = (Function2) this.f55414b;
                                InterfaceC17929a interfaceC17929a3 = (InterfaceC17929a) this.f55413a;
                                ResultKt.b(obj);
                                interfaceC17929a = interfaceC17929a3;
                            } else {
                                ResultKt.b(obj);
                                interfaceC17929a = this.f55416d;
                                function2 = this.f55417e;
                                this.f55413a = interfaceC17929a;
                                this.f55414b = function2;
                                this.f55415c = 1;
                                if (interfaceC17929a.g(null, this) != objF) {
                                }
                                return objF;
                            }
                            C1129a c1129a = new C1129a(function2, null);
                            this.f55413a = interfaceC17929a;
                            this.f55414b = null;
                            this.f55415c = 2;
                            if (C15784P.g(c1129a, this) != objF) {
                                interfaceC17929a2 = interfaceC17929a;
                                Unit unit2 = Unit.f143329a;
                                interfaceC17929a2.h(null);
                                return Unit.f143329a;
                            }
                            return objF;
                        } catch (Throwable th4) {
                            interfaceC17929a2 = interfaceC17929a;
                            th2 = th4;
                            interfaceC17929a2.h(null);
                            throw th2;
                        }
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                C1127a(AbstractC6165l.a aVar, Ref.ObjectRef<C0> objectRef, InterfaceC15783O interfaceC15783O, AbstractC6165l.a aVar2, InterfaceC15815n<? super Unit> interfaceC15815n, InterfaceC17929a interfaceC17929a, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2) {
                    this.f55406a = aVar;
                    this.f55407b = objectRef;
                    this.f55408c = interfaceC15783O;
                    this.f55409d = aVar2;
                    this.f55410e = interfaceC15815n;
                    this.f55411f = interfaceC17929a;
                    this.f55412g = function2;
                }

                /* JADX WARN: Type inference failed for: r9v5, types: [T, mv.C0] */
                @Override // androidx.view.InterfaceC6169p
                public final void onStateChanged(InterfaceC6172s interfaceC6172s, AbstractC6165l.a event) {
                    Intrinsics.j(interfaceC6172s, "<unused var>");
                    Intrinsics.j(event, "event");
                    if (event == this.f55406a) {
                        this.f55407b.f143742a = C15809k.d(this.f55408c, null, null, new C1128a(this.f55411f, this.f55412g, null), 3, null);
                        return;
                    }
                    if (event == this.f55409d) {
                        C0 c02 = this.f55407b.f143742a;
                        if (c02 != null) {
                            C0.a.a(c02, null, 1, null);
                        }
                        this.f55407b.f143742a = null;
                    }
                    if (event == AbstractC6165l.a.ON_DESTROY) {
                        InterfaceC15815n<Unit> interfaceC15815n = this.f55410e;
                        Result.Companion companion = Result.INSTANCE;
                        interfaceC15815n.resumeWith(Result.b(Unit.f143329a));
                    }
                }
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C1126a(this.f55402h, this.f55403i, this.f55404j, this.f55405k, continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1126a(AbstractC6165l abstractC6165l, AbstractC6165l.b bVar, InterfaceC15783O interfaceC15783O, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C1126a> continuation) {
                super(2, continuation);
                this.f55402h = abstractC6165l;
                this.f55403i = bVar;
                this.f55404j = interfaceC15783O;
                this.f55405k = function2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((C1126a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
            /* JADX WARN: Removed duplicated region for block: B:45:? A[SYNTHETIC] */
            /* JADX WARN: Type inference failed for: r4v3, types: [T, androidx.lifecycle.J$a$a$a, java.lang.Object] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
                /*
                    r13 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r13.f55401g
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 != r3) goto L2f
                    java.lang.Object r0 = r13.f55400f
                    kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
                    java.lang.Object r0 = r13.f55399e
                    mv.O r0 = (mv.InterfaceC15783O) r0
                    java.lang.Object r0 = r13.f55398d
                    androidx.lifecycle.l r0 = (androidx.view.AbstractC6165l) r0
                    java.lang.Object r0 = r13.f55397c
                    androidx.lifecycle.l$b r0 = (androidx.view.AbstractC6165l.b) r0
                    java.lang.Object r0 = r13.f55396b
                    r1 = r0
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r0 = r13.f55395a
                    r4 = r0
                    kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                    kotlin.ResultKt.b(r14)     // Catch: java.lang.Throwable -> L2b
                    goto La9
                L2b:
                    r0 = move-exception
                    r14 = r0
                    goto Lc0
                L2f:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L37:
                    kotlin.ResultKt.b(r14)
                    androidx.lifecycle.l r14 = r13.f55402h
                    androidx.lifecycle.l$b r14 = r14.getState()
                    androidx.lifecycle.l$b r1 = androidx.view.AbstractC6165l.b.f55499a
                    if (r14 != r1) goto L47
                    kotlin.Unit r14 = kotlin.Unit.f143329a
                    return r14
                L47:
                    kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
                    r6.<init>()
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    androidx.lifecycle.l$b r14 = r13.f55403i     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.l r12 = r13.f55402h     // Catch: java.lang.Throwable -> La1
                    mv.O r7 = r13.f55404j     // Catch: java.lang.Throwable -> La1
                    kotlin.jvm.functions.Function2<mv.O, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r11 = r13.f55405k     // Catch: java.lang.Throwable -> La1
                    r13.f55395a = r6     // Catch: java.lang.Throwable -> La1
                    r13.f55396b = r1     // Catch: java.lang.Throwable -> La1
                    r13.f55397c = r14     // Catch: java.lang.Throwable -> La1
                    r13.f55398d = r12     // Catch: java.lang.Throwable -> La1
                    r13.f55399e = r7     // Catch: java.lang.Throwable -> La1
                    r13.f55400f = r11     // Catch: java.lang.Throwable -> La1
                    r13.f55401g = r3     // Catch: java.lang.Throwable -> La1
                    mv.p r9 = new mv.p     // Catch: java.lang.Throwable -> La1
                    kotlin.coroutines.Continuation r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r13)     // Catch: java.lang.Throwable -> La1
                    r9.<init>(r4, r3)     // Catch: java.lang.Throwable -> La1
                    r9.C()     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.l$a$a r4 = androidx.view.AbstractC6165l.a.INSTANCE     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.l$a r5 = r4.c(r14)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.l$a r8 = r4.a(r14)     // Catch: java.lang.Throwable -> La1
                    r14 = 0
                    wv.a r10 = wv.g.b(r14, r3, r2)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.J$a$a$a r4 = new androidx.lifecycle.J$a$a$a     // Catch: java.lang.Throwable -> La1
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> La1
                    r1.f143742a = r4     // Catch: java.lang.Throwable -> La1
                    java.lang.String r14 = "null cannot be cast to non-null type androidx.lifecycle.LifecycleEventObserver"
                    kotlin.jvm.internal.Intrinsics.h(r4, r14)     // Catch: java.lang.Throwable -> La1
                    androidx.lifecycle.p r4 = (androidx.view.InterfaceC6169p) r4     // Catch: java.lang.Throwable -> La1
                    r12.a(r4)     // Catch: java.lang.Throwable -> La1
                    java.lang.Object r14 = r9.u()     // Catch: java.lang.Throwable -> La1
                    java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch: java.lang.Throwable -> La1
                    if (r14 != r4) goto La5
                    kotlin.coroutines.jvm.internal.DebugProbesKt.c(r13)     // Catch: java.lang.Throwable -> La1
                    goto La5
                La1:
                    r0 = move-exception
                    r14 = r0
                    r4 = r6
                    goto Lc0
                La5:
                    if (r14 != r0) goto La8
                    return r0
                La8:
                    r4 = r6
                La9:
                    T r14 = r4.f143742a
                    mv.C0 r14 = (mv.C0) r14
                    if (r14 == 0) goto Lb2
                    mv.C0.a.a(r14, r2, r3, r2)
                Lb2:
                    T r14 = r1.f143742a
                    androidx.lifecycle.p r14 = (androidx.view.InterfaceC6169p) r14
                    if (r14 == 0) goto Lbd
                    androidx.lifecycle.l r0 = r13.f55402h
                    r0.d(r14)
                Lbd:
                    kotlin.Unit r14 = kotlin.Unit.f143329a
                    return r14
                Lc0:
                    T r0 = r4.f143742a
                    mv.C0 r0 = (mv.C0) r0
                    if (r0 == 0) goto Lc9
                    mv.C0.a.a(r0, r2, r3, r2)
                Lc9:
                    T r0 = r1.f143742a
                    androidx.lifecycle.p r0 = (androidx.view.InterfaceC6169p) r0
                    if (r0 == 0) goto Ld4
                    androidx.lifecycle.l r1 = r13.f55402h
                    r1.d(r0)
                Ld4:
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.view.C6136J.a.C1126a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(AbstractC6165l abstractC6165l, AbstractC6165l.b bVar, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f55392c = abstractC6165l;
            this.f55393d = bVar;
            this.f55394e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f55392c, this.f55393d, this.f55394e, continuation);
            aVar.f55391b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f55390a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f55391b;
                L0 l0X0 = C15800f0.c().X0();
                C1126a c1126a = new C1126a(this.f55392c, this.f55393d, interfaceC15783O, this.f55394e, null);
                this.f55390a = 1;
                if (C15805i.g(l0X0, c1126a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public static final Object a(AbstractC6165l abstractC6165l, AbstractC6165l.b bVar, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        if (bVar == AbstractC6165l.b.f55500b) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        }
        if (abstractC6165l.getState() == AbstractC6165l.b.f55499a) {
            return Unit.f143329a;
        }
        Object objG = C15784P.g(new a(abstractC6165l, bVar, function2, null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
    }

    public static final Object b(InterfaceC6172s interfaceC6172s, AbstractC6165l.b bVar, Function2<? super InterfaceC15783O, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objA = a(interfaceC6172s.getLifecycle(), bVar, function2, continuation);
        if (objA == IntrinsicsKt.f()) {
            return objA;
        }
        return Unit.f143329a;
    }
}
