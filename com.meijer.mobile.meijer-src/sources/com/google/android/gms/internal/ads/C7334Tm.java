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
public final class C7334Tm extends C7947dn {

    /* renamed from: c, reason: collision with root package name */
    private final Map f71291c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f71292d;

    /* renamed from: e, reason: collision with root package name */
    private final String f71293e;

    /* renamed from: f, reason: collision with root package name */
    private final long f71294f;

    /* renamed from: g, reason: collision with root package name */
    private final long f71295g;

    /* renamed from: h, reason: collision with root package name */
    private final String f71296h;

    /* renamed from: i, reason: collision with root package name */
    private final String f71297i;

    public C7334Tm(InterfaceC9133ot interfaceC9133ot, Map map) {
        super(interfaceC9133ot, "createCalendarEvent");
        this.f71291c = map;
        this.f71292d = interfaceC9133ot.zzi();
        this.f71293e = l("description");
        this.f71296h = l("summary");
        this.f71294f = k("start_ticks");
        this.f71295g = k("end_ticks");
        this.f71297i = l("location");
    }

    private final long k(String str) {
        String str2 = (String) this.f71291c.get(str);
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
        return TextUtils.isEmpty((CharSequence) this.f71291c.get(str)) ? "" : (String) this.f71291c.get(str);
    }

    final Intent i() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f71293e);
        data.putExtra("eventLocation", this.f71297i);
        data.putExtra("description", this.f71296h);
        long j10 = this.f71294f;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.f71295g;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void j() throws JSONException {
        if (this.f71292d == null) {
            c("Activity context is not available.");
            return;
        }
        Nc.v.t();
        if (!new C7288Se(this.f71292d).b()) {
            c("This feature is not available on the device.");
            return;
        }
        Nc.v.t();
        AlertDialog.Builder builderL = Rc.D0.l(this.f71292d);
        Resources resourcesF = Nc.v.s().f();
        builderL.setTitle(resourcesF != null ? resourcesF.getString(Lc.d.f18110r) : "Create calendar event");
        builderL.setMessage(resourcesF != null ? resourcesF.getString(Lc.d.f18111s) : "Allow Ad to create a calendar event?");
        builderL.setPositiveButton(resourcesF != null ? resourcesF.getString(Lc.d.f18108p) : "Accept", new DialogInterfaceOnClickListenerC7266Rm(this));
        builderL.setNegativeButton(resourcesF != null ? resourcesF.getString(Lc.d.f18109q) : "Decline", new DialogInterfaceOnClickListenerC7300Sm(this));
        builderL.create().show();
    }
}
