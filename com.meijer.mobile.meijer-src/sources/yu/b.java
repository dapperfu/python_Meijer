package yu;

import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import java.util.Iterator;
import kotlin.C6414A;
import kotlin.InterfaceC6468y;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import l0.C15429A;
import l0.InterfaceC15439i;
import l0.n;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00126\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0004¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J-\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00102\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00100\u001b2\u0006\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 RD\u0010\u000b\u001a2\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010!R\u001a\u0010$\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b#\u0010\u000fR\u001d\u0010(\u001a\u0004\u0018\u00010\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000fR\u0014\u0010,\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u000fR\u0014\u0010.\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u000fR\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\b0/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lyu/b;", "Lyu/h;", "Ll0/A;", "lazyListState", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "layoutInfo", "Lyu/i;", "item", "", "snapOffsetForItem", "<init>", "(Ll0/A;Lkotlin/jvm/functions/Function2;)V", "j", "()I", "", "k", "()F", "index", "d", "(I)I", "", "b", "()Z", "a", "velocity", "Lc0/y;", "decayAnimationSpec", "maximumFlingDistance", "c", "(FLc0/y;F)I", "Ll0/A;", "Lkotlin/jvm/functions/Function2;", "I", "g", "startScrollOffset", "Landroidx/compose/runtime/z1;", "e", "()Lyu/i;", "currentItem", "l", "itemCount", "f", "endScrollOffset", "h", "totalItemsCount", "Lkotlin/sequences/Sequence;", "m", "()Lkotlin/sequences/Sequence;", "visibleItems", "lib_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15429A lazyListState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<h, SnapperLayoutItemInfo, Integer> snapOffsetForItem;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int startScrollOffset;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z1 currentItem;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lyu/i;", "c", "()Lyu/i;"}, k = 3, mv = {1, 6, 0})
    static final class a extends Lambda implements Function0<SnapperLayoutItemInfo> {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final SnapperLayoutItemInfo invoke() {
            Sequence<SnapperLayoutItemInfo> sequenceM = b.this.m();
            b bVar = b.this;
            SnapperLayoutItemInfo snapperLayoutItemInfo = null;
            for (SnapperLayoutItemInfo snapperLayoutItemInfo2 : sequenceM) {
                SnapperLayoutItemInfo snapperLayoutItemInfo3 = snapperLayoutItemInfo2;
                if (snapperLayoutItemInfo3.b() <= ((Number) bVar.snapOffsetForItem.invoke(bVar, snapperLayoutItemInfo3)).intValue()) {
                    snapperLayoutItemInfo = snapperLayoutItemInfo2;
                }
            }
            return snapperLayoutItemInfo;
        }
    }

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* renamed from: yu.b$b, reason: collision with other inner class name */
    /* synthetic */ class C2775b extends FunctionReferenceImpl implements Function1<InterfaceC15439i, c> {

        /* renamed from: b, reason: collision with root package name */
        public static final C2775b f172096b = new C2775b();

        C2775b() {
            super(1, c.class, "<init>", "<init>(Landroidx/compose/foundation/lazy/LazyListItemInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke(InterfaceC15439i p02) {
            Intrinsics.j(p02, "p0");
            return new c(p02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(C15429A lazyListState, Function2<? super h, ? super SnapperLayoutItemInfo, Integer> snapOffsetForItem) {
        Intrinsics.j(lazyListState, "lazyListState");
        Intrinsics.j(snapOffsetForItem, "snapOffsetForItem");
        this.lazyListState = lazyListState;
        this.snapOffsetForItem = snapOffsetForItem;
        this.currentItem = o1.e(new a());
    }

    private final int j() {
        n nVarX = this.lazyListState.x();
        if (nVarX.h().size() < 2) {
            return 0;
        }
        InterfaceC15439i interfaceC15439i = nVarX.h().get(0);
        return nVarX.h().get(1).getOffset() - (interfaceC15439i.getSize() + interfaceC15439i.getOffset());
    }

    private final float k() {
        Object next;
        n nVarX = this.lazyListState.x();
        if (nVarX.h().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it = nVarX.h().iterator();
        Object next2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int offset = ((InterfaceC15439i) next).getOffset();
                do {
                    Object next3 = it.next();
                    int offset2 = ((InterfaceC15439i) next3).getOffset();
                    if (offset > offset2) {
                        next = next3;
                        offset = offset2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        InterfaceC15439i interfaceC15439i = (InterfaceC15439i) next;
        if (interfaceC15439i == null) {
            return -1.0f;
        }
        Iterator<T> it2 = nVarX.h().iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                InterfaceC15439i interfaceC15439i2 = (InterfaceC15439i) next2;
                int offset3 = interfaceC15439i2.getOffset() + interfaceC15439i2.getSize();
                do {
                    Object next4 = it2.next();
                    InterfaceC15439i interfaceC15439i3 = (InterfaceC15439i) next4;
                    int offset4 = interfaceC15439i3.getOffset() + interfaceC15439i3.getSize();
                    if (offset3 < offset4) {
                        next2 = next4;
                        offset3 = offset4;
                    }
                } while (it2.hasNext());
            }
        }
        InterfaceC15439i interfaceC15439i4 = (InterfaceC15439i) next2;
        if (interfaceC15439i4 == null) {
            return -1.0f;
        }
        if (Math.max(interfaceC15439i.getOffset() + interfaceC15439i.getSize(), interfaceC15439i4.getOffset() + interfaceC15439i4.getSize()) - Math.min(interfaceC15439i.getOffset(), interfaceC15439i4.getOffset()) == 0) {
            return -1.0f;
        }
        return (r3 + j()) / nVarX.h().size();
    }

    private final int l() {
        return this.lazyListState.x().getTotalItemsCount();
    }

    @Override // yu.h
    public boolean a() {
        InterfaceC15439i interfaceC15439i = (InterfaceC15439i) CollectionsKt.F0(this.lazyListState.x().h());
        if (interfaceC15439i != null) {
            return interfaceC15439i.getIndex() < l() - 1 || interfaceC15439i.getOffset() + interfaceC15439i.getSize() > f();
        }
        return false;
    }

    @Override // yu.h
    public boolean b() {
        InterfaceC15439i interfaceC15439i = (InterfaceC15439i) CollectionsKt.u0(this.lazyListState.x().h());
        if (interfaceC15439i != null) {
            return interfaceC15439i.getIndex() > 0 || interfaceC15439i.getOffset() < getStartScrollOffset();
        }
        return false;
    }

    @Override // yu.h
    public int c(float velocity, InterfaceC6468y<Float> decayAnimationSpec, float maximumFlingDistance) {
        Intrinsics.j(decayAnimationSpec, "decayAnimationSpec");
        SnapperLayoutItemInfo snapperLayoutItemInfoE = e();
        if (snapperLayoutItemInfoE == null) {
            return -1;
        }
        float fK = k();
        if (fK <= 0.0f) {
            return snapperLayoutItemInfoE.a();
        }
        int iD = d(snapperLayoutItemInfoE.a());
        int iD2 = d(snapperLayoutItemInfoE.a() + 1);
        if (Math.abs(velocity) < 0.5f) {
            return RangesKt.o(Math.abs(iD) < Math.abs(iD2) ? snapperLayoutItemInfoE.a() : snapperLayoutItemInfoE.a() + 1, 0, l() - 1);
        }
        float fN = RangesKt.n(C6414A.a(decayAnimationSpec, 0.0f, velocity), -maximumFlingDistance, maximumFlingDistance);
        double d10 = fK;
        int iO = RangesKt.o(snapperLayoutItemInfoE.a() + MathKt.c(((velocity < 0.0f ? RangesKt.j(fN + iD2, 0.0f) : RangesKt.e(fN + iD, 0.0f)) / d10) - (iD / d10)), 0, l() - 1);
        j jVar = j.f172146a;
        return iO;
    }

    @Override // yu.h
    public SnapperLayoutItemInfo e() {
        return (SnapperLayoutItemInfo) this.currentItem.getValue();
    }

    @Override // yu.h
    public int f() {
        n nVarX = this.lazyListState.x();
        return nVarX.getViewportEndOffset() - nVarX.getAfterContentPadding();
    }

    @Override // yu.h
    /* renamed from: g, reason: from getter */
    public int getStartScrollOffset() {
        return this.startScrollOffset;
    }

    @Override // yu.h
    public int h() {
        return this.lazyListState.x().getTotalItemsCount();
    }

    public Sequence<SnapperLayoutItemInfo> m() {
        return SequencesKt.M(CollectionsKt.f0(this.lazyListState.x().h()), C2775b.f172096b);
    }

    @Override // yu.h
    public int d(int index) {
        SnapperLayoutItemInfo next;
        int iD;
        int iIntValue;
        Iterator<SnapperLayoutItemInfo> it = m().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next.a() == index) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        SnapperLayoutItemInfo snapperLayoutItemInfo = next;
        if (snapperLayoutItemInfo != null) {
            iD = snapperLayoutItemInfo.b();
            iIntValue = this.snapOffsetForItem.invoke(this, snapperLayoutItemInfo).intValue();
        } else {
            SnapperLayoutItemInfo snapperLayoutItemInfoE = e();
            if (snapperLayoutItemInfoE == null) {
                return 0;
            }
            iD = MathKt.d((index - snapperLayoutItemInfoE.a()) * k()) + snapperLayoutItemInfoE.b();
            iIntValue = this.snapOffsetForItem.invoke(this, snapperLayoutItemInfoE).intValue();
        }
        return iD - iIntValue;
    }
}
