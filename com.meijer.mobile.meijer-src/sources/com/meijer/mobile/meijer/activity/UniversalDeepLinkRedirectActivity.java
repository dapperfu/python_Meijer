package com.meijer.mobile.meijer.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/UniversalDeepLinkRedirectActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/net/Uri;", "deepLink", "", "r1", "(Landroid/net/Uri;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "LDl/e;", "v", "LDl/e;", "getMeijerIntent", "()LDl/e;", "setMeijerIntent", "(LDl/e;)V", "meijerIntent", "Lhi/a;", "w", "Lhi/a;", "getAnalyticsEngine", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class UniversalDeepLinkRedirectActivity extends Hilt_UniversalDeepLinkRedirectActivity {

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Dl.e meijerIntent;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    private final void r1(final Uri deepLink) {
        if (deepLink == null) {
            deepLink = getIntent().getData();
        }
        getAnalyticsEngine().b(C14756c.a("event: universal deeplink"), new Function1() { // from class: com.meijer.mobile.meijer.activity.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return UniversalDeepLinkRedirectActivity.s1(deepLink, (TrackingData) obj);
            }
        });
        Uri uriA = Intrinsics.e(deepLink != null ? deepLink.getScheme() : null, "meijerapp") ? deepLink : null;
        if (uriA == null) {
            uriA = getMeijerIntent().a(deepLink);
        }
        Uri uri = uriA;
        int iO = getMeijerIntent().O(uri);
        Intent intentS = Dl.e.S(getMeijerIntent(), this, uri, iO, null, false, 24, null);
        if (intentS == null) {
            intentS = getMeijerIntent().p(this, true);
            if (getMeijerIntent().j0(iO)) {
                intentS.putExtra("com.meijer.intent.extra.EXTRA_UL_REQUIRES_STORE_CODE", iO);
                intentS.putExtra("com.meijer.intent.extra.EXTRA_UL_REQUIRES_STORE_URI", uri);
            }
        }
        intentS.addFlags(268435456);
        intentS.putExtras(getIntent());
        startActivity(intentS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s1(Uri uri, TrackingData track) {
        String string;
        Intrinsics.j(track, "$this$track");
        track.n("universal");
        track.v("universal");
        if (uri == null || (string = uri.toString()) == null) {
            string = "Unknown URL";
        }
        track.h("universallinkurl", string);
        return Unit.f143329a;
    }

    public final InterfaceC14523a getAnalyticsEngine() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final Dl.e getMeijerIntent() {
        Dl.e eVar = this.meijerIntent;
        if (eVar != null) {
            return eVar;
        }
        Intrinsics.x("meijerIntent");
        return null;
    }

    @Override // com.meijer.mobile.meijer.activity.Hilt_UniversalDeepLinkRedirectActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Uri uri;
        super.onCreate(savedInstanceState);
        ck.c.b(this, 0, 0, 0, 0, 8, null);
        String stringExtra = getIntent().getStringExtra("push_notification_deeplink");
        if (stringExtra != null) {
            uri = Uri.parse(stringExtra);
        } else {
            uri = null;
        }
        r1(uri);
    }
}
