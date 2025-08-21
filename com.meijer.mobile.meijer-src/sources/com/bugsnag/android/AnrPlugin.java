package com.bugsnag.android;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\t\u0010\u0003J\u0010\u0010\n\u001a\u00020\u0006H\u0082 ¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0018\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/bugsnag/android/AnrPlugin;", "Lcom/bugsnag/android/T0;", "<init>", "()V", "", "unwindFunction", "", "setUnwindFunction", "(J)V", "enableAnrReporting", "disableAnrReporting", "", "clz", "Ljava/lang/Class;", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", "initNativePlugin", "Lcom/bugsnag/android/s;", "client", "performOneTimeSetup", "(Lcom/bugsnag/android/s;)V", "", "Lcom/bugsnag/android/NativeStackframe;", "nativeTrace", "notifyAnrDetected", "(Ljava/util/List;)V", "load", "unload", "Lcom/bugsnag/android/C0;", "libraryLoader", "Lcom/bugsnag/android/C0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/s;", "Lcom/bugsnag/android/c;", "collector", "Lcom/bugsnag/android/c;", "Companion", "a", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class AnrPlugin implements T0 {
    private static final String ANR_ERROR_CLASS = "ANR";
    private static final String ANR_ERROR_MSG = "Application did not respond to UI input";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report ANRs. See https://docs.bugsnag.com/platforms/android/anr-link-errors";
    private C6617s client;
    private final C0 libraryLoader = new C0();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);
    private final C6586c collector = new C6586c();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bugsnag/android/AnrPlugin$a;", "", "<init>", "()V", "", "Ljava/lang/StackTraceElement;", "javaTrace", "", "a", "([Ljava/lang/StackTraceElement;)Z", "", "ANR_ERROR_CLASS", "Ljava/lang/String;", "ANR_ERROR_MSG", "LOAD_ERR_MSG", "bugsnag-plugin-android-anr_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.AnrPlugin$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(StackTraceElement[] javaTrace) {
            if (javaTrace.length == 0) {
                return false;
            }
            return ((StackTraceElement) ArraysKt.f0(javaTrace)).isNativeMethod();
        }

        private Companion() {
        }
    }

    private final native void disableAnrReporting();

    private final native void enableAnrReporting();

    private final native void setUnwindFunction(long unwindFunction);

    private final void notifyAnrDetected(List<NativeStackframe> nativeTrace) {
        Object next;
        List<c1> listB;
        C6617s c6617s = null;
        try {
            C6617s c6617s2 = this.client;
            if (c6617s2 == null) {
                Intrinsics.x("client");
                c6617s2 = null;
            }
            if (c6617s2.f64360a.L(ANR_ERROR_CLASS)) {
                return;
            }
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            boolean zA = INSTANCE.a(stackTrace);
            RuntimeException runtimeException = new RuntimeException();
            runtimeException.setStackTrace(stackTrace);
            C6617s c6617s3 = this.client;
            if (c6617s3 == null) {
                Intrinsics.x("client");
                c6617s3 = null;
            }
            C6585b0 c6585b0CreateEvent = NativeInterface.createEvent(runtimeException, c6617s3, a1.h("anrError"));
            Y y10 = c6585b0CreateEvent.e().get(0);
            y10.g(ANR_ERROR_CLASS);
            y10.h(ANR_ERROR_MSG);
            if (zA) {
                List<NativeStackframe> list = nativeTrace;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new c1((NativeStackframe) it.next()));
                }
                y10.d().addAll(0, arrayList);
                Iterator<T> it2 = c6585b0CreateEvent.i().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((k1) next).a()) {
                            break;
                        }
                    }
                }
                k1 k1Var = (k1) next;
                if (k1Var != null && (listB = k1Var.b()) != null) {
                    listB.addAll(0, arrayList);
                }
            }
            C6586c c6586c = this.collector;
            C6617s c6617s4 = this.client;
            if (c6617s4 == null) {
                Intrinsics.x("client");
                c6617s4 = null;
            }
            c6586c.d(c6617s4, c6585b0CreateEvent);
        } catch (Exception e10) {
            C6617s c6617s5 = this.client;
            if (c6617s5 == null) {
                Intrinsics.x("client");
            } else {
                c6617s = c6617s5;
            }
            c6617s.f64376q.c("Internal error reporting ANR", e10);
        }
    }

    private final void performOneTimeSetup(C6617s client) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> clsLoadClass;
        T0 t0S;
        if (!this.libraryLoader.c("bugsnag-plugin-android-anr", client, new Q0() { // from class: com.bugsnag.android.d
            @Override // com.bugsnag.android.Q0
            public final boolean a(C6585b0 c6585b0) {
                return AnrPlugin.m18performOneTimeSetup$lambda1(c6585b0);
            }
        }) || (clsLoadClass = loadClass("com.bugsnag.android.NdkPlugin")) == null || (t0S = client.s(clsLoadClass)) == null) {
            return;
        }
        Object objInvoke = t0S.getClass().getMethod("getSignalUnwindStackFunction", null).invoke(t0S, null);
        if (objInvoke == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        setUnwindFunction(((Long) objInvoke).longValue());
    }

    @Override // com.bugsnag.android.T0
    public void load(C6617s client) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (!this.libraryLoader.a()) {
            client.f64376q.e(LOAD_ERR_MSG);
            return;
        }
        Looper mainLooper = Looper.getMainLooper();
        if (Intrinsics.e(Looper.myLooper(), mainLooper)) {
            initNativePlugin();
        } else {
            new Handler(mainLooper).postAtFrontOfQueue(new Runnable() { // from class: com.bugsnag.android.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f64147a.initNativePlugin();
                }
            });
        }
    }

    @Override // com.bugsnag.android.T0
    public void unload() {
        if (this.libraryLoader.a()) {
            disableAnrReporting();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initNativePlugin() {
        enableAnrReporting();
        C6617s c6617s = this.client;
        if (c6617s == null) {
            Intrinsics.x("client");
            c6617s = null;
        }
        c6617s.f64376q.f("Initialised ANR Plugin");
    }

    private final Class<?> loadClass(String clz) {
        try {
            return Class.forName(clz);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: performOneTimeSetup$lambda-1, reason: not valid java name */
    public static final boolean m18performOneTimeSetup$lambda1(C6585b0 c6585b0) {
        Y y10 = c6585b0.e().get(0);
        c6585b0.a("LinkError", "errorClass", y10.b());
        c6585b0.a("LinkError", "errorMessage", y10.c());
        y10.g("AnrLinkError");
        y10.h(LOAD_ERR_MSG);
        return true;
    }
}
