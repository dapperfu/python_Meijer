package Cd;

import Vd.AbstractC5516j;
import Vd.C5517k;
import Vd.InterfaceC5509c;
import android.location.Location;
import java.util.Objects;

/* renamed from: Cd.k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final /* synthetic */ class C3060k implements InterfaceC5509c {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C5517k f4260a;

    @Override // Vd.InterfaceC5509c
    public final /* synthetic */ Object then(AbstractC5516j abstractC5516j) {
        com.google.android.gms.common.api.a aVar = C3057i.f4256b;
        C5517k c5517k = this.f4260a;
        if (abstractC5516j.r()) {
            c5517k.e((Location) abstractC5516j.n());
            return null;
        }
        Exception excM = abstractC5516j.m();
        Objects.requireNonNull(excM);
        c5517k.d(excM);
        return null;
    }
}
