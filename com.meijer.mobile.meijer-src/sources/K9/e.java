package K9;

import F9.a;
import H9.l;
import L9.f;
import L9.g;
import android.content.Context;
import com.fullstory.FS;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import k9.C15113b;
import k9.InterfaceC15112a;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import u9.C17361a;
import v9.C17649a;
import x9.C18136a;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0017\u0018\u0000 \u001e2\u00020\u0001:\u0001(BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0012¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0012¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0012¢\u0006\u0004\b \u0010\u001fJ1\u0010#\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J9\u0010&\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010%\u001a\u00020\r2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010!H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b#\u0010.R\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0010\u001a\u00020\u000f8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0012\u001a\u00020\u00118\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b \u00103¨\u00064"}, d2 = {"LK9/e;", "", "Ln9/b;", "concurrentHandlerHolder", "Lg9/c;", "LF9/a;", "Lg9/d;", "shardRepository", "Lu9/a;", "timestampProvider", "Lv9/a;", "uuidProvider", "LH9/l;", "", "logLevelStorage", "", "verboseConsoleLoggingEnabled", "Landroid/content/Context;", "context", "<init>", "(Ln9/b;Lg9/c;Lu9/a;Lv9/a;LH9/l;ZLandroid/content/Context;)V", "LK9/a;", "logLevel", "LL9/e;", "logEntry", "", "i", "(LK9/a;LL9/e;)V", "l", "(LK9/a;)Z", "h", "(LL9/e;)Z", "g", "Lkotlin/Function0;", "onCompleted", "d", "(LK9/a;LL9/e;Lkotlin/jvm/functions/Function0;)V", "currentThreadName", "j", "(LK9/a;LL9/e;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "a", "Ln9/b;", "b", "Lg9/c;", "c", "Lu9/a;", "Lv9/a;", "e", "LH9/l;", "f", "Z", "Landroid/content/Context;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class e {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    private static final ArrayDeque<L9.e> f16501i = new ArrayDeque<>(10);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g9.c<F9.a, g9.d> shardRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C17649a uuidProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<String> logLevelStorage;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean verboseConsoleLoggingEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\bJ!\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LK9/e$a;", "", "<init>", "()V", "LL9/e;", "logEntry", "", "f", "(LL9/e;)V", "", "strict", "d", "(LL9/e;Z)V", "c", "a", "g", "", "TAG", "Ljava/lang/String;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: K9.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ void b(Companion companion, L9.e eVar, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            companion.a(eVar, z10);
        }

        public static /* synthetic */ void e(Companion companion, L9.e eVar, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            companion.d(eVar, z10);
        }

        @JvmStatic
        public final void a(L9.e logEntry, boolean strict) {
            Intrinsics.j(logEntry, "logEntry");
            if (InterfaceC15112a.INSTANCE.b()) {
                if (!strict) {
                    e.e(C15113b.a().g(), a.f16477c, logEntry, null, 4, null);
                } else if (Intrinsics.e(C15113b.a().g().logLevelStorage.get(), "DEBUG")) {
                    e.e(C15113b.a().g(), a.f16477c, logEntry, null, 4, null);
                }
            }
        }

        @JvmStatic
        public final void c(L9.e logEntry) {
            Intrinsics.j(logEntry, "logEntry");
            if (InterfaceC15112a.INSTANCE.b()) {
                e.e(C15113b.a().g(), a.f16480f, logEntry, null, 4, null);
            }
        }

        @JvmStatic
        public final void d(L9.e logEntry, boolean strict) {
            Intrinsics.j(logEntry, "logEntry");
            if (InterfaceC15112a.INSTANCE.b()) {
                if (!strict) {
                    e.e(C15113b.a().g(), a.f16478d, logEntry, null, 4, null);
                } else if (Intrinsics.e(C15113b.a().d().get(), "INFO")) {
                    e.e(C15113b.a().g(), a.f16478d, logEntry, null, 4, null);
                }
            }
        }

        @JvmStatic
        public final void f(L9.e logEntry) {
            Intrinsics.j(logEntry, "logEntry");
            e(this, logEntry, false, 2, null);
        }

        @JvmStatic
        public final void g(L9.e logEntry) {
            Intrinsics.j(logEntry, "logEntry");
            if (InterfaceC15112a.INSTANCE.b()) {
                e.e(C15113b.a().g(), a.f16481g, logEntry, null, 4, null);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f16477c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f16476b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f16478d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f16479e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f16480f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e(n9.b concurrentHandlerHolder, g9.c<F9.a, g9.d> shardRepository, C17361a timestampProvider, C17649a uuidProvider, l<String> logLevelStorage, boolean z10, Context context) {
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(shardRepository, "shardRepository");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(uuidProvider, "uuidProvider");
        Intrinsics.j(logLevelStorage, "logLevelStorage");
        Intrinsics.j(context, "context");
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.shardRepository = shardRepository;
        this.timestampProvider = timestampProvider;
        this.uuidProvider = uuidProvider;
        this.logLevelStorage = logLevelStorage;
        this.verboseConsoleLoggingEnabled = z10;
        this.context = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(e eVar, a aVar, L9.e eVar2, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleLog");
        }
        if ((i10 & 4) != 0) {
            function0 = null;
        }
        eVar.d(aVar, eVar2, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(a aVar, L9.e eVar, e eVar2, String str, Function0 function0) {
        if (aVar == a.f16477c || aVar == a.f16478d) {
            ArrayDeque<L9.e> arrayDeque = f16501i;
            if (arrayDeque.size() > 10) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(eVar);
        }
        boolean z10 = (eVar2.context.getApplicationInfo().flags & 2) != 0;
        if ((eVar2.verboseConsoleLoggingEnabled || (eVar instanceof g)) && z10) {
            eVar2.i(aVar, eVar);
        }
        if (eVar instanceof g) {
            return;
        }
        Intrinsics.g(str);
        eVar2.j(aVar, eVar, str, function0);
    }

    private void i(a logLevel, L9.e logEntry) {
        int i10 = b.$EnumSwitchMapping$0[logLevel.ordinal()];
        if (i10 == 1) {
            FS.log_d("Emarsys SDK", f.a(logEntry));
            return;
        }
        if (i10 == 2) {
            FS.log_v("Emarsys SDK", f.a(logEntry));
            return;
        }
        if (i10 == 3) {
            FS.log_i("Emarsys SDK", f.a(logEntry));
            return;
        }
        if (i10 == 4) {
            FS.log_w("Emarsys SDK", f.a(logEntry));
        } else {
            if (i10 != 5) {
                return;
            }
            if (logEntry instanceof L9.b) {
                FS.log_e("Emarsys SDK", f.a(logEntry), ((L9.b) logEntry).getThrowable());
            } else {
                FS.log_e("Emarsys SDK", f.a(logEntry));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(e eVar, L9.e eVar2, a aVar, String str, Function0 function0) {
        Map mapK;
        a.C0171a c0171aC = new a.C0171a(eVar.timestampProvider, eVar.uuidProvider).c(eVar2.a());
        Map<String, Object> mapB = f.b(eVar2, aVar, str, C18136a.f170643a.a());
        if (aVar == a.f16480f) {
            ArrayDeque<L9.e> arrayDeque = f16501i;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(arrayDeque, 10));
            Iterator<L9.e> it = arrayDeque.iterator();
            while (it.hasNext()) {
                arrayList.add(f.a(it.next()));
            }
            mapK = MapsKt.g(TuplesKt.a("breadcrumbs", arrayList));
        } else {
            mapK = MapsKt.k();
        }
        F9.a aVarA = c0171aC.b(MapsKt.u(mapB, mapK)).a();
        g9.c<F9.a, g9.d> cVar = eVar.shardRepository;
        Intrinsics.g(aVarA);
        cVar.add(aVarA);
        if (aVar == a.f16480f) {
            f16501i.clear();
        }
        if (function0 != null) {
            function0.invoke();
        }
    }

    private boolean l(a logLevel) {
        a aVarValueOf;
        String str = this.logLevelStorage.get();
        if (str == null || StringsKt.s0(str)) {
            aVarValueOf = a.f16480f;
        } else {
            String str2 = this.logLevelStorage.get();
            Intrinsics.g(str2);
            aVarValueOf = a.valueOf(str2);
        }
        return logLevel.getPriority() >= aVarValueOf.getPriority();
    }

    public void d(final a logLevel, final L9.e logEntry, final Function0<Unit> onCompleted) {
        Intrinsics.j(logLevel, "logLevel");
        Intrinsics.j(logEntry, "logEntry");
        final String name = Thread.currentThread().getName();
        this.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: K9.c
            @Override // java.lang.Runnable
            public final void run() {
                e.f(logLevel, logEntry, this, name, onCompleted);
            }
        });
    }

    public void j(final a logLevel, final L9.e logEntry, final String currentThreadName, final Function0<Unit> onCompleted) {
        Intrinsics.j(logLevel, "logLevel");
        Intrinsics.j(logEntry, "logEntry");
        Intrinsics.j(currentThreadName, "currentThreadName");
        if (g(logEntry) || (h(logEntry) && l(logLevel))) {
            this.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: K9.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.k(this.f16495a, logEntry, logLevel, currentThreadName, onCompleted);
                }
            });
        } else if (onCompleted != null) {
            onCompleted.invoke();
        }
    }

    private boolean g(L9.e logEntry) {
        return Intrinsics.e(logEntry.a(), "app:start");
    }

    private boolean h(L9.e logEntry) {
        return !Intrinsics.e(logEntry.getData().get("url"), "https://log-dealer.eservice.emarsys.net/v1/log");
    }
}
