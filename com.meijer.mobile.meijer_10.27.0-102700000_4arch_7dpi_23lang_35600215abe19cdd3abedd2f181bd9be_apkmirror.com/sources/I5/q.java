package I5;

import I5.q;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.C6444c;
import com.adobe.marketing.mobile.C6449h;
import com.adobe.marketing.mobile.I;
import com.adobe.marketing.mobile.InterfaceC6418a;
import com.adobe.marketing.mobile.InterfaceC6443b;
import com.adobe.marketing.mobile.InterfaceC6456o;
import com.adobe.marketing.mobile.O;
import com.adobe.marketing.mobile.internal.eventhub.EventHubPlaceholderExtension;
import com.adobe.marketing.mobile.util.CloneFailedException;
import com.google.android.gms.common.api.a;
import f6.C13850f;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONException;

@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u0096\u00012\u00020\u0001:\u0001[B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJF\u0010\u0014\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JA\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ?\u0010!\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010#\u001a\u0004\u0018\u00010\u001f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010'J!\u0010)\u001a\u0004\u0018\u00010(2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010*J!\u0010,\u001a\u00020\u001f2\u0006\u0010+\u001a\u00020(2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0003J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\u0003J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u0010\u0003J\u0015\u00107\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b7\u0010\bJ7\u0010;\u001a\u00020\u00062\u0014\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t082\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010:H\u0007¢\u0006\u0004\b;\u0010<JF\u0010=\u001a\u00020\u00062\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t2%\b\u0002\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0010H\u0007¢\u0006\u0004\b=\u0010\u0015J+\u0010C\u001a\u00020\u00062\u0006\u0010>\u001a\u00020\u00042\u0006\u0010@\u001a\u00020?2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040A¢\u0006\u0004\bC\u0010DJ+\u0010H\u001a\u00020\u00062\u0006\u0010E\u001a\u00020\u00182\u0006\u0010F\u001a\u00020\u00182\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00040G¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00062\u0006\u0010K\u001a\u00020JH\u0000¢\u0006\u0004\bL\u0010MJ?\u0010N\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bN\u0010\u001eJ)\u0010P\u001a\u0004\u0018\u00010O2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\bP\u0010QJ9\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010R\u001a\u00020\u001c2\u0006\u0010T\u001a\u00020S¢\u0006\u0004\bV\u0010WJ!\u0010X\u001a\u0004\u0018\u00010%2\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\tH\u0001¢\u0006\u0004\bX\u0010YR\u001b\u0010_\u001a\u00020Z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001b\u0010d\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010cR \u0010h\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020%0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR&\u0010p\u001a\b\u0012\u0004\u0012\u00020j0i8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010l\u0012\u0004\bo\u0010\u0003\u001a\u0004\bm\u0010nR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020J0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010lR\u0014\u0010v\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR \u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001f0e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010gR\u0016\u0010{\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00040|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001e\u0010\u0083\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u008b\u0001\u001a\u0005\u0018\u00010\u0084\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001a\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R,\u0010\u0095\u0001\u001a\u00030\u008c\u00012\b\u0010\u0090\u0001\u001a\u00030\u008c\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001¨\u0006\u0097\u0001"}, d2 = {"LI5/q;", "", "<init>", "()V", "Lcom/adobe/marketing/mobile/h;", "event", "", "G", "(Lcom/adobe/marketing/mobile/h;)V", "Ljava/lang/Class;", "Lcom/adobe/marketing/mobile/l;", "extensionClass", "LI5/v;", "error", "K", "(Ljava/lang/Class;LI5/v;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "completion", "p0", "(Ljava/lang/Class;Lkotlin/jvm/functions/Function1;)V", "LI5/H;", "sharedStateType", "", "extensionName", "", "state", "", "D", "(LI5/H;Ljava/lang/String;Ljava/util/Map;Lcom/adobe/marketing/mobile/h;)Z", "", "version", "j0", "(LI5/H;Ljava/lang/String;Ljava/util/Map;I)V", "N", "(Lcom/adobe/marketing/mobile/h;)Ljava/lang/Integer;", "LI5/B;", "O", "(Ljava/lang/String;)LI5/B;", "LI5/G;", "U", "(LI5/H;Ljava/lang/String;)LI5/G;", "sharedStateManager", "l0", "(LI5/G;Lcom/adobe/marketing/mobile/h;)I", "H", "(LI5/H;Ljava/lang/String;)V", "m0", "Ljava/lang/Runnable;", "runnable", "I", "(Ljava/lang/Runnable;)V", "W", "n0", "E", "", "extensions", "Lkotlin/Function0;", "c0", "(Ljava/util/Set;Lkotlin/jvm/functions/Function0;)V", "Y", "triggerEvent", "", "timeoutMS", "Lcom/adobe/marketing/mobile/b;", "listener", "g0", "(Lcom/adobe/marketing/mobile/h;JLcom/adobe/marketing/mobile/b;)V", "eventType", "eventSource", "Lcom/adobe/marketing/mobile/a;", "d0", "(Ljava/lang/String;Ljava/lang/String;Lcom/adobe/marketing/mobile/a;)V", "LI5/y;", "eventPreprocessor", "X", "(LI5/y;)V", "B", "Lcom/adobe/marketing/mobile/G;", "y", "(LI5/H;Ljava/lang/String;Lcom/adobe/marketing/mobile/h;)Lcom/adobe/marketing/mobile/G;", "barrier", "Lcom/adobe/marketing/mobile/F;", "resolution", "Lcom/adobe/marketing/mobile/H;", "S", "(LI5/H;Ljava/lang/String;Lcom/adobe/marketing/mobile/h;ZLcom/adobe/marketing/mobile/F;)Lcom/adobe/marketing/mobile/H;", "P", "(Ljava/lang/Class;)LI5/B;", "Ljava/util/concurrent/ScheduledExecutorService;", "a", "Lkotlin/Lazy;", "R", "()Ljava/util/concurrent/ScheduledExecutorService;", "scheduledExecutor", "Ljava/util/concurrent/ExecutorService;", "b", "M", "()Ljava/util/concurrent/ExecutorService;", "eventHubExecutor", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "registeredExtensions", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "LI5/E;", "d", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Q", "()Ljava/util/concurrent/ConcurrentLinkedQueue;", "getResponseEventListeners$core_phoneRelease$annotations", "responseEventListeners", "e", "eventPreprocessors", "Ljava/util/concurrent/atomic/AtomicInteger;", "f", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastEventNumber", "g", "eventNumberMap", "h", "Z", "hubStarted", "Lf6/f$c;", "i", "Lf6/f$c;", "dispatchJob", "Lf6/f;", "j", "Lf6/f;", "eventDispatcher", "LJ5/f;", "k", "LJ5/f;", "L", "()LJ5/f;", "setEventHistory", "(LJ5/f;)V", "eventHistory", "Lcom/adobe/marketing/mobile/O;", "l", "Lcom/adobe/marketing/mobile/O;", "_wrapperType", "value", "V", "()Lcom/adobe/marketing/mobile/O;", "setWrapperType", "(Lcom/adobe/marketing/mobile/O;)V", "wrapperType", "m", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class q {

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: n, reason: collision with root package name */
    private static q f13553n = new q();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy scheduledExecutor = LazyKt.b(h.f13578f);

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy eventHubExecutor = LazyKt.b(d.f13569f);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, B> registeredExtensions = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<E> responseEventListeners = new ConcurrentLinkedQueue<>();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentLinkedQueue<y> eventPreprocessors = new ConcurrentLinkedQueue<>();

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger lastEventNumber = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, Integer> eventNumberMap = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean hubStarted;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final C13850f.c<C6449h> dispatchJob;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C13850f<C6449h> eventDispatcher;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private J5.f eventHistory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private O _wrapperType;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LI5/q$a;", "", "<init>", "()V", "LI5/q;", "shared", "LI5/q;", "a", "()LI5/q;", "setShared", "(LI5/q;)V", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: I5.q$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final q a() {
            return q.f13553n;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/adobe/marketing/mobile/h;", "event", "", "<anonymous>", "(Lcom/adobe/marketing/mobile/h;)Z"}, k = 3, mv = {1, 5, 1})
    @SourceDebugExtension
    static final class c implements C13850f.c<C6449h> {

        @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"I5/q$c$a", "Lcom/adobe/marketing/mobile/b;", "", "result", "", "c", "(Z)V", "Lcom/adobe/marketing/mobile/c;", "error", "b", "(Lcom/adobe/marketing/mobile/c;)V", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a implements InterfaceC6443b<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<C6449h> f13567a;

            a(Ref.ObjectRef<C6449h> objectRef) {
                this.f13567a = objectRef;
            }

            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public /* bridge */ /* synthetic */ void a(Object obj) {
                c(((Boolean) obj).booleanValue());
            }

            @Override // com.adobe.marketing.mobile.InterfaceC6443b
            public void b(C6444c error) {
                Intrinsics.j(error, "error");
                Q5.t.a("MobileCore", "EventHub", "Failed to insert Event(" + this.f13567a.f142835a.x() + ") into EventHistory database with error " + error.b(), new Object[0]);
            }

            public void c(boolean result) {
                if (result) {
                    return;
                }
                Q5.t.a("MobileCore", "EventHub", "Failed to insert Event(" + this.f13567a.f142835a.x() + ") into EventHistory database", new Object[0]);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LI5/E;", "kotlin.jvm.PlatformType", "listener", "", "a", "(LI5/E;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1})
        static final class b extends Lambda implements Function1<E, Boolean> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Ref.ObjectRef<C6449h> f13568f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Ref.ObjectRef<C6449h> objectRef) {
                super(1);
                this.f13568f = objectRef;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(E e10) {
                boolean z10 = false;
                if (e10.d(this.f13568f.f142835a)) {
                    ScheduledFuture<Unit> scheduledFutureA = e10.a();
                    if (scheduledFutureA != null) {
                        scheduledFutureA.cancel(false);
                    }
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
        }

        c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void d(Collection matchingResponseListeners, Ref.ObjectRef processedEvent) {
            Intrinsics.j(matchingResponseListeners, "$matchingResponseListeners");
            Intrinsics.j(processedEvent, "$processedEvent");
            Iterator it = matchingResponseListeners.iterator();
            while (it.hasNext()) {
                ((E) it.next()).c((C6449h) processedEvent.f142835a);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v15, types: [T, com.adobe.marketing.mobile.h] */
        @Override // f6.C13850f.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final boolean a(C6449h event) {
            J5.f eventHistory;
            Intrinsics.j(event, "event");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.f142835a = event;
            Iterator it = q.this.eventPreprocessors.iterator();
            while (it.hasNext()) {
                objectRef.f142835a = ((y) it.next()).a((C6449h) objectRef.f142835a);
            }
            if (((C6449h) objectRef.f142835a).s() != null) {
                final Collection collectionB = w.b(q.this.Q(), new b(objectRef));
                q.this.I(new Runnable() { // from class: I5.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.c.d(collectionB, objectRef);
                    }
                });
            }
            Collection collectionValues = q.this.registeredExtensions.values();
            Intrinsics.i(collectionValues, "registeredExtensions.values");
            Iterator it2 = collectionValues.iterator();
            while (it2.hasNext()) {
                ((B) it2.next()).o().o(objectRef.f142835a);
            }
            if (Q5.t.c().compareTo(com.adobe.marketing.mobile.A.DEBUG) >= 0) {
                Q5.t.a("MobileCore", "EventHub", "Dispatched Event #" + q.this.N(event) + " to extensions after processing rules - (" + objectRef.f142835a + ')', new Object[0]);
            }
            if (((C6449h) objectRef.f142835a).p() == null || (eventHistory = q.this.getEventHistory()) == null) {
                return true;
            }
            eventHistory.b((C6449h) objectRef.f142835a, new a(objectRef));
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI5/v;", "error", "", "c", "(LI5/v;)V"}, k = 3, mv = {1, 5, 1})
    @SourceDebugExtension
    static final class e extends Lambda implements Function1<v, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<v, Unit> f13571g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Class<? extends AbstractC6453l> f13572h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function1<? super v, Unit> function1, Class<? extends AbstractC6453l> cls) {
            super(1);
            this.f13571g = function1;
            this.f13572h = cls;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(final Function1 function1, q this$0, Class extensionClass, final v error) throws JSONException {
            Intrinsics.j(this$0, "this$0");
            Intrinsics.j(extensionClass, "$extensionClass");
            Intrinsics.j(error, "$error");
            if (function1 != null) {
                this$0.I(new Runnable() { // from class: I5.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.e.e(function1, error);
                    }
                });
            }
            this$0.K(extensionClass, error);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(Function1 it, v error) {
            Intrinsics.j(it, "$it");
            Intrinsics.j(error, "$error");
            it.invoke(error);
        }

        public final void c(final v error) {
            Intrinsics.j(error, "error");
            ExecutorService executorServiceM = q.this.M();
            final Function1<v, Unit> function1 = this.f13571g;
            final q qVar = q.this;
            final Class<? extends AbstractC6453l> cls = this.f13572h;
            executorServiceM.submit(new Runnable() { // from class: I5.s
                @Override // java.lang.Runnable
                public final void run() throws JSONException {
                    q.e.d(function1, qVar, cls, error);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(v vVar) {
            c(vVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LI5/v;", "it", "", "c", "(LI5/v;)V"}, k = 3, mv = {1, 5, 1})
    @SourceDebugExtension
    static final class f extends Lambda implements Function1<v, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AtomicInteger f13573f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<Class<? extends AbstractC6453l>> f13574g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ q f13575h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f13576i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(AtomicInteger atomicInteger, Set<? extends Class<? extends AbstractC6453l>> set, q qVar, Function0<Unit> function0) {
            super(1);
            this.f13573f = atomicInteger;
            this.f13574g = set;
            this.f13575h = qVar;
            this.f13576i = function0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function0 it) {
            Intrinsics.j(it, "$it");
            it.invoke();
        }

        public final void c(v it) {
            Intrinsics.j(it, "it");
            if (this.f13573f.incrementAndGet() == this.f13574g.size()) {
                this.f13575h.n0();
                final Function0<Unit> function0 = this.f13576i;
                if (function0 != null) {
                    this.f13575h.I(new Runnable() { // from class: I5.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            q.f.d(function0);
                        }
                    });
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(v vVar) {
            c(vVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LI5/E;", "kotlin.jvm.PlatformType", "it", "", "a", "(LI5/E;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1})
    static final class g extends Lambda implements Function1<E, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f13577f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str) {
            super(1);
            this.f13577f = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E e10) {
            return Boolean.valueOf(Intrinsics.e(e10.getTriggerEventId(), this.f13577f));
        }
    }

    private final int l0(G sharedStateManager, C6449h event) {
        if (event == null) {
            if (sharedStateManager.a()) {
                return 0;
            }
            return this.lastEventNumber.incrementAndGet();
        }
        Integer numN = N(event);
        if (numN != null) {
            return numN.intValue();
        }
        return 0;
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.adobe.marketing.mobile.F.values().length];
            try {
                iArr[com.adobe.marketing.mobile.F.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.adobe.marketing.mobile.F.LAST_SET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/concurrent/ExecutorService;"}, k = 3, mv = {1, 5, 1})
    static final class d extends Lambda implements Function0<ExecutorService> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f13569f = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ExecutorService invoke() {
            return Executors.newSingleThreadExecutor();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/concurrent/ScheduledExecutorService;"}, k = 3, mv = {1, 5, 1})
    static final class h extends Lambda implements Function0<ScheduledExecutorService> {

        /* renamed from: f, reason: collision with root package name */
        public static final h f13578f = new h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return Executors.newSingleThreadScheduledExecutor();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(q this$0, H sharedStateType, String extensionName, int i10, Map map) throws ExecutionException, InterruptedException {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(sharedStateType, "$sharedStateType");
        Intrinsics.j(extensionName, "$extensionName");
        this$0.j0(sharedStateType, extensionName, map, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean C(q this$0, H sharedStateType, String extensionName, Map map, C6449h c6449h) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(sharedStateType, "$sharedStateType");
        Intrinsics.j(extensionName, "$extensionName");
        return Boolean.valueOf(this$0.D(sharedStateType, extensionName, map, c6449h));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(q this$0, C6449h event) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(event, "$event");
        this$0.G(event);
    }

    private final void G(C6449h event) {
        int iIncrementAndGet = this.lastEventNumber.incrementAndGet();
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.eventNumberMap;
        String strX = event.x();
        Intrinsics.i(strX, "event.uniqueIdentifier");
        concurrentHashMap.put(strX, Integer.valueOf(iIncrementAndGet));
        if (!this.eventDispatcher.o(event)) {
            Q5.t.f("MobileCore", "EventHub", "Failed to dispatch event #" + iIncrementAndGet + " - (" + event + ')', new Object[0]);
        }
        if (Q5.t.c().compareTo(com.adobe.marketing.mobile.A.DEBUG) >= 0) {
            Q5.t.a("MobileCore", "EventHub", "Dispatching Event #" + iIncrementAndGet + " - (" + event + ')', new Object[0]);
        }
    }

    private final void H(H sharedStateType, String extensionName) {
        C6449h event = new C6449h.b(sharedStateType == H.STANDARD ? "Shared state change" : "Shared state change (XDM)", "com.adobe.eventType.hub", "com.adobe.eventSource.sharedState").d(MapsKt.g(TuplesKt.a("stateowner", extensionName))).a();
        Intrinsics.i(event, "event");
        G(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(Runnable runnable) {
        Intrinsics.j(runnable, "$runnable");
        try {
            runnable.run();
        } catch (Exception e10) {
            Q5.t.a("MobileCore", "EventHub", "Exception thrown from callback - " + e10, new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K(Class<? extends AbstractC6453l> extensionClass, v error) throws JSONException {
        if (error == v.None) {
            Q5.t.e("MobileCore", "EventHub", "Extension " + extensionClass + " registered successfully", new Object[0]);
            m0();
            return;
        }
        Q5.t.f("MobileCore", "EventHub", "Extension " + extensionClass + " registration failed with error " + error, new Object[0]);
        q0(this, extensionClass, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ExecutorService M() {
        Object value = this.eventHubExecutor.getValue();
        Intrinsics.i(value, "<get-eventHubExecutor>(...)");
        return (ExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer N(C6449h event) {
        if (event == null) {
            return null;
        }
        return this.eventNumberMap.get(event.x());
    }

    private final B O(String extensionName) {
        Object next;
        Set<Map.Entry<String, B>> setEntrySet = this.registeredExtensions.entrySet();
        Intrinsics.i(setEntrySet, "registeredExtensions.entries");
        Iterator<T> it = setEntrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String strU = ((B) ((Map.Entry) next).getValue()).getSharedStateName();
            if (strU != null ? StringsKt.H(strU, extensionName, true) : false) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            return (B) entry.getValue();
        }
        return null;
    }

    private final ScheduledExecutorService R() {
        Object value = this.scheduledExecutor.getValue();
        Intrinsics.i(value, "<get-scheduledExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.adobe.marketing.mobile.H T(q this$0, String extensionName, H sharedStateType, C6449h c6449h, com.adobe.marketing.mobile.F resolution, boolean z10) {
        com.adobe.marketing.mobile.H hB;
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(extensionName, "$extensionName");
        Intrinsics.j(sharedStateType, "$sharedStateType");
        Intrinsics.j(resolution, "$resolution");
        B bO = this$0.O(extensionName);
        if (bO == null) {
            Q5.t.a("MobileCore", "EventHub", "Unable to retrieve " + sharedStateType + " shared state for \"" + extensionName + "\". No such extension is registered.", new Object[0]);
            return null;
        }
        G gU = this$0.U(sharedStateType, extensionName);
        if (gU == null) {
            Q5.t.f("MobileCore", "EventHub", "Unable to retrieve " + sharedStateType + " shared state for \"" + extensionName + "\". SharedStateManager is null", new Object[0]);
            return null;
        }
        Integer numN = this$0.N(c6449h);
        int iIntValue = numN != null ? numN.intValue() : a.e.API_PRIORITY_OTHER;
        int i10 = b.$EnumSwitchMapping$0[resolution.ordinal()];
        if (i10 == 1) {
            hB = gU.b(iIntValue);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hB = gU.c(iIntValue);
        }
        Integer numN2 = this$0.N(bO.getLastProcessedEvent());
        return (z10 && !(c6449h == null || (numN2 != null ? numN2.intValue() : 0) > iIntValue - 1) && hB.a() == I.SET) ? new com.adobe.marketing.mobile.H(I.PENDING, hB.b()) : hB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void Z(q qVar, Class cls, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        qVar.Y(cls, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a0(Class extensionClass, q this$0, final Function1 function1) {
        Intrinsics.j(extensionClass, "$extensionClass");
        Intrinsics.j(this$0, "this$0");
        String extensionTypeName = C.d(extensionClass);
        if (this$0.registeredExtensions.containsKey(extensionTypeName)) {
            if (function1 != null) {
                this$0.I(new Runnable() { // from class: I5.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.b0(function1);
                    }
                });
            }
        } else {
            B b10 = new B(extensionClass, this$0.new e(function1, extensionClass));
            ConcurrentHashMap<String, B> concurrentHashMap = this$0.registeredExtensions;
            Intrinsics.i(extensionTypeName, "extensionTypeName");
            concurrentHashMap.put(extensionTypeName, b10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b0(Function1 it) {
        Intrinsics.j(it, "$it");
        it.invoke(v.DuplicateExtensionName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e0(q this$0, String eventType, String eventSource, final InterfaceC6418a listener) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(eventType, "$eventType");
        Intrinsics.j(eventSource, "$eventSource");
        Intrinsics.j(listener, "$listener");
        B bP = this$0.P(EventHubPlaceholderExtension.class);
        if (bP != null) {
            bP.h(eventType, eventSource, new InterfaceC6456o() { // from class: I5.e
                @Override // com.adobe.marketing.mobile.InterfaceC6456o
                public final void a(C6449h c6449h) {
                    q.f0(listener, c6449h);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f0(InterfaceC6418a listener, C6449h it) {
        Intrinsics.j(listener, "$listener");
        Intrinsics.j(it, "it");
        listener.a(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(C6449h triggerEvent, long j10, final q this$0, final InterfaceC6443b listener) {
        Intrinsics.j(triggerEvent, "$triggerEvent");
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(listener, "$listener");
        final String triggerEventId = triggerEvent.x();
        if (j10 == Long.MAX_VALUE) {
            ConcurrentLinkedQueue<E> concurrentLinkedQueue = this$0.responseEventListeners;
            Intrinsics.i(triggerEventId, "triggerEventId");
            concurrentLinkedQueue.add(new E(triggerEventId, null, listener));
        } else {
            ScheduledFuture scheduledFutureSchedule = this$0.R().schedule(new Callable() { // from class: I5.p
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return q.i0(this.f13549a, listener, triggerEventId);
                }
            }, j10, TimeUnit.MILLISECONDS);
            ConcurrentLinkedQueue<E> concurrentLinkedQueue2 = this$0.responseEventListeners;
            Intrinsics.i(triggerEventId, "triggerEventId");
            concurrentLinkedQueue2.add(new E(triggerEventId, scheduledFutureSchedule, listener));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(q this$0, InterfaceC6443b listener, String str) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(listener, "$listener");
        w.b(this$0.responseEventListeners, new g(str));
        try {
            listener.b(C6444c.f62373d);
        } catch (Exception e10) {
            Q5.t.a("MobileCore", "EventHub", "Exception thrown from ResponseListener - " + e10, new Object[0]);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(q this$0, H sharedStateType, String extensionName, int i10, Map map) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(sharedStateType, "$sharedStateType");
        Intrinsics.j(extensionName, "$extensionName");
        G gU = this$0.U(sharedStateType, extensionName);
        if (gU == null) {
            Q5.t.f("MobileCore", "EventHub", "Resolve pending " + sharedStateType + " shared state for extension \"" + extensionName + "\" and version " + i10 + " failed - SharedStateManager is null", new Object[0]);
            return Unit.f142422a;
        }
        if (!gU.g(i10, map)) {
            Q5.t.f("MobileCore", "EventHub", "Resolve pending " + sharedStateType + " shared state for extension \"" + extensionName + "\" and version " + i10 + " failed - SharedStateManager failed", new Object[0]);
            return Unit.f142422a;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Resolved pending ");
        sb2.append(sharedStateType);
        sb2.append(" shared state for \"");
        sb2.append(extensionName);
        sb2.append("\" and version ");
        sb2.append(i10);
        sb2.append(" with data ");
        sb2.append(map != null ? L5.j.g(map) : null);
        Q5.t.a("MobileCore", "EventHub", sb2.toString(), new Object[0]);
        this$0.H(sharedStateType, extensionName);
        return Unit.f142422a;
    }

    private final void m0() throws JSONException {
        if (this.hubStarted) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Collection<B> collectionValues = this.registeredExtensions.values();
            Intrinsics.i(collectionValues, "registeredExtensions.values");
            for (B b10 : collectionValues) {
                String strU = b10.getSharedStateName();
                if (strU != null && !Intrinsics.e(strU, "com.adobe.module.eventhub")) {
                    Map mapR = MapsKt.r(TuplesKt.a("friendlyName", b10.getFriendlyName()), TuplesKt.a("version", b10.getVersion()));
                    Map<String, String> mapS = b10.s();
                    if (mapS != null) {
                        mapR.put("metadata", mapS);
                    }
                    linkedHashMap.put(strU, mapR);
                }
            }
            D(H.STANDARD, "com.adobe.module.eventhub", com.adobe.marketing.mobile.util.a.f(MapsKt.o(TuplesKt.a("version", "3.5.0"), TuplesKt.a("wrapper", MapsKt.o(TuplesKt.a("type", this._wrapperType.e()), TuplesKt.a("friendlyName", this._wrapperType.b()))), TuplesKt.a("extensions", linkedHashMap))), null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(q this$0) throws JSONException {
        Intrinsics.j(this$0, "this$0");
        this$0.hubStarted = true;
        this$0.eventDispatcher.x();
        this$0.m0();
        Q5.t.e("MobileCore", "EventHub", "EventHub started. Will begin processing events", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final O q(q this$0) {
        Intrinsics.j(this$0, "this$0");
        return this$0._wrapperType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void q0(q qVar, Class cls, Function1 function1, int i10, Object obj) throws JSONException {
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        qVar.p0(cls, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r0(Function1 function1, v error) {
        Intrinsics.j(error, "$error");
        if (function1 != null) {
            function1.invoke(error);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.adobe.marketing.mobile.G z(final q this$0, final H sharedStateType, final String extensionName, C6449h c6449h) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(sharedStateType, "$sharedStateType");
        Intrinsics.j(extensionName, "$extensionName");
        G gU = this$0.U(sharedStateType, extensionName);
        if (gU == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Create pending ");
            sb2.append(sharedStateType);
            sb2.append(" shared state for extension \"");
            sb2.append(extensionName);
            sb2.append("\" for event ");
            sb2.append(c6449h != null ? c6449h.x() : null);
            sb2.append(" failed - SharedStateManager is null");
            Q5.t.f("MobileCore", "EventHub", sb2.toString(), new Object[0]);
            return null;
        }
        final int iL0 = this$0.l0(gU, c6449h);
        if (gU.e(iL0)) {
            Q5.t.a("MobileCore", "EventHub", "Created pending " + sharedStateType + " shared state for extension \"" + extensionName + "\" with version " + iL0, new Object[0]);
            return new com.adobe.marketing.mobile.G() { // from class: I5.f
                @Override // com.adobe.marketing.mobile.G
                public final void a(Map map) throws ExecutionException, InterruptedException {
                    q.A(this.f13518a, sharedStateType, extensionName, iL0, map);
                }
            };
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Create pending ");
        sb3.append(sharedStateType);
        sb3.append(" shared state for extension \"");
        sb3.append(extensionName);
        sb3.append("\" for event ");
        sb3.append(c6449h != null ? c6449h.x() : null);
        sb3.append(" failed - SharedStateManager failed");
        Q5.t.f("MobileCore", "EventHub", sb3.toString(), new Object[0]);
        return null;
    }

    public final boolean B(final H sharedStateType, final String extensionName, Map<String, Object> state, final C6449h event) throws ExecutionException, CloneFailedException, InterruptedException {
        final Map<String, Object> mapF;
        Intrinsics.j(sharedStateType, "sharedStateType");
        Intrinsics.j(extensionName, "extensionName");
        try {
            mapF = com.adobe.marketing.mobile.util.a.f(state);
        } catch (Exception e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Creating ");
            sb2.append(sharedStateType);
            sb2.append(" shared state for extension ");
            sb2.append(extensionName);
            sb2.append(" at event ");
            sb2.append(event != null ? event.x() : null);
            sb2.append(" with null - Cloning state failed with exception ");
            sb2.append(e10);
            Q5.t.f("MobileCore", "EventHub", sb2.toString(), new Object[0]);
            mapF = null;
        }
        Object obj = M().submit(new Callable() { // from class: I5.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.C(this.f13530a, sharedStateType, extensionName, mapF, event);
            }
        }).get();
        Intrinsics.i(obj, "eventHubExecutor.submit(callable).get()");
        return ((Boolean) obj).booleanValue();
    }

    public final void E(final C6449h event) {
        Intrinsics.j(event, "event");
        M().submit(new Runnable() { // from class: I5.a
            @Override // java.lang.Runnable
            public final void run() {
                q.F(this.f13505a, event);
            }
        });
    }

    /* renamed from: L, reason: from getter */
    public final J5.f getEventHistory() {
        return this.eventHistory;
    }

    public final B P(Class<? extends AbstractC6453l> extensionClass) {
        Intrinsics.j(extensionClass, "extensionClass");
        return this.registeredExtensions.get(C.d(extensionClass));
    }

    public final ConcurrentLinkedQueue<E> Q() {
        return this.responseEventListeners;
    }

    public final com.adobe.marketing.mobile.H S(final H sharedStateType, final String extensionName, final C6449h event, final boolean barrier, final com.adobe.marketing.mobile.F resolution) {
        Intrinsics.j(sharedStateType, "sharedStateType");
        Intrinsics.j(extensionName, "extensionName");
        Intrinsics.j(resolution, "resolution");
        return (com.adobe.marketing.mobile.H) M().submit(new Callable() { // from class: I5.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.T(this.f13538a, extensionName, sharedStateType, event, resolution, barrier);
            }
        }).get();
    }

    public final void W() {
        J5.c cVar;
        if (this.eventHistory != null) {
            Q5.t.f("MobileCore", "EventHub", "Event history is already initialized", new Object[0]);
            return;
        }
        try {
            cVar = new J5.c();
        } catch (Exception e10) {
            Q5.t.f("MobileCore", "EventHub", "Event history initialization failed with exception " + e10.getMessage(), new Object[0]);
            cVar = null;
        }
        this.eventHistory = cVar;
    }

    public final void X(y eventPreprocessor) {
        Intrinsics.j(eventPreprocessor, "eventPreprocessor");
        if (this.eventPreprocessors.contains(eventPreprocessor)) {
            return;
        }
        this.eventPreprocessors.add(eventPreprocessor);
    }

    @JvmOverloads
    public final void Y(final Class<? extends AbstractC6453l> extensionClass, final Function1<? super v, Unit> completion) {
        Intrinsics.j(extensionClass, "extensionClass");
        M().submit(new Runnable() { // from class: I5.h
            @Override // java.lang.Runnable
            public final void run() {
                q.a0(extensionClass, this, completion);
            }
        });
    }

    @JvmOverloads
    public final void c0(Set<? extends Class<? extends AbstractC6453l>> extensions, Function0<Unit> completion) {
        Intrinsics.j(extensions, "extensions");
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Iterator<T> it = extensions.iterator();
        while (it.hasNext()) {
            Y((Class) it.next(), new f(atomicInteger, extensions, this, completion));
        }
    }

    public final void d0(final String eventType, final String eventSource, final InterfaceC6418a<C6449h> listener) {
        Intrinsics.j(eventType, "eventType");
        Intrinsics.j(eventSource, "eventSource");
        Intrinsics.j(listener, "listener");
        M().submit(new Runnable() { // from class: I5.d
            @Override // java.lang.Runnable
            public final void run() {
                q.e0(this.f13513a, eventType, eventSource, listener);
            }
        });
    }

    public final void g0(final C6449h triggerEvent, final long timeoutMS, final InterfaceC6443b<C6449h> listener) {
        Intrinsics.j(triggerEvent, "triggerEvent");
        Intrinsics.j(listener, "listener");
        M().submit(new Runnable() { // from class: I5.n
            @Override // java.lang.Runnable
            public final void run() {
                q.h0(triggerEvent, timeoutMS, this, listener);
            }
        });
    }

    public final com.adobe.marketing.mobile.G y(final H sharedStateType, final String extensionName, final C6449h event) {
        Intrinsics.j(sharedStateType, "sharedStateType");
        Intrinsics.j(extensionName, "extensionName");
        return (com.adobe.marketing.mobile.G) M().submit(new Callable() { // from class: I5.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.z(this.f13509a, sharedStateType, extensionName, event);
            }
        }).get();
    }

    public q() {
        c cVar = new c();
        this.dispatchJob = cVar;
        this.eventDispatcher = new C13850f<>("EventHub", cVar);
        Z(this, EventHubPlaceholderExtension.class, null, 2, null);
        this._wrapperType = O.NONE;
    }

    private final boolean D(H sharedStateType, String extensionName, Map<String, Object> state, C6449h event) throws JSONException {
        G gU = U(sharedStateType, extensionName);
        String strG = null;
        if (gU == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Create ");
            sb2.append(sharedStateType);
            sb2.append(" shared state for extension \"");
            sb2.append(extensionName);
            sb2.append("\" for event ");
            if (event != null) {
                strG = event.x();
            }
            sb2.append(strG);
            sb2.append(" failed - SharedStateManager is null");
            Q5.t.f("MobileCore", "EventHub", sb2.toString(), new Object[0]);
            return false;
        }
        int iL0 = l0(gU, event);
        boolean zF = gU.f(iL0, state);
        if (!zF) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Create ");
            sb3.append(sharedStateType);
            sb3.append(" shared state for extension \"");
            sb3.append(extensionName);
            sb3.append("\" for event ");
            if (event != null) {
                strG = event.x();
            }
            sb3.append(strG);
            sb3.append(" failed - SharedStateManager failed");
            Q5.t.f("MobileCore", "EventHub", sb3.toString(), new Object[0]);
            return zF;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Created ");
        sb4.append(sharedStateType);
        sb4.append(" shared state for extension \"");
        sb4.append(extensionName);
        sb4.append("\" with version ");
        sb4.append(iL0);
        sb4.append(" and data ");
        if (state != null) {
            strG = L5.j.g(state);
        }
        sb4.append(strG);
        Q5.t.a("MobileCore", "EventHub", sb4.toString(), new Object[0]);
        H(sharedStateType, extensionName);
        return zF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(final Runnable runnable) {
        R().submit(new Runnable() { // from class: I5.j
            @Override // java.lang.Runnable
            public final void run() {
                q.J(runnable);
            }
        });
    }

    private final G U(H sharedStateType, String extensionName) {
        G gT;
        B bO = O(extensionName);
        if (bO == null || (gT = bO.t(sharedStateType)) == null) {
            return null;
        }
        return gT;
    }

    private final void j0(final H sharedStateType, final String extensionName, Map<String, Object> state, final int version) throws ExecutionException, InterruptedException {
        Map<String, Object> mapF;
        try {
            mapF = com.adobe.marketing.mobile.util.a.f(state);
        } catch (Exception e10) {
            Q5.t.f("MobileCore", "EventHub", "Resolving pending " + sharedStateType + " shared state for extension \"" + extensionName + "\" and version " + version + " with null - Clone failed with exception " + e10, new Object[0]);
            mapF = null;
        }
        final Map<String, Object> map = mapF;
        M().submit(new Callable() { // from class: I5.g
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.k0(this.f13522a, sharedStateType, extensionName, version, map);
            }
        }).get();
    }

    private final void p0(Class<? extends AbstractC6453l> extensionClass, final Function1<? super v, Unit> completion) throws JSONException {
        final v vVar;
        B bRemove = this.registeredExtensions.remove(C.d(extensionClass));
        if (bRemove != null) {
            bRemove.y();
            m0();
            Q5.t.e("MobileCore", "EventHub", "Extension " + extensionClass + " unregistered successfully", new Object[0]);
            vVar = v.None;
        } else {
            Q5.t.f("MobileCore", "EventHub", "Extension " + extensionClass + " unregistration failed as extension was not registered", new Object[0]);
            vVar = v.ExtensionNotRegistered;
        }
        I(new Runnable() { // from class: I5.b
            @Override // java.lang.Runnable
            public final void run() {
                q.r0(completion, vVar);
            }
        });
    }

    public final O V() {
        Object obj = M().submit(new Callable() { // from class: I5.l
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return q.q(this.f13537a);
            }
        }).get();
        Intrinsics.i(obj, "eventHubExecutor.submit(…    }\n            ).get()");
        return (O) obj;
    }

    public final void n0() {
        M().submit(new Runnable() { // from class: I5.o
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                q.o0(this.f13548a);
            }
        });
    }
}
