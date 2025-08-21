package z;

import F.l0;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18398o {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f172183a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f172184b = false;

    public void a() {
        this.f172184b = false;
    }

    public void b() {
        this.f172184b = true;
    }

    public boolean c(int i10) {
        return this.f172184b && i10 == 0 && this.f172183a;
    }

    public C18398o(l0 l0Var) {
        this.f172183a = l0Var.b(AutoFlashUnderExposedQuirk.class) != null;
    }
}
