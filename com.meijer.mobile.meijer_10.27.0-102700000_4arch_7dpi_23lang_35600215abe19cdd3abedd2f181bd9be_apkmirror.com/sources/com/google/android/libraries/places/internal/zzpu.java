package com.google.android.libraries.places.internal;

import Td.InterfaceC5228f;
import com.fullstory.FS;
import java.util.Objects;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16654n;

/* loaded from: classes6.dex */
final class zzpu implements InterfaceC5228f {
    final /* synthetic */ InterfaceC16654n zza;

    zzpu(InterfaceC16654n interfaceC16654n) {
        this.zza = interfaceC16654n;
    }

    @Override // Td.InterfaceC5228f
    public final void onFailure(Exception e10) {
        Intrinsics.j(e10, "e");
        e10.printStackTrace();
        Unit unit = Unit.f142422a;
        new StringBuilder(String.valueOf(unit).length() + 38);
        Objects.toString(unit);
        FS.log_w("PlaceSearchViewModel", "Failed to fetch photo URI with error: ".concat(String.valueOf(unit)));
        this.zza.resumeWith(Result.b(com.google.android.libraries.places.widget.internal.placedetails.zzbk.zza));
    }
}
