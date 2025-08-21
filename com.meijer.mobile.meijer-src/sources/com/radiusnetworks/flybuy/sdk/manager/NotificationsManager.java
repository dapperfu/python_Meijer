package com.radiusnetworks.flybuy.sdk.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.FlyBuyLinks;
import com.radiusnetworks.flybuy.sdk.data.links.LinkDetails;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.ContextExtensionsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J*\u0010\f\u001a\u00020\r2 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\bH\u0007J#\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0011J*\u0010\u0012\u001a\u00020\r2 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\bH\u0007R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R.\u0010\u0006\u001a\"\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\t\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/radiusnetworks/flybuy/sdk/manager/NotificationsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "applicationContext", "notificationHandlers", "", "Lkotlin/Function1;", "Landroid/content/Intent;", "", "", "addNotificationHandler", "", "handler", "handleNotificationClicked", "intent", "handleNotificationClicked$core_defaultRelease", "removeNotificationHandler", "Companion", "core_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class NotificationsManager {
    public static final String INTENT_EXTRA_DEEP_LINK_URL = "deep_link_url";
    public static final String INTENT_EXTRA_EVENT_NAME = "event_name";
    public static final String INTENT_EXTRA_FLYBUY_MESSAGE_TYPE = "flybuy_message_type";
    public static final String INTENT_EXTRA_MESSAGE_SOURCE = "message_source";
    public static final String INTENT_EXTRA_ORDER_ID = "order_id";
    public static final String INTENT_EXTRA_PROJECT_ID = "project_id";
    public static final String INTENT_EXTRA_PROMOTION_ID = "promotion_id";
    public static final String INTENT_EXTRA_SITE_ID = "site_id";
    private final Context applicationContext;
    private final Set<Function1<Intent, Map<String, String>>> notificationHandlers;

    public NotificationsManager(Context context) {
        Intrinsics.j(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        this.applicationContext = applicationContext;
        this.notificationHandlers = new LinkedHashSet();
    }

    public final void addNotificationHandler(Function1<? super Intent, ? extends Map<String, String>> handler) throws Exception {
        Intrinsics.j(handler, "handler");
        try {
            synchronized (this.notificationHandlers) {
                this.notificationHandlers.add(handler);
            }
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final Map<String, String> handleNotificationClicked$core_defaultRelease(Intent intent) throws Exception {
        Integer numV;
        Integer numV2;
        Integer numV3;
        Integer numV4;
        Set<String> setKeySet;
        String string;
        String url;
        Intrinsics.j(intent, "intent");
        try {
            if (!Intrinsics.e(intent.getStringExtra(INTENT_EXTRA_MESSAGE_SOURCE), FlybuyPushData.MESSAGE_SOURCE_FLYBUY) || !Intrinsics.e(intent.getStringExtra(INTENT_EXTRA_FLYBUY_MESSAGE_TYPE), FlybuyPushData.MESSAGE_TYPE_PROMOTION)) {
                Iterator<T> it = this.notificationHandlers.iterator();
                while (it.hasNext()) {
                    Map<String, String> map = (Map) ((Function1) it.next()).invoke(intent);
                    if (map != null) {
                        return map;
                    }
                }
                return null;
            }
            String stringExtra = intent.getStringExtra(INTENT_EXTRA_EVENT_NAME);
            if (stringExtra == null) {
                stringExtra = "promotion_notification_clicked";
            }
            Intrinsics.g(stringExtra);
            String stringExtra2 = intent.getStringExtra(INTENT_EXTRA_PROJECT_ID);
            if (stringExtra2 != null) {
                Intrinsics.g(stringExtra2);
                numV = StringsKt.v(stringExtra2);
            } else {
                numV = null;
            }
            String stringExtra3 = intent.getStringExtra(INTENT_EXTRA_ORDER_ID);
            if (stringExtra3 != null) {
                Intrinsics.g(stringExtra3);
                numV2 = StringsKt.v(stringExtra3);
            } else {
                numV2 = null;
            }
            String stringExtra4 = intent.getStringExtra(INTENT_EXTRA_PROMOTION_ID);
            if (stringExtra4 != null) {
                Intrinsics.g(stringExtra4);
                numV3 = StringsKt.v(stringExtra4);
            } else {
                numV3 = null;
            }
            String stringExtra5 = intent.getStringExtra(INTENT_EXTRA_SITE_ID);
            if (stringExtra5 != null) {
                Intrinsics.g(stringExtra5);
                numV4 = StringsKt.v(stringExtra5);
            } else {
                numV4 = null;
            }
            String stringExtra6 = intent.getStringExtra(INTENT_EXTRA_DEEP_LINK_URL);
            LinkDetails linkDetails = stringExtra6 != null ? FlyBuyLinks.INSTANCE.parse(stringExtra6) : null;
            if (numV != null) {
                FlyBuyCore.INSTANCE.getAnalytics().sendEvent(stringExtra, numV.intValue(), numV2, numV3, numV4);
            }
            if (linkDetails != null && (url = linkDetails.getUrl()) != null) {
                ContextExtensionsKt.openDeepLink(this.applicationContext, url);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Bundle extras = intent.getExtras();
            if (extras != null && (setKeySet = extras.keySet()) != null) {
                Intrinsics.g(setKeySet);
                for (String str : setKeySet) {
                    Bundle extras2 = intent.getExtras();
                    if (extras2 != null && (string = extras2.getString(str)) != null) {
                        Intrinsics.g(str);
                        Intrinsics.g(string);
                        linkedHashMap.put(str, string);
                    }
                }
            }
            return linkedHashMap;
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }

    public final void removeNotificationHandler(Function1<? super Intent, ? extends Map<String, String>> handler) throws Exception {
        Intrinsics.j(handler, "handler");
        try {
            synchronized (this.notificationHandlers) {
                this.notificationHandlers.remove(handler);
            }
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            com.radiusnetworks.flybuy.sdk.b.a(FlyBuyCore.INSTANCE, "catchAndThrow caught exception", e10);
            throw e10;
        }
    }
}
