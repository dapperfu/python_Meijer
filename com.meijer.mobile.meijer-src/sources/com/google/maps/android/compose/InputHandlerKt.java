package com.google.maps.android.compose;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u0097\u0002\u0010\u0013\u001a\u00020\u00022\u0016\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00002\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00002\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlin/Function1;", "LOd/g;", "", "onCircleClick", "LOd/j;", "onGroundOverlayClick", "LOd/s;", "onPolygonClick", "LOd/u;", "onPolylineClick", "LOd/n;", "", "onMarkerClick", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "InputHandler", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InputHandlerKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InputHandler(kotlin.jvm.functions.Function1<? super Od.C4459g, kotlin.Unit> r40, kotlin.jvm.functions.Function1<? super Od.C4462j, kotlin.Unit> r41, kotlin.jvm.functions.Function1<? super Od.C4470s, kotlin.Unit> r42, kotlin.jvm.functions.Function1<? super Od.C4472u, kotlin.Unit> r43, kotlin.jvm.functions.Function1<? super Od.C4466n, java.lang.Boolean> r44, kotlin.jvm.functions.Function1<? super Od.C4466n, kotlin.Unit> r45, kotlin.jvm.functions.Function1<? super Od.C4466n, kotlin.Unit> r46, kotlin.jvm.functions.Function1<? super Od.C4466n, kotlin.Unit> r47, kotlin.jvm.functions.Function1<? super Od.C4466n, kotlin.Unit> r48, kotlin.jvm.functions.Function1<? super Od.C4466n, kotlin.Unit> r49, kotlin.jvm.functions.Function1<? super Od.C4466n, kotlin.Unit> r50, androidx.compose.runtime.Composer r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.InputHandlerKt.InputHandler(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$14(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111, int i10, int i11, int i12, Composer composer, int i13) {
        InputHandler(function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111, composer, androidx.compose.runtime.J0.a(i10 | 1), androidx.compose.runtime.J0.a(i11), i12);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputHandlerNode InputHandler$lambda$1$lambda$0(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16, Function1 function17, Function1 function18, Function1 function19, Function1 function110, Function1 function111) {
        return new InputHandlerNode(function1, function12, function13, function14, function15, function16, function17, function18, function19, function110, function111);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$10(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnMarkerDrag(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$11(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnMarkerDragEnd(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$12(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnMarkerDragStart(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$2(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnCircleClick(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$3(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnGroundOverlayClick(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$4(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnPolygonClick(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$5(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnPolylineClick(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$6(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnMarkerClick(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$7(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnInfoWindowClick(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$8(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnInfoWindowClose(function1);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InputHandler$lambda$13$lambda$9(InputHandlerNode update, Function1 function1) {
        Intrinsics.j(update, "$this$update");
        update.setOnInfoWindowLongClick(function1);
        return Unit.f143329a;
    }
}
