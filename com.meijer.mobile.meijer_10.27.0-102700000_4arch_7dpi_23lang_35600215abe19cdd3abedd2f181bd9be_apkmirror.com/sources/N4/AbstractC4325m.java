package N4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"LN4/m;", "", "<init>", "()V", "", "className", "LN4/l;", "a", "(Ljava/lang/String;)LN4/l;", "b", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: N4.m, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4325m {
    public abstract AbstractC4324l a(String className);

    public final AbstractC4324l b(String className) {
        Intrinsics.j(className, "className");
        AbstractC4324l abstractC4324lA = a(className);
        return abstractC4324lA == null ? C4326n.a(className) : abstractC4324lA;
    }
}
