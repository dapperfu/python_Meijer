package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6535q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import gd.C14243b;
import kd.AbstractC15136a;
import kd.C15137b;

/* loaded from: classes4.dex */
public final class Status extends AbstractC15136a implements k, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f64742a;

    /* renamed from: b, reason: collision with root package name */
    private final String f64743b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f64744c;

    /* renamed from: d, reason: collision with root package name */
    private final C14243b f64745d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f64734e = new Status(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f64735f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f64736g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f64737h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f64738i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f64739j = new Status(16);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f64741l = new Status(17);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f64740k = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new q();

    Status(int i10, String str, PendingIntent pendingIntent, C14243b c14243b) {
        this.f64742a = i10;
        this.f64743b = str;
        this.f64744c = pendingIntent;
        this.f64745d = c14243b;
    }

    public boolean K0() {
        return this.f64744c != null;
    }

    public PendingIntent T() {
        return this.f64744c;
    }

    public boolean W0() {
        return this.f64742a == 16;
    }

    @Override // com.google.android.gms.common.api.k
    public Status a() {
        return this;
    }

    public int c0() {
        return this.f64742a;
    }

    public boolean d1() {
        return this.f64742a <= 0;
    }

    public String q0() {
        return this.f64743b;
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public C14243b B() {
        return this.f64745d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f64742a == status.f64742a && C6535q.a(this.f64743b, status.f64743b) && C6535q.a(this.f64744c, status.f64744c) && C6535q.a(this.f64745d, status.f64745d);
    }

    public int hashCode() {
        return C6535q.b(Integer.valueOf(this.f64742a), this.f64743b, this.f64744c, this.f64745d);
    }

    public final String zza() {
        String str = this.f64743b;
        return str != null ? str : b.getStatusCodeString(this.f64742a);
    }

    public Status(C14243b c14243b, String str) {
        this(c14243b, str, 17);
    }

    public void g1(Activity activity, int i10) throws IntentSender.SendIntentException {
        Bundle bundle;
        if (!K0()) {
            return;
        }
        if (com.google.android.gms.common.util.n.l()) {
            bundle = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        PendingIntent pendingIntent = this.f64744c;
        r.l(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle2);
    }

    public String toString() {
        C6535q.a aVarC = C6535q.c(this);
        aVarC.a("statusCode", zza());
        aVarC.a("resolution", this.f64744c);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15137b.a(parcel);
        C15137b.n(parcel, 1, c0());
        C15137b.w(parcel, 2, q0(), false);
        C15137b.u(parcel, 3, this.f64744c, i10, false);
        C15137b.u(parcel, 4, B(), i10, false);
        C15137b.b(parcel, iA);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(C14243b c14243b, String str, int i10) {
        this(i10, str, c14243b.c0(), c14243b);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
