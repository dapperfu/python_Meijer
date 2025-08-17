package F2;

import F2.f;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LF2/f;", "a", "()LF2/f;", "", "LF2/f$b;", "pairs", "LF2/c;", "b", "([LF2/f$b;)LF2/c;", "datastore-preferences-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName
@SourceDebugExtension
/* loaded from: classes.dex */
public final class g {
    @JvmName
    public static final f a() {
        return new c(null, true, 1, null);
    }

    @JvmName
    public static final c b(f.b<?>... pairs) {
        Intrinsics.j(pairs, "pairs");
        c cVar = new c(null, false, 1, null);
        cVar.g((f.b[]) Arrays.copyOf(pairs, pairs.length));
        return cVar;
    }
}
