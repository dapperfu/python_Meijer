package com.meijer.mobile.singlepagecheckout;

import androidx.view.InterfaceC6157f;
import java.util.Arrays;
import kotlin.C16778j;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\"\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/c;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "<init>", "()V", "", "Lpv/P;", "", "validations", "", "n", "([Lpv/P;)V", "Lpv/B;", "a", "Lpv/B;", "_isValid", "b", "Z", "initialized", "o", "()Lpv/P;", "isValid", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C13032c extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Boolean> _isValid = pv.S.a(Boolean.FALSE);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.CheckoutCoordinatorViewModel$init$1", f = "CheckoutCoordinatorViewModel.kt", l = {42}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.c$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f119180a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ pv.P<Boolean>[] f119181b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C13032c f119182c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.c$a$a, reason: collision with other inner class name */
        static final class C1927a<T> implements InterfaceC16562g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C13032c f119183a;

            C1927a(C13032c c13032c) {
                this.f119183a = c13032c;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                this.f119183a._isValid.setValue(Boxing.a(z10));
                return Unit.f143329a;
            }

            @Override // pv.InterfaceC16562g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.c$a$b */
        public static final class b implements InterfaceC16561f<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC16561f[] f119184a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.c$a$b$a, reason: collision with other inner class name */
            public static final class C1928a implements Function0<Boolean[]> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC16561f[] f119185a;

                public C1928a(InterfaceC16561f[] interfaceC16561fArr) {
                    this.f119185a = interfaceC16561fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean[] invoke() {
                    return new Boolean[this.f119185a.length];
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lpv/g;", "", "it", "", "<anonymous>", "(Lpv/g;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.CheckoutCoordinatorViewModel$init$1$invokeSuspend$$inlined$combine$1$3", f = "CheckoutCoordinatorViewModel.kt", l = {234}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.singlepagecheckout.c$a$b$b, reason: collision with other inner class name */
            public static final class C1929b extends SuspendLambda implements Function3<InterfaceC16562g<? super Boolean>, Boolean[], Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f119186a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f119187b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f119188c;

                public C1929b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC16562g<? super Boolean> interfaceC16562g, Boolean[] boolArr, Continuation<? super Unit> continuation) {
                    C1929b c1929b = new C1929b(continuation);
                    c1929b.f119187b = interfaceC16562g;
                    c1929b.f119188c = boolArr;
                    return c1929b.invokeSuspend(Unit.f143329a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f119186a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16562g interfaceC16562g = (InterfaceC16562g) this.f119187b;
                        Object[] objArr = (Object[]) this.f119188c;
                        Boolean[] boolArr = (Boolean[]) objArr;
                        int length = boolArr.length;
                        boolean z10 = false;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (!boolArr[i11].booleanValue()) {
                                    break;
                                }
                                i11++;
                            } else {
                                z10 = true;
                                break;
                            }
                        }
                        Boolean boolA = Boxing.a(z10);
                        this.f119187b = interfaceC16562g;
                        this.f119188c = objArr;
                        this.f119186a = 1;
                        if (interfaceC16562g.emit(boolA, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f143329a;
                }
            }

            public b(InterfaceC16561f[] interfaceC16561fArr) {
                this.f119184a = interfaceC16561fArr;
            }

            @Override // pv.InterfaceC16561f
            public Object collect(InterfaceC16562g<? super Boolean> interfaceC16562g, Continuation continuation) {
                InterfaceC16561f[] interfaceC16561fArr = this.f119184a;
                Object objA = C16778j.a(interfaceC16562g, interfaceC16561fArr, new C1928a(interfaceC16561fArr), new C1929b(null), continuation);
                return objA == IntrinsicsKt.f() ? objA : Unit.f143329a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f119181b, this.f119182c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(pv.P<Boolean>[] pArr, C13032c c13032c, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f119181b = pArr;
            this.f119182c = c13032c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f119180a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                pv.P<Boolean>[] pArr = this.f119181b;
                InterfaceC16561f interfaceC16561fR = C16563h.r(new b((InterfaceC16561f[]) Arrays.copyOf(pArr, pArr.length)));
                C1927a c1927a = new C1927a(this.f119182c);
                this.f119180a = 1;
                if (interfaceC16561fR.collect(c1927a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public final void n(pv.P<Boolean>... validations) {
        Intrinsics.j(validations, "validations");
        if (this.initialized) {
            return;
        }
        this.initialized = true;
        C15809k.d(androidx.view.d0.a(this), null, null, new a(validations, this, null), 3, null);
    }

    public pv.P<Boolean> o() {
        return this._isValid;
    }
}
