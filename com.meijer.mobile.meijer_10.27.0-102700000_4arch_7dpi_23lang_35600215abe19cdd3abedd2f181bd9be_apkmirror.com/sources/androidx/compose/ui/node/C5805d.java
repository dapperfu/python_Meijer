package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006*\u0001\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006\" \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"Landroidx/compose/ui/node/c;", "", "e", "(Landroidx/compose/ui/node/c;)Z", "androidx/compose/ui/node/d$a", "a", "Landroidx/compose/ui/node/d$a;", "DetachedModifierLocalReadScope", "Lkotlin/Function1;", "", "b", "Lkotlin/jvm/functions/Function1;", "onDrawCacheReadsChanged", "c", "updateModifierLocalConsumer", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.node.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5805d {

    /* renamed from: a, reason: collision with root package name */
    private static final a f51504a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Function1<C5803c, Unit> f51505b = b.f51507f;

    /* renamed from: c, reason: collision with root package name */
    private static final Function1<C5803c, Unit> f51506c = c.f51508f;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/c;", "it", "", "a", "(Landroidx/compose/ui/node/c;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.d$b */
    static final class b extends Lambda implements Function1<C5803c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f51507f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5803c c5803c) {
            a(c5803c);
            return Unit.f142422a;
        }

        public final void a(C5803c c5803c) {
            c5803c.O2();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/c;", "it", "", "a", "(Landroidx/compose/ui/node/c;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.node.d$c */
    static final class c extends Lambda implements Function1<C5803c, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f51508f = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C5803c c5803c) {
            a(c5803c);
            return Unit.f142422a;
        }

        public final void a(C5803c c5803c) {
            c5803c.S2();
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R$\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"androidx/compose/ui/node/d$a", "Lk1/k;", "T", "Lk1/c;", "q", "(Lk1/c;)Ljava/lang/Object;", "current", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.node.d$a */
    public static final class a implements k1.k {
        a() {
        }

        @Override // k1.k
        public <T> T q(k1.c<T> cVar) {
            return cVar.a().invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(C5803c c5803c) {
        Modifier.c tail = C5815k.o(c5803c).getNodes().getTail();
        Intrinsics.h(tail, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return ((x0) tail).getAttachHasBeenRun();
    }
}
