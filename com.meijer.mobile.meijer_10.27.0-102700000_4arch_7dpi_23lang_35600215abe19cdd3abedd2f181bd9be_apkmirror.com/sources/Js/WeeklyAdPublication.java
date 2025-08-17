package Js;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.LocalDate;
import j$.time.OffsetDateTime;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002Bw\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0007¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b%\u0010\"J\u001a\u0010'\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\"R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b5\u0010-\u001a\u0004\b6\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u0010$R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b,\u0010<R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b>\u0010-\u001a\u0004\b?\u0010$¨\u0006@"}, d2 = {"LJs/e;", "Landroid/os/Parcelable;", "", "LJs/a;", "flyerType", "", "imageURL", "", "totalPages", "flyerID", "flyerRunId", "sfmlUrl", "postalCode", "j$/time/OffsetDateTime", "startDate", "endDate", "title", "<init>", "(LJs/a;Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Lj$/time/OffsetDateTime;Lj$/time/OffsetDateTime;Ljava/lang/String;)V", "j$/time/LocalDate", "now", "", "C", "(Lj$/time/LocalDate;)Z", "other", "a", "(LJs/e;)I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "equals", "(Ljava/lang/Object;)Z", "LJs/a;", "getFlyerType", "()LJs/a;", "b", "Ljava/lang/String;", "t", "c", "I", "getTotalPages", "d", "e", "o", "f", "w", "g", "getPostalCode", "h", "Lj$/time/OffsetDateTime;", "B", "()Lj$/time/OffsetDateTime;", "i", "j", "getTitle", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Js.e, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class WeeklyAdPublication implements Parcelable, Comparable<WeeklyAdPublication> {
    public static final Parcelable.Creator<WeeklyAdPublication> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Js.a flyerType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageURL;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int totalPages;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int flyerID;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int flyerRunId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String sfmlUrl;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String postalCode;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime startDate;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime endDate;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Js.e$a */
    public static final class a implements Parcelable.Creator<WeeklyAdPublication> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeeklyAdPublication createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new WeeklyAdPublication(Js.a.valueOf(parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), (OffsetDateTime) parcel.readSerializable(), (OffsetDateTime) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final WeeklyAdPublication[] newArray(int i10) {
            return new WeeklyAdPublication[i10];
        }
    }

    public WeeklyAdPublication() {
        this(null, null, 0, 0, 0, null, null, null, null, null, 1023, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyAdPublication)) {
            return false;
        }
        WeeklyAdPublication weeklyAdPublication = (WeeklyAdPublication) other;
        return this.flyerType == weeklyAdPublication.flyerType && Intrinsics.e(this.imageURL, weeklyAdPublication.imageURL) && this.totalPages == weeklyAdPublication.totalPages && this.flyerID == weeklyAdPublication.flyerID && this.flyerRunId == weeklyAdPublication.flyerRunId && Intrinsics.e(this.sfmlUrl, weeklyAdPublication.sfmlUrl) && Intrinsics.e(this.postalCode, weeklyAdPublication.postalCode) && Intrinsics.e(this.startDate, weeklyAdPublication.startDate) && Intrinsics.e(this.endDate, weeklyAdPublication.endDate) && Intrinsics.e(this.title, weeklyAdPublication.title);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeString(this.flyerType.name());
        dest.writeString(this.imageURL);
        dest.writeInt(this.totalPages);
        dest.writeInt(this.flyerID);
        dest.writeInt(this.flyerRunId);
        dest.writeString(this.sfmlUrl);
        dest.writeString(this.postalCode);
        dest.writeSerializable(this.startDate);
        dest.writeSerializable(this.endDate);
        dest.writeString(this.title);
    }

    public WeeklyAdPublication(Js.a flyerType, String str, int i10, int i11, int i12, String str2, String str3, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, String str4) {
        Intrinsics.j(flyerType, "flyerType");
        this.flyerType = flyerType;
        this.imageURL = str;
        this.totalPages = i10;
        this.flyerID = i11;
        this.flyerRunId = i12;
        this.sfmlUrl = str2;
        this.postalCode = str3;
        this.startDate = offsetDateTime;
        this.endDate = offsetDateTime2;
        this.title = str4;
    }

    public static /* synthetic */ boolean E(WeeklyAdPublication weeklyAdPublication, LocalDate localDate, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            localDate = LocalDate.now();
        }
        return weeklyAdPublication.C(localDate);
    }

    /* renamed from: B, reason: from getter */
    public final OffsetDateTime getStartDate() {
        return this.startDate;
    }

    @JvmOverloads
    public final boolean C(LocalDate now) {
        LocalDate localDate;
        Intrinsics.j(now, "now");
        OffsetDateTime offsetDateTime = this.startDate;
        return (offsetDateTime == null || (localDate = offsetDateTime.toLocalDate()) == null || !localDate.isAfter(now)) ? false : true;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(WeeklyAdPublication other) {
        Intrinsics.j(other, "other");
        if (!E(this, null, 1, null) && E(other, null, 1, null)) {
            return -1;
        }
        Js.a aVar = other.flyerType;
        Js.a aVar2 = this.flyerType;
        return aVar == aVar2 ? other.flyerID < this.flyerID ? 1 : -1 : Intrinsics.k(aVar2.ordinal(), other.flyerType.ordinal());
    }

    /* renamed from: b, reason: from getter */
    public final OffsetDateTime getEndDate() {
        return this.endDate;
    }

    /* renamed from: e, reason: from getter */
    public final int getFlyerID() {
        return this.flyerID;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.flyerType.hashCode() * 31;
        String str = this.imageURL;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.flyerID)) * 31) + Integer.hashCode(this.flyerRunId)) * 31;
        String str2 = this.sfmlUrl;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postalCode;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OffsetDateTime offsetDateTime = this.startDate;
        int iHashCode5 = (iHashCode4 + (offsetDateTime == null ? 0 : offsetDateTime.hashCode())) * 31;
        OffsetDateTime offsetDateTime2 = this.endDate;
        int iHashCode6 = (iHashCode5 + (offsetDateTime2 == null ? 0 : offsetDateTime2.hashCode())) * 31;
        String str4 = this.title;
        return iHashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: o, reason: from getter */
    public final int getFlyerRunId() {
        return this.flyerRunId;
    }

    /* renamed from: t, reason: from getter */
    public final String getImageURL() {
        return this.imageURL;
    }

    public String toString() {
        return "WeeklyAdPublication(flyerType=" + this.flyerType + ", imageURL=" + this.imageURL + ", totalPages=" + this.totalPages + ", flyerID=" + this.flyerID + ", flyerRunId=" + this.flyerRunId + ", sfmlUrl=" + this.sfmlUrl + ", postalCode=" + this.postalCode + ", startDate=" + this.startDate + ", endDate=" + this.endDate + ", title=" + this.title + ')';
    }

    /* renamed from: w, reason: from getter */
    public final String getSfmlUrl() {
        return this.sfmlUrl;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ WeeklyAdPublication(Js.a r3, java.lang.String r4, int r5, int r6, int r7, java.lang.String r8, java.lang.String r9, j$.time.OffsetDateTime r10, j$.time.OffsetDateTime r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r2 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L6
            Js.a r3 = Js.a.f16072e
        L6:
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto Lc
            r4 = r0
        Lc:
            r14 = r13 & 4
            r1 = 0
            if (r14 == 0) goto L12
            r5 = r1
        L12:
            r14 = r13 & 8
            if (r14 == 0) goto L17
            r6 = r1
        L17:
            r14 = r13 & 16
            if (r14 == 0) goto L1c
            r7 = r1
        L1c:
            r14 = r13 & 32
            if (r14 == 0) goto L21
            r8 = r0
        L21:
            r14 = r13 & 64
            if (r14 == 0) goto L26
            r9 = r0
        L26:
            r14 = r13 & 128(0x80, float:1.8E-43)
            if (r14 == 0) goto L2b
            r10 = r0
        L2b:
            r14 = r13 & 256(0x100, float:3.59E-43)
            if (r14 == 0) goto L30
            r11 = r0
        L30:
            r13 = r13 & 512(0x200, float:7.17E-43)
            if (r13 == 0) goto L40
            r14 = r0
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
            goto L4b
        L40:
            r14 = r12
            r13 = r11
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
        L4b:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Js.WeeklyAdPublication.<init>(Js.a, java.lang.String, int, int, int, java.lang.String, java.lang.String, j$.time.OffsetDateTime, j$.time.OffsetDateTime, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
