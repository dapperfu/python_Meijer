package N4;

import android.annotation.SuppressLint;
import android.content.Context;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000  2\u00020\u0001:\u0002 \u001dB\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\tH&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\t0\"2\u0006\u0010\u001f\u001a\u00020\rH&¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"LN4/O;", "", "<init>", "()V", "LN4/P;", "request", "LN4/z;", "c", "(LN4/P;)LN4/z;", "", "requests", "d", "(Ljava/util/List;)LN4/z;", "", "uniqueWorkName", "LN4/i;", "existingWorkPolicy", "LN4/y;", "f", "(Ljava/lang/String;LN4/i;LN4/y;)LN4/z;", "g", "(Ljava/lang/String;LN4/i;Ljava/util/List;)LN4/z;", "LN4/h;", "existingPeriodicWorkPolicy", "LN4/F;", "e", "(Ljava/lang/String;LN4/h;LN4/F;)LN4/z;", "Ljava/util/UUID;", PreferencesHelper.PREF_ID, "b", "(Ljava/util/UUID;)LN4/z;", "tag", "a", "(Ljava/lang/String;)LN4/z;", "Lcom/google/common/util/concurrent/q;", "LN4/N;", "i", "(Ljava/lang/String;)Lcom/google/common/util/concurrent/q;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"AddedAbstractMethod"})
/* loaded from: classes4.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LN4/O$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LN4/O;", "a", "(Landroid/content/Context;)LN4/O;", "Landroidx/work/a;", "configuration", "", "b", "(Landroid/content/Context;Landroidx/work/a;)V", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: N4.O$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public O a(Context context) {
            Intrinsics.j(context, "context");
            O4.O oP = O4.O.p(context);
            Intrinsics.i(oP, "getInstance(context)");
            return oP;
        }

        @JvmStatic
        public void b(Context context, androidx.work.a configuration) {
            Intrinsics.j(context, "context");
            Intrinsics.j(configuration, "configuration");
            O4.O.j(context, configuration);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LN4/O$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum b {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    @JvmStatic
    public static O h(Context context) {
        return INSTANCE.a(context);
    }

    @JvmStatic
    public static void j(Context context, androidx.work.a aVar) {
        INSTANCE.b(context, aVar);
    }

    public abstract z a(String tag);

    public abstract z b(UUID id2);

    public abstract z d(List<? extends P> requests2);

    public abstract z e(String uniqueWorkName, EnumC4320h existingPeriodicWorkPolicy, F request);

    public abstract z g(String uniqueWorkName, EnumC4321i existingWorkPolicy, List<y> requests2);

    public abstract com.google.common.util.concurrent.q<List<N>> i(String tag);

    public final z c(P request) {
        Intrinsics.j(request, "request");
        return d(CollectionsKt.e(request));
    }

    public z f(String uniqueWorkName, EnumC4321i existingWorkPolicy, y request) {
        Intrinsics.j(uniqueWorkName, "uniqueWorkName");
        Intrinsics.j(existingWorkPolicy, "existingWorkPolicy");
        Intrinsics.j(request, "request");
        return g(uniqueWorkName, existingWorkPolicy, CollectionsKt.e(request));
    }
}
