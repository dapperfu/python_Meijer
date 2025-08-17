package Ls;

import Js.WeeklyAdItem;
import Js.WeeklyAdPrintPage;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import rk.d;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LLs/a;", "", "LKs/b;", "flippWeeklyAdDataSource", "Lqv/K;", "ioDispatcher", "<init>", "(LKs/b;Lqv/K;)V", "", "LJs/c;", "pages", "LJs/b;", "weeklyAdItems", "LLs/a$a;", "d", "(Ljava/util/List;Ljava/util/List;)LLs/a$a;", "", "flyerId", "c", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LKs/b;", "b", "Lqv/K;", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ks.b flippWeeklyAdDataSource;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018¨\u0006\u001b"}, d2 = {"LLs/a$a;", "", "", "LJs/c;", "pages", "", "LJs/b;", "weeklyAdItems", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "(Ljava/util/List;Ljava/util/List;)LLs/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "d", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ls.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class WeeklyAdPrintInfo {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<WeeklyAdPrintPage> pages;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<WeeklyAdItem> weeklyAdItems;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeeklyAdPrintInfo)) {
                return false;
            }
            WeeklyAdPrintInfo weeklyAdPrintInfo = (WeeklyAdPrintInfo) other;
            return Intrinsics.e(this.pages, weeklyAdPrintInfo.pages) && Intrinsics.e(this.weeklyAdItems, weeklyAdPrintInfo.weeklyAdItems);
        }

        public WeeklyAdPrintInfo(List<WeeklyAdPrintPage> pages, List<WeeklyAdItem> weeklyAdItems) {
            Intrinsics.j(pages, "pages");
            Intrinsics.j(weeklyAdItems, "weeklyAdItems");
            this.pages = pages;
            this.weeklyAdItems = weeklyAdItems;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ WeeklyAdPrintInfo b(WeeklyAdPrintInfo weeklyAdPrintInfo, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = weeklyAdPrintInfo.pages;
            }
            if ((i10 & 2) != 0) {
                list2 = weeklyAdPrintInfo.weeklyAdItems;
            }
            return weeklyAdPrintInfo.a(list, list2);
        }

        public final WeeklyAdPrintInfo a(List<WeeklyAdPrintPage> pages, List<WeeklyAdItem> weeklyAdItems) {
            Intrinsics.j(pages, "pages");
            Intrinsics.j(weeklyAdItems, "weeklyAdItems");
            return new WeeklyAdPrintInfo(pages, weeklyAdItems);
        }

        public final List<WeeklyAdPrintPage> c() {
            return this.pages;
        }

        public final List<WeeklyAdItem> d() {
            return this.weeklyAdItems;
        }

        public int hashCode() {
            return (this.pages.hashCode() * 31) + this.weeklyAdItems.hashCode();
        }

        public String toString() {
            return "WeeklyAdPrintInfo(pages=" + this.pages + ", weeklyAdItems=" + this.weeklyAdItems + ')';
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LLs/a$a;", "<anonymous>", "(Lqv/O;)LLs/a$a;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdPrintInfoCall$call$2", f = "GetFlippWeeklyAdPrintInfoCall.kt", l = {47, 48, 48}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super WeeklyAdPrintInfo>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f18703a;

        /* renamed from: b, reason: collision with root package name */
        Object f18704b;

        /* renamed from: c, reason: collision with root package name */
        Object f18705c;

        /* renamed from: d, reason: collision with root package name */
        Object f18706d;

        /* renamed from: e, reason: collision with root package name */
        int f18707e;

        /* renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f18708f;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f18710h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LJs/c;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdPrintInfoCall$call$2$pages$1", f = "GetFlippWeeklyAdPrintInfoCall.kt", l = {34}, m = "invokeSuspend")
        /* renamed from: Ls.a$b$a, reason: collision with other inner class name */
        static final class C0318a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends WeeklyAdPrintPage>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f18711a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f18712b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f18713c;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends WeeklyAdPrintPage>> continuation) {
                return invoke2(interfaceC16622O, (Continuation<? super List<WeeklyAdPrintPage>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0318a(a aVar, int i10, Continuation<? super C0318a> continuation) {
                super(2, continuation);
                this.f18712b = aVar;
                this.f18713c = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C0318a(this.f18712b, this.f18713c, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<WeeklyAdPrintPage>> continuation) {
                return ((C0318a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objF = IntrinsicsKt.f();
                int i10 = this.f18711a;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                Ks.b bVar = this.f18712b.flippWeeklyAdDataSource;
                int i11 = this.f18713c;
                this.f18711a = 1;
                Object objD = bVar.d(i11, this);
                if (objD == objF) {
                    return objF;
                }
                return objD;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LJs/b;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.weeklyad.services.api.calls.GetFlippWeeklyAdPrintInfoCall$call$2$products$1", f = "GetFlippWeeklyAdPrintInfoCall.kt", l = {37}, m = "invokeSuspend")
        /* renamed from: Ls.a$b$b, reason: collision with other inner class name */
        static final class C0319b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends WeeklyAdItem>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            Object f18714a;

            /* renamed from: b, reason: collision with root package name */
            int f18715b;

            /* renamed from: c, reason: collision with root package name */
            int f18716c;

            /* renamed from: d, reason: collision with root package name */
            private /* synthetic */ Object f18717d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f18718e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f18719f;

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends WeeklyAdItem>> continuation) {
                return invoke2(interfaceC16622O, (Continuation<? super List<WeeklyAdItem>>) continuation);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0319b(a aVar, int i10, Continuation<? super C0319b> continuation) {
                super(2, continuation);
                this.f18718e = aVar;
                this.f18719f = i10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C0319b c0319b = new C0319b(this.f18718e, this.f18719f, continuation);
                c0319b.f18717d = obj;
                return c0319b;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<WeeklyAdItem>> continuation) {
                return ((C0319b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objB;
                Object objF = IntrinsicsKt.f();
                int i10 = this.f18716c;
                try {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f18717d;
                        a aVar = this.f18718e;
                        int i11 = this.f18719f;
                        Result.Companion companion = Result.INSTANCE;
                        Ks.b bVar = aVar.flippWeeklyAdDataSource;
                        this.f18717d = interfaceC16622O;
                        this.f18714a = interfaceC16622O;
                        this.f18715b = 0;
                        this.f18716c = 1;
                        obj = bVar.f(i11, this);
                        if (obj == objF) {
                            return objF;
                        }
                    }
                    objB = Result.b((List) obj);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objB = Result.b(ResultKt.a(th2));
                }
                Throwable thE = Result.e(objB);
                if (thE != null) {
                    try {
                        if (thE instanceof RetrofitException) {
                            throw RetrofitException.INSTANCE.e(d.f159054c, thE);
                        }
                        throw thE;
                    } catch (Throwable th3) {
                        Result.Companion companion3 = Result.INSTANCE;
                        objB = Result.b(ResultKt.a(th3));
                    }
                }
                ResultKt.b(objB);
                return objB;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f18710h = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = a.this.new b(this.f18710h, continuation);
            bVar.f18708f = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super WeeklyAdPrintInfo> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00c1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 202
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Ls.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Ks.b flippWeeklyAdDataSource, AbstractC16618K ioDispatcher) {
        Intrinsics.j(flippWeeklyAdDataSource, "flippWeeklyAdDataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.flippWeeklyAdDataSource = flippWeeklyAdDataSource;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WeeklyAdPrintInfo d(List<WeeklyAdPrintPage> pages, List<WeeklyAdItem> weeklyAdItems) {
        List<WeeklyAdItem> list = weeklyAdItems;
        if (list == null || list.isEmpty()) {
            throw RetrofitException.Companion.f(RetrofitException.INSTANCE, d.f159054c, null, 2, null);
        }
        return new WeeklyAdPrintInfo(pages, CollectionsKt.m1(list));
    }

    public final Object c(int i10, Continuation<? super WeeklyAdPrintInfo> continuation) {
        return C16644i.g(this.ioDispatcher, new b(i10, null), continuation);
    }
}
