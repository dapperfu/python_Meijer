package Dh;

import j$.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u0018R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001b\u0010\u0018R$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0015\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u0018¨\u0006("}, d2 = {"LDh/z;", "", "", "name", "description", "j$/time/LocalDateTime", "displayEndDate", "redemptionEndDate", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lj$/time/LocalDateTime;Lj$/time/LocalDateTime;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "b", "getDescription", "setDescription", "c", "Lj$/time/LocalDateTime;", "getDisplayEndDate", "()Lj$/time/LocalDateTime;", "setDisplayEndDate", "(Lj$/time/LocalDateTime;)V", "d", "getRedemptionEndDate", "setRedemptionEndDate", "e", "getImageUrl", "setImageUrl", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dh.z, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class SpiffItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String description;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private LocalDateTime displayEndDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private LocalDateTime redemptionEndDate;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String imageUrl;

    public SpiffItem() {
        this(null, null, null, null, null, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpiffItem)) {
            return false;
        }
        SpiffItem spiffItem = (SpiffItem) other;
        return Intrinsics.e(this.name, spiffItem.name) && Intrinsics.e(this.description, spiffItem.description) && Intrinsics.e(this.displayEndDate, spiffItem.displayEndDate) && Intrinsics.e(this.redemptionEndDate, spiffItem.redemptionEndDate) && Intrinsics.e(this.imageUrl, spiffItem.imageUrl);
    }

    public SpiffItem(String str, String str2, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str3) {
        this.name = str;
        this.description = str2;
        this.displayEndDate = localDateTime;
        this.redemptionEndDate = localDateTime2;
        this.imageUrl = str3;
    }

    public int hashCode() {
        String str = this.name;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDateTime localDateTime = this.displayEndDate;
        int iHashCode3 = (iHashCode2 + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDateTime localDateTime2 = this.redemptionEndDate;
        int iHashCode4 = (iHashCode3 + (localDateTime2 == null ? 0 : localDateTime2.hashCode())) * 31;
        String str3 = this.imageUrl;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SpiffItem(name=" + this.name + ", description=" + this.description + ", displayEndDate=" + this.displayEndDate + ", redemptionEndDate=" + this.redemptionEndDate + ", imageUrl=" + this.imageUrl + ')';
    }

    public /* synthetic */ SpiffItem(String str, String str2, LocalDateTime localDateTime, LocalDateTime localDateTime2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : localDateTime, (i10 & 8) != 0 ? null : localDateTime2, (i10 & 16) != 0 ? null : str3);
    }
}
