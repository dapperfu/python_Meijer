package Rc;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: Rc.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C5182c0 extends B {

    /* renamed from: c, reason: collision with root package name */
    private final Context f32347c;

    @Override // Rc.B
    public final void a() {
        boolean zC;
        try {
            zC = Kc.a.c(this.f32347c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            Sc.p.e("Fail to get isAdIdFakeForDebugLogging", e10);
            zC = false;
        }
        Sc.m.j(zC);
        Sc.p.g("Update ad debug logging enablement as " + zC);
    }

    C5182c0(Context context) {
        this.f32347c = context;
    }
}
