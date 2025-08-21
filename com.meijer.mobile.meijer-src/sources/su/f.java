package su;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import nu.InterfaceC16022a;
import qu.C16767b;
import vu.InterfaceC17737a;

/* loaded from: classes4.dex */
public final class f implements InterfaceC16022a, nu.e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC17737a> f162158a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private boolean f162159b = false;

    public void a() {
        C16767b.a();
        this.f162159b = true;
        Iterator<InterfaceC17737a> it = this.f162158a.iterator();
        while (it.hasNext()) {
            it.next().onCleared();
        }
    }
}
