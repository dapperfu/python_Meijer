package Xq;

import Ji.LocalThemeScope;
import Md.C4177c;
import Md.C4178d;
import Md.C4188n;
import Xq.w;
import Yq.StoreMapItem;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.ComposeMapColorScheme;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import j0.InterfaceC14794C;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import zr.C18569a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u008f\u0002\u0010\u001e\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a#\u0010$\u001a\u00020\u0011*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000eH\u0003¢\u0006\u0004\b$\u0010%¨\u0006,²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010)\u001a\u00020(8\nX\u008a\u0084\u0002²\u0006\f\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"}, d2 = {"LJi/M;", "Landroidx/compose/ui/Modifier;", "modifier", "", "LYq/d;", "items", "LYq/e;", "markers", "Lcom/google/android/gms/maps/model/LatLng;", "center", "", "zoom", "Lj0/C;", "contentPadding", "", "contentDescription", "Lkotlin/Function1;", "", "onMarkerClick", "onMarkerInfoClick", "onMapClick", "onMapLongClick", "Lkotlin/Function0;", "onMapLoaded", "", "onMyLocationButtonClick", "Landroid/location/Location;", "onMyLocationClick", "Lcom/google/maps/android/compose/ComposeMapColorScheme;", "mapColorScheme", "f", "(LJi/M;Landroidx/compose/ui/Modifier;Ljava/util/List;Ljava/util/List;Lcom/google/android/gms/maps/model/LatLng;FLj0/C;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/google/maps/android/compose/ComposeMapColorScheme;Landroidx/compose/runtime/Composer;III)V", "Landroid/graphics/Canvas;", "Landroid/graphics/Paint;", "markerTextPaint", "markerId", "d", "(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lzr/a;", "bitmapCache", "Landroid/graphics/Bitmap;", "markerBitmap", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "ux_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class w {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List<StoreMapItem> f39782a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<StoreMapItem, Unit> f39783b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<StoreMapItem, Unit> f39784c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<C18569a> f39785d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Bitmap> f39786e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Paint> f39787f;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<StoreMapItem> list, Function1<? super StoreMapItem, Unit> function1, Function1<? super StoreMapItem, Unit> function12, InterfaceC5730l0<C18569a> interfaceC5730l0, InterfaceC5730l0<Bitmap> interfaceC5730l02, InterfaceC5730l0<Paint> interfaceC5730l03) {
            this.f39782a = list;
            this.f39783b = function1;
            this.f39784c = function12;
            this.f39785d = interfaceC5730l0;
            this.f39786e = interfaceC5730l02;
            this.f39787f = interfaceC5730l03;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(Function1 function1, StoreMapItem storeMapItem, C4188n it) {
            Intrinsics.j(it, "it");
            if (function1 == null) {
                return false;
            }
            function1.invoke(storeMapItem);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit e(Function1 function1, StoreMapItem storeMapItem, C4188n it) {
            Intrinsics.j(it, "it");
            if (function1 != null) {
                function1.invoke(storeMapItem);
            }
            return Unit.f142422a;
        }

        public final void c(Composer composer, int i10) {
            Bitmap bitmapK;
            InterfaceC5730l0<C18569a> interfaceC5730l0;
            InterfaceC5730l0<Bitmap> interfaceC5730l02;
            Function1<StoreMapItem, Unit> function1;
            int i11;
            InterfaceC5730l0<Paint> interfaceC5730l03;
            Function1<StoreMapItem, Unit> function12;
            Composer composer2 = composer;
            int i12 = 2;
            if ((i10 & 3) == 2 && composer2.j()) {
                composer2.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1156103931, i10, -1, "com.meijer.mobile.store.ux.compose.StoreMap.<anonymous> (StoreMap.kt:141)");
            }
            List<StoreMapItem> list = this.f39782a;
            final Function1<StoreMapItem, Unit> function13 = this.f39783b;
            final Function1<StoreMapItem, Unit> function14 = this.f39784c;
            InterfaceC5730l0<C18569a> interfaceC5730l04 = this.f39785d;
            InterfaceC5730l0<Bitmap> interfaceC5730l05 = this.f39786e;
            InterfaceC5730l0<Paint> interfaceC5730l06 = this.f39787f;
            for (final StoreMapItem storeMapItem : list) {
                MarkerState markerState = storeMapItem.getMarker().getMarkerState();
                composer2.startReplaceGroup(-1380648683);
                if (markerState == null) {
                    function1 = function13;
                    i11 = i12;
                    function12 = function14;
                    interfaceC5730l0 = interfaceC5730l04;
                    interfaceC5730l02 = interfaceC5730l05;
                    interfaceC5730l03 = interfaceC5730l06;
                } else {
                    String title = storeMapItem.getMarker().getTitle();
                    String snippet = storeMapItem.getMarker().getSnippet();
                    composer2.startReplaceGroup(1899612765);
                    Bitmap bitmapB = C18569a.b(w.i(interfaceC5730l04), storeMapItem.getMarker().a().intValue(), null, i12, null);
                    composer2.startReplaceGroup(1899614954);
                    if (bitmapB == null) {
                        bitmapK = null;
                    } else {
                        composer2.startReplaceGroup(1343896346);
                        bitmapK = w.k(interfaceC5730l05);
                        Canvas canvas = new Canvas(bitmapK);
                        canvas.drawBitmap(bitmapB, 0.0f, 0.0f, (Paint) null);
                        String markerId = storeMapItem.getMarker().getMarkerId();
                        composer2.startReplaceGroup(1343900439);
                        if (markerId != null) {
                            w.d(canvas, w.j(interfaceC5730l06), markerId, composer2, 0);
                        }
                        composer2.P();
                        composer2.P();
                    }
                    composer2.P();
                    C4177c c4177cB = bitmapK != null ? C4178d.b(bitmapK) : null;
                    composer2.P();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV = composer2.V(function13) | composer2.D(storeMapItem);
                    Object objB = composer2.B();
                    if (zV || objB == Composer.INSTANCE.a()) {
                        objB = new Function1() { // from class: Xq.u
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(w.a.d(function13, storeMapItem, (C4188n) obj));
                            }
                        };
                        composer2.t(objB);
                    }
                    Function1 function15 = (Function1) objB;
                    composer2.P();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zV2 = composer2.V(function14) | composer2.D(storeMapItem);
                    Object objB2 = composer2.B();
                    if (zV2 || objB2 == Composer.INSTANCE.a()) {
                        objB2 = new Function1() { // from class: Xq.v
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return w.a.e(function14, storeMapItem, (C4188n) obj);
                            }
                        };
                        composer2.t(objB2);
                    }
                    composer2.P();
                    interfaceC5730l0 = interfaceC5730l04;
                    interfaceC5730l02 = interfaceC5730l05;
                    function1 = function13;
                    i11 = 2;
                    interfaceC5730l03 = interfaceC5730l06;
                    function12 = function14;
                    MarkerKt.m49Markerqld6geY(markerState, null, 0.0f, 0L, false, false, c4177cB, 0L, 0.0f, snippet, null, title, false, 0.0f, function15, (Function1) objB2, null, null, composer, MarkerState.$stable, 0, 210366);
                }
                composer.P();
                composer2 = composer;
                function14 = function12;
                interfaceC5730l04 = interfaceC5730l0;
                interfaceC5730l06 = interfaceC5730l03;
                interfaceC5730l05 = interfaceC5730l02;
                function13 = function1;
                i12 = i11;
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            c(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final Ji.LocalThemeScope r38, final androidx.compose.ui.Modifier r39, java.util.List<Yq.StoreMapItem> r40, java.util.List<Yq.StoreMarker> r41, com.google.android.gms.maps.model.LatLng r42, float r43, j0.InterfaceC14794C r44, java.lang.String r45, kotlin.jvm.functions.Function1<? super Yq.StoreMapItem, kotlin.Unit> r46, kotlin.jvm.functions.Function1<? super Yq.StoreMapItem, kotlin.Unit> r47, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit> r48, kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.LatLng, kotlin.Unit> r49, kotlin.jvm.functions.Function0<kotlin.Unit> r50, kotlin.jvm.functions.Function0<java.lang.Boolean> r51, kotlin.jvm.functions.Function1<? super android.location.Location, kotlin.Unit> r52, com.google.maps.android.compose.ComposeMapColorScheme r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Xq.w.f(Ji.M, androidx.compose.ui.Modifier, java.util.List, java.util.List, com.google.android.gms.maps.model.LatLng, float, j0.C, java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, com.google.maps.android.compose.ComposeMapColorScheme, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Canvas canvas, Paint paint, String str, int i10, Composer composer, int i11) {
        d(canvas, paint, str, composer, J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(LocalThemeScope localThemeScope, Modifier modifier, List list, List list2, LatLng latLng, float f10, InterfaceC14794C interfaceC14794C, String str, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function0 function0, Function0 function02, Function1 function15, ComposeMapColorScheme composeMapColorScheme, int i10, int i11, int i12, Composer composer, int i13) throws Resources.NotFoundException {
        f(localThemeScope, modifier, list, list2, latLng, f10, interfaceC14794C, str, function1, function12, function13, function14, function0, function02, function15, composeMapColorScheme, composer, J0.a(i10 | 1), J0.a(i11), i12);
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPositionState l(LatLng latLng, float f10) {
        CameraPositionState.Companion companion = CameraPositionState.INSTANCE;
        if (latLng == null) {
            latLng = new LatLng(0.0d, 0.0d);
        }
        CameraPosition cameraPositionT = CameraPosition.T(latLng, f10);
        Intrinsics.i(cameraPositionT, "fromLatLngZoom(...)");
        return companion.invoke(cameraPositionT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(final Canvas canvas, final Paint paint, final String str, Composer composer, final int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composerStartRestartGroup = composer.startRestartGroup(2038045608);
        if ((i10 & 6) == 0) {
            if (composerStartRestartGroup.D(canvas)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (composerStartRestartGroup.D(paint)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (composerStartRestartGroup.V(str)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2038045608, i11, -1, "com.meijer.mobile.store.ux.compose.MarkerId (StoreMap.kt:174)");
            }
            paint.getTextBounds(str, 0, str.length(), new Rect());
            canvas.drawText(str, canvas.getWidth() / 2, (canvas.getHeight() + r0.height()) / 2, paint);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Xq.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return w.e(canvas, paint, str, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final CameraPositionState g(z1<CameraPositionState> z1Var) {
        return z1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C18569a i(InterfaceC5730l0<C18569a> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint j(InterfaceC5730l0<Paint> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap k(InterfaceC5730l0<Bitmap> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }
}
