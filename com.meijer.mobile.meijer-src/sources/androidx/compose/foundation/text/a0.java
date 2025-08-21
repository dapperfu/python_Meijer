package androidx.compose.foundation.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import h0.n;
import kotlin.C13904L;
import kotlin.InterfaceC13893A;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a;\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lh0/l;", "interactionSource", "", "enabled", "Lkotlin/Function1;", "LU0/f;", "", "onTap", "a", "(Landroidx/compose/ui/Modifier;Lh0/l;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a0 {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<U0.f, Unit> f49546f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ h0.l f49547g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/runtime/F;", "Landroidx/compose/runtime/E;", "a", "(Landroidx/compose/runtime/F;)Landroidx/compose/runtime/E;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: androidx.compose.foundation.text.a0$a$a, reason: collision with other inner class name */
        static final class C1031a extends Lambda implements Function1<androidx.compose.runtime.F, androidx.compose.runtime.E> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<n.b> f49548f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h0.l f49549g;

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/text/a0$a$a$a", "Landroidx/compose/runtime/E;", "", "dispose", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: androidx.compose.foundation.text.a0$a$a$a, reason: collision with other inner class name */
            public static final class C1032a implements androidx.compose.runtime.E {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0 f49550a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ h0.l f49551b;

                public C1032a(InterfaceC5872l0 interfaceC5872l0, h0.l lVar) {
                    this.f49550a = interfaceC5872l0;
                    this.f49551b = lVar;
                }

                @Override // androidx.compose.runtime.E
                public void dispose() {
                    n.b bVar = (n.b) this.f49550a.getValue();
                    if (bVar != null) {
                        n.a aVar = new n.a(bVar);
                        h0.l lVar = this.f49551b;
                        if (lVar != null) {
                            lVar.a(aVar);
                        }
                        this.f49550a.setValue(null);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1031a(InterfaceC5872l0<n.b> interfaceC5872l0, h0.l lVar) {
                super(1);
                this.f49548f = interfaceC5872l0;
                this.f49549g = lVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.runtime.E invoke(androidx.compose.runtime.F f10) {
                return new C1032a(this.f49548f, this.f49549g);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/J;", "", "invoke", "(Lg1/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        static final class b implements PointerInputEventHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC15783O f49552a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC5872l0<n.b> f49553b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ h0.l f49554c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ z1<Function1<U0.f, Unit>> f49555d;

            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lf0/A;", "LU0/f;", "it", "", "<anonymous>", "(Lf0/A;LU0/f;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.a0$a$b$a, reason: collision with other inner class name */
            static final class C1033a extends SuspendLambda implements Function3<InterfaceC13893A, U0.f, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f49556a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f49557b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ long f49558c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ InterfaceC15783O f49559d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5872l0<n.b> f49560e;

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ h0.l f49561f;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, 64}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.a0$a$b$a$a, reason: collision with other inner class name */
                static final class C1034a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    Object f49562a;

                    /* renamed from: b, reason: collision with root package name */
                    int f49563b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<n.b> f49564c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ long f49565d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ h0.l f49566e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1034a(this.f49564c, this.f49565d, this.f49566e, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1034a(InterfaceC5872l0<n.b> interfaceC5872l0, long j10, h0.l lVar, Continuation<? super C1034a> continuation) {
                        super(2, continuation);
                        this.f49564c = interfaceC5872l0;
                        this.f49565d = j10;
                        this.f49566e = lVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1034a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                            int r1 = r7.f49563b
                            r2 = 0
                            r3 = 2
                            r4 = 1
                            if (r1 == 0) goto L27
                            if (r1 == r4) goto L1f
                            if (r1 != r3) goto L17
                            java.lang.Object r0 = r7.f49562a
                            h0.n$b r0 = (h0.n.b) r0
                            kotlin.ResultKt.b(r8)
                            goto L66
                        L17:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L1f:
                            java.lang.Object r1 = r7.f49562a
                            androidx.compose.runtime.l0 r1 = (androidx.compose.runtime.InterfaceC5872l0) r1
                            kotlin.ResultKt.b(r8)
                            goto L4b
                        L27:
                            kotlin.ResultKt.b(r8)
                            androidx.compose.runtime.l0<h0.n$b> r8 = r7.f49564c
                            java.lang.Object r8 = r8.getValue()
                            h0.n$b r8 = (h0.n.b) r8
                            if (r8 == 0) goto L4f
                            h0.l r1 = r7.f49566e
                            androidx.compose.runtime.l0<h0.n$b> r5 = r7.f49564c
                            h0.n$a r6 = new h0.n$a
                            r6.<init>(r8)
                            if (r1 == 0) goto L4c
                            r7.f49562a = r5
                            r7.f49563b = r4
                            java.lang.Object r8 = r1.c(r6, r7)
                            if (r8 != r0) goto L4a
                            goto L64
                        L4a:
                            r1 = r5
                        L4b:
                            r5 = r1
                        L4c:
                            r5.setValue(r2)
                        L4f:
                            h0.n$b r8 = new h0.n$b
                            long r4 = r7.f49565d
                            r8.<init>(r4, r2)
                            h0.l r1 = r7.f49566e
                            if (r1 == 0) goto L67
                            r7.f49562a = r8
                            r7.f49563b = r3
                            java.lang.Object r1 = r1.c(r8, r7)
                            if (r1 != r0) goto L65
                        L64:
                            return r0
                        L65:
                            r0 = r8
                        L66:
                            r8 = r0
                        L67:
                            androidx.compose.runtime.l0<h0.n$b> r0 = r7.f49564c
                            r0.setValue(r8)
                            kotlin.Unit r8 = kotlin.Unit.f143329a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.a0.a.b.C1033a.C1034a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.a0$a$b$a$b, reason: collision with other inner class name */
                static final class C1035b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    Object f49567a;

                    /* renamed from: b, reason: collision with root package name */
                    int f49568b;

                    /* renamed from: c, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5872l0<n.b> f49569c;

                    /* renamed from: d, reason: collision with root package name */
                    final /* synthetic */ boolean f49570d;

                    /* renamed from: e, reason: collision with root package name */
                    final /* synthetic */ h0.l f49571e;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C1035b(this.f49569c, this.f49570d, this.f49571e, continuation);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C1035b(InterfaceC5872l0<n.b> interfaceC5872l0, boolean z10, h0.l lVar, Continuation<? super C1035b> continuation) {
                        super(2, continuation);
                        this.f49569c = interfaceC5872l0;
                        this.f49570d = z10;
                        this.f49571e = lVar;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                        return ((C1035b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        InterfaceC5872l0<n.b> interfaceC5872l0;
                        h0.i aVar;
                        InterfaceC5872l0<n.b> interfaceC5872l02;
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f49568b;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                interfaceC5872l02 = (InterfaceC5872l0) this.f49567a;
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            n.b value = this.f49569c.getValue();
                            if (value != null) {
                                boolean z10 = this.f49570d;
                                h0.l lVar = this.f49571e;
                                interfaceC5872l0 = this.f49569c;
                                if (z10) {
                                    aVar = new n.c(value);
                                } else {
                                    aVar = new n.a(value);
                                }
                                if (lVar != null) {
                                    this.f49567a = interfaceC5872l0;
                                    this.f49568b = 1;
                                    if (lVar.c(aVar, this) == objF) {
                                        return objF;
                                    }
                                    interfaceC5872l02 = interfaceC5872l0;
                                }
                                interfaceC5872l0.setValue(null);
                            }
                            return Unit.f143329a;
                        }
                        interfaceC5872l0 = interfaceC5872l02;
                        interfaceC5872l0.setValue(null);
                        return Unit.f143329a;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(InterfaceC13893A interfaceC13893A, U0.f fVar, Continuation<? super Unit> continuation) {
                    return d(interfaceC13893A, fVar.getPackedValue(), continuation);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1033a(InterfaceC15783O interfaceC15783O, InterfaceC5872l0<n.b> interfaceC5872l0, h0.l lVar, Continuation<? super C1033a> continuation) {
                    super(3, continuation);
                    this.f49559d = interfaceC15783O;
                    this.f49560e = interfaceC5872l0;
                    this.f49561f = lVar;
                }

                public final Object d(InterfaceC13893A interfaceC13893A, long j10, Continuation<? super Unit> continuation) {
                    C1033a c1033a = new C1033a(this.f49559d, this.f49560e, this.f49561f, continuation);
                    c1033a.f49557b = interfaceC13893A;
                    c1033a.f49558c = j10;
                    return c1033a.invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f49556a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC13893A interfaceC13893A = (InterfaceC13893A) this.f49557b;
                        C15809k.d(this.f49559d, null, null, new C1034a(this.f49560e, this.f49558c, this.f49561f, null), 3, null);
                        this.f49556a = 1;
                        obj = interfaceC13893A.I0(this);
                        if (obj == objF) {
                            return objF;
                        }
                    }
                    C15809k.d(this.f49559d, null, null, new C1035b(this.f49560e, ((Boolean) obj).booleanValue(), this.f49561f, null), 3, null);
                    return Unit.f143329a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU0/f;", "it", "", "a", "(J)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: androidx.compose.foundation.text.a0$a$b$b, reason: collision with other inner class name */
            static final class C1036b extends Lambda implements Function1<U0.f, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ z1<Function1<U0.f, Unit>> f49572f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1036b(z1<? extends Function1<? super U0.f, Unit>> z1Var) {
                    super(1);
                    this.f49572f = z1Var;
                }

                public final void a(long j10) {
                    this.f49572f.getValue().invoke(U0.f.d(j10));
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(U0.f fVar) {
                    a(fVar.getPackedValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            b(InterfaceC15783O interfaceC15783O, InterfaceC5872l0<n.b> interfaceC5872l0, h0.l lVar, z1<? extends Function1<? super U0.f, Unit>> z1Var) {
                this.f49552a = interfaceC15783O;
                this.f49553b = interfaceC5872l0;
                this.f49554c = lVar;
                this.f49555d = z1Var;
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(g1.J j10, Continuation<? super Unit> continuation) {
                Object objK = C13904L.k(j10, new C1033a(this.f49552a, this.f49553b, this.f49554c, null), new C1036b(this.f49555d), continuation);
                return objK == IntrinsicsKt.f() ? objK : Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super U0.f, Unit> function1, h0.l lVar) {
            super(3);
            this.f49546f = function1;
            this.f49547g = lVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return a(modifier, composer, num.intValue());
        }

        public final Modifier a(Modifier modifier, Composer composer, int i10) {
            composer.startReplaceGroup(-102778667);
            if (ComposerKt.M()) {
                ComposerKt.U(-102778667, i10, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
            }
            Object objB = composer.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f143553a, composer);
                composer.t(objB);
            }
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) objB;
            Object objB2 = composer.B();
            if (objB2 == companion.a()) {
                objB2 = t1.e(null, null, 2, null);
                composer.t(objB2);
            }
            InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB2;
            z1 z1VarP = o1.p(this.f49546f, composer, 0);
            Object obj = this.f49547g;
            boolean zV = composer.V(obj);
            h0.l lVar = this.f49547g;
            Object objB3 = composer.B();
            if (zV || objB3 == companion.a()) {
                objB3 = new C1031a(interfaceC5872l0, lVar);
                composer.t(objB3);
            }
            androidx.compose.runtime.J.c(obj, (Function1) objB3, composer, 0);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            h0.l lVar2 = this.f49547g;
            boolean zD = composer.D(interfaceC15783O) | composer.V(this.f49547g) | composer.V(z1VarP);
            h0.l lVar3 = this.f49547g;
            Object objB4 = composer.B();
            if (zD || objB4 == companion.a()) {
                objB4 = new b(interfaceC15783O, interfaceC5872l0, lVar3, z1VarP);
                composer.t(objB4);
            }
            Modifier modifierC = g1.U.c(companion2, lVar2, (PointerInputEventHandler) objB4);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            composer.P();
            return modifierC;
        }
    }

    public static final Modifier a(Modifier modifier, h0.l lVar, boolean z10, Function1<? super U0.f, Unit> function1) {
        return z10 ? androidx.compose.ui.b.c(modifier, null, new a(function1, lVar), 1, null) : modifier;
    }
}
