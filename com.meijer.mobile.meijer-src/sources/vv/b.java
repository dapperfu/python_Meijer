package vv;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import mv.Z;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000e8F¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lvv/b;", "", "", "timeMillis", "<init>", "(J)V", "Lvv/k;", "select", "ignoredParam", "", "d", "(Lvv/k;Ljava/lang/Object;)V", "a", "J", "Lvv/e;", "c", "()Lvv/e;", "getSelectClause$annotations", "()V", "selectClause", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
final class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long timeMillis;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends FunctionReferenceImpl implements Function3<b, k<?>, Object, Unit> {

        /* renamed from: b, reason: collision with root package name */
        public static final a f166318b = new a();

        a() {
            super(3, b.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(b bVar, k<?> kVar, Object obj) {
            a(bVar, kVar, obj);
            return Unit.f143329a;
        }

        public final void a(b bVar, k<?> kVar, Object obj) {
            bVar.d(kVar, obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(final k<?> select, Object ignoredParam) {
        if (this.timeMillis <= 0) {
            select.d(Unit.f143329a);
            return;
        }
        Runnable runnable = new Runnable() { // from class: vv.a
            @Override // java.lang.Runnable
            public final void run() {
                b.e(select, this);
            }
        };
        Intrinsics.h(select, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        j jVar = (j) select;
        CoroutineContext context = jVar.getContext();
        jVar.n(Z.d(context).w(this.timeMillis, runnable, context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(k kVar, b bVar) {
        kVar.f(bVar, Unit.f143329a);
    }

    public final e c() {
        a aVar = a.f166318b;
        Intrinsics.h(aVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new f(this, (Function3) TypeIntrinsics.f(aVar, 3), null, 4, null);
    }

    public b(long j10) {
        this.timeMillis = j10;
    }
}
