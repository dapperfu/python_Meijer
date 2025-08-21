package kotlin;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC14656B;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Li4/t;", "Li4/B;", "Li4/r;", "Li4/C;", "navigatorProvider", "<init>", "(Li4/C;)V", "Li4/h;", "entry", "Li4/w;", "navOptions", "Li4/B$a;", "navigatorExtras", "", "m", "(Li4/h;Li4/w;Li4/B$a;)V", "l", "()Li4/r;", "", "entries", "e", "(Ljava/util/List;Li4/w;Li4/B$a;)V", "c", "Li4/C;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@AbstractC14656B.b("navigation")
/* renamed from: i4.t, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14679t extends AbstractC14656B<C14677r> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14657C navigatorProvider;

    public C14679t(C14657C navigatorProvider) {
        Intrinsics.j(navigatorProvider, "navigatorProvider");
        this.navigatorProvider = navigatorProvider;
    }

    @Override // kotlin.AbstractC14656B
    public void e(List<C14667h> entries, C14682w navOptions, AbstractC14656B.a navigatorExtras) {
        Intrinsics.j(entries, "entries");
        Iterator<C14667h> it = entries.iterator();
        while (it.hasNext()) {
            m(it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // kotlin.AbstractC14656B
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public C14677r a() {
        return new C14677r(this);
    }

    private final void m(C14667h entry, C14682w navOptions, AbstractC14656B.a navigatorExtras) {
        C14675p c14675pL;
        C14675p destination = entry.getDestination();
        Intrinsics.h(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        C14677r c14677r = (C14677r) destination;
        Bundle bundleC = entry.c();
        int startDestId = c14677r.getStartDestId();
        String startDestinationRoute = c14677r.getStartDestinationRoute();
        if (startDestId == 0 && startDestinationRoute == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + c14677r.q()).toString());
        }
        if (startDestinationRoute != null) {
            c14675pL = c14677r.N(startDestinationRoute, false);
        } else {
            c14675pL = c14677r.L(startDestId, false);
        }
        if (c14675pL != null) {
            this.navigatorProvider.e(c14675pL.getNavigatorName()).e(CollectionsKt.e(b().a(c14675pL, c14675pL.n(bundleC))), navOptions, navigatorExtras);
            return;
        }
        throw new IllegalArgumentException("navigation destination " + c14677r.Q() + " is not a direct child of this NavGraph");
    }
}
