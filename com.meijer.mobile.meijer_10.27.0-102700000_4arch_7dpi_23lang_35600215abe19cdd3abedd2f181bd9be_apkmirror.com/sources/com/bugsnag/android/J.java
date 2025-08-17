package com.bugsnag.android;

import android.os.Build;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0014\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0010Bg\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006 "}, d2 = {"Lcom/bugsnag/android/J;", "", "", "manufacturer", "model", "osVersion", "", "apiLevel", "osBuild", "fingerprint", "tags", "brand", "", "cpuAbis", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "f", "c", "h", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "g", "i", "[Ljava/lang/String;", "()[Ljava/lang/String;", "j", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class J {

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String manufacturer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String model;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String osVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Integer apiLevel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String osBuild;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String fingerprint;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String tags;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String brand;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String[] cpuAbis;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bugsnag/android/J$a;", "", "<init>", "()V", "Lcom/bugsnag/android/J;", "a", "()Lcom/bugsnag/android/J;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    /* renamed from: com.bugsnag.android.J$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final J a() {
            int i10 = Build.VERSION.SDK_INT;
            return new J(Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, Integer.valueOf(i10), Build.DISPLAY, Build.FINGERPRINT, Build.TAGS, Build.BRAND, Build.SUPPORTED_ABIS);
        }
    }

    /* renamed from: a, reason: from getter */
    public final Integer getApiLevel() {
        return this.apiLevel;
    }

    /* renamed from: b, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* renamed from: c, reason: from getter */
    public final String[] getCpuAbis() {
        return this.cpuAbis;
    }

    /* renamed from: d, reason: from getter */
    public final String getFingerprint() {
        return this.fingerprint;
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
    public final String getOsBuild() {
        return this.osBuild;
    }

    /* renamed from: h, reason: from getter */
    public final String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: i, reason: from getter */
    public final String getTags() {
        return this.tags;
    }

    public J(String str, String str2, String str3, Integer num, String str4, String str5, String str6, String str7, String[] strArr) {
        this.manufacturer = str;
        this.model = str2;
        this.osVersion = str3;
        this.apiLevel = num;
        this.osBuild = str4;
        this.fingerprint = str5;
        this.tags = str6;
        this.brand = str7;
        this.cpuAbis = strArr;
    }
}
