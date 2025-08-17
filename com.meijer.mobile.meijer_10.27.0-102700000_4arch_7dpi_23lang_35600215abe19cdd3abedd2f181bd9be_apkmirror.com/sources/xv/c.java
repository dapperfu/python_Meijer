package xv;

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
import qv.C16658p;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a \u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\n*\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a4\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0082@¢\u0006\u0004\b\t\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "Lio/reactivex/y;", "b", "(Lio/reactivex/y;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lio/reactivex/q;", "c", "(Lio/reactivex/q;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lqv/n;", "LNu/b;", "d", "", "f", "(Lqv/n;LNu/b;)V", "Lxv/a;", "mode", "default", "(Lio/reactivex/q;Lxv/a;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-rx2"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class c {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b9¨\u0006\u000e"}, d2 = {"xv/c$a", "Lio/reactivex/w;", "LNu/b;", "d", "", "onSubscribe", "(LNu/b;)V", "t", "onSuccess", "(Ljava/lang/Object;)V", "", "error", "onError", "(Ljava/lang/Throwable;)V", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements w<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<T> f169975a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC16654n<? super T> interfaceC16654n) {
            this.f169975a = interfaceC16654n;
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onError(Throwable error) {
            InterfaceC16654n<T> interfaceC16654n = this.f169975a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(ResultKt.a(error)));
        }

        @Override // io.reactivex.w, io.reactivex.c, io.reactivex.i
        public void onSubscribe(Nu.b d10) {
            c.f(this.f169975a, d10);
        }

        @Override // io.reactivex.w, io.reactivex.i
        public void onSuccess(T t10) {
            this.f169975a.resumeWith(Result.b(t10));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\b\u00028\u0000H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b9¨\u0006\u001a"}, d2 = {"xv/c$b", "Lio/reactivex/s;", "LNu/b;", "sub", "", "onSubscribe", "(LNu/b;)V", "t", "onNext", "(Ljava/lang/Object;)V", "onComplete", "()V", "", "e", "onError", "(Ljava/lang/Throwable;)V", "a", "LNu/b;", "subscription", "b", "Ljava/lang/Object;", "value", "", "c", "Z", "seenValue", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b<T> implements s<T> {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Nu.b subscription;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private T value;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean seenValue;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<T> f169979d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ EnumC18102a f169980e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ T f169981f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: xv.c$b$b, reason: collision with other inner class name */
        static final class C2736b implements Function1<Throwable, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Nu.b f169982a;

            C2736b(Nu.b bVar) {
                this.f169982a = bVar;
            }

            public final void a(Throwable th2) {
                this.f169982a.dispose();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                a(th2);
                return Unit.f142422a;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC18102a.values().length];
                try {
                    iArr[EnumC18102a.f169967b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC18102a.f169968c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC18102a.f169969d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[EnumC18102a.f169970e.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC16654n<? super T> interfaceC16654n, EnumC18102a enumC18102a, T t10) {
            this.f169979d = interfaceC16654n;
            this.f169980e = enumC18102a;
            this.f169981f = t10;
        }

        @Override // io.reactivex.s
        public void onComplete() {
            if (this.seenValue) {
                if (this.f169979d.a()) {
                    InterfaceC16654n<T> interfaceC16654n = this.f169979d;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC16654n.resumeWith(Result.b(this.value));
                    return;
                }
                return;
            }
            if (this.f169980e == EnumC18102a.f169968c) {
                InterfaceC16654n<T> interfaceC16654n2 = this.f169979d;
                Result.Companion companion2 = Result.INSTANCE;
                interfaceC16654n2.resumeWith(Result.b(this.f169981f));
            } else if (this.f169979d.a()) {
                InterfaceC16654n<T> interfaceC16654n3 = this.f169979d;
                Result.Companion companion3 = Result.INSTANCE;
                interfaceC16654n3.resumeWith(Result.b(ResultKt.a(new NoSuchElementException("No value received via onNext for " + this.f169980e))));
            }
        }

        @Override // io.reactivex.s
        public void onError(Throwable e10) {
            InterfaceC16654n<T> interfaceC16654n = this.f169979d;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(ResultKt.a(e10)));
        }

        @Override // io.reactivex.s
        public void onNext(T t10) {
            int i10 = a.$EnumSwitchMapping$0[this.f169980e.ordinal()];
            Nu.b bVar = null;
            if (i10 == 1 || i10 == 2) {
                if (this.seenValue) {
                    return;
                }
                this.seenValue = true;
                this.f169979d.resumeWith(Result.b(t10));
                Nu.b bVar2 = this.subscription;
                if (bVar2 == null) {
                    Intrinsics.y("subscription");
                } else {
                    bVar = bVar2;
                }
                bVar.dispose();
                return;
            }
            if (i10 != 3 && i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.f169980e != EnumC18102a.f169970e || !this.seenValue) {
                this.value = t10;
                this.seenValue = true;
                return;
            }
            if (this.f169979d.a()) {
                InterfaceC16654n<T> interfaceC16654n = this.f169979d;
                Result.Companion companion = Result.INSTANCE;
                interfaceC16654n.resumeWith(Result.b(ResultKt.a(new IllegalArgumentException("More than one onNext value for " + this.f169980e))));
            }
            Nu.b bVar3 = this.subscription;
            if (bVar3 == null) {
                Intrinsics.y("subscription");
            } else {
                bVar = bVar3;
            }
            bVar.dispose();
        }

        @Override // io.reactivex.s
        public void onSubscribe(Nu.b sub) {
            this.subscription = sub;
            this.f169979d.F(new C2736b(sub));
        }
    }

    public static final <T> Object b(y<T> yVar, Continuation<? super T> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        yVar.a(new a(c16658p));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    public static final <T> Object c(q<T> qVar, Continuation<? super T> continuation) {
        return e(qVar, EnumC18102a.f169967b, null, continuation, 2, null);
    }

    private static final <T> Object d(q<T> qVar, EnumC18102a enumC18102a, T t10, Continuation<? super T> continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        qVar.subscribe(new b(c16658p, enumC18102a, t10));
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV;
    }

    static /* synthetic */ Object e(q qVar, EnumC18102a enumC18102a, Object obj, Continuation continuation, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        return d(qVar, enumC18102a, obj, continuation);
    }

    public static final void f(InterfaceC16654n<?> interfaceC16654n, final Nu.b bVar) {
        interfaceC16654n.F(new Function1() { // from class: xv.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.g(bVar, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Nu.b bVar, Throwable th2) {
        bVar.dispose();
        return Unit.f142422a;
    }
}
