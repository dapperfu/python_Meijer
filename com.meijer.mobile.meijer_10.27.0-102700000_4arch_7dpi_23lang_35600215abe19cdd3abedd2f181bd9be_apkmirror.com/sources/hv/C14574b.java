package hv;

import Pu.c;
import io.reactivex.l;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t0\u0006\"\b\b\u0000\u0010\u0004*\u00020\u0001\"\b\b\u0001\u0010\u0005*\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhv/b;", "", "<init>", "()V", "T1", "T2", "Lio/reactivex/l;", "source1", "source2", "Lkotlin/Pair;", "a", "(Lio/reactivex/l;Lio/reactivex/l;)Lio/reactivex/l;", "rxkotlin"}, k = 1, mv = {1, 4, 0})
/* renamed from: hv.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C14574b {

    /* renamed from: a, reason: collision with root package name */
    public static final C14574b f136404a = new C14574b();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "T1", "T2", "t1", "t2", "Lkotlin/Pair;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;"}, k = 3, mv = {1, 4, 0})
    /* renamed from: hv.b$a */
    static final class a<T1, T2, R> implements c<T1, T2, Pair<? extends T1, ? extends T2>> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f136405a = new a();

        a() {
        }

        @Override // Pu.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<T1, T2> apply(T1 t12, T2 t22) {
            return TuplesKt.a(t12, t22);
        }
    }

    public final <T1, T2> l<Pair<T1, T2>> a(l<T1> source1, l<T2> source2) {
        l<Pair<T1, T2>> lVarCombineLatest = l.combineLatest(source1, source2, a.f136405a);
        Intrinsics.f(lVarCombineLatest, "Observable.combineLatest…> { t1, t2 -> t1 to t2 })");
        return lVarCombineLatest;
    }

    private C14574b() {
    }
}
