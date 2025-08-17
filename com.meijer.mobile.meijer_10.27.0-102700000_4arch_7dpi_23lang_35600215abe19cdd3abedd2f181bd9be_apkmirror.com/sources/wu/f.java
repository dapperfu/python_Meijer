package wu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import ru.InterfaceC16834a;
import uu.C17331b;
import zu.InterfaceC18577a;

/* loaded from: classes11.dex */
public final class f implements InterfaceC16834a, ru.e {

    /* renamed from: a, reason: collision with root package name */
    private final Set<InterfaceC18577a> f166580a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private boolean f166581b = false;

    public void a() {
        C17331b.a();
        this.f166581b = true;
        Iterator<InterfaceC18577a> it = this.f166580a.iterator();
        while (it.hasNext()) {
            it.next().onCleared();
        }
    }
}
