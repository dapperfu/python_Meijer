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
public final class C7627an extends C7947dn {

    /* renamed from: c, reason: collision with root package name */
    private final Map f73330c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f73331d;

    public C7627an(InterfaceC9133ot interfaceC9133ot, Map map) {
        super(interfaceC9133ot, "storePicture");
        this.f73330c = map;
        this.f73331d = interfaceC9133ot.zzi();
    }

    public final void i() throws JSONException {
        if (this.f73331d == null) {
            c("Activity context is not available");
            return;
        }
        Nc.v.t();
        if (!new C7288Se(this.f73331d).c()) {
            c("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.f73330c.get("iurl");
        if (TextUtils.isEmpty(str)) {
            c("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            c("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        Nc.v.t();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            c("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesF = Nc.v.s().f();
        Nc.v.t();
        AlertDialog.Builder builderL = Rc.D0.l(this.f73331d);
        builderL.setTitle(resourcesF != null ? resourcesF.getString(Lc.d.f18106n) : "Save image");
        builderL.setMessage(resourcesF != null ? resourcesF.getString(Lc.d.f18107o) : "Allow Ad to store image in Picture gallery?");
        builderL.setPositiveButton(resourcesF != null ? resourcesF.getString(Lc.d.f18108p) : "Accept", new DialogInterfaceOnClickListenerC7499Ym(this, str, lastPathSegment));
        builderL.setNegativeButton(resourcesF != null ? resourcesF.getString(Lc.d.f18109q) : "Decline", new DialogInterfaceOnClickListenerC7532Zm(this));
        builderL.create().show();
    }
}
