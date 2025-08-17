package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.m;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* loaded from: classes6.dex */
public final class GS extends AbstractBinderC8568kn {

    /* renamed from: a, reason: collision with root package name */
    final Map f67193a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f67194b;

    /* renamed from: c, reason: collision with root package name */
    private final C9812wN f67195c;

    /* renamed from: d, reason: collision with root package name */
    private final Qc.u f67196d;

    /* renamed from: e, reason: collision with root package name */
    private final C9710vS f67197e;

    /* renamed from: f, reason: collision with root package name */
    private String f67198f;

    /* renamed from: g, reason: collision with root package name */
    private String f67199g;

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void j2(String[] strArr, int[] iArr, com.google.android.gms.dynamic.b bVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                IS is2 = (IS) com.google.android.gms.dynamic.d.b2(bVar);
                Activity activityA = is2.a();
                com.google.android.gms.ads.internal.overlay.h hVarB = is2.b();
                HashMap map = new HashMap();
                if (iArr[i10] == 0) {
                    map.put("dialog_action", "confirm");
                    zzx();
                    R9(activityA, hVarB);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (hVarB != null) {
                        hVarB.zzb();
                    }
                }
                P9(this.f67198f, "asnpdc", map);
                return;
            }
        }
    }

    public static void C9(Context context, C9812wN c9812wN, C9710vS c9710vS, String str, String str2) {
        D9(context, c9812wN, c9710vS, str, str2, new HashMap());
    }

    public static final PendingIntent L9(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return C7362Yd0.b(context, 0, intent, C7362Yd0.f71586a | 1073741824, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return C7362Yd0.a(context, 0, intent, 201326592);
    }

    private final void P9(String str, String str2, Map map) {
        D9(this.f67194b, this.f67195c, this.f67197e, str, str2, map);
    }

    private final String zzu() {
        AbstractC8855nS abstractC8855nS = (AbstractC8855nS) this.f67193a.get(this.f67198f);
        return abstractC8855nS == null ? "" : abstractC8855nS.b();
    }

    final /* synthetic */ void E9(Activity activity, com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        P9(this.f67198f, "rtsdc", map);
        activity.startActivity(Lc.v.u().e(activity));
        zzx();
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void F9(com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface, int i10) {
        this.f67197e.c(this.f67198f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        P9(this.f67198f, "rtsdc", map);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void G9(com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface) {
        this.f67197e.c(this.f67198f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        P9(this.f67198f, "rtsdc", map);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void H9(Activity activity, com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        P9(this.f67198f, "dialog_click", map);
        Q9(activity, hVar);
    }

    final /* synthetic */ void I9(com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface, int i10) {
        this.f67197e.c(this.f67198f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        P9(this.f67198f, "dialog_click", map);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void J9(com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface) {
        this.f67197e.c(this.f67198f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        P9(this.f67198f, "dialog_click", map);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void O0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zA = Lc.v.s().a(this.f67194b);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zA ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.f67194b.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.f67194b.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            P9(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.f67197e.getWritableDatabase();
                if (c == 1) {
                    this.f67197e.i(writableDatabase, this.f67196d, stringExtra2);
                } else {
                    C9710vS.l(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e10) {
                Qc.p.d("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void a7(com.google.android.gms.dynamic.b bVar, String str, String str2) {
        P0(bVar, new Nc.a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void zzh() {
        final Qc.u uVar = this.f67196d;
        this.f67197e.g(new InterfaceC7865e80() { // from class: com.google.android.gms.internal.ads.oS
            @Override // com.google.android.gms.internal.ads.InterfaceC7865e80
            public final Object zza(Object obj) throws Exception {
                C9710vS.b(uVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public GS(Context context, C9710vS c9710vS, Qc.u uVar, C9812wN c9812wN) {
        this.f67194b = context;
        this.f67195c = c9812wN;
        this.f67196d = uVar;
        this.f67197e = c9710vS;
    }

    public static void D9(Context context, C9812wN c9812wN, C9710vS c9710vS, String str, String str2, Map map) {
        String str3;
        String strE;
        if (true != Lc.v.s().a(context)) {
            str3 = "offline";
        } else {
            str3 = "online";
        }
        if (c9812wN != null) {
            C9705vN c9705vNA = c9812wN.a();
            c9705vNA.b("gqi", str);
            c9705vNA.b("action", str2);
            c9705vNA.b("device_connectivity", str3);
            c9705vNA.b("event_timestamp", String.valueOf(Lc.v.c().a()));
            for (Map.Entry entry : map.entrySet()) {
                c9705vNA.b((String) entry.getKey(), (String) entry.getValue());
            }
            strE = c9705vNA.e();
        } else {
            strE = "";
        }
        c9710vS.d(new C9924xS(Lc.v.c().a(), str, strE, 2));
    }

    private final AlertDialog M9(Activity activity, final com.google.android.gms.ads.internal.overlay.h hVar) {
        Lc.v.t();
        AlertDialog.Builder onCancelListener = Pc.D0.l(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.yS
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.h hVar2 = hVar;
                if (hVar2 != null) {
                    hVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserN9 = N9(Jc.c.f14755a);
        if (xmlResourceParserN9 == null) {
            onCancelListener.setMessage(O9(Jc.d.f14762g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            Drawable drawableA = null;
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserN9, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzu = zzu();
            if (!TextUtils.isEmpty(strZzu)) {
                TextView textView = (TextView) viewInflate.findViewById(Jc.b.f14753a);
                textView.setVisibility(0);
                textView.setText(strZzu);
            }
            AbstractC8855nS abstractC8855nS = (AbstractC8855nS) this.f67193a.get(this.f67198f);
            if (abstractC8855nS != null) {
                drawableA = abstractC8855nS.a();
            }
            if (drawableA != null) {
                ((ImageView) viewInflate.findViewById(Jc.b.f14754b)).setImageDrawable(drawableA);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(O9(Jc.d.f14762g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser N9(int i10) {
        Resources resourcesF = Lc.v.s().f();
        if (resourcesF == null) {
            return null;
        }
        try {
            return resourcesF.getLayout(i10);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private static String O9(int i10, String str) {
        Resources resourcesF = Lc.v.s().f();
        if (resourcesF == null) {
            return str;
        }
        try {
            return resourcesF.getString(i10);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private final void Q9(final Activity activity, final com.google.android.gms.ads.internal.overlay.h hVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Lc.v.t();
        if (!androidx.core.app.q.f(activity).a()) {
            if (Build.VERSION.SDK_INT < 33) {
                Lc.v.t();
                AlertDialog.Builder builderL = Pc.D0.l(activity);
                builderL.setTitle(O9(Jc.d.f14761f, "Allow app to send you notifications?")).setPositiveButton(O9(Jc.d.f14759d, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zS
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                        this.f80424a.E9(activity, hVar, dialogInterface, i10);
                    }
                }).setNegativeButton(O9(Jc.d.f14760e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.AS
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        this.f65127a.F9(hVar, dialogInterface, i10);
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.BS
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.f65536a.G9(hVar, dialogInterface);
                    }
                });
                builderL.create().show();
                P9(this.f67198f, "rtsdi", AbstractC8238hh0.d());
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            P9(this.f67198f, "asnpdi", AbstractC8238hh0.d());
            return;
        }
        zzx();
        R9(activity, hVar);
    }

    private final void R9(Activity activity, com.google.android.gms.ads.internal.overlay.h hVar) {
        AlertDialog alertDialogM9 = M9(activity, hVar);
        alertDialogM9.show();
        Timer timer = new Timer();
        timer.schedule(new FS(this, alertDialogM9, timer, hVar), 3000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzx() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r6 = this;
            Lc.v.t()     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r6.f67194b     // Catch: android.os.RemoteException -> L22
            Pc.T r0 = Pc.D0.a(r0)     // Catch: android.os.RemoteException -> L22
            android.content.Context r1 = r6.f67194b     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.d.F2(r1)     // Catch: android.os.RemoteException -> L22
            Nc.a r2 = new Nc.a     // Catch: android.os.RemoteException -> L22
            java.lang.String r3 = r6.f67199g     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r6.f67198f     // Catch: android.os.RemoteException -> L22
            java.util.Map r5 = r6.f67193a     // Catch: android.os.RemoteException -> L22
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.nS r5 = (com.google.android.gms.internal.ads.AbstractC8855nS) r5     // Catch: android.os.RemoteException -> L22
            if (r5 != 0) goto L24
            java.lang.String r5 = ""
            goto L28
        L22:
            r0 = move-exception
            goto L42
        L24:
            java.lang.String r5 = r5.c()     // Catch: android.os.RemoteException -> L22
        L28:
            r2.<init>(r3, r4, r5)     // Catch: android.os.RemoteException -> L22
            boolean r1 = r0.zzg(r1, r2)     // Catch: android.os.RemoteException -> L22
            if (r1 != 0) goto L48
            android.content.Context r2 = r6.f67194b     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.b r2 = com.google.android.gms.dynamic.d.F2(r2)     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.f67199g     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.f67198f     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L40
            goto L48
        L40:
            r0 = move-exception
            goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            Qc.p.e(r2, r0)
        L48:
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.vS r0 = r6.f67197e
            java.lang.String r1 = r6.f67198f
            r0.c(r1)
            java.lang.String r0 = r6.f67198f
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.hh0 r2 = com.google.android.gms.internal.ads.AbstractC8238hh0.d()
            r6.P9(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GS.zzx():void");
    }

    public final void K9(String str, C9914xI c9914xI) {
        String strK0 = c9914xI.k0();
        String strB = c9914xI.b();
        String string = "";
        if (TextUtils.isEmpty(strK0)) {
            if (strB == null) {
                strK0 = "";
            } else {
                strK0 = strB;
            }
        }
        InterfaceC7334Xg interfaceC7334XgZ = c9914xI.Z();
        if (interfaceC7334XgZ != null) {
            try {
                string = interfaceC7334XgZ.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        InterfaceC7334Xg interfaceC7334XgA0 = c9914xI.a0();
        Drawable drawable = null;
        if (interfaceC7334XgA0 != null) {
            try {
                com.google.android.gms.dynamic.b bVarZzf = interfaceC7334XgA0.zzf();
                if (bVarZzf != null) {
                    drawable = (Drawable) com.google.android.gms.dynamic.d.b2(bVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f67193a.put(str, new C8322iS(strK0, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void P0(com.google.android.gms.dynamic.b bVar, Nc.a aVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) com.google.android.gms.dynamic.d.b2(bVar);
        String str2 = aVar.f21523a;
        String str3 = aVar.f21524b;
        String str4 = aVar.f21525c;
        String strZzu = zzu();
        Lc.v.u().g(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentL9 = L9(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentL92 = L9(context, "offline_notification_dismissed", str3, str2);
        m.e eVar = new m.e(context, "offline_notification_channel");
        if (!TextUtils.isEmpty(strZzu)) {
            eVar.k(String.format(O9(Jc.d.f14764i, "You are back online! Continue learning about %s"), strZzu));
        } else {
            eVar.k(O9(Jc.d.f14763h, "You are back online! Let's pick up where we left off"));
        }
        eVar.f(true).n(pendingIntentL92).i(pendingIntentL9).y(context.getApplicationInfo().icon).v(((Integer) Mc.A.c().a(C8659lf.f76496r8)).intValue());
        if (((Boolean) Mc.A.c().a(C8659lf.f76524t8)).booleanValue() && !str4.isEmpty()) {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(com.fullstory.FS.urlconnection_wrapInstance(new URL(str4).openConnection()).getInputStream());
            } catch (IOException unused) {
            }
        } else {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            try {
                eVar.q(bitmapDecodeStream).A(new m.b().j(bitmapDecodeStream).h(null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, eVar.c());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            map.put("notification_not_shown_reason", e10.getMessage());
            str = "offline_notification_failed";
        }
        P9(str3, str, map);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8675ln
    public final void y0(com.google.android.gms.dynamic.b bVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        IS is2 = (IS) com.google.android.gms.dynamic.d.b2(bVar);
        final Activity activityA = is2.a();
        final com.google.android.gms.ads.internal.overlay.h hVarB = is2.b();
        this.f67198f = is2.c();
        this.f67199g = is2.d();
        if (!((Boolean) Mc.A.c().a(C8659lf.f76482q8)).booleanValue()) {
            P9(this.f67198f, "dialog_impression", AbstractC8238hh0.d());
            Lc.v.t();
            AlertDialog.Builder builderL = Pc.D0.l(activityA);
            builderL.setTitle(O9(Jc.d.f14768m, "Open ad when you're back online.")).setMessage(O9(Jc.d.f14767l, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(O9(Jc.d.f14765j, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.CS
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    this.f65783a.H9(activityA, hVarB, dialogInterface, i10);
                }
            }).setNegativeButton(O9(Jc.d.f14766k, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.DS
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f66241a.I9(hVarB, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.ES
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f66462a.J9(hVarB, dialogInterface);
                }
            });
            builderL.create().show();
            return;
        }
        Q9(activityA, hVarB);
    }
}
