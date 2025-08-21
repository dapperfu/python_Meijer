package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Ym, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class DialogInterfaceOnClickListenerC7499Ym implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f72450a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f72451b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C7627an f72452c;

    DialogInterfaceOnClickListenerC7499Ym(C7627an c7627an, String str, String str2) {
        this.f72450a = str;
        this.f72451b = str2;
        this.f72452c = c7627an;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        DownloadManager downloadManager = (DownloadManager) this.f72452c.f73331d.getSystemService("download");
        try {
            String str = this.f72450a;
            String str2 = this.f72451b;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            Nc.v.t();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.f72452c.c("Could not store picture.");
        }
    }
}
