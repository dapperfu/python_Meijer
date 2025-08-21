package com.bugsnag.android;

import R6.ImmutableConfig;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00130\u00128\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0015¨\u0006 "}, d2 = {"Lcom/bugsnag/android/i1;", "Landroid/content/BroadcastReceiver;", "Lcom/bugsnag/android/s;", "client", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(Lcom/bugsnag/android/s;Lcom/bugsnag/android/D0;)V", "Landroid/content/Intent;", "intent", "", "", "", "meta", "shortAction", "", "a", "(Landroid/content/Intent;Ljava/util/Map;Ljava/lang/String;)V", "", "Lcom/bugsnag/android/BreadcrumbType;", "b", "()Ljava/util/Map;", "Landroid/content/Context;", "context", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "Lcom/bugsnag/android/s;", "Lcom/bugsnag/android/D0;", "c", "Ljava/util/Map;", "actions", "d", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class i1 extends BroadcastReceiver {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6617s client;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, BreadcrumbType> actions = b();

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/bugsnag/android/i1$a;", "", "<init>", "()V", "Landroid/content/Context;", "ctx", "Lcom/bugsnag/android/i1;", "receiver", "Lcom/bugsnag/android/D0;", "logger", "", "b", "(Landroid/content/Context;Lcom/bugsnag/android/i1;Lcom/bugsnag/android/D0;)V", "", "actionName", "", "a", "(Ljava/lang/String;)Z", "action", "c", "(Ljava/lang/String;)Ljava/lang/String;", "INTENT_ACTION_KEY", "Ljava/lang/String;", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: com.bugsnag.android.i1$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(String actionName) {
            return StringsKt.W(actionName, "android.", false, 2, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final void b(Context ctx, i1 receiver, D0 logger) {
            if (!receiver.c().isEmpty()) {
                IntentFilter intentFilter = new IntentFilter();
                Iterator<T> it = receiver.c().keySet().iterator();
                while (it.hasNext()) {
                    intentFilter.addAction((String) it.next());
                }
                B.e(ctx, receiver, intentFilter, logger);
            }
        }

        public final String c(String action) {
            if (a(action)) {
                return StringsKt.r1(action, '.', null, 2, null);
            }
            return action;
        }
    }

    @JvmStatic
    public static final void d(Context context, i1 i1Var, D0 d02) {
        INSTANCE.b(context, i1Var, d02);
    }

    private final Map<String, BreadcrumbType> b() {
        HashMap map = new HashMap();
        ImmutableConfig immutableConfigH = this.client.h();
        BreadcrumbType breadcrumbType = BreadcrumbType.USER;
        if (!immutableConfigH.H(breadcrumbType)) {
            map.put("android.appwidget.action.APPWIDGET_DELETED", breadcrumbType);
            map.put("android.appwidget.action.APPWIDGET_DISABLED", breadcrumbType);
            map.put("android.appwidget.action.APPWIDGET_ENABLED", breadcrumbType);
            map.put("android.intent.action.CAMERA_BUTTON", breadcrumbType);
            map.put("android.intent.action.CLOSE_SYSTEM_DIALOGS", breadcrumbType);
            map.put("android.intent.action.DOCK_EVENT", breadcrumbType);
        }
        BreadcrumbType breadcrumbType2 = BreadcrumbType.STATE;
        if (!immutableConfigH.H(breadcrumbType2)) {
            map.put("android.appwidget.action.APPWIDGET_HOST_RESTORED", breadcrumbType2);
            map.put("android.appwidget.action.APPWIDGET_RESTORED", breadcrumbType2);
            map.put("android.appwidget.action.APPWIDGET_UPDATE", breadcrumbType2);
            map.put("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS", breadcrumbType2);
            map.put("android.intent.action.ACTION_POWER_CONNECTED", breadcrumbType2);
            map.put("android.intent.action.ACTION_POWER_DISCONNECTED", breadcrumbType2);
            map.put("android.intent.action.ACTION_SHUTDOWN", breadcrumbType2);
            map.put("android.intent.action.AIRPLANE_MODE", breadcrumbType2);
            map.put("android.intent.action.BATTERY_LOW", breadcrumbType2);
            map.put("android.intent.action.BATTERY_OKAY", breadcrumbType2);
            map.put("android.intent.action.BOOT_COMPLETED", breadcrumbType2);
            map.put("android.intent.action.CONFIGURATION_CHANGED", breadcrumbType2);
            map.put("android.intent.action.CONTENT_CHANGED", breadcrumbType2);
            map.put("android.intent.action.DATE_CHANGED", breadcrumbType2);
            map.put("android.intent.action.DEVICE_STORAGE_LOW", breadcrumbType2);
            map.put("android.intent.action.DEVICE_STORAGE_OK", breadcrumbType2);
            map.put("android.intent.action.INPUT_METHOD_CHANGED", breadcrumbType2);
            map.put("android.intent.action.LOCALE_CHANGED", breadcrumbType2);
            map.put("android.intent.action.REBOOT", breadcrumbType2);
            map.put("android.intent.action.SCREEN_OFF", breadcrumbType2);
            map.put("android.intent.action.SCREEN_ON", breadcrumbType2);
            map.put("android.intent.action.TIMEZONE_CHANGED", breadcrumbType2);
            map.put("android.intent.action.TIME_SET", breadcrumbType2);
            map.put("android.os.action.DEVICE_IDLE_MODE_CHANGED", breadcrumbType2);
            map.put("android.os.action.POWER_SAVE_MODE_CHANGED", breadcrumbType2);
        }
        BreadcrumbType breadcrumbType3 = BreadcrumbType.NAVIGATION;
        if (!immutableConfigH.H(breadcrumbType3)) {
            map.put("android.intent.action.DREAMING_STARTED", breadcrumbType3);
            map.put("android.intent.action.DREAMING_STOPPED", breadcrumbType3);
        }
        return map;
    }

    public final Map<String, BreadcrumbType> c() {
        return this.actions;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        try {
            HashMap map = new HashMap();
            String action = intent.getAction();
            if (action == null) {
                return;
            }
            String strC = INSTANCE.c(action);
            map.put("Intent Action", action);
            a(intent, map, strC);
            BreadcrumbType breadcrumbType = this.actions.get(action);
            if (breadcrumbType == null) {
                breadcrumbType = BreadcrumbType.STATE;
            }
            this.client.x(strC, map, breadcrumbType);
        } catch (Exception e10) {
            this.logger.g(Intrinsics.q("Failed to leave breadcrumb in SystemBroadcastReceiver: ", e10.getMessage()));
        }
    }

    public i1(C6617s c6617s, D0 d02) {
        this.client = c6617s;
        this.logger = d02;
    }

    private final void a(Intent intent, Map<String, Object> meta, String shortAction) {
        Set<String> setKeySet;
        Bundle extras = intent.getExtras();
        if (extras != null && (setKeySet = extras.keySet()) != null) {
            for (String str : setKeySet) {
                Object obj = extras.get(str);
                if (obj != null) {
                    String string = obj.toString();
                    if (INSTANCE.a(str)) {
                        meta.put("Extra", shortAction + ": " + string);
                    } else {
                        meta.put(str, string);
                    }
                }
            }
        }
    }
}
