package qj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"Lqj/d;", "", "", "clipCode", "clipResult", "description", "title", "", "isSuccess", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getClipCode", "b", "c", "getDescription", "d", "getTitle", "e", "Z", "()Z", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qj.d, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class PromoCouponResult {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clipCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clipResult;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isSuccess;

    public PromoCouponResult() {
        this(null, null, null, null, false, 31, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoCouponResult)) {
            return false;
        }
        PromoCouponResult promoCouponResult = (PromoCouponResult) other;
        return Intrinsics.e(this.clipCode, promoCouponResult.clipCode) && Intrinsics.e(this.clipResult, promoCouponResult.clipResult) && Intrinsics.e(this.description, promoCouponResult.description) && Intrinsics.e(this.title, promoCouponResult.title) && this.isSuccess == promoCouponResult.isSuccess;
    }

    public PromoCouponResult(String str, String str2, String str3, String str4, boolean z10) {
        this.clipCode = str;
        this.clipResult = str2;
        this.description = str3;
        this.title = str4;
        this.isSuccess = z10;
    }

    /* renamed from: a, reason: from getter */
    public final String getClipResult() {
        return this.clipResult;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    public int hashCode() {
        String str = this.clipCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clipResult;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        return ((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSuccess);
    }

    public String toString() {
        return "PromoCouponResult(clipCode=" + this.clipCode + ", clipResult=" + this.clipResult + ", description=" + this.description + ", title=" + this.title + ", isSuccess=" + this.isSuccess + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PromoCouponResult(String str, String str2, String str3, String str4, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        this(str, str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? str != null && str.equals("0") && str2 != null && StringsKt.H(str2, "success", true) : z10);
    }
}
