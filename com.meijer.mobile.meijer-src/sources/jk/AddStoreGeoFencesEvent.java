package jk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ljk/a;", "", "", "Ljk/c;", "storeDetails", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "models_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jk.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class AddStoreGeoFencesEvent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<C15047c> storeDetails;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AddStoreGeoFencesEvent) && Intrinsics.e(this.storeDetails, ((AddStoreGeoFencesEvent) other).storeDetails);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AddStoreGeoFencesEvent(List<? extends C15047c> storeDetails) {
        Intrinsics.j(storeDetails, "storeDetails");
        this.storeDetails = storeDetails;
    }

    public final List<C15047c> a() {
        return this.storeDetails;
    }

    public int hashCode() {
        return this.storeDetails.hashCode();
    }

    public String toString() {
        return "AddStoreGeoFencesEvent(storeDetails=" + this.storeDetails + ')';
    }
}
