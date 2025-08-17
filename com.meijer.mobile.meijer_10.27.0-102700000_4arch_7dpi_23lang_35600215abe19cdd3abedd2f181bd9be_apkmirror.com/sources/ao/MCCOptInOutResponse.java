package ao;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0014\u0010\u0018\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"Lao/a;", "", "Lao/b;", "statusCode", "", "message", "<init>", "(Lao/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lao/b;", "()Lao/b;", "b", "Ljava/lang/String;", "getMessage", "()Z", "isSuccess", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ao.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class MCCOptInOutResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC6141b statusCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public MCCOptInOutResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MCCOptInOutResponse)) {
            return false;
        }
        MCCOptInOutResponse mCCOptInOutResponse = (MCCOptInOutResponse) other;
        return this.statusCode == mCCOptInOutResponse.statusCode && Intrinsics.e(this.message, mCCOptInOutResponse.message);
    }

    public MCCOptInOutResponse(EnumC6141b enumC6141b, String str) {
        this.statusCode = enumC6141b;
        this.message = str;
    }

    /* renamed from: a, reason: from getter */
    public final EnumC6141b getStatusCode() {
        return this.statusCode;
    }

    public boolean b() {
        return this.statusCode == EnumC6141b.f59388c;
    }

    public int hashCode() {
        EnumC6141b enumC6141b = this.statusCode;
        int iHashCode = (enumC6141b == null ? 0 : enumC6141b.hashCode()) * 31;
        String str = this.message;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "MCCOptInOutResponse(statusCode=" + this.statusCode + ", message=" + this.message + ')';
    }

    public /* synthetic */ MCCOptInOutResponse(EnumC6141b enumC6141b, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : enumC6141b, (i10 & 2) != 0 ? null : str);
    }
}
