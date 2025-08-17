package K7;

import kotlin.Metadata;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0007\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u0004\u0018\u00010\u0004*\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LK7/d;", "LK7/b;", "<init>", "()V", "", "", "b", "(I)Ljava/lang/String;", "c", "(Ljava/lang/Integer;)Ljava/lang/Integer;", "d", "(I)Ljava/lang/Integer;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class d implements b {
    public final String b(int i10) {
        if (i10 == 1) {
            return "portrait";
        }
        if (i10 != 2) {
            return null;
        }
        return "landscape";
    }

    public final Integer c(Integer num) {
        IntRange intRange = new IntRange(0, 100);
        if (num == null || !intRange.p(num.intValue())) {
            return null;
        }
        return num;
    }

    public final Integer d(int i10) {
        if (i10 >= 0) {
            return Integer.valueOf(i10);
        }
        return null;
    }
}
