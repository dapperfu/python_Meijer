package F2;

import B2.InterfaceC2911h;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pv.InterfaceC16561f;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005JC\u0010\r\u001a\u00020\u000221\u0010\f\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0006H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00108\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LF2/d;", "LB2/h;", "LF2/f;", "delegate", "<init>", "(LB2/h;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "t", "Lkotlin/coroutines/Continuation;", "", "transform", "a", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LB2/h;", "Lpv/f;", "getData", "()Lpv/f;", "data", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements InterfaceC2911h<f> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC2911h<f> delegate;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LF2/f;", "it", "<anonymous>", "(LF2/f;)LF2/f;"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {94}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<f, Continuation<? super f>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f8990a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f8991b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2<f, Continuation<? super f>, Object> f8992c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super f, ? super Continuation<? super f>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f8992c = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f8992c, continuation);
            aVar.f8991b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f fVar, Continuation<? super f> continuation) {
            return ((a) create(fVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f8990a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                f fVar = (f) this.f8991b;
                Function2<f, Continuation<? super f>, Object> function2 = this.f8992c;
                this.f8990a = 1;
                obj = function2.invoke(fVar, this);
                if (obj == objF) {
                    return objF;
                }
            }
            f fVar2 = (f) obj;
            Intrinsics.h(fVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((c) fVar2).f();
            return fVar2;
        }
    }

    public d(InterfaceC2911h<f> delegate) {
        Intrinsics.j(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // B2.InterfaceC2911h
    public Object a(Function2<? super f, ? super Continuation<? super f>, ? extends Object> function2, Continuation<? super f> continuation) {
        return this.delegate.a(new a(function2, null), continuation);
    }

    @Override // B2.InterfaceC2911h
    public InterfaceC16561f<f> getData() {
        return this.delegate.getData();
    }
}
