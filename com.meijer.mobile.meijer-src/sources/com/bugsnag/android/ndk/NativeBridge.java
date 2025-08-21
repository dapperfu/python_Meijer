package com.bugsnag.android.ndk;

import R6.b;
import R6.r;
import R6.t;
import android.os.Build;
import com.bugsnag.android.BreadcrumbType;
import com.bugsnag.android.D0;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.e1;
import java.io.File;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0006\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J0\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0082 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\b*\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ`\u0010*\u001a\u00020\r2\u0006\u0010 \u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\b2\u0006\u0010)\u001a\u00020\bH\u0086 ¢\u0006\u0004\b*\u0010+J0\u00100\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\b2\u0006\u0010/\u001a\u00020\bH\u0086 ¢\u0006\u0004\b0\u00101J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u00102J(\u00105\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b5\u00106J(\u00108\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u00104\u001a\u000207H\u0086 ¢\u0006\u0004\b8\u00109J(\u0010:\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\b:\u0010;J(\u0010<\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b<\u00106J\u0010\u0010=\u001a\u00020\rH\u0086 ¢\u0006\u0004\b=\u0010\u0011J\u0010\u0010>\u001a\u00020\rH\u0086 ¢\u0006\u0004\b>\u0010\u0011J\u0018\u0010?\u001a\u00020\r2\u0006\u00103\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b?\u0010@J \u0010A\u001a\u00020\r2\u0006\u00103\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\rH\u0086 ¢\u0006\u0004\bC\u0010\u0011J\u0018\u0010E\u001a\u00020\r2\u0006\u0010D\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bE\u0010@J \u0010H\u001a\u00020\r2\u0006\u0010F\u001a\u00020\u00132\u0006\u0010G\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bH\u0010IJ\u0018\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\bK\u0010LJ\u0018\u0010M\u001a\u00020\r2\u0006\u0010$\u001a\u00020\bH\u0086 ¢\u0006\u0004\bM\u0010NJ\u0018\u0010P\u001a\u00020\r2\u0006\u0010O\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bP\u0010@J\u0018\u0010R\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bR\u0010@J\u0018\u0010S\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bS\u0010@J\u0018\u0010T\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bT\u0010@J\u0010\u0010V\u001a\u00020UH\u0086 ¢\u0006\u0004\bV\u0010WJ \u0010Y\u001a\u00020\r2\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010X\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bY\u0010IJ\"\u0010[\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u0006H\u0086 ¢\u0006\u0004\b[\u0010BJ\u0018\u0010\\\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\\\u0010@J\u0010\u0010]\u001a\u00020\rH\u0086 ¢\u0006\u0004\b]\u0010\u0011J\u0010\u0010^\u001a\u00020\rH\u0086 ¢\u0006\u0004\b^\u0010\u0011J$\u0010a\u001a\u00020\r2\u0012\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0_H\u0086 ¢\u0006\u0004\ba\u0010bJ\u0018\u0010d\u001a\u00020\r2\u0006\u0010c\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bd\u0010@J\u0018\u0010e\u001a\u00020\r2\u0006\u0010c\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\be\u0010@J\u001e\u0010f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010_H\u0086 ¢\u0006\u0004\bf\u0010gJ\u001e\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010_H\u0086 ¢\u0006\u0004\bh\u0010gJ\u0018\u0010j\u001a\u00020\r2\u0006\u0010i\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\bj\u0010@J\u0018\u0010l\u001a\u00020\r2\u0006\u0010k\u001a\u00020\u0013H\u0086 ¢\u0006\u0004\bl\u0010LJ\u0017\u0010o\u001a\u00020\r2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\bo\u0010pR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010'\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010~¨\u0006\u007f"}, d2 = {"Lcom/bugsnag/android/ndk/NativeBridge;", "LR6/r;", "LR6/b;", "bgTaskService", "<init>", "(LR6/b;)V", "", "name", "", "type", "timestamp", "", "metadata", "", "addBreadcrumb", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Object;)V", "deliverPendingReports", "()V", "msg", "", "isInvalidMessage", "(Ljava/lang/Object;)Z", "Lcom/bugsnag/android/e1$h;", "arg", "handleInstallMessage", "(Lcom/bugsnag/android/e1$h;)V", "Lcom/bugsnag/android/e1$c;", "handleAddMetadata", "(Lcom/bugsnag/android/e1$c;)V", "Lcom/bugsnag/android/BreadcrumbType;", "toNativeValue", "(Lcom/bugsnag/android/BreadcrumbType;)I", "apiKey", "reportingDirectory", "lastRunInfoPath", "eventUUID", "consecutiveLaunchCrashes", "autoDetectNdkCrashes", "apiLevel", "is32bit", "threadSendPolicy", "maxBreadcrumbs", "install", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZII)V", "sessionID", "key", "handledCount", "unhandledCount", "startedSession", "(Ljava/lang/String;Ljava/lang/String;II)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "tab", "value", "addMetadataString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "addMetadataDouble", "(Ljava/lang/String;Ljava/lang/String;D)V", "addMetadataBoolean", "(Ljava/lang/String;Ljava/lang/String;Z)V", "addMetadataOpaque", "addHandledEvent", "addUnhandledEvent", "clearMetadataTab", "(Ljava/lang/String;)V", "removeMetadata", "(Ljava/lang/String;Ljava/lang/String;)V", "pausedSession", "context", "updateContext", "inForeground", "activityName", "updateInForeground", "(ZLjava/lang/String;)V", "isLaunching", "updateIsLaunching", "(Z)V", "updateLastRunInfo", "(I)V", "orientation", "updateOrientation", "newValue", "updateUserId", "updateUserEmail", "updateUserName", "", "getSignalUnwindStackFunction", "()J", "memoryTrimLevelDescription", "updateLowMemory", "variant", "addFeatureFlag", "clearFeatureFlag", "clearFeatureFlags", "refreshSymbolTable", "", "counts", "initCallbackCounts", "(Ljava/util/Map;)V", "callback", "notifyAddCallback", "notifyRemoveCallback", "getCurrentCallbackSetCounts", "()Ljava/util/Map;", "getCurrentNativeApiCallUsage", "data", "setStaticJsonData", "enabled", "setInternalMetricsEnabled", "Lcom/bugsnag/android/e1;", "event", "onStateChange", "(Lcom/bugsnag/android/e1;)V", "LR6/b;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "installed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/io/File;", "reportDirectory", "Ljava/io/File;", "Lcom/bugsnag/android/D0;", "logger", "Lcom/bugsnag/android/D0;", "()Z", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class NativeBridge implements r {
    private final b bgTaskService;
    private final ReentrantLock lock = new ReentrantLock();
    private final AtomicBoolean installed = new AtomicBoolean(false);
    private final File reportDirectory = NativeInterface.getNativeReportPath();
    private final D0 logger = NativeInterface.getLogger();

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BreadcrumbType.values().length];
            iArr[BreadcrumbType.ERROR.ordinal()] = 1;
            iArr[BreadcrumbType.LOG.ordinal()] = 2;
            iArr[BreadcrumbType.MANUAL.ordinal()] = 3;
            iArr[BreadcrumbType.NAVIGATION.ordinal()] = 4;
            iArr[BreadcrumbType.PROCESS.ordinal()] = 5;
            iArr[BreadcrumbType.REQUEST.ordinal()] = 6;
            iArr[BreadcrumbType.STATE.ordinal()] = 7;
            iArr[BreadcrumbType.USER.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final native void addBreadcrumb(String name, int type, String timestamp, Object metadata);

    private final boolean isInvalidMessage(Object msg) {
        if (msg == null || !(msg instanceof e1)) {
            return true;
        }
        if (this.installed.get() || (msg instanceof e1.h)) {
            return false;
        }
        this.logger.g(Intrinsics.q("Received message before INSTALL: ", msg));
        return true;
    }

    public final void addBreadcrumb(String name, String type, String timestamp, Object metadata) {
        BreadcrumbType breadcrumbType;
        BreadcrumbType[] breadcrumbTypeArrValues = BreadcrumbType.values();
        int length = breadcrumbTypeArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                breadcrumbType = null;
                break;
            }
            breadcrumbType = breadcrumbTypeArrValues[i10];
            i10++;
            if (Intrinsics.e(breadcrumbType.getType(), type)) {
                break;
            }
        }
        if (breadcrumbType == null) {
            breadcrumbType = BreadcrumbType.MANUAL;
        }
        addBreadcrumb(name, toNativeValue(breadcrumbType), timestamp, metadata);
    }

    public final native void addFeatureFlag(String name, String variant);

    public final native void addHandledEvent();

    public final native void addMetadataBoolean(String tab, String key, boolean value);

    public final native void addMetadataDouble(String tab, String key, double value);

    public final native void addMetadataOpaque(String tab, String key, String value);

    public final native void addMetadataString(String tab, String key, String value);

    public final native void addUnhandledEvent();

    public final native void clearFeatureFlag(String name);

    public final native void clearFeatureFlags();

    public final native void clearMetadataTab(String tab);

    public final native Map<String, Integer> getCurrentCallbackSetCounts();

    public final native Map<String, Boolean> getCurrentNativeApiCallUsage();

    public final native long getSignalUnwindStackFunction();

    public final native void initCallbackCounts(Map<String, Integer> counts);

    public final native void install(String apiKey, String reportingDirectory, String lastRunInfoPath, String eventUUID, int consecutiveLaunchCrashes, boolean autoDetectNdkCrashes, int apiLevel, boolean is32bit, int threadSendPolicy, int maxBreadcrumbs);

    public final native void notifyAddCallback(String callback);

    public final native void notifyRemoveCallback(String callback);

    public final native void pausedSession();

    public final native void refreshSymbolTable();

    public final native void removeMetadata(String tab, String key);

    public final native void setInternalMetricsEnabled(boolean enabled);

    public final native void setStaticJsonData(String data);

    public final native void startedSession(String sessionID, String key, int handledCount, int unhandledCount);

    public final native void updateContext(String context);

    public final native void updateInForeground(boolean inForeground, String activityName);

    public final native void updateIsLaunching(boolean isLaunching);

    public final native void updateLastRunInfo(int consecutiveLaunchCrashes);

    public final native void updateLowMemory(boolean newValue, String memoryTrimLevelDescription);

    public final native void updateOrientation(String orientation);

    public final native void updateUserEmail(String newValue);

    public final native void updateUserId(String newValue);

    public final native void updateUserName(String newValue);

    private final void deliverPendingReports() {
        T6.b bVar = new T6.b(this.logger, null, 2, null);
        File[] fileArrListFiles = this.reportDirectory.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        int length = fileArrListFiles.length;
        int i10 = 0;
        while (i10 < length) {
            File file = fileArrListFiles[i10];
            i10++;
            if (bVar.a(file)) {
                file.delete();
            } else {
                NativeInterface.deliverReport(file);
            }
        }
    }

    private final void handleAddMetadata(e1.c arg) {
        if (arg.key != null) {
            Object objC = OpaqueValue.INSTANCE.c(arg.value);
            if (objC instanceof String) {
                String str = arg.section;
                String str2 = arg.key;
                Intrinsics.g(str2);
                addMetadataString(str, str2, (String) objC);
                return;
            }
            if (objC instanceof Boolean) {
                String str3 = arg.section;
                String str4 = arg.key;
                Intrinsics.g(str4);
                addMetadataBoolean(str3, str4, ((Boolean) objC).booleanValue());
                return;
            }
            if (objC instanceof Number) {
                String str5 = arg.section;
                String str6 = arg.key;
                Intrinsics.g(str6);
                addMetadataDouble(str5, str6, ((Number) objC).doubleValue());
                return;
            }
            if (objC instanceof OpaqueValue) {
                String str7 = arg.section;
                String str8 = arg.key;
                Intrinsics.g(str8);
                addMetadataOpaque(str7, str8, ((OpaqueValue) objC).getJson());
            }
        }
    }

    private final void handleInstallMessage(e1.h arg) throws Throwable {
        Throwable th2;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.installed.get()) {
                try {
                    this.logger.g(Intrinsics.q("Received duplicate setup message with arg: ", arg));
                } catch (Throwable th3) {
                    th2 = th3;
                    reentrantLock.unlock();
                    throw th2;
                }
            } else {
                try {
                    install(arg.apiKey, this.reportDirectory.getAbsolutePath(), arg.lastRunInfoPath, UUID.randomUUID().toString(), arg.consecutiveLaunchCrashes, arg.autoDetectNdkCrashes, Build.VERSION.SDK_INT, is32bit(), arg.sendThreads.ordinal(), arg.maxBreadcrumbs);
                    this.installed.set(true);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            Unit unit = Unit.f143329a;
            reentrantLock.unlock();
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private final int toNativeValue(BreadcrumbType breadcrumbType) {
        switch (a.$EnumSwitchMapping$0[breadcrumbType.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public NativeBridge(b bVar) {
        this.bgTaskService = bVar;
    }

    private final boolean is32bit() {
        String[] cpuAbi = NativeInterface.getCpuAbi();
        int length = cpuAbi.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String str = cpuAbi[i10];
            i10++;
            if (StringsKt.d0(str, "64", false, 2, null)) {
                z10 = true;
                break;
            }
        }
        return !z10;
    }

    @Override // R6.r
    public void onStateChange(e1 event) throws Throwable {
        if (!isInvalidMessage(event)) {
            if (event instanceof e1.h) {
                handleInstallMessage((e1.h) event);
                return;
            }
            if (event instanceof e1.g) {
                deliverPendingReports();
                return;
            }
            if (event instanceof e1.c) {
                handleAddMetadata((e1.c) event);
                return;
            }
            if (event instanceof e1.e) {
                clearMetadataTab(((e1.e) event).section);
                return;
            }
            String str = "";
            if (event instanceof e1.f) {
                e1.f fVar = (e1.f) event;
                String str2 = fVar.section;
                String str3 = fVar.key;
                if (str3 != null) {
                    str = str3;
                }
                removeMetadata(str2, str);
                return;
            }
            if (event instanceof e1.a) {
                e1.a aVar = (e1.a) event;
                addBreadcrumb(aVar.message, toNativeValue(aVar.type), aVar.timestamp, aVar.metadata);
                return;
            }
            if (Intrinsics.e(event, e1.i.f64178a)) {
                addHandledEvent();
                return;
            }
            if (Intrinsics.e(event, e1.j.f64179a)) {
                addUnhandledEvent();
                return;
            }
            if (Intrinsics.e(event, e1.k.f64180a)) {
                pausedSession();
                return;
            }
            if (event instanceof e1.l) {
                e1.l lVar = (e1.l) event;
                startedSession(lVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String, lVar.startedAt, lVar.handledCount, lVar.getUnhandledCount());
                return;
            }
            if (event instanceof e1.m) {
                String str4 = ((e1.m) event).context;
                if (str4 != null) {
                    str = str4;
                }
                updateContext(str);
                return;
            }
            if (event instanceof e1.n) {
                e1.n nVar = (e1.n) event;
                boolean z10 = nVar.inForeground;
                String contextActivity = nVar.getContextActivity();
                if (contextActivity != null) {
                    str = contextActivity;
                }
                updateInForeground(z10, str);
                return;
            }
            if (event instanceof e1.p) {
                updateLastRunInfo(((e1.p) event).consecutiveLaunchCrashes);
                return;
            }
            if (event instanceof e1.o) {
                e1.o oVar = (e1.o) event;
                updateIsLaunching(oVar.isLaunching);
                if (!oVar.isLaunching) {
                    this.bgTaskService.d(t.DEFAULT, new Runnable() { // from class: T6.a
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f35913a.refreshSymbolTable();
                        }
                    });
                    return;
                }
                return;
            }
            if (event instanceof e1.r) {
                String str5 = ((e1.r) event).orientation;
                if (str5 != null) {
                    str = str5;
                }
                updateOrientation(str);
                return;
            }
            if (event instanceof e1.s) {
                e1.s sVar = (e1.s) event;
                String str6 = sVar.user.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
                if (str6 == null) {
                    str6 = "";
                }
                updateUserId(str6);
                String name = sVar.user.getName();
                if (name == null) {
                    name = "";
                }
                updateUserName(name);
                String email = sVar.user.getEmail();
                if (email != null) {
                    str = email;
                }
                updateUserEmail(str);
                return;
            }
            if (event instanceof e1.q) {
                e1.q qVar = (e1.q) event;
                updateLowMemory(qVar.isLowMemory, qVar.memoryTrimLevelDescription);
            } else if (event instanceof e1.b) {
                e1.b bVar = (e1.b) event;
                addFeatureFlag(bVar.name, bVar.variant);
            } else if (event instanceof e1.d) {
                clearFeatureFlag(((e1.d) event).name);
            }
        }
    }
}
