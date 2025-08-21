package ia;

import D9.ResponseModel;
import K9.e;
import Ld.C4019i;
import Ld.InterfaceC4013c;
import Ld.InterfaceC4014d;
import Ld.InterfaceC4017g;
import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import Vd.InterfaceC5512f;
import Vd.InterfaceC5513g;
import Z9.Geofence;
import Z9.Trigger;
import android.app.PendingIntent;
import android.location.Location;
import com.emarsys.core.api.MissingPermissionException;
import com.google.android.gms.location.LocationRequest;
import com.medallia.digital.mobilesdk.l8;
import ha.C14490a;
import io.constructor.data.local.PreferencesHelper;
import ja.GeofenceResponse;
import ja.TriggeringEmarsysGeofence;
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
import org.json.JSONException;
import org.json.JSONObject;
import p9.C16412a;
import va.C17650a;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 *2\u00020\u0001:\u0001RB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0013¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0013¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%H\u0012¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0012¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020)2\u0006\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u0015H\u0012¢\u0006\u0004\b.\u0010/J\u001d\u00103\u001a\u0002012\f\u00102\u001a\b\u0012\u0004\u0012\u00020100H\u0012¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0012¢\u0006\u0004\b6\u00107J\u001d\u0010:\u001a\u00020\u001e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020800H\u0012¢\u0006\u0004\b:\u0010;J\u001d\u0010<\u001a\u00020\u001e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020800H\u0012¢\u0006\u0004\b<\u0010;J%\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>002\f\u0010=\u001a\b\u0012\u0004\u0012\u00020800H\u0012¢\u0006\u0004\b?\u0010@J\u001f\u0010B\u001a\u00020\u001e2\u000e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>00H\u0012¢\u0006\u0004\bB\u0010;J)\u0010F\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020E0D002\u0006\u0010C\u001a\u000208H\u0012¢\u0006\u0004\bF\u0010GJ'\u0010J\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>002\u0006\u0010H\u001a\u0002012\u0006\u0010I\u001a\u00020EH\u0012¢\u0006\u0004\bJ\u0010KJA\u0010P\u001a\u00020\u001e2\u0018\b\u0002\u0010N\u001a\u0012\u0012\u0004\u0012\u00020)\u0012\u0006\u0012\u0004\u0018\u00010M\u0018\u00010L2\u0016\b\u0002\u0010O\u001a\u0010\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020M\u0018\u00010LH\u0012¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bR\u0010$J\u0019\u0010S\u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\bS\u0010$J\u000f\u0010T\u001a\u00020\u0015H\u0016¢\u0006\u0004\bT\u0010UJ\u001d\u0010W\u001a\u00020\u001e2\f\u0010V\u001a\b\u0012\u0004\u0012\u00020100H\u0016¢\u0006\u0004\bW\u0010;J\u001d\u0010X\u001a\u00020\u001e2\f\u00109\u001a\b\u0012\u0004\u0012\u00020800H\u0016¢\u0006\u0004\bX\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bR\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bX\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0011\u001a\u00020\u00108\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0013\u001a\u00020\u00128\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0018\u001a\u00020\u00178\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u001a\u001a\u00020\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00148\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b6\u0010jR\u0018\u0010q\u001a\u0004\u0018\u00010o8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bF\u0010pR\u001c\u00102\u001a\b\u0012\u0004\u0012\u0002010r8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bJ\u0010sR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b3\u0010uR\u001b\u0010{\u001a\u00020w8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\bS\u0010x\u001a\u0004\by\u0010zR\u0016\u0010}\u001a\u00020\u00158\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\bB\u0010|R\u0016\u0010\u007f\u001a\u00020\u00158\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b~\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020\u00158\u0012@\u0012X\u0092\u000e¢\u0006\u0006\n\u0004\b?\u0010|¨\u0006\u0081\u0001"}, d2 = {"Lia/i;", "Lia/n;", "Lya/c;", "requestModelFactory", "Ly9/b;", "requestManager", "Lia/p;", "geofenceResponseMapper", "Lp9/a;", "permissionChecker", "LLd/c;", "fusedLocationProviderClient", "Lia/m;", "geofenceFilter", "LLd/g;", "geofencingClient", "Lva/a;", "actionCommandFactory", "Lha/a;", "geofenceCacheableEventHandler", "LH9/l;", "", "geofenceEnabledStorage", "Lia/o;", "geofencePendingIntentProvider", "Ln9/b;", "concurrentHandlerHolder", "initialEnterTriggerEnabledStorage", "<init>", "(Lya/c;Ly9/b;Lia/p;Lp9/a;LLd/c;Lia/m;LLd/g;Lva/a;Lha/a;LH9/l;Lia/o;Ln9/b;LH9/l;)V", "", "L", "()V", "LX8/a;", "completionListener", "C", "(LX8/a;)V", "LVd/j;", "Ljava/lang/Void;", "I", "()LVd/j;", "", "u", "()Ljava/lang/String;", "locationPermissionGranted", "backgroundLocationPermissionGranted", "y", "(ZZ)Ljava/lang/String;", "", "LZ9/a;", "nearestGeofences", "p", "(Ljava/util/List;)LZ9/a;", "", "m", "()I", "Lja/c;", "triggeringEmarsysGeofences", "x", "(Ljava/util/List;)V", "A", "triggeringGeofences", "Ljava/lang/Runnable;", "t", "(Ljava/util/List;)Ljava/util/List;", "actions", "r", "triggeringGeofence", "Lkotlin/Pair;", "LZ9/c;", "n", "(Lja/c;)Ljava/util/List;", "geofence", "triggerType", "o", "(LZ9/a;LZ9/c;)Ljava/util/List;", "", "", "parameters", "statusMap", "J", "(Ljava/util/Map;Ljava/util/Map;)V", "a", "q", "isEnabled", "()Z", "geofences", "B", "b", "Lya/c;", "Ly9/b;", "c", "Lia/p;", "d", "Lp9/a;", "e", "LLd/c;", "f", "Lia/m;", "g", "LLd/g;", "h", "Lva/a;", "i", "Lha/a;", "j", "LH9/l;", "k", "Lia/o;", "l", "Ln9/b;", "Lja/b;", "Lja/b;", "geofenceResponse", "", "Ljava/util/List;", "Landroid/location/Location;", "Landroid/location/Location;", "currentLocation", "Landroid/app/PendingIntent;", "Lkotlin/Lazy;", "w", "()Landroid/app/PendingIntent;", "geofencePendingIntent", "Z", "initialEnterTriggerEnabled", "s", "initialDwellingTriggerEnabled", "initialExitTriggerEnabled", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class i implements n {

    /* renamed from: u, reason: collision with root package name */
    private static final a f137439u = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ya.c requestModelFactory;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y9.b requestManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p geofenceResponseMapper;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C16412a permissionChecker;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4013c fusedLocationProviderClient;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m geofenceFilter;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4017g geofencingClient;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C17650a actionCommandFactory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C14490a geofenceCacheableEventHandler;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final H9.l<Boolean> geofenceEnabledStorage;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final o geofencePendingIntentProvider;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final H9.l<Boolean> initialEnterTriggerEnabledStorage;

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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lia/i$a;", "", "<init>", "()V", "", "FASTEST_INTERNAL", "J", "INTERVAL", "MAX_WAIT_TIME", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ia/i$b", "LS8/a;", "", PreferencesHelper.PREF_ID, "LD9/c;", "responseModel", "", "b", "(Ljava/lang/String;LD9/c;)V", "d", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "a", "(Ljava/lang/String;Ljava/lang/Exception;)V", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements S8.a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ X8.a f137461b;

        @Override // S8.a
        public void a(String id2, Exception cause) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(cause, "cause");
        }

        @Override // S8.a
        public void d(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
        }

        b(X8.a aVar) {
            this.f137461b = aVar;
        }

        @Override // S8.a
        public void b(String id2, ResponseModel responseModel) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(responseModel, "responseModel");
            i iVar = i.this;
            iVar.geofenceResponse = iVar.geofenceResponseMapper.a(responseModel);
            i.this.q(this.f137461b);
        }
    }

    private void L() {
    }

    public i(ya.c requestModelFactory, y9.b requestManager, p geofenceResponseMapper, C16412a permissionChecker, InterfaceC4013c fusedLocationProviderClient, m geofenceFilter, InterfaceC4017g geofencingClient, C17650a actionCommandFactory, C14490a geofenceCacheableEventHandler, H9.l<Boolean> geofenceEnabledStorage, o geofencePendingIntentProvider, n9.b concurrentHandlerHolder, H9.l<Boolean> initialEnterTriggerEnabledStorage) {
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
        this.geofencePendingIntent = LazyKt.b(new Function0() { // from class: ia.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.v(this.f137430a);
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
            if (Intrinsics.e(triggeringEmarsysGeofence.getGeofenceId(), "refreshArea") && triggeringEmarsysGeofence.getTriggerType() == Z9.c.f43656b) {
                break;
            }
        }
        if (((TriggeringEmarsysGeofence) next) == null || u() != null) {
            return;
        }
        C(null);
    }

    private void C(final X8.a completionListener) {
        if (!I9.a.f14384a.b()) {
            L();
        }
        AbstractC5516j<Void> abstractC5516jI = I();
        abstractC5516jI.c(new InterfaceC5511e() { // from class: ia.c
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j) {
                i.D(this.f137431a, completionListener, abstractC5516j);
            }
        });
        abstractC5516jI.e(new InterfaceC5512f() { // from class: ia.d
            @Override // Vd.InterfaceC5512f
            public final void onFailure(Exception exc) {
                i.H(completionListener, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(final i iVar, final X8.a aVar, AbstractC5516j it) {
        Intrinsics.j(it, "it");
        AbstractC5516j<Location> abstractC5516jM = iVar.fusedLocationProviderClient.m();
        if (abstractC5516jM != null) {
            final Function1 function1 = new Function1() { // from class: ia.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.E(this.f137435a, aVar, (Location) obj);
                }
            };
            abstractC5516jM.g(new InterfaceC5513g() { // from class: ia.g
                @Override // Vd.InterfaceC5513g
                public final void onSuccess(Object obj) {
                    i.F(function1, obj);
                }
            });
        }
        if (abstractC5516jM != null) {
            abstractC5516jM.e(new InterfaceC5512f() { // from class: ia.h
                @Override // Vd.InterfaceC5512f
                public final void onFailure(Exception exc) {
                    i.G(aVar, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(i iVar, X8.a aVar, Location location) {
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
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(X8.a aVar, Exception it) {
        Intrinsics.j(it, "it");
        if (aVar != null) {
            aVar.a(it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(X8.a aVar, Exception it) {
        Intrinsics.j(it, "it");
        if (aVar != null) {
            aVar.a(it);
        }
    }

    private AbstractC5516j<Void> I() {
        LocationRequest locationRequestA = new LocationRequest.a(100, 15000L).e(l8.b.f93364b).d(30000L).h(5.0f).c(2).k(true).a();
        Intrinsics.i(locationRequestA, "build(...)");
        AbstractC5516j<Void> abstractC5516jD = this.fusedLocationProviderClient.d(locationRequestA, w());
        Intrinsics.i(abstractC5516jD, "requestLocationUpdates(...)");
        return abstractC5516jD;
    }

    private void J(Map<String, ? extends Object> parameters, Map<String, ? extends Object> statusMap) {
        e.Companion companion = K9.e.INSTANCE;
        String strA = I9.o.a();
        Intrinsics.i(strA, "getCallerMethodName(...)");
        e.Companion.b(companion, new L9.k(i.class, strA, parameters, statusMap), false, 2, null);
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

    private List<Pair<Geofence, Z9.c>> n(TriggeringEmarsysGeofence triggeringGeofence) {
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
            this.concurrentHandlerHolder.h(new Runnable() { // from class: ia.e
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
            CollectionsKt.C(arrayList2, o((Geofence) pair.c(), (Z9.c) pair.d()));
        }
        return arrayList2;
    }

    private String u() {
        boolean z10 = this.permissionChecker.a("android.permission.ACCESS_FINE_LOCATION") == 0 || this.permissionChecker.a("android.permission.ACCESS_COARSE_LOCATION") == 0;
        boolean z11 = I9.a.f14384a.b() || this.permissionChecker.a("android.permission.ACCESS_BACKGROUND_LOCATION") == 0;
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
            arrayList.add(new InterfaceC4014d.a().d(geofence.getId()).b(geofence.getLat(), geofence.getLon(), (float) geofence.getRadius()).c(-1L).e(3).a());
        }
        C4019i c4019iC = new C4019i.a().b(arrayList).d(m()).c();
        Intrinsics.i(c4019iC, "build(...)");
        this.geofencingClient.l(c4019iC, w());
        K(this, null, MapsKt.g(TuplesKt.a("registeredGeofences", Integer.valueOf(arrayList.size()))), 1, null);
    }

    @Override // ia.n
    public void a(X8.a completionListener) {
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

    @Override // ia.n
    public void b(final List<TriggeringEmarsysGeofence> triggeringEmarsysGeofences) {
        Intrinsics.j(triggeringEmarsysGeofences, "triggeringEmarsysGeofences");
        if (isEnabled()) {
            if (this.nearestGeofences.isEmpty()) {
                a(new X8.a() { // from class: ia.a
                    @Override // X8.a
                    public final void a(Throwable th2) {
                        i.z(this.f137428a, triggeringEmarsysGeofences, th2);
                    }
                });
            } else {
                x(triggeringEmarsysGeofences);
            }
        }
    }

    @Override // ia.n
    public boolean isEnabled() {
        Boolean bool = this.geofenceEnabledStorage.get();
        Intrinsics.i(bool, "get(...)");
        return bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private List<Runnable> o(Geofence geofence, Z9.c triggerType) throws JSONException {
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
        return new Geofence("refreshArea", latitude2, location4.getLongitude(), dAbs, null, CollectionsKt.e(new Trigger("refreshAreaTriggerId", Z9.c.f43656b, 0, new JSONObject())));
    }

    private void x(List<TriggeringEmarsysGeofence> triggeringEmarsysGeofences) {
        r(t(triggeringEmarsysGeofences));
        A(triggeringEmarsysGeofences);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(i iVar, List list, Throwable th2) {
        iVar.x(list);
    }

    public void q(X8.a completionListener) {
        boolean z10;
        String strU = u();
        if (strU == null) {
            if (!this.geofenceEnabledStorage.get().booleanValue()) {
                H9.l<Boolean> lVar = this.geofenceEnabledStorage;
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
