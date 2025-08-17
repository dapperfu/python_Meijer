package responses;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJL\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lresponses/Jurisdiction;", "", "", "jurisdictionLevel", "effectiveDate", "expirationDate", "jurisdictionId", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lresponses/Jurisdiction;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "e", "validation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Jurisdiction {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String jurisdictionLevel;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String effectiveDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String jurisdictionId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    public Jurisdiction() {
        this(null, null, null, null, null, 31, null);
    }

    public final Jurisdiction copy(@g(name = "jurisdictionLevel") String jurisdictionLevel, @g(name = "effectiveDate") String effectiveDate, @g(name = "expirationDate") String expirationDate, @g(name = "jurisdictionId") String jurisdictionId, @g(name = "text") String text) {
        return new Jurisdiction(jurisdictionLevel, effectiveDate, expirationDate, jurisdictionId, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Jurisdiction)) {
            return false;
        }
        Jurisdiction jurisdiction = (Jurisdiction) other;
        return Intrinsics.e(this.jurisdictionLevel, jurisdiction.jurisdictionLevel) && Intrinsics.e(this.effectiveDate, jurisdiction.effectiveDate) && Intrinsics.e(this.expirationDate, jurisdiction.expirationDate) && Intrinsics.e(this.jurisdictionId, jurisdiction.jurisdictionId) && Intrinsics.e(this.text, jurisdiction.text);
    }

    public int hashCode() {
        String str = this.jurisdictionLevel;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.effectiveDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.expirationDate;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.jurisdictionId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.text;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "Jurisdiction(jurisdictionLevel=" + this.jurisdictionLevel + ", effectiveDate=" + this.effectiveDate + ", expirationDate=" + this.expirationDate + ", jurisdictionId=" + this.jurisdictionId + ", text=" + this.text + ')';
    }

    public Jurisdiction(@g(name = "jurisdictionLevel") String str, @g(name = "effectiveDate") String str2, @g(name = "expirationDate") String str3, @g(name = "jurisdictionId") String str4, @g(name = "text") String str5) {
        this.jurisdictionLevel = str;
        this.effectiveDate = str2;
        this.expirationDate = str3;
        this.jurisdictionId = str4;
        this.text = str5;
    }

    /* renamed from: a, reason: from getter */
    public final String getEffectiveDate() {
        return this.effectiveDate;
    }

    /* renamed from: b, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getJurisdictionId() {
        return this.jurisdictionId;
    }

    /* renamed from: d, reason: from getter */
    public final String getJurisdictionLevel() {
        return this.jurisdictionLevel;
    }

    /* renamed from: e, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public /* synthetic */ Jurisdiction(String str, String str2, String str3, String str4, String str5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5);
    }
}
