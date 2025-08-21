package androidx.compose.runtime;

import androidx.compose.runtime.Composer;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000.\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aR\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001af\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001aj\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0010\"\u0004\u0018\u00010\u00062-\u0010\b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"T", "initialValue", "Lkotlin/Function2;", "Landroidx/compose/runtime/D0;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "producer", "Landroidx/compose/runtime/z1;", "b", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "key1", "key2", "a", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "", "keys", "c", "(Ljava/lang/Object;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "runtime_release"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
@SourceDebugExtension
/* loaded from: classes.dex */
final /* synthetic */ class q1 {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1$1", f = "ProduceState.kt", l = {77}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f50555a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50556b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<D0<T>, Continuation<? super Unit>, Object> f50557c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<T> f50558d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, InterfaceC5872l0<T> interfaceC5872l0, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f50557c = function2;
            this.f50558d = interfaceC5872l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f50557c, this.f50558d, continuation);
            aVar.f50556b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f50555a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f50556b;
                Function2<D0<T>, Continuation<? super Unit>, Object> function2 = this.f50557c;
                E0 e02 = new E0(this.f50558d, interfaceC15783O.getCoroutineContext());
                this.f50555a = 1;
                if (function2.invoke(e02, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3$1", f = "ProduceState.kt", l = {138}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f50559a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50560b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<D0<T>, Continuation<? super Unit>, Object> f50561c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<T> f50562d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, InterfaceC5872l0<T> interfaceC5872l0, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f50561c = function2;
            this.f50562d = interfaceC5872l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f50561c, this.f50562d, continuation);
            bVar.f50560b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f50559a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f50560b;
                Function2<D0<T>, Continuation<? super Unit>, Object> function2 = this.f50561c;
                E0 e02 = new E0(this.f50562d, interfaceC15783O.getCoroutineContext());
                this.f50559a = 1;
                if (function2.invoke(e02, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", f = "ProduceState.kt", l = {HttpResponseStatus.SUCCESS_CREATED}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f50563a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f50564b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<D0<T>, Continuation<? super Unit>, Object> f50565c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<T> f50566d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, InterfaceC5872l0<T> interfaceC5872l0, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f50565c = function2;
            this.f50566d = interfaceC5872l0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = new c(this.f50565c, this.f50566d, continuation);
            cVar.f50564b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f50563a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f50564b;
                Function2<D0<T>, Continuation<? super Unit>, Object> function2 = this.f50565c;
                E0 e02 = new E0(this.f50566d, interfaceC15783O.getCoroutineContext());
                this.f50563a = 1;
                if (function2.invoke(e02, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public static final <T> z1<T> a(T t10, Object obj, Object obj2, Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(-1703169085, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:135)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = t1.e(t10, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        boolean zD = composer.D(function2);
        Object objB2 = composer.B();
        if (zD || objB2 == companion.a()) {
            objB2 = new b(function2, interfaceC5872l0, null);
            composer.t(objB2);
        }
        J.f(obj, obj2, (Function2) objB2, composer, (i10 >> 3) & 126);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC5872l0;
    }

    public static final <T> z1<T> b(T t10, Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(10454275, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:74)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = t1.e(t10, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        Unit unit = Unit.f143329a;
        boolean zD = composer.D(function2);
        Object objB2 = composer.B();
        if (zD || objB2 == companion.a()) {
            objB2 = new a(function2, interfaceC5872l0, null);
            composer.t(objB2);
        }
        J.g(unit, (Function2) objB2, composer, 6);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC5872l0;
    }

    public static final <T> z1<T> c(T t10, Object[] objArr, Function2<? super D0<T>, ? super Continuation<? super Unit>, ? extends Object> function2, Composer composer, int i10) {
        if (ComposerKt.M()) {
            ComposerKt.U(490154582, i10, -1, "androidx.compose.runtime.produceState (ProduceState.kt:197)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = t1.e(t10, null, 2, null);
            composer.t(objB);
        }
        InterfaceC5872l0 interfaceC5872l0 = (InterfaceC5872l0) objB;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        boolean zD = composer.D(function2);
        Object objB2 = composer.B();
        if (zD || objB2 == companion.a()) {
            objB2 = new c(function2, interfaceC5872l0, null);
            composer.t(objB2);
        }
        J.h(objArrCopyOf, (Function2) objB2, composer, 0);
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return interfaceC5872l0;
    }
}
