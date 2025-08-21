package Rn;

import Ld.C4019i;
import Ld.C4022l;
import Ld.InterfaceC4014d;
import Ld.InterfaceC4017g;
import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.meijer.mobile.meijer.service.GeoFenceTransitionsIntentService;
import id.C14723f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import jk.AddStoreGeoFencesEvent;
import jk.C15046b;
import jk.C15047c;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import yk.C18326b;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u0001:\u0001(B+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0003¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00162\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\fH\u0002¢\u0006\u0004\b\u001c\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000f2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\fH\u0002¢\u0006\u0004\b$\u0010\u0011J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"LRn/P;", "", "Landroid/content/Context;", "context", "LDk/b;", "meijerBus", "Lyo/k;", "userManager", "Lid/f;", "googleApiAvailability", "<init>", "(Landroid/content/Context;LDk/b;Lyo/k;Lid/f;)V", "", "Ljk/c;", "storesToFence", "", "i", "(Ljava/util/List;)V", "LLd/d;", "geofences", "p", "fencesToAdd", "LVd/j;", "Ljava/lang/Void;", "g", "(Ljava/util/List;)LVd/j;", "", "fencesToRemove", "o", "LLd/i;", "l", "(Ljava/util/List;)LLd/i;", "storeDetails", "k", "(Ljk/c;)LLd/d;", "ids", "n", "", "m", "(Landroid/content/Context;)Z", "a", "Landroid/content/Context;", "b", "Lyo/k;", "c", "Lid/f;", "LJu/a;", "d", "LJu/a;", "disposables", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class P {

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: f, reason: collision with root package name */
    public static final int f33525f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final long f33526g = TimeUnit.HOURS.toMillis(24);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14723f googleApiAvailability;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LRn/P$a;", "", "<init>", "()V", "", "storeID", "", "a", "(I)Ljava/lang/String;", "ENTER_STORE_RADIUS", "I", "", "GEOFENCE_EXPIRATION_IN_HOURS", "J", "GEOFENCE_EXPIRATION_TIME", "HOME_STORE_REQUEST_PREFIX", "Ljava/lang/String;", "REQUEST_ID_FORMAT", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Rn.P$a, reason: from kotlin metadata */
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

    public P(Context context, Dk.b meijerBus, yo.k userManager, C14723f googleApiAvailability) {
        Intrinsics.j(context, "context");
        Intrinsics.j(meijerBus, "meijerBus");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(googleApiAvailability, "googleApiAvailability");
        this.context = context;
        this.userManager = userManager;
        this.googleApiAvailability = googleApiAvailability;
        Ju.a aVar = new Ju.a();
        this.disposables = aVar;
        Dk.a.a(meijerBus.b(AddStoreGeoFencesEvent.class, new Lu.g() { // from class: Rn.L
            @Override // Lu.g
            public final void accept(Object obj) {
                P.e(this.f33518a, (AddStoreGeoFencesEvent) obj);
            }
        }), aVar);
        Dk.a.a(meijerBus.b(C15046b.class, new Lu.g() { // from class: Rn.M
            @Override // Lu.g
            public final void accept(Object obj) {
                P.f(this.f33519a, (C15046b) obj);
            }
        }), aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(P p10, AddStoreGeoFencesEvent event) {
        Intrinsics.j(event, "event");
        p10.i(event.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(P p10, C15046b c15046b) {
        p10.n(p10.userManager.o());
    }

    @SuppressLint({"MissingPermission"})
    private final AbstractC5516j<Void> g(final List<? extends InterfaceC4014d> fencesToAdd) {
        InterfaceC4017g interfaceC4017gC = C4022l.c(this.context);
        Intrinsics.i(interfaceC4017gC, "getGeofencingClient(...)");
        AbstractC5516j<Void> abstractC5516jC = interfaceC4017gC.l(l(fencesToAdd), PendingIntent.getService(this.context, 0, new Intent(this.context, (Class<?>) GeoFenceTransitionsIntentService.class), 201326592)).c(new InterfaceC5511e() { // from class: Rn.O
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j) {
                P.h(fencesToAdd, this, abstractC5516j);
            }
        });
        Intrinsics.i(abstractC5516jC, "addOnCompleteListener(...)");
        return abstractC5516jC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(List list, P p10, AbstractC5516j task) {
        Intrinsics.j(task, "task");
        if (task.r()) {
            qw.a.INSTANCE.a("%d GeoFences have been added", Integer.valueOf(list.size()));
            p10.p(list);
        }
    }

    private final void i(List<? extends C15047c> storesToFence) {
        if (m(this.context)) {
            List<? extends C15047c> list = storesToFence;
            final ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(k((C15047c) it.next()));
            }
            List<String> listO = this.userManager.o();
            List<String> list2 = listO;
            if (list2 == null || list2.isEmpty()) {
                g(arrayList);
            } else {
                Intrinsics.g(o(CollectionsKt.j1(listO)).c(new InterfaceC5511e() { // from class: Rn.N
                    @Override // Vd.InterfaceC5511e
                    public final void onComplete(AbstractC5516j abstractC5516j) {
                        P.j(this.f33520a, arrayList, abstractC5516j);
                    }
                }));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(P p10, List list, AbstractC5516j task) {
        Intrinsics.j(task, "task");
        if (task.r()) {
            qw.a.INSTANCE.a("All geofences have been removed", new Object[0]);
        }
        p10.userManager.j();
        p10.g(list);
    }

    private final InterfaceC4014d k(C15047c storeDetails) {
        InterfaceC4014d interfaceC4014dA = new InterfaceC4014d.a().b(storeDetails.f140939a, storeDetails.f140940b, 150.0f).c(f33526g).d(INSTANCE.a(storeDetails.f140941c)).e(3).a();
        Intrinsics.i(interfaceC4014dA, "build(...)");
        return interfaceC4014dA;
    }

    private final C4019i l(List<? extends InterfaceC4014d> geofences) {
        C4019i c4019iC = new C4019i.a().d(1).b(geofences).c();
        Intrinsics.i(c4019iC, "build(...)");
        return c4019iC;
    }

    private final boolean m(Context context) {
        if (!C18326b.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            qw.a.INSTANCE.d("GeoFence: location permissions are denied", new Object[0]);
            return false;
        }
        if (this.googleApiAvailability.g(context) == 0) {
            return true;
        }
        qw.a.INSTANCE.d("GeoFence: Google play services is not available", new Object[0]);
        return false;
    }

    private final void n(List<String> ids) {
        List<String> list;
        if (!m(this.context) || (list = ids) == null || list.isEmpty()) {
            return;
        }
        o(CollectionsKt.j1(ids));
    }

    private final AbstractC5516j<Void> o(List<String> fencesToRemove) {
        InterfaceC4017g interfaceC4017gC = C4022l.c(this.context);
        Intrinsics.i(interfaceC4017gC, "getGeofencingClient(...)");
        AbstractC5516j<Void> abstractC5516jB = interfaceC4017gC.b(fencesToRemove);
        Intrinsics.i(abstractC5516jB, "removeGeofences(...)");
        return abstractC5516jB;
    }

    private final void p(List<? extends InterfaceC4014d> geofences) {
        List<? extends InterfaceC4014d> list = geofences;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC4014d) it.next()).w());
        }
        qw.a.INSTANCE.a("saving geofence id's", new Object[0]);
        this.userManager.S(arrayList);
    }
}
