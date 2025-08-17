package Rb;

/* loaded from: classes4.dex */
public enum b {
    PROXIMITY_UNKNOWN_TYPE(0, "Unknown Type."),
    PROXIMITY_API_LEVEL_NOT_SUPPORTED(2004, "Api level not Supported"),
    PROXIMITY_BLE_SUPPORT_NOT_AVAILABLE(2005, "BLE Support not available"),
    PROXIMITY_BLUETOOTH_IS_OFF(2006, "Bluetooth is off"),
    PROXIMITY_APP_NOT_INITIALIZED(2007, "App Not Initialized"),
    PROXIMITY_APP_NOT_REGISTERED(2008, "App Not Registered"),
    PROXIMITY_UNKNOWN_AUTH_FAILURE(2009, "Unknown Auth Failure"),
    PROXIMITY_NETWORK_AUTH_FAILURE(2010, "Network Auth Failure"),
    PROXIMITY_USER_CANCELLED_AUTH_FAILURE(2011, "User canceled Auth"),
    PROXIMITY_USER_DENIED_AUTH_FAILURE(2012, "User Denied Auth Failure"),
    PROXIMITY_RELEASE_VERSION_NOT_SUPPORTED(2013, "Release Version not Supported"),
    PROXIMITY_INITIALIZATION_FAILURE(2014, "Initialization Failure"),
    PROXIMITY_REQUIRES_AUTHORIZATION(1001, "API Requires Authorization");


    /* renamed from: a, reason: collision with root package name */
    public final int f32111a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32112b;

    @Override // java.lang.Enum
    public final String toString() {
        return this.f32111a + ": " + this.f32112b;
    }

    b(int i10, String str) {
        this.f32111a = i10;
        this.f32112b = str;
    }
}
