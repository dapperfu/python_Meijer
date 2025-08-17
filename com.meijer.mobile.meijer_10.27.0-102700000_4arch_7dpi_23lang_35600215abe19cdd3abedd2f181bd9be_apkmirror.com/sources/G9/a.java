package G9;

import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\r\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0013\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0006R\u0011\u0010\u0015\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0006¨\u0006\u0016"}, d2 = {"LG9/a;", "", "<init>", "()V", "", "e", "()Z", "isOreoOrAbove", "a", "isBelowOreo", "b", "isBelowQ", "c", "isBelowTiramisu", "f", "isSOrAbove", "d", "isBelowUpsideDownCake", "h", "isUpsideDownCakeOrHigher", "g", "isUpsideDownCake", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f11285a = new a();

    public final boolean a() {
        return Build.VERSION.SDK_INT < 26;
    }

    public final boolean b() {
        return Build.VERSION.SDK_INT < 29;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT < 33;
    }

    public final boolean d() {
        return Build.VERSION.SDK_INT < 34;
    }

    public final boolean e() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public final boolean f() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public final boolean g() {
        return Build.VERSION.SDK_INT == 34;
    }

    public final boolean h() {
        return Build.VERSION.SDK_INT >= 34;
    }

    private a() {
    }
}
