package Dl;

import com.meijer.mobile.featurenavigation.content.DailyAlarmService;
import lu.InterfaceC15612a;
import yo.k;

/* loaded from: classes10.dex */
public final class b implements InterfaceC15612a<DailyAlarmService> {
    public static void a(DailyAlarmService dailyAlarmService, Dk.b bVar) {
        dailyAlarmService.meijerBus = bVar;
    }

    public static void b(DailyAlarmService dailyAlarmService, k kVar) {
        dailyAlarmService.userManager = kVar;
    }
}
