package P0;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0001\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0004\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"", "a", "b", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class d {
    public static final boolean a(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }

    public static final Object b(Object obj) {
        return obj.getClass();
    }
}
