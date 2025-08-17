package androidx.view;

import androidx.view.AbstractC6023l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p.C16181a;
import p.C16182b;
import tv.InterfaceC17140B;
import tv.S;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0002%\"B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010&R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R&\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t04j\b\u0012\u0004\u0012\u00020\t`58\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00106R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\t088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u0010<R$\u0010@\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b%\u0010>\"\u0004\b?\u0010\r¨\u0006A"}, d2 = {"Landroidx/lifecycle/u;", "Landroidx/lifecycle/l;", "Landroidx/lifecycle/s;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/s;Z)V", "(Landroidx/lifecycle/s;)V", "Landroidx/lifecycle/l$b;", "next", "", "k", "(Landroidx/lifecycle/l$b;)V", "Landroidx/lifecycle/r;", "observer", "f", "(Landroidx/lifecycle/r;)Landroidx/lifecycle/l$b;", "l", "()V", "state", "m", "lifecycleOwner", "h", "e", "o", "", "methodName", "g", "(Ljava/lang/String;)V", "Landroidx/lifecycle/l$a;", "event", "i", "(Landroidx/lifecycle/l$a;)V", "a", "(Landroidx/lifecycle/r;)V", "d", "b", "Z", "Lp/a;", "Landroidx/lifecycle/u$b;", "c", "Lp/a;", "observerMap", "Landroidx/lifecycle/l$b;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "Ltv/B;", "j", "Ltv/B;", "_currentStateFlow", "()Z", "isSynced", "()Landroidx/lifecycle/l$b;", "n", "currentState", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.lifecycle.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C6032u extends AbstractC6023l {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean enforceMainThread;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private C16181a<InterfaceC6029r, b> observerMap;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private AbstractC6023l.b state;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<InterfaceC6030s> lifecycleOwner;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int addingObserverCounter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean handlingEvent;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean newEventOccurred;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ArrayList<AbstractC6023l.b> parentStates;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<AbstractC6023l.b> _currentStateFlow;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/u$a;", "", "<init>", "()V", "Landroidx/lifecycle/l$b;", "state1", "state2", "a", "(Landroidx/lifecycle/l$b;Landroidx/lifecycle/l$b;)Landroidx/lifecycle/l$b;", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.u$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AbstractC6023l.b a(AbstractC6023l.b state1, AbstractC6023l.b state2) {
            Intrinsics.j(state1, "state1");
            return (state2 == null || state2.compareTo(state1) >= 0) ? state1 : state2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/u$b;", "", "Landroidx/lifecycle/r;", "observer", "Landroidx/lifecycle/l$b;", "initialState", "<init>", "(Landroidx/lifecycle/r;Landroidx/lifecycle/l$b;)V", "Landroidx/lifecycle/s;", "owner", "Landroidx/lifecycle/l$a;", "event", "", "a", "(Landroidx/lifecycle/s;Landroidx/lifecycle/l$a;)V", "Landroidx/lifecycle/l$b;", "b", "()Landroidx/lifecycle/l$b;", "setState", "(Landroidx/lifecycle/l$b;)V", "state", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/p;", "getLifecycleObserver", "()Landroidx/lifecycle/p;", "setLifecycleObserver", "(Landroidx/lifecycle/p;)V", "lifecycleObserver", "lifecycle-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.u$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private AbstractC6023l.b state;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private InterfaceC6027p lifecycleObserver;

        public b(InterfaceC6029r interfaceC6029r, AbstractC6023l.b initialState) {
            Intrinsics.j(initialState, "initialState");
            Intrinsics.g(interfaceC6029r);
            this.lifecycleObserver = C6037z.f(interfaceC6029r);
            this.state = initialState;
        }

        public final void a(InterfaceC6030s owner, AbstractC6023l.a event) {
            Intrinsics.j(event, "event");
            AbstractC6023l.b bVarE = event.e();
            this.state = C6032u.INSTANCE.a(this.state, bVarE);
            InterfaceC6027p interfaceC6027p = this.lifecycleObserver;
            Intrinsics.g(owner);
            interfaceC6027p.onStateChanged(owner, event);
            this.state = bVarE;
        }

        /* renamed from: b, reason: from getter */
        public final AbstractC6023l.b getState() {
            return this.state;
        }
    }

    private C6032u(InterfaceC6030s interfaceC6030s, boolean z10) {
        this.enforceMainThread = z10;
        this.observerMap = new C16181a<>();
        AbstractC6023l.b bVar = AbstractC6023l.b.f55276b;
        this.state = bVar;
        this.parentStates = new ArrayList<>();
        this.lifecycleOwner = new WeakReference<>(interfaceC6030s);
        this._currentStateFlow = S.a(bVar);
    }

    private final void e(InterfaceC6030s lifecycleOwner) {
        Iterator<Map.Entry<InterfaceC6029r, b>> itDescendingIterator = this.observerMap.descendingIterator();
        Intrinsics.i(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.newEventOccurred) {
            Map.Entry<InterfaceC6029r, b> next = itDescendingIterator.next();
            Intrinsics.g(next);
            InterfaceC6029r key = next.getKey();
            b value = next.getValue();
            while (value.getState().compareTo(this.state) > 0 && !this.newEventOccurred && this.observerMap.contains(key)) {
                AbstractC6023l.a aVarA = AbstractC6023l.a.INSTANCE.a(value.getState());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + value.getState());
                }
                m(aVarA.e());
                value.a(lifecycleOwner, aVarA);
                l();
            }
        }
    }

    private final AbstractC6023l.b f(InterfaceC6029r observer) {
        b value;
        Map.Entry<InterfaceC6029r, b> entryN = this.observerMap.n(observer);
        AbstractC6023l.b bVar = null;
        AbstractC6023l.b state = (entryN == null || (value = entryN.getValue()) == null) ? null : value.getState();
        if (!this.parentStates.isEmpty()) {
            bVar = this.parentStates.get(r0.size() - 1);
        }
        Companion companion = INSTANCE;
        return companion.a(companion.a(this.state, state), bVar);
    }

    private final void g(String methodName) {
        if (!this.enforceMainThread || C6035x.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + methodName + " must be called on the main thread").toString());
    }

    private final void h(InterfaceC6030s lifecycleOwner) {
        C16182b<InterfaceC6029r, b>.d dVarF = this.observerMap.f();
        Intrinsics.i(dVarF, "iteratorWithAdditions(...)");
        while (dVarF.hasNext() && !this.newEventOccurred) {
            Map.Entry next = dVarF.next();
            InterfaceC6029r interfaceC6029r = (InterfaceC6029r) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.getState().compareTo(this.state) < 0 && !this.newEventOccurred && this.observerMap.contains(interfaceC6029r)) {
                m(bVar.getState());
                AbstractC6023l.a aVarB = AbstractC6023l.a.INSTANCE.b(bVar.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.getState());
                }
                bVar.a(lifecycleOwner, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.observerMap.size() == 0) {
            return true;
        }
        Map.Entry<InterfaceC6029r, b> entryA = this.observerMap.a();
        Intrinsics.g(entryA);
        AbstractC6023l.b state = entryA.getValue().getState();
        Map.Entry<InterfaceC6029r, b> entryH = this.observerMap.h();
        Intrinsics.g(entryH);
        AbstractC6023l.b state2 = entryH.getValue().getState();
        return state == state2 && this.state == state2;
    }

    private final void k(AbstractC6023l.b next) {
        if (this.state == next) {
            return;
        }
        C6033v.a(this.lifecycleOwner.get(), this.state, next);
        this.state = next;
        if (this.handlingEvent || this.addingObserverCounter != 0) {
            this.newEventOccurred = true;
            return;
        }
        this.handlingEvent = true;
        o();
        this.handlingEvent = false;
        if (this.state == AbstractC6023l.b.f55275a) {
            this.observerMap = new C16181a<>();
        }
    }

    private final void l() {
        this.parentStates.remove(r0.size() - 1);
    }

    private final void m(AbstractC6023l.b state) {
        this.parentStates.add(state);
    }

    private final void o() {
        InterfaceC6030s interfaceC6030s = this.lifecycleOwner.get();
        if (interfaceC6030s == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.newEventOccurred = false;
            AbstractC6023l.b bVar = this.state;
            Map.Entry<InterfaceC6029r, b> entryA = this.observerMap.a();
            Intrinsics.g(entryA);
            if (bVar.compareTo(entryA.getValue().getState()) < 0) {
                e(interfaceC6030s);
            }
            Map.Entry<InterfaceC6029r, b> entryH = this.observerMap.h();
            if (!this.newEventOccurred && entryH != null && this.state.compareTo(entryH.getValue().getState()) > 0) {
                h(interfaceC6030s);
            }
        }
        this.newEventOccurred = false;
        this._currentStateFlow.setValue(getState());
    }

    @Override // androidx.view.AbstractC6023l
    public void a(InterfaceC6029r observer) {
        InterfaceC6030s interfaceC6030s;
        Intrinsics.j(observer, "observer");
        g("addObserver");
        AbstractC6023l.b bVar = this.state;
        AbstractC6023l.b bVar2 = AbstractC6023l.b.f55275a;
        if (bVar != bVar2) {
            bVar2 = AbstractC6023l.b.f55276b;
        }
        b bVar3 = new b(observer, bVar2);
        if (this.observerMap.l(observer, bVar3) == null && (interfaceC6030s = this.lifecycleOwner.get()) != null) {
            boolean z10 = this.addingObserverCounter != 0 || this.handlingEvent;
            AbstractC6023l.b bVarF = f(observer);
            this.addingObserverCounter++;
            while (bVar3.getState().compareTo(bVarF) < 0 && this.observerMap.contains(observer)) {
                m(bVar3.getState());
                AbstractC6023l.a aVarB = AbstractC6023l.a.INSTANCE.b(bVar3.getState());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.getState());
                }
                bVar3.a(interfaceC6030s, aVarB);
                l();
                bVarF = f(observer);
            }
            if (!z10) {
                o();
            }
            this.addingObserverCounter--;
        }
    }

    @Override // androidx.view.AbstractC6023l
    /* renamed from: b, reason: from getter */
    public AbstractC6023l.b getState() {
        return this.state;
    }

    @Override // androidx.view.AbstractC6023l
    public void d(InterfaceC6029r observer) {
        Intrinsics.j(observer, "observer");
        g("removeObserver");
        this.observerMap.m(observer);
    }

    public void i(AbstractC6023l.a event) {
        Intrinsics.j(event, "event");
        g("handleLifecycleEvent");
        k(event.e());
    }

    public void n(AbstractC6023l.b state) {
        Intrinsics.j(state, "state");
        g("setCurrentState");
        k(state);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6032u(InterfaceC6030s provider) {
        this(provider, true);
        Intrinsics.j(provider, "provider");
    }
}
