package kotlin;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\bR$\u0010\u0016\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\f\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Li4/e;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "I", "b", "destinationId", "Li4/w;", "Li4/w;", "c", "()Li4/w;", "setNavOptions", "(Li4/w;)V", "navOptions", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "setDefaultArguments", "(Landroid/os/Bundle;)V", "defaultArguments", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: i4.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14661e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int destinationId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private C14679w navOptions;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Bundle defaultArguments;

    public boolean equals(Object other) {
        Set<String> setKeySet;
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof C14661e)) {
            C14661e c14661e = (C14661e) other;
            if (this.destinationId == c14661e.destinationId && Intrinsics.e(this.navOptions, c14661e.navOptions)) {
                if (!Intrinsics.e(this.defaultArguments, c14661e.defaultArguments)) {
                    Bundle bundle = this.defaultArguments;
                    if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                        Set<String> set = setKeySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.defaultArguments;
                                Object obj = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = c14661e.defaultArguments;
                                if (!Intrinsics.e(obj, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a, reason: from getter */
    public final Bundle getDefaultArguments() {
        return this.defaultArguments;
    }

    /* renamed from: b, reason: from getter */
    public final int getDestinationId() {
        return this.destinationId;
    }

    /* renamed from: c, reason: from getter */
    public final C14679w getNavOptions() {
        return this.navOptions;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int iHashCode = Integer.hashCode(this.destinationId) * 31;
        C14679w c14679w = this.navOptions;
        int iHashCode2 = iHashCode + (c14679w != null ? c14679w.hashCode() : 0);
        Bundle bundle = this.defaultArguments;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            for (String str : setKeySet) {
                int i10 = iHashCode2 * 31;
                Bundle bundle2 = this.defaultArguments;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                iHashCode2 = i10 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return iHashCode2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C14661e.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.destinationId));
        sb2.append(")");
        if (this.navOptions != null) {
            sb2.append(" navOptions=");
            sb2.append(this.navOptions);
        }
        String string = sb2.toString();
        Intrinsics.i(string, "sb.toString()");
        return string;
    }
}
