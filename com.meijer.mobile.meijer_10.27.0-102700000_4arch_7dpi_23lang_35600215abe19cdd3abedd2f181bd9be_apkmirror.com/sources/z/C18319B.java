package z;

import C.P;
import F.l0;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;

/* renamed from: z.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C18319B {

    /* renamed from: a, reason: collision with root package name */
    private final TorchFlashRequiredFor3aUpdateQuirk f171370a;

    public boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f171370a;
        boolean z10 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.f();
        P.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z10);
        return z10;
    }

    public C18319B(l0 l0Var) {
        this.f171370a = (TorchFlashRequiredFor3aUpdateQuirk) l0Var.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }
}
