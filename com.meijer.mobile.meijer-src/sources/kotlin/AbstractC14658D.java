package kotlin;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\bR\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001aR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR*\u0010*\u001a\u00020\u00112\u0006\u0010$\u001a\u00020\u00118G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'\"\u0004\b(\u0010)R#\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u001d0+8\u0006¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b\u001e\u0010-R#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040!0+8\u0006¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b\"\u0010-¨\u00060"}, d2 = {"Li4/D;", "", "<init>", "()V", "Li4/h;", "backStackEntry", "", "i", "(Li4/h;)V", "j", "Li4/p;", "destination", "Landroid/os/Bundle;", "arguments", "a", "(Li4/p;Landroid/os/Bundle;)Li4/h;", "popUpTo", "", "saveState", "g", "(Li4/h;Z)V", "h", "f", "entry", "e", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "backStackLock", "Lpv/B;", "", "b", "Lpv/B;", "_backStack", "", "c", "_transitionsInProgress", "<set-?>", "d", "Z", "()Z", "k", "(Z)V", "isNavigating", "Lpv/P;", "Lpv/P;", "()Lpv/P;", "backStack", "transitionsInProgress", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.D, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC14658D {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock backStackLock = new ReentrantLock(true);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<List<C14667h>> _backStack;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<Set<C14667h>> _transitionsInProgress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isNavigating;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final P<List<C14667h>> backStack;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final P<Set<C14667h>> transitionsInProgress;

    public abstract C14667h a(C14675p destination, Bundle arguments);

    public final P<List<C14667h>> b() {
        return this.backStack;
    }

    public final P<Set<C14667h>> c() {
        return this.transitionsInProgress;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsNavigating() {
        return this.isNavigating;
    }

    public void e(C14667h entry) {
        Intrinsics.j(entry, "entry");
        InterfaceC16549B<Set<C14667h>> interfaceC16549B = this._transitionsInProgress;
        interfaceC16549B.setValue(SetsKt.k(interfaceC16549B.getValue(), entry));
    }

    public void f(C14667h backStackEntry) {
        int iNextIndex;
        Intrinsics.j(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            List<C14667h> listM1 = CollectionsKt.m1(this.backStack.getValue());
            ListIterator<C14667h> listIterator = listM1.listIterator(listM1.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    iNextIndex = -1;
                    break;
                } else if (Intrinsics.e(listIterator.previous().getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), backStackEntry.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String())) {
                    iNextIndex = listIterator.nextIndex();
                    break;
                }
            }
            listM1.set(iNextIndex, backStackEntry);
            this._backStack.setValue(listM1);
            Unit unit = Unit.f143329a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void g(C14667h popUpTo, boolean saveState) {
        Intrinsics.j(popUpTo, "popUpTo");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            InterfaceC16549B<List<C14667h>> interfaceC16549B = this._backStack;
            List<C14667h> value = interfaceC16549B.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj : value) {
                if (Intrinsics.e((C14667h) obj, popUpTo)) {
                    break;
                } else {
                    arrayList.add(obj);
                }
            }
            interfaceC16549B.setValue(arrayList);
            Unit unit = Unit.f143329a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public void h(C14667h popUpTo, boolean saveState) {
        C14667h c14667hPrevious;
        Intrinsics.j(popUpTo, "popUpTo");
        Set<C14667h> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C14667h) it.next()) == popUpTo) {
                    List<C14667h> value2 = this.backStack.getValue();
                    if ((value2 instanceof Collection) && value2.isEmpty()) {
                        return;
                    }
                    Iterator<T> it2 = value2.iterator();
                    while (it2.hasNext()) {
                        if (((C14667h) it2.next()) == popUpTo) {
                        }
                    }
                    return;
                }
            }
        }
        InterfaceC16549B<Set<C14667h>> interfaceC16549B = this._transitionsInProgress;
        interfaceC16549B.setValue(SetsKt.m(interfaceC16549B.getValue(), popUpTo));
        List<C14667h> value3 = this.backStack.getValue();
        ListIterator<C14667h> listIterator = value3.listIterator(value3.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                c14667hPrevious = null;
                break;
            }
            c14667hPrevious = listIterator.previous();
            C14667h c14667h = c14667hPrevious;
            if (!Intrinsics.e(c14667h, popUpTo) && this.backStack.getValue().lastIndexOf(c14667h) < this.backStack.getValue().lastIndexOf(popUpTo)) {
                break;
            }
        }
        C14667h c14667h2 = c14667hPrevious;
        if (c14667h2 != null) {
            InterfaceC16549B<Set<C14667h>> interfaceC16549B2 = this._transitionsInProgress;
            interfaceC16549B2.setValue(SetsKt.m(interfaceC16549B2.getValue(), c14667h2));
        }
        g(popUpTo, saveState);
    }

    public void i(C14667h backStackEntry) {
        Intrinsics.j(backStackEntry, "backStackEntry");
        ReentrantLock reentrantLock = this.backStackLock;
        reentrantLock.lock();
        try {
            InterfaceC16549B<List<C14667h>> interfaceC16549B = this._backStack;
            interfaceC16549B.setValue(CollectionsKt.Q0(interfaceC16549B.getValue(), backStackEntry));
            Unit unit = Unit.f143329a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void j(C14667h backStackEntry) {
        Intrinsics.j(backStackEntry, "backStackEntry");
        Set<C14667h> value = this._transitionsInProgress.getValue();
        if (!(value instanceof Collection) || !value.isEmpty()) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((C14667h) it.next()) == backStackEntry) {
                    List<C14667h> value2 = this.backStack.getValue();
                    if (!(value2 instanceof Collection) || !value2.isEmpty()) {
                        Iterator<T> it2 = value2.iterator();
                        while (it2.hasNext()) {
                            if (((C14667h) it2.next()) == backStackEntry) {
                                return;
                            }
                        }
                    }
                }
            }
        }
        C14667h c14667h = (C14667h) CollectionsKt.F0(this.backStack.getValue());
        if (c14667h != null) {
            InterfaceC16549B<Set<C14667h>> interfaceC16549B = this._transitionsInProgress;
            interfaceC16549B.setValue(SetsKt.m(interfaceC16549B.getValue(), c14667h));
        }
        InterfaceC16549B<Set<C14667h>> interfaceC16549B2 = this._transitionsInProgress;
        interfaceC16549B2.setValue(SetsKt.m(interfaceC16549B2.getValue(), backStackEntry));
        i(backStackEntry);
    }

    public final void k(boolean z10) {
        this.isNavigating = z10;
    }

    public AbstractC14658D() {
        InterfaceC16549B<List<C14667h>> interfaceC16549BA = S.a(CollectionsKt.m());
        this._backStack = interfaceC16549BA;
        InterfaceC16549B<Set<C14667h>> interfaceC16549BA2 = S.a(SetsKt.e());
        this._transitionsInProgress = interfaceC16549BA2;
        this.backStack = C16563h.c(interfaceC16549BA);
        this.transitionsInProgress = C16563h.c(interfaceC16549BA2);
    }
}
