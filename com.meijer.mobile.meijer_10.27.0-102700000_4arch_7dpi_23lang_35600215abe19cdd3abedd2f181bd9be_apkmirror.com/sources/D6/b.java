package D6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LD6/b;", "", "<init>", "()V", "", "stackSize", "", "stack", "", "", "pathNames", "pathIndices", "", "a", "(I[I[Ljava/lang/String;[I)Ljava/util/List;", "apollo-api"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5050a = new b();

    public final List<Object> a(int stackSize, int[] stack, String[] pathNames, int[] pathIndices) {
        String str;
        Intrinsics.j(stack, "stack");
        Intrinsics.j(pathNames, "pathNames");
        Intrinsics.j(pathIndices, "pathIndices");
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < stackSize; i10++) {
            int i11 = stack[i10];
            if (i11 == 1 || i11 == 2) {
                arrayList.add(Integer.valueOf(pathIndices[i10]));
            } else if ((i11 == 3 || i11 == 4 || i11 == 5) && (str = pathNames[i10]) != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private b() {
    }
}
