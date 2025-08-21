package kotlin;

import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0014\u0010\"¨\u0006#"}, d2 = {"Li4/f;", "", "", "name", "Landroid/os/Bundle;", "bundle", "", "d", "(Ljava/lang/String;Landroid/os/Bundle;)V", "", "e", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Z", "c", "()Z", "isNullable", "b", "isDefaultValuePresent", "Ljava/lang/Object;", "getDefaultValue", "()Ljava/lang/Object;", "defaultValue", "Li4/z;", "type", "Li4/z;", "()Li4/z;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i4.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14665f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isNullable;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isDefaultValuePresent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object defaultValue;

    public final AbstractC14685z<Object> a() {
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && Intrinsics.e(C14665f.class, other.getClass())) {
            C14665f c14665f = (C14665f) other;
            if (this.isNullable != c14665f.isNullable || this.isDefaultValuePresent != c14665f.isDefaultValuePresent || !Intrinsics.e(null, null)) {
                return false;
            }
            Object obj = this.defaultValue;
            if (obj != null) {
                return Intrinsics.e(obj, c14665f.defaultValue);
            }
            if (c14665f.defaultValue == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        throw null;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsDefaultValuePresent() {
        return this.isDefaultValuePresent;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getIsNullable() {
        return this.isNullable;
    }

    public final void d(String name, Bundle bundle) {
        Intrinsics.j(name, "name");
        Intrinsics.j(bundle, "bundle");
        if (this.isDefaultValuePresent) {
            throw null;
        }
    }

    public final boolean e(String name, Bundle bundle) {
        Intrinsics.j(name, "name");
        Intrinsics.j(bundle, "bundle");
        if (!this.isNullable && bundle.containsKey(name) && bundle.get(name) == null) {
            return false;
        }
        throw null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C14665f.class.getSimpleName());
        sb2.append(" Type: " + ((Object) null));
        sb2.append(" Nullable: " + this.isNullable);
        if (this.isDefaultValuePresent) {
            sb2.append(" DefaultValue: " + this.defaultValue);
        }
        String string = sb2.toString();
        Intrinsics.i(string, "sb.toString()");
        return string;
    }
}
