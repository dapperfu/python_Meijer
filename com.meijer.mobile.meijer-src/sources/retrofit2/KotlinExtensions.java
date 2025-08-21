package retrofit2;

import kotlin.KotlinNullPointerException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15819p;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u00002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u0003H\u0086\b¢\u0006\u0002\u0010\u0004\u001a\"\u0010\u0005\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086@¢\u0006\u0002\u0010\u0007\u001a(\u0010\u0005\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00010\u0006H\u0087@¢\u0006\u0004\b\b\u0010\u0007\u001a\u001a\u0010\u0005\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u0006H\u0087@¢\u0006\u0004\b\n\u0010\u0007\u001a$\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00010\f\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086@¢\u0006\u0002\u0010\u0007\u001a\u0012\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0080@¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"create", "T", "", "Lretrofit2/Retrofit;", "(Lretrofit2/Retrofit;)Ljava/lang/Object;", "await", "Lretrofit2/Call;", "(Lretrofit2/Call;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitNullable", "", "awaitUnit", "awaitResponse", "Lretrofit2/Response;", "suspendAndThrow", "", "", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retrofit"}, k = 2, mv = {2, 1, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class KotlinExtensions {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
    /* renamed from: retrofit2.KotlinExtensions$suspendAndThrow$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return KotlinExtensions.suspendAndThrow(null, this);
        }
    }

    public static final <T> Object await(final Call<T> call, Continuation<? super T> continuation) {
        final C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        c15819p.F(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t10) {
                Intrinsics.j(call2, "call");
                Intrinsics.j(t10, "t");
                InterfaceC15815n<T> interfaceC15815n = c15819p;
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815n.resumeWith(Result.b(ResultKt.a(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.j(call2, "call");
                Intrinsics.j(response, "response");
                if (!response.isSuccessful()) {
                    InterfaceC15815n<T> interfaceC15815n = c15819p;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(ResultKt.a(new HttpException(response))));
                    return;
                }
                T tBody = response.body();
                if (tBody != null) {
                    c15819p.resumeWith(Result.b(tBody));
                    return;
                }
                Object objH = call2.request().h(Invocation.class);
                Intrinsics.g(objH);
                Invocation invocation = (Invocation) objH;
                KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException("Response from " + invocation.service().getName() + '.' + invocation.method().getName() + " was null but response body type was declared as non-null");
                InterfaceC15815n<T> interfaceC15815n2 = c15819p;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC15815n2.resumeWith(Result.b(ResultKt.a(kotlinNullPointerException)));
            }
        });
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    @JvmName
    public static final <T> Object awaitNullable(final Call<T> call, Continuation<? super T> continuation) {
        final C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        c15819p.F(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$await$4$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$await$4$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t10) {
                Intrinsics.j(call2, "call");
                Intrinsics.j(t10, "t");
                InterfaceC15815n<T> interfaceC15815n = c15819p;
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815n.resumeWith(Result.b(ResultKt.a(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.j(call2, "call");
                Intrinsics.j(response, "response");
                if (response.isSuccessful()) {
                    InterfaceC15815n<T> interfaceC15815n = c15819p;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(response.body()));
                } else {
                    InterfaceC15815n<T> interfaceC15815n2 = c15819p;
                    Result.Companion companion2 = Result.INSTANCE;
                    interfaceC15815n2.resumeWith(Result.b(ResultKt.a(new HttpException(response))));
                }
            }
        });
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    public static final <T> Object awaitResponse(final Call<T> call, Continuation<? super Response<T>> continuation) {
        final C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        c15819p.F(new Function1<Throwable, Unit>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f143329a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th2) {
                call.cancel();
            }
        });
        call.enqueue(new Callback<T>() { // from class: retrofit2.KotlinExtensions$awaitResponse$2$2
            @Override // retrofit2.Callback
            public void onFailure(Call<T> call2, Throwable t10) {
                Intrinsics.j(call2, "call");
                Intrinsics.j(t10, "t");
                InterfaceC15815n<Response<T>> interfaceC15815n = c15819p;
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815n.resumeWith(Result.b(ResultKt.a(t10)));
            }

            @Override // retrofit2.Callback
            public void onResponse(Call<T> call2, Response<T> response) {
                Intrinsics.j(call2, "call");
                Intrinsics.j(response, "response");
                c15819p.resumeWith(Result.b(response));
            }
        });
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    @JvmName
    public static final Object awaitUnit(Call<Unit> call, Continuation<? super Unit> continuation) {
        Intrinsics.h(call, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
        return awaitNullable(call, continuation);
    }

    public static final /* synthetic */ <T> T create(Retrofit retrofit) {
        Intrinsics.j(retrofit, "<this>");
        Intrinsics.n(4, "T");
        T t10 = (T) retrofit.create(Object.class);
        Intrinsics.i(t10, "create(...)");
        return t10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object suspendAndThrow(final java.lang.Throwable r4, kotlin.coroutines.Continuation<?> r5) {
        /*
            boolean r0 = r5 instanceof retrofit2.KotlinExtensions.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = (retrofit2.KotlinExtensions.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            retrofit2.KotlinExtensions$suspendAndThrow$1 r0 = new retrofit2.KotlinExtensions$suspendAndThrow$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.L$0
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            kotlin.ResultKt.b(r5)
            goto L5c
        L35:
            kotlin.ResultKt.b(r5)
            r0.L$0 = r4
            r0.label = r3
            mv.K r5 = mv.C15800f0.a()
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            retrofit2.KotlinExtensions$suspendAndThrow$2$1 r3 = new retrofit2.KotlinExtensions$suspendAndThrow$2$1
            r3.<init>()
            r5.J0(r2, r3)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            if (r4 != r5) goto L59
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)
        L59:
            if (r4 != r1) goto L5c
            return r1
        L5c:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.KotlinExtensions.suspendAndThrow(java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
