package Ad;

import Td.AbstractC5232j;
import Td.C5233k;
import Td.InterfaceC5225c;
import android.location.Location;
import java.util.Objects;

/* renamed from: Ad.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C2822k implements InterfaceC5225c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C5233k f264a;

    @Override // Td.InterfaceC5225c
    public final /* synthetic */ Object then(AbstractC5232j abstractC5232j) {
        com.google.android.gms.common.api.a aVar = C2819i.f260b;
        C5233k c5233k = this.f264a;
        if (abstractC5232j.r()) {
            c5233k.e((Location) abstractC5232j.n());
            return null;
        }
        Exception excM = abstractC5232j.m();
        Objects.requireNonNull(excM);
        c5233k.d(excM);
        return null;
    }
}
