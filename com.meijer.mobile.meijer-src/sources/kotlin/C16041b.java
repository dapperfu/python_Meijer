package kotlin;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lo0/b;", "Lo0/C;", "", "currentPage", "", "currentPageOffsetFraction", "Lkotlin/Function0;", "updatedPageCount", "<init>", "(IFLkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/l0;", "L", "Landroidx/compose/runtime/l0;", "q0", "()Landroidx/compose/runtime/l0;", "setPageCountState", "(Landroidx/compose/runtime/l0;)V", "pageCountState", "H", "()I", "pageCount", "M", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C16041b extends AbstractC16037C {

    /* renamed from: M, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: N, reason: collision with root package name */
    private static final L0.k<C16041b, ?> f153402N = L0.a.a(a.f153404f, C2371b.f153405f);

    /* renamed from: L, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5872l0<Function0<Integer>> pageCountState;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Lo0/b;", "a", "(Ljava/util/List;)Lo0/b;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.b$b, reason: collision with other inner class name */
    static final class C2371b extends Lambda implements Function1<List, C16041b> {

        /* renamed from: f, reason: collision with root package name */
        public static final C2371b f153405f = new C2371b();

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: o0.b$b$a */
        static final class a extends Lambda implements Function0<Integer> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<Object> f153406f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<? extends Object> list) {
                super(0);
                this.f153406f = list;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Integer invoke() {
                Object obj = this.f153406f.get(2);
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
                return (Integer) obj;
            }
        }

        C2371b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C16041b invoke(List<? extends Object> list) {
            Object obj = list.get(0);
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Float");
            return new C16041b(iIntValue, ((Float) obj2).floatValue(), new a(list));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R!\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lo0/b$c;", "", "<init>", "()V", "LL0/k;", "Lo0/b;", "Saver", "LL0/k;", "a", "()LL0/k;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: o0.b$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final L0.k<C16041b, ?> a() {
            return C16041b.f153402N;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LL0/m;", "Lo0/b;", "it", "", "", "a", "(LL0/m;Lo0/b;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.b$a */
    static final class a extends Lambda implements Function2<L0.m, C16041b, List<? extends Object>> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f153404f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<Object> invoke(L0.m mVar, C16041b c16041b) {
            return CollectionsKt.p(Integer.valueOf(c16041b.v()), Float.valueOf(RangesKt.n(c16041b.w(), -0.5f, 0.5f)), Integer.valueOf(c16041b.H()));
        }
    }

    @Override // kotlin.AbstractC16037C
    public int H() {
        return this.pageCountState.getValue().invoke().intValue();
    }

    public final InterfaceC5872l0<Function0<Integer>> q0() {
        return this.pageCountState;
    }

    public C16041b(int i10, float f10, Function0<Integer> function0) {
        super(i10, f10);
        this.pageCountState = t1.e(function0, null, 2, null);
    }
}
