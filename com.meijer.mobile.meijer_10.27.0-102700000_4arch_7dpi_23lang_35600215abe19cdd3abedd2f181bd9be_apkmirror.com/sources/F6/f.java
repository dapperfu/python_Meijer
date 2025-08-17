package F6;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ao\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022B\u0010\f\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0003¢\u0006\u0002\b\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"T", "R", "Ltv/f;", "Lkotlin/Function3;", "Ltv/g;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "a", "(Ltv/f;Lkotlin/jvm/functions/Function3;)Ltv/f;", "apollo-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Ltv/g;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1", f = "flows.kt", l = {61}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a<R> extends SuspendLambda implements Function2<InterfaceC17153g<? super R>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f10268a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f10269b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f<T> f10270c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC17153g<? super R>, T, Continuation<? super Boolean>, Object> f10271d;

        /* JADX INFO: Add missing generic type declarations: [T] */
        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"F6/f$a$a", "Ltv/g;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: F6.f$a$a, reason: collision with other inner class name */
        public static final class C0141a<T> implements InterfaceC17153g<T> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function3 f10272a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f10273b;

            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "flows.kt", l = {35}, m = "emit")
            /* renamed from: F6.f$a$a$a, reason: collision with other inner class name */
            public static final class C0142a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f10274a;

                /* renamed from: b, reason: collision with root package name */
                int f10275b;

                public C0142a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f10274a = obj;
                    this.f10275b |= Integer.MIN_VALUE;
                    return C0141a.this.emit(null, this);
                }
            }

            public C0141a(Function3 function3, InterfaceC17153g interfaceC17153g) {
                this.f10272a = function3;
                this.f10273b = interfaceC17153g;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Object emit(T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof F6.f.a.C0141a.C0142a
                    if (r0 == 0) goto L13
                    r0 = r6
                    F6.f$a$a$a r0 = (F6.f.a.C0141a.C0142a) r0
                    int r1 = r0.f10275b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f10275b = r1
                    goto L18
                L13:
                    F6.f$a$a$a r0 = new F6.f$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f10274a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f10275b
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.ResultKt.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.ResultKt.b(r6)
                    kotlin.jvm.functions.Function3 r6 = r4.f10272a
                    tv.g r2 = r4.f10273b
                    r0.f10275b = r3
                    r3 = 6
                    kotlin.jvm.internal.InlineMarker.c(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.InlineMarker.c(r5)
                    if (r6 != r1) goto L49
                    return r1
                L49:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r5 = r6.booleanValue()
                    if (r5 == 0) goto L54
                    kotlin.Unit r5 = kotlin.Unit.f142422a
                    return r5
                L54:
                    F6.a r5 = new F6.a
                    r5.<init>(r4)
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: F6.f.a.C0141a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class b<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C0141a f10277a;

            public b(C0141a c0141a) {
                this.f10277a = c0141a;
            }

            @Override // tv.InterfaceC17153g
            public final Object emit(T t10, Continuation<? super Unit> continuation) {
                Object objEmit = this.f10277a.emit(t10, continuation);
                return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC17152f<? extends T> interfaceC17152f, Function3<? super InterfaceC17153g<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> function3, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f10270c = interfaceC17152f;
            this.f10271d = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f10270c, this.f10271d, continuation);
            aVar.f10269b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super R> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C0141a c0141a;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f10268a;
            if (i10 != 0) {
                if (i10 == 1) {
                    c0141a = (C0141a) this.f10269b;
                    try {
                        ResultKt.b(obj);
                    } catch (F6.a e10) {
                        e = e10;
                        e.a(c0141a);
                        return Unit.f142422a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17153g interfaceC17153g = (InterfaceC17153g) this.f10269b;
                InterfaceC17152f<T> interfaceC17152f = this.f10270c;
                C0141a c0141a2 = new C0141a(this.f10271d, interfaceC17153g);
                try {
                    b bVar = new b(c0141a2);
                    this.f10269b = c0141a2;
                    this.f10268a = 1;
                    if (interfaceC17152f.collect(bVar, this) == objF) {
                        return objF;
                    }
                } catch (F6.a e11) {
                    e = e11;
                    c0141a = c0141a2;
                    e.a(c0141a);
                    return Unit.f142422a;
                }
            }
            return Unit.f142422a;
        }
    }

    public static final <T, R> InterfaceC17152f<R> a(InterfaceC17152f<? extends T> interfaceC17152f, Function3<? super InterfaceC17153g<? super R>, ? super T, ? super Continuation<? super Boolean>, ? extends Object> transform) {
        Intrinsics.j(interfaceC17152f, "<this>");
        Intrinsics.j(transform, "transform");
        return C17154h.E(new a(interfaceC17152f, transform, null));
    }
}
