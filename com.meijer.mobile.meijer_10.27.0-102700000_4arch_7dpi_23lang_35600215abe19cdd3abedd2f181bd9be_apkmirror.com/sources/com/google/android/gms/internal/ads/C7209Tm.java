package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import java.util.Map;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.Tm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7209Tm extends C7822dn {

    /* renamed from: c, reason: collision with root package name */
    private final Map f70451c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f70452d;

    /* renamed from: e, reason: collision with root package name */
    private final String f70453e;

    /* renamed from: f, reason: collision with root package name */
    private final long f70454f;

    /* renamed from: g, reason: collision with root package name */
    private final long f70455g;

    /* renamed from: h, reason: collision with root package name */
    private final String f70456h;

    /* renamed from: i, reason: collision with root package name */
    private final String f70457i;

    public C7209Tm(InterfaceC9008ot interfaceC9008ot, Map map) {
        super(interfaceC9008ot, "createCalendarEvent");
        this.f70451c = map;
        this.f70452d = interfaceC9008ot.zzi();
        this.f70453e = l("description");
        this.f70456h = l("summary");
        this.f70454f = k("start_ticks");
        this.f70455g = k("end_ticks");
        this.f70457i = l("location");
    }

    private final long k(String str) {
        String str2 = (String) this.f70451c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    private final String l(String str) {
        return TextUtils.isEmpty((CharSequence) this.f70451c.get(str)) ? "" : (String) this.f70451c.get(str);
    }

    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f70453e);
        data.putExtra("eventLocation", this.f70457i);
        data.putExtra("description", this.f70456h);
        long j10 = this.f70454f;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.f70455g;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() throws JSONException {
        if (this.f70452d == null) {
            c("Activity context is not available.");
            return;
        }
        Lc.v.t();
        if (!new C7163Se(this.f70452d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        Lc.v.t();
        AlertDialog.Builder builderL = Pc.D0.l(this.f70452d);
        Resources resourcesF = Lc.v.s().f();
        builderL.setTitle(resourcesF != null ? resourcesF.getString(Jc.d.f14773r) : "Create calendar event");
        builderL.setMessage(resourcesF != null ? resourcesF.getString(Jc.d.f14774s) : "Allow Ad to create a calendar event?");
        builderL.setPositiveButton(resourcesF != null ? resourcesF.getString(Jc.d.f14771p) : "Accept", new DialogInterfaceOnClickListenerC7141Rm(this));
        builderL.setNegativeButton(resourcesF != null ? resourcesF.getString(Jc.d.f14772q) : "Decline", new DialogInterfaceOnClickListenerC7175Sm(this));
        builderL.create().show();
    }
}
