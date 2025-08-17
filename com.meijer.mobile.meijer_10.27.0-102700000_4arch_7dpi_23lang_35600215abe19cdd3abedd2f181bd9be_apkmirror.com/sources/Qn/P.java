package Qn;

import Jd.C3775i;
import Jd.C3778l;
import Jd.InterfaceC3770d;
import Jd.InterfaceC3773g;
import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.meijer.mobile.meijer.service.GeoFenceTransitionsIntentService;
import gd.C14247f;
import ik.AddStoreGeoFencesEvent;
import ik.C14736b;
import ik.C14737c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import xk.C18064b;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u0001(B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000f2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\fH\u0002¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"LQn/P;", "", "Landroid/content/Context;", "context", "LCk/b;", "meijerBus", "Lyo/k;", "userManager", "Lgd/f;", "googleApiAvailability", "<init>", "(Landroid/content/Context;LCk/b;Lyo/k;Lgd/f;)V", "", "Lik/c;", "storesToFence", "", "i", "(Ljava/util/List;)V", "LJd/d;", "geofences", "p", "fencesToAdd", "LTd/j;", "Ljava/lang/Void;", "g", "(Ljava/util/List;)LTd/j;", "", "fencesToRemove", "o", "LJd/i;", "l", "(Ljava/util/List;)LJd/i;", "storeDetails", "k", "(Lik/c;)LJd/d;", "ids", "n", "", "m", "(Landroid/content/Context;)Z", "a", "Landroid/content/Context;", "b", "Lyo/k;", "c", "Lgd/f;", "LNu/a;", "d", "LNu/a;", "disposables", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class P {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f30938f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final long f30939g = TimeUnit.HOURS.toMillis(24);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14247f googleApiAvailability;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LQn/P$a;", "", "<init>", "()V", "", "storeID", "", "a", "(I)Ljava/lang/String;", "ENTER_STORE_RADIUS", "I", "", "GEOFENCE_EXPIRATION_IN_HOURS", "J", "GEOFENCE_EXPIRATION_TIME", "HOME_STORE_REQUEST_PREFIX", "Ljava/lang/String;", "REQUEST_ID_FORMAT", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qn.P$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a(int storeID) {
            String str = String.format("%s,%s", Arrays.copyOf(new Object[]{"homer", Integer.valueOf(storeID)}, 2));
            Intrinsics.i(str, "format(...)");
            return str;
        }
    }

    public P(Context context, Ck.b meijerBus, yo.k userManager, C14247f googleApiAvailability) {
        Intrinsics.j(context, "context");
        Intrinsics.j(meijerBus, "meijerBus");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(googleApiAvailability, "googleApiAvailability");
        this.context = context;
        this.userManager = userManager;
        this.googleApiAvailability = googleApiAvailability;
        Nu.a aVar = new Nu.a();
        this.disposables = aVar;
        Ck.a.a(meijerBus.b(AddStoreGeoFencesEvent.class, new Pu.g() { // from class: Qn.L
            @Override // Pu.g
            public final void accept(Object obj) {
                P.e(this.f30931a, (AddStoreGeoFencesEvent) obj);
            }
        }), aVar);
        Ck.a.a(meijerBus.b(C14736b.class, new Pu.g() { // from class: Qn.M
            @Override // Pu.g
            public final void accept(Object obj) {
                P.f(this.f30932a, (C14736b) obj);
            }
        }), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(P p10, AddStoreGeoFencesEvent event) {
        Intrinsics.j(event, "event");
        p10.i(event.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(P p10, C14736b c14736b) {
        p10.n(p10.userManager.o());
    }

    @SuppressLint({"MissingPermission"})
    private final AbstractC5232j<Void> g(final List<? extends InterfaceC3770d> fencesToAdd) {
        InterfaceC3773g interfaceC3773gC = C3778l.c(this.context);
        Intrinsics.i(interfaceC3773gC, "getGeofencingClient(...)");
        AbstractC5232j<Void> abstractC5232jC = interfaceC3773gC.k(l(fencesToAdd), PendingIntent.getService(this.context, 0, new Intent(this.context, (Class<?>) GeoFenceTransitionsIntentService.class), 201326592)).c(new InterfaceC5227e() { // from class: Qn.O
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j) {
                P.h(fencesToAdd, this, abstractC5232j);
            }
        });
        Intrinsics.i(abstractC5232jC, "addOnCompleteListener(...)");
        return abstractC5232jC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(List list, P p10, AbstractC5232j task) {
        Intrinsics.j(task, "task");
        if (task.r()) {
            uw.a.INSTANCE.a("%d GeoFences have been added", Integer.valueOf(list.size()));
            p10.p(list);
        }
    }

    private final void i(List<? extends C14737c> storesToFence) {
        if (m(this.context)) {
            List<? extends C14737c> list = storesToFence;
            final ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(k((C14737c) it.next()));
            }
            List<String> listO = this.userManager.o();
            List<String> list2 = listO;
            if (list2 == null || list2.isEmpty()) {
                g(arrayList);
            } else {
                Intrinsics.g(o(CollectionsKt.j1(listO)).c(new InterfaceC5227e() { // from class: Qn.N
                    @Override // Td.InterfaceC5227e
                    public final void onComplete(AbstractC5232j abstractC5232j) {
                        P.j(this.f30933a, arrayList, abstractC5232j);
                    }
                }));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(P p10, List list, AbstractC5232j task) {
        Intrinsics.j(task, "task");
        if (task.r()) {
            uw.a.INSTANCE.a("All geofences have been removed", new Object[0]);
        }
        p10.userManager.j();
        p10.g(list);
    }

    private final InterfaceC3770d k(C14737c storeDetails) {
        InterfaceC3770d interfaceC3770dA = new InterfaceC3770d.a().b(storeDetails.f138053a, storeDetails.f138054b, 150.0f).c(f30939g).d(INSTANCE.a(storeDetails.f138055c)).e(3).a();
        Intrinsics.i(interfaceC3770dA, "build(...)");
        return interfaceC3770dA;
    }

    private final C3775i l(List<? extends InterfaceC3770d> geofences) {
        C3775i c3775iC = new C3775i.a().d(1).b(geofences).c();
        Intrinsics.i(c3775iC, "build(...)");
        return c3775iC;
    }

    private final boolean m(Context context) {
        if (!C18064b.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            uw.a.INSTANCE.d("GeoFence: location permissions are denied", new Object[0]);
            return false;
        }
        if (this.googleApiAvailability.g(context) == 0) {
            return true;
        }
        uw.a.INSTANCE.d("GeoFence: Google play services is not available", new Object[0]);
        return false;
    }

    private final void n(List<String> ids) {
        List<String> list;
        if (!m(this.context) || (list = ids) == null || list.isEmpty()) {
            return;
        }
        o(CollectionsKt.j1(ids));
    }

    private final AbstractC5232j<Void> o(List<String> fencesToRemove) {
        InterfaceC3773g interfaceC3773gC = C3778l.c(this.context);
        Intrinsics.i(interfaceC3773gC, "getGeofencingClient(...)");
        AbstractC5232j<Void> abstractC5232jA = interfaceC3773gC.a(fencesToRemove);
        Intrinsics.i(abstractC5232jA, "removeGeofences(...)");
        return abstractC5232jA;
    }

    private final void p(List<? extends InterfaceC3770d> geofences) {
        List<? extends InterfaceC3770d> list = geofences;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC3770d) it.next()).w());
        }
        uw.a.INSTANCE.a("saving geofence id's", new Object[0]);
        this.userManager.S(arrayList);
    }
}
