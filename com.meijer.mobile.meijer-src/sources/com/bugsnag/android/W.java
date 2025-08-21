package com.bugsnag.android;

import io.constructor.data.local.PreferencesHelper;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001Bu\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0010¢\u0006\u0004\b\u0018\u0010\u0019R$\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR$\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lcom/bugsnag/android/W;", "Lcom/bugsnag/android/M;", "Lcom/bugsnag/android/N;", "buildInfo", "", "jailbroken", "", PreferencesHelper.PREF_ID, "locale", "", "totalMemory", "", "", "runtimeVersions", "freeDisk", "freeMemory", "orientation", "Ljava/util/Date;", "time", "<init>", "(Lcom/bugsnag/android/N;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/util/Date;)V", "Lcom/bugsnag/android/v0;", "writer", "", "l", "(Lcom/bugsnag/android/v0;)V", "k", "Ljava/lang/Long;", "m", "()Ljava/lang/Long;", "setFreeDisk", "(Ljava/lang/Long;)V", "n", "setFreeMemory", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "setOrientation", "(Ljava/lang/String;)V", "Ljava/util/Date;", "p", "()Ljava/util/Date;", "setTime", "(Ljava/util/Date;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class W extends M {

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private Long freeDisk;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Long freeMemory;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String orientation;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Date time;

    /* renamed from: m, reason: from getter */
    public final Long getFreeDisk() {
        return this.freeDisk;
    }

    /* renamed from: n, reason: from getter */
    public final Long getFreeMemory() {
        return this.freeMemory;
    }

    /* renamed from: o, reason: from getter */
    public final String getOrientation() {
        return this.orientation;
    }

    /* renamed from: p, reason: from getter */
    public final Date getTime() {
        return this.time;
    }

    public W(N n10, Boolean bool, String str, String str2, Long l10, Map<String, Object> map, Long l11, Long l12, String str3, Date date) {
        super(n10, n10.getCpuAbis(), bool, str, str2, l10, map);
        this.freeDisk = l11;
        this.freeMemory = l12;
        this.orientation = str3;
        this.time = date;
    }

    @Override // com.bugsnag.android.M
    public void l(C6624v0 writer) throws Throwable {
        super.l(writer);
        writer.l("freeDisk").K(this.freeDisk);
        writer.l("freeMemory").K(this.freeMemory);
        writer.l("orientation").O(this.orientation);
        if (this.time != null) {
            writer.l("time").e0(this.time);
        }
    }
}
