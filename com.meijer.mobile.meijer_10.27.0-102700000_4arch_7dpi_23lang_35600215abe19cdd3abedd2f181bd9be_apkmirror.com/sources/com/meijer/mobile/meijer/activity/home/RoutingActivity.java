package com.meijer.mobile.meijer.activity.home;

import android.os.Bundle;
import gi.InterfaceC14261a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/home/RoutingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "", "launchHomeScreen", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LAl/g;", "featureEntryPoint", "LAl/g;", "getFeatureEntryPoint", "()LAl/g;", "setFeatureEntryPoint", "(LAl/g;)V", "Lgi/a;", "analyticsEngine", "Lgi/a;", "getAnalyticsEngine", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RoutingActivity extends Hilt_RoutingActivity {
    public static final int $stable = 8;
    public InterfaceC14261a analyticsEngine;
    public Al.g featureEntryPoint;

    public final InterfaceC14261a getAnalyticsEngine() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final Al.g getFeatureEntryPoint() {
        Al.g gVar = this.featureEntryPoint;
        if (gVar != null) {
            return gVar;
        }
        Intrinsics.y("featureEntryPoint");
        return null;
    }

    public final void setAnalyticsEngine(InterfaceC14261a interfaceC14261a) {
        Intrinsics.j(interfaceC14261a, "<set-?>");
        this.analyticsEngine = interfaceC14261a;
    }

    public final void setFeatureEntryPoint(Al.g gVar) {
        Intrinsics.j(gVar, "<set-?>");
        this.featureEntryPoint = gVar;
    }

    private final void launchHomeScreen() {
        startActivity(Al.g.m(getFeatureEntryPoint(), false, 1, null));
    }

    @Override // com.meijer.mobile.meijer.activity.home.Hilt_RoutingActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        l2.c.INSTANCE.a(this);
        launchHomeScreen();
    }
}
