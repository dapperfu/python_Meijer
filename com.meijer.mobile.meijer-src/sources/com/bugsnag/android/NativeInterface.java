package com.bugsnag.android;

import R6.ImmutableConfig;
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
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public class NativeInterface {
    private static Charset UTF8Charset = Charset.defaultCharset();

    @SuppressLint({"StaticFieldLeak"})
    private static C6617s client;

    class a implements Q0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Severity f63971a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f63972b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f63973c;

        a(Severity severity, String str, String str2) {
            this.f63971a = severity;
            this.f63972b = str;
            this.f63973c = str2;
        }

        @Override // com.bugsnag.android.Q0
        public boolean a(C6585b0 c6585b0) {
            c6585b0.t(this.f63971a);
            List<Y> listE = c6585b0.e();
            Y y10 = c6585b0.e().get(0);
            if (listE.isEmpty()) {
                return true;
            }
            y10.g(this.f63972b);
            y10.h(this.f63973c);
            Iterator<Y> it = listE.iterator();
            while (it.hasNext()) {
                it.next().i(ErrorType.C);
            }
            return true;
        }
    }

    public static void addMetadata(String str, String str2, Object obj) {
        getClient().a(str, str2, obj);
    }

    public static void deliverReport(byte[] bArr, byte[] bArr2, byte[] bArr3, String str, boolean z10) throws Throwable {
        if (bArr3 != null) {
            R6.q qVar = R6.q.f32021a;
            Map<? super String, ? extends Object> mapD = qVar.d(new ByteArrayInputStream(bArr2));
            deepMerge(qVar.d(new ByteArrayInputStream(bArr3)), mapD);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            qVar.f(mapD, byteArrayOutputStream);
            bArr2 = byteArrayOutputStream.toByteArray();
        }
        String str2 = new String(bArr2, UTF8Charset);
        String str3 = bArr == null ? null : new String(bArr, UTF8Charset);
        C6617s client2 = getClient();
        ImmutableConfig immutableConfigH = client2.h();
        if (str3 == null || str3.length() == 0 || !immutableConfigH.K()) {
            C6603k0 c6603k0L = client2.l();
            String strD = c6603k0L.D(str2, str);
            if (z10) {
                strD = strD.replace(".json", "startupcrash.json");
            }
            c6603k0L.d(str2, strD);
        }
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

    public static Map<String, Object> getApp() {
        HashMap map = new HashMap();
        C6602k c6602kF = getClient().f();
        C6604l c6604lE = c6602kF.e();
        map.put("version", c6604lE.getVersion());
        map.put("releaseStage", c6604lE.getReleaseStage());
        map.put(PreferencesHelper.PREF_ID, c6604lE.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        map.put("type", c6604lE.getType());
        map.put("buildUUID", c6604lE.b());
        map.put("duration", c6604lE.getDuration());
        map.put("durationInForeground", c6604lE.getDurationInForeground());
        map.put("versionCode", c6604lE.getVersionCode());
        map.put("inForeground", c6604lE.getInForeground());
        map.put("isLaunching", c6604lE.getIsLaunching());
        map.put("binaryArch", c6604lE.getBinaryArch());
        map.putAll(c6602kF.f());
        return map;
    }

    private static C6617s getClient() {
        C6617s c6617s = client;
        return c6617s != null ? c6617s : C6610o.b();
    }

    private static File getNativeReportPath(File file) {
        return new File(file, "bugsnag/native");
    }

    public static Map<String, String> getUser() {
        HashMap map = new HashMap();
        s1 s1VarU = getClient().u();
        map.put(PreferencesHelper.PREF_ID, s1VarU.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        map.put("name", s1VarU.getName());
        map.put("email", s1VarU.getEmail());
        return map;
    }

    public static void leaveBreadcrumb(byte[] bArr, BreadcrumbType breadcrumbType) {
        if (bArr == null) {
            return;
        }
        getClient().x(new String(bArr, UTF8Charset), new HashMap(), breadcrumbType);
    }

    public static void setClient(C6617s c6617s) {
        client = c6617s;
    }

    public static C6585b0 createEmptyEvent() {
        C6617s client2 = getClient();
        return new C6585b0(new C6589d0(null, client2.h(), a1.h("handledException"), client2.q().getMetadata().e()), client2.o());
    }

    public static C6585b0 createEvent(Throwable th2, C6617s c6617s, a1 a1Var) {
        return new C6585b0(th2, c6617s.h(), a1Var, c6617s.q().getMetadata(), c6617s.m().getFeatureFlags(), c6617s.f64376q);
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
        return getClient().h().getAppVersion();
    }

    public static List<Breadcrumb> getBreadcrumbs() {
        return getClient().g();
    }

    public static String getContext() {
        return getClient().i();
    }

    public static String[] getCpuAbi() {
        return getClient().k().j();
    }

    public static V0 getCurrentSession() {
        return getClient().f64374o.i();
    }

    public static Map<String, Object> getDevice() {
        Q qK = getClient().k();
        HashMap map = new HashMap(qK.k());
        W wI = qK.i(new Date().getTime());
        map.put("freeDisk", wI.getFreeDisk());
        map.put("freeMemory", wI.getFreeMemory());
        map.put("orientation", wI.getOrientation());
        map.put("time", wI.getTime());
        map.put("cpuAbi", wI.getCpuAbi());
        map.put("jailbroken", wI.getJailbroken());
        map.put(PreferencesHelper.PREF_ID, wI.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        map.put("locale", wI.getLocale());
        map.put("manufacturer", wI.getManufacturer());
        map.put("model", wI.getModel());
        map.put("osName", wI.getOsName());
        map.put("osVersion", wI.getOsVersion());
        map.put("runtimeVersions", wI.i());
        map.put("totalMemory", wI.getTotalMemory());
        return map;
    }

    public static Collection<String> getEnabledReleaseStages() {
        return getClient().h().k();
    }

    public static String getEndpoint() {
        return getClient().h().getEndpoints().getNotify();
    }

    public static LastRunInfo getLastRunInfo() {
        return getClient().n();
    }

    public static D0 getLogger() {
        return getClient().h().getLogger();
    }

    public static Map<String, Object> getMetadata() {
        return getClient().p();
    }

    private static File getPersistenceDirectory() {
        return getClient().h().x().getValue();
    }

    public static String getReleaseStage() {
        return getClient().h().getReleaseStage();
    }

    public static String getSessionEndpoint() {
        return getClient().h().getEndpoints().getSessions();
    }

    public static boolean isDiscardErrorClass(String str) {
        Collection<Pattern> collectionI = getClient().h().i();
        if (collectionI.isEmpty()) {
            return false;
        }
        Iterator<Pattern> it = collectionI.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    public static void markLaunchCompleted() {
        getClient().A();
    }

    public static void pauseSession() {
        getClient().F();
    }

    public static void registerSession(long j10, String str, int i10, int i11) {
        Date date;
        C6617s client2 = getClient();
        s1 s1VarU = client2.u();
        if (j10 > 0) {
            date = new Date(j10);
        } else {
            date = null;
        }
        client2.t().n(date, str, s1VarU, i10, i11);
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
        if (getClient().h().L(str)) {
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
        C6617s client2 = getClient();
        if (client2.h().L(str)) {
            return;
        }
        C6585b0 c6585b0CreateEmptyEvent = createEmptyEvent();
        c6585b0CreateEmptyEvent.t(severity);
        ArrayList arrayList = new ArrayList(nativeStackframeArr.length);
        for (NativeStackframe nativeStackframe : nativeStackframeArr) {
            arrayList.add(new c1(nativeStackframe));
        }
        c6585b0CreateEmptyEvent.e().add(new Y(new Z(str, str2, new d1(arrayList), ErrorType.C), client2.o()));
        getClient().H(c6585b0CreateEmptyEvent, null);
    }

    public static void deliverReport(File file) {
        C6603k0 c6603k0L = getClient().l();
        if (file.renameTo(new File(c6603k0L.getStorageDir(), file.getName()))) {
            c6603k0L.v();
        } else {
            file.delete();
        }
    }
}
