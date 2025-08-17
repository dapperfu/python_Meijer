package z;

import F.l0;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

/* renamed from: z.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18335o {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f171387a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f171388b = false;

    public void a() {
        this.f171388b = false;
    }

    public void b() {
        this.f171388b = true;
    }

    public boolean c(int i10) {
        return this.f171388b && i10 == 0 && this.f171387a;
    }

    public C18335o(l0 l0Var) {
        this.f171387a = l0Var.b(AutoFlashUnderExposedQuirk.class) != null;
    }
}
