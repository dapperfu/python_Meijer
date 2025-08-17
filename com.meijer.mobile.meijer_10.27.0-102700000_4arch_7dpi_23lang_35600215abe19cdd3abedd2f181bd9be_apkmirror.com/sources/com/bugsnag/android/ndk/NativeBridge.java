package com.bugsnag.android.ndk;

import Q6.l;
import Q6.n;
import android.os.Build;
import com.bugsnag.android.InterfaceC6495t0;
import com.bugsnag.android.NativeInterface;
import com.bugsnag.android.T0;
import java.io.File;
import java.io.FileFilter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KDeclarationContainer;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJP\u0010&\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020 H\u0086 ¢\u0006\u0004\b&\u0010'J0\u0010,\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020 H\u0086 ¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b/\u00100J0\u00104\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0086 ¢\u0006\u0004\b4\u00105J(\u00108\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b8\u00109J(\u0010;\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u00107\u001a\u00020:H\u0086 ¢\u0006\u0004\b;\u0010<J(\u0010=\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u00107\u001a\u00020\rH\u0086 ¢\u0006\u0004\b=\u0010>J(\u0010?\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b?\u00109J\u0010\u0010@\u001a\u00020\u0010H\u0086 ¢\u0006\u0004\b@\u0010\u0012J\u0010\u0010A\u001a\u00020\u0010H\u0086 ¢\u0006\u0004\bA\u0010\u0012J\u0018\u0010B\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bB\u00100J \u0010C\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0010H\u0086 ¢\u0006\u0004\bE\u0010\u0012J\u0018\u0010G\u001a\u00020\u00102\u0006\u0010F\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bG\u00100J \u0010J\u001a\u00020\u00102\u0006\u0010H\u001a\u00020\r2\u0006\u0010I\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bJ\u0010KJ\u0018\u0010M\u001a\u00020\u00102\u0006\u0010L\u001a\u00020\rH\u0086 ¢\u0006\u0004\bM\u0010NJ\u0018\u0010O\u001a\u00020\u00102\u0006\u0010!\u001a\u00020 H\u0086 ¢\u0006\u0004\bO\u0010PJ\u0018\u0010R\u001a\u00020\u00102\u0006\u0010Q\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bR\u00100J\u0018\u0010T\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bT\u00100J\u0018\u0010U\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bU\u00100J\u0018\u0010V\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bV\u00100J\u0010\u0010X\u001a\u00020WH\u0086 ¢\u0006\u0004\bX\u0010YJ \u0010[\u001a\u00020\u00102\u0006\u0010S\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b[\u0010KJ\"\u0010]\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00072\b\u0010\\\u001a\u0004\u0018\u00010\u0007H\u0086 ¢\u0006\u0004\b]\u0010DJ\u0018\u0010^\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\b^\u00100J\u0010\u0010_\u001a\u00020\u0010H\u0086 ¢\u0006\u0004\b_\u0010\u0012J\u0010\u0010`\u001a\u00020\u0010H\u0086 ¢\u0006\u0004\b`\u0010\u0012J$\u0010b\u001a\u00020\u00102\u0012\u0010a\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u0006H\u0086 ¢\u0006\u0004\bb\u0010cJ\u0018\u0010e\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\be\u00100J\u0018\u0010f\u001a\u00020\u00102\u0006\u0010d\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bf\u00100J\u001e\u0010g\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u0006H\u0086 ¢\u0006\u0004\bg\u0010hJ\u001e\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006H\u0086 ¢\u0006\u0004\bi\u0010hJ\u0018\u0010k\u001a\u00020\u00102\u0006\u0010j\u001a\u00020\u0007H\u0086 ¢\u0006\u0004\bk\u00100J\u0018\u0010m\u001a\u00020\u00102\u0006\u0010l\u001a\u00020\rH\u0086 ¢\u0006\u0004\bm\u0010NJ\u0017\u0010p\u001a\u00020\u00102\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010v\u001a\u00020u8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010|\u001a\u00020{8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010~R\u0014\u0010$\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u007f¨\u0006\u0080\u0001"}, d2 = {"Lcom/bugsnag/android/ndk/NativeBridge;", "LQ6/l;", "LQ6/a;", "bgTaskService", "<init>", "(LQ6/a;)V", "", "", "", "metadata", "makeSafeMetadata", "(Ljava/util/Map;)Ljava/util/Map;", "msg", "", "isInvalidMessage", "(Ljava/lang/Object;)Z", "", "deliverPendingReports", "()V", "Lcom/bugsnag/android/T0$h;", "arg", "handleInstallMessage", "(Lcom/bugsnag/android/T0$h;)V", "Lcom/bugsnag/android/T0$c;", "handleAddMetadata", "(Lcom/bugsnag/android/T0$c;)V", "text", "makeSafe", "(Ljava/lang/String;)Ljava/lang/String;", "apiKey", "reportingDirectory", "lastRunInfoPath", "", "consecutiveLaunchCrashes", "autoDetectNdkCrashes", "apiLevel", "is32bit", "threadSendPolicy", "install", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZIZI)V", "sessionID", "key", "handledCount", "unhandledCount", "startedSession", "(Ljava/lang/String;Ljava/lang/String;II)V", "filePath", "deliverReportAtPath", "(Ljava/lang/String;)V", "name", "type", "timestamp", "addBreadcrumb", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "tab", "value", "addMetadataString", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "addMetadataDouble", "(Ljava/lang/String;Ljava/lang/String;D)V", "addMetadataBoolean", "(Ljava/lang/String;Ljava/lang/String;Z)V", "addMetadataOpaque", "addHandledEvent", "addUnhandledEvent", "clearMetadataTab", "removeMetadata", "(Ljava/lang/String;Ljava/lang/String;)V", "pausedSession", "context", "updateContext", "inForeground", "activityName", "updateInForeground", "(ZLjava/lang/String;)V", "isLaunching", "updateIsLaunching", "(Z)V", "updateLastRunInfo", "(I)V", "orientation", "updateOrientation", "newValue", "updateUserId", "updateUserEmail", "updateUserName", "", "getSignalUnwindStackFunction", "()J", "memoryTrimLevelDescription", "updateLowMemory", "variant", "addFeatureFlag", "clearFeatureFlag", "clearFeatureFlags", "refreshSymbolTable", "counts", "initCallbackCounts", "(Ljava/util/Map;)V", "callback", "notifyAddCallback", "notifyRemoveCallback", "getCurrentCallbackSetCounts", "()Ljava/util/Map;", "getCurrentNativeApiCallUsage", "data", "setStaticJsonData", "enabled", "setInternalMetricsEnabled", "Lcom/bugsnag/android/T0;", "event", "onStateChange", "(Lcom/bugsnag/android/T0;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "installed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/io/File;", "reportDirectory", "Ljava/io/File;", "Lcom/bugsnag/android/t0;", "logger", "Lcom/bugsnag/android/t0;", "LQ6/a;", "()Z", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class NativeBridge implements l {
    private final Q6.a bgTaskService;
    private final InterfaceC6495t0 logger;
    private final File reportDirectory;
    private final ReentrantLock lock = new ReentrantLock();
    private final AtomicBoolean installed = new AtomicBoolean(false);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Ljava/io/File;", "kotlin.jvm.PlatformType", "accept"}, k = 3, mv = {1, 4, 2})
    static final class a implements FileFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Regex f63510a;

        a(Regex regex) {
            this.f63510a = regex;
        }

        @Override // java.io.FileFilter
        public final boolean accept(File it) {
            Regex regex = this.f63510a;
            Intrinsics.f(it, "it");
            String name = it.getName();
            Intrinsics.f(name, "it.name");
            return regex.b(name);
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007H\u0096\u0001¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0013\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00100\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"com/bugsnag/android/ndk/NativeBridge$b", "", "", "", "key", "b", "(Ljava/lang/String;)Ljava/lang/Object;", "", "a", "(Ljava/lang/String;)Z", "value", "containsValue", "(Ljava/lang/Object;)Z", "isEmpty", "()Z", "", "", "c", "()Ljava/util/Set;", "entries", "d", "keys", "", "f", "()I", "size", "", "g", "()Ljava/util/Collection;", "values", "bugsnag-plugin-android-ndk_release"}, k = 1, mv = {1, 4, 2})
    public static final class b implements Map<String, Object>, KMappedMarker {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Map<String, ? extends Object> f63511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f63512b;

        public boolean a(String key) {
            return this.f63511a.containsKey(key);
        }

        public Set<Map.Entry<String, Object>> c() {
            return this.f63511a.entrySet();
        }

        @Override // java.util.Map
        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* synthetic */ Object compute(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* synthetic */ Object computeIfAbsent(String str, Function<? super String, ? extends Object> function) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* synthetic */ Object computeIfPresent(String str, BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public boolean containsValue(Object value) {
            return this.f63511a.containsValue(value);
        }

        public Set<String> d() {
            return this.f63511a.keySet();
        }

        public int f() {
            return this.f63511a.size();
        }

        public Collection<Object> g() {
            return this.f63511a.values();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f63511a.isEmpty();
        }

        @Override // java.util.Map
        public /* synthetic */ Object merge(String str, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* synthetic */ Object put(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void putAll(Map<? extends String, ? extends Object> map) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* synthetic */ Object putIfAbsent(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public Object remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* synthetic */ Object replace(String str, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public void replaceAll(BiFunction<? super String, ? super Object, ? extends Object> biFunction) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        b(Map map) {
            this.f63512b = map;
            this.f63511a = map;
        }

        public Object b(String key) {
            return OpaqueValue.INSTANCE.c(this.f63512b.get(key));
        }

        @Override // java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return a((String) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof String) {
                return b((String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public /* synthetic */ boolean replace(String str, Object obj, Object obj2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
            return c();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return d();
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return f();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<Object> values() {
            return g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()V"}, k = 3, mv = {1, 4, 2})
    static final /* synthetic */ class c extends FunctionReference implements Function0<Unit> {
        c(NativeBridge nativeBridge) {
            super(0, nativeBridge);
        }

        @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.KCallable
        public final String getName() {
            return "refreshSymbolTable";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final KDeclarationContainer getOwner() {
            return Reflection.b(NativeBridge.class);
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "refreshSymbolTable()V";
        }

        public final void a() {
            ((NativeBridge) this.receiver).refreshSymbolTable();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.f142422a;
        }
    }

    private final boolean isInvalidMessage(Object msg) {
        if (msg == null || !(msg instanceof T0)) {
            return true;
        }
        if (this.installed.get() || (msg instanceof T0.h)) {
            return false;
        }
        this.logger.g("Received message before INSTALL: " + msg);
        return true;
    }

    public final native void addBreadcrumb(String name, String type, String timestamp, Object metadata);

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

    public final native void deliverReportAtPath(String filePath);

    public final native Map<String, Integer> getCurrentCallbackSetCounts();

    public final native Map<String, Boolean> getCurrentNativeApiCallUsage();

    public final native long getSignalUnwindStackFunction();

    public final native void initCallbackCounts(Map<String, Integer> counts);

    public final native void install(String apiKey, String reportingDirectory, String lastRunInfoPath, int consecutiveLaunchCrashes, boolean autoDetectNdkCrashes, int apiLevel, boolean is32bit, int threadSendPolicy);

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
        Regex regex = new Regex(".*\\.crash$");
        this.lock.lock();
        try {
            try {
                File file = this.reportDirectory;
                if (file.exists()) {
                    File[] fileArrListFiles = file.listFiles(new a(regex));
                    if (fileArrListFiles != null) {
                        for (File file2 : fileArrListFiles) {
                            Intrinsics.f(file2, "file");
                            String absolutePath = file2.getAbsolutePath();
                            Intrinsics.f(absolutePath, "file.absolutePath");
                            deliverReportAtPath(absolutePath);
                        }
                    }
                } else {
                    this.logger.g("Payload directory does not exist, cannot read pending reports");
                }
            } catch (Exception e10) {
                this.logger.g("Failed to parse/write pending reports: " + e10);
            }
            this.lock.unlock();
        } catch (Throwable th2) {
            this.lock.unlock();
            throw th2;
        }
    }

    private final void handleAddMetadata(T0.c arg) {
        if (arg.key != null) {
            Object objC = OpaqueValue.INSTANCE.c(arg.value);
            if (objC instanceof String) {
                String str = arg.section;
                String str2 = arg.key;
                if (str2 == null) {
                    Intrinsics.t();
                }
                addMetadataString(str, str2, makeSafe((String) objC));
                return;
            }
            if (objC instanceof Boolean) {
                String str3 = arg.section;
                String str4 = arg.key;
                if (str4 == null) {
                    Intrinsics.t();
                }
                addMetadataBoolean(str3, str4, ((Boolean) objC).booleanValue());
                return;
            }
            if (objC instanceof Number) {
                String str5 = arg.section;
                String str6 = arg.key;
                if (str6 == null) {
                    Intrinsics.t();
                }
                addMetadataDouble(str5, str6, ((Number) objC).doubleValue());
                return;
            }
            if (objC instanceof OpaqueValue) {
                String str7 = arg.section;
                String str8 = arg.key;
                if (str8 == null) {
                    Intrinsics.t();
                }
                addMetadataOpaque(str7, str8, ((OpaqueValue) objC).getJson());
            }
        }
    }

    private final void handleInstallMessage(T0.h arg) throws Throwable {
        Throwable th2;
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            if (this.installed.get()) {
                try {
                    this.logger.g("Received duplicate setup message with arg: " + arg);
                } catch (Throwable th3) {
                    th2 = th3;
                    reentrantLock.unlock();
                    throw th2;
                }
            } else {
                String reportPath = new File(this.reportDirectory, UUID.randomUUID() + ".crash").getAbsolutePath();
                String strMakeSafe = makeSafe(arg.apiKey);
                Intrinsics.f(reportPath, "reportPath");
                try {
                    install(strMakeSafe, reportPath, makeSafe(arg.lastRunInfoPath), arg.consecutiveLaunchCrashes, arg.autoDetectNdkCrashes, Build.VERSION.SDK_INT, is32bit(), arg.sendThreads.ordinal());
                    this.installed.set(true);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            Unit unit = Unit.f142422a;
            reentrantLock.unlock();
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public NativeBridge(Q6.a aVar) {
        this.bgTaskService = aVar;
        File nativeReportPath = NativeInterface.getNativeReportPath();
        Intrinsics.f(nativeReportPath, "NativeInterface.getNativeReportPath()");
        this.reportDirectory = nativeReportPath;
        InterfaceC6495t0 logger = NativeInterface.getLogger();
        Intrinsics.f(logger, "NativeInterface.getLogger()");
        this.logger = logger;
    }

    private final boolean is32bit() {
        String[] cpuAbi = NativeInterface.getCpuAbi();
        Intrinsics.f(cpuAbi, "NativeInterface.getCpuAbi()");
        int length = cpuAbi.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            String it = cpuAbi[i10];
            Intrinsics.f(it, "it");
            if (StringsKt.c0(it, "64", false, 2, null)) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    private final String makeSafe(String text) {
        Charset charsetDefaultCharset = Charset.defaultCharset();
        Intrinsics.f(charsetDefaultCharset, "Charset.defaultCharset()");
        if (text != null) {
            byte[] bytes = text.getBytes(charsetDefaultCharset);
            Intrinsics.i(bytes, "(this as java.lang.String).getBytes(charset)");
            return new String(bytes, Charsets.UTF_8);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    private final Map<String, Object> makeSafeMetadata(Map<String, ? extends Object> metadata) {
        if (metadata.isEmpty()) {
            return metadata;
        }
        return new b(metadata);
    }

    @Override // Q6.l
    public void onStateChange(T0 event) throws Throwable {
        String strMakeSafe;
        if (!isInvalidMessage(event)) {
            if (event instanceof T0.h) {
                handleInstallMessage((T0.h) event);
                return;
            }
            if (Intrinsics.e(event, T0.g.f63242a)) {
                deliverPendingReports();
                return;
            }
            if (event instanceof T0.c) {
                handleAddMetadata((T0.c) event);
                return;
            }
            if (event instanceof T0.e) {
                clearMetadataTab(makeSafe(((T0.e) event).section));
                return;
            }
            String str = "";
            if (event instanceof T0.f) {
                T0.f fVar = (T0.f) event;
                String strMakeSafe2 = makeSafe(fVar.section);
                String str2 = fVar.key;
                if (str2 != null) {
                    str = str2;
                }
                removeMetadata(strMakeSafe2, makeSafe(str));
                return;
            }
            if (event instanceof T0.a) {
                T0.a aVar = (T0.a) event;
                addBreadcrumb(makeSafe(aVar.message), makeSafe(aVar.type.getType()), makeSafe(aVar.timestamp), makeSafeMetadata(aVar.metadata));
                return;
            }
            if (Intrinsics.e(event, T0.i.f63251a)) {
                addHandledEvent();
                return;
            }
            if (Intrinsics.e(event, T0.j.f63252a)) {
                addUnhandledEvent();
                return;
            }
            if (Intrinsics.e(event, T0.k.f63253a)) {
                pausedSession();
                return;
            }
            if (event instanceof T0.l) {
                T0.l lVar = (T0.l) event;
                startedSession(makeSafe(lVar.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String), makeSafe(lVar.startedAt), lVar.handledCount, lVar.getUnhandledCount());
                return;
            }
            if (event instanceof T0.m) {
                String str3 = ((T0.m) event).context;
                if (str3 != null) {
                    str = str3;
                }
                updateContext(makeSafe(str));
                return;
            }
            if (event instanceof T0.n) {
                T0.n nVar = (T0.n) event;
                boolean z10 = nVar.inForeground;
                String contextActivity = nVar.getContextActivity();
                if (contextActivity != null) {
                    str = contextActivity;
                }
                updateInForeground(z10, makeSafe(str));
                return;
            }
            if (event instanceof T0.p) {
                updateLastRunInfo(((T0.p) event).consecutiveLaunchCrashes);
                return;
            }
            if (event instanceof T0.o) {
                T0.o oVar = (T0.o) event;
                updateIsLaunching(oVar.isLaunching);
                if (!oVar.isLaunching) {
                    this.bgTaskService.c(n.DEFAULT, new com.bugsnag.android.ndk.a(new c(this)));
                    return;
                }
                return;
            }
            if (event instanceof T0.r) {
                String str4 = ((T0.r) event).orientation;
                if (str4 != null) {
                    str = str4;
                }
                updateOrientation(str);
                return;
            }
            if (event instanceof T0.s) {
                T0.s sVar = (T0.s) event;
                String str5 = sVar.user.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
                if (str5 == null) {
                    str5 = "";
                }
                updateUserId(makeSafe(str5));
                String name = sVar.user.getName();
                if (name == null) {
                    name = "";
                }
                updateUserName(makeSafe(name));
                String email = sVar.user.getEmail();
                if (email != null) {
                    str = email;
                }
                updateUserEmail(makeSafe(str));
                return;
            }
            if (event instanceof T0.q) {
                T0.q qVar = (T0.q) event;
                updateLowMemory(qVar.isLowMemory, qVar.memoryTrimLevelDescription);
                return;
            }
            if (event instanceof T0.b) {
                T0.b bVar = (T0.b) event;
                String strMakeSafe3 = makeSafe(bVar.name);
                String str6 = bVar.variant;
                if (str6 != null) {
                    strMakeSafe = makeSafe(str6);
                } else {
                    strMakeSafe = null;
                }
                addFeatureFlag(strMakeSafe3, strMakeSafe);
                return;
            }
            if (event instanceof T0.d) {
                clearFeatureFlag(makeSafe(((T0.d) event).name));
            }
        }
    }
}
