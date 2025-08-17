package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.an, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7502an extends C7822dn {

    /* renamed from: c, reason: collision with root package name */
    private final Map f72490c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f72491d;

    public C7502an(InterfaceC9008ot interfaceC9008ot, Map map) {
        super(interfaceC9008ot, "storePicture");
        this.f72490c = map;
        this.f72491d = interfaceC9008ot.zzi();
    }

    public final void i() throws JSONException {
        if (this.f72491d == null) {
            c("Activity context is not available");
            return;
        }
        Lc.v.t();
        if (!new C7163Se(this.f72491d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f72490c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        Lc.v.t();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesF = Lc.v.s().f();
        Lc.v.t();
        AlertDialog.Builder builderL = Pc.D0.l(this.f72491d);
        builderL.setTitle(resourcesF != null ? resourcesF.getString(Jc.d.f14769n) : "Save image");
        builderL.setMessage(resourcesF != null ? resourcesF.getString(Jc.d.f14770o) : "Allow Ad to store image in Picture gallery?");
        builderL.setPositiveButton(resourcesF != null ? resourcesF.getString(Jc.d.f14771p) : "Accept", new DialogInterfaceOnClickListenerC7374Ym(this, str, lastPathSegment));
        builderL.setNegativeButton(resourcesF != null ? resourcesF.getString(Jc.d.f14772q) : "Decline", new DialogInterfaceOnClickListenerC7407Zm(this));
        builderL.create().show();
    }
}
