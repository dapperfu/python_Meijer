package com.medallia.digital.mobilesdk;

import com.medallia.digital.mobilesdk.s0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PropertyId' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes7.dex */
final class n0 {
    private static final /* synthetic */ n0[] $VALUES;
    public static final n0 AccountId;
    public static final n0 AppId;
    public static final n0 AppName;
    public static final n0 AppRatingLastAcceptedTimestamp;
    public static final n0 AppRatingLastDeclineTimestamp;
    public static final n0 AppRatingLastTriggerTimestamp;
    public static final n0 AppVersion;
    public static final n0 CSAT;
    public static final n0 CustomParameters;
    public static final n0 DeviceFreeMemoryCollector;
    public static final n0 DeviceId;
    public static final n0 DeviceModel;
    public static final n0 DeviceResolution;
    public static final n0 DeviceUsedMemory;
    public static final n0 DeviceVendor;
    public static final n0 IP;
    public static final n0 InterceptDisabled;
    public static final n0 InterceptEnabled;
    public static final n0 InvitationDisplayed;
    public static final n0 IsOCQRulesValid;
    public static final n0 IsOCQUserSet;
    public static final n0 IsSessionSampledEvents;
    public static final n0 Language;
    public static final n0 LastDeclineTimestamp;
    public static final n0 LastSubmitTimestamp;
    public static final n0 LocalNotificationsEnabled;
    public static final n0 NPS;
    public static final n0 NetworkCarrier;
    public static final n0 NetworkProvider;
    public static final n0 NetworkSpeed;
    public static final n0 NetworkType;
    public static final n0 Orientation;
    public static final n0 OsName;
    public static final n0 OsVersion;
    public static final n0 PromptDisplayed;
    public static final n0 PropertyId;
    public static final n0 SDKFramework;
    public static final n0 SdkVersion;
    public static final n0 SessionCalculatedPercentage;
    public static final n0 SessionId;
    public static final n0 SessionNumber;
    public static final n0 SessionPercentageSampledEvents;
    public static final n0 TimeInBackground;
    public static final n0 TimeInCurrentForeground;
    public static final n0 TimeInForeground;
    public static final n0 Timezone;
    public static final n0 Unknown;
    public static final n0 UserEmail;
    public static final n0 UserId;
    public static final n0 UserName;

    /* renamed from: id, reason: collision with root package name */
    private final int f92593id;
    private final Lifetime lifetime;
    private final String name;

