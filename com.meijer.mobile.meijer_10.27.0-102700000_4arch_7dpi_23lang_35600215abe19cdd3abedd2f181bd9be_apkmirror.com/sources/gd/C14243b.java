package gd;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import kd.AbstractC15136a;
import kd.C15137b;

/* renamed from: gd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14243b extends AbstractC15136a {

    /* renamed from: a, reason: collision with root package name */
    final int f133306a;

    /* renamed from: b, reason: collision with root package name */
    private final int f133307b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f133308c;

    /* renamed from: d, reason: collision with root package name */
    private final String f133309d;

    /* renamed from: e, reason: collision with root package name */
    public static final C14243b f133305e = new C14243b(0);
    public static final Parcelable.Creator<C14243b> CREATOR = new m();

    C14243b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f133306a = i10;
        this.f133307b = i11;
        this.f133308c = pendingIntent;
        this.f133309d = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14243b)) {
            return false;
        }
        C14243b c14243b = (C14243b) obj;
        return this.f133307b == c14243b.f133307b && C6535q.a(this.f133308c, c14243b.f133308c) && C6535q.a(this.f133309d, c14243b.f133309d);
    }

    public C14243b(int i10) {
        this(i10, null, null);
    }

    static String W0(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT /* 22 */:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int B() {
        return this.f133307b;
    }

    public boolean K0() {
        return this.f133307b == 0;
    }

    public String T() {
        return this.f133309d;
    }

    public PendingIntent c0() {
        return this.f133308c;
    }

    public int hashCode() {
        return C6535q.b(Integer.valueOf(this.f133307b), this.f133308c, this.f133309d);
    }

    public boolean q0() {
        return (this.f133307b == 0 || this.f133308c == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f133306a;
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, i11);
        C15137b.n(parcel, 2, B());
        C15137b.u(parcel, 3, c0(), i10, false);
        C15137b.w(parcel, 4, T(), false);
        C15137b.b(parcel, iA);
    }

    public C14243b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public String toString() {
        C6535q.a aVarC = C6535q.c(this);
        aVarC.a("statusCode", W0(this.f133307b));
        aVarC.a("resolution", this.f133308c);
        aVarC.a("message", this.f133309d);
        return aVarC.toString();
    }

    public C14243b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
