package com.bugsnag.android;

import com.bugsnag.android.d1;
import io.constructor.data.local.PreferencesHelper;
import j$.util.DesugarTimeZone;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000\u0085\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u00014\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000e\u001a\u00020\r2\u0016\u0010\u000b\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\u00112\u0016\u0010\u0010\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00192\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010\u001e\u001a\u00020\u001d2\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010\"\u001a\u00020!2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020%2\u0014\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0000¢\u0006\u0004\b&\u0010'J+\u0010+\u001a\u00020*2\u001a\u0010)\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n0(H\u0000¢\u0006\u0004\b+\u0010,J9\u00102\u001a\u0002012\u0016\u0010\u000b\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n2\u0006\u0010.\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b2\u00103R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00107¨\u00068"}, d2 = {"Lcom/bugsnag/android/m;", "", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(Lcom/bugsnag/android/t0;)V", "", "Ljava/util/Date;", "j", "(Ljava/lang/String;)Ljava/util/Date;", "", "map", "apiKey", "Lcom/bugsnag/android/X;", "g", "(Ljava/util/Map;Ljava/lang/String;)Lcom/bugsnag/android/X;", "error", "Lcom/bugsnag/android/T;", "d", "(Ljava/util/Map;)Lcom/bugsnag/android/T;", "user", "Lcom/bugsnag/android/h1;", "h", "(Ljava/util/Map;)Lcom/bugsnag/android/h1;", "breadcrumb", "Lcom/bugsnag/android/k;", "b", "(Ljava/util/Map;)Lcom/bugsnag/android/k;", "app", "Lcom/bugsnag/android/i;", "a", "(Ljava/util/Map;)Lcom/bugsnag/android/i;", "device", "Lcom/bugsnag/android/P;", "c", "(Ljava/util/Map;)Lcom/bugsnag/android/P;", "thread", "Lcom/bugsnag/android/a1;", "f", "(Ljava/util/Map;)Lcom/bugsnag/android/a1;", "", "trace", "Lcom/bugsnag/android/S0;", "e", "(Ljava/util/List;)Lcom/bugsnag/android/S0;", "", "unhandled", "Lcom/bugsnag/android/Severity;", "severity", "Lcom/bugsnag/android/P0;", "i", "(Ljava/util/Map;ZLcom/bugsnag/android/Severity;)Lcom/bugsnag/android/P0;", "com/bugsnag/android/m$a", "Lcom/bugsnag/android/m$a;", "ndkDateFormatHolder", "Lcom/bugsnag/android/t0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6481m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a ndkDateFormatHolder = new a();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/bugsnag/android/m$a", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "a", "()Ljava/text/DateFormat;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.m$a */
    public static final class a extends ThreadLocal<DateFormat> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            return simpleDateFormat;
        }

        a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final X g(Map<? super String, ? extends Object> map, String apiKey) {
        X x10 = new X(apiKey, this.logger, null, null, null, null, null, null, null, null, null, null, null, 8188, null);
        Object obj = map.get("exceptions");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            List<S> listH = x10.h();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listH.add(new S(d((Map) it.next()), this.logger));
            }
        }
        Object obj2 = map.get("user");
        if (!(obj2 instanceof Map)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'user'");
            }
            throw new IllegalArgumentException("json property 'user' not of expected type, found " + obj2.getClass().getName());
        }
        x10.z(h((Map) obj2));
        Object obj3 = map.get("metaData");
        if (!(obj3 instanceof Map)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'metaData'");
            }
            throw new IllegalArgumentException("json property 'metaData' not of expected type, found " + obj3.getClass().getName());
        }
        for (Map.Entry entry : ((Map) obj3).entrySet()) {
            x10.c((String) entry.getKey(), (Map) entry.getValue());
        }
        Object obj4 = map.get("featureFlags");
        if (!(obj4 instanceof List)) {
            if (obj4 == null) {
                throw new IllegalStateException("cannot find json property 'featureFlags'");
            }
            throw new IllegalArgumentException("json property 'featureFlags' not of expected type, found " + obj4.getClass().getName());
        }
        for (Map map2 : (List) obj4) {
            Object obj5 = map2.get("featureFlag");
            if (!(obj5 instanceof String)) {
                if (obj5 == null) {
                    throw new IllegalStateException("cannot find json property 'featureFlag'");
                }
                throw new IllegalArgumentException("json property 'featureFlag' not of expected type, found " + obj5.getClass().getName());
            }
            String str = (String) obj5;
            Object obj6 = map2.get("variant");
            if (!(obj6 instanceof String)) {
                obj6 = null;
            }
            x10.a(str, (String) obj6);
        }
        Object obj7 = map.get("breadcrumbs");
        if (!(obj7 instanceof List)) {
            if (obj7 == null) {
                throw new IllegalStateException("cannot find json property 'breadcrumbs'");
            }
            throw new IllegalArgumentException("json property 'breadcrumbs' not of expected type, found " + obj7.getClass().getName());
        }
        List<Breadcrumb> listF = x10.f();
        Iterator it2 = ((List) obj7).iterator();
        while (it2.hasNext()) {
            listF.add(new Breadcrumb(b((Map) it2.next()), this.logger));
        }
        Object obj8 = map.get("context");
        if (!(obj8 instanceof String)) {
            obj8 = null;
        }
        x10.s((String) obj8);
        Object obj9 = map.get("groupingHash");
        if (!(obj9 instanceof String)) {
            obj9 = null;
        }
        x10.u((String) obj9);
        Object obj10 = map.get("app");
        if (!(obj10 instanceof Map)) {
            if (obj10 == null) {
                throw new IllegalStateException("cannot find json property 'app'");
            }
            throw new IllegalArgumentException("json property 'app' not of expected type, found " + obj10.getClass().getName());
        }
        x10.q(a((Map) obj10));
        Object obj11 = map.get("device");
        if (!(obj11 instanceof Map)) {
            if (obj11 == null) {
                throw new IllegalStateException("cannot find json property 'device'");
            }
            throw new IllegalArgumentException("json property 'device' not of expected type, found " + obj11.getClass().getName());
        }
        x10.t(c((Map) obj11));
        Object obj12 = map.get("session");
        if (!(obj12 instanceof Map)) {
            obj12 = null;
        }
        Map map3 = (Map) obj12;
        if (map3 != null) {
            x10.session = new K0(map3, this.logger, apiKey);
            Unit unit = Unit.f142422a;
        }
        Object obj13 = map.get("threads");
        if (!(obj13 instanceof List)) {
            obj13 = null;
        }
        List list2 = (List) obj13;
        if (list2 != null) {
            List<Z0> listM = x10.m();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                listM.add(new Z0(f((Map) it3.next()), this.logger));
            }
        }
        Object obj14 = map.get("projectPackages");
        List list3 = obj14 instanceof List ? obj14 : null;
        if (list3 != null) {
            x10.w(list3);
            Unit unit2 = Unit.f142422a;
        }
        Object obj15 = map.get("severity");
        if (!(obj15 instanceof String)) {
            if (obj15 == null) {
                throw new IllegalStateException("cannot find json property 'severity'");
            }
            throw new IllegalArgumentException("json property 'severity' not of expected type, found " + obj15.getClass().getName());
        }
        Severity severityA = Severity.INSTANCE.a((String) obj15);
        Object obj16 = map.get("unhandled");
        if (obj16 instanceof Boolean) {
            x10.D(i(map, ((Boolean) obj16).booleanValue(), severityA));
            x10.p();
            x10.v(new Q6.i(TypeIntrinsics.d(map.get("usage"))));
            return x10;
        }
        if (obj16 == null) {
            throw new IllegalStateException("cannot find json property 'unhandled'");
        }
        throw new IllegalArgumentException("json property 'unhandled' not of expected type, found " + obj16.getClass().getName());
    }

    public final C6473i a(Map<String, ? extends Object> app) {
        Object obj = app.get("binaryArch");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = app.get(PreferencesHelper.PREF_ID);
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        Object obj3 = app.get("releaseStage");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str3 = (String) obj3;
        Object obj4 = app.get("version");
        if (!(obj4 instanceof String)) {
            obj4 = null;
        }
        String str4 = (String) obj4;
        Object obj5 = app.get("codeBundleId");
        if (!(obj5 instanceof String)) {
            obj5 = null;
        }
        String str5 = (String) obj5;
        Object obj6 = app.get("buildUUID");
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        String str6 = (String) obj6;
        Object obj7 = app.get("type");
        if (!(obj7 instanceof String)) {
            obj7 = null;
        }
        String str7 = (String) obj7;
        Object obj8 = app.get("versionCode");
        if (!(obj8 instanceof Number)) {
            obj8 = null;
        }
        Number number = (Number) obj8;
        Integer numValueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        Object obj9 = app.get("duration");
        if (!(obj9 instanceof Number)) {
            obj9 = null;
        }
        Number number2 = (Number) obj9;
        Long lValueOf = number2 != null ? Long.valueOf(number2.longValue()) : null;
        Object obj10 = app.get("durationInForeground");
        if (!(obj10 instanceof Number)) {
            obj10 = null;
        }
        Number number3 = (Number) obj10;
        Long lValueOf2 = number3 != null ? Long.valueOf(number3.longValue()) : null;
        Object obj11 = app.get("inForeground");
        if (!(obj11 instanceof Boolean)) {
            obj11 = null;
        }
        Boolean bool = (Boolean) obj11;
        Object obj12 = app.get("isLaunching");
        return new C6473i(str, str2, str3, str4, str5, str6, str7, numValueOf, lValueOf, lValueOf2, bool, (Boolean) (obj12 instanceof Boolean ? obj12 : null));
    }

    public final C6477k b(Map<String, ? extends Object> breadcrumb) {
        Object obj = breadcrumb.get("name");
        if (!(obj instanceof String)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'name'");
            }
            throw new IllegalArgumentException("json property 'name' not of expected type, found " + obj.getClass().getName());
        }
        String str = (String) obj;
        Object obj2 = breadcrumb.get("type");
        if (!(obj2 instanceof String)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + obj2.getClass().getName());
        }
        BreadcrumbType breadcrumbTypeA = BreadcrumbType.INSTANCE.a((String) obj2);
        if (breadcrumbTypeA == null) {
            breadcrumbTypeA = BreadcrumbType.MANUAL;
        }
        Object obj3 = breadcrumb.get("metaData");
        if (!TypeIntrinsics.o(obj3)) {
            obj3 = null;
        }
        Map map = (Map) obj3;
        Object obj4 = breadcrumb.get("timestamp");
        if (obj4 instanceof String) {
            return new C6477k(str, breadcrumbTypeA, map, j((String) obj4));
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'timestamp'");
        }
        throw new IllegalArgumentException("json property 'timestamp' not of expected type, found " + obj4.getClass().getName());
    }

    public final P c(Map<String, ? extends Object> device) {
        String[] strArr;
        Map linkedHashMap;
        Object obj = device.get("manufacturer");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = device.get("model");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        Object obj3 = device.get("osVersion");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str3 = (String) obj3;
        Object obj4 = device.get("cpuAbi");
        if (!(obj4 instanceof List)) {
            obj4 = null;
        }
        List list = (List) obj4;
        if (list != null) {
            Object[] array = list.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            strArr = (String[]) array;
        } else {
            strArr = null;
        }
        J j10 = new J(str, str2, str3, null, null, null, null, null, strArr);
        Object obj5 = device.get("jailbroken");
        if (!(obj5 instanceof Boolean)) {
            obj5 = null;
        }
        Boolean bool = (Boolean) obj5;
        Object obj6 = device.get(PreferencesHelper.PREF_ID);
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        String str4 = (String) obj6;
        Object obj7 = device.get("locale");
        if (!(obj7 instanceof String)) {
            obj7 = null;
        }
        String str5 = (String) obj7;
        Object obj8 = device.get("totalMemory");
        if (!(obj8 instanceof Number)) {
            obj8 = null;
        }
        Number number = (Number) obj8;
        Long lValueOf = number != null ? Long.valueOf(number.longValue()) : null;
        Object obj9 = device.get("runtimeVersions");
        if (!(obj9 instanceof Map)) {
            obj9 = null;
        }
        Map map = (Map) obj9;
        if (map == null || (linkedHashMap = MapsKt.D(map)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        Object obj10 = device.get("freeDisk");
        if (!(obj10 instanceof Number)) {
            obj10 = null;
        }
        Number number2 = (Number) obj10;
        Long lValueOf2 = number2 != null ? Long.valueOf(number2.longValue()) : null;
        Object obj11 = device.get("freeMemory");
        if (!(obj11 instanceof Number)) {
            obj11 = null;
        }
        Number number3 = (Number) obj11;
        Long lValueOf3 = number3 != null ? Long.valueOf(number3.longValue()) : null;
        Object obj12 = device.get("orientation");
        if (!(obj12 instanceof String)) {
            obj12 = null;
        }
        String str6 = (String) obj12;
        Object obj13 = device.get("time");
        if (!(obj13 instanceof String)) {
            obj13 = null;
        }
        String str7 = (String) obj13;
        return new P(j10, bool, str4, str5, lValueOf, linkedHashMap, lValueOf2, lValueOf3, str6, str7 != null ? j(str7) : null);
    }

    public final T d(Map<? super String, ? extends Object> error) {
        Object obj = error.get("errorClass");
        if (!(obj instanceof String)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'errorClass'");
            }
            throw new IllegalArgumentException("json property 'errorClass' not of expected type, found " + obj.getClass().getName());
        }
        String str = (String) obj;
        Object obj2 = error.get("message");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        Object obj3 = error.get("type");
        if (!(obj3 instanceof String)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + obj3.getClass().getName());
        }
        String str3 = (String) obj3;
        ErrorType errorTypeA = ErrorType.INSTANCE.a(str3);
        if (errorTypeA == null) {
            throw new IllegalArgumentException("unknown ErrorType: '" + str3 + '\'');
        }
        Object obj4 = error.get("stacktrace");
        if (obj4 instanceof List) {
            return new T(str, str2, e((List) obj4), errorTypeA);
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'stacktrace'");
        }
        throw new IllegalArgumentException("json property 'stacktrace' not of expected type, found " + obj4.getClass().getName());
    }

    public final S0 e(List<? extends Map<String, ? extends Object>> trace) {
        List<? extends Map<String, ? extends Object>> list = trace;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new R0((Map<String, ? extends Object>) it.next()));
        }
        return new S0(arrayList);
    }

    public final a1 f(Map<String, ? extends Object> thread) {
        S0 s02;
        Object obj = thread.get(PreferencesHelper.PREF_ID);
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        long jLongValue = number != null ? number.longValue() : 0L;
        Object obj2 = thread.get("name");
        if (!(obj2 instanceof String)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'name'");
            }
            throw new IllegalArgumentException("json property 'name' not of expected type, found " + obj2.getClass().getName());
        }
        String str = (String) obj2;
        d1.Companion companion = d1.INSTANCE;
        Object obj3 = thread.get("type");
        if (!(obj3 instanceof String)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + obj3.getClass().getName());
        }
        d1 d1VarA = companion.a((String) obj3);
        if (d1VarA == null) {
            d1VarA = d1.ANDROID;
        }
        boolean zE = Intrinsics.e(thread.get("errorReportingThread"), Boolean.TRUE);
        Object obj4 = thread.get("state");
        if (obj4 instanceof String) {
            String str2 = (String) obj4;
            Object obj5 = thread.get("stacktrace");
            List<? extends Map<String, ? extends Object>> list = (List) (obj5 instanceof List ? obj5 : null);
            if (list == null || (s02 = e(list)) == null) {
                s02 = new S0(CollectionsKt.m());
            }
            return new a1(jLongValue, str, d1VarA, zE, str2, s02);
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'state'");
        }
        throw new IllegalArgumentException("json property 'state' not of expected type, found " + obj4.getClass().getName());
    }

    public final h1 h(Map<String, ? extends Object> user) {
        Object obj = user.get(PreferencesHelper.PREF_ID);
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = user.get("email");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        Object obj3 = user.get("name");
        return new h1(str, str2, (String) (obj3 instanceof String ? obj3 : null));
    }

    public final P0 i(Map<? super String, ? extends Object> map, boolean unhandled, Severity severity) {
        Set setEntrySet;
        Object obj = map.get("severityReason");
        if (!(obj instanceof Map)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'severityReason'");
            }
            throw new IllegalArgumentException("json property 'severityReason' not of expected type, found " + obj.getClass().getName());
        }
        Map map2 = (Map) obj;
        Object obj2 = map2.get("unhandledOverridden");
        if (!(obj2 instanceof Boolean)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'unhandledOverridden'");
            }
            throw new IllegalArgumentException("json property 'unhandledOverridden' not of expected type, found " + obj2.getClass().getName());
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Object obj3 = map2.get("type");
        if (!(obj3 instanceof String)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + obj3.getClass().getName());
        }
        String str = (String) obj3;
        boolean z10 = zBooleanValue ? !unhandled : unhandled;
        Object obj4 = map2.get("attributes");
        if (obj4 != null ? obj4 instanceof Map : true) {
            Map map3 = (Map) obj4;
            Map.Entry entry = (map3 == null || (setEntrySet = map3.entrySet()) == null) ? null : (Map.Entry) CollectionsKt.V0(setEntrySet);
            return new P0(str, severity, unhandled, z10, entry != null ? (String) entry.getValue() : null, entry != null ? (String) entry.getKey() : null);
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'attributes'");
        }
        throw new IllegalArgumentException("json property 'attributes' not of expected type, found " + obj4.getClass().getName());
    }

    public C6481m(InterfaceC6495t0 interfaceC6495t0) {
        this.logger = interfaceC6495t0;
    }

    private final Date j(String str) throws ParseException {
        try {
            return Q6.d.a(str);
        } catch (IllegalArgumentException unused) {
            DateFormat dateFormat = this.ndkDateFormatHolder.get();
            if (dateFormat == null) {
                Intrinsics.t();
            }
            Date date = dateFormat.parse(str);
            if (date != null) {
                return date;
            }
            throw new IllegalArgumentException("cannot parse date " + str);
        }
    }
}
