package com.google.maps.android.compose;

import Md.C4110c;
import Od.C4458f;
import Od.C4472u;
import Od.C4473v;
import V0.C5492s0;
import androidx.compose.runtime.Composer;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a«\u0001\u0010\u001b\u001a\u00020\u00172\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a¯\u0001\u0010\u001b\u001a\u00020\u00172\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001e\u001a»\u0001\u0010!\u001a\u00020\u00172\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015H\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"", "Lcom/google/android/gms/maps/model/LatLng;", "points", "", "clickable", "LV0/q0;", "color", "LOd/f;", "endCap", "geodesic", "", "jointType", "LOd/p;", "pattern", "startCap", "", "tag", "visible", "", "width", "zIndex", "Lkotlin/Function1;", "LOd/u;", "", "onClick", "Polyline-Ut8lOTo", "(Ljava/util/List;ZJLOd/f;ZILjava/util/List;LOd/f;Ljava/lang/Object;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Polyline", "LOd/D;", "spans", "(Ljava/util/List;Ljava/util/List;ZLOd/f;ZILjava/util/List;LOd/f;Ljava/lang/Object;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "PolylineImpl-LjegJe0", "(Ljava/util/List;Ljava/util/List;ZJLOd/f;ZILjava/util/List;LOd/f;Ljava/lang/Object;ZFFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "PolylineImpl", "maps-compose_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PolylineKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:205:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0116  */
    @com.google.maps.android.compose.GoogleMapComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Polyline(final java.util.List<com.google.android.gms.maps.model.LatLng> r30, final java.util.List<Od.D> r31, boolean r32, Od.C4458f r33, boolean r34, int r35, java.util.List<? extends Od.C4468p> r36, Od.C4458f r37, java.lang.Object r38, boolean r39, float r40, float r41, kotlin.jvm.functions.Function1<? super Od.C4472u, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.PolylineKt.Polyline(java.util.List, java.util.List, boolean, Od.f, boolean, int, java.util.List, Od.f, java.lang.Object, boolean, float, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:210:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: Polyline-Ut8lOTo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m60PolylineUt8lOTo(final java.util.List<com.google.android.gms.maps.model.LatLng> r31, boolean r32, long r33, Od.C4458f r35, boolean r36, int r37, java.util.List<? extends Od.C4468p> r38, Od.C4458f r39, java.lang.Object r40, boolean r41, float r42, float r43, kotlin.jvm.functions.Function1<? super Od.C4472u, kotlin.Unit> r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.PolylineKt.m60PolylineUt8lOTo(java.util.List, boolean, long, Od.f, boolean, int, java.util.List, Od.f, java.lang.Object, boolean, float, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0488  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    @com.google.maps.android.compose.GoogleMapComposable
    /* renamed from: PolylineImpl-LjegJe0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void m61PolylineImplLjegJe0(final java.util.List<com.google.android.gms.maps.model.LatLng> r37, java.util.List<Od.D> r38, boolean r39, long r40, Od.C4458f r42, boolean r43, int r44, java.util.List<? extends Od.C4468p> r45, Od.C4458f r46, java.lang.Object r47, boolean r48, float r49, float r50, kotlin.jvm.functions.Function1<? super Od.C4472u, kotlin.Unit> r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.compose.PolylineKt.m61PolylineImplLjegJe0(java.util.List, java.util.List, boolean, long, Od.f, boolean, int, java.util.List, Od.f, java.lang.Object, boolean, float, float, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polyline$lambda$4$lambda$3(C4472u it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polyline$lambda$5(List list, List list2, boolean z10, C4458f c4458f, boolean z11, int i10, List list3, C4458f c4458f2, Object obj, boolean z12, float f10, float f11, Function1 function1, int i11, int i12, int i13, Composer composer, int i14) {
        Polyline(list, list2, z10, c4458f, z11, i10, list3, c4458f2, obj, z12, f10, f11, function1, composer, androidx.compose.runtime.J0.a(i11 | 1), androidx.compose.runtime.J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PolylineNode PolylineImpl_LjegJe0$lambda$10$lambda$9(MapApplier mapApplier, Object obj, Function1 function1, List list, List list2, boolean z10, long j10, C4458f c4458f, boolean z11, int i10, List list3, C4458f c4458f2, boolean z12, float f10, float f11) {
        C4110c map;
        if (mapApplier != null && (map = mapApplier.getMap()) != null) {
            C4473v c4473v = new C4473v();
            c4473v.B(list);
            c4473v.T(list2);
            c4473v.r0(z10);
            c4473v.I0(C5492s0.j(j10));
            c4473v.U0(c4458f);
            c4473v.d1(z11);
            c4473v.W2(i10);
            c4473v.A3(list3);
            c4473v.U3(c4458f2);
            c4473v.V3(z12);
            c4473v.W3(f10);
            c4473v.X3(f11);
            C4472u c4472uE = map.e(c4473v);
            Intrinsics.i(c4472uE, "addPolyline(...)");
            if (c4472uE != null) {
                c4472uE.k(obj);
                return new PolylineNode(c4472uE, function1);
            }
        }
        throw new IllegalStateException("Error adding Polyline");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$11(PolylineNode update, Function1 it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.setOnPolylineClick(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$12(PolylineNode update, List it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getPolyline().h(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$13(PolylineNode update, List it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getPolyline().i(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$14(PolylineNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getPolyline().b(z10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$15(PolylineNode update, C4458f it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getPolyline().d(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$16(PolylineNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getPolyline().e(z10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$17(PolylineNode update, int i10) {
        Intrinsics.j(update, "$this$update");
        update.getPolyline().f(i10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$18(PolylineNode update, List list) {
        Intrinsics.j(update, "$this$update");
        update.getPolyline().g(list);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$19(PolylineNode update, C4458f it) {
        Intrinsics.j(update, "$this$update");
        Intrinsics.j(it, "it");
        update.getPolyline().j(it);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$20(PolylineNode update, Object obj) {
        Intrinsics.j(update, "$this$update");
        update.getPolyline().k(obj);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$21(PolylineNode update, boolean z10) {
        Intrinsics.j(update, "$this$update");
        update.getPolyline().l(z10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$22(PolylineNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getPolyline().m(f10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$24$lambda$23(PolylineNode update, float f10) {
        Intrinsics.j(update, "$this$update");
        update.getPolyline().n(f10);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$25(List list, List list2, boolean z10, long j10, C4458f c4458f, boolean z11, int i10, List list3, C4458f c4458f2, Object obj, boolean z12, float f10, float f11, Function1 function1, int i11, int i12, int i13, Composer composer, int i14) {
        m61PolylineImplLjegJe0(list, list2, z10, j10, c4458f, z11, i10, list3, c4458f2, obj, z12, f10, f11, function1, composer, androidx.compose.runtime.J0.a(i11 | 1), androidx.compose.runtime.J0.a(i12), i13);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PolylineImpl_LjegJe0$lambda$7$lambda$6(C4472u it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polyline_Ut8lOTo$lambda$1$lambda$0(C4472u it) {
        Intrinsics.j(it, "it");
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Polyline_Ut8lOTo$lambda$2(List list, boolean z10, long j10, C4458f c4458f, boolean z11, int i10, List list2, C4458f c4458f2, Object obj, boolean z12, float f10, float f11, Function1 function1, int i11, int i12, int i13, Composer composer, int i14) {
        m60PolylineUt8lOTo(list, z10, j10, c4458f, z11, i10, list2, c4458f2, obj, z12, f10, f11, function1, composer, androidx.compose.runtime.J0.a(i11 | 1), androidx.compose.runtime.J0.a(i12), i13);
        return Unit.f143329a;
    }
}
