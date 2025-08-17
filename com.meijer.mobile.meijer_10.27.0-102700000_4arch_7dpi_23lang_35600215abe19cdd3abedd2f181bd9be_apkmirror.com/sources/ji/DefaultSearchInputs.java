package ji;

import ji.q1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\n\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 ¨\u0006%"}, d2 = {"Lji/w0;", "", "Lji/q1$f$e;", "default", "alternative", "disabled", "static", "Lji/q1$f;", "error", "success", "warning", "<init>", "(Lji/q1$f$e;Lji/q1$f$e;Lji/q1$f$e;Lji/q1$f$e;Lji/q1$f;Lji/q1$f;Lji/q1$f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lji/q1$f$e;", "b", "()Lji/q1$f$e;", "c", "d", "e", "Lji/q1$f;", "getError", "()Lji/q1$f;", "f", "getSuccess", "g", "getWarning", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ji.w0, reason: case insensitive filesystem and from toString */
/* loaded from: classes7.dex */
public final /* data */ class DefaultSearchInputs {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final q1.f.TextInput default;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f.TextInput alternative;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f.TextInput disabled;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q1.f.TextInput static;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f error;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f success;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final q1.f warning;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultSearchInputs)) {
            return false;
        }
        DefaultSearchInputs defaultSearchInputs = (DefaultSearchInputs) other;
        return Intrinsics.e(this.default, defaultSearchInputs.default) && Intrinsics.e(this.alternative, defaultSearchInputs.alternative) && Intrinsics.e(this.disabled, defaultSearchInputs.disabled) && Intrinsics.e(this.static, defaultSearchInputs.static) && Intrinsics.e(this.error, defaultSearchInputs.error) && Intrinsics.e(this.success, defaultSearchInputs.success) && Intrinsics.e(this.warning, defaultSearchInputs.warning);
    }

    public DefaultSearchInputs(q1.f.TextInput textInput, q1.f.TextInput alternative, q1.f.TextInput disabled, q1.f.TextInput textInput2, q1.f error, q1.f success, q1.f warning) {
        Intrinsics.j(textInput, "default");
        Intrinsics.j(alternative, "alternative");
        Intrinsics.j(disabled, "disabled");
        Intrinsics.j(textInput2, "static");
        Intrinsics.j(error, "error");
        Intrinsics.j(success, "success");
        Intrinsics.j(warning, "warning");
        this.default = textInput;
        this.alternative = alternative;
        this.disabled = disabled;
        this.static = textInput2;
        this.error = error;
        this.success = success;
        this.warning = warning;
    }

    /* renamed from: a, reason: from getter */
    public final q1.f.TextInput getAlternative() {
        return this.alternative;
    }

    /* renamed from: b, reason: from getter */
    public q1.f.TextInput getDefault() {
        return this.default;
    }

    /* renamed from: c, reason: from getter */
    public q1.f.TextInput getDisabled() {
        return this.disabled;
    }

    /* renamed from: d, reason: from getter */
    public q1.f.TextInput getStatic() {
        return this.static;
    }

    public int hashCode() {
        return (((((((((((this.default.hashCode() * 31) + this.alternative.hashCode()) * 31) + this.disabled.hashCode()) * 31) + this.static.hashCode()) * 31) + this.error.hashCode()) * 31) + this.success.hashCode()) * 31) + this.warning.hashCode();
    }

    public String toString() {
        return "DefaultSearchInputs(default=" + this.default + ", alternative=" + this.alternative + ", disabled=" + this.disabled + ", static=" + this.static + ", error=" + this.error + ", success=" + this.success + ", warning=" + this.warning + ')';
    }
}
