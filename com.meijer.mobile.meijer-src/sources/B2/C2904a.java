package B2;

import j$.io.FileRetargetClass;
import j$.nio.file.Files;
import j$.nio.file.StandardCopyOption;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LB2/a;", "", "<init>", "()V", "Ljava/io/File;", "srcFile", "dstFile", "", "a", "(Ljava/io/File;Ljava/io/File;)Z", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2904a {

    /* renamed from: a, reason: collision with root package name */
    public static final C2904a f2242a = new C2904a();

    public final boolean a(File srcFile, File dstFile) {
        Intrinsics.j(srcFile, "srcFile");
        Intrinsics.j(dstFile, "dstFile");
        try {
            Files.move(FileRetargetClass.toPath(srcFile), FileRetargetClass.toPath(dstFile), StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private C2904a() {
    }
}
