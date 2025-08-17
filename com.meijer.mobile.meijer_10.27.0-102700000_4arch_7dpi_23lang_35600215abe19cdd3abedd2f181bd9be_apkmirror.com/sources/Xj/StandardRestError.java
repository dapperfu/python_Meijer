package Xj;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u000fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u000fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u001a\u0010\u000f¨\u0006%"}, d2 = {"LXj/c;", "LXj/b;", "LXj/d;", "type", "", "title", "detail", "", "status", "traceId", "referenceCode", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Ljava/lang/String;", "f", "d", "e", "getDetail", "Ljava/lang/Integer;", "getStatus", "()Ljava/lang/Integer;", "g", "getTraceId", "h", "getReferenceCode", "i", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xj.c, reason: from toString */
/* loaded from: classes7.dex */
public final /* data */ class StandardRestError extends b {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String detail;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer status;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String traceId;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String referenceCode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String source;

    public /* synthetic */ StandardRestError(String str, String str2, String str3, Integer num, String str4, String str5, String str6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, str4, str5, str6);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StandardRestError)) {
            return false;
        }
        StandardRestError standardRestError = (StandardRestError) other;
        return d.b(this.type, standardRestError.type) && Intrinsics.e(this.title, standardRestError.title) && Intrinsics.e(this.detail, standardRestError.detail) && Intrinsics.e(this.status, standardRestError.status) && Intrinsics.e(this.traceId, standardRestError.traceId) && Intrinsics.e(this.referenceCode, standardRestError.referenceCode) && Intrinsics.e(this.source, standardRestError.source);
    }

    private StandardRestError(String type, String title, String detail, Integer num, String str, String str2, String str3) {
        Intrinsics.j(type, "type");
        Intrinsics.j(title, "title");
        Intrinsics.j(detail, "detail");
        this.type = type;
        this.title = title;
        this.detail = detail;
        this.status = num;
        this.traceId = str;
        this.referenceCode = str2;
        this.source = str3;
    }

    @Override // Xj.b
    /* renamed from: d, reason: from getter */
    public String getSource() {
        return this.source;
    }

    @Override // Xj.b
    /* renamed from: e, reason: from getter */
    public String getTitle() {
        return this.title;
    }

    @Override // Xj.b
    /* renamed from: f, reason: from getter */
    public String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = ((((d.c(this.type) * 31) + this.title.hashCode()) * 31) + this.detail.hashCode()) * 31;
        Integer num = this.status;
        int iHashCode = (iC + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.traceId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.referenceCode;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.source;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "StandardRestError(type=" + ((Object) d.d(this.type)) + ", title=" + this.title + ", detail=" + this.detail + ", status=" + this.status + ", traceId=" + this.traceId + ", referenceCode=" + this.referenceCode + ", source=" + this.source + ')';
    }
}
