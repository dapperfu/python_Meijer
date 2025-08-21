package Eh;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import io.constructor.data.local.PreferencesHelper;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.EnumC17676d;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\bA\b\u0087\b\u0018\u0000 l2\u00020\u0001:\u0001'Bë\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020 ¢\u0006\u0004\b%\u0010&Jô\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020 HÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010.\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00100\u001a\u0004\b6\u00102\"\u0004\b7\u00104R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010*\"\u0004\b;\u0010<R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b8\u0010*\"\u0004\b>\u0010<R$\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b=\u0010*\"\u0004\b@\u0010<R$\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u00109\u001a\u0004\bB\u0010*\"\u0004\bC\u0010<R$\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u00109\u001a\u0004\bD\u0010*\"\u0004\bE\u0010<R$\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u00109\u001a\u0004\bG\u0010*\"\u0004\bH\u0010<R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\b?\u0010K\"\u0004\bL\u0010MR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010N\u001a\u0004\bA\u0010O\"\u0004\bP\u0010QR\"\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u00100\u001a\u0004\bF\u00102\"\u0004\bS\u00104R$\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u00109\u001a\u0004\bR\u0010*\"\u0004\bU\u0010<R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u00109\u001a\u0004\bW\u0010*\"\u0004\bX\u0010<R$\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00109\u001a\u0004\bY\u0010*\"\u0004\bZ\u0010<R$\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u00109\u001a\u0004\b[\u0010*\"\u0004\b\\\u0010<R\"\u0010\u0016\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`\"\u0004\b0\u0010aR$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR$\u0010\u0019\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u00109\u001a\u0004\bI\u0010*\"\u0004\bg\u0010<R$\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010b\u001a\u0004\bi\u0010d\"\u0004\bj\u0010fR$\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u00109\u001a\u0004\bh\u0010*\"\u0004\bk\u0010<¨\u0006m"}, d2 = {"LEh/a;", "Landroid/os/Parcelable;", "", PreferencesHelper.PREF_ID, "digitalAccountId", "", "name", "addressLine1", "addressLine2", "city", "state", "zipCode", "LEh/e;", "addressType", "Lvh/d;", "addressValidationType", "contactId", "firstName", "lastName", "addressNickname", "phoneNumber", "", "isPrimary", "j$/time/ZonedDateTime", "createDate", "createdBy", "updateDate", "updatedBy", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LEh/e;Lvh/d;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/ZonedDateTime;Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LEh/e;Lvh/d;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/ZonedDateTime;Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;)LEh/a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "n", "()J", "E", "(J)V", "b", "j", "B", "c", "Ljava/lang/String;", "getName", "G", "(Ljava/lang/String;)V", "d", "t", "e", "v", "f", "g", "x", "r", "L", "h", "R", "O", "i", "LEh/e;", "()LEh/e;", "setAddressType", "(LEh/e;)V", "Lvh/d;", "()Lvh/d;", "w", "(Lvh/d;)V", "k", "setContactId", "l", "C", "m", "o", "F", "getAddressNickname", "setAddressNickname", "q", "I", "p", "Z", "z", "()Z", "(Z)V", "Lj$/time/ZonedDateTime;", "getCreateDate", "()Lj$/time/ZonedDateTime;", "y", "(Lj$/time/ZonedDateTime;)V", "A", "s", "getUpdateDate", "M", "N", "u", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Eh.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class AccountAddress implements Parcelable {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private long digitalAccountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressLine1;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressLine2;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String city;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String state;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String zipCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private EnumC3241e addressType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private EnumC17676d addressValidationType;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private long contactId;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private String firstName;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private String lastName;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private String addressNickname;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private String phoneNumber;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isPrimary;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private ZonedDateTime createDate;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private String createdBy;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private ZonedDateTime updateDate;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private String updatedBy;
    public static final Parcelable.Creator<AccountAddress> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Eh.a$b */
    public static final class b implements Parcelable.Creator<AccountAddress> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountAddress createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new AccountAddress(parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), EnumC3241e.valueOf(parcel.readString()), EnumC17676d.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, (ZonedDateTime) parcel.readSerializable(), parcel.readString(), (ZonedDateTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AccountAddress[] newArray(int i10) {
            return new AccountAddress[i10];
        }
    }

    public AccountAddress() {
        this(0L, 0L, null, null, null, null, null, null, null, null, 0L, null, null, null, null, false, null, null, null, null, 1048575, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountAddress)) {
            return false;
        }
        AccountAddress accountAddress = (AccountAddress) other;
        return this.id == accountAddress.id && this.digitalAccountId == accountAddress.digitalAccountId && Intrinsics.e(this.name, accountAddress.name) && Intrinsics.e(this.addressLine1, accountAddress.addressLine1) && Intrinsics.e(this.addressLine2, accountAddress.addressLine2) && Intrinsics.e(this.city, accountAddress.city) && Intrinsics.e(this.state, accountAddress.state) && Intrinsics.e(this.zipCode, accountAddress.zipCode) && this.addressType == accountAddress.addressType && this.addressValidationType == accountAddress.addressValidationType && this.contactId == accountAddress.contactId && Intrinsics.e(this.firstName, accountAddress.firstName) && Intrinsics.e(this.lastName, accountAddress.lastName) && Intrinsics.e(this.addressNickname, accountAddress.addressNickname) && Intrinsics.e(this.phoneNumber, accountAddress.phoneNumber) && this.isPrimary == accountAddress.isPrimary && Intrinsics.e(this.createDate, accountAddress.createDate) && Intrinsics.e(this.createdBy, accountAddress.createdBy) && Intrinsics.e(this.updateDate, accountAddress.updateDate) && Intrinsics.e(this.updatedBy, accountAddress.updatedBy);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.id);
        dest.writeLong(this.digitalAccountId);
        dest.writeString(this.name);
        dest.writeString(this.addressLine1);
        dest.writeString(this.addressLine2);
        dest.writeString(this.city);
        dest.writeString(this.state);
        dest.writeString(this.zipCode);
        dest.writeString(this.addressType.name());
        dest.writeString(this.addressValidationType.name());
        dest.writeLong(this.contactId);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.addressNickname);
        dest.writeString(this.phoneNumber);
        dest.writeInt(this.isPrimary ? 1 : 0);
        dest.writeSerializable(this.createDate);
        dest.writeString(this.createdBy);
        dest.writeSerializable(this.updateDate);
        dest.writeString(this.updatedBy);
    }

    public AccountAddress(long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, EnumC3241e addressType, EnumC17676d addressValidationType, long j12, String str7, String str8, String str9, String str10, boolean z10, ZonedDateTime zonedDateTime, String str11, ZonedDateTime zonedDateTime2, String str12) {
        Intrinsics.j(addressType, "addressType");
        Intrinsics.j(addressValidationType, "addressValidationType");
        this.id = j10;
        this.digitalAccountId = j11;
        this.name = str;
        this.addressLine1 = str2;
        this.addressLine2 = str3;
        this.city = str4;
        this.state = str5;
        this.zipCode = str6;
        this.addressType = addressType;
        this.addressValidationType = addressValidationType;
        this.contactId = j12;
        this.firstName = str7;
        this.lastName = str8;
        this.addressNickname = str9;
        this.phoneNumber = str10;
        this.isPrimary = z10;
        this.createDate = zonedDateTime;
        this.createdBy = str11;
        this.updateDate = zonedDateTime2;
        this.updatedBy = str12;
    }

    public static /* synthetic */ AccountAddress b(AccountAddress accountAddress, long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, EnumC3241e enumC3241e, EnumC17676d enumC17676d, long j12, String str7, String str8, String str9, String str10, boolean z10, ZonedDateTime zonedDateTime, String str11, ZonedDateTime zonedDateTime2, String str12, int i10, Object obj) {
        String str13;
        ZonedDateTime zonedDateTime3;
        long j13 = (i10 & 1) != 0 ? accountAddress.id : j10;
        long j14 = (i10 & 2) != 0 ? accountAddress.digitalAccountId : j11;
        String str14 = (i10 & 4) != 0 ? accountAddress.name : str;
        String str15 = (i10 & 8) != 0 ? accountAddress.addressLine1 : str2;
        String str16 = (i10 & 16) != 0 ? accountAddress.addressLine2 : str3;
        String str17 = (i10 & 32) != 0 ? accountAddress.city : str4;
        String str18 = (i10 & 64) != 0 ? accountAddress.state : str5;
        String str19 = (i10 & 128) != 0 ? accountAddress.zipCode : str6;
        EnumC3241e enumC3241e2 = (i10 & 256) != 0 ? accountAddress.addressType : enumC3241e;
        EnumC17676d enumC17676d2 = (i10 & 512) != 0 ? accountAddress.addressValidationType : enumC17676d;
        long j15 = (i10 & 1024) != 0 ? accountAddress.contactId : j12;
        long j16 = j13;
        String str20 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? accountAddress.firstName : str7;
        String str21 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? accountAddress.lastName : str8;
        String str22 = str20;
        String str23 = (i10 & 8192) != 0 ? accountAddress.addressNickname : str9;
        String str24 = (i10 & 16384) != 0 ? accountAddress.phoneNumber : str10;
        boolean z11 = (i10 & 32768) != 0 ? accountAddress.isPrimary : z10;
        ZonedDateTime zonedDateTime4 = (i10 & 65536) != 0 ? accountAddress.createDate : zonedDateTime;
        String str25 = (i10 & 131072) != 0 ? accountAddress.createdBy : str11;
        ZonedDateTime zonedDateTime5 = (i10 & 262144) != 0 ? accountAddress.updateDate : zonedDateTime2;
        if ((i10 & 524288) != 0) {
            zonedDateTime3 = zonedDateTime5;
            str13 = accountAddress.updatedBy;
        } else {
            str13 = str12;
            zonedDateTime3 = zonedDateTime5;
        }
        return accountAddress.a(j16, j14, str14, str15, str16, str17, str18, str19, enumC3241e2, enumC17676d2, j15, str22, str21, str23, str24, z11, zonedDateTime4, str25, zonedDateTime3, str13);
    }

    public final void A(String str) {
        this.createdBy = str;
    }

    public final void B(long j10) {
        this.digitalAccountId = j10;
    }

    public final void C(String str) {
        this.firstName = str;
    }

    public final void E(long j10) {
        this.id = j10;
    }

    public final void F(String str) {
        this.lastName = str;
    }

    public final void G(String str) {
        this.name = str;
    }

    public final void I(String str) {
        this.phoneNumber = str;
    }

    public final void J(boolean z10) {
        this.isPrimary = z10;
    }

    public final void L(String str) {
        this.state = str;
    }

    public final void M(ZonedDateTime zonedDateTime) {
        this.updateDate = zonedDateTime;
    }

    public final void N(String str) {
        this.updatedBy = str;
    }

    public final void O(String str) {
        this.zipCode = str;
    }

    /* renamed from: R, reason: from getter */
    public final String getZipCode() {
        return this.zipCode;
    }

    public final AccountAddress a(long id2, long digitalAccountId, String name, String addressLine1, String addressLine2, String city, String state, String zipCode, EnumC3241e addressType, EnumC17676d addressValidationType, long contactId, String firstName, String lastName, String addressNickname, String phoneNumber, boolean isPrimary, ZonedDateTime createDate, String createdBy, ZonedDateTime updateDate, String updatedBy) {
        Intrinsics.j(addressType, "addressType");
        Intrinsics.j(addressValidationType, "addressValidationType");
        return new AccountAddress(id2, digitalAccountId, name, addressLine1, addressLine2, city, state, zipCode, addressType, addressValidationType, contactId, firstName, lastName, addressNickname, phoneNumber, isPrimary, createDate, createdBy, updateDate, updatedBy);
    }

    /* renamed from: c, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: d, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: e, reason: from getter */
    public final EnumC3241e getAddressType() {
        return this.addressType;
    }

    /* renamed from: f, reason: from getter */
    public final EnumC17676d getAddressValidationType() {
        return this.addressValidationType;
    }

    /* renamed from: g, reason: from getter */
    public final String getCity() {
        return this.city;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public final long getContactId() {
        return this.contactId;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.digitalAccountId)) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.addressLine1;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.addressLine2;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.city;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.state;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.zipCode;
        int iHashCode7 = (((((((iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.addressType.hashCode()) * 31) + this.addressValidationType.hashCode()) * 31) + Long.hashCode(this.contactId)) * 31;
        String str7 = this.firstName;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.lastName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addressNickname;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.phoneNumber;
        int iHashCode11 = (((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + Boolean.hashCode(this.isPrimary)) * 31;
        ZonedDateTime zonedDateTime = this.createDate;
        int iHashCode12 = (iHashCode11 + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str11 = this.createdBy;
        int iHashCode13 = (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        ZonedDateTime zonedDateTime2 = this.updateDate;
        int iHashCode14 = (iHashCode13 + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        String str12 = this.updatedBy;
        return iHashCode14 + (str12 != null ? str12.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getCreatedBy() {
        return this.createdBy;
    }

    /* renamed from: j, reason: from getter */
    public final long getDigitalAccountId() {
        return this.digitalAccountId;
    }

    /* renamed from: k, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: n, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: o, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: q, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: r, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* renamed from: s, reason: from getter */
    public final String getUpdatedBy() {
        return this.updatedBy;
    }

    public final void t(String str) {
        this.addressLine1 = str;
    }

    public String toString() {
        return "AccountAddress(id=" + this.id + ", digitalAccountId=" + this.digitalAccountId + ", name=" + this.name + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", city=" + this.city + ", state=" + this.state + ", zipCode=" + this.zipCode + ", addressType=" + this.addressType + ", addressValidationType=" + this.addressValidationType + ", contactId=" + this.contactId + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", addressNickname=" + this.addressNickname + ", phoneNumber=" + this.phoneNumber + ", isPrimary=" + this.isPrimary + ", createDate=" + this.createDate + ", createdBy=" + this.createdBy + ", updateDate=" + this.updateDate + ", updatedBy=" + this.updatedBy + ')';
    }

    public final void v(String str) {
        this.addressLine2 = str;
    }

    public final void w(EnumC17676d enumC17676d) {
        Intrinsics.j(enumC17676d, "<set-?>");
        this.addressValidationType = enumC17676d;
    }

    public final void x(String str) {
        this.city = str;
    }

    public final void y(ZonedDateTime zonedDateTime) {
        this.createDate = zonedDateTime;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    public /* synthetic */ AccountAddress(long j10, long j11, String str, String str2, String str3, String str4, String str5, String str6, EnumC3241e enumC3241e, EnumC17676d enumC17676d, long j12, String str7, String str8, String str9, String str10, boolean z10, ZonedDateTime zonedDateTime, String str11, ZonedDateTime zonedDateTime2, String str12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : str4, (i10 & 64) != 0 ? null : str5, (i10 & 128) != 0 ? null : str6, (i10 & 256) != 0 ? EnumC3241e.f7540d : enumC3241e, (i10 & 512) != 0 ? EnumC17676d.f165872b : enumC17676d, (i10 & 1024) != 0 ? 0L : j12, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : str7, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str8, (i10 & 8192) != 0 ? null : str9, (i10 & 16384) != 0 ? null : str10, (i10 & 32768) != 0 ? false : z10, (i10 & 65536) != 0 ? null : zonedDateTime, (i10 & 131072) != 0 ? null : str11, (i10 & 262144) != 0 ? null : zonedDateTime2, (i10 & 524288) != 0 ? null : str12);
    }
}
