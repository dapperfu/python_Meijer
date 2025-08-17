package Fm;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0019J\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b&\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b)\u0010#\u001a\u0004\b*\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b,\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010\u001bR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b%\u0010\u0019R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010\u001bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b2\u0010#\u001a\u0004\b'\u0010\u001bR\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010#\u001a\u0004\b\"\u0010\u001bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010#\u001a\u0004\b5\u0010\u001bR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010#\u001a\u0004\b)\u0010\u001b¨\u00067"}, d2 = {"LFm/a;", "Landroid/os/Parcelable;", "", "approvalCode", "tranId", "network", "cvn", "", "remainingBalanceCash", "cashCurrencyCode", "remainingBalanceSnap", "snapCurrencyCode", "responseCode", "errorCode", "errorMessage", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getApprovalCode", "b", "e", "c", "getNetwork", "d", "getCvn", "I", "getRemainingBalanceCash", "f", "getCashCurrencyCode", "g", "h", "getSnapCurrencyCode", "i", "j", "k", "getErrorMessage", "l", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Fm.a, reason: from toString */
/* loaded from: classes9.dex */
public final /* data */ class EbtBalance implements Parcelable {
    public static final Parcelable.Creator<EbtBalance> CREATOR = new C0149a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String approvalCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tranId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String network;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cvn;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int remainingBalanceCash;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cashCurrencyCode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int remainingBalanceSnap;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String snapCurrencyCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String responseCode;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorCode;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final String errorMessage;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String token;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fm.a$a, reason: collision with other inner class name */
    public static final class C0149a implements Parcelable.Creator<EbtBalance> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EbtBalance createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new EbtBalance(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final EbtBalance[] newArray(int i10) {
            return new EbtBalance[i10];
        }
    }

    public EbtBalance(String approvalCode, String str, String str2, String str3, int i10, String str4, int i11, String str5, String str6, String str7, String str8, String str9) {
        Intrinsics.j(approvalCode, "approvalCode");
        this.approvalCode = approvalCode;
        this.tranId = str;
        this.network = str2;
        this.cvn = str3;
        this.remainingBalanceCash = i10;
        this.cashCurrencyCode = str4;
        this.remainingBalanceSnap = i11;
        this.snapCurrencyCode = str5;
        this.responseCode = str6;
        this.errorCode = str7;
        this.errorMessage = str8;
        this.token = str9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtBalance)) {
            return false;
        }
        EbtBalance ebtBalance = (EbtBalance) other;
        return Intrinsics.e(this.approvalCode, ebtBalance.approvalCode) && Intrinsics.e(this.tranId, ebtBalance.tranId) && Intrinsics.e(this.network, ebtBalance.network) && Intrinsics.e(this.cvn, ebtBalance.cvn) && this.remainingBalanceCash == ebtBalance.remainingBalanceCash && Intrinsics.e(this.cashCurrencyCode, ebtBalance.cashCurrencyCode) && this.remainingBalanceSnap == ebtBalance.remainingBalanceSnap && Intrinsics.e(this.snapCurrencyCode, ebtBalance.snapCurrencyCode) && Intrinsics.e(this.responseCode, ebtBalance.responseCode) && Intrinsics.e(this.errorCode, ebtBalance.errorCode) && Intrinsics.e(this.errorMessage, ebtBalance.errorMessage) && Intrinsics.e(this.token, ebtBalance.token);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.approvalCode);
        dest.writeString(this.tranId);
        dest.writeString(this.network);
        dest.writeString(this.cvn);
        dest.writeInt(this.remainingBalanceCash);
        dest.writeString(this.cashCurrencyCode);
        dest.writeInt(this.remainingBalanceSnap);
        dest.writeString(this.snapCurrencyCode);
        dest.writeString(this.responseCode);
        dest.writeString(this.errorCode);
        dest.writeString(this.errorMessage);
        dest.writeString(this.token);
    }

    /* renamed from: a, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: b, reason: from getter */
    public final int getRemainingBalanceSnap() {
        return this.remainingBalanceSnap;
    }

    /* renamed from: c, reason: from getter */
    public final String getResponseCode() {
        return this.responseCode;
    }

    /* renamed from: d, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: e, reason: from getter */
    public final String getTranId() {
        return this.tranId;
    }

    public int hashCode() {
        int iHashCode = this.approvalCode.hashCode() * 31;
        String str = this.tranId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.network;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cvn;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.remainingBalanceCash)) * 31;
        String str4 = this.cashCurrencyCode;
        int iHashCode5 = (((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.remainingBalanceSnap)) * 31;
        String str5 = this.snapCurrencyCode;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.responseCode;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.errorCode;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.errorMessage;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.token;
        return iHashCode9 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "EbtBalance(approvalCode=" + this.approvalCode + ", tranId=" + this.tranId + ", network=" + this.network + ", cvn=" + this.cvn + ", remainingBalanceCash=" + this.remainingBalanceCash + ", cashCurrencyCode=" + this.cashCurrencyCode + ", remainingBalanceSnap=" + this.remainingBalanceSnap + ", snapCurrencyCode=" + this.snapCurrencyCode + ", responseCode=" + this.responseCode + ", errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + ", token=" + this.token + ')';
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ EbtBalance(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r1 = this;
            r15 = r14 & 1
            if (r15 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r15 = r14 & 2
            r0 = 0
            if (r15 == 0) goto Lc
            r3 = r0
        Lc:
            r15 = r14 & 4
            if (r15 == 0) goto L11
            r4 = r0
        L11:
            r15 = r14 & 8
            if (r15 == 0) goto L16
            r5 = r0
        L16:
            r15 = r14 & 32
            if (r15 == 0) goto L1b
            r7 = r0
        L1b:
            r15 = r14 & 128(0x80, float:1.8E-43)
            if (r15 == 0) goto L20
            r9 = r0
        L20:
            r15 = r14 & 256(0x100, float:3.59E-43)
            if (r15 == 0) goto L25
            r10 = r0
        L25:
            r15 = r14 & 512(0x200, float:7.17E-43)
            if (r15 == 0) goto L2a
            r11 = r0
        L2a:
            r15 = r14 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L2f
            r12 = r0
        L2f:
            r14 = r14 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L41
            r15 = r0
            r13 = r11
            r14 = r12
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L4e
        L41:
            r15 = r13
            r14 = r12
            r12 = r10
            r13 = r11
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L4e:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Fm.EbtBalance.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
