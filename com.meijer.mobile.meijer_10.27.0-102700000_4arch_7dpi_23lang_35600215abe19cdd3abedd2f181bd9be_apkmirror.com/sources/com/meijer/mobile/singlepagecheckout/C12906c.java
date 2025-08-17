package com.meijer.mobile.singlepagecheckout;

import androidx.view.InterfaceC6015f;
import java.util.Arrays;
import kotlin.C17342j;
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
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\u000b\u001a\u00020\n2\u001e\u0010\t\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\"\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/meijer/mobile/singlepagecheckout/c;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "", "<init>", "()V", "", "Ltv/P;", "", "validations", "", "n", "([Ltv/P;)V", "Ltv/B;", "a", "Ltv/B;", "_isValid", "b", "Z", "initialized", "o", "()Ltv/P;", "isValid", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.singlepagecheckout.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C12906c extends androidx.view.c0 implements InterfaceC6015f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<Boolean> _isValid = tv.S.a(Boolean.FALSE);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean initialized;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.CheckoutCoordinatorViewModel$init$1", f = "CheckoutCoordinatorViewModel.kt", l = {42}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.meijer.mobile.singlepagecheckout.c$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f118186a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ tv.P<Boolean>[] f118187b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C12906c f118188c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.singlepagecheckout.c$a$a, reason: collision with other inner class name */
        static final class C1918a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C12906c f118189a;

            C1918a(C12906c c12906c) {
                this.f118189a = c12906c;
            }

            public final Object a(boolean z10, Continuation<? super Unit> continuation) {
                this.f118189a._isValid.setValue(Boxing.a(z10));
                return Unit.f142422a;
            }

            @Override // tv.InterfaceC17153g
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: com.meijer.mobile.singlepagecheckout.c$a$b */
        public static final class b implements InterfaceC17152f<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17152f[] f118190a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: com.meijer.mobile.singlepagecheckout.c$a$b$a, reason: collision with other inner class name */
            public static final class C1919a implements Function0<Boolean[]> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC17152f[] f118191a;

                public C1919a(InterfaceC17152f[] interfaceC17152fArr) {
                    this.f118191a = interfaceC17152fArr;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean[] invoke() {
                    return new Boolean[this.f118191a.length];
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Ltv/g;", "", "it", "", "<anonymous>", "(Ltv/g;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.singlepagecheckout.CheckoutCoordinatorViewModel$init$1$invokeSuspend$$inlined$combine$1$3", f = "CheckoutCoordinatorViewModel.kt", l = {234}, m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.meijer.mobile.singlepagecheckout.c$a$b$b, reason: collision with other inner class name */
            public static final class C1920b extends SuspendLambda implements Function3<InterfaceC17153g<? super Boolean>, Boolean[], Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f118192a;

                /* renamed from: b, reason: collision with root package name */
                private /* synthetic */ Object f118193b;

                /* renamed from: c, reason: collision with root package name */
                /* synthetic */ Object f118194c;

                public C1920b(Continuation continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC17153g<? super Boolean> interfaceC17153g, Boolean[] boolArr, Continuation<? super Unit> continuation) {
                    C1920b c1920b = new C1920b(continuation);
                    c1920b.f118193b = interfaceC17153g;
                    c1920b.f118194c = boolArr;
                    return c1920b.invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f118192a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f118193b;
                        Object[] objArr = (Object[]) this.f118194c;
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
                        this.f118193b = interfaceC17153g;
                        this.f118194c = objArr;
                        this.f118192a = 1;
                        if (interfaceC17153g.emit(boolA, this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            public b(InterfaceC17152f[] interfaceC17152fArr) {
                this.f118190a = interfaceC17152fArr;
            }

            @Override // tv.InterfaceC17152f
            public Object collect(InterfaceC17153g<? super Boolean> interfaceC17153g, Continuation continuation) {
                InterfaceC17152f[] interfaceC17152fArr = this.f118190a;
                Object objA = C17342j.a(interfaceC17153g, interfaceC17152fArr, new C1919a(interfaceC17152fArr), new C1920b(null), continuation);
                return objA == IntrinsicsKt.f() ? objA : Unit.f142422a;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f118187b, this.f118188c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(tv.P<Boolean>[] pArr, C12906c c12906c, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f118187b = pArr;
            this.f118188c = c12906c;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f118186a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                tv.P<Boolean>[] pArr = this.f118187b;
                InterfaceC17152f interfaceC17152fR = C17154h.r(new b((InterfaceC17152f[]) Arrays.copyOf(pArr, pArr.length)));
                C1918a c1918a = new C1918a(this.f118188c);
                this.f118186a = 1;
                if (interfaceC17152fR.collect(c1918a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    public final void n(tv.P<Boolean>... validations) {
        Intrinsics.j(validations, "validations");
        if (this.initialized) {
            return;
        }
        this.initialized = true;
        C16648k.d(androidx.view.d0.a(this), null, null, new a(validations, this, null), 3, null);
    }

    public tv.P<Boolean> o() {
        return this._isValid;
    }
}
