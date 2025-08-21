package pv;

import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aJ\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\t\u0010\n\u001a#\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aJ\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0012\u0010\n\u001aJ\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006¢\u0006\u0004\b\u0013\u0010\n¨\u0006\u0014"}, d2 = {"T", "Lkotlin/Function2;", "Lpv/g;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "Lpv/f;", "d", "(Lkotlin/jvm/functions/Function2;)Lpv/f;", "", "a", "(Ljava/lang/Iterable;)Lpv/f;", "value", "e", "(Ljava/lang/Object;)Lpv/f;", "Lov/t;", "c", "b", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: pv.i, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final /* synthetic */ class C16564i {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pv/i$a", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.i$a */
    public static final class a<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f157519a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", l = {111}, m = "collect")
        /* renamed from: pv.i$a$a, reason: collision with other inner class name */
        public static final class C2440a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            /* synthetic */ Object f157520a;

            /* renamed from: b, reason: collision with root package name */
            int f157521b;

            /* renamed from: d, reason: collision with root package name */
            Object f157523d;

            /* renamed from: e, reason: collision with root package name */
            Object f157524e;

            public C2440a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f157520a = obj;
                this.f157521b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(Iterable iterable) {
            this.f157519a = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // pv.InterfaceC16561f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object collect(pv.InterfaceC16562g<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof pv.C16564i.a.C2440a
                if (r0 == 0) goto L13
                r0 = r7
                pv.i$a$a r0 = (pv.C16564i.a.C2440a) r0
                int r1 = r0.f157521b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f157521b = r1
                goto L18
            L13:
                pv.i$a$a r0 = new pv.i$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f157520a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r2 = r0.f157521b
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f157524e
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f157523d
                pv.g r2 = (pv.InterfaceC16562g) r2
                kotlin.ResultKt.b(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.ResultKt.b(r7)
                java.lang.Iterable r7 = r5.f157519a
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f157523d = r7
                r0.f157524e = r6
                r0.f157521b = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pv.C16564i.a.collect(pv.g, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"pv/i$b", "Lpv/f;", "Lpv/g;", "collector", "", "collect", "(Lpv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: pv.i$b */
    public static final class b<T> implements InterfaceC16561f<T> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f157525a;

        public b(Object obj) {
            this.f157525a = obj;
        }

        @Override // pv.InterfaceC16561f
        public Object collect(InterfaceC16562g<? super T> interfaceC16562g, Continuation<? super Unit> continuation) {
            Object objEmit = interfaceC16562g.emit((Object) this.f157525a, continuation);
            return objEmit == IntrinsicsKt.f() ? objEmit : Unit.f143329a;
        }
    }

    public static final <T> InterfaceC16561f<T> a(Iterable<? extends T> iterable) {
        return new a(iterable);
    }

    public static final <T> InterfaceC16561f<T> b(@BuilderInference Function2<? super ov.t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C16557b(function2, null, 0, null, 14, null);
    }

    public static final <T> InterfaceC16561f<T> c(@BuilderInference Function2<? super ov.t<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C16559d(function2, null, 0, null, 14, null);
    }

    public static final <T> InterfaceC16561f<T> d(@BuilderInference Function2<? super InterfaceC16562g<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return new C16552E(function2);
    }

    public static final <T> InterfaceC16561f<T> e(T t10) {
        return new b(t10);
    }
}
