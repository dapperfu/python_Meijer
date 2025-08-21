package com.bugsnag.android;

import R6.ImmutableConfig;
import android.content.Context;
import java.io.File;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017Bc\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/bugsnag/android/V;", "", "Landroid/content/Context;", "context", "Ljava/io/File;", "deviceIdFile", "Lkotlin/Function0;", "Ljava/util/UUID;", "deviceIdGenerator", "internalDeviceIdFile", "internalDeviceIdGenerator", "LS6/d;", "Lcom/bugsnag/android/b1;", "sharedPrefMigrator", "LR6/k;", "config", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(Landroid/content/Context;Ljava/io/File;Lkotlin/jvm/functions/Function0;Ljava/io/File;Lkotlin/jvm/functions/Function0;LS6/d;LR6/k;Lcom/bugsnag/android/D0;)V", "", "b", "()Ljava/lang/String;", "c", "Lcom/bugsnag/android/V$c;", "a", "()Lcom/bugsnag/android/V$c;", "Ljava/io/File;", "Lkotlin/jvm/functions/Function0;", "d", "e", "LS6/d;", "f", "Lcom/bugsnag/android/D0;", "Lcom/bugsnag/android/U;", "g", "Lcom/bugsnag/android/U;", "persistence", "h", "internalPersistence", "", "i", "Z", "generateId", "j", "Lcom/bugsnag/android/V$c;", "deviceIds", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File deviceIdFile;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<UUID> deviceIdGenerator;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final File internalDeviceIdFile;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Function0<UUID> internalDeviceIdGenerator;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final S6.d<b1> sharedPrefMigrator;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private U persistence;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private U internalPersistence;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean generateId;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private DeviceIds deviceIds;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/bugsnag/android/V$c;", "", "", "deviceId", "internalDeviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getInternalDeviceId", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.V$c, reason: from toString */
    public static final /* data */ class DeviceIds {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deviceId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String internalDeviceId;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DeviceIds)) {
                return false;
            }
            DeviceIds deviceIds = (DeviceIds) other;
            return Intrinsics.e(this.deviceId, deviceIds.deviceId) && Intrinsics.e(this.internalDeviceId, deviceIds.internalDeviceId);
        }

        public int hashCode() {
            String str = this.deviceId;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.internalDeviceId;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "DeviceIds(deviceId=" + ((Object) this.deviceId) + ", internalDeviceId=" + ((Object) this.internalDeviceId) + ')';
        }

        /* renamed from: a, reason: from getter */
        public final String getDeviceId() {
            return this.deviceId;
        }

        public DeviceIds(String str, String str2) {
            this.deviceId = str;
            this.internalDeviceId = str2;
        }
    }

    @JvmOverloads
    public V(Context context, File file, Function0<UUID> function0, File file2, Function0<UUID> function02, S6.d<b1> dVar, ImmutableConfig immutableConfig, D0 d02) {
        this.deviceIdFile = file;
        this.deviceIdGenerator = function0;
        this.internalDeviceIdFile = file2;
        this.internalDeviceIdGenerator = function02;
        this.sharedPrefMigrator = dVar;
        this.logger = d02;
        this.generateId = immutableConfig.getGenerateAnonymousId();
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/UUID;"}, k = 3, mv = {1, 5, 1})
    static final class a extends Lambda implements Function0<UUID> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f64031f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ljava/util/UUID;", "kotlin.jvm.PlatformType", "c", "()Ljava/util/UUID;"}, k = 3, mv = {1, 5, 1})
    static final class b extends Lambda implements Function0<UUID> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f64032f = new b();

        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    private final String b() {
        U u10 = null;
        if (!this.generateId) {
            return null;
        }
        U u11 = this.persistence;
        if (u11 == null) {
            Intrinsics.x("persistence");
            u11 = null;
        }
        String strA = u11.a(false);
        if (strA != null) {
            return strA;
        }
        String strA2 = this.sharedPrefMigrator.get().a(false);
        if (strA2 != null) {
            return strA2;
        }
        U u12 = this.persistence;
        if (u12 == null) {
            Intrinsics.x("persistence");
        } else {
            u10 = u12;
        }
        return u10.a(true);
    }

    private final String c() {
        U u10 = null;
        if (!this.generateId) {
            return null;
        }
        U u11 = this.internalPersistence;
        if (u11 == null) {
            Intrinsics.x("internalPersistence");
        } else {
            u10 = u11;
        }
        return u10.a(true);
    }

    public final DeviceIds a() {
        DeviceIds deviceIds = this.deviceIds;
        if (deviceIds != null) {
            return deviceIds;
        }
        this.persistence = new T(this.deviceIdFile, this.deviceIdGenerator, this.logger);
        this.internalPersistence = new T(this.internalDeviceIdFile, this.internalDeviceIdGenerator, this.logger);
        String strB = b();
        String strC = c();
        if (strB != null || strC != null) {
            this.deviceIds = new DeviceIds(strB, strC);
        }
        return this.deviceIds;
    }

    public /* synthetic */ V(Context context, File file, Function0 function0, File file2, Function0 function02, S6.d dVar, ImmutableConfig immutableConfig, D0 d02, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new File(context.getFilesDir(), "device-id") : file, (i10 & 4) != 0 ? a.f64031f : function0, (i10 & 8) != 0 ? new File(context.getFilesDir(), "internal-device-id") : file2, (i10 & 16) != 0 ? b.f64032f : function02, dVar, immutableConfig, d02);
    }
}
