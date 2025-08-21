package R4;

import O4.AbstractC4373v;
import O4.C4356d;
import O4.EnumC4353a;
import O4.EnumC4374w;
import O4.InterfaceC4354b;
import android.annotation.SuppressLint;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.model.WorkSpec;
import java.util.Iterator;

@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes4.dex */
class k {

    /* renamed from: d, reason: collision with root package name */
    private static final String f31865d = AbstractC4373v.i("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f31866a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4354b f31867b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f31868c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31869a;

        static {
            int[] iArr = new int[EnumC4374w.values().length];
            f31869a = iArr;
            try {
                iArr[EnumC4374w.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31869a[EnumC4374w.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31869a[EnumC4374w.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31869a[EnumC4374w.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31869a[EnumC4374w.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static int c(EnumC4374w enumC4374w) {
        int i10 = a.f31869a[enumC4374w.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5 && Build.VERSION.SDK_INT >= 26) {
            return 4;
        }
        AbstractC4373v.e().a(f31865d, "API version too low. Cannot convert network type value " + enumC4374w);
        return 1;
    }

    static void d(JobInfo.Builder builder, EnumC4374w enumC4374w) {
        if (Build.VERSION.SDK_INT < 30 || enumC4374w != EnumC4374w.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(enumC4374w));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(WorkSpec workSpec, int i10) {
        String traceTag;
        C4356d c4356d = workSpec.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.n());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f31866a).setRequiresCharging(c4356d.getRequiresCharging()).setRequiresDeviceIdle(c4356d.getRequiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest networkRequestD = c4356d.d();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || networkRequestD == null) {
            d(extras, c4356d.getRequiredNetworkType());
        } else {
            l.a(extras, networkRequestD);
        }
        if (!c4356d.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == EnumC4353a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(workSpec.c() - this.f31867b.a(), 0L);
        if (i11 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.expedited && this.f31868c) {
            extras.setImportantWhileForeground(true);
        }
        if (c4356d.g()) {
            Iterator<C4356d.c> it = c4356d.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(c4356d.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(c4356d.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(c4356d.getRequiresBatteryNotLow());
            extras.setRequiresStorageNotLow(c4356d.getRequiresStorageNotLow());
        }
        boolean z10 = workSpec.runAttemptCount > 0;
        boolean z11 = jMax > 0;
        if (i12 >= 31 && workSpec.expedited && !z10 && !z11) {
            extras.setExpedited(true);
        }
        if (i12 >= 35 && (traceTag = workSpec.getTraceTag()) != null) {
            extras.setTraceTag(traceTag);
        }
        return extras.build();
    }

    k(Context context, InterfaceC4354b interfaceC4354b, boolean z10) {
        this.f31867b = interfaceC4354b;
        this.f31866a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f31868c = z10;
    }

    private static JobInfo.TriggerContentUri b(C4356d.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.getUri(), cVar.getIsTriggeredForDescendants() ? 1 : 0);
    }
}
