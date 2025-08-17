package Oj;

import Oj.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.S;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"LOj/c;", "", "", "LOj/a;", "initialStates", "<init>", "(Ljava/util/List;)V", "()V", "state", "", "b", "(LOj/a;)V", "Ltv/B;", "a", "Ltv/B;", "loadingStatesStore", "Ltv/f;", "()Ltv/f;", "loadingStatesStream", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<List<Oj.a>> loadingStatesStore;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LOj/a;", "states", "", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.core.design.util.loadingstate.LoadingStateManager$loadingStatesStream$1", f = "LoadingStateManager.kt", l = {}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<List<? extends Oj.a>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f23980a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23981b;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(continuation);
            aVar.f23981b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(List<? extends Oj.a> list, Continuation<? super Unit> continuation) {
            return ((a) create(list, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f23980a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.q(CollectionsKt.B0((List) this.f23981b, "\n", null, null, 0, null, null, 62, null), new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public c(List<? extends Oj.a> initialStates) {
        Intrinsics.j(initialStates, "initialStates");
        this.loadingStatesStore = S.a(initialStates);
    }

    public final InterfaceC17152f<List<Oj.a>> a() {
        return C17154h.O(C17154h.c(this.loadingStatesStore), new a(null));
    }

    public final void b(Oj.a state) {
        List<Oj.a> value;
        ArrayList arrayList;
        Intrinsics.j(state, "state");
        InterfaceC17140B<List<Oj.a>> interfaceC17140B = this.loadingStatesStore;
        do {
            value = interfaceC17140B.getValue();
            List<Oj.a> list = value;
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(list, 10)), 16));
            for (Object obj : list) {
                linkedHashMap.put(((Oj.a) obj).getKey(), obj);
            }
            Collection collectionValues = MapsKt.v(linkedHashMap, TuplesKt.a(state.getKey(), state)).values();
            arrayList = new ArrayList();
            for (Object obj2 : collectionValues) {
                if (!(((Oj.a) obj2) instanceof a.NotLoading)) {
                    arrayList.add(obj2);
                }
            }
        } while (!interfaceC17140B.e(value, CollectionsKt.j1(arrayList)));
    }

    public c() {
        this(CollectionsKt.m());
    }
}
