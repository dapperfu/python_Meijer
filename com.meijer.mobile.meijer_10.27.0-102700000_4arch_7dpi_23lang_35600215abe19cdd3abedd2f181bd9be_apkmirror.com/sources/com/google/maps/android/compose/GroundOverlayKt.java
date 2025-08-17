package com.google.maps.android.compose;

import Kd.C3945c;
import Md.C4177c;
import Md.C4184j;
import Md.C4185k;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a}\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001b\u0010\u0001\u001a\u00020\u0011*\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0016\u001a\u001b\u0010\u0001\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0001\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/google/maps/android/compose/GroundOverlayPosition;", "position", "LMd/c;", "image", "LU0/f;", "anchor", "", "bearing", "", "clickable", "", "tag", "transparency", "visible", "zIndex", "Lkotlin/Function1;", "LMd/j;", "", "onClick", "GroundOverlay-bPm4XcI", "(Lcom/google/maps/android/compose/GroundOverlayPosition;LMd/c;JFZLjava/lang/Object;FZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "GroundOverlay", "(LMd/j;Lcom/google/maps/android/compose/GroundOverlayPosition;)V", "LMd/k;", "(LMd/k;Lcom/google/maps/android/compose/GroundOverlayPosition;)LMd/k;", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class GroundOverlayKt {
    private static final void position(C4184j c4184j, GroundOverlayPosition groundOverlayPosition) {
        if (groundOverlayPosition.getLatLngBounds() != null) {
            c4184j.h(groundOverlayPosition.getLatLngBounds());
            return;
        }
        if (groundOverlayPosition.getLocation() != null) {
            c4184j.g(groundOverlayPosition.getLocation());
        }
        if (groundOverlayPosition.getWidth() != null && groundOverlayPosition.getHeight() == null) {
            c4184j.d(groundOverlayPosition.getWidth().floatValue());
        } else {
            if (groundOverlayPosition.getWidth() == null || groundOverlayPosition.getHeight() == null) {
                return;
            }
            c4184j.e(groundOverlayPosition.getWidth().floatValue(), groundOverlayPosition.getHeight().floatValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0115  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: GroundOverlay-bPm4XcI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m46GroundOverlaybPm4XcI(final com.google.maps.android.compose.GroundOverlayPosition r29, final Md.C4177c r30, long r31, float r33, boolean r34, java.lang.Object r35, float r36, boolean r37, float r38, kotlin.jvm.functions.Function1<? super Md.C4184j, kotlin.Unit> r39, androidx.compose.runtime.Composer r40, final int r41, final int r42) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.GroundOverlayKt.m46GroundOverlaybPm4XcI(com.google.maps.android.compose.GroundOverlayPosition, Md.c, long, float, boolean, java.lang.Object, float, boolean, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$1$lambda$0(C4184j it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$10(GroundOverlayNode update, Object obj) {
        Intrinsics.j(update, "$this$update");
        update.getGroundOverlay().i(obj);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$11(GroundOverlayNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getGroundOverlay().j(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$12(GroundOverlayNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getGroundOverlay().k(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$13(GroundOverlayNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getGroundOverlay().l(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$5(GroundOverlayNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnGroundOverlayClick(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$6(GroundOverlayNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getGroundOverlay().b(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$7(GroundOverlayNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getGroundOverlay().c(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$8(GroundOverlayNode update, C4177c it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getGroundOverlay().f(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$14$lambda$9(GroundOverlayNode update, GroundOverlayPosition it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        position(update.getGroundOverlay(), it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GroundOverlay_bPm4XcI$lambda$15(GroundOverlayPosition groundOverlayPosition, C4177c c4177c, long j10, float f10, boolean z10, Object obj, float f11, boolean z11, float f12, Function1 function1, int i10, int i11, Composer composer, int i12) {
        m46GroundOverlaybPm4XcI(groundOverlayPosition, c4177c, j10, f10, z10, obj, f11, z11, f12, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), i11);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GroundOverlayNode GroundOverlay_bPm4XcI$lambda$4$lambda$3(MapApplier mapApplier, Object obj, Function1 function1, long j10, float f10, boolean z10, C4177c c4177c, GroundOverlayPosition groundOverlayPosition, float f11, boolean z11, float f12) {
        C3945c map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            C4185k c4185k = new C4185k();
            c4185k.B(U0.f.m(j10), U0.f.n(j10));
            c4185k.T(f10);
            c4185k.c0(z10);
            c4185k.d2(c4177c);
            position(c4185k, groundOverlayPosition);
            c4185k.W2(f11);
            c4185k.B3(z11);
            c4185k.U3(f12);
            C4184j c4184jB = map.b(c4185k);
            if (c4184jB != null) {
                c4184jB.i(obj);
                return new GroundOverlayNode(c4184jB, function1);
            }
        }
        throw new IllegalStateException("Error adding ground overlay");
    }

    private static final C4185k position(C4185k c4185k, GroundOverlayPosition groundOverlayPosition) {
        if (groundOverlayPosition.getLatLngBounds() != null) {
            C4185k c4185kT2 = c4185k.T2(groundOverlayPosition.getLatLngBounds());
            Intrinsics.i(c4185kT2, "positionFromBounds(...)");
            return c4185kT2;
        }
        if (groundOverlayPosition.getLocation() != null && groundOverlayPosition.getWidth() != null) {
            if (groundOverlayPosition.getHeight() == null) {
                C4185k c4185kM2 = c4185k.M2(groundOverlayPosition.getLocation(), groundOverlayPosition.getWidth().floatValue());
                Intrinsics.i(c4185kM2, "position(...)");
                return c4185kM2;
            }
            C4185k c4185kO2 = c4185k.O2(groundOverlayPosition.getLocation(), groundOverlayPosition.getWidth().floatValue(), groundOverlayPosition.getHeight().floatValue());
            Intrinsics.i(c4185kO2, "position(...)");
            return c4185kO2;
        }
        throw new IllegalStateException("Invalid position " + groundOverlayPosition);
    }
}
