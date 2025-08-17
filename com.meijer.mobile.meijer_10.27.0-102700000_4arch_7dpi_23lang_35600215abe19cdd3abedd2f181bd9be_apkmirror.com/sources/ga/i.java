package ga;

import B9.ResponseModel;
import I9.e;
import Jd.C3775i;
import Jd.InterfaceC3769c;
import Jd.InterfaceC3770d;
import Jd.InterfaceC3773g;
import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import Td.InterfaceC5228f;
import Td.InterfaceC5229g;
import X9.Geofence;
import X9.Trigger;
import android.app.PendingIntent;
import android.location.Location;
import com.emarsys.core.api.MissingPermissionException;
import com.google.android.gms.location.LocationRequest;
import com.medallia.digital.mobilesdk.l8;
import fa.C13860a;
import ha.GeofenceResponse;
import ha.TriggeringEmarsysGeofence;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n9.C15784a;
import org.json.JSONException;
import org.json.JSONObject;
import ta.C17075a;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 *2\u00020\u0001:\u0001RB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0013¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0013¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0012¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0012¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u0015H\u0012¢\u0006\u0004\b.\u0010/J\u001d\u00103\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0012¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0012¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u001e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020800H\u0012¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u001e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020800H\u0012¢\u0006\u0004\b<\u0010;J%\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020800H\u0012¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u001e2\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>00H\u0012¢\u0006\u0004\bB\u0010;J)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020E0D002\u0006\u0010C\u001a\u000208H\u0012¢\u0006\u0004\bF\u0010GJ'\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>002\u0006\u0010H\u001a\u0002012\u0006\u0010I\u001a\u00020EH\u0012¢\u0006\u0004\bJ\u0010KJA\u0010P\u001a\u00020\u001e2\u0018\b\u0002\u0010N\u001a\u0012\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010M\u0018\u00010L2\u0016\b\u0002\u0010O\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020M\u0018\u00010LH\u0012¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bR\u0010$J\u0019\u0010S\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bS\u0010$J\u000f\u0010T\u001a\u00020\u0015H\u0016¢\u0006\u0004\bT\u0010UJ\u001d\u0010W\u001a\u00020\u001e2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\bW\u0010;J\u001d\u0010X\u001a\u00020\u001e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020800H\u0016¢\u0006\u0004\bX\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bR\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bX\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0011\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0013\u001a\u00020\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0018\u001a\u00020\u00178\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u001a\u001a\u00020\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b6\u0010jR\u0018\u0010q\u001a\u0004\u0018\u00010o8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bF\u0010pR\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002010r8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bJ\u0010sR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b3\u0010uR\u001b\u0010{\u001a\u00020w8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\bS\u0010x\u001a\u0004\by\u0010zR\u0016\u0010}\u001a\u00020\u00158\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bB\u0010|R\u0016\u0010\u007f\u001a\u00020\u00158\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b~\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020\u00158\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b?\u0010|¨\u0006\u0081\u0001"}, d2 = {"Lga/i;", "Lga/n;", "Lwa/c;", "requestModelFactory", "Lw9/b;", "requestManager", "Lga/p;", "geofenceResponseMapper", "Ln9/a;", "permissionChecker", "LJd/c;", "fusedLocationProviderClient", "Lga/m;", "geofenceFilter", "LJd/g;", "geofencingClient", "Lta/a;", "actionCommandFactory", "Lfa/a;", "geofenceCacheableEventHandler", "LF9/l;", "", "geofenceEnabledStorage", "Lga/o;", "geofencePendingIntentProvider", "Ll9/b;", "concurrentHandlerHolder", "initialEnterTriggerEnabledStorage", "<init>", "(Lwa/c;Lw9/b;Lga/p;Ln9/a;LJd/c;Lga/m;LJd/g;Lta/a;Lfa/a;LF9/l;Lga/o;Ll9/b;LF9/l;)V", "", "L", "()V", "LV8/a;", "completionListener", "C", "(LV8/a;)V", "LTd/j;", "Ljava/lang/Void;", "I", "()LTd/j;", "", "u", "()Ljava/lang/String;", "locationPermissionGranted", "backgroundLocationPermissionGranted", "y", "(ZZ)Ljava/lang/String;", "", "LX9/a;", "nearestGeofences", "p", "(Ljava/util/List;)LX9/a;", "", "m", "()I", "Lha/c;", "triggeringEmarsysGeofences", "x", "(Ljava/util/List;)V", "A", "triggeringGeofences", "Ljava/lang/Runnable;", "t", "(Ljava/util/List;)Ljava/util/List;", "actions", "r", "triggeringGeofence", "Lkotlin/Pair;", "LX9/c;", "n", "(Lha/c;)Ljava/util/List;", "geofence", "triggerType", "o", "(LX9/a;LX9/c;)Ljava/util/List;", "", "", "parameters", "statusMap", "J", "(Ljava/util/Map;Ljava/util/Map;)V", "a", "q", "isEnabled", "()Z", "geofences", "B", "b", "Lwa/c;", "Lw9/b;", "c", "Lga/p;", "d", "Ln9/a;", "e", "LJd/c;", "f", "Lga/m;", "g", "LJd/g;", "h", "Lta/a;", "i", "Lfa/a;", "j", "LF9/l;", "k", "Lga/o;", "l", "Ll9/b;", "Lha/b;", "Lha/b;", "geofenceResponse", "", "Ljava/util/List;", "Landroid/location/Location;", "Landroid/location/Location;", "currentLocation", "Landroid/app/PendingIntent;", "Lkotlin/Lazy;", "w", "()Landroid/app/PendingIntent;", "geofencePendingIntent", "Z", "initialEnterTriggerEnabled", "s", "initialDwellingTriggerEnabled", "initialExitTriggerEnabled", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class i implements n {

    /* renamed from: u, reason: collision with root package name */
    private static final a f133223u = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wa.c requestModelFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w9.b requestManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p geofenceResponseMapper;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C15784a permissionChecker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3769c fusedLocationProviderClient;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m geofenceFilter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3773g geofencingClient;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C17075a actionCommandFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C13860a geofenceCacheableEventHandler;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final F9.l<Boolean> geofenceEnabledStorage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final o geofencePendingIntentProvider;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final l9.b concurrentHandlerHolder;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final F9.l<Boolean> initialEnterTriggerEnabledStorage;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private GeofenceResponse geofenceResponse;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private List<Geofence> nearestGeofences;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private Location currentLocation;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Lazy geofencePendingIntent;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean initialEnterTriggerEnabled;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean initialDwellingTriggerEnabled;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean initialExitTriggerEnabled;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lga/i$a;", "", "<init>", "()V", "", "FASTEST_INTERNAL", "J", "INTERVAL", "MAX_WAIT_TIME", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ga/i$b", "LQ8/a;", "", PreferencesHelper.PREF_ID, "LB9/c;", "responseModel", "", "d", "(Ljava/lang/String;LB9/c;)V", "b", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements Q8.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ V8.a f133245b;

        @Override // Q8.a
        public void a(String id2, Exception cause) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(cause, "cause");
        }

        @Override // Q8.a
        public void b(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
        }

        b(V8.a aVar) {
            this.f133245b = aVar;
        }

        @Override // Q8.a
        public void d(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            i iVar = i.this;
            iVar.geofenceResponse = iVar.geofenceResponseMapper.a(responseModel);
            i.this.q(this.f133245b);
        }
    }

    private void L() {
    }

    public i(wa.c requestModelFactory, w9.b requestManager, p geofenceResponseMapper, C15784a permissionChecker, InterfaceC3769c fusedLocationProviderClient, m geofenceFilter, InterfaceC3773g geofencingClient, C17075a actionCommandFactory, C13860a geofenceCacheableEventHandler, F9.l<Boolean> geofenceEnabledStorage, o geofencePendingIntentProvider, l9.b concurrentHandlerHolder, F9.l<Boolean> initialEnterTriggerEnabledStorage) {
        Intrinsics.j(requestModelFactory, "requestModelFactory");
        Intrinsics.j(requestManager, "requestManager");
        Intrinsics.j(geofenceResponseMapper, "geofenceResponseMapper");
        Intrinsics.j(permissionChecker, "permissionChecker");
        Intrinsics.j(fusedLocationProviderClient, "fusedLocationProviderClient");
        Intrinsics.j(geofenceFilter, "geofenceFilter");
        Intrinsics.j(geofencingClient, "geofencingClient");
        Intrinsics.j(actionCommandFactory, "actionCommandFactory");
        Intrinsics.j(geofenceCacheableEventHandler, "geofenceCacheableEventHandler");
        Intrinsics.j(geofenceEnabledStorage, "geofenceEnabledStorage");
        Intrinsics.j(geofencePendingIntentProvider, "geofencePendingIntentProvider");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(initialEnterTriggerEnabledStorage, "initialEnterTriggerEnabledStorage");
        this.requestModelFactory = requestModelFactory;
        this.requestManager = requestManager;
        this.geofenceResponseMapper = geofenceResponseMapper;
        this.permissionChecker = permissionChecker;
        this.fusedLocationProviderClient = fusedLocationProviderClient;
        this.geofenceFilter = geofenceFilter;
        this.geofencingClient = geofencingClient;
        this.actionCommandFactory = actionCommandFactory;
        this.geofenceCacheableEventHandler = geofenceCacheableEventHandler;
        this.geofenceEnabledStorage = geofenceEnabledStorage;
        this.geofencePendingIntentProvider = geofencePendingIntentProvider;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.initialEnterTriggerEnabledStorage = initialEnterTriggerEnabledStorage;
        this.nearestGeofences = new ArrayList();
        this.geofencePendingIntent = LazyKt.b(new Function0() { // from class: ga.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.v(this.f133214a);
            }
        });
        Boolean bool = initialEnterTriggerEnabledStorage.get();
        this.initialEnterTriggerEnabled = bool != null ? bool.booleanValue() : false;
    }

    private void A(List<TriggeringEmarsysGeofence> triggeringEmarsysGeofences) {
        Object next;
        Iterator<T> it = triggeringEmarsysGeofences.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TriggeringEmarsysGeofence triggeringEmarsysGeofence = (TriggeringEmarsysGeofence) next;
            if (Intrinsics.e(triggeringEmarsysGeofence.getGeofenceId(), "refreshArea") && triggeringEmarsysGeofence.getTriggerType() == X9.c.f39178b) {
                break;
            }
        }
        if (((TriggeringEmarsysGeofence) next) == null || u() != null) {
            return;
        }
        C(null);
    }

    private void C(final V8.a completionListener) {
        if (!G9.a.f11285a.b()) {
            L();
        }
        AbstractC5232j<Void> abstractC5232jI = I();
        abstractC5232jI.c(new InterfaceC5227e() { // from class: ga.c
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j) {
                i.D(this.f133215a, completionListener, abstractC5232j);
            }
        });
        abstractC5232jI.e(new InterfaceC5228f() { // from class: ga.d
            @Override // Td.InterfaceC5228f
            public final void onFailure(Exception exc) {
                i.H(completionListener, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(final i iVar, final V8.a aVar, AbstractC5232j it) {
        Intrinsics.j(it, "it");
        AbstractC5232j<Location> abstractC5232jL = iVar.fusedLocationProviderClient.l();
        if (abstractC5232jL != null) {
            final Function1 function1 = new Function1() { // from class: ga.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.E(this.f133219a, aVar, (Location) obj);
                }
            };
            abstractC5232jL.g(new InterfaceC5229g() { // from class: ga.g
                @Override // Td.InterfaceC5229g
                public final void onSuccess(Object obj) {
                    i.F(function1, obj);
                }
            });
        }
        if (abstractC5232jL != null) {
            abstractC5232jL.e(new InterfaceC5228f() { // from class: ga.h
                @Override // Td.InterfaceC5228f
                public final void onFailure(Exception exc) {
                    i.G(aVar, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(i iVar, V8.a aVar, Location location) {
        iVar.currentLocation = location;
        if (location != null && iVar.geofenceResponse != null) {
            m mVar = iVar.geofenceFilter;
            Intrinsics.g(location);
            GeofenceResponse geofenceResponse = iVar.geofenceResponse;
            Intrinsics.g(geofenceResponse);
            List<Geofence> listM1 = CollectionsKt.m1(mVar.a(location, geofenceResponse));
            iVar.nearestGeofences = listM1;
            listM1.add(iVar.p(listM1));
            iVar.B(iVar.nearestGeofences);
        }
        if (aVar != null) {
            aVar.a(null);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(V8.a aVar, Exception it) {
        Intrinsics.j(it, "it");
        if (aVar != null) {
            aVar.a(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(V8.a aVar, Exception it) {
        Intrinsics.j(it, "it");
        if (aVar != null) {
            aVar.a(it);
        }
    }

    private AbstractC5232j<Void> I() {
        LocationRequest locationRequestA = new LocationRequest.a(100, 15000L).e(l8.b.f92525b).d(30000L).h(5.0f).c(2).k(true).a();
        Intrinsics.i(locationRequestA, "build(...)");
        AbstractC5232j<Void> abstractC5232jD = this.fusedLocationProviderClient.d(locationRequestA, w());
        Intrinsics.i(abstractC5232jD, "requestLocationUpdates(...)");
        return abstractC5232jD;
    }

    private void J(Map<String, ? extends Object> parameters, Map<String, ? extends Object> statusMap) {
        e.Companion companion = I9.e.INSTANCE;
        String strA = G9.o.a();
        Intrinsics.i(strA, "getCallerMethodName(...)");
        e.Companion.b(companion, new J9.k(i.class, strA, parameters, statusMap), false, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void K(i iVar, Map map, Map map2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendStatusLog");
        }
        if ((i10 & 1) != 0) {
            map = MapsKt.k();
        }
        if ((i10 & 2) != 0) {
            map2 = MapsKt.k();
        }
        iVar.J(map, map2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int m() {
        ?? r02 = this.initialEnterTriggerEnabled;
        int i10 = r02;
        if (this.initialDwellingTriggerEnabled) {
            i10 = r02 + 4;
        }
        return this.initialExitTriggerEnabled ? i10 + 2 : i10;
    }

    private List<Pair<Geofence, X9.c>> n(TriggeringEmarsysGeofence triggeringGeofence) {
        List<Geofence> list = this.nearestGeofences;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Geofence geofence = (Geofence) obj;
            if (Intrinsics.e(geofence.getId(), triggeringGeofence.getGeofenceId())) {
                List<Trigger> listE = geofence.e();
                if (!(listE instanceof Collection) || !listE.isEmpty()) {
                    Iterator<T> it = listE.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((Trigger) it.next()).b() == triggeringGeofence.getTriggerType()) {
                            arrayList.add(obj);
                            break;
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(new Pair((Geofence) it2.next(), triggeringGeofence.getTriggerType()));
        }
        return arrayList2;
    }

    private void r(List<? extends Runnable> actions) {
        for (final Runnable runnable : actions) {
            this.concurrentHandlerHolder.h(new Runnable() { // from class: ga.e
                @Override // java.lang.Runnable
                public final void run() {
                    i.s(runnable);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }

    private List<Runnable> t(List<TriggeringEmarsysGeofence> triggeringGeofences) {
        ArrayList<Pair> arrayList = new ArrayList();
        Iterator<T> it = triggeringGeofences.iterator();
        while (it.hasNext()) {
            CollectionsKt.C(arrayList, n((TriggeringEmarsysGeofence) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            CollectionsKt.C(arrayList2, o((Geofence) pair.c(), (X9.c) pair.d()));
        }
        return arrayList2;
    }

    private String u() {
        boolean z10 = this.permissionChecker.a("android.permission.ACCESS_FINE_LOCATION") == 0 || this.permissionChecker.a("android.permission.ACCESS_COARSE_LOCATION") == 0;
        boolean z11 = G9.a.f11285a.b() || this.permissionChecker.a("android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
        if (z10 && z11) {
            return null;
        }
        return y(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PendingIntent v(i iVar) {
        return iVar.geofencePendingIntentProvider.a();
    }

    private PendingIntent w() {
        return (PendingIntent) this.geofencePendingIntent.getValue();
    }

    private String y(boolean locationPermissionGranted, boolean backgroundLocationPermissionGranted) {
        return (locationPermissionGranted || !backgroundLocationPermissionGranted) ? (backgroundLocationPermissionGranted || !locationPermissionGranted) ? "ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION and ACCESS_BACKGROUND_LOCATION" : "ACCESS_BACKGROUND_LOCATION" : "ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION";
    }

    public void B(List<Geofence> geofences) {
        Intrinsics.j(geofences, "geofences");
        List<Geofence> list = geofences;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (Geofence geofence : list) {
            arrayList.add(new InterfaceC3770d.a().d(geofence.getId()).b(geofence.getLat(), geofence.getLon(), (float) geofence.getRadius()).c(-1L).e(3).a());
        }
        C3775i c3775iC = new C3775i.a().b(arrayList).d(m()).c();
        Intrinsics.i(c3775iC, "build(...)");
        this.geofencingClient.k(c3775iC, w());
        K(this, null, MapsKt.g(TuplesKt.a("registeredGeofences", Integer.valueOf(arrayList.size()))), 1, null);
    }

    @Override // ga.n
    public void a(V8.a completionListener) {
        if (this.geofenceEnabledStorage.get().booleanValue()) {
            try {
                this.requestManager.e(this.requestModelFactory.c(), new b(completionListener));
            } catch (IllegalArgumentException e10) {
                if (completionListener != null) {
                    completionListener.a(e10);
                }
            }
        }
    }

    @Override // ga.n
    public void b(final List<TriggeringEmarsysGeofence> triggeringEmarsysGeofences) {
        Intrinsics.j(triggeringEmarsysGeofences, "triggeringEmarsysGeofences");
        if (isEnabled()) {
            if (this.nearestGeofences.isEmpty()) {
                a(new V8.a() { // from class: ga.a
                    @Override // V8.a
                    public final void a(Throwable th2) {
                        i.z(this.f133212a, triggeringEmarsysGeofences, th2);
                    }
                });
            } else {
                x(triggeringEmarsysGeofences);
            }
        }
    }

    @Override // ga.n
    public boolean isEnabled() {
        Boolean bool = this.geofenceEnabledStorage.get();
        Intrinsics.i(bool, "get(...)");
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private List<Runnable> o(Geofence geofence, X9.c triggerType) throws JSONException {
        List<Trigger> listE = geofence.e();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listE) {
            if (((Trigger) obj).b() == triggerType) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Runnable runnableA = this.actionCommandFactory.a(((Trigger) it.next()).getAction());
            if (runnableA != null) {
                arrayList2.add(runnableA);
            }
        }
        return arrayList2;
    }

    private Geofence p(List<Geofence> nearestGeofences) {
        Geofence geofence = (Geofence) CollectionsKt.D0(nearestGeofences);
        Location location = this.currentLocation;
        Intrinsics.g(location);
        double latitude = location.getLatitude();
        Location location2 = this.currentLocation;
        Intrinsics.g(location2);
        Location.distanceBetween(latitude, location2.getLongitude(), geofence.getLat(), geofence.getLon(), new float[]{1.0f});
        double radius = r9[0] - geofence.getRadius();
        GeofenceResponse geofenceResponse = this.geofenceResponse;
        Intrinsics.g(geofenceResponse);
        double dAbs = Math.abs(radius * geofenceResponse.getRefreshRadiusRatio());
        Location location3 = this.currentLocation;
        Intrinsics.g(location3);
        double latitude2 = location3.getLatitude();
        Location location4 = this.currentLocation;
        Intrinsics.g(location4);
        return new Geofence("refreshArea", latitude2, location4.getLongitude(), dAbs, null, CollectionsKt.e(new Trigger("refreshAreaTriggerId", X9.c.f39178b, 0, new JSONObject())));
    }

    private void x(List<TriggeringEmarsysGeofence> triggeringEmarsysGeofences) {
        r(t(triggeringEmarsysGeofences));
        A(triggeringEmarsysGeofences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(i iVar, List list, Throwable th2) {
        iVar.x(list);
    }

    public void q(V8.a completionListener) {
        boolean z10;
        String strU = u();
        if (strU == null) {
            if (!this.geofenceEnabledStorage.get().booleanValue()) {
                F9.l<Boolean> lVar = this.geofenceEnabledStorage;
                Boolean bool = Boolean.TRUE;
                lVar.set(bool);
                if (completionListener != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                J(MapsKt.g(TuplesKt.a("completionListener", Boolean.valueOf(z10))), MapsKt.g(TuplesKt.a("geofenceEnabled", bool)));
                if (this.geofenceResponse == null) {
                    a(completionListener);
                    return;
                }
            }
            C(completionListener);
            return;
        }
        if (completionListener != null) {
            completionListener.a(new MissingPermissionException("Couldn't acquire permission for " + strU));
        }
    }
}
