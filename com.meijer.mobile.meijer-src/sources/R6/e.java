package R6;

import java.io.File;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LR6/e;", "", "<init>", "()V", "Lkotlin/Lazy;", "Ljava/io/File;", "persistenceDir", "a", "(Lkotlin/Lazy;)Ljava/io/File;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f31962a = new e();

    private e() {
    }

    @JvmStatic
    public static final File a(Lazy<? extends File> persistenceDir) {
        File value = persistenceDir.getValue();
        File file = new File(value, "bugsnag");
        if (!file.isDirectory()) {
            file.mkdirs();
        }
        for (Pair pair : CollectionsKt.p(TuplesKt.a("last-run-info", "last-run-info"), TuplesKt.a("bugsnag-sessions", "sessions"), TuplesKt.a("user-info", "user-info"), TuplesKt.a("bugsnag-native", "native"), TuplesKt.a("bugsnag-errors", "errors"))) {
            String str = (String) pair.a();
            String str2 = (String) pair.b();
            File file2 = new File(value, str);
            if (file2.exists()) {
                file2.renameTo(new File(file, str2));
            }
        }
        return file;
    }
}
