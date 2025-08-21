package J0;

import Z.J;
import Z.W;
import Z.X;
import Z.j0;
import Z.k0;
import androidx.compose.runtime.I0;
import androidx.compose.runtime.InterfaceC5861g;
import androidx.compose.runtime.N0;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010 \u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\n¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\n¢\u0006\u0004\b*\u0010)J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010)R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010-R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010-R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010-R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u001e\u00104\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u00103R$\u00108\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u000206\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00107R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\r098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010:R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010=R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010=R*\u0010B\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010@8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"LJ0/h;", "Landroidx/compose/runtime/RememberManager;", "", "Landroidx/compose/runtime/N0;", "abandoning", "<init>", "(Ljava/util/Set;)V", "LD0/c;", "Landroidx/compose/runtime/O0;", "list", "", "i", "(LD0/c;)V", "", "instance", "", "endRelativeOrder", "priority", "endRelativeAfter", "m", "(Ljava/lang/Object;III)V", "l", "(I)V", "f", "(Landroidx/compose/runtime/O0;)V", "d", "(Landroidx/compose/runtime/O0;III)V", "Lkotlin/Function0;", "effect", "a", "(Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/runtime/g;", "g", "(Landroidx/compose/runtime/g;III)V", "b", "Landroidx/compose/runtime/I0;", "scope", "e", "(Landroidx/compose/runtime/I0;)V", "c", "j", "()V", "k", "h", "Ljava/util/Set;", "LD0/c;", "remembering", "currentRememberingList", "leaving", "sideEffects", "LZ/X;", "LZ/X;", "releasing", "LZ/W;", "LJ0/e;", "LZ/W;", "pausedPlaceholders", "", "Ljava/util/List;", "pending", "LZ/J;", "LZ/J;", "priorities", "afters", "Landroidx/compose/runtime/y1;", "Ljava/util/ArrayList;", "nestedRemembersLists", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class h implements RememberManager {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Set<N0> abandoning;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D0.c<O0> remembering;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private D0.c<O0> currentRememberingList;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final D0.c<Object> leaving;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final D0.c<Function0<Unit>> sideEffects;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private X<InterfaceC5861g> releasing;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private W<I0, e> pausedPlaceholders;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final List<Object> pending;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final J priorities;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final J afters;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private ArrayList nestedRemembersLists;

    private final void i(D0.c<O0> list) {
        O0[] o0Arr = list.content;
        int size = list.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            N0 wrapped = o0Arr[i10].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.b();
        }
    }

    private final void l(int endRelativeOrder) {
        if (this.pending.isEmpty()) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        List<? extends Object> listS = null;
        J j10 = null;
        J j11 = null;
        while (true) {
            J j12 = this.afters;
            if (i11 >= j12._size) {
                break;
            }
            if (endRelativeOrder <= j12.e(i11)) {
                Object objRemove = this.pending.remove(i11);
                int iO = this.afters.o(i11);
                int iO2 = this.priorities.o(i11);
                if (listS == null) {
                    listS = CollectionsKt.s(objRemove);
                    j11 = new J(0, 1, null);
                    j11.k(iO);
                    j10 = new J(0, 1, null);
                    j10.k(iO2);
                } else {
                    Intrinsics.h(j10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    Intrinsics.h(j11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    listS.add(objRemove);
                    j11.k(iO);
                    j10.k(iO2);
                }
            } else {
                i11++;
            }
        }
        if (listS != null) {
            Intrinsics.h(j10, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            Intrinsics.h(j11, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = listS.size() - 1;
            while (i10 < size) {
                int i12 = i10 + 1;
                int size2 = listS.size();
                for (int i13 = i12; i13 < size2; i13++) {
                    int iE = j11.e(i10);
                    int iE2 = j11.e(i13);
                    if (iE < iE2 || (iE2 == iE && j10.e(i10) < j10.e(i13))) {
                        i.d(listS, i10, i13);
                        i.c(j10, i10, i13);
                        i.c(j11, i10, i13);
                    }
                }
                i10 = i12;
            }
            D0.c<Object> cVar = this.leaving;
            cVar.g(cVar.getSize(), listS);
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void a(Function0<Unit> effect) {
        this.sideEffects.c(effect);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void b(InterfaceC5861g instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        X<InterfaceC5861g> xA = this.releasing;
        if (xA == null) {
            xA = k0.a();
            this.releasing = xA;
        }
        xA.x(instance);
        m(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void c(I0 scope) {
        D0.c<O0> cVar;
        W<I0, e> w10 = this.pausedPlaceholders;
        if (w10 == null || w10.e(scope) == null) {
            return;
        }
        ArrayList arrayList = this.nestedRemembersLists;
        if (arrayList != null && (cVar = (D0.c) y1.i(arrayList)) != null) {
            this.currentRememberingList = cVar;
        }
        w10.u(scope);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void e(I0 scope) {
        W<I0, e> w10 = this.pausedPlaceholders;
        e eVarE = w10 != null ? w10.e(scope) : null;
        if (eVarE != null) {
            ArrayList arrayListC = this.nestedRemembersLists;
            if (arrayListC == null) {
                arrayListC = y1.c(null, 1, null);
                this.nestedRemembersLists = arrayListC;
            }
            y1.j(arrayListC, this.currentRememberingList);
            this.currentRememberingList = eVarE.a();
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void f(O0 instance) {
        this.currentRememberingList.c(instance);
    }

    public final void h() {
        if (this.abandoning.isEmpty()) {
            return;
        }
        Object objA = o.f15377a.a("Compose:abandons");
        try {
            Iterator<N0> it = this.abandoning.iterator();
            while (it.hasNext()) {
                N0 next = it.next();
                it.remove();
                next.e();
            }
            Unit unit = Unit.f143329a;
            o.f15377a.b(objA);
        } catch (Throwable th2) {
            o.f15377a.b(objA);
            throw th2;
        }
    }

    public final void j() {
        Object objA;
        l(Integer.MIN_VALUE);
        if (this.leaving.getSize() != 0) {
            objA = o.f15377a.a("Compose:onForgotten");
            try {
                j0 j0Var = this.releasing;
                for (int size = this.leaving.getSize() - 1; -1 < size; size--) {
                    Object obj = this.leaving.content[size];
                    if (obj instanceof O0) {
                        N0 wrapped = ((O0) obj).getWrapped();
                        this.abandoning.remove(wrapped);
                        wrapped.f();
                    }
                    if (obj instanceof InterfaceC5861g) {
                        if (j0Var == null || !j0Var.a(obj)) {
                            ((InterfaceC5861g) obj).h();
                        } else {
                            ((InterfaceC5861g) obj).b();
                        }
                    }
                }
                Unit unit = Unit.f143329a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.remembering.getSize() != 0) {
            o oVar = o.f15377a;
            objA = oVar.a("Compose:onRemembered");
            try {
                i(this.remembering);
                Unit unit2 = Unit.f143329a;
                oVar.b(objA);
            } finally {
                o.f15377a.b(objA);
            }
        }
    }

    public final void k() {
        if (this.sideEffects.getSize() != 0) {
            Object objA = o.f15377a.a("Compose:sideeffects");
            try {
                D0.c<Function0<Unit>> cVar = this.sideEffects;
                Function0<Unit>[] function0Arr = cVar.content;
                int size = cVar.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    function0Arr[i10].invoke();
                }
                this.sideEffects.k();
                Unit unit = Unit.f143329a;
                o.f15377a.b(objA);
            } catch (Throwable th2) {
                o.f15377a.b(objA);
                throw th2;
            }
        }
    }

    public h(Set<N0> set) {
        this.abandoning = set;
        D0.c<O0> cVar = new D0.c<>(new O0[16], 0);
        this.remembering = cVar;
        this.currentRememberingList = cVar;
        this.leaving = new D0.c<>(new Object[16], 0);
        this.sideEffects = new D0.c<>(new Function0[16], 0);
        this.pending = new ArrayList();
        this.priorities = new J(0, 1, null);
        this.afters = new J(0, 1, null);
    }

    private final void m(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        l(endRelativeOrder);
        if (endRelativeAfter >= 0 && endRelativeAfter < endRelativeOrder) {
            this.pending.add(instance);
            this.priorities.k(priority);
            this.afters.k(endRelativeAfter);
            return;
        }
        this.leaving.c(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void d(O0 instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        m(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void g(InterfaceC5861g instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        m(instance, endRelativeOrder, priority, endRelativeAfter);
    }
}
