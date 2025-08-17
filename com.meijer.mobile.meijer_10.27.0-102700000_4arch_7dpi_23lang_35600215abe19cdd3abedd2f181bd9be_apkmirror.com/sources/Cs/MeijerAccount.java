package Cs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import io.constructor.data.local.PreferencesHelper;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\b\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\bI\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\f\b\u0002\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\f\b\u0002\u0010\u0017\u001a\u00060\u0010j\u0002`\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\f\b\u0002\u0010\u001a\u001a\u00060\u0010j\u0002`\u0011\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010#\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0010¢\u0006\u0004\b,\u0010-JÖ\u0002\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\f\b\u0002\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00042\f\b\u0002\u0010\u0017\u001a\u00060\u0010j\u0002`\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00022\f\b\u0002\u0010\u001a\u001a\u00060\u0010j\u0002`\u00112\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b2\u0010-J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b6\u00107R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u00101\"\u0004\b@\u0010AR$\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010>\u001a\u0004\bC\u00101\"\u0004\bD\u0010AR$\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010>\u001a\u0004\bF\u00101\"\u0004\bG\u0010AR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010>\u001a\u0004\bI\u00101\"\u0004\bJ\u0010AR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bK\u00101\"\u0004\bL\u0010AR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010>\u001a\u0004\bN\u00101\"\u0004\bO\u0010AR$\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010>\u001a\u0004\bQ\u00101\"\u0004\bR\u0010AR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010>\u001a\u0004\bT\u00101\"\u0004\bU\u0010AR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010>\u001a\u0004\bV\u00101\"\u0004\bW\u0010AR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010>\u001a\u0004\bX\u00101\"\u0004\b8\u0010AR&\u0010\u0012\u001a\u00060\u0010j\u0002`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010-\"\u0004\bZ\u0010\\R$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010>\u001a\u0004\bB\u00101\"\u0004\b^\u0010AR\"\u0010\u0014\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u00108\u001a\u0004\b_\u0010:\"\u0004\b`\u0010<R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u00108\u001a\u0004\bb\u0010:\"\u0004\bc\u0010<R$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010>\u001a\u0004\be\u00101\"\u0004\bf\u0010AR&\u0010\u0017\u001a\u00060\u0010j\u0002`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010Z\u001a\u0004\bg\u0010-\"\u0004\bh\u0010\\R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010>\u001a\u0004\ba\u00101\"\u0004\bi\u0010AR\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\be\u00108\u001a\u0004\bM\u0010:\"\u0004\bj\u0010<R&\u0010\u001a\u001a\u00060\u0010j\u0002`\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010Z\u001a\u0004\bS\u0010-\"\u0004\bk\u0010\\R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010>\u001a\u0004\bP\u00101\"\u0004\bl\u0010AR$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010>\u001a\u0004\bn\u00101\"\u0004\bo\u0010AR$\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010>\u001a\u0004\bp\u00101\"\u0004\bq\u0010AR$\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010r\u001a\u0004\bE\u0010s\"\u0004\bt\u0010uR$\u0010!\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010v\u001a\u0004\bH\u0010w\"\u0004\bx\u0010yR$\u0010\"\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010v\u001a\u0004\b{\u0010w\"\u0004\b|\u0010yR\"\u0010#\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u00108\u001a\u0004\bm\u0010:\"\u0004\b}\u0010<¨\u0006~"}, d2 = {"LCs/a;", "Landroid/os/Parcelable;", "", PreferencesHelper.PREF_ID, "", "Lcom/meijer/mobile/core/model/common/ExternalShopperId;", "externalShopperId", "email", "password", "emailConfirm", "passwordConfirm", "currentPassword", "substitutionPreference", "firstName", "lastName", "zip", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "accountStatus", "mPerksId", "mPerksPhone", "mPerksPin", "mPerksStoreId", "mPerkStatus", "employeeId", "employeeStoreId", "employeeStatus", "createdBy", "updatedBy", "j$/time/LocalDate", "birthDate", "j$/time/LocalDateTime", "createdDate", "updatedDate", "mperksCardNumber", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JJLjava/lang/String;ILjava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;J)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;JJLjava/lang/String;ILjava/lang/String;JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDate;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;J)LCs/a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "k", "()J", "B", "(J)V", "b", "Ljava/lang/String;", "getExternalShopperId", "setExternalShopperId", "(Ljava/lang/String;)V", "c", "f", "y", "d", "w", "G", "e", "getEmailConfirm", "setEmailConfirm", "getPasswordConfirm", "setPasswordConfirm", "g", "getCurrentPassword", "setCurrentPassword", "h", "getSubstitutionPreference", "setSubstitutionPreference", "i", "j", "A", "n", "C", "x", "l", "I", "u", "(I)V", "m", "setAccountStatus", "q", "setMPerksId", "o", "r", "E", "p", "s", "F", "t", "setMPerksStoreId", "setMPerkStatus", "setEmployeeId", "setEmployeeStoreId", "setEmployeeStatus", "v", "getCreatedBy", "setCreatedBy", "getUpdatedBy", "setUpdatedBy", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "setBirthDate", "(Lj$/time/LocalDate;)V", "Lj$/time/LocalDateTime;", "()Lj$/time/LocalDateTime;", "setCreatedDate", "(Lj$/time/LocalDateTime;)V", "z", "getUpdatedDate", "setUpdatedDate", "setMperksCardNumber", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Cs.a, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class MeijerAccount implements Parcelable {
    public static final Parcelable.Creator<MeijerAccount> CREATOR = new C0086a();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata and from toString */
    private long mperksCardNumber;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String externalShopperId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String email;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String password;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String emailConfirm;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String passwordConfirm;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private String currentPassword;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private String substitutionPreference;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private String firstName;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private String lastName;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private String zip;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private int storeId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private String accountStatus;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private long mPerksId;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private long mPerksPhone;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private String mPerksPin;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private int mPerksStoreId;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private String mPerkStatus;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private long employeeId;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private int employeeStoreId;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private String employeeStatus;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private String createdBy;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private String updatedBy;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private LocalDate birthDate;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private LocalDateTime createdDate;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private LocalDateTime updatedDate;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Cs.a$a, reason: collision with other inner class name */
    public static final class C0086a implements Parcelable.Creator<MeijerAccount> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MeijerAccount createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new MeijerAccount(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), (LocalDate) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MeijerAccount[] newArray(int i10) {
            return new MeijerAccount[i10];
        }
    }

    public MeijerAccount() {
        this(0L, null, null, null, null, null, null, null, null, null, null, 0, null, 0L, 0L, null, 0, null, 0L, 0, null, null, null, null, null, null, 0L, 134217727, null);
    }

    public static /* synthetic */ MeijerAccount b(MeijerAccount meijerAccount, long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, String str11, long j11, long j12, String str12, int i11, String str13, long j13, int i12, String str14, String str15, String str16, LocalDate localDate, LocalDateTime localDateTime, LocalDateTime localDateTime2, long j14, int i13, Object obj) {
        long j15;
        LocalDateTime localDateTime3;
        String str17;
        long j16 = (i13 & 1) != 0 ? meijerAccount.id : j10;
        String str18 = (i13 & 2) != 0 ? meijerAccount.externalShopperId : str;
        String str19 = (i13 & 4) != 0 ? meijerAccount.email : str2;
        String str20 = (i13 & 8) != 0 ? meijerAccount.password : str3;
        String str21 = (i13 & 16) != 0 ? meijerAccount.emailConfirm : str4;
        String str22 = (i13 & 32) != 0 ? meijerAccount.passwordConfirm : str5;
        String str23 = (i13 & 64) != 0 ? meijerAccount.currentPassword : str6;
        String str24 = (i13 & 128) != 0 ? meijerAccount.substitutionPreference : str7;
        String str25 = (i13 & 256) != 0 ? meijerAccount.firstName : str8;
        String str26 = (i13 & 512) != 0 ? meijerAccount.lastName : str9;
        String str27 = (i13 & 1024) != 0 ? meijerAccount.zip : str10;
        int i14 = (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? meijerAccount.storeId : i10;
        String str28 = (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? meijerAccount.accountStatus : str11;
        long j17 = j16;
        long j18 = (i13 & 8192) != 0 ? meijerAccount.mPerksId : j11;
        long j19 = (i13 & 16384) != 0 ? meijerAccount.mPerksPhone : j12;
        String str29 = (i13 & 32768) != 0 ? meijerAccount.mPerksPin : str12;
        int i15 = (i13 & 65536) != 0 ? meijerAccount.mPerksStoreId : i11;
        String str30 = (i13 & 131072) != 0 ? meijerAccount.mPerkStatus : str13;
        long j20 = j19;
        long j21 = (i13 & 262144) != 0 ? meijerAccount.employeeId : j13;
        int i16 = (i13 & 524288) != 0 ? meijerAccount.employeeStoreId : i12;
        long j22 = j21;
        String str31 = (i13 & 1048576) != 0 ? meijerAccount.employeeStatus : str14;
        String str32 = (i13 & 2097152) != 0 ? meijerAccount.createdBy : str15;
        String str33 = str31;
        String str34 = (i13 & 4194304) != 0 ? meijerAccount.updatedBy : str16;
        LocalDate localDate2 = (i13 & 8388608) != 0 ? meijerAccount.birthDate : localDate;
        LocalDateTime localDateTime4 = (i13 & 16777216) != 0 ? meijerAccount.createdDate : localDateTime;
        LocalDateTime localDateTime5 = (i13 & 33554432) != 0 ? meijerAccount.updatedDate : localDateTime2;
        if ((i13 & 67108864) != 0) {
            str17 = str32;
            localDateTime3 = localDateTime5;
            j15 = meijerAccount.mperksCardNumber;
        } else {
            j15 = j14;
            localDateTime3 = localDateTime5;
            str17 = str32;
        }
        return meijerAccount.a(j17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, i14, str28, j18, j20, str29, i15, str30, j22, i16, str33, str17, str34, localDate2, localDateTime4, localDateTime3, j15);
    }

    public final MeijerAccount a(long id2, String externalShopperId, String email, String password, String emailConfirm, String passwordConfirm, String currentPassword, String substitutionPreference, String firstName, String lastName, String zip, int storeId, String accountStatus, long mPerksId, long mPerksPhone, String mPerksPin, int mPerksStoreId, String mPerkStatus, long employeeId, int employeeStoreId, String employeeStatus, String createdBy, String updatedBy, LocalDate birthDate, LocalDateTime createdDate, LocalDateTime updatedDate, long mperksCardNumber) {
        return new MeijerAccount(id2, externalShopperId, email, password, emailConfirm, passwordConfirm, currentPassword, substitutionPreference, firstName, lastName, zip, storeId, accountStatus, mPerksId, mPerksPhone, mPerksPin, mPerksStoreId, mPerkStatus, employeeId, employeeStoreId, employeeStatus, createdBy, updatedBy, birthDate, createdDate, updatedDate, mperksCardNumber);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MeijerAccount)) {
            return false;
        }
        MeijerAccount meijerAccount = (MeijerAccount) other;
        return this.id == meijerAccount.id && Intrinsics.e(this.externalShopperId, meijerAccount.externalShopperId) && Intrinsics.e(this.email, meijerAccount.email) && Intrinsics.e(this.password, meijerAccount.password) && Intrinsics.e(this.emailConfirm, meijerAccount.emailConfirm) && Intrinsics.e(this.passwordConfirm, meijerAccount.passwordConfirm) && Intrinsics.e(this.currentPassword, meijerAccount.currentPassword) && Intrinsics.e(this.substitutionPreference, meijerAccount.substitutionPreference) && Intrinsics.e(this.firstName, meijerAccount.firstName) && Intrinsics.e(this.lastName, meijerAccount.lastName) && Intrinsics.e(this.zip, meijerAccount.zip) && this.storeId == meijerAccount.storeId && Intrinsics.e(this.accountStatus, meijerAccount.accountStatus) && this.mPerksId == meijerAccount.mPerksId && this.mPerksPhone == meijerAccount.mPerksPhone && Intrinsics.e(this.mPerksPin, meijerAccount.mPerksPin) && this.mPerksStoreId == meijerAccount.mPerksStoreId && Intrinsics.e(this.mPerkStatus, meijerAccount.mPerkStatus) && this.employeeId == meijerAccount.employeeId && this.employeeStoreId == meijerAccount.employeeStoreId && Intrinsics.e(this.employeeStatus, meijerAccount.employeeStatus) && Intrinsics.e(this.createdBy, meijerAccount.createdBy) && Intrinsics.e(this.updatedBy, meijerAccount.updatedBy) && Intrinsics.e(this.birthDate, meijerAccount.birthDate) && Intrinsics.e(this.createdDate, meijerAccount.createdDate) && Intrinsics.e(this.updatedDate, meijerAccount.updatedDate) && this.mperksCardNumber == meijerAccount.mperksCardNumber;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.externalShopperId);
        dest.writeString(this.email);
        dest.writeString(this.password);
        dest.writeString(this.emailConfirm);
        dest.writeString(this.passwordConfirm);
        dest.writeString(this.currentPassword);
        dest.writeString(this.substitutionPreference);
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeString(this.zip);
        dest.writeInt(this.storeId);
        dest.writeString(this.accountStatus);
        dest.writeLong(this.mPerksId);
        dest.writeLong(this.mPerksPhone);
        dest.writeString(this.mPerksPin);
        dest.writeInt(this.mPerksStoreId);
        dest.writeString(this.mPerkStatus);
        dest.writeLong(this.employeeId);
        dest.writeInt(this.employeeStoreId);
        dest.writeString(this.employeeStatus);
        dest.writeString(this.createdBy);
        dest.writeString(this.updatedBy);
        dest.writeSerializable(this.birthDate);
        dest.writeSerializable(this.createdDate);
        dest.writeSerializable(this.updatedDate);
        dest.writeLong(this.mperksCardNumber);
    }

    public MeijerAccount(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, String str11, long j11, long j12, String str12, int i11, String str13, long j13, int i12, String str14, String str15, String str16, LocalDate localDate, LocalDateTime localDateTime, LocalDateTime localDateTime2, long j14) {
        this.id = j10;
        this.externalShopperId = str;
        this.email = str2;
        this.password = str3;
        this.emailConfirm = str4;
        this.passwordConfirm = str5;
        this.currentPassword = str6;
        this.substitutionPreference = str7;
        this.firstName = str8;
        this.lastName = str9;
        this.zip = str10;
        this.storeId = i10;
        this.accountStatus = str11;
        this.mPerksId = j11;
        this.mPerksPhone = j12;
        this.mPerksPin = str12;
        this.mPerksStoreId = i11;
        this.mPerkStatus = str13;
        this.employeeId = j13;
        this.employeeStoreId = i12;
        this.employeeStatus = str14;
        this.createdBy = str15;
        this.updatedBy = str16;
        this.birthDate = localDate;
        this.createdDate = localDateTime;
        this.updatedDate = localDateTime2;
        this.mperksCardNumber = j14;
    }

    public final void A(String str) {
        this.firstName = str;
    }

    public final void B(long j10) {
        this.id = j10;
    }

    public final void C(String str) {
        this.lastName = str;
    }

    public final void E(long j10) {
        this.mPerksPhone = j10;
    }

    public final void F(String str) {
        this.mPerksPin = str;
    }

    public final void G(String str) {
        this.password = str;
    }

    public final void I(int i10) {
        this.storeId = i10;
    }

    public final void J(String str) {
        this.zip = str;
    }

    /* renamed from: c, reason: from getter */
    public final String getAccountStatus() {
        return this.accountStatus;
    }

    /* renamed from: d, reason: from getter */
    public final LocalDate getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: e, reason: from getter */
    public final LocalDateTime getCreatedDate() {
        return this.createdDate;
    }

    /* renamed from: f, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* renamed from: g, reason: from getter */
    public final long getEmployeeId() {
        return this.employeeId;
    }

    /* renamed from: h, reason: from getter */
    public final String getEmployeeStatus() {
        return this.employeeStatus;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.id) * 31;
        String str = this.externalShopperId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.password;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.emailConfirm;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.passwordConfirm;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.currentPassword;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.substitutionPreference;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.firstName;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.lastName;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.zip;
        int iHashCode11 = (((iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31) + Integer.hashCode(this.storeId)) * 31;
        String str11 = this.accountStatus;
        int iHashCode12 = (((((iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31) + Long.hashCode(this.mPerksId)) * 31) + Long.hashCode(this.mPerksPhone)) * 31;
        String str12 = this.mPerksPin;
        int iHashCode13 = (((iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31) + Integer.hashCode(this.mPerksStoreId)) * 31;
        String str13 = this.mPerkStatus;
        int iHashCode14 = (((((iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31) + Long.hashCode(this.employeeId)) * 31) + Integer.hashCode(this.employeeStoreId)) * 31;
        String str14 = this.employeeStatus;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.createdBy;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.updatedBy;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        LocalDate localDate = this.birthDate;
        int iHashCode18 = (iHashCode17 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDateTime localDateTime = this.createdDate;
        int iHashCode19 = (iHashCode18 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.updatedDate;
        return ((iHashCode19 + (localDateTime2 != null ? localDateTime2.hashCode() : 0)) * 31) + Long.hashCode(this.mperksCardNumber);
    }

    /* renamed from: i, reason: from getter */
    public final int getEmployeeStoreId() {
        return this.employeeStoreId;
    }

    /* renamed from: j, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* renamed from: k, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: n, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* renamed from: o, reason: from getter */
    public final String getMPerkStatus() {
        return this.mPerkStatus;
    }

    /* renamed from: q, reason: from getter */
    public final long getMPerksId() {
        return this.mPerksId;
    }

    /* renamed from: r, reason: from getter */
    public final long getMPerksPhone() {
        return this.mPerksPhone;
    }

    /* renamed from: s, reason: from getter */
    public final String getMPerksPin() {
        return this.mPerksPin;
    }

    /* renamed from: t, reason: from getter */
    public final int getMPerksStoreId() {
        return this.mPerksStoreId;
    }

    public String toString() {
        return "MeijerAccount(id=" + this.id + ", externalShopperId=" + this.externalShopperId + ", email=" + this.email + ", password=" + this.password + ", emailConfirm=" + this.emailConfirm + ", passwordConfirm=" + this.passwordConfirm + ", currentPassword=" + this.currentPassword + ", substitutionPreference=" + this.substitutionPreference + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", zip=" + this.zip + ", storeId=" + this.storeId + ", accountStatus=" + this.accountStatus + ", mPerksId=" + this.mPerksId + ", mPerksPhone=" + this.mPerksPhone + ", mPerksPin=" + this.mPerksPin + ", mPerksStoreId=" + this.mPerksStoreId + ", mPerkStatus=" + this.mPerkStatus + ", employeeId=" + this.employeeId + ", employeeStoreId=" + this.employeeStoreId + ", employeeStatus=" + this.employeeStatus + ", createdBy=" + this.createdBy + ", updatedBy=" + this.updatedBy + ", birthDate=" + this.birthDate + ", createdDate=" + this.createdDate + ", updatedDate=" + this.updatedDate + ", mperksCardNumber=" + this.mperksCardNumber + ')';
    }

    /* renamed from: u, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    /* renamed from: v, reason: from getter */
    public final long getMperksCardNumber() {
        return this.mperksCardNumber;
    }

    /* renamed from: w, reason: from getter */
    public final String getPassword() {
        return this.password;
    }

    /* renamed from: x, reason: from getter */
    public final String getZip() {
        return this.zip;
    }

    public final void y(String str) {
        this.email = str;
    }

    public /* synthetic */ MeijerAccount(long j10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i10, String str11, long j11, long j12, String str12, int i11, String str13, long j13, int i12, String str14, String str15, String str16, LocalDate localDate, LocalDateTime localDateTime, LocalDateTime localDateTime2, long j14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0L : j10, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? null : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? null : str6, (i13 & 128) != 0 ? null : str7, (i13 & 256) != 0 ? null : str8, (i13 & 512) != 0 ? null : str9, (i13 & 1024) != 0 ? null : str10, (i13 & RecyclerView.m.FLAG_MOVED) != 0 ? 0 : i10, (i13 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str11, (i13 & 8192) != 0 ? 0L : j11, (i13 & 16384) != 0 ? 0L : j12, (32768 & i13) != 0 ? null : str12, (i13 & 65536) != 0 ? 0 : i11, (i13 & 131072) != 0 ? null : str13, (i13 & 262144) != 0 ? 0L : j13, (i13 & 524288) != 0 ? 0 : i12, (i13 & 1048576) != 0 ? null : str14, (i13 & 2097152) != 0 ? null : str15, (i13 & 4194304) != 0 ? null : str16, (i13 & 8388608) != 0 ? null : localDate, (i13 & 16777216) != 0 ? null : localDateTime, (i13 & 33554432) != 0 ? null : localDateTime2, (i13 & 67108864) != 0 ? 0L : j14);
    }
}
