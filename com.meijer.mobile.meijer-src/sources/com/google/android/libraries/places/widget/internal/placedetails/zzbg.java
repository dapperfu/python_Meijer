package com.google.android.libraries.places.widget.internal.placedetails;

import Vd.InterfaceC5512f;
import com.fullstory.FS;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15815n;

/* loaded from: classes6.dex */
final class zzbg implements InterfaceC5512f {
    final /* synthetic */ InterfaceC15815n zza;

    zzbg(InterfaceC15815n interfaceC15815n) {
        this.zza = interfaceC15815n;
    }

    @Override // Vd.InterfaceC5512f
    public final void onFailure(Exception e10) {
        Intrinsics.j(e10, "e");
        e10.printStackTrace();
        Unit unit = Unit.f143329a;
        new StringBuilder(String.valueOf(unit).length() + 38);
        Objects.toString(unit);
        FS.log_w("PlaceDetailsViewModel", "Failed to fetch photo URI with error: ".concat(String.valueOf(unit)));
        this.zza.resumeWith(Result.b(zzbk.zza));
    }
}
