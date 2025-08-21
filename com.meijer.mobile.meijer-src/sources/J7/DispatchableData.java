package J7;

import Y7.EndPointInfo;
import com.dynatrace.agent.storage.db.EventRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"LJ7/a;", "", "LY7/a;", "endPoint", "", "Lcom/dynatrace/agent/storage/db/EventRecord;", "data", "", "isPriorityData", "<init>", "(LY7/a;Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LY7/a;", "b", "()LY7/a;", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: J7.a, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class DispatchableData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EndPointInfo endPoint;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<EventRecord> data;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPriorityData;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DispatchableData)) {
            return false;
        }
        DispatchableData dispatchableData = (DispatchableData) other;
        return Intrinsics.e(this.endPoint, dispatchableData.endPoint) && Intrinsics.e(this.data, dispatchableData.data) && this.isPriorityData == dispatchableData.isPriorityData;
    }

    public DispatchableData(EndPointInfo endPoint, List<EventRecord> data, boolean z10) {
        Intrinsics.j(endPoint, "endPoint");
        Intrinsics.j(data, "data");
        this.endPoint = endPoint;
        this.data = data;
        this.isPriorityData = z10;
    }

    public final List<EventRecord> a() {
        return this.data;
    }

    /* renamed from: b, reason: from getter */
    public final EndPointInfo getEndPoint() {
        return this.endPoint;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsPriorityData() {
        return this.isPriorityData;
    }

    public int hashCode() {
        return (((this.endPoint.hashCode() * 31) + this.data.hashCode()) * 31) + Boolean.hashCode(this.isPriorityData);
    }

    public String toString() {
        return "DispatchableData(endPoint=" + this.endPoint + ", data=" + this.data + ", isPriorityData=" + this.isPriorityData + ')';
    }
}
