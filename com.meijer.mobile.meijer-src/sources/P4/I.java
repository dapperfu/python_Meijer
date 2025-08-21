package P4;

import O4.AbstractC4373v;
import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000bJ\u0015\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"LP4/I;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)V", "Ljava/io/File;", "c", "(Landroid/content/Context;)Ljava/io/File;", "", "e", "(Landroid/content/Context;)Ljava/util/Map;", "b", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class I {

    /* renamed from: a, reason: collision with root package name */
    public static final I f25458a = new I();

    private final File c(Context context) {
        return new File(C4566a.f25548a.a(context), "androidx.work.workdb");
    }

    @JvmStatic
    public static final void d(Context context) {
        Intrinsics.j(context, "context");
        I i10 = f25458a;
        if (i10.b(context).exists()) {
            AbstractC4373v.e().a(J.f25459a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : i10.e(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        AbstractC4373v.e().k(J.f25459a, "Over-writing contents of " + value);
                    }
                    AbstractC4373v.e().a(J.f25459a, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    public final File a(Context context) {
        Intrinsics.j(context, "context");
        return c(context);
    }

    public final File b(Context context) {
        Intrinsics.j(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.i(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final Map<File, File> e(Context context) {
        Intrinsics.j(context, "context");
        File fileB = b(context);
        File fileA = a(context);
        String[] strArr = J.f25460b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(strArr.length), 16));
        for (String str : strArr) {
            Pair pairA = TuplesKt.a(new File(fileB.getPath() + str), new File(fileA.getPath() + str));
            linkedHashMap.put(pairA.c(), pairA.d());
        }
        return MapsKt.v(linkedHashMap, TuplesKt.a(fileB, fileA));
    }

    private I() {
    }
}
