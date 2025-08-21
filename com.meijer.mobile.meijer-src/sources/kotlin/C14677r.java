package kotlin;

import Z.o0;
import Z.q0;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.C14675p;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0016\u0018\u0000 I2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001JB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b\"\u0010#J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00010$H\u0086\u0002¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u001a¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001aH\u0016¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u001e2\b\u00100\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0016H\u0016¢\u0006\u0004\b3\u00104R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0001058G¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0016\u0010'\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010\u0014R\u0018\u0010=\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R.\u0010A\u001a\u0004\u0018\u00010\u001a2\b\u0010*\u001a\u0004\u0018\u00010\u001a8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010<\u001a\u0004\b?\u0010.\"\u0004\b@\u0010,R$\u0010D\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u00168G@BX\u0086\u000e¢\u0006\f\u001a\u0004\bB\u00104\"\u0004\bC\u0010)R\u0014\u0010F\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010.R\u0011\u0010H\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bG\u0010.¨\u0006K"}, d2 = {"Li4/r;", "Li4/p;", "", "Li4/B;", "navGraphNavigator", "<init>", "(Li4/B;)V", "Li4/o;", "navDeepLinkRequest", "Li4/p$b;", "x", "(Li4/o;)Li4/p$b;", "request", "T", "node", "", "H", "(Li4/p;)V", "", "nodes", "I", "(Ljava/util/Collection;)V", "", "resId", "K", "(I)Li4/p;", "", PlaceTypes.ROUTE, "M", "(Ljava/lang/String;)Li4/p;", "", "searchParents", "L", "(IZ)Li4/p;", "N", "(Ljava/lang/String;Z)Li4/p;", "", "iterator", "()Ljava/util/Iterator;", "startDestId", "U", "(I)V", "startDestRoute", "V", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "LZ/o0;", "l", "LZ/o0;", "P", "()LZ/o0;", "m", "n", "Ljava/lang/String;", "startDestIdName", "o", "S", "X", "startDestinationRoute", "R", "W", "startDestinationId", "q", "displayName", "Q", "startDestDisplayName", "p", "a", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.r, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14677r extends C14675p implements Iterable<C14675p>, KMappedMarker {

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final o0<C14675p> nodes;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int startDestId;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String startDestIdName;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private String startDestinationRoute;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li4/r$a;", "", "<init>", "()V", "Li4/r;", "Li4/p;", "a", "(Li4/r;)Li4/p;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: i4.r$a, reason: from kotlin metadata */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Li4/p;", "it", "a", "(Li4/p;)Li4/p;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: i4.r$a$a, reason: collision with other inner class name */
        static final class C2166a extends Lambda implements Function1<C14675p, C14675p> {

            /* renamed from: f, reason: collision with root package name */
            public static final C2166a f137164f = new C2166a();

            C2166a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C14675p invoke(C14675p it) {
                Intrinsics.j(it, "it");
                if (!(it instanceof C14677r)) {
                    return null;
                }
                C14677r c14677r = (C14677r) it;
                return c14677r.K(c14677r.getStartDestId());
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final C14675p a(C14677r c14677r) {
            Intrinsics.j(c14677r, "<this>");
            return (C14675p) SequencesKt.L(SequencesKt.q(c14677r.K(c14677r.getStartDestId()), C2166a.f137164f));
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"i4/r$b", "", "Li4/p;", "", "hasNext", "()Z", "a", "()Li4/p;", "", "remove", "()V", "", "I", "index", "b", "Z", "wentToNext", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: i4.r$b */
    public static final class b implements Iterator<C14675p>, KMutableIterator {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private int index = -1;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean wentToNext;

        b() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index + 1 < C14677r.this.P().m();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.wentToNext) {
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
            o0<C14675p> o0VarP = C14677r.this.P();
            o0VarP.n(this.index).E(null);
            o0VarP.k(this.index);
            this.index--;
            this.wentToNext = false;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C14675p next() {
            if (hasNext()) {
                this.wentToNext = true;
                o0<C14675p> o0VarP = C14677r.this.P();
                int i10 = this.index + 1;
                this.index = i10;
                C14675p c14675pN = o0VarP.n(i10);
                Intrinsics.i(c14675pN, "nodes.valueAt(++index)");
                return c14675pN;
            }
            throw new NoSuchElementException();
        }
    }

    public final C14675p K(int resId) {
        return L(resId, true);
    }

    @Override // kotlin.C14675p
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof C14677r) && super.equals(other)) {
            C14677r c14677r = (C14677r) other;
            if (this.nodes.m() == c14677r.nodes.m() && getStartDestId() == c14677r.getStartDestId()) {
                for (C14675p c14675p : SequencesKt.h(q0.b(this.nodes))) {
                    if (!Intrinsics.e(c14675p, c14677r.nodes.e(c14675p.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14677r(AbstractC14656B<? extends C14677r> navGraphNavigator) {
        super(navGraphNavigator);
        Intrinsics.j(navGraphNavigator, "navGraphNavigator");
        this.nodes = new o0<>();
    }

    private final void X(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (Intrinsics.e(str, getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String())) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (StringsKt.s0(str)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            iHashCode = C14675p.INSTANCE.a(str).hashCode();
        }
        this.startDestId = iHashCode;
        this.startDestinationRoute = str;
    }

    public final void H(C14675p node) {
        Intrinsics.j(node, "node");
        int id2 = node.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
        String route = node.getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String();
        if (id2 == 0 && route == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if (getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String() != null && Intrinsics.e(route, getCom.google.android.libraries.places.api.model.PlaceTypes.ROUTE java.lang.String())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (id2 == getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        C14675p c14675pE = this.nodes.e(id2);
        if (c14675pE == node) {
            return;
        }
        if (node.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if (c14675pE != null) {
            c14675pE.E(null);
        }
        node.E(this);
        this.nodes.j(node.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), node);
    }

    public final void I(Collection<? extends C14675p> nodes) {
        Intrinsics.j(nodes, "nodes");
        for (C14675p c14675p : nodes) {
            if (c14675p != null) {
                H(c14675p);
            }
        }
    }

    public final C14675p L(int resId, boolean searchParents) {
        C14675p c14675pE = this.nodes.e(resId);
        if (c14675pE != null) {
            return c14675pE;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        C14677r parent = getParent();
        Intrinsics.g(parent);
        return parent.K(resId);
    }

    public final C14675p M(String route) {
        if (route == null || StringsKt.s0(route)) {
            return null;
        }
        return N(route, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    public final C14675p N(String route, boolean searchParents) {
        C14675p next;
        Intrinsics.j(route, "route");
        C14675p c14675pE = this.nodes.e(C14675p.INSTANCE.a(route).hashCode());
        if (c14675pE == null) {
            Iterator it = SequencesKt.h(q0.b(this.nodes)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = 0;
                    break;
                }
                next = it.next();
                if (((C14675p) next).y(route) != null) {
                    break;
                }
            }
            c14675pE = next;
        }
        if (c14675pE != null) {
            return c14675pE;
        }
        if (!searchParents || getParent() == null) {
            return null;
        }
        C14677r parent = getParent();
        Intrinsics.g(parent);
        return parent.M(route);
    }

    public final o0<C14675p> P() {
        return this.nodes;
    }

    public final String Q() {
        if (this.startDestIdName == null) {
            String strValueOf = this.startDestinationRoute;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.startDestId);
            }
            this.startDestIdName = strValueOf;
        }
        String str = this.startDestIdName;
        Intrinsics.g(str);
        return str;
    }

    /* renamed from: R, reason: from getter */
    public final int getStartDestId() {
        return this.startDestId;
    }

    /* renamed from: S, reason: from getter */
    public final String getStartDestinationRoute() {
        return this.startDestinationRoute;
    }

    public final C14675p.b T(C14674o request) {
        Intrinsics.j(request, "request");
        return super.x(request);
    }

    public final void V(String startDestRoute) {
        Intrinsics.j(startDestRoute, "startDestRoute");
        X(startDestRoute);
    }

    @Override // java.lang.Iterable
    public final Iterator<C14675p> iterator() {
        return new b();
    }

    @Override // kotlin.C14675p
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        C14675p c14675pM = M(this.startDestinationRoute);
        if (c14675pM == null) {
            c14675pM = K(getStartDestId());
        }
        sb2.append(" startDestination=");
        if (c14675pM == null) {
            String str = this.startDestinationRoute;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.startDestIdName;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.startDestId));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(c14675pM.toString());
            sb2.append("}");
        }
        String string = sb2.toString();
        Intrinsics.i(string, "sb.toString()");
        return string;
    }

    @Override // kotlin.C14675p
    public C14675p.b x(C14674o navDeepLinkRequest) {
        Intrinsics.j(navDeepLinkRequest, "navDeepLinkRequest");
        C14675p.b bVarX = super.x(navDeepLinkRequest);
        ArrayList arrayList = new ArrayList();
        Iterator<C14675p> it = iterator();
        while (it.hasNext()) {
            C14675p.b bVarX2 = it.next().x(navDeepLinkRequest);
            if (bVarX2 != null) {
                arrayList.add(bVarX2);
            }
        }
        return (C14675p.b) CollectionsKt.H0(CollectionsKt.r(bVarX, (C14675p.b) CollectionsKt.H0(arrayList)));
    }

    private final void W(int i10) {
        if (i10 != getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String()) {
            if (this.startDestinationRoute != null) {
                X(null);
            }
            this.startDestId = i10;
            this.startDestIdName = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    public final void U(int startDestId) {
        W(startDestId);
    }

    @Override // kotlin.C14675p
    public int hashCode() {
        int startDestId = getStartDestId();
        o0<C14675p> o0Var = this.nodes;
        int iM = o0Var.m();
        for (int i10 = 0; i10 < iM; i10++) {
            startDestId = (((startDestId * 31) + o0Var.i(i10)) * 31) + o0Var.n(i10).hashCode();
        }
        return startDestId;
    }

    @Override // kotlin.C14675p
    public String q() {
        if (getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String() != 0) {
            return super.q();
        }
        return "the root navigation";
    }
}
