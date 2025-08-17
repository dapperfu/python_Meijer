package O4;

import android.content.Context;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LO4/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "a", "(Landroid/content/Context;)Ljava/io/File;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4440a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4440a f23208a = new C4440a();

    public final File a(Context context) {
        Intrinsics.j(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        Intrinsics.i(noBackupFilesDir, "context.noBackupFilesDir");
        return noBackupFilesDir;
    }

    private C4440a() {
    }
}
