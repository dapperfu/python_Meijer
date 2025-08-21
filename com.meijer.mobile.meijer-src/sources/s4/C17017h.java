package s4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LA4/c;", "driver", "", "fileName", "Ls4/b;", "b", "(LA4/c;Ljava/lang/String;)Ls4/b;", "", "maxNumOfReaders", "maxNumOfWriters", "a", "(LA4/c;Ljava/lang/String;II)Ls4/b;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* renamed from: s4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17017h {
    public static final InterfaceC17011b a(A4.c driver, String fileName, int i10, int i11) {
        Intrinsics.j(driver, "driver");
        Intrinsics.j(fileName, "fileName");
        return new C17016g(driver, fileName, i10, i11);
    }

    public static final InterfaceC17011b b(A4.c driver, String fileName) {
        Intrinsics.j(driver, "driver");
        Intrinsics.j(fileName, "fileName");
        return new C17016g(driver, fileName);
    }
}
