package kotlin;

import d0.V;
import java.util.List;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lx0/d1;", "", "Ld0/V;", "scrollState", "Lmv/O;", "coroutineScope", "<init>", "(Ld0/V;Lmv/O;)V", "Lx0/B1;", "LH1/d;", "density", "", "edgeOffset", "", "tabPositions", "b", "(Lx0/B1;LH1/d;ILjava/util/List;)I", "selectedTab", "", "c", "(LH1/d;ILjava/util/List;I)V", "a", "Ld0/V;", "Lmv/O;", "Ljava/lang/Integer;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17996d1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final V scrollState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O coroutineScope;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Integer selectedTab;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", l = {452}, m = "invokeSuspend")
    /* renamed from: x0.d1$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f168887a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f168889c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f168889c = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17996d1.this.new a(this.f168889c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f168887a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                V v10 = C17996d1.this.scrollState;
                int i11 = this.f168889c;
                InterfaceC6452i<Float> interfaceC6452i = D1.f167903b;
                this.f168887a = 1;
                if (v10.k(i11, interfaceC6452i, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public final void c(H1.d density, int edgeOffset, List<TabPosition> tabPositions, int selectedTab) {
        int iB;
        Integer num = this.selectedTab;
        if (num != null && num.intValue() == selectedTab) {
            return;
        }
        this.selectedTab = Integer.valueOf(selectedTab);
        TabPosition tabPosition = (TabPosition) CollectionsKt.v0(tabPositions, selectedTab);
        if (tabPosition == null || this.scrollState.o() == (iB = b(tabPosition, density, edgeOffset, tabPositions))) {
            return;
        }
        C15809k.d(this.coroutineScope, null, null, new a(iB, null), 3, null);
    }

    public C17996d1(V v10, InterfaceC15783O interfaceC15783O) {
        this.scrollState = v10;
        this.coroutineScope = interfaceC15783O;
    }

    private final int b(TabPosition tabPosition, H1.d dVar, int i10, List<TabPosition> list) {
        int iE0 = dVar.E0(((TabPosition) CollectionsKt.D0(list)).b()) + i10;
        int iN = iE0 - this.scrollState.n();
        return RangesKt.o(dVar.E0(tabPosition.getLeft()) - ((iN / 2) - (dVar.E0(tabPosition.getWidth()) / 2)), 0, RangesKt.f(iE0 - iN, 0));
    }
}
