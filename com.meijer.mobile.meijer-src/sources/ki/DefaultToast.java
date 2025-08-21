package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, d2 = {"Lki/Y0;", "", "Lki/q1$m$c;", "default", "error", "success", "informational", "warning", "<init>", "(Lki/q1$m$c;Lki/q1$m$c;Lki/q1$m$c;Lki/q1$m$c;Lki/q1$m$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$m$c;", "()Lki/q1$m$c;", "b", "c", "d", "e", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.Y0, reason: from toString */
/* loaded from: classes8.dex */
public final /* data */ class DefaultToast {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q1.m.Toast default;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.m.Toast error;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.m.Toast success;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.m.Toast informational;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.m.Toast warning;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultToast)) {
            return false;
        }
        DefaultToast defaultToast = (DefaultToast) other;
        return Intrinsics.e(this.default, defaultToast.default) && Intrinsics.e(this.error, defaultToast.error) && Intrinsics.e(this.success, defaultToast.success) && Intrinsics.e(this.informational, defaultToast.informational) && Intrinsics.e(this.warning, defaultToast.warning);
    }

    public DefaultToast(q1.m.Toast toast, q1.m.Toast error, q1.m.Toast success, q1.m.Toast informational, q1.m.Toast warning) {
        Intrinsics.j(toast, "default");
        Intrinsics.j(error, "error");
        Intrinsics.j(success, "success");
        Intrinsics.j(informational, "informational");
        Intrinsics.j(warning, "warning");
        this.default = toast;
        this.error = error;
        this.success = success;
        this.informational = informational;
        this.warning = warning;
    }

    /* renamed from: a, reason: from getter */
    public q1.m.Toast getDefault() {
        return this.default;
    }

    /* renamed from: b, reason: from getter */
    public q1.m.Toast getError() {
        return this.error;
    }

    /* renamed from: c, reason: from getter */
    public q1.m.Toast getInformational() {
        return this.informational;
    }

    /* renamed from: d, reason: from getter */
    public q1.m.Toast getSuccess() {
        return this.success;
    }

    /* renamed from: e, reason: from getter */
    public q1.m.Toast getWarning() {
        return this.warning;
    }

    public int hashCode() {
        return (((((((this.default.hashCode() * 31) + this.error.hashCode()) * 31) + this.success.hashCode()) * 31) + this.informational.hashCode()) * 31) + this.warning.hashCode();
    }

    public String toString() {
        return "DefaultToast(default=" + this.default + ", error=" + this.error + ", success=" + this.success + ", informational=" + this.informational + ", warning=" + this.warning + ')';
    }
}
