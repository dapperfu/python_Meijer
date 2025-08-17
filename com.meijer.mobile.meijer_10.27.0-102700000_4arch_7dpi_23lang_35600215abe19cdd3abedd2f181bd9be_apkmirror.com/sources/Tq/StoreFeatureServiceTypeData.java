package Tq;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"LTq/g;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "code", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCode", "b", "getName", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tq.g, reason: from toString */
/* loaded from: classes11.dex */
public final /* data */ class StoreFeatureServiceTypeData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String code;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoreFeatureServiceTypeData)) {
            return false;
        }
        StoreFeatureServiceTypeData storeFeatureServiceTypeData = (StoreFeatureServiceTypeData) other;
        return Intrinsics.e(this.code, storeFeatureServiceTypeData.code) && Intrinsics.e(this.name, storeFeatureServiceTypeData.name);
    }

    public StoreFeatureServiceTypeData(String code, String name) {
        Intrinsics.j(code, "code");
        Intrinsics.j(name, "name");
        this.code = code;
        this.name = name;
    }

    public int hashCode() {
        return (this.code.hashCode() * 31) + this.name.hashCode();
    }

    public String toString() {
        return "StoreFeatureServiceTypeData(code=" + this.code + ", name=" + this.name + ')';
    }
}
