package com.google.maps.android.compose.streetview;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003RC\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRC\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\t\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/google/maps/android/compose/streetview/StreetViewPanoramaEventListeners;", "", "<init>", "()V", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/a;", "", "<set-?>", "onClick$delegate", "Landroidx/compose/runtime/l0;", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "setOnClick", "(Lkotlin/jvm/functions/Function1;)V", "onClick", "onLongClick$delegate", "getOnLongClick", "setOnLongClick", "onLongClick", "maps-compose_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class StreetViewPanoramaEventListeners {
    public static final int $stable = 0;

    /* renamed from: onClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 onClick = t1.e(new Function1() { // from class: com.google.maps.android.compose.streetview.k
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return StreetViewPanoramaEventListeners.onClick_delegate$lambda$0((com.google.android.gms.maps.model.a) obj);
        }
    }, null, 2, null);

    /* renamed from: onLongClick$delegate, reason: from kotlin metadata */
    private final InterfaceC5872l0 onLongClick = t1.e(new Function1() { // from class: com.google.maps.android.compose.streetview.l
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return StreetViewPanoramaEventListeners.onLongClick_delegate$lambda$1((com.google.android.gms.maps.model.a) obj);
        }
    }, null, 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick_delegate$lambda$0(com.google.android.gms.maps.model.a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onLongClick_delegate$lambda$1(com.google.android.gms.maps.model.a it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    public final Function1<com.google.android.gms.maps.model.a, Unit> getOnClick() {
        return (Function1) this.onClick.getValue();
    }

    public final Function1<com.google.android.gms.maps.model.a, Unit> getOnLongClick() {
        return (Function1) this.onLongClick.getValue();
    }

    public final void setOnClick(Function1<? super com.google.android.gms.maps.model.a, Unit> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onClick.setValue(function1);
    }

    public final void setOnLongClick(Function1<? super com.google.android.gms.maps.model.a, Unit> function1) {
        Intrinsics.j(function1, "<set-?>");
        this.onLongClick.setValue(function1);
    }
}
