package vh;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import j$.time.Clock;
import j$.time.LocalDateTime;
import j$.time.YearMonth;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b7\b\u0087\b\u0018\u0000 q2\u00020\u0001:\u00016BÕ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010&\u001a\u00020\u000f\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+B\t\b\u0016¢\u0006\u0004\b*\u0010,J\u001d\u00102\u001a\u0002012\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020/¢\u0006\u0004\b4\u00105Jò\u0002\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010&\u001a\u00020\u000f2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020/HÖ\u0001¢\u0006\u0004\b:\u00105J\u001a\u0010=\u001a\u00020\u000f2\b\u0010<\u001a\u0004\u0018\u00010;HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u00109R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u00109R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u00109R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bQ\u0010C\u001a\u0004\bR\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bS\u0010C\u001a\u0004\bT\u00109R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bU\u0010C\u001a\u0004\bV\u00109R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b[\u0010X\u001a\u0004\b\\\u0010ZR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b]\u0010C\u001a\u0004\b^\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\b?\u0010aR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bb\u0010`\u001a\u0004\bc\u0010aR\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010C\u001a\u0004\bd\u00109R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010?\u001a\u0004\bf\u0010AR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010?\u001a\u0004\bQ\u0010AR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bc\u0010C\u001a\u0004\bW\u00109R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bR\u0010C\u001a\u0004\bS\u00109R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bT\u0010C\u001a\u0004\bU\u00109R\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bg\u0010C\u001a\u0004\bE\u00109R\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b@\u0010C\u001a\u0004\b[\u00109R\u0017\u0010\u001e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bb\u00109R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\bD\u0010h\u001a\u0004\bi\u0010jR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010?\u001a\u0004\bk\u0010AR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\bG\u00109R\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bF\u0010C\u001a\u0004\bI\u00109R\u0019\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bf\u0010C\u001a\u0004\bM\u00109R\u0019\u0010%\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bO\u0010C\u001a\u0004\bl\u00109R\u0017\u0010&\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bm\u0010X\u001a\u0004\b&\u0010ZR\u0019\u0010'\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bY\u0010`\u001a\u0004\bn\u0010aR\u0019\u0010(\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bo\u0010C\u001a\u0004\bp\u00109R\u0017\u0010)\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b^\u0010X\u001a\u0004\bo\u0010Z¨\u0006r"}, d2 = {"Lvh/a;", "Landroid/os/Parcelable;", "", "cardId", "", "cardName", "cardTypeName", "cardLastFourDigits", "Lvh/e;", "cardType", "j$/time/YearMonth", "expirationDate", "cardDescription", "cardGuid", "cardAuthToken", "", "linkToMPerks", "isPrimary", "phoneNumber", "j$/time/LocalDateTime", "termsOfServiceAgreementDate", "cardCreateDate", "cardCVV", "digitalAccountId", "addressId", "addressName", "addressLine1", "addressLine2", "addressCity", "addressState", "addressZipCode", "Lvh/d;", "addressValidationType", "addressContactId", "addressContactFirstName", "addressContactLastName", "addressContactNickname", "addressContactPhone", "isPrimaryAddress", "addressCreateDate", "providerType", "mperksFlag", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvh/e;Lj$/time/YearMonth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvh/d;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/LocalDateTime;Ljava/lang/String;Z)V", "()V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvh/e;Lj$/time/YearMonth;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvh/d;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLj$/time/LocalDateTime;Ljava/lang/String;Z)Lvh/a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "v", "()J", "b", "Ljava/lang/String;", "x", "c", "A", "d", "w", "e", "Lvh/e;", "y", "()Lvh/e;", "f", "Lj$/time/YearMonth;", "C", "()Lj$/time/YearMonth;", "g", "s", "h", "t", "i", "o", "j", "Z", "E", "()Z", "k", "z", "l", "G", "m", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "n", "r", "q", "p", "B", "u", "Lvh/d;", "getAddressValidationType", "()Lvh/d;", "getAddressContactId", "getAddressContactPhone", "D", "getAddressCreateDate", "F", "I", "H", "payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vh.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class AccountCreditCard implements Parcelable {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressContactLastName;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressContactNickname;

    /* renamed from: C, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressContactPhone;

    /* renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimaryAddress;

    /* renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime addressCreateDate;

    /* renamed from: F, reason: collision with root package name and from kotlin metadata and from toString */
    private final String providerType;

    /* renamed from: G, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean mperksFlag;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long cardId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardTypeName;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardLastFourDigits;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17677e cardType;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final YearMonth expirationDate;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardDescription;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardGuid;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardAuthToken;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean linkToMPerks;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrimary;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final String phoneNumber;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime termsOfServiceAgreementDate;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDateTime cardCreateDate;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cardCVV;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final long digitalAccountId;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final long addressId;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressName;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine1;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressLine2;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressCity;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressState;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressZipCode;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC17676d addressValidationType;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final long addressContactId;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final String addressContactFirstName;
    public static final Parcelable.Creator<AccountCreditCard> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vh.a$b */
    public static final class b implements Parcelable.Creator<AccountCreditCard> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AccountCreditCard createFromParcel(Parcel parcel) {
            boolean z10;
            boolean z11;
            boolean z12;
            Intrinsics.j(parcel, "parcel");
            long j10 = parcel.readLong();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            EnumC17677e enumC17677eValueOf = EnumC17677e.valueOf(parcel.readString());
            YearMonth yearMonth = (YearMonth) parcel.readSerializable();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z13 = false;
            boolean z14 = true;
            if (parcel.readInt() != 0) {
                z10 = false;
                z13 = true;
            } else {
                z10 = false;
            }
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = true;
                z14 = z10;
            }
            String string7 = parcel.readString();
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            LocalDateTime localDateTime2 = (LocalDateTime) parcel.readSerializable();
            String string8 = parcel.readString();
            long j11 = parcel.readLong();
            long j12 = parcel.readLong();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            EnumC17676d enumC17676dValueOf = EnumC17676d.valueOf(parcel.readString());
            long j13 = parcel.readLong();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            boolean z15 = z11;
            String string18 = parcel.readString();
            if (parcel.readInt() != 0) {
                z12 = z15;
            } else {
                z12 = z15;
                z15 = z10;
            }
            LocalDateTime localDateTime3 = (LocalDateTime) parcel.readSerializable();
            boolean z16 = z12;
            String string19 = parcel.readString();
            if (parcel.readInt() == 0) {
                z16 = z10;
            }
            return new AccountCreditCard(j10, string, string2, string3, enumC17677eValueOf, yearMonth, string4, string5, string6, z13, z14, string7, localDateTime, localDateTime2, string8, j11, j12, string9, string10, string11, string12, string13, string14, enumC17676dValueOf, j13, string15, string16, string17, string18, z15, localDateTime3, string19, z16);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final AccountCreditCard[] newArray(int i10) {
            return new AccountCreditCard[i10];
        }
    }

    public AccountCreditCard(long j10, String cardName, String str, String cardLastFourDigits, EnumC17677e cardType, YearMonth expirationDate, String str2, String str3, String cardAuthToken, boolean z10, boolean z11, String str4, LocalDateTime localDateTime, LocalDateTime localDateTime2, String cardCVV, long j11, long j12, String str5, String addressLine1, String str6, String addressCity, String addressState, String addressZipCode, EnumC17676d addressValidationType, long j13, String addressContactFirstName, String addressContactLastName, String str7, String str8, boolean z12, LocalDateTime localDateTime3, String str9, boolean z13) {
        Intrinsics.j(cardName, "cardName");
        Intrinsics.j(cardLastFourDigits, "cardLastFourDigits");
        Intrinsics.j(cardType, "cardType");
        Intrinsics.j(expirationDate, "expirationDate");
        Intrinsics.j(cardAuthToken, "cardAuthToken");
        Intrinsics.j(cardCVV, "cardCVV");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(addressCity, "addressCity");
        Intrinsics.j(addressState, "addressState");
        Intrinsics.j(addressZipCode, "addressZipCode");
        Intrinsics.j(addressValidationType, "addressValidationType");
        Intrinsics.j(addressContactFirstName, "addressContactFirstName");
        Intrinsics.j(addressContactLastName, "addressContactLastName");
        this.cardId = j10;
        this.cardName = cardName;
        this.cardTypeName = str;
        this.cardLastFourDigits = cardLastFourDigits;
        this.cardType = cardType;
        this.expirationDate = expirationDate;
        this.cardDescription = str2;
        this.cardGuid = str3;
        this.cardAuthToken = cardAuthToken;
        this.linkToMPerks = z10;
        this.isPrimary = z11;
        this.phoneNumber = str4;
        this.termsOfServiceAgreementDate = localDateTime;
        this.cardCreateDate = localDateTime2;
        this.cardCVV = cardCVV;
        this.digitalAccountId = j11;
        this.addressId = j12;
        this.addressName = str5;
        this.addressLine1 = addressLine1;
        this.addressLine2 = str6;
        this.addressCity = addressCity;
        this.addressState = addressState;
        this.addressZipCode = addressZipCode;
        this.addressValidationType = addressValidationType;
        this.addressContactId = j13;
        this.addressContactFirstName = addressContactFirstName;
        this.addressContactLastName = addressContactLastName;
        this.addressContactNickname = str7;
        this.addressContactPhone = str8;
        this.isPrimaryAddress = z12;
        this.addressCreateDate = localDateTime3;
        this.providerType = str9;
        this.mperksFlag = z13;
    }

    public static /* synthetic */ AccountCreditCard b(AccountCreditCard accountCreditCard, long j10, String str, String str2, String str3, EnumC17677e enumC17677e, YearMonth yearMonth, String str4, String str5, String str6, boolean z10, boolean z11, String str7, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str8, long j11, long j12, String str9, String str10, String str11, String str12, String str13, String str14, EnumC17676d enumC17676d, long j13, String str15, String str16, String str17, String str18, boolean z12, LocalDateTime localDateTime3, String str19, boolean z13, int i10, int i11, Object obj) {
        boolean z14;
        String str20;
        long j14;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        EnumC17676d enumC17676d2;
        long j15;
        String str27;
        String str28;
        String str29;
        boolean z15;
        LocalDateTime localDateTime4;
        String str30;
        String str31;
        String str32;
        String str33;
        String str34;
        EnumC17677e enumC17677e2;
        YearMonth yearMonth2;
        String str35;
        String str36;
        String str37;
        boolean z16;
        boolean z17;
        String str38;
        LocalDateTime localDateTime5;
        LocalDateTime localDateTime6;
        long j16;
        AccountCreditCard accountCreditCard2;
        long j17 = (i10 & 1) != 0 ? accountCreditCard.cardId : j10;
        String str39 = (i10 & 2) != 0 ? accountCreditCard.cardName : str;
        String str40 = (i10 & 4) != 0 ? accountCreditCard.cardTypeName : str2;
        String str41 = (i10 & 8) != 0 ? accountCreditCard.cardLastFourDigits : str3;
        EnumC17677e enumC17677e3 = (i10 & 16) != 0 ? accountCreditCard.cardType : enumC17677e;
        YearMonth yearMonth3 = (i10 & 32) != 0 ? accountCreditCard.expirationDate : yearMonth;
        String str42 = (i10 & 64) != 0 ? accountCreditCard.cardDescription : str4;
        String str43 = (i10 & 128) != 0 ? accountCreditCard.cardGuid : str5;
        String str44 = (i10 & 256) != 0 ? accountCreditCard.cardAuthToken : str6;
        boolean z18 = (i10 & 512) != 0 ? accountCreditCard.linkToMPerks : z10;
        boolean z19 = (i10 & 1024) != 0 ? accountCreditCard.isPrimary : z11;
        String str45 = (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? accountCreditCard.phoneNumber : str7;
        LocalDateTime localDateTime7 = (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? accountCreditCard.termsOfServiceAgreementDate : localDateTime;
        long j18 = j17;
        LocalDateTime localDateTime8 = (i10 & 8192) != 0 ? accountCreditCard.cardCreateDate : localDateTime2;
        String str46 = (i10 & 16384) != 0 ? accountCreditCard.cardCVV : str8;
        LocalDateTime localDateTime9 = localDateTime8;
        long j19 = (i10 & 32768) != 0 ? accountCreditCard.digitalAccountId : j11;
        long j20 = (i10 & 65536) != 0 ? accountCreditCard.addressId : j12;
        String str47 = (i10 & 131072) != 0 ? accountCreditCard.addressName : str9;
        String str48 = (i10 & 262144) != 0 ? accountCreditCard.addressLine1 : str10;
        String str49 = str47;
        String str50 = (i10 & 524288) != 0 ? accountCreditCard.addressLine2 : str11;
        String str51 = (i10 & 1048576) != 0 ? accountCreditCard.addressCity : str12;
        String str52 = (i10 & 2097152) != 0 ? accountCreditCard.addressState : str13;
        String str53 = (i10 & 4194304) != 0 ? accountCreditCard.addressZipCode : str14;
        EnumC17676d enumC17676d3 = (i10 & 8388608) != 0 ? accountCreditCard.addressValidationType : enumC17676d;
        String str54 = str48;
        long j21 = (i10 & 16777216) != 0 ? accountCreditCard.addressContactId : j13;
        String str55 = (i10 & 33554432) != 0 ? accountCreditCard.addressContactFirstName : str15;
        String str56 = (i10 & 67108864) != 0 ? accountCreditCard.addressContactLastName : str16;
        String str57 = str55;
        String str58 = (i10 & 134217728) != 0 ? accountCreditCard.addressContactNickname : str17;
        String str59 = (i10 & 268435456) != 0 ? accountCreditCard.addressContactPhone : str18;
        boolean z20 = (i10 & 536870912) != 0 ? accountCreditCard.isPrimaryAddress : z12;
        LocalDateTime localDateTime10 = (i10 & 1073741824) != 0 ? accountCreditCard.addressCreateDate : localDateTime3;
        String str60 = (i10 & Integer.MIN_VALUE) != 0 ? accountCreditCard.providerType : str19;
        if ((i11 & 1) != 0) {
            str20 = str60;
            z14 = accountCreditCard.mperksFlag;
            str21 = str49;
            str22 = str50;
            str23 = str51;
            str24 = str52;
            str25 = str53;
            str26 = str54;
            enumC17676d2 = enumC17676d3;
            j15 = j21;
            str27 = str57;
            str28 = str58;
            str29 = str59;
            z15 = z20;
            localDateTime4 = localDateTime10;
            str30 = str56;
            str31 = str46;
            str34 = str41;
            enumC17677e2 = enumC17677e3;
            yearMonth2 = yearMonth3;
            str35 = str42;
            str36 = str43;
            str37 = str44;
            z16 = z18;
            z17 = z19;
            str38 = str45;
            localDateTime5 = localDateTime7;
            localDateTime6 = localDateTime9;
            j16 = j19;
            j14 = j20;
            accountCreditCard2 = accountCreditCard;
            str32 = str39;
            str33 = str40;
        } else {
            z14 = z13;
            str20 = str60;
            j14 = j20;
            str21 = str49;
            str22 = str50;
            str23 = str51;
            str24 = str52;
            str25 = str53;
            str26 = str54;
            enumC17676d2 = enumC17676d3;
            j15 = j21;
            str27 = str57;
            str28 = str58;
            str29 = str59;
            z15 = z20;
            localDateTime4 = localDateTime10;
            str30 = str56;
            str31 = str46;
            str32 = str39;
            str33 = str40;
            str34 = str41;
            enumC17677e2 = enumC17677e3;
            yearMonth2 = yearMonth3;
            str35 = str42;
            str36 = str43;
            str37 = str44;
            z16 = z18;
            z17 = z19;
            str38 = str45;
            localDateTime5 = localDateTime7;
            localDateTime6 = localDateTime9;
            j16 = j19;
            accountCreditCard2 = accountCreditCard;
        }
        return accountCreditCard2.a(j18, str32, str33, str34, enumC17677e2, yearMonth2, str35, str36, str37, z16, z17, str38, localDateTime5, localDateTime6, str31, j16, j14, str21, str26, str22, str23, str24, str25, enumC17676d2, j15, str27, str30, str28, str29, z15, localDateTime4, str20, z14);
    }

    public final AccountCreditCard a(long cardId, String cardName, String cardTypeName, String cardLastFourDigits, EnumC17677e cardType, YearMonth expirationDate, String cardDescription, String cardGuid, String cardAuthToken, boolean linkToMPerks, boolean isPrimary, String phoneNumber, LocalDateTime termsOfServiceAgreementDate, LocalDateTime cardCreateDate, String cardCVV, long digitalAccountId, long addressId, String addressName, String addressLine1, String addressLine2, String addressCity, String addressState, String addressZipCode, EnumC17676d addressValidationType, long addressContactId, String addressContactFirstName, String addressContactLastName, String addressContactNickname, String addressContactPhone, boolean isPrimaryAddress, LocalDateTime addressCreateDate, String providerType, boolean mperksFlag) {
        Intrinsics.j(cardName, "cardName");
        Intrinsics.j(cardLastFourDigits, "cardLastFourDigits");
        Intrinsics.j(cardType, "cardType");
        Intrinsics.j(expirationDate, "expirationDate");
        Intrinsics.j(cardAuthToken, "cardAuthToken");
        Intrinsics.j(cardCVV, "cardCVV");
        Intrinsics.j(addressLine1, "addressLine1");
        Intrinsics.j(addressCity, "addressCity");
        Intrinsics.j(addressState, "addressState");
        Intrinsics.j(addressZipCode, "addressZipCode");
        Intrinsics.j(addressValidationType, "addressValidationType");
        Intrinsics.j(addressContactFirstName, "addressContactFirstName");
        Intrinsics.j(addressContactLastName, "addressContactLastName");
        return new AccountCreditCard(cardId, cardName, cardTypeName, cardLastFourDigits, cardType, expirationDate, cardDescription, cardGuid, cardAuthToken, linkToMPerks, isPrimary, phoneNumber, termsOfServiceAgreementDate, cardCreateDate, cardCVV, digitalAccountId, addressId, addressName, addressLine1, addressLine2, addressCity, addressState, addressZipCode, addressValidationType, addressContactId, addressContactFirstName, addressContactLastName, addressContactNickname, addressContactPhone, isPrimaryAddress, addressCreateDate, providerType, mperksFlag);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountCreditCard)) {
            return false;
        }
        AccountCreditCard accountCreditCard = (AccountCreditCard) other;
        return this.cardId == accountCreditCard.cardId && Intrinsics.e(this.cardName, accountCreditCard.cardName) && Intrinsics.e(this.cardTypeName, accountCreditCard.cardTypeName) && Intrinsics.e(this.cardLastFourDigits, accountCreditCard.cardLastFourDigits) && this.cardType == accountCreditCard.cardType && Intrinsics.e(this.expirationDate, accountCreditCard.expirationDate) && Intrinsics.e(this.cardDescription, accountCreditCard.cardDescription) && Intrinsics.e(this.cardGuid, accountCreditCard.cardGuid) && Intrinsics.e(this.cardAuthToken, accountCreditCard.cardAuthToken) && this.linkToMPerks == accountCreditCard.linkToMPerks && this.isPrimary == accountCreditCard.isPrimary && Intrinsics.e(this.phoneNumber, accountCreditCard.phoneNumber) && Intrinsics.e(this.termsOfServiceAgreementDate, accountCreditCard.termsOfServiceAgreementDate) && Intrinsics.e(this.cardCreateDate, accountCreditCard.cardCreateDate) && Intrinsics.e(this.cardCVV, accountCreditCard.cardCVV) && this.digitalAccountId == accountCreditCard.digitalAccountId && this.addressId == accountCreditCard.addressId && Intrinsics.e(this.addressName, accountCreditCard.addressName) && Intrinsics.e(this.addressLine1, accountCreditCard.addressLine1) && Intrinsics.e(this.addressLine2, accountCreditCard.addressLine2) && Intrinsics.e(this.addressCity, accountCreditCard.addressCity) && Intrinsics.e(this.addressState, accountCreditCard.addressState) && Intrinsics.e(this.addressZipCode, accountCreditCard.addressZipCode) && this.addressValidationType == accountCreditCard.addressValidationType && this.addressContactId == accountCreditCard.addressContactId && Intrinsics.e(this.addressContactFirstName, accountCreditCard.addressContactFirstName) && Intrinsics.e(this.addressContactLastName, accountCreditCard.addressContactLastName) && Intrinsics.e(this.addressContactNickname, accountCreditCard.addressContactNickname) && Intrinsics.e(this.addressContactPhone, accountCreditCard.addressContactPhone) && this.isPrimaryAddress == accountCreditCard.isPrimaryAddress && Intrinsics.e(this.addressCreateDate, accountCreditCard.addressCreateDate) && Intrinsics.e(this.providerType, accountCreditCard.providerType) && this.mperksFlag == accountCreditCard.mperksFlag;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.cardId);
        dest.writeString(this.cardName);
        dest.writeString(this.cardTypeName);
        dest.writeString(this.cardLastFourDigits);
        dest.writeString(this.cardType.name());
        dest.writeSerializable(this.expirationDate);
        dest.writeString(this.cardDescription);
        dest.writeString(this.cardGuid);
        dest.writeString(this.cardAuthToken);
        dest.writeInt(this.linkToMPerks ? 1 : 0);
        dest.writeInt(this.isPrimary ? 1 : 0);
        dest.writeString(this.phoneNumber);
        dest.writeSerializable(this.termsOfServiceAgreementDate);
        dest.writeSerializable(this.cardCreateDate);
        dest.writeString(this.cardCVV);
        dest.writeLong(this.digitalAccountId);
        dest.writeLong(this.addressId);
        dest.writeString(this.addressName);
        dest.writeString(this.addressLine1);
        dest.writeString(this.addressLine2);
        dest.writeString(this.addressCity);
        dest.writeString(this.addressState);
        dest.writeString(this.addressZipCode);
        dest.writeString(this.addressValidationType.name());
        dest.writeLong(this.addressContactId);
        dest.writeString(this.addressContactFirstName);
        dest.writeString(this.addressContactLastName);
        dest.writeString(this.addressContactNickname);
        dest.writeString(this.addressContactPhone);
        dest.writeInt(this.isPrimaryAddress ? 1 : 0);
        dest.writeSerializable(this.addressCreateDate);
        dest.writeString(this.providerType);
        dest.writeInt(this.mperksFlag ? 1 : 0);
    }

    /* renamed from: A, reason: from getter */
    public final String getCardTypeName() {
        return this.cardTypeName;
    }

    /* renamed from: B, reason: from getter */
    public final long getDigitalAccountId() {
        return this.digitalAccountId;
    }

    /* renamed from: C, reason: from getter */
    public final YearMonth getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: E, reason: from getter */
    public final boolean getLinkToMPerks() {
        return this.linkToMPerks;
    }

    /* renamed from: F, reason: from getter */
    public final boolean getMperksFlag() {
        return this.mperksFlag;
    }

    /* renamed from: G, reason: from getter */
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: I, reason: from getter */
    public final String getProviderType() {
        return this.providerType;
    }

    /* renamed from: J, reason: from getter */
    public final LocalDateTime getTermsOfServiceAgreementDate() {
        return this.termsOfServiceAgreementDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getAddressCity() {
        return this.addressCity;
    }

    /* renamed from: d, reason: from getter */
    public final String getAddressContactFirstName() {
        return this.addressContactFirstName;
    }

    /* renamed from: e, reason: from getter */
    public final String getAddressContactLastName() {
        return this.addressContactLastName;
    }

    /* renamed from: f, reason: from getter */
    public final String getAddressContactNickname() {
        return this.addressContactNickname;
    }

    /* renamed from: g, reason: from getter */
    public final long getAddressId() {
        return this.addressId;
    }

    /* renamed from: h, reason: from getter */
    public final String getAddressLine1() {
        return this.addressLine1;
    }

    public int hashCode() {
        int iHashCode = ((Long.hashCode(this.cardId) * 31) + this.cardName.hashCode()) * 31;
        String str = this.cardTypeName;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.cardLastFourDigits.hashCode()) * 31) + this.cardType.hashCode()) * 31) + this.expirationDate.hashCode()) * 31;
        String str2 = this.cardDescription;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cardGuid;
        int iHashCode4 = (((((((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.cardAuthToken.hashCode()) * 31) + Boolean.hashCode(this.linkToMPerks)) * 31) + Boolean.hashCode(this.isPrimary)) * 31;
        String str4 = this.phoneNumber;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LocalDateTime localDateTime = this.termsOfServiceAgreementDate;
        int iHashCode6 = (iHashCode5 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.cardCreateDate;
        int iHashCode7 = (((((((iHashCode6 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31) + this.cardCVV.hashCode()) * 31) + Long.hashCode(this.digitalAccountId)) * 31) + Long.hashCode(this.addressId)) * 31;
        String str5 = this.addressName;
        int iHashCode8 = (((iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.addressLine1.hashCode()) * 31;
        String str6 = this.addressLine2;
        int iHashCode9 = (((((((((((((((iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.addressCity.hashCode()) * 31) + this.addressState.hashCode()) * 31) + this.addressZipCode.hashCode()) * 31) + this.addressValidationType.hashCode()) * 31) + Long.hashCode(this.addressContactId)) * 31) + this.addressContactFirstName.hashCode()) * 31) + this.addressContactLastName.hashCode()) * 31;
        String str7 = this.addressContactNickname;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.addressContactPhone;
        int iHashCode11 = (((iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31) + Boolean.hashCode(this.isPrimaryAddress)) * 31;
        LocalDateTime localDateTime3 = this.addressCreateDate;
        int iHashCode12 = (iHashCode11 + (localDateTime3 == null ? 0 : localDateTime3.hashCode())) * 31;
        String str9 = this.providerType;
        return ((iHashCode12 + (str9 != null ? str9.hashCode() : 0)) * 31) + Boolean.hashCode(this.mperksFlag);
    }

    /* renamed from: i, reason: from getter */
    public final String getAddressLine2() {
        return this.addressLine2;
    }

    /* renamed from: j, reason: from getter */
    public final String getAddressName() {
        return this.addressName;
    }

    /* renamed from: k, reason: from getter */
    public final String getAddressState() {
        return this.addressState;
    }

    /* renamed from: n, reason: from getter */
    public final String getAddressZipCode() {
        return this.addressZipCode;
    }

    /* renamed from: o, reason: from getter */
    public final String getCardAuthToken() {
        return this.cardAuthToken;
    }

    /* renamed from: q, reason: from getter */
    public final String getCardCVV() {
        return this.cardCVV;
    }

    /* renamed from: r, reason: from getter */
    public final LocalDateTime getCardCreateDate() {
        return this.cardCreateDate;
    }

    /* renamed from: s, reason: from getter */
    public final String getCardDescription() {
        return this.cardDescription;
    }

    /* renamed from: t, reason: from getter */
    public final String getCardGuid() {
        return this.cardGuid;
    }

    public String toString() {
        return "AccountCreditCard(cardId=" + this.cardId + ", cardName=" + this.cardName + ", cardTypeName=" + this.cardTypeName + ", cardLastFourDigits=" + this.cardLastFourDigits + ", cardType=" + this.cardType + ", expirationDate=" + this.expirationDate + ", cardDescription=" + this.cardDescription + ", cardGuid=" + this.cardGuid + ", cardAuthToken=" + this.cardAuthToken + ", linkToMPerks=" + this.linkToMPerks + ", isPrimary=" + this.isPrimary + ", phoneNumber=" + this.phoneNumber + ", termsOfServiceAgreementDate=" + this.termsOfServiceAgreementDate + ", cardCreateDate=" + this.cardCreateDate + ", cardCVV=" + this.cardCVV + ", digitalAccountId=" + this.digitalAccountId + ", addressId=" + this.addressId + ", addressName=" + this.addressName + ", addressLine1=" + this.addressLine1 + ", addressLine2=" + this.addressLine2 + ", addressCity=" + this.addressCity + ", addressState=" + this.addressState + ", addressZipCode=" + this.addressZipCode + ", addressValidationType=" + this.addressValidationType + ", addressContactId=" + this.addressContactId + ", addressContactFirstName=" + this.addressContactFirstName + ", addressContactLastName=" + this.addressContactLastName + ", addressContactNickname=" + this.addressContactNickname + ", addressContactPhone=" + this.addressContactPhone + ", isPrimaryAddress=" + this.isPrimaryAddress + ", addressCreateDate=" + this.addressCreateDate + ", providerType=" + this.providerType + ", mperksFlag=" + this.mperksFlag + ')';
    }

    /* renamed from: v, reason: from getter */
    public final long getCardId() {
        return this.cardId;
    }

    /* renamed from: w, reason: from getter */
    public final String getCardLastFourDigits() {
        return this.cardLastFourDigits;
    }

    /* renamed from: x, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* renamed from: y, reason: from getter */
    public final EnumC17677e getCardType() {
        return this.cardType;
    }

    /* renamed from: z, reason: from getter */
    public final boolean getIsPrimary() {
        return this.isPrimary;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AccountCreditCard(long r43, java.lang.String r45, java.lang.String r46, java.lang.String r47, vh.EnumC17677e r48, j$.time.YearMonth r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, boolean r53, boolean r54, java.lang.String r55, j$.time.LocalDateTime r56, j$.time.LocalDateTime r57, java.lang.String r58, long r59, long r61, java.lang.String r63, java.lang.String r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, vh.EnumC17676d r69, long r70, java.lang.String r72, java.lang.String r73, java.lang.String r74, java.lang.String r75, boolean r76, j$.time.LocalDateTime r77, java.lang.String r78, boolean r79, int r80, int r81, kotlin.jvm.internal.DefaultConstructorMarker r82) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh.AccountCreditCard.<init>(long, java.lang.String, java.lang.String, java.lang.String, vh.e, j$.time.YearMonth, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, j$.time.LocalDateTime, j$.time.LocalDateTime, java.lang.String, long, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, vh.d, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, j$.time.LocalDateTime, java.lang.String, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AccountCreditCard() {
        EnumC17677e enumC17677e = EnumC17677e.f165888j;
        YearMonth yearMonthNow = YearMonth.now(Clock.systemUTC());
        Intrinsics.i(yearMonthNow, "now(...)");
        this(0L, "", null, "", enumC17677e, yearMonthNow, null, null, "-1", false, false, null, null, null, "", 0L, 0L, null, "", null, "", "", "", EnumC17676d.f165872b, 0L, "", "", null, null, false, null, "", false);
    }
}
