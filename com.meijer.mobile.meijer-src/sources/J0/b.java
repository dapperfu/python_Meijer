package J0;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J6\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u001bJ@\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJJ\u0010 \u001a\u0004\u0018\u00010\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u001e\u0010-\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010,¨\u0006."}, d2 = {"LJ0/b;", "Landroidx/compose/runtime/internal/ComposableLambda;", "", "key", "", "tracked", "", "block", "<init>", "(IZLjava/lang/Object;)V", "", "g", "()V", "Landroidx/compose/runtime/Composer;", "composer", "f", "(Landroidx/compose/runtime/Composer;)V", "k", "(Ljava/lang/Object;)V", "c", "changed", "a", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p1", "b", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p3", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "p4", "e", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "I", "getKey", "()I", "Z", "Ljava/lang/Object;", "_block", "Landroidx/compose/runtime/H0;", "Landroidx/compose/runtime/H0;", "scope", "", "Ljava/util/List;", "scopes", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b implements ComposableLambda {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int key;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean tracked;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object _block;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private H0 scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private List<H0> scopes;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends AdaptedFunctionReference implements Function2<Composer, Integer, Unit> {
        a(Object obj) {
            super(2, obj, b.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        public final void a(Composer composer, int i10) {
            ((b) this.f143708a).a(composer, i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/Composer;", "nc", "", "<anonymous parameter 1>", "", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: J0.b$b, reason: collision with other inner class name */
    static final class C0249b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f15329g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f15330h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0249b(Object obj, int i10) {
            super(2);
            this.f15329g = obj;
            this.f15330h = i10;
        }

        public final void a(Composer composer, int i10) {
            b.this.b(this.f15329g, composer, J0.a(this.f15330h) | 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/Composer;", "nc", "", "<anonymous parameter 1>", "", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f15332g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f15333h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f15334i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, Object obj2, int i10) {
            super(2);
            this.f15332g = obj;
            this.f15333h = obj2;
            this.f15334i = i10;
        }

        public final void a(Composer composer, int i10) {
            b.this.c(this.f15332g, this.f15333h, composer, J0.a(this.f15334i) | 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/Composer;", "nc", "", "<anonymous parameter 1>", "", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f15336g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f15337h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f15338i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f15339j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Object obj, Object obj2, Object obj3, int i10) {
            super(2);
            this.f15336g = obj;
            this.f15337h = obj2;
            this.f15338i = obj3;
            this.f15339j = i10;
        }

        public final void a(Composer composer, int i10) {
            b.this.d(this.f15336g, this.f15337h, this.f15338i, composer, J0.a(this.f15339j) | 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/Composer;", "nc", "", "<anonymous parameter 1>", "", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Object f15341g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f15342h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f15343i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f15344j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f15345k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
            super(2);
            this.f15341g = obj;
            this.f15342h = obj2;
            this.f15343i = obj3;
            this.f15344j = obj4;
            this.f15345k = i10;
        }

        public final void a(Composer composer, int i10) {
            b.this.e(this.f15341g, this.f15342h, this.f15343i, this.f15344j, composer, J0.a(this.f15345k) | 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4, Composer composer, Integer num) {
        return e(obj, obj2, obj3, obj4, composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Composer composer, Integer num) {
        return a(composer, num.intValue());
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3, Composer composer, Integer num) {
        return d(obj, obj2, obj3, composer, num.intValue());
    }

    private final void f(Composer composer) {
        H0 h0Z;
        if (!this.tracked || (h0Z = composer.z()) == null) {
            return;
        }
        composer.O(h0Z);
        if (ComposableLambdaKt.d(this.scope, h0Z)) {
            this.scope = h0Z;
            return;
        }
        List<H0> list = this.scopes;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.scopes = arrayList;
            arrayList.add(h0Z);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (ComposableLambdaKt.d(list.get(i10), h0Z)) {
                list.set(i10, h0Z);
                return;
            }
        }
        list.add(h0Z);
    }

    private final void g() {
        if (this.tracked) {
            H0 h02 = this.scope;
            if (h02 != null) {
                h02.invalidate();
                this.scope = null;
            }
            List<H0> list = this.scopes;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object a(Composer c10, int changed) {
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        f(composerStartRestartGroup);
        int iB = changed | (composerStartRestartGroup.V(this) ? ComposableLambdaKt.b(0) : ComposableLambdaKt.e(0));
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function2) TypeIntrinsics.f(obj, 2)).invoke(composerStartRestartGroup, Integer.valueOf(iB));
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new a(this));
        }
        return objInvoke;
    }

    public Object b(Object p12, Composer c10, int changed) {
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        f(composerStartRestartGroup);
        int iB = composerStartRestartGroup.V(this) ? ComposableLambdaKt.b(1) : ComposableLambdaKt.e(1);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function3) TypeIntrinsics.f(obj, 3)).invoke(p12, composerStartRestartGroup, Integer.valueOf(iB | changed));
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new C0249b(p12, changed));
        }
        return objInvoke;
    }

    public Object c(Object p12, Object p22, Composer c10, int changed) {
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        f(composerStartRestartGroup);
        int iB = composerStartRestartGroup.V(this) ? ComposableLambdaKt.b(2) : ComposableLambdaKt.e(2);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function4) TypeIntrinsics.f(obj, 4)).invoke(p12, p22, composerStartRestartGroup, Integer.valueOf(iB | changed));
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new c(p12, p22, changed));
        }
        return objInvoke;
    }

    public Object d(Object p12, Object p22, Object p32, Composer c10, int changed) {
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        f(composerStartRestartGroup);
        int iB = composerStartRestartGroup.V(this) ? ComposableLambdaKt.b(3) : ComposableLambdaKt.e(3);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objM = ((Function5) TypeIntrinsics.f(obj, 5)).m(p12, p22, p32, composerStartRestartGroup, Integer.valueOf(iB | changed));
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new d(p12, p22, p32, changed));
        }
        return objM;
    }

    public Object e(Object p12, Object p22, Object p32, Object p42, Composer c10, int changed) {
        Composer composerStartRestartGroup = c10.startRestartGroup(this.key);
        f(composerStartRestartGroup);
        int iB = composerStartRestartGroup.V(this) ? ComposableLambdaKt.b(4) : ComposableLambdaKt.e(4);
        Object obj = this._block;
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objH = ((Function6) TypeIntrinsics.f(obj, 6)).h(p12, p22, p32, p42, composerStartRestartGroup, Integer.valueOf(iB | changed));
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new e(p12, p22, p32, p42, changed));
        }
        return objH;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Composer composer, Integer num) {
        return b(obj, composer, num.intValue());
    }

    public final void k(Object block) {
        if (Intrinsics.e(this._block, block)) {
            return;
        }
        boolean z10 = this._block == null;
        this._block = block;
        if (z10) {
            return;
        }
        g();
    }

    public b(int i10, boolean z10, Object obj) {
        this.key = i10;
        this.tracked = z10;
        this._block = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Composer composer, Integer num) {
        return c(obj, obj2, composer, num.intValue());
    }
}
