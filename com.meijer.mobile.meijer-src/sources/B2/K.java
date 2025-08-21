package B2;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "LB2/J;", "a", "(LB2/J;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class K {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, d2 = {"T", "LB2/B;", "", "it", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {74}, m = "invokeSuspend")
    static final class a<T> extends SuspendLambda implements Function3<B<T>, Boolean, Continuation<? super T>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2233a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f2234b;

        a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        public final Object d(B<T> b10, boolean z10, Continuation<? super T> continuation) {
            a aVar = new a(continuation);
            aVar.f2234b = b10;
            return aVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Boolean bool, Object obj2) {
            return d((B) obj, bool.booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f2233a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            B b10 = (B) this.f2234b;
            this.f2233a = 1;
            Object objC = b10.c(this);
            if (objC == objF) {
                return objF;
            }
            return objC;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Object a(J<T> j10, Continuation<? super T> continuation) {
        return j10.d(new a(null), continuation);
    }
}
