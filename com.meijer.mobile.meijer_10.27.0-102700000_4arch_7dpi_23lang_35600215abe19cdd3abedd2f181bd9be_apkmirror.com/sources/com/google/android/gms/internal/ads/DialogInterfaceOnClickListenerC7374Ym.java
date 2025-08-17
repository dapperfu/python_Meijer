package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC7374Ym implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f71610a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f71611b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7502an f71612c;

    DialogInterfaceOnClickListenerC7374Ym(C7502an c7502an, String str, String str2) {
        this.f71610a = str;
        this.f71611b = str2;
        this.f71612c = c7502an;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        DownloadManager downloadManager = (DownloadManager) this.f71612c.f72491d.getSystemService("download");
        try {
            String str = this.f71610a;
            String str2 = this.f71611b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            Lc.v.t();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f71612c.c("Could not store picture.");
        }
    }
}
