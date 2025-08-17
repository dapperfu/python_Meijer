package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\b\u0016\u0018\u00002\u00020\u0001B_\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R$\u0010!\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010%\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R$\u0010)\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R$\u0010-\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001c\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010 RF\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00103\u001a\u0004\b\u001b\u00104\"\u0004\b5\u00106R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00107\u001a\u0004\b&\u00108\"\u0004\b9\u0010:R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b;\u0010 R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001c\u001a\u0004\b*\u0010\u001e\"\u0004\b<\u0010 R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b=\u0010?\"\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lcom/bugsnag/android/I;", "Lcom/bugsnag/android/m0$a;", "Lcom/bugsnag/android/J;", "buildInfo", "", "", "cpuAbi", "", "jailbroken", PreferencesHelper.PREF_ID, "locale", "", "totalMemory", "", "", "runtimeVersions", "<init>", "(Lcom/bugsnag/android/J;[Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "value", "k", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/bugsnag/android/m0;", "writer", "", "l", "(Lcom/bugsnag/android/m0;)V", "toStream", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setManufacturer", "(Ljava/lang/String;)V", "manufacturer", "b", "f", "setModel", "model", "c", "g", "setOsName", "osName", "d", "h", "setOsVersion", "osVersion", "Ljava/util/Map;", "i", "()Ljava/util/Map;", "setRuntimeVersions", "(Ljava/util/Map;)V", "[Ljava/lang/String;", "()[Ljava/lang/String;", "setCpuAbi", "([Ljava/lang/String;)V", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "setJailbroken", "(Ljava/lang/Boolean;)V", "setId", "setLocale", "j", "Ljava/lang/Long;", "()Ljava/lang/Long;", "setTotalMemory", "(Ljava/lang/Long;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public class I implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String manufacturer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String model;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String osName = "android";

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String osVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Map<String, Object> runtimeVersions;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String[] cpuAbi;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Boolean jailbroken;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private String id;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String locale;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private Long totalMemory;

    private final Map<String, Object> k(Map<String, Object> value) {
        if (value == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = value.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return linkedHashMap;
    }

    /* renamed from: a, reason: from getter */
    public final String[] getCpuAbi() {
        return this.cpuAbi;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final Boolean getJailbroken() {
        return this.jailbroken;
    }

    /* renamed from: d, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: e, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    /* renamed from: f, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    /* renamed from: g, reason: from getter */
    public final String getOsName() {
        return this.osName;
    }

    /* renamed from: h, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    public final Map<String, Object> i() {
        return this.runtimeVersions;
    }

    /* renamed from: j, reason: from getter */
    public final Long getTotalMemory() {
        return this.totalMemory;
    }

    public void l(C6482m0 writer) throws IOException {
        writer.l("cpuAbi").e0(this.cpuAbi);
        writer.l("jailbroken").J(this.jailbroken);
        writer.l(PreferencesHelper.PREF_ID).O(this.id);
        writer.l("locale").O(this.locale);
        writer.l("manufacturer").O(this.manufacturer);
        writer.l("model").O(this.model);
        writer.l("osName").O(this.osName);
        writer.l("osVersion").O(this.osVersion);
        writer.l("runtimeVersions").e0(this.runtimeVersions);
        writer.l("totalMemory").K(this.totalMemory);
    }

    public I(J j10, String[] strArr, Boolean bool, String str, String str2, Long l10, Map<String, Object> map) {
        this.cpuAbi = strArr;
        this.jailbroken = bool;
        this.id = str;
        this.locale = str2;
        this.totalMemory = l10;
        this.manufacturer = j10.getManufacturer();
        this.model = j10.getModel();
        this.osVersion = j10.getOsVersion();
        this.runtimeVersions = k(map);
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) throws IOException {
        writer.d();
        l(writer);
        writer.i();
    }
}
