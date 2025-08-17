package com.meijer.mobile.meijer.activity.find.viewmodel;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BW\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/b;", "", "", "", "clickBeaconsSent", "viewBeaconsSent", "loadBeaconsSent", "stepperBeaconsSent", "carouselCriteoProductTracking", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "c", "getStepperBeaconsSent", "e", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C12203b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> clickBeaconsSent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> viewBeaconsSent;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> loadBeaconsSent;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> stepperBeaconsSent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<String> carouselCriteoProductTracking;

    public C12203b() {
        this(null, null, null, null, null, 31, null);
    }

    public C12203b(List<String> clickBeaconsSent, List<String> viewBeaconsSent, List<String> loadBeaconsSent, List<String> stepperBeaconsSent, List<String> carouselCriteoProductTracking) {
        Intrinsics.j(clickBeaconsSent, "clickBeaconsSent");
        Intrinsics.j(viewBeaconsSent, "viewBeaconsSent");
        Intrinsics.j(loadBeaconsSent, "loadBeaconsSent");
        Intrinsics.j(stepperBeaconsSent, "stepperBeaconsSent");
        Intrinsics.j(carouselCriteoProductTracking, "carouselCriteoProductTracking");
        this.clickBeaconsSent = clickBeaconsSent;
        this.viewBeaconsSent = viewBeaconsSent;
        this.loadBeaconsSent = loadBeaconsSent;
        this.stepperBeaconsSent = stepperBeaconsSent;
        this.carouselCriteoProductTracking = carouselCriteoProductTracking;
    }

    public final List<String> a() {
        return this.carouselCriteoProductTracking;
    }

    public final List<String> b() {
        return this.clickBeaconsSent;
    }

    public final List<String> c() {
        return this.loadBeaconsSent;
    }

    public final List<String> d() {
        return this.viewBeaconsSent;
    }

    public /* synthetic */ C12203b(List list, List list2, List list3, List list4, List list5, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list, (i10 & 2) != 0 ? new ArrayList() : list2, (i10 & 4) != 0 ? new ArrayList() : list3, (i10 & 8) != 0 ? new ArrayList() : list4, (i10 & 16) != 0 ? new ArrayList() : list5);
    }
}
