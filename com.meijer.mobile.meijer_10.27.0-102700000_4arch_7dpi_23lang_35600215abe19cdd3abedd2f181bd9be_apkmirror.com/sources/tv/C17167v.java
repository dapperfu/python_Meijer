package tv;

import com.google.android.gms.common.api.a;
import kotlin.BuilderInference;
import kotlin.C17340h;
import kotlin.C17341i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import vv.C17632F;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u001e\u0010\u0006\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0005\"\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0007\u0010\b\u001aq\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u00022D\b\u0001\u0010\u0013\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\n¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a`\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\u000223\b\u0001\u0010\u0013\u001a-\b\u0001\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\" \u0010\u001f\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001c¨\u0006 "}, d2 = {"T", "", "Ltv/f;", "c", "(Ljava/lang/Iterable;)Ltv/f;", "", "flows", "d", "([Ltv/f;)Ltv/f;", "R", "Lkotlin/Function3;", "Ltv/g;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "transform", "e", "(Ltv/f;Lkotlin/jvm/functions/Function3;)Ltv/f;", "Lkotlin/Function2;", "b", "(Ltv/f;Lkotlin/jvm/functions/Function2;)Ltv/f;", "", "a", "I", "()I", "getDEFAULT_CONCURRENCY$annotations", "()V", "DEFAULT_CONCURRENCY", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* renamed from: tv.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final /* synthetic */ class C17167v {

    /* renamed from: a, reason: collision with root package name */
    private static final int f162346a = C17632F.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, a.e.API_PRIORITY_OTHER);

    /* JADX INFO: Add missing generic type declarations: [R, T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Ltv/g;", "it", "", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
    /* renamed from: tv.v$a */
    static final class a<R, T> extends SuspendLambda implements Function3<InterfaceC17153g<? super R>, T, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162347a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f162348b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f162349c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<T, Continuation<? super R>, Object> f162350d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super a> continuation) {
            super(3, continuation);
            this.f162350d = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super R> interfaceC17153g, T t10, Continuation<? super Unit> continuation) {
            a aVar = new a(this.f162350d, continuation);
            aVar.f162348b = interfaceC17153g;
            aVar.f162349c = t10;
            return aVar.invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f162347a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f162348b
                tv.g r1 = (tv.InterfaceC17153g) r1
                kotlin.ResultKt.b(r6)
                goto L39
            L22:
                kotlin.ResultKt.b(r6)
                java.lang.Object r6 = r5.f162348b
                r1 = r6
                tv.g r1 = (tv.InterfaceC17153g) r1
                java.lang.Object r6 = r5.f162349c
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r5.f162350d
                r5.f162348b = r1
                r5.f162347a = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f162348b = r3
                r5.f162347a = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tv.C17167v.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final int a() {
        return f162346a;
    }

    public static final <T, R> InterfaceC17152f<R> b(InterfaceC17152f<? extends T> interfaceC17152f, @BuilderInference Function2<? super T, ? super Continuation<? super R>, ? extends Object> function2) {
        return C17154h.e0(interfaceC17152f, new a(function2, null));
    }

    public static final <T> InterfaceC17152f<T> c(Iterable<? extends InterfaceC17152f<? extends T>> iterable) {
        return new C17341i(iterable, null, 0, null, 14, null);
    }

    public static final <T, R> InterfaceC17152f<R> e(InterfaceC17152f<? extends T> interfaceC17152f, @BuilderInference Function3<? super InterfaceC17153g<? super R>, ? super T, ? super Continuation<? super Unit>, ? extends Object> function3) {
        return new C17340h(function3, interfaceC17152f, null, 0, null, 28, null);
    }

    public static final <T> InterfaceC17152f<T> d(InterfaceC17152f<? extends T>... interfaceC17152fArr) {
        return C17154h.L(ArraysKt.R(interfaceC17152fArr));
    }
}
