package Cl;

import com.meijer.mobile.featurenavigation.content.DailyAlarmService;
import pu.InterfaceC16421a;
import yo.k;

/* loaded from: classes9.dex */
public final class b implements InterfaceC16421a<DailyAlarmService> {
    public static void a(DailyAlarmService dailyAlarmService, Ck.b bVar) {
        dailyAlarmService.meijerBus = bVar;
    }

    public static void b(DailyAlarmService dailyAlarmService, k kVar) {
        dailyAlarmService.userManager = kVar;
    }
}
