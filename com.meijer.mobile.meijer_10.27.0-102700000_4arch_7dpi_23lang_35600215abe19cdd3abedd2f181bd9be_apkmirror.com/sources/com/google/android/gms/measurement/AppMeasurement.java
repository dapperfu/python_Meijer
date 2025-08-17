package com.google.android.gms.measurement;

import Od.E;
import Od.t;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.measurement.internal.X2;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes6.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f84852b;

    /* renamed from: a, reason: collision with root package name */
    private final c f84853a;

    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            r.l(bundle);
            this.mAppId = (String) t.b(bundle, "app_id", String.class, null);
            this.mOrigin = (String) t.b(bundle, "origin", String.class, null);
            this.mName = (String) t.b(bundle, "name", String.class, null);
            this.mValue = t.b(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) t.b(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) t.b(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) t.b(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) t.b(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) t.b(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) t.b(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) t.b(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) t.b(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) t.b(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) t.b(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) t.b(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) t.b(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(X2 x22) {
        this.f84853a = new a(x22);
    }

    public AppMeasurement(E e10) {
        this.f84853a = new b(e10);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (f84852b == null) {
            synchronized (AppMeasurement.class) {
                if (f84852b == null) {
                    E e10 = (E) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (e10 != null) {
                        f84852b = new AppMeasurement(e10);
                    } else {
                        f84852b = new AppMeasurement(X2.M(context, new H0(0L, 0L, true, null, null), null));
                    }
                }
            }
        }
        return f84852b;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f84853a.B(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f84853a.K0(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f84853a.z(str);
    }

    @Keep
    public long generateEventId() {
        return this.f84853a.zzl();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f84853a.zzj();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List listI0 = this.f84853a.I0(str, str2);
        ArrayList arrayList = new ArrayList(listI0 == null ? 0 : listI0.size());
        Iterator it = listI0.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f84853a.zzi();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f84853a.zzh();
    }

    @Keep
    public String getGmpAppId() {
        return this.f84853a.zzk();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f84853a.j0(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f84853a.J0(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f84853a.W(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        r.l(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            t.a(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        c cVar = this.f84853a;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cVar.V(bundle);
    }
}
