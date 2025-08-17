package F2;

import B2.InterfaceC2943h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a>\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LB2/h;", "LF2/f;", "Lkotlin/Function2;", "LF2/c;", "Lkotlin/coroutines/Continuation;", "", "", "transform", "a", "(LB2/h;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-preferences-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class j {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF2/f;", "it", "<anonymous>", "(LF2/f;)LF2/f;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {358}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<f, Continuation<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f10232a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f10233b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<c, Continuation<? super Unit>, Object> f10234c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super c, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f10234c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f10234c, continuation);
            aVar.f10233b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Continuation<? super f> continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f10232a;
            if (i10 != 0) {
                if (i10 == 1) {
                    c cVar = (c) this.f10233b;
                    ResultKt.b(obj);
                    return cVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            c cVarC = ((f) this.f10233b).c();
            Function2<c, Continuation<? super Unit>, Object> function2 = this.f10234c;
            this.f10233b = cVarC;
            this.f10232a = 1;
            if (function2.invoke(cVarC, this) == objF) {
                return objF;
            }
            return cVarC;
        }
    }

    public static final Object a(InterfaceC2943h<f> interfaceC2943h, Function2<? super c, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super f> continuation) {
        return interfaceC2943h.a(new a(function2, null), continuation);
    }
}
