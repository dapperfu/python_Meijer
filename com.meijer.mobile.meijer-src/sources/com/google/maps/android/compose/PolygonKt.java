package com.google.maps.android.compose;

import Md.C4110c;
import Od.C4470s;
import Od.C4471t;
import V0.C5492s0;
import androidx.compose.runtime.Composer;
import com.google.maps.android.data.kml.KmlPolygon;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000B\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a·\u0001\u0010\u001a\u001a\u00020\u00162\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00000\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u000e2\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0007¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"", "Lcom/google/android/gms/maps/model/LatLng;", "points", "", "clickable", "LV0/q0;", "fillColor", "geodesic", "holes", "strokeColor", "", "strokeJointType", "LOd/p;", "strokePattern", "", "strokeWidth", "", "tag", "visible", "zIndex", "Lkotlin/Function1;", "LOd/s;", "", "onClick", "Polygon-qT8xWJw", "(Ljava/util/List;ZJZLjava/util/List;JILjava/util/List;FLjava/lang/Object;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", KmlPolygon.GEOMETRY_TYPE, "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PolygonKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011e  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: Polygon-qT8xWJw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m57PolygonqT8xWJw(final java.util.List<com.google.android.gms.maps.model.LatLng> r39, boolean r40, long r41, boolean r43, java.util.List<? extends java.util.List<com.google.android.gms.maps.model.LatLng>> r44, long r45, int r47, java.util.List<? extends Od.C4468p> r48, float r49, java.lang.Object r50, boolean r51, float r52, kotlin.jvm.functions.Function1<? super Od.C4470s, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1133
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.PolygonKt.m57PolygonqT8xWJw(java.util.List, boolean, long, boolean, java.util.List, long, int, java.util.List, float, java.lang.Object, boolean, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$18(List list, boolean z10, long j10, boolean z11, List list2, long j11, int i10, List list3, float f10, Object obj, boolean z12, float f11, Function1 function1, int i11, int i12, int i13, Composer composer, int i14) {
        m57PolygonqT8xWJw(list, z10, j10, z11, list2, j11, i10, list3, f10, obj, z12, f11, function1, composer, androidx.compose.runtime.J0.a(i11 | 1), androidx.compose.runtime.J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$2(List list, boolean z10, long j10, boolean z11, List list2, long j11, int i10, List list3, float f10, Object obj, boolean z12, float f11, Function1 function1, int i11, int i12, int i13, Composer composer, int i14) {
        m57PolygonqT8xWJw(list, z10, j10, z11, list2, j11, i10, list3, f10, obj, z12, f11, function1, composer, androidx.compose.runtime.J0.a(i11 | 1), androidx.compose.runtime.J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$1$lambda$0(C4470s it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$10(PolygonNode update, List it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getPolygon().e(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$11(PolygonNode update, int i10) {
        Intrinsics.j(update, "$this$update");
        update.getPolygon().h(i10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$12(PolygonNode update, List list) {
        Intrinsics.j(update, "$this$update");
        update.getPolygon().i(list);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$13(PolygonNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getPolygon().j(f10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$14(PolygonNode update, Object obj) {
        Intrinsics.j(update, "$this$update");
        update.getPolygon().k(obj);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$15(PolygonNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getPolygon().l(z10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$16(PolygonNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getPolygon().m(f10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$6(PolygonNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnPolygonClick(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$7(PolygonNode update, List it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getPolygon().f(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$8(PolygonNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getPolygon().b(z10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polygon_qT8xWJw$lambda$17$lambda$9(PolygonNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getPolygon().d(z10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PolygonNode Polygon_qT8xWJw$lambda$5$lambda$4(MapApplier mapApplier, Object obj, Function1 function1, List list, boolean z10, long j10, boolean z11, List list2, long j11, int i10, List list3, float f10, boolean z12, float f11) {
        C4110c map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            C4471t c4471t = new C4471t();
            c4471t.B(list);
            c4471t.b0(z10);
            c4471t.r0(C5492s0.j(j10));
            c4471t.I0(z11);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c4471t.T((List) it.next());
            }
            c4471t.L2(C5492s0.j(j11));
            c4471t.N2(i10);
            c4471t.U2(list3);
            c4471t.W2(f10);
            c4471t.A3(z12);
            c4471t.U3(f11);
            C4470s c4470sD = map.d(c4471t);
            Intrinsics.i(c4470sD, "addPolygon(...)");
            if (c4470sD != null) {
                c4470sD.k(obj);
                return new PolygonNode(c4470sD, function1);
            }
        }
        throw new IllegalStateException("Error adding polygon");
    }
}
