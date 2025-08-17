package L1;

import L1.r;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.runtime.N0;
import androidx.compose.ui.layout.I;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\"\u0010%\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010(\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+¨\u0006-"}, d2 = {"LL1/r;", "LL1/q;", "Landroidx/compose/runtime/N0;", "LL1/n;", "scope", "<init>", "(LL1/n;)V", "LL1/B;", "state", "", "Landroidx/compose/ui/layout/I;", "measurables", "", "c", "(LL1/B;Ljava/util/List;)V", "", "a", "(Ljava/util/List;)Z", "b", "()V", "f", "e", "LL1/n;", "getScope", "()LL1/n;", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroidx/compose/runtime/snapshots/k;", "Landroidx/compose/runtime/snapshots/k;", "observer", "d", "Z", "getKnownDirty", "()Z", "i", "(Z)V", "knownDirty", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingConstrainLambdas", "", "LL1/m;", "Ljava/util/List;", "previousDatas", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
final class r implements q, N0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private Handler handler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.runtime.snapshots.k observer;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean knownDirty;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Function1<Unit, Unit> onCommitAffectingConstrainLambdas;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<m> previousDatas;

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class a extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<I> f17782f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ B f17783g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ r f17784h;

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f142422a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends I> list, B b10, r rVar) {
            super(0);
            this.f17782f = list;
            this.f17783g = b10;
            this.f17784h = rVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            List<I> list = this.f17782f;
            B b10 = this.f17783g;
            r rVar = this.f17784h;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                Object parentData = list.get(i10).getParentData();
                m mVar = parentData instanceof m ? (m) parentData : null;
                if (mVar != null) {
                    C4039g c4039g = new C4039g(mVar.getRef().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
                    mVar.a().invoke(c4039g);
                    c4039g.a(b10);
                }
                rVar.previousDatas.add(mVar);
                if (i11 > size) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Function0;"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class b extends Lambda implements Function1<Function0<? extends Unit>, Unit> {
        b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function0 tmp0) {
            Intrinsics.j(tmp0, "$tmp0");
            tmp0.invoke();
        }

        public final void c(final Function0<Unit> it) {
            Intrinsics.j(it, "it");
            if (Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
                it.invoke();
                return;
            }
            Handler handler = r.this.handler;
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
                r.this.handler = handler;
            }
            handler.post(new Runnable() { // from class: L1.s
                @Override // java.lang.Runnable
                public final void run() {
                    r.b.d(it);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            c(function0);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>"}, k = 3, mv = {1, 5, 1}, xi = 48)
    static final class c extends Lambda implements Function1<Unit, Unit> {
        c() {
            super(1);
        }

        public final void a(Unit noName_0) {
            Intrinsics.j(noName_0, "$noName_0");
            r.this.i(true);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
            a(unit);
            return Unit.f142422a;
        }
    }

    @Override // androidx.compose.runtime.N0
    public void e() {
    }

    public r(n scope) {
        Intrinsics.j(scope, "scope");
        this.scope = scope;
        this.observer = new androidx.compose.runtime.snapshots.k(new b());
        this.knownDirty = true;
        this.onCommitAffectingConstrainLambdas = new c();
        this.previousDatas = new ArrayList();
    }

    @Override // L1.q
    public boolean a(List<? extends I> measurables) {
        Intrinsics.j(measurables, "measurables");
        if (this.knownDirty || measurables.size() != this.previousDatas.size()) {
            return true;
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                Object parentData = measurables.get(i10).getParentData();
                if (!Intrinsics.e(parentData instanceof m ? (m) parentData : null, this.previousDatas.get(i10))) {
                    return true;
                }
                if (i11 > size) {
                    break;
                }
                i10 = i11;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.N0
    public void b() {
        this.observer.t();
    }

    @Override // L1.q
    public void c(B state, List<? extends I> measurables) {
        Intrinsics.j(state, "state");
        Intrinsics.j(measurables, "measurables");
        this.scope.a(state);
        this.previousDatas.clear();
        this.observer.p(Unit.f142422a, this.onCommitAffectingConstrainLambdas, new a(measurables, state, this));
        this.knownDirty = false;
    }

    @Override // androidx.compose.runtime.N0
    public void f() {
        this.observer.u();
        this.observer.k();
    }

    public final void i(boolean z10) {
        this.knownDirty = z10;
    }
}
