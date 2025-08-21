package com.bugsnag.android;

import R6.ImmutableConfig;
import android.os.SystemClock;
import com.bugsnag.android.AbstractC6613p0;
import com.bugsnag.android.C6624v0;
import com.bugsnag.android.EventFilenameInfo;
import java.io.File;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 a2\u00020\u0001:\u0001bB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\u00102\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ!\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u00020\u00102\n\u0010&\u001a\u00060$j\u0002`%2\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0014H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020\u0014H\u0002¢\u0006\u0004\b-\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020\u0014H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0010H\u0002¢\u0006\u0004\b1\u0010\u0012J\u0017\u00102\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u0010\u001aJ\r\u00103\u001a\u00020\u0010¢\u0006\u0004\b3\u0010\u0012J\u001d\u00105\u001a\u0004\u0018\u00010\u00142\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b5\u00106J\u001d\u0010:\u001a\n\u0012\u0004\u0012\u00020 \u0018\u0001092\u0006\u00108\u001a\u000207¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0010¢\u0006\u0004\b<\u0010\u0012J\u0019\u0010?\u001a\u00020 2\b\u0010>\u001a\u0004\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@J!\u0010A\u001a\u00020 2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\bA\u0010BR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bC\u0010MR(\u0010U\u001a\b\u0012\u0004\u0012\u00020\u00100N8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR.\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00100V8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0016\u0010`\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/bugsnag/android/k0;", "Lcom/bugsnag/android/p0;", "LR6/k;", "config", "Lcom/bugsnag/android/D0;", "logger", "Lcom/bugsnag/android/M0;", "notifier", "LR6/b;", "bgTaskService", "Lcom/bugsnag/android/p0$a;", "delegate", "Lcom/bugsnag/android/r;", "callbackState", "<init>", "(LR6/k;Lcom/bugsnag/android/D0;Lcom/bugsnag/android/M0;LR6/b;Lcom/bugsnag/android/p0$a;Lcom/bugsnag/android/r;)V", "", "y", "()V", "", "Ljava/io/File;", "storedReports", "B", "(Ljava/util/Collection;)V", "eventFile", "x", "(Ljava/io/File;)V", "Lcom/bugsnag/android/e0;", "payload", "s", "(Ljava/io/File;Lcom/bugsnag/android/e0;)V", "I", "", "apiKey", "r", "(Ljava/io/File;Ljava/lang/String;)Lcom/bugsnag/android/e0;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exc", "E", "(Ljava/lang/Exception;Ljava/io/File;)V", "file", "", "F", "(Ljava/io/File;)Z", "G", "Ljava/util/Date;", "C", "(Ljava/io/File;)Ljava/util/Date;", "H", "t", "z", "storedFiles", "u", "(Ljava/util/Collection;)Ljava/io/File;", "Lcom/bugsnag/android/v0$a;", "streamable", "Ljava/util/concurrent/Future;", "J", "(Lcom/bugsnag/android/v0$a;)Ljava/util/concurrent/Future;", "v", "", "obj", "f", "(Ljava/lang/Object;)Ljava/lang/String;", "D", "(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;", "g", "LR6/k;", "h", "Lcom/bugsnag/android/M0;", "i", "LR6/b;", "j", "Lcom/bugsnag/android/r;", "k", "Lcom/bugsnag/android/D0;", "()Lcom/bugsnag/android/D0;", "Lkotlin/Function0;", "l", "Lkotlin/jvm/functions/Function0;", "getOnEventStoreEmptyCallback", "()Lkotlin/jvm/functions/Function0;", "setOnEventStoreEmptyCallback", "(Lkotlin/jvm/functions/Function0;)V", "onEventStoreEmptyCallback", "Lkotlin/Function1;", "m", "Lkotlin/jvm/functions/Function1;", "getOnDiscardEventCallback", "()Lkotlin/jvm/functions/Function1;", "setOnDiscardEventCallback", "(Lkotlin/jvm/functions/Function1;)V", "onDiscardEventCallback", "n", "Z", "isEmptyEventCallbackCalled", "o", "a", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.k0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6603k0 extends AbstractC6613p0 {

    /* renamed from: p, reason: collision with root package name */
    private static final Comparator<? super File> f64270p = new Comparator() { // from class: com.bugsnag.android.g0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C6603k0.p((File) obj, (File) obj2);
        }
    };

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final M0 notifier;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final R6.b bgTaskService;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final CallbackState callbackState;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onEventStoreEmptyCallback;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Function1<? super C6591e0, Unit> onDiscardEventCallback;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isEmptyEventCallbackCalled;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.k0$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[L.values().length];
            iArr[L.DELIVERED.ordinal()] = 1;
            iArr[L.UNDELIVERED.ordinal()] = 2;
            iArr[L.FAILURE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/io/File;", "it", "", "a", "(Ljava/io/File;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.bugsnag.android.k0$c */
    static final class c extends Lambda implements Function1<File, Boolean> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(File file) {
            return Boolean.valueOf(EventFilenameInfo.INSTANCE.i(file, C6603k0.this.config).e());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/bugsnag/android/e0;", "it", "", "a", "(Lcom/bugsnag/android/e0;)V"}, k = 3, mv = {1, 5, 1})
    /* renamed from: com.bugsnag.android.k0$d */
    static final class d extends Lambda implements Function1<C6591e0, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f64280f = new d();

        d() {
            super(1);
        }

        public final void a(C6591e0 c6591e0) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6591e0 c6591e0) {
            a(c6591e0);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.k0$e */
    static final class e extends Lambda implements Function0<Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f64281f = new e();

        e() {
            super(0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f143329a;
        }
    }

    public C6603k0(ImmutableConfig immutableConfig, D0 d02, M0 m02, R6.b bVar, AbstractC6613p0.a aVar, CallbackState callbackState) {
        super(new File(immutableConfig.x().getValue(), "bugsnag/errors"), immutableConfig.getMaxPersistedEvents(), d02, aVar);
        this.config = immutableConfig;
        this.onEventStoreEmptyCallback = e.f64281f;
        this.onDiscardEventCallback = d.f64280f;
        this.logger = d02;
        this.notifier = m02;
        this.bgTaskService = bVar;
        this.callbackState = callbackState;
    }

    private final Date C(File file) {
        return new Date(EventFilenameInfo.INSTANCE.f(file));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String K(C6603k0 c6603k0, String str) {
        c6603k0.x(new File(str));
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(File file, File file2) {
        if (file == null && file2 == null) {
            return 0;
        }
        if (file == null) {
            return 1;
        }
        if (file2 == null) {
            return -1;
        }
        return file.compareTo(file2);
    }

    private final C6591e0 r(File eventFile, String apiKey) {
        Intrinsics.g(apiKey);
        F0 f02 = new F0(eventFile, apiKey, getLogger());
        try {
            if (!this.callbackState.i(f02, getLogger())) {
                return null;
            }
        } catch (Exception e10) {
            getLogger().b("could not parse event payload", e10);
            f02.a();
        }
        C6585b0 event = f02.getEvent();
        return event != null ? new C6591e0(event.c(), event, null, this.notifier, this.config) : new C6591e0(apiKey, null, eventFile, this.notifier, this.config);
    }

    private final void s(File eventFile, C6591e0 payload) {
        int i10 = b.$EnumSwitchMapping$0[this.config.getDelivery().b(payload, this.config.m(payload)).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                I(eventFile);
                return;
            } else {
                if (i10 != 3) {
                    return;
                }
                E(new RuntimeException("Failed to deliver event payload"), eventFile);
                return;
            }
        }
        b(SetsKt.d(eventFile));
        getLogger().f("Deleting sent error file " + eventFile + ".name");
    }

    private final void t(File eventFile) {
        this.onDiscardEventCallback.invoke(new C6591e0(EventFilenameInfo.INSTANCE.i(eventFile, this.config).c(), null, eventFile, this.notifier, this.config));
    }

    private final void x(File eventFile) {
        try {
            C6591e0 c6591e0R = r(eventFile, EventFilenameInfo.INSTANCE.i(eventFile, this.config).getApiKey());
            if (c6591e0R == null) {
                b(SetsKt.d(eventFile));
            } else {
                s(eventFile, c6591e0R);
            }
        } catch (Exception e10) {
            E(e10, eventFile);
        }
    }

    public final String D(Object obj, String apiKey) {
        EventFilenameInfo eventFilenameInfoH;
        String strB;
        return (obj == null || (eventFilenameInfoH = EventFilenameInfo.Companion.h(EventFilenameInfo.INSTANCE, obj, null, apiKey, 0L, this.config, null, 42, null)) == null || (strB = eventFilenameInfoH.b()) == null) ? "" : strB;
    }

    @Override // com.bugsnag.android.AbstractC6613p0
    public String f(Object obj) {
        EventFilenameInfo eventFilenameInfoH;
        String strB;
        return (obj == null || (eventFilenameInfoH = EventFilenameInfo.Companion.h(EventFilenameInfo.INSTANCE, obj, null, null, 0L, this.config, null, 42, null)) == null || (strB = eventFilenameInfoH.b()) == null) ? "" : strB;
    }

    @Override // com.bugsnag.android.AbstractC6613p0
    /* renamed from: g, reason: from getter */
    protected D0 getLogger() {
        return this.logger;
    }

    public final File u(Collection<? extends File> storedFiles) {
        return (File) SequencesKt.O(SequencesKt.B(CollectionsKt.f0(storedFiles), new c()), f64270p);
    }

    public final void v() {
        try {
            this.bgTaskService.d(R6.t.ERROR_REQUEST, new Runnable() { // from class: com.bugsnag.android.j0
                @Override // java.lang.Runnable
                public final void run() {
                    C6603k0.w(this.f64247a);
                }
            });
        } catch (RejectedExecutionException unused) {
            getLogger().g("Failed to flush all on-disk errors, retaining unsent errors for later.");
        }
    }

    public final void z() {
        if (this.config.getSendLaunchCrashesSynchronously()) {
            try {
                Future<?> futureD = this.bgTaskService.d(R6.t.ERROR_REQUEST, new Runnable() { // from class: com.bugsnag.android.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        C6603k0.A(this.f64238a);
                    }
                });
                try {
                    long j10 = 2000;
                    long jElapsedRealtime = 2000 - (SystemClock.elapsedRealtime() - R6.j.f31967a.c());
                    if (jElapsedRealtime > 0) {
                        j10 = jElapsedRealtime;
                    }
                    futureD.get(j10, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    getLogger().a("Failed to send launch crash reports within timeout, continuing.", e10);
                } catch (ExecutionException e11) {
                    getLogger().a("Failed to send launch crash reports within timeout, continuing.", e11);
                } catch (TimeoutException e12) {
                    getLogger().a("Failed to send launch crash reports within timeout, continuing.", e12);
                }
            } catch (RejectedExecutionException e13) {
                getLogger().a("Failed to flush launch crash reports, continuing.", e13);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(C6603k0 c6603k0) {
        c6603k0.y();
        c6603k0.H();
    }

    private final void B(Collection<? extends File> storedReports) {
        if (!storedReports.isEmpty()) {
            int size = storedReports.size();
            getLogger().f("Sending " + size + " saved error(s) to Bugsnag");
            Iterator<? extends File> it = storedReports.iterator();
            while (it.hasNext()) {
                x(it.next());
            }
        }
    }

    private final void E(Exception exc, File eventFile) {
        D0 logger = getLogger();
        String message = exc.getMessage();
        if (message == null) {
            message = "Failed to send event";
        }
        logger.c(message, exc);
        b(SetsKt.d(eventFile));
    }

    private final boolean F(File file) {
        if (file.length() > 1048576) {
            return true;
        }
        return false;
    }

    private final boolean G(File file) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(5, -60);
        if (EventFilenameInfo.INSTANCE.f(file) < calendar.getTimeInMillis()) {
            return true;
        }
        return false;
    }

    private final void H() {
        if (i() && !this.isEmptyEventCallbackCalled) {
            this.onEventStoreEmptyCallback.invoke();
            this.isEmptyEventCallbackCalled = true;
        }
    }

    private final void I(File eventFile) {
        if (F(eventFile)) {
            getLogger().g("Discarding over-sized event (" + eventFile.length() + ") after failed delivery");
            t(eventFile);
            b(SetsKt.d(eventFile));
            return;
        }
        if (G(eventFile)) {
            getLogger().g("Discarding historical event (from " + C(eventFile) + ") after failed delivery");
            t(eventFile);
            b(SetsKt.d(eventFile));
            return;
        }
        a(SetsKt.d(eventFile));
        getLogger().g("Could not send previously saved error(s) to Bugsnag, will try again later");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(C6603k0 c6603k0) {
        List<File> listE = c6603k0.e();
        if (listE.isEmpty()) {
            c6603k0.getLogger().d("No regular events to flush to Bugsnag.");
        }
        c6603k0.B(listE);
        c6603k0.H();
    }

    private final void y() {
        List<File> listE = e();
        List<File> list = listE;
        File fileU = u(list);
        if (fileU != null) {
            listE.remove(fileU);
        }
        a(list);
        if (fileU != null) {
            getLogger().f("Attempting to send the most recent launch crash report");
            B(CollectionsKt.e(fileU));
            getLogger().f("Continuing with Bugsnag initialisation");
            return;
        }
        getLogger().d("No startupcrash events to flush to Bugsnag.");
    }

    public final Future<String> J(C6624v0.a streamable) {
        final String strK = k(streamable);
        if (strK == null) {
            return null;
        }
        try {
            return this.bgTaskService.e(R6.t.ERROR_REQUEST, new Callable() { // from class: com.bugsnag.android.i0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C6603k0.K(this.f64241a, strK);
                }
            });
        } catch (RejectedExecutionException unused) {
            getLogger().g("Failed to flush all on-disk errors, retaining unsent errors for later.");
            return null;
        }
    }
}
