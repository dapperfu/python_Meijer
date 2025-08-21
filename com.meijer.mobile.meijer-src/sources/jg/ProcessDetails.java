package jg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Ljg/C;", "", "", "processName", "", "pid", "importance", "", "isDefaultProcess", "<init>", "(Ljava/lang/String;IIZ)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "d", "Z", "()Z", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: jg.C, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class ProcessDetails {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String processName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int pid;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int importance;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isDefaultProcess;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProcessDetails)) {
            return false;
        }
        ProcessDetails processDetails = (ProcessDetails) other;
        return Intrinsics.e(this.processName, processDetails.processName) && this.pid == processDetails.pid && this.importance == processDetails.importance && this.isDefaultProcess == processDetails.isDefaultProcess;
    }

    public ProcessDetails(String processName, int i10, int i11, boolean z10) {
        Intrinsics.j(processName, "processName");
        this.processName = processName;
        this.pid = i10;
        this.importance = i11;
        this.isDefaultProcess = z10;
    }

    /* renamed from: a, reason: from getter */
    public final int getImportance() {
        return this.importance;
    }

    /* renamed from: b, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* renamed from: c, reason: from getter */
    public final String getProcessName() {
        return this.processName;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getIsDefaultProcess() {
        return this.isDefaultProcess;
    }

    public int hashCode() {
        return (((((this.processName.hashCode() * 31) + Integer.hashCode(this.pid)) * 31) + Integer.hashCode(this.importance)) * 31) + Boolean.hashCode(this.isDefaultProcess);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.processName + ", pid=" + this.pid + ", importance=" + this.importance + ", isDefaultProcess=" + this.isDefaultProcess + ')';
    }
}
