package Pc;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* renamed from: Pc.c0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C4561c0 extends B {

    /* renamed from: c, reason: collision with root package name */
    private final Context f25133c;

    @Override // Pc.B
    public final void a() {
        boolean zC;
        try {
            zC = Ic.a.c(this.f25133c);
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e10) {
            Qc.p.e("Fail to get isAdIdFakeForDebugLogging", e10);
            zC = false;
        }
        Qc.m.j(zC);
        Qc.p.g("Update ad debug logging enablement as " + zC);
    }

    C4561c0(Context context) {
        this.f25133c = context;
    }
}
