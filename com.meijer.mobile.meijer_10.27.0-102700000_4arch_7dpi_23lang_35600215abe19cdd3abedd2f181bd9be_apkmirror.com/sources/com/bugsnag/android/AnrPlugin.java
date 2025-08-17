package com.bugsnag.android;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\u0003J\u0010\u0010\n\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/bugsnag/android/AnrPlugin;", "Lcom/bugsnag/android/I0;", "<init>", "()V", "", "unwindFunction", "", "setUnwindFunction", "(J)V", "enableAnrReporting", "disableAnrReporting", "", "clz", "Ljava/lang/Class;", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", "initNativePlugin", "Lcom/bugsnag/android/p;", "client", "performOneTimeSetup", "(Lcom/bugsnag/android/p;)V", "", "Lcom/bugsnag/android/NativeStackframe;", "nativeTrace", "notifyAnrDetected", "(Ljava/util/List;)V", "load", "unload", "Lcom/bugsnag/android/s0;", "libraryLoader", "Lcom/bugsnag/android/s0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/p;", "Lcom/bugsnag/android/b;", "collector", "Lcom/bugsnag/android/b;", "Companion", "a", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class AnrPlugin implements I0 {
    private static final String ANR_ERROR_CLASS = "ANR";
    private static final String ANR_ERROR_MSG = "Application did not respond to UI input";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors";
    private C6487p client;
    private final C6493s0 libraryLoader = new C6493s0();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);
    private final C6459b collector = new C6459b();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/AnrPlugin$a;", "", "<init>", "()V", "", "Ljava/lang/StackTraceElement;", "javaTrace", "", "a", "([Ljava/lang/StackTraceElement;)Z", "", "ANR_ERROR_CLASS", "Ljava/lang/String;", "ANR_ERROR_MSG", "LOAD_ERR_MSG", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.AnrPlugin$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public final boolean a(StackTraceElement[] javaTrace) {
            if (javaTrace.length == 0) {
                return false;
            }
            return ((StackTraceElement) ArraysKt.f0(javaTrace)).isNativeMethod();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 2})
    static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            AnrPlugin.this.initNativePlugin();
        }
    }

    private final native void disableAnrReporting();

    private final native void enableAnrReporting();

    private final native void setUnwindFunction(long unwindFunction);

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/bugsnag/android/V;", "it", "", "a", "(Lcom/bugsnag/android/V;)Z"}, k = 3, mv = {1, 4, 2})
    static final class c implements F0 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f63050a = new c();

        c() {
        }

        @Override // com.bugsnag.android.F0
        public final boolean a(V v10) {
            S error = v10.e().get(0);
            Intrinsics.f(error, "error");
            error.g("AnrLinkError");
            error.h(AnrPlugin.LOAD_ERR_MSG);
            return true;
        }
    }

    private final void notifyAnrDetected(List<NativeStackframe> nativeTrace) {
        Object next;
        List<R0> listB;
        try {
            C6487p c6487p = this.client;
            if (c6487p == null) {
                Intrinsics.y("client");
            }
            if (c6487p.f63524a.I(ANR_ERROR_CLASS)) {
                return;
            }
            Looper mainLooper = Looper.getMainLooper();
            Intrinsics.f(mainLooper, "Looper.getMainLooper()");
            Thread thread = mainLooper.getThread();
            Intrinsics.f(thread, "Looper.getMainLooper().thread");
            StackTraceElement[] stackTrace = thread.getStackTrace();
            Companion companion = INSTANCE;
            Intrinsics.f(stackTrace, "stackTrace");
            boolean zA = companion.a(stackTrace);
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.setStackTrace(stackTrace);
            C6487p c6487p2 = this.client;
            if (c6487p2 == null) {
                Intrinsics.y("client");
            }
            V vCreateEvent = NativeInterface.createEvent(runtimeException, c6487p2, P0.h("anrError"));
            Intrinsics.f(vCreateEvent, "NativeInterface.createEv…REASON_ANR)\n            )");
            S err = vCreateEvent.e().get(0);
            Intrinsics.f(err, "err");
            err.g(ANR_ERROR_CLASS);
            err.h(ANR_ERROR_MSG);
            if (zA) {
                List<NativeStackframe> list = nativeTrace;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new R0((NativeStackframe) it.next()));
                }
                err.d().addAll(0, arrayList);
                List<Z0> listI = vCreateEvent.i();
                Intrinsics.f(listI, "event.threads");
                Iterator<T> it2 = listI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((Z0) next).a()) {
                            break;
                        }
                    }
                }
                Z0 z02 = (Z0) next;
                if (z02 != null && (listB = z02.b()) != null) {
                    listB.addAll(0, arrayList);
                }
            }
            C6459b c6459b = this.collector;
            C6487p c6487p3 = this.client;
            if (c6487p3 == null) {
                Intrinsics.y("client");
            }
            c6459b.d(c6487p3, vCreateEvent);
        } catch (Exception e10) {
            C6487p c6487p4 = this.client;
            if (c6487p4 == null) {
                Intrinsics.y("client");
            }
            c6487p4.f63540q.c("Internal error reporting ANR", e10);
        }
    }

    private final void performOneTimeSetup(C6487p client) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        I0 i0T;
        this.libraryLoader.c("bugsnag-plugin-android-anr", client, c.f63050a);
        Class<?> clsLoadClass = loadClass("com.bugsnag.android.NdkPlugin");
        if (clsLoadClass == null || (i0T = client.t(clsLoadClass)) == null) {
            return;
        }
        Object objInvoke = i0T.getClass().getMethod("getSignalUnwindStackFunction", null).invoke(i0T, null);
        if (objInvoke == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Long");
        }
        setUnwindFunction(((Long) objInvoke).longValue());
    }

    @Override // com.bugsnag.android.I0
    public void load(C6487p client) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (!this.libraryLoader.a()) {
            client.f63540q.e(LOAD_ERR_MSG);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Intrinsics.e(Looper.myLooper(), mainLooper)) {
            initNativePlugin();
        } else {
            new Handler(mainLooper).postAtFrontOfQueue(new b());
        }
    }

    @Override // com.bugsnag.android.I0
    public void unload() {
        if (this.libraryLoader.a()) {
            disableAnrReporting();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNativePlugin() {
        enableAnrReporting();
        C6487p c6487p = this.client;
        if (c6487p == null) {
            Intrinsics.y("client");
        }
        c6487p.f63540q.f("Initialised ANR Plugin");
    }

    private final Class<?> loadClass(String clz) {
        try {
            return Class.forName(clz);
        } catch (Throwable unused) {
            return null;
        }
    }
}
