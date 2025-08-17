package com.radiusnetworks.flybuy.sdk.pickup.eta;

import com.google.maps.GeoApiContext;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.app.ETAConfig;
import com.scandit.datacapture.barcode.internal.sdk.count.ui.mapeditor.components.BinsView;
import j$.time.Clock;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f119994a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f119995b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static GeoApiContext f119996c;

    /* renamed from: d, reason: collision with root package name */
    public static Clock f119997d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f119998e;

    /* renamed from: f, reason: collision with root package name */
    public static float f119999f;

    /* renamed from: g, reason: collision with root package name */
    public static int f120000g;

    /* renamed from: h, reason: collision with root package name */
    public static double f120001h;

    static {
        Clock clockSystemDefaultZone = Clock.systemDefaultZone();
        Intrinsics.i(clockSystemDefaultZone, "systemDefaultZone(...)");
        f119997d = clockSystemDefaultZone;
        f119999f = Float.MAX_VALUE;
        f120000g = BinsView.TOTE_HEIGHT_DP;
        f120001h = 0.5d;
    }

    public static void a(String str, Clock clock) {
        if (str != null) {
            f119996c = new GeoApiContext.Builder().apiKey(str).build();
        }
        if (clock != null) {
            f119997d = clock;
        }
        FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
        ETAConfig etaConfig = flyBuyCore.getSdkConfig().getEtaConfig();
        if (etaConfig != null) {
            f120000g = etaConfig.getMinimumETACacheInterval();
        }
        ETAConfig etaConfig2 = flyBuyCore.getSdkConfig().getEtaConfig();
        if (etaConfig2 != null) {
            f120001h = etaConfig2.getCacheFilterETASecondsMultiplier();
        }
        f119998e = true;
    }
}