    static {
        n0 n0Var = new n0("Unknown", 0, "", -1, null);
        Unknown = n0Var;
        n0 n0Var2 = new n0("AppId", 1, "AppId", 0, s0.a.f92945p.getLifetime());
        AppId = n0Var2;
        n0 n0Var3 = new n0("AppName", 2, "AppName", 1, s0.a.f92944o.getLifetime());
        AppName = n0Var3;
        n0 n0Var4 = new n0("AppVersion", 3, "AppVersion", 2, s0.a.f92946q.getLifetime());
        AppVersion = n0Var4;
        n0 n0Var5 = new n0("CustomParameters", 4, "CustomParameters", 4, s0.a.f92911E.getLifetime());
        CustomParameters = n0Var5;
        n0 n0Var6 = new n0("DeviceFreeMemoryCollector", 5, "DeviceFreeMemory", 6, s0.a.f92930a.getLifetime());
        DeviceFreeMemoryCollector = n0Var6;
        n0 n0Var7 = new n0("DeviceId", 6, "DeviceId", 7, s0.a.f92943n.getLifetime());
        DeviceId = n0Var7;
        n0 n0Var8 = new n0("DeviceModel", 7, "DeviceModel", 8, s0.a.f92931b.getLifetime());
        DeviceModel = n0Var8;
        n0 n0Var9 = new n0("DeviceResolution", 8, "DeviceResolution", 9, s0.a.f92932c.getLifetime());
        DeviceResolution = n0Var9;
        n0 n0Var10 = new n0("DeviceUsedMemory", 9, "DeviceUsedMemory", 11, s0.a.f92933d.getLifetime());
        DeviceUsedMemory = n0Var10;
        n0 n0Var11 = new n0("DeviceVendor", 10, "DeviceVendor", 12, s0.a.f92934e.getLifetime());
        DeviceVendor = n0Var11;
        n0 n0Var12 = new n0("InvitationDisplayed", 11, "InvitationDisplayed", 15, s0.a.f92912F.getLifetime());
        InvitationDisplayed = n0Var12;
        n0 n0Var13 = new n0("InterceptEnabled", 12, "InterceptEnabled", 16, s0.a.f92915I.getLifetime());
        InterceptEnabled = n0Var13;
        n0 n0Var14 = new n0("InterceptDisabled", 13, "InterceptDisabled", 17, s0.a.f92916J.getLifetime());
        InterceptDisabled = n0Var14;
        n0 n0Var15 = new n0("IP", 14, "IP", 18, s0.a.f92941l.getLifetime());
        IP = n0Var15;
        n0 n0Var16 = new n0("Language", 15, "Language", 19, s0.a.f92939j.getLifetime());
        Language = n0Var16;
        n0 n0Var17 = new n0("LastDeclineTimestamp", 16, "LastDeclineTimestamp", 20, s0.a.f92955z.getLifetime());
        LastDeclineTimestamp = n0Var17;
        n0 n0Var18 = new n0("LastSubmitTimestamp", 17, "LastSubmitTimestamp", 21, s0.a.f92907A.getLifetime());
        LastSubmitTimestamp = n0Var18;
        n0 n0Var19 = new n0("TimeInBackground", 18, "TimeInBackground", 22, s0.a.f92913G.getLifetime());
        TimeInBackground = n0Var19;
        n0 n0Var20 = new n0("TimeInForeground", 19, "TimeInForeground", 23, s0.a.f92914H.getLifetime());
        TimeInForeground = n0Var20;
        n0 n0Var21 = new n0("NetworkCarrier", 20, "NetworkCarrier", 24, s0.a.f92938i.getLifetime());
        NetworkCarrier = n0Var21;
        n0 n0Var22 = new n0("NetworkProvider", 21, "NetworkProvider", 25, s0.a.f92937h.getLifetime());
        NetworkProvider = n0Var22;
        n0 n0Var23 = new n0("NetworkSpeed", 22, "NetworkSpeed", 26, s0.a.f92942m.getLifetime());
        NetworkSpeed = n0Var23;
        n0 n0Var24 = new n0("NetworkType", 23, "NetworkType", 27, s0.a.f92951v.getLifetime());
        NetworkType = n0Var24;
        n0 n0Var25 = new n0("Orientation", 24, "Orientation", 28, s0.a.f92954y.getLifetime());
        Orientation = n0Var25;
        n0 n0Var26 = new n0("OsName", 25, "OsName", 29, s0.a.f92935f.getLifetime());
        OsName = n0Var26;
        n0 n0Var27 = new n0("OsVersion", 26, "OsVersion", 30, s0.a.f92936g.getLifetime());
        OsVersion = n0Var27;
        CollectorContract collectorContract = s0.a.f92952w;
        n0 n0Var28 = new n0("PropertyId", 27, "PropertyId", 32, collectorContract.getLifetime());
        PropertyId = n0Var28;
        n0 n0Var29 = new n0("AccountId", 28, "AccountId", 55, collectorContract.getLifetime());
        AccountId = n0Var29;
        n0 n0Var30 = new n0("SdkVersion", 29, "SdkVersion", 33, s0.a.f92947r.getLifetime());
        SdkVersion = n0Var30;
        n0 n0Var31 = new n0("SessionCalculatedPercentage", 30, "SessionCalculatedPercentage", 34, s0.a.f92948s.getLifetime());
        SessionCalculatedPercentage = n0Var31;
        n0 n0Var32 = new n0("SessionNumber", 31, "SessionNumber", 35, s0.a.f92949t.getLifetime());
        SessionNumber = n0Var32;
        n0 n0Var33 = new n0("SessionId", 32, "SessionId", 36, s0.a.f92950u.getLifetime());
        SessionId = n0Var33;
        n0 n0Var34 = new n0("Timezone", 33, "Timezone", 37, s0.a.f92940k.getLifetime());
        Timezone = n0Var34;
        n0 n0Var35 = new n0("UserEmail", 34, "UserEmail", 38, s0.a.f92909C.getLifetime());
        UserEmail = n0Var35;
        n0 n0Var36 = new n0("UserId", 35, "UserId", 39, s0.a.f92908B.getLifetime());
        UserId = n0Var36;
        n0 n0Var37 = new n0("UserName", 36, "UserName", 40, s0.a.f92910D.getLifetime());
        UserName = n0Var37;
        n0 n0Var38 = new n0("NPS", 37, "NPS", 41, s0.a.f92917K.getLifetime());
        NPS = n0Var38;
        n0 n0Var39 = new n0("CSAT", 38, "CSAT", 42, s0.a.f92918L.getLifetime());
        CSAT = n0Var39;
        n0 n0Var40 = new n0("AppRatingLastDeclineTimestamp", 39, "AppRatingLastDeclineTimestamp", 43, s0.a.f92919M.getLifetime());
        AppRatingLastDeclineTimestamp = n0Var40;
        n0 n0Var41 = new n0("PromptDisplayed", 40, "PromptDisplayed", 44, s0.a.f92920N.getLifetime());
        PromptDisplayed = n0Var41;
        n0 n0Var42 = new n0("AppRatingLastAcceptedTimestamp", 41, "AppRatingLastAcceptedTimestamp", 45, s0.a.f92921O.getLifetime());
        AppRatingLastAcceptedTimestamp = n0Var42;
        n0 n0Var43 = new n0("SDKFramework", 42, "SDKFrameworkCollector", 47, s0.a.f92922P.getLifetime());
        SDKFramework = n0Var43;
        n0 n0Var44 = new n0("AppRatingLastTriggerTimestamp", 43, "AppRatingLastTriggerTimestamp", 48, s0.a.f92923Q.getLifetime());
        AppRatingLastTriggerTimestamp = n0Var44;
        n0 n0Var45 = new n0("IsOCQUserSet", 44, "IsOCQUserSet", 49, s0.a.f92926T.getLifetime());
        IsOCQUserSet = n0Var45;
        n0 n0Var46 = new n0("IsOCQRulesValid", 45, "IsOCQRulesValid", 50, s0.a.f92927U.getLifetime());
        IsOCQRulesValid = n0Var46;
        n0 n0Var47 = new n0("LocalNotificationsEnabled", 46, "LocalNotificationsEnabled", 53, s0.a.f92924R.getLifetime());
        LocalNotificationsEnabled = n0Var47;
        n0 n0Var48 = new n0("TimeInCurrentForeground", 47, "TimeInCurrentForeground", 54, s0.a.f92925S.getLifetime());
        TimeInCurrentForeground = n0Var48;
        n0 n0Var49 = new n0("IsSessionSampledEvents", 48, "IsSessionSampledEvents", 51, s0.a.f92928V.getLifetime());
        IsSessionSampledEvents = n0Var49;
        n0 n0Var50 = new n0("SessionPercentageSampledEvents", 49, "SessionPercentageSampledEvents", 52, s0.a.f92929W.getLifetime());
        SessionPercentageSampledEvents = n0Var50;
        $VALUES = new n0[]{n0Var, n0Var2, n0Var3, n0Var4, n0Var5, n0Var6, n0Var7, n0Var8, n0Var9, n0Var10, n0Var11, n0Var12, n0Var13, n0Var14, n0Var15, n0Var16, n0Var17, n0Var18, n0Var19, n0Var20, n0Var21, n0Var22, n0Var23, n0Var24, n0Var25, n0Var26, n0Var27, n0Var28, n0Var29, n0Var30, n0Var31, n0Var32, n0Var33, n0Var34, n0Var35, n0Var36, n0Var37, n0Var38, n0Var39, n0Var40, n0Var41, n0Var42, n0Var43, n0Var44, n0Var45, n0Var46, n0Var47, n0Var48, n0Var49, n0Var50};
    }

    private n0(String str, int i10, String str2, int i11, Lifetime lifetime) {
        this.name = str2;
        this.f92593id = i11;
        this.lifetime = lifetime;
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) $VALUES.clone();
    }

    protected int getId() {
        return this.f92593id;
    }

    protected Lifetime getLifetime() {
        return this.lifetime;
    }

    protected String getName() {
        return this.name;
    }
}
