package P4;

import W4.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"LP4/z;", "", "LW4/h;", PreferencesHelper.PREF_ID, "LP4/y;", "e", "(LW4/h;)LP4/y;", "f", "", "workSpecId", "", "remove", "(Ljava/lang/String;)Ljava/util/List;", "", "c", "(LW4/h;)Z", "Landroidx/work/impl/model/WorkSpec;", "spec", "d", "(Landroidx/work/impl/model/WorkSpec;)LP4/y;", "a", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface z {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f25593a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LP4/z$a;", "", "<init>", "()V", "", "synchronized", "LP4/z;", "b", "(Z)LP4/z;", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: P4.z$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f25593a = new Companion();

        public static /* synthetic */ z c(Companion companion, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = true;
            }
            return companion.b(z10);
        }

        @JvmStatic
        @JvmOverloads
        public final z a() {
            return c(this, false, 1, null);
        }

        @JvmStatic
        @JvmOverloads
        public final z b(boolean z10) {
            A a10 = new A();
            return z10 ? new B(a10) : a10;
        }

        private Companion() {
        }
    }

    @JvmStatic
    @JvmOverloads
    static z a() {
        return INSTANCE.a();
    }

    @JvmStatic
    @JvmOverloads
    static z b(boolean z10) {
        return INSTANCE.b(z10);
    }

    boolean c(WorkGenerationalId id2);

    y e(WorkGenerationalId id2);

    y f(WorkGenerationalId id2);

    List<y> remove(String workSpecId);

    default y d(WorkSpec spec) {
        Intrinsics.j(spec, "spec");
        return e(W4.p.a(spec));
    }
}
