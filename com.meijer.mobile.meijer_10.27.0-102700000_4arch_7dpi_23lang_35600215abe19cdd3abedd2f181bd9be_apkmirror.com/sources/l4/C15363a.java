package l4;

import android.os.Build;
import android.os.ext.SdkExtensions;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u0005\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Ll4/a;", "", "<init>", "()V", "", "a", "()I", "b", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: l4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15363a {

    /* renamed from: a, reason: collision with root package name */
    public static final C15363a f148504a = new C15363a();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll4/a$a;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l4.a$a, reason: collision with other inner class name */
    private static final class C2283a {

        /* renamed from: a, reason: collision with root package name */
        public static final C2283a f148505a = new C2283a();

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }

        private C2283a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ll4/a$b;", "", "<init>", "()V", "", "a", "()I", "ads-adservices_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: l4.a$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f148506a = new b();

        private b() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return b.f148506a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return C2283a.f148505a.a();
        }
        return 0;
    }

    private C15363a() {
    }
}
