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
public final class GS extends AbstractBinderC8693kn {

    /* renamed from: a, reason: collision with root package name */
    final Map f68033a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f68034b;

    /* renamed from: c, reason: collision with root package name */
    private final C9937wN f68035c;

    /* renamed from: d, reason: collision with root package name */
    private final Sc.u f68036d;

    /* renamed from: e, reason: collision with root package name */
    private final C9835vS f68037e;

    /* renamed from: f, reason: collision with root package name */
    private String f68038f;

    /* renamed from: g, reason: collision with root package name */
    private String f68039g;

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void l2(String[] strArr, int[] iArr, com.google.android.gms.dynamic.b bVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                IS is2 = (IS) com.google.android.gms.dynamic.d.c2(bVar);
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
                P9(this.f68038f, "asnpdc", map);
                return;
            }
        }
    }

    public static void C9(Context context, C9937wN c9937wN, C9835vS c9835vS, String str, String str2) {
        D9(context, c9937wN, c9835vS, str, str2, new HashMap());
    }

    public static final PendingIntent L9(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, "com.google.android.gms.ads.AdService");
            return C7487Yd0.b(context, 0, intent, C7487Yd0.f72426a | 1073741824, 0);
        }
        intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
        return C7487Yd0.a(context, 0, intent, 201326592);
    }

    private final void P9(String str, String str2, Map map) {
        D9(this.f68034b, this.f68035c, this.f68037e, str, str2, map);
    }

    private final String zzu() {
        AbstractC8980nS abstractC8980nS = (AbstractC8980nS) this.f68033a.get(this.f68038f);
        return abstractC8980nS == null ? "" : abstractC8980nS.b();
    }

    final /* synthetic */ void E9(Activity activity, com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        P9(this.f68038f, "rtsdc", map);
        activity.startActivity(Nc.v.u().e(activity));
        zzx();
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void F9(com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface, int i10) {
        this.f68037e.c(this.f68038f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        P9(this.f68038f, "rtsdc", map);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void G9(com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface) {
        this.f68037e.c(this.f68038f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        P9(this.f68038f, "rtsdc", map);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void H9(Activity activity, com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        HashMap map = new HashMap();
        map.put("dialog_action", "confirm");
        P9(this.f68038f, "dialog_click", map);
        Q9(activity, hVar);
    }

    final /* synthetic */ void I9(com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface, int i10) {
        this.f68037e.c(this.f68038f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        P9(this.f68038f, "dialog_click", map);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    final /* synthetic */ void J9(com.google.android.gms.ads.internal.overlay.h hVar, DialogInterface dialogInterface) {
        this.f68037e.c(this.f68038f);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        P9(this.f68038f, "dialog_click", map);
        if (hVar != null) {
            hVar.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void O0(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            boolean zA = Nc.v.s().a(this.f68034b);
            HashMap map = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                map.put("offline_notification_action", "offline_notification_clicked");
                c = true == zA ? (char) 1 : (char) 2;
                map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                try {
                    Intent launchIntentForPackage = this.f68034b.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                    if (launchIntentForPackage == null) {
                        launchIntentForPackage = new Intent("android.intent.action.VIEW");
                        launchIntentForPackage.setData(Uri.parse(stringExtra3));
                    }
                    launchIntentForPackage.addFlags(268435456);
                    this.f68034b.startActivity(launchIntentForPackage);
                    map.put("olaa", "olas");
                } catch (ActivityNotFoundException unused) {
                    map.put("olaa", "olaf");
                }
            } else {
                map.put("offline_notification_action", "offline_notification_dismissed");
            }
            P9(stringExtra2, "offline_notification_action", map);
            try {
                SQLiteDatabase writableDatabase = this.f68037e.getWritableDatabase();
                if (c == 1) {
                    this.f68037e.i(writableDatabase, this.f68036d, stringExtra2);
                } else {
                    C9835vS.l(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e10) {
                Sc.p.d("Failed to get writable offline buffering database: ".concat(e10.toString()));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void m7(com.google.android.gms.dynamic.b bVar, String str, String str2) {
        G8(bVar, new Pc.a(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void zzh() {
        final Sc.u uVar = this.f68036d;
        this.f68037e.g(new InterfaceC7990e80() { // from class: com.google.android.gms.internal.ads.oS
            @Override // com.google.android.gms.internal.ads.InterfaceC7990e80
            public final Object zza(Object obj) throws Exception {
                C9835vS.b(uVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public GS(Context context, C9835vS c9835vS, Sc.u uVar, C9937wN c9937wN) {
        this.f68034b = context;
        this.f68035c = c9937wN;
        this.f68036d = uVar;
        this.f68037e = c9835vS;
    }

    public static void D9(Context context, C9937wN c9937wN, C9835vS c9835vS, String str, String str2, Map map) {
        String str3;
        String strE;
        if (true != Nc.v.s().a(context)) {
            str3 = "offline";
        } else {
            str3 = "online";
        }
        if (c9937wN != null) {
            C9830vN c9830vNA = c9937wN.a();
            c9830vNA.b("gqi", str);
            c9830vNA.b("action", str2);
            c9830vNA.b("device_connectivity", str3);
            c9830vNA.b("event_timestamp", String.valueOf(Nc.v.c().a()));
            for (Map.Entry entry : map.entrySet()) {
                c9830vNA.b((String) entry.getKey(), (String) entry.getValue());
            }
            strE = c9830vNA.e();
        } else {
            strE = "";
        }
        c9835vS.d(new C10049xS(Nc.v.c().a(), str, strE, 2));
    }

    private final AlertDialog M9(Activity activity, final com.google.android.gms.ads.internal.overlay.h hVar) {
        Nc.v.t();
        AlertDialog.Builder onCancelListener = Rc.D0.l(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.yS
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.h hVar2 = hVar;
                if (hVar2 != null) {
                    hVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserN9 = N9(Lc.c.f18092a);
        if (xmlResourceParserN9 == null) {
            onCancelListener.setMessage(O9(Lc.d.f18099g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            Drawable drawableA = null;
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserN9, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzu = zzu();
            if (!TextUtils.isEmpty(strZzu)) {
                TextView textView = (TextView) viewInflate.findViewById(Lc.b.f18090a);
                textView.setVisibility(0);
                textView.setText(strZzu);
            }
            AbstractC8980nS abstractC8980nS = (AbstractC8980nS) this.f68033a.get(this.f68038f);
            if (abstractC8980nS != null) {
                drawableA = abstractC8980nS.a();
            }
            if (drawableA != null) {
                ((ImageView) viewInflate.findViewById(Lc.b.f18091b)).setImageDrawable(drawableA);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(O9(Lc.d.f18099g, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private static XmlResourceParser N9(int i10) {
        Resources resourcesF = Nc.v.s().f();
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
        Resources resourcesF = Nc.v.s().f();
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
        Nc.v.t();
        if (!androidx.core.app.q.f(activity).a()) {
            if (Build.VERSION.SDK_INT < 33) {
                Nc.v.t();
                AlertDialog.Builder builderL = Rc.D0.l(activity);
                builderL.setTitle(O9(Lc.d.f18098f, "Allow app to send you notifications?")).setPositiveButton(O9(Lc.d.f18096d, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zS
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                        this.f81264a.E9(activity, hVar, dialogInterface, i10);
                    }
                }).setNegativeButton(O9(Lc.d.f18097e, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.AS
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        this.f65967a.F9(hVar, dialogInterface, i10);
                    }
                }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.BS
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        this.f66376a.G9(hVar, dialogInterface);
                    }
                });
                builderL.create().show();
                P9(this.f68038f, "rtsdi", AbstractC8363hh0.d());
                return;
            }
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
            P9(this.f68038f, "asnpdi", AbstractC8363hh0.d());
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
            Nc.v.t()     // Catch: android.os.RemoteException -> L22
            android.content.Context r0 = r6.f68034b     // Catch: android.os.RemoteException -> L22
            Rc.T r0 = Rc.D0.a(r0)     // Catch: android.os.RemoteException -> L22
            android.content.Context r1 = r6.f68034b     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.dynamic.b r1 = com.google.android.gms.dynamic.d.I2(r1)     // Catch: android.os.RemoteException -> L22
            Pc.a r2 = new Pc.a     // Catch: android.os.RemoteException -> L22
            java.lang.String r3 = r6.f68039g     // Catch: android.os.RemoteException -> L22
            java.lang.String r4 = r6.f68038f     // Catch: android.os.RemoteException -> L22
            java.util.Map r5 = r6.f68033a     // Catch: android.os.RemoteException -> L22
            java.lang.Object r5 = r5.get(r4)     // Catch: android.os.RemoteException -> L22
            com.google.android.gms.internal.ads.nS r5 = (com.google.android.gms.internal.ads.AbstractC8980nS) r5     // Catch: android.os.RemoteException -> L22
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
            android.content.Context r2 = r6.f68034b     // Catch: android.os.RemoteException -> L40
            com.google.android.gms.dynamic.b r2 = com.google.android.gms.dynamic.d.I2(r2)     // Catch: android.os.RemoteException -> L40
            java.lang.String r3 = r6.f68039g     // Catch: android.os.RemoteException -> L40
            java.lang.String r4 = r6.f68038f     // Catch: android.os.RemoteException -> L40
            boolean r1 = r0.zzf(r2, r3, r4)     // Catch: android.os.RemoteException -> L40
            goto L48
        L40:
            r0 = move-exception
            goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r2 = "Failed to schedule offline notification poster."
            Sc.p.e(r2, r0)
        L48:
            if (r1 != 0) goto L5c
            com.google.android.gms.internal.ads.vS r0 = r6.f68037e
            java.lang.String r1 = r6.f68038f
            r0.c(r1)
            java.lang.String r0 = r6.f68038f
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.hh0 r2 = com.google.android.gms.internal.ads.AbstractC8363hh0.d()
            r6.P9(r0, r1, r2)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.GS.zzx():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void B0(com.google.android.gms.dynamic.b bVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        IS is2 = (IS) com.google.android.gms.dynamic.d.c2(bVar);
        final Activity activityA = is2.a();
        final com.google.android.gms.ads.internal.overlay.h hVarB = is2.b();
        this.f68038f = is2.c();
        this.f68039g = is2.d();
        if (!((Boolean) Oc.A.c().a(C8784lf.f77322q8)).booleanValue()) {
            P9(this.f68038f, "dialog_impression", AbstractC8363hh0.d());
            Nc.v.t();
            AlertDialog.Builder builderL = Rc.D0.l(activityA);
            builderL.setTitle(O9(Lc.d.f18105m, "Open ad when you're back online.")).setMessage(O9(Lc.d.f18104l, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(O9(Lc.d.f18102j, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.CS
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    this.f66623a.H9(activityA, hVarB, dialogInterface, i10);
                }
            }).setNegativeButton(O9(Lc.d.f18103k, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.DS
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    this.f67081a.I9(hVarB, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.ES
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f67302a.J9(hVarB, dialogInterface);
                }
            });
            builderL.create().show();
            return;
        }
        Q9(activityA, hVarB);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8800ln
    public final void G8(com.google.android.gms.dynamic.b bVar, Pc.a aVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) com.google.android.gms.dynamic.d.c2(bVar);
        String str2 = aVar.f25758a;
        String str3 = aVar.f25759b;
        String str4 = aVar.f25760c;
        String strZzu = zzu();
        Nc.v.u().g(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentL9 = L9(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentL92 = L9(context, "offline_notification_dismissed", str3, str2);
        m.e eVar = new m.e(context, "offline_notification_channel");
        if (!TextUtils.isEmpty(strZzu)) {
            eVar.k(String.format(O9(Lc.d.f18101i, "You are back online! Continue learning about %s"), strZzu));
        } else {
            eVar.k(O9(Lc.d.f18100h, "You are back online! Let's pick up where we left off"));
        }
        eVar.f(true).n(pendingIntentL92).i(pendingIntentL9).y(context.getApplicationInfo().icon).v(((Integer) Oc.A.c().a(C8784lf.f77336r8)).intValue());
        if (((Boolean) Oc.A.c().a(C8784lf.f77364t8)).booleanValue() && !str4.isEmpty()) {
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

    public final void K9(String str, C10039xI c10039xI) {
        String strK0 = c10039xI.k0();
        String strB = c10039xI.b();
        String string = "";
        if (TextUtils.isEmpty(strK0)) {
            if (strB == null) {
                strK0 = "";
            } else {
                strK0 = strB;
            }
        }
        InterfaceC7459Xg interfaceC7459XgZ = c10039xI.Z();
        if (interfaceC7459XgZ != null) {
            try {
                string = interfaceC7459XgZ.zze().toString();
            } catch (RemoteException unused) {
            }
        }
        InterfaceC7459Xg interfaceC7459XgA0 = c10039xI.a0();
        Drawable drawable = null;
        if (interfaceC7459XgA0 != null) {
            try {
                com.google.android.gms.dynamic.b bVarZzf = interfaceC7459XgA0.zzf();
                if (bVarZzf != null) {
                    drawable = (Drawable) com.google.android.gms.dynamic.d.c2(bVarZzf);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.f68033a.put(str, new C8447iS(strK0, string, drawable));
    }
}
