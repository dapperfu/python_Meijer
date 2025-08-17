package com.bugsnag.android;

import com.bugsnag.android.ndk.NativeBridge;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 52\u00020\u0001:\u00016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0005\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0003J\u0010\u0010\b\u001a\u00020\u0007H\u0082 ¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00130\u001a¢\u0006\u0004\b\u001e\u0010\u001dJ!\u0010 \u001a\u00020\u00042\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b%\u0010$J!\u0010(\u001a\u00020\u00042\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&0\u001a¢\u0006\u0004\b(\u0010!R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010/R(\u00101\u001a\u0004\u0018\u00010\f2\b\u00100\u001a\u0004\u0018\u00010\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00067"}, d2 = {"Lcom/bugsnag/android/NdkPlugin;", "Lcom/bugsnag/android/I0;", "<init>", "()V", "", "enableCrashReporting", "disableCrashReporting", "", "getBinaryArch", "()Ljava/lang/String;", "Lcom/bugsnag/android/p;", "client", "Lcom/bugsnag/android/ndk/NativeBridge;", "initNativeBridge", "(Lcom/bugsnag/android/p;)Lcom/bugsnag/android/ndk/NativeBridge;", "performOneTimeSetup", "(Lcom/bugsnag/android/p;)V", "load", "unload", "", "enabled", "setInternalMetricsEnabled", "(Z)V", "", "getSignalUnwindStackFunction", "()J", "", "", "getCurrentCallbackSetCounts", "()Ljava/util/Map;", "getCurrentNativeApiCallUsage", "counts", "initCallbackCounts", "(Ljava/util/Map;)V", "callback", "notifyAddCallback", "(Ljava/lang/String;)V", "notifyRemoveCallback", "", "data", "setStaticData", "Lcom/bugsnag/android/s0;", "libraryLoader", "Lcom/bugsnag/android/s0;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "oneTimeSetupPerformed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lcom/bugsnag/android/p;", "<set-?>", "nativeBridge", "Lcom/bugsnag/android/ndk/NativeBridge;", "getNativeBridge", "()Lcom/bugsnag/android/ndk/NativeBridge;", "Companion", "a", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class NdkPlugin implements I0 {
    private static final a Companion = new a(null);

    @Deprecated
    private static final String LOAD_ERR_MSG = "Native library could not be linked. Bugsnag will not report NDK errors. See https://docs.bugsnag.com/platforms/android/ndk-link-errors";
    private C6487p client;
    private NativeBridge nativeBridge;
    private final C6493s0 libraryLoader = new C6493s0();
    private final AtomicBoolean oneTimeSetupPerformed = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/NdkPlugin$a;", "", "<init>", "()V", "", "LOAD_ERR_MSG", "Ljava/lang/String;", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final native void disableCrashReporting();

    private final native void enableCrashReporting();

    private final native String getBinaryArch();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/bugsnag/android/V;", "it", "", "a", "(Lcom/bugsnag/android/V;)Z"}, k = 3, mv = {1, 4, 2})
    static final class b implements F0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f63161a = new b();

        b() {
        }

        @Override // com.bugsnag.android.F0
        public final boolean a(V v10) {
            S error = v10.e().get(0);
            Intrinsics.f(error, "error");
            error.g("NdkLinkError");
            a unused = NdkPlugin.Companion;
            error.h(NdkPlugin.LOAD_ERR_MSG);
            return true;
        }
    }

    private final NativeBridge initNativeBridge(C6487p client) {
        Q6.a aVar = client.f63549z;
        Intrinsics.f(aVar, "client.bgTaskService");
        NativeBridge nativeBridge = new NativeBridge(aVar);
        client.c(nativeBridge);
        client.T();
        return nativeBridge;
    }

    private final void performOneTimeSetup(C6487p client) {
        this.libraryLoader.c("bugsnag-ndk", client, b.f63161a);
        if (!this.libraryLoader.a()) {
            client.f63540q.e(LOAD_ERR_MSG);
        } else {
            client.P(getBinaryArch());
            this.nativeBridge = initNativeBridge(client);
        }
    }

    public final Map<String, Integer> getCurrentCallbackSetCounts() {
        Map<String, Integer> currentCallbackSetCounts;
        NativeBridge nativeBridge = this.nativeBridge;
        return (nativeBridge == null || (currentCallbackSetCounts = nativeBridge.getCurrentCallbackSetCounts()) == null) ? MapsKt.k() : currentCallbackSetCounts;
    }

    public final Map<String, Boolean> getCurrentNativeApiCallUsage() {
        Map<String, Boolean> currentNativeApiCallUsage;
        NativeBridge nativeBridge = this.nativeBridge;
        return (nativeBridge == null || (currentNativeApiCallUsage = nativeBridge.getCurrentNativeApiCallUsage()) == null) ? MapsKt.k() : currentNativeApiCallUsage;
    }

    public final NativeBridge getNativeBridge() {
        return this.nativeBridge;
    }

    public final long getSignalUnwindStackFunction() {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            return nativeBridge.getSignalUnwindStackFunction();
        }
        return 0L;
    }

    public final void initCallbackCounts(Map<String, Integer> counts) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.initCallbackCounts(counts);
        }
    }

    @Override // com.bugsnag.android.I0
    public void load(C6487p client) {
        this.client = client;
        if (!this.oneTimeSetupPerformed.getAndSet(true)) {
            performOneTimeSetup(client);
        }
        if (this.libraryLoader.a()) {
            enableCrashReporting();
            client.f63540q.f("Initialised NDK Plugin");
        }
    }

    public final void notifyAddCallback(String callback) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.notifyAddCallback(callback);
        }
    }

    public final void notifyRemoveCallback(String callback) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.notifyRemoveCallback(callback);
        }
    }

    public final void setInternalMetricsEnabled(boolean enabled) {
        NativeBridge nativeBridge = this.nativeBridge;
        if (nativeBridge != null) {
            nativeBridge.setInternalMetricsEnabled(enabled);
        }
    }

    public final void setStaticData(Map<String, ? extends Object> data) {
        StringWriter stringWriter = new StringWriter();
        try {
            C6482m0 c6482m0 = new C6482m0(stringWriter);
            try {
                c6482m0.e0(data);
                Unit unit = Unit.f142422a;
                CloseableKt.a(c6482m0, null);
                CloseableKt.a(stringWriter, null);
                String string = stringWriter.toString();
                Intrinsics.f(string, "StringWriter().apply { u…ue(data) } } }.toString()");
                NativeBridge nativeBridge = this.nativeBridge;
                if (nativeBridge != null) {
                    nativeBridge.setStaticJsonData(string);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.a(stringWriter, th2);
                throw th3;
            }
        }
    }

    @Override // com.bugsnag.android.I0
    public void unload() {
        C6487p c6487p;
        if (this.libraryLoader.a()) {
            disableCrashReporting();
            NativeBridge nativeBridge = this.nativeBridge;
            if (nativeBridge == null || (c6487p = this.client) == null) {
                return;
            }
            c6487p.L(nativeBridge);
        }
    }
}
