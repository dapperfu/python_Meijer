package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* renamed from: com.google.android.gms.internal.ads.Cu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6765Cu implements InterfaceC8502iy0 {
    public C6765Cu(C9562su c9562su) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* synthetic */ Object zzb() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
