package Dq;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15429A;
import l0.InterfaceC15439i;
import mv.C0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR+\u0010#\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u00158B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0017\"\u0004\b!\u0010\"R/\u0010+\u001a\u0004\u0018\u00010$2\b\u0010\u001e\u001a\u0004\u0018\u00010$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R/\u00100\u001a\u0004\u0018\u00010\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010&\u001a\u0004\b\u001d\u0010-\"\u0004\b.\u0010/R/\u00106\u001a\u0004\u0018\u0001012\b\u0010\u001e\u001a\u0004\u0018\u0001018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010&\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u00108R\u0016\u0010:\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010(R\u0013\u0010<\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b%\u0010;¨\u0006="}, d2 = {"LDq/i;", "", "Ll0/A;", "lazyListState", "Lkotlin/Function2;", "", "", "onDragEnd", "onDrag", "<init>", "(Ll0/A;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "LU0/f;", "offset", "sizeOfList", "m", "(JI)V", "l", "()V", "k", "j", "(J)V", "", "a", "()F", "Ll0/A;", "h", "()Ll0/A;", "b", "Lkotlin/jvm/functions/Function2;", "c", "<set-?>", "d", "Landroidx/compose/runtime/i0;", "o", "(F)V", "draggedDistance", "Ll0/i;", "e", "Landroidx/compose/runtime/l0;", "g", "()Ll0/i;", "p", "(Ll0/i;)V", "initiallyDraggedElement", "f", "()Ljava/lang/Integer;", "n", "(Ljava/lang/Integer;)V", "currentIndexOfDraggedItem", "Lmv/C0;", "i", "()Lmv/C0;", "setOverScrollJob", "(Lmv/C0;)V", "overScrollJob", "Lkotlin/Pair;", "()Lkotlin/Pair;", "initialOffsets", "currentElement", "()Ljava/lang/Float;", "elementDisplacement", "shoppinglist_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Dq.i, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C3125i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15429A lazyListState;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<Integer, Integer, Unit> onDragEnd;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function2<Integer, Integer, Unit> onDrag;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5866i0 draggedDistance;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 initiallyDraggedElement;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 currentIndexOfDraggedItem;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 overScrollJob;

    public final void l() {
        o(0.0f);
        n(null);
        p(null);
        C0 c0I = i();
        if (c0I != null) {
            C0.a.a(c0I, null, 1, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3125i(C15429A lazyListState, Function2<? super Integer, ? super Integer, Unit> onDragEnd, Function2<? super Integer, ? super Integer, Unit> onDrag) {
        Intrinsics.j(lazyListState, "lazyListState");
        Intrinsics.j(onDragEnd, "onDragEnd");
        Intrinsics.j(onDrag, "onDrag");
        this.lazyListState = lazyListState;
        this.onDragEnd = onDragEnd;
        this.onDrag = onDrag;
        this.draggedDistance = A0.a(0.0f);
        this.initiallyDraggedElement = t1.e(null, null, 2, null);
        this.currentIndexOfDraggedItem = t1.e(null, null, 2, null);
        this.overScrollJob = t1.e(null, null, 2, null);
    }

    private final float d() {
        return this.draggedDistance.b();
    }

    private final InterfaceC15439i g() {
        return (InterfaceC15439i) this.initiallyDraggedElement.getValue();
    }

    private final C0 i() {
        return (C0) this.overScrollJob.getValue();
    }

    private final void o(float f10) {
        this.draggedDistance.A(f10);
    }

    private final void p(InterfaceC15439i interfaceC15439i) {
        this.initiallyDraggedElement.setValue(interfaceC15439i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Integer c() {
        return (Integer) this.currentIndexOfDraggedItem.getValue();
    }

    /* renamed from: h, reason: from getter */
    public final C15429A getLazyListState() {
        return this.lazyListState;
    }

    public final void m(long offset, int sizeOfList) {
        Object next;
        int index;
        Iterator<T> it = this.lazyListState.x().h().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            InterfaceC15439i interfaceC15439i = (InterfaceC15439i) next;
            int offset2 = interfaceC15439i.getOffset();
            int offset3 = interfaceC15439i.getOffset() + interfaceC15439i.getSize();
            int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & offset));
            if (offset2 <= iIntBitsToFloat && iIntBitsToFloat <= offset3) {
                break;
            }
        }
        InterfaceC15439i interfaceC15439i2 = (InterfaceC15439i) next;
        if (interfaceC15439i2 == null || (index = interfaceC15439i2.getIndex()) < 0 || index >= sizeOfList) {
            return;
        }
        n(Integer.valueOf(interfaceC15439i2.getIndex()));
        p(interfaceC15439i2);
    }

    public final void n(Integer num) {
        this.currentIndexOfDraggedItem.setValue(num);
    }

    private final InterfaceC15439i b() {
        Integer numC = c();
        if (numC != null) {
            return C3124h.b(this.lazyListState, numC.intValue());
        }
        return null;
    }

    private final Pair<Integer, Integer> f() {
        InterfaceC15439i interfaceC15439iG = g();
        if (interfaceC15439iG != null) {
            return new Pair<>(Integer.valueOf(interfaceC15439iG.getOffset()), Integer.valueOf(C3124h.a(interfaceC15439iG)));
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003c A[PHI: r0
      0x003c: PHI (r0v12 java.lang.Float) = (r0v10 java.lang.Float), (r0v14 java.lang.Float) binds: [B:12:0x005c, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a() {
        /*
            r5 = this;
            l0.i r0 = r5.g()
            r1 = 0
            if (r0 == 0) goto L66
            int r2 = r0.getOffset()
            float r2 = (float) r2
            float r3 = r5.d()
            float r2 = r2 + r3
            int r0 = Dq.C3124h.a(r0)
            float r0 = (float) r0
            float r3 = r5.d()
            float r0 = r0 + r3
            float r3 = r5.d()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r4 = 0
            if (r3 <= 0) goto L3e
            l0.A r2 = r5.lazyListState
            l0.n r2 = r2.x()
            int r2 = r2.getViewportEndOffset()
            float r2 = (float) r2
            float r0 = r0 - r2
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            float r2 = r0.floatValue()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 <= 0) goto L5f
        L3c:
            r4 = r0
            goto L5f
        L3e:
            float r0 = r5.d()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L5f
            l0.A r0 = r5.lazyListState
            l0.n r0 = r0.x()
            int r0 = r0.getViewportStartOffset()
            float r0 = (float) r0
            float r2 = r2 - r0
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
            float r2 = r0.floatValue()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L5f
            goto L3c
        L5f:
            if (r4 == 0) goto L66
            float r0 = r4.floatValue()
            return r0
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Dq.C3125i.a():float");
    }

    public final Float e() {
        Number numberValueOf;
        Integer numC = c();
        if (numC != null) {
            if (C3124h.b(this.lazyListState, numC.intValue()) != null) {
                InterfaceC15439i interfaceC15439iG = g();
                if (interfaceC15439iG != null) {
                    numberValueOf = Integer.valueOf(interfaceC15439iG.getOffset());
                } else {
                    numberValueOf = Float.valueOf(0.0f);
                }
                return Float.valueOf((numberValueOf.floatValue() + d()) - r0.getOffset());
            }
            return null;
        }
        return null;
    }

    public final void j(long offset) {
        Object next;
        o(d() + Float.intBitsToFloat((int) (offset & 4294967295L)));
        Pair<Integer, Integer> pairF = f();
        if (pairF != null) {
            int iIntValue = pairF.a().intValue();
            int iIntValue2 = pairF.b().intValue();
            float fD = iIntValue + d();
            float fD2 = iIntValue2 + d();
            InterfaceC15439i interfaceC15439iB = b();
            if (interfaceC15439iB != null) {
                List<InterfaceC15439i> listH = this.lazyListState.x().h();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listH) {
                    InterfaceC15439i interfaceC15439i = (InterfaceC15439i) obj;
                    if (C3124h.a(interfaceC15439i) >= fD && interfaceC15439i.getOffset() <= fD2 && interfaceC15439iB.getIndex() != interfaceC15439i.getIndex()) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        InterfaceC15439i interfaceC15439i2 = (InterfaceC15439i) next;
                        if (fD - interfaceC15439iB.getOffset() > 0.0f) {
                            if (fD2 > C3124h.a(interfaceC15439i2)) {
                                break;
                            }
                        } else if (fD < interfaceC15439i2.getOffset()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                InterfaceC15439i interfaceC15439i3 = (InterfaceC15439i) next;
                if (interfaceC15439i3 != null) {
                    Integer numC = c();
                    if (numC != null) {
                        this.onDrag.invoke(Integer.valueOf(numC.intValue()), Integer.valueOf(interfaceC15439i3.getIndex()));
                    }
                    n(Integer.valueOf(interfaceC15439i3.getIndex()));
                }
            }
        }
    }

    public final void k() {
        InterfaceC15439i interfaceC15439iG;
        InterfaceC15439i interfaceC15439iB = b();
        if (interfaceC15439iB != null && (interfaceC15439iG = g()) != null) {
            this.onDragEnd.invoke(Integer.valueOf(interfaceC15439iG.getIndex()), Integer.valueOf(interfaceC15439iB.getIndex()));
        }
        l();
    }
}
