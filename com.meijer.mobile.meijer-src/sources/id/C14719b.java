package id;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import md.AbstractC15707a;
import md.C15708b;

/* renamed from: id.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14719b extends AbstractC15707a {

    /* renamed from: a, reason: collision with root package name */
    final int f137522a;

    /* renamed from: b, reason: collision with root package name */
    private final int f137523b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f137524c;

    /* renamed from: d, reason: collision with root package name */
    private final String f137525d;

    /* renamed from: e, reason: collision with root package name */
    public static final C14719b f137521e = new C14719b(0);
    public static final Parcelable.Creator<C14719b> CREATOR = new m();

    C14719b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f137522a = i10;
        this.f137523b = i11;
        this.f137524c = pendingIntent;
        this.f137525d = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14719b)) {
            return false;
        }
        C14719b c14719b = (C14719b) obj;
        return this.f137523b == c14719b.f137523b && C6660q.a(this.f137524c, c14719b.f137524c) && C6660q.a(this.f137525d, c14719b.f137525d);
    }

    public C14719b(int i10) {
        this(i10, null, null);
    }

    static String U0(int i10) {
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
        return this.f137523b;
    }

    public boolean I0() {
        return this.f137523b == 0;
    }

    public String T() {
        return this.f137525d;
    }

    public PendingIntent b0() {
        return this.f137524c;
    }

    public int hashCode() {
        return C6660q.b(Integer.valueOf(this.f137523b), this.f137524c, this.f137525d);
    }

    public boolean r0() {
        return (this.f137523b == 0 || this.f137524c == null) ? false : true;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f137522a;
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, i11);
        C15708b.n(parcel, 2, B());
        C15708b.u(parcel, 3, b0(), i10, false);
        C15708b.w(parcel, 4, T(), false);
        C15708b.b(parcel, iA);
    }

    public C14719b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public String toString() {
        C6660q.a aVarC = C6660q.c(this);
        aVarC.a("statusCode", U0(this.f137523b));
        aVarC.a("resolution", this.f137524c);
        aVarC.a("message", this.f137525d);
        return aVarC.toString();
    }

    public C14719b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }
}
