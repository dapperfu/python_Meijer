package com.bugsnag.android;

import Q6.ImmutableConfig;
import android.annotation.SuppressLint;
import io.constructor.data.local.PreferencesHelper;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class NativeInterface {
    private static Charset UTF8Charset = Charset.defaultCharset();

    @SuppressLint({"StaticFieldLeak"})
    private static C6487p client;

    class a implements F0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Severity f63158a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f63159b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f63160c;

        a(Severity severity, String str, String str2) {
            this.f63158a = severity;
            this.f63159b = str;
            this.f63160c = str2;
        }

        @Override // com.bugsnag.android.F0
        public boolean a(V v10) {
            v10.t(this.f63158a);
            List<S> listE = v10.e();
            S s10 = v10.e().get(0);
            if (listE.isEmpty()) {
                return true;
            }
            s10.g(this.f63159b);
            s10.h(this.f63160c);
            Iterator<S> it = listE.iterator();
            while (it.hasNext()) {
                it.next().i(ErrorType.C);
            }
            return true;
        }
    }

    public static void addMetadata(String str, String str2, Object obj) {
        getClient().a(str, str2, obj);
    }

    public static File getNativeReportPath() {
        return getNativeReportPath(getPersistenceDirectory());
    }

    public static void leaveBreadcrumb(String str, BreadcrumbType breadcrumbType) {
        if (str == null) {
            return;
        }
        getClient().x(str, new HashMap(), breadcrumbType);
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (bArr == null || bArr2 == null || stackTraceElementArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, stackTraceElementArr);
    }

    public static void setUser(String str, String str2, String str3) {
        getClient().R(str, str2, str3);
    }

    public static void addMetadata(String str, Map<String, ?> map) {
        getClient().b(str, map);
    }

    public static void clearMetadata(String str, String str2) {
        if (str2 == null) {
            getClient().d(str);
        } else {
            getClient().e(str, str2);
        }
    }

    public static void deliverReport(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, boolean z10) throws Throwable {
        if (bArr3 != null) {
            Q6.k kVar = Q6.k.f29894c;
            Map<? super String, ? extends Object> mapB = kVar.b(new ByteArrayInputStream(bArr2));
            deepMerge(kVar.b(new ByteArrayInputStream(bArr3)), mapB);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            kVar.d(mapB, byteArrayOutputStream);
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        String str2 = new String(bArr2, UTF8Charset);
        String str3 = bArr == null ? null : new String(bArr, UTF8Charset);
        C6487p client2 = getClient();
        ImmutableConfig immutableConfigI = client2.i();
        if (str3 == null || str3.length() == 0 || !immutableConfigI.H()) {
            C6458a0 c6458a0M = client2.m();
            String strR = c6458a0M.r(str2, str);
            if (z10) {
                strR = strR.replace(".json", "startupcrash.json");
            }
            c6458a0M.d(str2, strR);
        }
    }

    public static Map<String, Object> getApp() {
        HashMap map = new HashMap();
        C6471h c6471hG = getClient().g();
        C6473i c6473iE = c6471hG.e();
        map.put("version", c6473iE.getVersion());
        map.put("releaseStage", c6473iE.getReleaseStage());
        map.put(PreferencesHelper.PREF_ID, c6473iE.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        map.put("type", c6473iE.getType());
        map.put("buildUUID", c6473iE.getBuildUuid());
        map.put("duration", c6473iE.getDuration());
        map.put("durationInForeground", c6473iE.getDurationInForeground());
        map.put("versionCode", c6473iE.getVersionCode());
        map.put("inForeground", c6473iE.getInForeground());
        map.put("isLaunching", c6473iE.getIsLaunching());
        map.put("binaryArch", c6473iE.getBinaryArch());
        map.putAll(c6471hG.f());
        return map;
    }

    private static C6487p getClient() {
        C6487p c6487p = client;
        return c6487p != null ? c6487p : C6479l.b();
    }

    private static File getNativeReportPath(File file) {
        return new File(file, "bugsnag-native");
    }

    public static Map<String, String> getUser() {
        HashMap map = new HashMap();
        h1 h1VarV = getClient().v();
        map.put(PreferencesHelper.PREF_ID, h1VarV.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        map.put("name", h1VarV.getName());
        map.put("email", h1VarV.getEmail());
        return map;
    }

    public static void leaveBreadcrumb(byte[] bArr, BreadcrumbType breadcrumbType) {
        if (bArr == null) {
            return;
        }
        getClient().x(new String(bArr, UTF8Charset), new HashMap(), breadcrumbType);
    }

    public static void setClient(C6487p c6487p) {
        client = c6487p;
    }

    private static V createEmptyEvent() {
        C6487p client2 = getClient();
        return new V(new X(null, client2.i(), P0.h("handledException"), client2.r().getMetadata().e()), client2.p());
    }

    public static V createEvent(Throwable th2, C6487p c6487p, P0 p02) {
        return new V(th2, c6487p.i(), p02, c6487p.r().getMetadata(), c6487p.n().getFeatureFlags(), c6487p.f63540q);
    }

    private static void deepMerge(Map<String, Object> map, Map<String, Object> map2) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Object obj = map2.get(key);
            if ((value instanceof Map) && (obj instanceof Map)) {
                deepMerge((Map) value, (Map) obj);
            } else if ((value instanceof Collection) && (obj instanceof Collection)) {
                ((Collection) obj).addAll((Collection) value);
            } else {
                map2.put(key, value);
            }
        }
    }

    public static String getAppVersion() {
        return getClient().i().getAppVersion();
    }

    public static List<Breadcrumb> getBreadcrumbs() {
        return getClient().h();
    }

    public static String getContext() {
        return getClient().j();
    }

    public static String[] getCpuAbi() {
        return getClient().l().i();
    }

    public static K0 getCurrentSession() {
        return getClient().f63538o.h();
    }

    public static Map<String, Object> getDevice() {
        K kL = getClient().l();
        HashMap map = new HashMap(kL.j());
        P pH = kL.h(new Date().getTime());
        map.put("freeDisk", pH.getFreeDisk());
        map.put("freeMemory", pH.getFreeMemory());
        map.put("orientation", pH.getOrientation());
        map.put("time", pH.getTime());
        map.put("cpuAbi", pH.getCpuAbi());
        map.put("jailbroken", pH.getJailbroken());
        map.put(PreferencesHelper.PREF_ID, pH.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        map.put("locale", pH.getLocale());
        map.put("manufacturer", pH.getManufacturer());
        map.put("model", pH.getModel());
        map.put("osName", pH.getOsName());
        map.put("osVersion", pH.getOsVersion());
        map.put("runtimeVersions", pH.i());
        map.put("totalMemory", pH.getTotalMemory());
        return map;
    }

    public static Collection<String> getEnabledReleaseStages() {
        return getClient().i().k();
    }

    public static String getEndpoint() {
        return getClient().i().getEndpoints().getNotify();
    }

    public static LastRunInfo getLastRunInfo() {
        return getClient().o();
    }

    public static InterfaceC6495t0 getLogger() {
        return getClient().i().getLogger();
    }

    public static Map<String, Object> getMetadata() {
        return getClient().q();
    }

    private static File getPersistenceDirectory() {
        return getClient().i().v().getValue();
    }

    public static String getReleaseStage() {
        return getClient().i().getReleaseStage();
    }

    public static String getSessionEndpoint() {
        return getClient().i().getEndpoints().getSessions();
    }

    public static boolean isDiscardErrorClass(String str) {
        return getClient().i().i().contains(str);
    }

    public static void markLaunchCompleted() {
        getClient().A();
    }

    public static void pauseSession() {
        getClient().F();
    }

    public static void registerSession(long j10, String str, int i10, int i11) {
        Date date;
        C6487p client2 = getClient();
        h1 h1VarV = client2.v();
        if (j10 > 0) {
            date = new Date(j10);
        } else {
            date = null;
        }
        client2.u().p(date, str, h1VarV, i10, i11);
    }

    public static boolean resumeSession() {
        return getClient().M();
    }

    public static void setAutoDetectAnrs(boolean z10) {
        getClient().N(z10);
    }

    public static void setAutoNotify(boolean z10) {
        getClient().O(z10);
    }

    public static void setBinaryArch(String str) {
        getClient().P(str);
    }

    public static void setContext(String str) {
        getClient().Q(str);
    }

    public static void setUser(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        setUser(bArr == null ? null : new String(bArr, UTF8Charset), bArr2 == null ? null : new String(bArr2, UTF8Charset), bArr3 != null ? new String(bArr3, UTF8Charset) : null);
    }

    public static void startSession() {
        getClient().V();
    }

    public static void leaveBreadcrumb(String str, String str2, Map<String, Object> map) {
        getClient().x(str, map, BreadcrumbType.valueOf(str2.toUpperCase(Locale.US)));
    }

    public static void notify(String str, String str2, Severity severity, StackTraceElement[] stackTraceElementArr) {
        if (getClient().i().I(str)) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException();
        runtimeException.setStackTrace(stackTraceElementArr);
        getClient().C(runtimeException, new a(severity, str, str2));
    }

    public static void notify(byte[] bArr, byte[] bArr2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        if (bArr == null || bArr2 == null || nativeStackframeArr == null) {
            return;
        }
        notify(new String(bArr, UTF8Charset), new String(bArr2, UTF8Charset), severity, nativeStackframeArr);
    }

    public static void notify(String str, String str2, Severity severity, NativeStackframe[] nativeStackframeArr) {
        C6487p client2 = getClient();
        if (client2.i().I(str)) {
            return;
        }
        V vCreateEmptyEvent = createEmptyEvent();
        vCreateEmptyEvent.t(severity);
        ArrayList arrayList = new ArrayList(nativeStackframeArr.length);
        for (NativeStackframe nativeStackframe : nativeStackframeArr) {
            arrayList.add(new R0(nativeStackframe));
        }
        vCreateEmptyEvent.e().add(new S(new T(str, str2, new S0(arrayList), ErrorType.C), client2.p()));
        getClient().H(vCreateEmptyEvent, null);
    }
}
