package J5;

import com.adobe.marketing.mobile.I;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR'\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LJ5/F;", "", "", "version", "Lcom/adobe/marketing/mobile/I;", "status", "", "", "data", "<init>", "(ILcom/adobe/marketing/mobile/I;Ljava/util/Map;)V", "Lcom/adobe/marketing/mobile/H;", "a", "()Lcom/adobe/marketing/mobile/H;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVersion", "b", "Lcom/adobe/marketing/mobile/I;", "()Lcom/adobe/marketing/mobile/I;", "c", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: J5.F, reason: from toString */
/* loaded from: classes4.dex */
final /* data */ class SharedState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int version;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final I status;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> data;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedState)) {
            return false;
        }
        SharedState sharedState = (SharedState) other;
        return this.version == sharedState.version && this.status == sharedState.status && Intrinsics.e(this.data, sharedState.data);
    }

    public SharedState(int i10, I status, Map<String, ? extends Object> map) {
        Intrinsics.j(status, "status");
        this.version = i10;
        this.status = status;
        this.data = map;
    }

    public final com.adobe.marketing.mobile.H a() {
        return new com.adobe.marketing.mobile.H(this.status, this.data);
    }

    /* renamed from: b, reason: from getter */
    public final I getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.version) * 31) + this.status.hashCode()) * 31;
        Map<String, Object> map = this.data;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return "SharedState(version=" + this.version + ", status=" + this.status + ", data=" + this.data + ')';
    }
}
