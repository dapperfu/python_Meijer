package com.meijer.mobile.mperks.ux;

import Kk.AppVersion;
import android.content.Intent;
import android.os.Bundle;
import hi.InterfaceC14523a;
import ii.AbstractC14762i;
import ii.C14756c;
import ii.TrackingData;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yo.C18335a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R\"\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u00020\u00168\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lcom/meijer/mobile/mperks/ux/MperksFeatureActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "", "onResume", "Lyo/k;", "v", "Lyo/k;", "u1", "()Lyo/k;", "setUserManager$ux_release", "(Lyo/k;)V", "userManager", "Lyo/a;", "w", "Lyo/a;", "p1", "()Lyo/a;", "setAppPrefManager$ux_release", "(Lyo/a;)V", "appPrefManager", "Lhi/a;", "x", "Lhi/a;", "o1", "()Lhi/a;", "setAnalyticsEngine$ux_release", "(Lhi/a;)V", "analyticsEngine", "LDl/e;", "y", "LDl/e;", "t1", "()LDl/e;", "setMeijerIntent$ux_release", "(LDl/e;)V", "meijerIntent", "Lzl/k;", "z", "Lzl/k;", "s1", "()Lzl/k;", "setFeatureManager$ux_release", "(Lzl/k;)V", "featureManager", "LBl/g;", "A", "LBl/g;", "r1", "()LBl/g;", "setFeatureEntryPoint$ux_release", "(LBl/g;)V", "featureEntryPoint", "LKk/a;", "B", "LKk/a;", "q1", "()LKk/a;", "setAppVersion", "(LKk/a;)V", "appVersion", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public class MperksFeatureActivity extends Hilt_MperksFeatureActivity {

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public Bl.g featureEntryPoint;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public C18335a appPrefManager;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v1(List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.d(list);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w1(List list, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.d(list);
        track.h("action", "1");
        return Unit.f143329a;
    }

    public final InterfaceC14523a o1() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final C18335a p1() {
        C18335a c18335a = this.appPrefManager;
        if (c18335a != null) {
            return c18335a;
        }
        Intrinsics.x("appPrefManager");
        return null;
    }

    public final AppVersion q1() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.x("appVersion");
        return null;
    }

    public final Bl.g r1() {
        Bl.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.x("featureEntryPoint");
        return null;
    }

    public final zl.k s1() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final Dl.e t1() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    public final yo.k u1() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        Bundle extras = getIntent().getExtras();
        if (extras != null && extras.containsKey("adobe_push_notification_data_broadlogid_extra") && extras.containsKey("adobe_push_notification_data_deliveryid_extra")) {
            final List<AbstractC14762i.Extra> listU = r1().u(extras);
            o1().b(C14756c.a("event: tracking"), new Function1() { // from class: com.meijer.mobile.mperks.ux.b0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MperksFeatureActivity.v1(listU, (TrackingData) obj);
                }
            });
            o1().b(C14756c.a("event: tracking"), new Function1() { // from class: com.meijer.mobile.mperks.ux.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MperksFeatureActivity.w1(listU, (TrackingData) obj);
                }
            });
            Intent intent = getIntent();
            intent.removeExtra("adobe_push_notification_data_broadlogid_extra");
            intent.removeExtra("adobe_push_notification_data_deliveryid_extra");
        }
    }
}
