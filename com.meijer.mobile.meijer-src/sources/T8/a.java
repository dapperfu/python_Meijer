package T8;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"LT8/a;", "", "Landroid/app/Activity;", "activity", "", "a", "(Landroid/app/Activity;)V", "", "c", "()I", "priority", "", "d", "()Z", "repeatable", "LT8/a$a;", "b", "()LT8/a$a;", "triggeringLifecycle", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\bj\u0002\b\n¨\u0006\u000b"}, d2 = {"LT8/a$a;", "", "", "priority", "<init>", "(Ljava/lang/String;II)V", "a", "I", "b", "()I", "c", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: T8.a$a, reason: collision with other inner class name */
    public static final class EnumC0795a {

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0795a f35934b = new EnumC0795a("CREATE", 0, 0);

        /* renamed from: c, reason: collision with root package name */
        public static final EnumC0795a f35935c = new EnumC0795a("RESUME", 1, 1000);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumC0795a[] f35936d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f35937e;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int priority;

        static {
            EnumC0795a[] enumC0795aArrA = a();
            f35936d = enumC0795aArrA;
            f35937e = EnumEntriesKt.a(enumC0795aArrA);
        }

        private static final /* synthetic */ EnumC0795a[] a() {
            return new EnumC0795a[]{f35934b, f35935c};
        }

        public static EnumC0795a valueOf(String str) {
            return (EnumC0795a) Enum.valueOf(EnumC0795a.class, str);
        }

        public static EnumC0795a[] values() {
            return (EnumC0795a[]) f35936d.clone();
        }

        /* renamed from: b, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }

        private EnumC0795a(String str, int i10, int i11) {
            this.priority = i11;
        }
    }

    void a(Activity activity);

    EnumC0795a b();

    int c();

    boolean d();
}
