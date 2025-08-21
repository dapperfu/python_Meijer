package ki;

import ki.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0017¨\u0006\""}, d2 = {"Lki/v0;", "", "Lki/q1$f$c;", "default", "error", "success", "warning", "disabled", "static", "<init>", "(Lki/q1$f$c;Lki/q1$f$c;Lki/q1$f$c;Lki/q1$f$c;Lki/q1$f$c;Lki/q1$f$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lki/q1$f$c;", "()Lki/q1$f$c;", "b", "getError", "c", "getSuccess", "d", "getWarning", "e", "getDisabled", "f", "getStatic", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ki.v0, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class DefaultQuantityInputs {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q1.f.QuantityInput default;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f.QuantityInput error;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f.QuantityInput success;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f.QuantityInput warning;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f.QuantityInput disabled;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q1.f.QuantityInput static;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultQuantityInputs)) {
            return false;
        }
        DefaultQuantityInputs defaultQuantityInputs = (DefaultQuantityInputs) other;
        return Intrinsics.e(this.default, defaultQuantityInputs.default) && Intrinsics.e(this.error, defaultQuantityInputs.error) && Intrinsics.e(this.success, defaultQuantityInputs.success) && Intrinsics.e(this.warning, defaultQuantityInputs.warning) && Intrinsics.e(this.disabled, defaultQuantityInputs.disabled) && Intrinsics.e(this.static, defaultQuantityInputs.static);
    }

    public DefaultQuantityInputs(q1.f.QuantityInput quantityInput, q1.f.QuantityInput error, q1.f.QuantityInput success, q1.f.QuantityInput warning, q1.f.QuantityInput disabled, q1.f.QuantityInput quantityInput2) {
        Intrinsics.j(quantityInput, "default");
        Intrinsics.j(error, "error");
        Intrinsics.j(success, "success");
        Intrinsics.j(warning, "warning");
        Intrinsics.j(disabled, "disabled");
        Intrinsics.j(quantityInput2, "static");
        this.default = quantityInput;
        this.error = error;
        this.success = success;
        this.warning = warning;
        this.disabled = disabled;
        this.static = quantityInput2;
    }

    /* renamed from: a, reason: from getter */
    public q1.f.QuantityInput getDefault() {
        return this.default;
    }

    public int hashCode() {
        return (((((((((this.default.hashCode() * 31) + this.error.hashCode()) * 31) + this.success.hashCode()) * 31) + this.warning.hashCode()) * 31) + this.disabled.hashCode()) * 31) + this.static.hashCode();
    }

    public String toString() {
        return "DefaultQuantityInputs(default=" + this.default + ", error=" + this.error + ", success=" + this.success + ", warning=" + this.warning + ", disabled=" + this.disabled + ", static=" + this.static + ')';
    }
}
