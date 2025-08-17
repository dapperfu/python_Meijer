package Qn;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.meijer.mobile.meijer.service.GeoFenceStoreSetupWorker;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lk.C15420a;
import lk.PeriodicPollingStartEvent;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0001!B=\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010%R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010)¨\u0006+"}, d2 = {"LQn/V;", "", "Landroid/content/Context;", "context", "LCk/b;", "meijerBus", "Lyo/k;", "userManager", "LTn/a;", "geoFenceStoreSetupPermissions", "LCl/e;", "meijerIntent", "Landroid/app/AlarmManager;", "alarmManager", "<init>", "(Landroid/content/Context;LCk/b;Lyo/k;LTn/a;LCl/e;Landroid/app/AlarmManager;)V", "Llk/b;", "event", "", "e", "(Llk/b;)V", "Llk/a;", "d", "(Llk/a;)V", "", "phoneNumber", "", "forceNextDayStart", "f", "(Ljava/lang/String;Z)V", "", "c", "(Ljava/lang/String;Z)J", "a", "Landroid/content/Context;", "b", "Lyo/k;", "LTn/a;", "Landroid/app/AlarmManager;", "", "Landroid/app/PendingIntent;", "Ljava/util/List;", "alarmsToSchedule", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class V {

    /* renamed from: g, reason: collision with root package name */
    public static final int f30948g = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private yo.k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Tn.a geoFenceStoreSetupPermissions;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AlarmManager alarmManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<PendingIntent> alarmsToSchedule;

    private final long c(String phoneNumber, boolean forceNextDayStart) {
        Intrinsics.i(phoneNumber.substring(7, 10), "substring(...)");
        int i10 = (int) ((Integer.parseInt(r5) / 999.0f) * 240);
        int i11 = i10 / 60;
        ZonedDateTime zonedDateTimeN = LocalDate.now().atTime(i11 + 10, Math.abs(i10 - (i11 * 60)), 0).N(vk.e.EASTERN);
        if (forceNextDayStart || LocalTime.now().getHour() >= 10) {
            zonedDateTimeN = zonedDateTimeN.plusDays(1L);
        }
        return zonedDateTimeN.toInstant().toEpochMilli();
    }

    public V(Context context, Ck.b meijerBus, yo.k userManager, Tn.a geoFenceStoreSetupPermissions, Cl.e meijerIntent, AlarmManager alarmManager) {
        Intrinsics.j(context, "context");
        Intrinsics.j(meijerBus, "meijerBus");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(geoFenceStoreSetupPermissions, "geoFenceStoreSetupPermissions");
        Intrinsics.j(meijerIntent, "meijerIntent");
        this.context = context;
        this.userManager = userManager;
        this.geoFenceStoreSetupPermissions = geoFenceStoreSetupPermissions;
        this.alarmManager = alarmManager;
        this.alarmsToSchedule = CollectionsKt.e(meijerIntent.Q(context));
        meijerBus.b(PeriodicPollingStartEvent.class, new Pu.g() { // from class: Qn.T
            @Override // Pu.g
            public final void accept(Object obj) {
                this.f30945a.e((PeriodicPollingStartEvent) obj);
            }
        });
        meijerBus.b(C15420a.class, new Pu.g() { // from class: Qn.U
            @Override // Pu.g
            public final void accept(Object obj) {
                this.f30946a.d((C15420a) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(C15420a event) {
        for (PendingIntent pendingIntent : this.alarmsToSchedule) {
            AlarmManager alarmManager = this.alarmManager;
            if (alarmManager != null) {
                alarmManager.cancel(pendingIntent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(PeriodicPollingStartEvent event) {
        if (this.userManager.b() && this.geoFenceStoreSetupPermissions.a() && event.getPhoneNumber() != null) {
            String phoneNumber = event.getPhoneNumber();
            Intrinsics.g(phoneNumber);
            if (phoneNumber.length() >= 10) {
                String phoneNumber2 = event.getPhoneNumber();
                Intrinsics.g(phoneNumber2);
                f(phoneNumber2, event.getForceNextDayStart());
                GeoFenceStoreSetupWorker.INSTANCE.a(this.context);
            }
        }
    }

    private final void f(String phoneNumber, boolean forceNextDayStart) {
        long jC = c(phoneNumber, forceNextDayStart);
        for (PendingIntent pendingIntent : this.alarmsToSchedule) {
            AlarmManager alarmManager = this.alarmManager;
            if (alarmManager != null) {
                alarmManager.cancel(pendingIntent);
            }
            AlarmManager alarmManager2 = this.alarmManager;
            if (alarmManager2 != null) {
                W.b(alarmManager2, pendingIntent, jC);
            }
        }
    }
}
