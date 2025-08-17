package com.google.maps.android.compose;

import Kd.C3945c;
import Md.C4181g;
import Md.C4182h;
import V0.C5349s0;
import androidx.compose.runtime.Composer;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u0091\u0001\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\f2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/google/android/gms/maps/model/LatLng;", "center", "", "clickable", "LV0/q0;", "fillColor", "", "radius", "strokeColor", "", "LMd/p;", "strokePattern", "", "strokeWidth", "", "tag", "visible", "zIndex", "Lkotlin/Function1;", "LMd/g;", "", "onClick", "Circle-rQ_Q3OA", "(Lcom/google/android/gms/maps/model/LatLng;ZJDJLjava/util/List;FLjava/lang/Object;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Circle", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class CircleKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:219:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011f  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: Circle-rQ_Q3OA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m41CirclerQ_Q3OA(final com.google.android.gms.maps.model.LatLng r36, boolean r37, long r38, double r40, long r42, java.util.List<? extends Md.C4190p> r44, float r45, java.lang.Object r46, boolean r47, float r48, kotlin.jvm.functions.Function1<? super Md.C4181g, kotlin.Unit> r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.CircleKt.m41CirclerQ_Q3OA(com.google.android.gms.maps.model.LatLng, boolean, long, double, long, java.util.List, float, java.lang.Object, boolean, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$15(LatLng latLng, boolean z10, long j10, double d10, long j11, List list, float f10, Object obj, boolean z11, float f11, Function1 function1, int i10, int i11, int i12, Composer composer, int i13) {
        m41CirclerQ_Q3OA(latLng, z10, j10, d10, j11, list, f10, obj, z11, f11, function1, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$1$lambda$0(C4181g it) {
        Intrinsics.j(it, "it");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$10(CircleNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getCircle().h(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$11(CircleNode update, Object obj) {
        Intrinsics.j(update, "$this$update");
        update.getCircle().i(obj);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$12(CircleNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getCircle().j(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$13(CircleNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getCircle().k(f10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$5(CircleNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnCircleClick(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$6(CircleNode update, LatLng it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getCircle().b(it);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$7(CircleNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getCircle().c(z10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$8(CircleNode update, double d10) {
        Intrinsics.j(update, "$this$update");
        update.getCircle().e(d10);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Circle_rQ_Q3OA$lambda$14$lambda$9(CircleNode update, List list) {
        Intrinsics.j(update, "$this$update");
        update.getCircle().g(list);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CircleNode Circle_rQ_Q3OA$lambda$4$lambda$3(MapApplier mapApplier, Object obj, Function1 function1, LatLng latLng, boolean z10, long j10, double d10, long j11, List list, float f10, boolean z11, float f11) {
        C3945c map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            C4182h c4182h = new C4182h();
            c4182h.B(latLng);
            c4182h.T(z10);
            c4182h.c0(C5349s0.j(j10));
            c4182h.d2(d10);
            c4182h.l2(C5349s0.j(j11));
            c4182h.J2(list);
            c4182h.M2(f10);
            c4182h.O2(z11);
            c4182h.T2(f11);
            C4181g c4181gA = map.a(c4182h);
            Intrinsics.i(c4181gA, "addCircle(...)");
            if (c4181gA != null) {
                c4181gA.i(obj);
                return new CircleNode(c4181gA, function1);
            }
        }
        throw new IllegalStateException("Error adding circle");
    }
}
