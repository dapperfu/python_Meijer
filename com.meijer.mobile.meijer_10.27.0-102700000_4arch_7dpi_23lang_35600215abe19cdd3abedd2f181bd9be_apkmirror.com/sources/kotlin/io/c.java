package kotlin.io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljava/io/File;", "Lkotlin/io/FileWalkDirection;", "direction", "Lkotlin/io/FileTreeWalk;", "j", "(Ljava/io/File;Lkotlin/io/FileWalkDirection;)Lkotlin/io/FileTreeWalk;", "k", "(Ljava/io/File;)Lkotlin/io/FileTreeWalk;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes6.dex */
class c extends b {
    public static final FileTreeWalk j(File file, FileWalkDirection direction) {
        Intrinsics.j(file, "<this>");
        Intrinsics.j(direction, "direction");
        return new FileTreeWalk(file, direction);
    }

    public static final FileTreeWalk k(File file) {
        Intrinsics.j(file, "<this>");
        return j(file, FileWalkDirection.f142722b);
    }
}
