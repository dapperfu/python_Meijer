package com.bugsnag.android;

import S6.ValueProvider;
import com.bugsnag.android.ErrorType;
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
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0095\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0001<\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0015\u001a\u00020\u00142\u0016\u0010\u0012\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0019\u001a\u00020\u00182\u0016\u0010\u0017\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u001c2\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020 2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0000¢\u0006\u0004\b!\u0010\"J%\u0010%\u001a\u00020$2\u0014\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0000¢\u0006\u0004\b%\u0010&J%\u0010)\u001a\u00020(2\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0000¢\u0006\u0004\b)\u0010*J%\u0010-\u001a\u00020,2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0011H\u0000¢\u0006\u0004\b-\u0010.J+\u00102\u001a\u0002012\u001a\u00100\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00110/H\u0000¢\u0006\u0004\b2\u00103J9\u00109\u001a\u0002082\u0016\u0010\u0012\u001a\u0012\u0012\u0006\b\u0000\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00112\u0006\u00105\u001a\u0002042\b\u00107\u001a\u0004\u0018\u000106H\u0000¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010;R\u0014\u0010>\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010=¨\u0006?"}, d2 = {"Lcom/bugsnag/android/p;", "", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(Lcom/bugsnag/android/D0;)V", "", "Ljava/util/Date;", "l", "(Ljava/lang/String;)Ljava/util/Date;", "traceId", "Ljava/util/UUID;", "j", "(Ljava/lang/String;)Ljava/util/UUID;", "", "k", "(Ljava/lang/String;)Ljava/lang/Long;", "", "map", "apiKey", "Lcom/bugsnag/android/d0;", "g", "(Ljava/util/Map;Ljava/lang/String;)Lcom/bugsnag/android/d0;", "error", "Lcom/bugsnag/android/Z;", "d", "(Ljava/util/Map;)Lcom/bugsnag/android/Z;", "user", "Lcom/bugsnag/android/s1;", "h", "(Ljava/util/Map;)Lcom/bugsnag/android/s1;", "breadcrumb", "Lcom/bugsnag/android/n;", "b", "(Ljava/util/Map;)Lcom/bugsnag/android/n;", "app", "Lcom/bugsnag/android/l;", "a", "(Ljava/util/Map;)Lcom/bugsnag/android/l;", "device", "Lcom/bugsnag/android/W;", "c", "(Ljava/util/Map;)Lcom/bugsnag/android/W;", "thread", "Lcom/bugsnag/android/l1;", "f", "(Ljava/util/Map;)Lcom/bugsnag/android/l1;", "", "trace", "Lcom/bugsnag/android/d1;", "e", "(Ljava/util/List;)Lcom/bugsnag/android/d1;", "", "unhandled", "Lcom/bugsnag/android/Severity;", "severity", "Lcom/bugsnag/android/a1;", "i", "(Ljava/util/Map;ZLcom/bugsnag/android/Severity;)Lcom/bugsnag/android/a1;", "Lcom/bugsnag/android/D0;", "com/bugsnag/android/p$a", "Lcom/bugsnag/android/p$a;", "ndkDateFormatHolder", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.bugsnag.android.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6612p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a ndkDateFormatHolder = new a();

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/bugsnag/android/p$a", "Ljava/lang/ThreadLocal;", "Ljava/text/DateFormat;", "a", "()Ljava/text/DateFormat;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.p$a */
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

    private final UUID j(String traceId) {
        if (traceId == null || traceId.length() != 32) {
            return null;
        }
        String strSubstring = traceId.substring(0, 16);
        Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        Long lK = k(strSubstring);
        if (lK == null) {
            return null;
        }
        long jLongValue = lK.longValue();
        String strSubstring2 = traceId.substring(16);
        Intrinsics.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
        Long lK2 = k(strSubstring2);
        if (lK2 == null) {
            return null;
        }
        return new UUID(jLongValue, lK2.longValue());
    }

    public final d1 e(List<? extends Map<String, ? extends Object>> trace) {
        ArrayList arrayList = new ArrayList(trace.size());
        Iterator<T> it = trace.iterator();
        while (it.hasNext()) {
            arrayList.add(new c1((Map<String, ? extends Object>) it.next()));
        }
        return new d1(arrayList);
    }

    public final C6604l a(Map<String, ? extends Object> app) {
        Object obj = app.get("binaryArch");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = app.get(PreferencesHelper.PREF_ID);
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = app.get("releaseStage");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = app.get("version");
        String str4 = obj4 instanceof String ? (String) obj4 : null;
        Object obj5 = app.get("codeBundleId");
        String str5 = obj5 instanceof String ? (String) obj5 : null;
        Object obj6 = app.get("buildUUID");
        String str6 = obj6 instanceof String ? (String) obj6 : null;
        ValueProvider valueProvider = str6 == null ? null : new ValueProvider(str6);
        Object obj7 = app.get("type");
        String str7 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = app.get("versionCode");
        Number number = obj8 instanceof Number ? (Number) obj8 : null;
        Integer numValueOf = number == null ? null : Integer.valueOf(number.intValue());
        Object obj9 = app.get("duration");
        Number number2 = obj9 instanceof Number ? (Number) obj9 : null;
        Long lValueOf = number2 == null ? null : Long.valueOf(number2.longValue());
        Object obj10 = app.get("durationInForeground");
        Number number3 = obj10 instanceof Number ? (Number) obj10 : null;
        Long lValueOf2 = number3 == null ? null : Long.valueOf(number3.longValue());
        Object obj11 = app.get("inForeground");
        Boolean bool = obj11 instanceof Boolean ? (Boolean) obj11 : null;
        Object obj12 = app.get("isLaunching");
        return new C6604l(str, str2, str3, str4, str5, valueProvider, str7, numValueOf, lValueOf, lValueOf2, bool, obj12 instanceof Boolean ? (Boolean) obj12 : null);
    }

    public final C6608n b(Map<String, ? extends Object> breadcrumb) {
        Object obj = breadcrumb.get("name");
        if (!(obj instanceof String)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'name'");
            }
            throw new IllegalArgumentException("json property 'name' not of expected type, found " + ((Object) obj.getClass().getName()));
        }
        String str = (String) obj;
        Object obj2 = breadcrumb.get("type");
        if (!(obj2 instanceof String)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + ((Object) obj2.getClass().getName()));
        }
        BreadcrumbType breadcrumbTypeA = BreadcrumbType.INSTANCE.a((String) obj2);
        if (breadcrumbTypeA == null) {
            breadcrumbTypeA = BreadcrumbType.MANUAL;
        }
        Object obj3 = breadcrumb.get("metaData");
        Map map = TypeIntrinsics.o(obj3) ? (Map) obj3 : null;
        Object obj4 = breadcrumb.get("timestamp");
        if (obj4 instanceof String) {
            return new C6608n(str, breadcrumbTypeA, map, l((String) obj4));
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'timestamp'");
        }
        throw new IllegalArgumentException("json property 'timestamp' not of expected type, found " + ((Object) obj4.getClass().getName()));
    }

    public final W c(Map<String, ? extends Object> device) {
        String[] strArr;
        Object obj = device.get("manufacturer");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = device.get("model");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = device.get("osVersion");
        String str3 = obj3 instanceof String ? (String) obj3 : null;
        Object obj4 = device.get("cpuAbi");
        List list = obj4 instanceof List ? (List) obj4 : null;
        if (list == null) {
            strArr = null;
        } else {
            Object[] array = list.toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            strArr = (String[]) array;
        }
        N n10 = new N(str, str2, str3, null, null, null, null, null, strArr);
        Object obj5 = device.get("jailbroken");
        Boolean bool = obj5 instanceof Boolean ? (Boolean) obj5 : null;
        Object obj6 = device.get(PreferencesHelper.PREF_ID);
        String str4 = obj6 instanceof String ? (String) obj6 : null;
        Object obj7 = device.get("locale");
        String str5 = obj7 instanceof String ? (String) obj7 : null;
        Object obj8 = device.get("totalMemory");
        Number number = obj8 instanceof Number ? (Number) obj8 : null;
        Long lValueOf = number == null ? null : Long.valueOf(number.longValue());
        Object obj9 = device.get("runtimeVersions");
        Map map = obj9 instanceof Map ? (Map) obj9 : null;
        Map mapD = map == null ? null : MapsKt.D(map);
        if (mapD == null) {
            mapD = new LinkedHashMap();
        }
        Object obj10 = device.get("freeDisk");
        Number number2 = obj10 instanceof Number ? (Number) obj10 : null;
        Long lValueOf2 = number2 == null ? null : Long.valueOf(number2.longValue());
        Object obj11 = device.get("freeMemory");
        Number number3 = obj11 instanceof Number ? (Number) obj11 : null;
        Long lValueOf3 = number3 == null ? null : Long.valueOf(number3.longValue());
        Object obj12 = device.get("orientation");
        String str6 = obj12 instanceof String ? (String) obj12 : null;
        Object obj13 = device.get("time");
        String str7 = obj13 instanceof String ? (String) obj13 : null;
        return new W(n10, bool, str4, str5, lValueOf, mapD, lValueOf2, lValueOf3, str6, str7 != null ? l(str7) : null);
    }

    public final Z d(Map<? super String, ? extends Object> error) {
        Object obj = error.get("errorClass");
        if (!(obj instanceof String)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'errorClass'");
            }
            throw new IllegalArgumentException("json property 'errorClass' not of expected type, found " + ((Object) obj.getClass().getName()));
        }
        String str = (String) obj;
        Object obj2 = error.get("message");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = error.get("type");
        if (!(obj3 instanceof String)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + ((Object) obj3.getClass().getName()));
        }
        String str3 = (String) obj3;
        ErrorType errorTypeA = ErrorType.INSTANCE.a(str3);
        if (errorTypeA == null) {
            throw new IllegalArgumentException("unknown ErrorType: '" + str3 + '\'');
        }
        Object obj4 = error.get("stacktrace");
        if (obj4 instanceof List) {
            return new Z(str, str2, e((List) obj4), errorTypeA);
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'stacktrace'");
        }
        throw new IllegalArgumentException("json property 'stacktrace' not of expected type, found " + ((Object) obj4.getClass().getName()));
    }

    public final l1 f(Map<String, ? extends Object> thread) {
        String strValueOf = String.valueOf(thread.get(PreferencesHelper.PREF_ID));
        Object obj = thread.get("name");
        if (!(obj instanceof String)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'name'");
            }
            throw new IllegalArgumentException("json property 'name' not of expected type, found " + ((Object) obj.getClass().getName()));
        }
        String str = (String) obj;
        ErrorType.Companion companion = ErrorType.INSTANCE;
        Object obj2 = thread.get("type");
        if (!(obj2 instanceof String)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + ((Object) obj2.getClass().getName()));
        }
        ErrorType errorTypeA = companion.a((String) obj2);
        if (errorTypeA == null) {
            errorTypeA = ErrorType.ANDROID;
        }
        ErrorType errorType = errorTypeA;
        boolean zE = Intrinsics.e(thread.get("errorReportingThread"), Boolean.TRUE);
        Object obj3 = thread.get("state");
        String str2 = obj3 instanceof String ? (String) obj3 : null;
        if (str2 == null) {
            str2 = "";
        }
        Object obj4 = thread.get("stacktrace");
        List<? extends Map<String, ? extends Object>> list = obj4 instanceof List ? (List) obj4 : null;
        d1 d1VarE = list != null ? e(list) : null;
        if (d1VarE == null) {
            d1VarE = new d1(new ArrayList());
        }
        return new l1(strValueOf, str, errorType, zE, str2, d1VarE);
    }

    public final C6589d0 g(Map<? super String, ? extends Object> map, String apiKey) {
        C6589d0 c6589d0 = new C6589d0(apiKey, this.logger, null, null, null, null, null, null, null, null, null, null, null, 8188, null);
        Object obj = map.get("exceptions");
        List list = obj instanceof List ? (List) obj : null;
        if (list != null) {
            List<Y> listI = c6589d0.i();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listI.add(new Y(d((Map) it.next()), this.logger));
            }
        }
        Object obj2 = map.get("user");
        if (!(obj2 instanceof Map)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'user'");
            }
            throw new IllegalArgumentException("json property 'user' not of expected type, found " + ((Object) obj2.getClass().getName()));
        }
        c6589d0.B(h((Map) obj2));
        Object obj3 = map.get("metaData");
        Map mapK = obj3 instanceof Map ? (Map) obj3 : null;
        if (mapK == null) {
            mapK = MapsKt.k();
        }
        for (Map.Entry entry : mapK.entrySet()) {
            c6589d0.c((String) entry.getKey(), (Map) entry.getValue());
        }
        Object obj4 = map.get("featureFlags");
        List<Map> listM = obj4 instanceof List ? (List) obj4 : null;
        if (listM == null) {
            listM = CollectionsKt.m();
        }
        for (Map map2 : listM) {
            Object obj5 = map2.get("featureFlag");
            if (!(obj5 instanceof String)) {
                if (obj5 == null) {
                    throw new IllegalStateException("cannot find json property 'featureFlag'");
                }
                throw new IllegalArgumentException("json property 'featureFlag' not of expected type, found " + ((Object) obj5.getClass().getName()));
            }
            String str = (String) obj5;
            Object obj6 = map2.get("variant");
            c6589d0.a(str, obj6 instanceof String ? (String) obj6 : null);
        }
        Object obj7 = map.get("breadcrumbs");
        List listM2 = obj7 instanceof List ? (List) obj7 : null;
        if (listM2 == null) {
            listM2 = CollectionsKt.m();
        }
        List<Breadcrumb> listF = c6589d0.f();
        Iterator it2 = listM2.iterator();
        while (it2.hasNext()) {
            listF.add(new Breadcrumb(b((Map) it2.next()), this.logger));
        }
        Object obj8 = map.get("context");
        c6589d0.t(obj8 instanceof String ? (String) obj8 : null);
        Object obj9 = map.get("groupingHash");
        c6589d0.v(obj9 instanceof String ? (String) obj9 : null);
        Object obj10 = map.get("app");
        if (!(obj10 instanceof Map)) {
            if (obj10 == null) {
                throw new IllegalStateException("cannot find json property 'app'");
            }
            throw new IllegalArgumentException("json property 'app' not of expected type, found " + ((Object) obj10.getClass().getName()));
        }
        c6589d0.r(a((Map) obj10));
        Object obj11 = map.get("device");
        if (!(obj11 instanceof Map)) {
            if (obj11 == null) {
                throw new IllegalStateException("cannot find json property 'device'");
            }
            throw new IllegalArgumentException("json property 'device' not of expected type, found " + ((Object) obj11.getClass().getName()));
        }
        c6589d0.u(c((Map) obj11));
        Object obj12 = map.get("session");
        Map map3 = obj12 instanceof Map ? (Map) obj12 : null;
        if (map3 != null) {
            c6589d0.session = new V0(map3, this.logger, apiKey);
            Unit unit = Unit.f143329a;
        }
        Object obj13 = map.get("threads");
        List list2 = obj13 instanceof List ? (List) obj13 : null;
        if (list2 != null) {
            List<k1> listN = c6589d0.n();
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                listN.add(new k1(f((Map) it3.next()), this.logger));
            }
        }
        Object obj14 = map.get("projectPackages");
        List list3 = obj14 instanceof List ? (List) obj14 : null;
        if (list3 != null) {
            c6589d0.x(list3);
            Unit unit2 = Unit.f143329a;
        }
        Object obj15 = map.get("severity");
        if (!(obj15 instanceof String)) {
            if (obj15 == null) {
                throw new IllegalStateException("cannot find json property 'severity'");
            }
            throw new IllegalArgumentException("json property 'severity' not of expected type, found " + ((Object) obj15.getClass().getName()));
        }
        Severity severityA = Severity.INSTANCE.a((String) obj15);
        Object obj16 = map.get("unhandled");
        if (!(obj16 instanceof Boolean)) {
            if (obj16 == null) {
                throw new IllegalStateException("cannot find json property 'unhandled'");
            }
            throw new IllegalArgumentException("json property 'unhandled' not of expected type, found " + ((Object) obj16.getClass().getName()));
        }
        c6589d0.F(i(map, ((Boolean) obj16).booleanValue(), severityA));
        c6589d0.q();
        c6589d0.w(new R6.n(TypeIntrinsics.d(map.get("usage"))));
        Object obj17 = map.get("correlation");
        Map map4 = obj17 instanceof Map ? (Map) obj17 : null;
        if (map4 == null) {
            return c6589d0;
        }
        UUID uuidJ = j((String) map4.get("traceId"));
        String str2 = (String) map4.get("spanId");
        Long lK = str2 != null ? k(str2) : null;
        if (uuidJ != null && lK != null) {
            c6589d0.z(new TraceCorrelation(uuidJ, lK.longValue()));
        }
        Unit unit3 = Unit.f143329a;
        return c6589d0;
    }

    public final s1 h(Map<String, ? extends Object> user) {
        Object obj = user.get(PreferencesHelper.PREF_ID);
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = user.get("email");
        String str2 = obj2 instanceof String ? (String) obj2 : null;
        Object obj3 = user.get("name");
        return new s1(str, str2, obj3 instanceof String ? (String) obj3 : null);
    }

    public final a1 i(Map<? super String, ? extends Object> map, boolean unhandled, Severity severity) {
        Set setEntrySet;
        Object obj = map.get("severityReason");
        if (!(obj instanceof Map)) {
            if (obj == null) {
                throw new IllegalStateException("cannot find json property 'severityReason'");
            }
            throw new IllegalArgumentException("json property 'severityReason' not of expected type, found " + ((Object) obj.getClass().getName()));
        }
        Map map2 = (Map) obj;
        Object obj2 = map2.get("unhandledOverridden");
        if (!(obj2 instanceof Boolean)) {
            if (obj2 == null) {
                throw new IllegalStateException("cannot find json property 'unhandledOverridden'");
            }
            throw new IllegalArgumentException("json property 'unhandledOverridden' not of expected type, found " + ((Object) obj2.getClass().getName()));
        }
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Object obj3 = map2.get("type");
        if (!(obj3 instanceof String)) {
            if (obj3 == null) {
                throw new IllegalStateException("cannot find json property 'type'");
            }
            throw new IllegalArgumentException("json property 'type' not of expected type, found " + ((Object) obj3.getClass().getName()));
        }
        String str = (String) obj3;
        boolean z10 = zBooleanValue ? !unhandled : unhandled;
        Object obj4 = map2.get("attributes");
        if (obj4 != null ? obj4 instanceof Map : true) {
            Map map3 = (Map) obj4;
            Map.Entry entry = (map3 == null || (setEntrySet = map3.entrySet()) == null) ? null : (Map.Entry) CollectionsKt.V0(setEntrySet);
            return new a1(str, severity, unhandled, z10, entry == null ? null : (String) entry.getValue(), entry != null ? (String) entry.getKey() : null);
        }
        if (obj4 == null) {
            throw new IllegalStateException("cannot find json property 'attributes'");
        }
        throw new IllegalArgumentException("json property 'attributes' not of expected type, found " + ((Object) obj4.getClass().getName()));
    }

    public C6612p(D0 d02) {
        this.logger = d02;
    }

    private final Long k(String str) {
        if (str.length() != 16) {
            return null;
        }
        try {
            String strSubstring = str.substring(0, 2);
            Intrinsics.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            long j10 = Long.parseLong(strSubstring, CharsKt.a(16)) << 56;
            String strSubstring2 = str.substring(2);
            Intrinsics.i(strSubstring2, "this as java.lang.String).substring(startIndex)");
            return Long.valueOf(Long.parseLong(strSubstring2, CharsKt.a(16)) | j10);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private final Date l(String str) throws ParseException {
        if (str.length() > 0 && str.charAt(0) == 't') {
            String strSubstring = str.substring(1);
            Intrinsics.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            Long lX = StringsKt.x(strSubstring);
            if (lX != null) {
                return new Date(lX.longValue());
            }
        }
        try {
            return R6.g.a(str);
        } catch (IllegalArgumentException unused) {
            DateFormat dateFormat = this.ndkDateFormatHolder.get();
            Intrinsics.g(dateFormat);
            Date date = dateFormat.parse(str);
            if (date != null) {
                return date;
            }
            throw new IllegalArgumentException(Intrinsics.q("cannot parse date ", str));
        }
    }
}
