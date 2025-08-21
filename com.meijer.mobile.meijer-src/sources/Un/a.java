package Un;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yk.C18326b;
import yo.k;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LUn/a;", "", "Landroid/content/Context;", "context", "Lyo/k;", "userManager", "<init>", "(Landroid/content/Context;Lyo/k;)V", "", "a", "()Z", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lyo/k;", "getUserManager", "()Lyo/k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    public a(Context context, k userManager) {
        Intrinsics.j(context, "context");
        Intrinsics.j(userManager, "userManager");
        this.context = context;
        this.userManager = userManager;
    }

    public final boolean a() {
        if (!this.userManager.b() || !this.userManager.G()) {
            return false;
        }
        if (C18326b.a(this.context, "android.permission.ACCESS_FINE_LOCATION")) {
            return true;
        }
        this.userManager.N(true);
        qw.a.INSTANCE.s("Location permission not granted, geofences will not be setup", new Object[0]);
        return false;
    }
}
