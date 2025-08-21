package tv;

import io.reactivex.q;
import io.reactivex.s;
import io.reactivex.w;
import io.reactivex.y;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15819p;
import mv.InterfaceC15815n;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0082@¢\u0006\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "Lio/reactivex/y;", "b", "(Lio/reactivex/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/q;", "c", "(Lio/reactivex/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmv/n;", "LJu/b;", "d", "", "f", "(Lmv/n;LJu/b;)V", "Ltv/a;", "mode", "default", "(Lio/reactivex/q;Ltv/a;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b9¨\u0006\u000e"}, d2 = {"tv/c$a", "Lio/reactivex/w;", "LJu/b;", "d", "", "onSubscribe", "(LJu/b;)V", "t", "onSuccess", "(Ljava/lang/Object;)V", "", "error", "onError", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC15815n<T> f163443a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC15815n<? super T> interfaceC15815n) {
            this.f163443a = interfaceC15815n;
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable error) {
            InterfaceC15815n<T> interfaceC15815n = this.f163443a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC15815n.resumeWith(Result.b(ResultKt.a(error)));
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Ju.b d10) {
            c.f(this.f163443a, d10);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f163443a.resumeWith(Result.b(t10));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b9¨\u0006\u001a"}, d2 = {"tv/c$b", "Lio/reactivex/s;", "LJu/b;", "sub", "", "onSubscribe", "(LJu/b;)V", "t", "onNext", "(Ljava/lang/Object;)V", "onComplete", "()V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "a", "LJu/b;", "subscription", "b", "Ljava/lang/Object;", "value", "", "c", "Z", "seenValue", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements s<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Ju.b subscription;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean seenValue;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC15815n<T> f163447d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EnumC17294a f163448e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f163449f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: tv.c$b$b, reason: collision with other inner class name */
        static final class C2580b implements Function1<Throwable, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ju.b f163450a;

            C2580b(Ju.b bVar) {
                this.f163450a = bVar;
            }

            public final void a(Throwable th2) {
                this.f163450a.dispose();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.f143329a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC17294a.values().length];
                try {
                    iArr[EnumC17294a.f163435b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC17294a.f163436c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC17294a.f163437d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC17294a.f163438e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC15815n<? super T> interfaceC15815n, EnumC17294a enumC17294a, T t10) {
            this.f163447d = interfaceC15815n;
            this.f163448e = enumC17294a;
            this.f163449f = t10;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.seenValue) {
                if (this.f163447d.a()) {
                    InterfaceC15815n<T> interfaceC15815n = this.f163447d;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC15815n.resumeWith(Result.b(this.value));
                    return;
                }
                return;
            }
            if (this.f163448e == EnumC17294a.f163436c) {
                InterfaceC15815n<T> interfaceC15815n2 = this.f163447d;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC15815n2.resumeWith(Result.b(this.f163449f));
            } else if (this.f163447d.a()) {
                InterfaceC15815n<T> interfaceC15815n3 = this.f163447d;
                Result.Companion companion3 = Result.INSTANCE;
                interfaceC15815n3.resumeWith(Result.b(ResultKt.a(new NoSuchElementException("No value received via onNext for " + this.f163448e))));
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable e10) {
            InterfaceC15815n<T> interfaceC15815n = this.f163447d;
            Result.Companion companion = Result.INSTANCE;
            interfaceC15815n.resumeWith(Result.b(ResultKt.a(e10)));
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            int i10 = a.$EnumSwitchMapping$0[this.f163448e.ordinal()];
            Ju.b bVar = null;
            if (i10 == 1 || i10 == 2) {
                if (this.seenValue) {
                    return;
                }
                this.seenValue = true;
                this.f163447d.resumeWith(Result.b(t10));
                Ju.b bVar2 = this.subscription;
                if (bVar2 == null) {
                    Intrinsics.x("subscription");
                } else {
                    bVar = bVar2;
                }
                bVar.dispose();
                return;
            }
            if (i10 != 3 && i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f163448e != EnumC17294a.f163438e || !this.seenValue) {
                this.value = t10;
                this.seenValue = true;
                return;
            }
            if (this.f163447d.a()) {
                InterfaceC15815n<T> interfaceC15815n = this.f163447d;
                Result.Companion companion = Result.INSTANCE;
                interfaceC15815n.resumeWith(Result.b(ResultKt.a(new IllegalArgumentException("More than one onNext value for " + this.f163448e))));
            }
            Ju.b bVar3 = this.subscription;
            if (bVar3 == null) {
                Intrinsics.x("subscription");
            } else {
                bVar = bVar3;
            }
            bVar.dispose();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Ju.b sub) {
            this.subscription = sub;
            this.f163447d.F(new C2580b(sub));
        }
    }

    public static final <T> Object b(y<T> yVar, Continuation<? super T> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        yVar.a(new a(c15819p));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    public static final <T> Object c(q<T> qVar, Continuation<? super T> continuation) {
        return e(qVar, EnumC17294a.f163435b, null, continuation, 2, null);
    }

    private static final <T> Object d(q<T> qVar, EnumC17294a enumC17294a, T t10, Continuation<? super T> continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        qVar.subscribe(new b(c15819p, enumC17294a, t10));
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU;
    }

    static /* synthetic */ Object e(q qVar, EnumC17294a enumC17294a, Object obj, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return d(qVar, enumC17294a, obj, continuation);
    }

    public static final void f(InterfaceC15815n<?> interfaceC15815n, final Ju.b bVar) {
        interfaceC15815n.F(new Function1() { // from class: tv.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.g(bVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Ju.b bVar, Throwable th2) {
        bVar.dispose();
        return Unit.f143329a;
    }
}
