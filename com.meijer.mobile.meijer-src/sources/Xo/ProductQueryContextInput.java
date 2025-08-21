package Xo;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import z6.AbstractC18451C;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u001b\u0010\u0010R%\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\t0\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"LXo/b;", "", "", "storeId", "Lz6/C;", "", "accountId", "constructorClientId", "constructorSessionId", "", "userSegments", "<init>", "(ILz6/C;Ljava/lang/String;ILz6/C;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "b", "Lz6/C;", "()Lz6/C;", "c", "Ljava/lang/String;", "e", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Xo.b, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class ProductQueryContextInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int storeId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18451C<String> accountId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String constructorClientId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int constructorSessionId;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC18451C<List<String>> userSegments;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductQueryContextInput(int i10, AbstractC18451C<String> accountId, String constructorClientId, int i11, AbstractC18451C<? extends List<String>> userSegments) {
        Intrinsics.j(accountId, "accountId");
        Intrinsics.j(constructorClientId, "constructorClientId");
        Intrinsics.j(userSegments, "userSegments");
        this.storeId = i10;
        this.accountId = accountId;
        this.constructorClientId = constructorClientId;
        this.constructorSessionId = i11;
        this.userSegments = userSegments;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductQueryContextInput)) {
            return false;
        }
        ProductQueryContextInput productQueryContextInput = (ProductQueryContextInput) other;
        return this.storeId == productQueryContextInput.storeId && Intrinsics.e(this.accountId, productQueryContextInput.accountId) && Intrinsics.e(this.constructorClientId, productQueryContextInput.constructorClientId) && this.constructorSessionId == productQueryContextInput.constructorSessionId && Intrinsics.e(this.userSegments, productQueryContextInput.userSegments);
    }

    public final AbstractC18451C<String> a() {
        return this.accountId;
    }

    /* renamed from: b, reason: from getter */
    public final String getConstructorClientId() {
        return this.constructorClientId;
    }

    /* renamed from: c, reason: from getter */
    public final int getConstructorSessionId() {
        return this.constructorSessionId;
    }

    /* renamed from: d, reason: from getter */
    public final int getStoreId() {
        return this.storeId;
    }

    public final AbstractC18451C<List<String>> e() {
        return this.userSegments;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.storeId) * 31) + this.accountId.hashCode()) * 31) + this.constructorClientId.hashCode()) * 31) + Integer.hashCode(this.constructorSessionId)) * 31) + this.userSegments.hashCode();
    }

    public String toString() {
        return "ProductQueryContextInput(storeId=" + this.storeId + ", accountId=" + this.accountId + ", constructorClientId=" + this.constructorClientId + ", constructorSessionId=" + this.constructorSessionId + ", userSegments=" + this.userSegments + ')';
    }

    public /* synthetic */ ProductQueryContextInput(int i10, AbstractC18451C abstractC18451C, String str, int i11, AbstractC18451C abstractC18451C2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? AbstractC18451C.a.f172405b : abstractC18451C, str, i11, (i12 & 16) != 0 ? AbstractC18451C.a.f172405b : abstractC18451C2);
    }
}
