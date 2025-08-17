package Q4;

import N4.AbstractC4333v;
import N4.C4316d;
import N4.EnumC4313a;
import N4.EnumC4334w;
import N4.InterfaceC4314b;
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
    private static final String f29754d = AbstractC4333v.i("SystemJobInfoConverter");

    /* renamed from: a, reason: collision with root package name */
    private final ComponentName f29755a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4314b f29756b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f29757c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29758a;

        static {
            int[] iArr = new int[EnumC4334w.values().length];
            f29758a = iArr;
            try {
                iArr[EnumC4334w.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29758a[EnumC4334w.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29758a[EnumC4334w.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29758a[EnumC4334w.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29758a[EnumC4334w.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static int c(EnumC4334w enumC4334w) {
        int i10 = a.f29758a[enumC4334w.ordinal()];
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
        AbstractC4333v.e().a(f29754d, "API version too low. Cannot convert network type value " + enumC4334w);
        return 1;
    }

    static void d(JobInfo.Builder builder, EnumC4334w enumC4334w) {
        if (Build.VERSION.SDK_INT < 30 || enumC4334w != EnumC4334w.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(enumC4334w));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    JobInfo a(WorkSpec workSpec, int i10) {
        String traceTag;
        C4316d c4316d = workSpec.constraints;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", workSpec.io.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", workSpec.getGeneration());
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", workSpec.n());
        JobInfo.Builder extras = new JobInfo.Builder(i10, this.f29755a).setRequiresCharging(c4316d.getRequiresCharging()).setRequiresDeviceIdle(c4316d.getRequiresDeviceIdle()).setExtras(persistableBundle);
        NetworkRequest networkRequestD = c4316d.d();
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 28 || networkRequestD == null) {
            d(extras, c4316d.getRequiredNetworkType());
        } else {
            l.a(extras, networkRequestD);
        }
        if (!c4316d.getRequiresDeviceIdle()) {
            extras.setBackoffCriteria(workSpec.backoffDelayDuration, workSpec.backoffPolicy == EnumC4313a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(workSpec.c() - this.f29756b.a(), 0L);
        if (i11 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!workSpec.expedited && this.f29757c) {
            extras.setImportantWhileForeground(true);
        }
        if (c4316d.g()) {
            Iterator<C4316d.c> it = c4316d.c().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b(it.next()));
            }
            extras.setTriggerContentUpdateDelay(c4316d.getContentTriggerUpdateDelayMillis());
            extras.setTriggerContentMaxDelay(c4316d.getContentTriggerMaxDelayMillis());
        }
        extras.setPersisted(false);
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            extras.setRequiresBatteryNotLow(c4316d.getRequiresBatteryNotLow());
            extras.setRequiresStorageNotLow(c4316d.getRequiresStorageNotLow());
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

    k(Context context, InterfaceC4314b interfaceC4314b, boolean z10) {
        this.f29756b = interfaceC4314b;
        this.f29755a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
        this.f29757c = z10;
    }

    private static JobInfo.TriggerContentUri b(C4316d.c cVar) {
        return new JobInfo.TriggerContentUri(cVar.getUri(), cVar.getIsTriggeredForDescendants() ? 1 : 0);
    }
}
