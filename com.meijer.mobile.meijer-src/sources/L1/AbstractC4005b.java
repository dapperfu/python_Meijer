package L1;

import L1.k;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u00002\u00020\u0001B)\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"LL1/b;", "LL1/x;", "", "Lkotlin/Function1;", "LL1/B;", "", "tasks", "", "index", "<init>", "(Ljava/util/List;I)V", "state", "LO1/a;", "c", "(LL1/B;)LO1/a;", "LL1/k$b;", "anchor", "LH1/h;", "margin", "goneMargin", "a", "(LL1/k$b;FF)V", "Ljava/util/List;", "b", "I", "compose_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: L1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4005b implements x {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<Function1<B, Unit>> tasks;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int index;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LL1/B;", "state", "", "<anonymous>", "(LL1/B;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: L1.b$a */
    static final class a extends Lambda implements Function1<B, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ k.HorizontalAnchor f17825g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f17826h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f17827i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(k.HorizontalAnchor horizontalAnchor, float f10, float f11) {
            super(1);
            this.f17825g = horizontalAnchor;
            this.f17826h = f10;
            this.f17827i = f11;
        }

        public final void a(B state) {
            Intrinsics.j(state, "state");
            O1.a aVarC = AbstractC4005b.this.c(state);
            AbstractC4005b abstractC4005b = AbstractC4005b.this;
            k.HorizontalAnchor horizontalAnchor = this.f17825g;
            C4004a.f17809a.e()[abstractC4005b.index][horizontalAnchor.getIndex()].invoke(aVarC, horizontalAnchor.getId()).D(H1.h.l(this.f17826h)).F(H1.h.l(this.f17827i));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(B b10) {
            a(b10);
            return Unit.f143329a;
        }
    }

    public abstract O1.a c(B state);

    public AbstractC4005b(List<Function1<B, Unit>> tasks, int i10) {
        Intrinsics.j(tasks, "tasks");
        this.tasks = tasks;
        this.index = i10;
    }

    @Override // L1.x
    public final void a(k.HorizontalAnchor anchor, float margin, float goneMargin) {
        Intrinsics.j(anchor, "anchor");
        this.tasks.add(new a(anchor, margin, goneMargin));
    }
}
