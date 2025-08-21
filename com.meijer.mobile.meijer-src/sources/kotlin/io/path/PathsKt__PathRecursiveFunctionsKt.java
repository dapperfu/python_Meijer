package kotlin.io.path;

import j$.nio.file.Path;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"j$/nio/file/Path", "", "a", "(Lj$/nio/file/Path;)V", "kotlin-stdlib-jdk7"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
@SourceDebugExtension
/* loaded from: classes12.dex */
class PathsKt__PathRecursiveFunctionsKt extends c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CopyActionResult.values().length];
            try {
                iArr[CopyActionResult.f143663a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CopyActionResult.f143665c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CopyActionResult.f143664b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OnErrorResult.values().length];
            try {
                iArr2[OnErrorResult.f143674b.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OnErrorResult.f143673a.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(Path path) throws IllegalFileNameException {
        Intrinsics.j(path, "<this>");
        String strB = d.b(path);
        int iHashCode = strB.hashCode();
        if (iHashCode != 46) {
            if (iHashCode != 1518) {
                if (iHashCode != 45679) {
                    if (iHashCode != 45724) {
                        if (iHashCode != 1472) {
                            if (iHashCode != 1473 || !strB.equals("./")) {
                                return;
                            }
                        } else if (!strB.equals("..")) {
                            return;
                        }
                    } else if (!strB.equals("..\\")) {
                        return;
                    }
                } else if (!strB.equals("../")) {
                    return;
                }
            } else if (!strB.equals(".\\")) {
                return;
            }
        } else if (!strB.equals(".")) {
            return;
        }
        throw new IllegalFileNameException(path);
    }
}
