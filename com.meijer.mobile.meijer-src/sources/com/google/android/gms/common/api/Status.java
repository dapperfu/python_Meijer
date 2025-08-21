package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C6660q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.r;
import id.C14719b;
import md.AbstractC15707a;
import md.C15708b;

/* loaded from: classes4.dex */
public final class Status extends AbstractC15707a implements k, ReflectedParcelable {

    /* renamed from: a, reason: collision with root package name */
    private final int f65582a;

    /* renamed from: b, reason: collision with root package name */
    private final String f65583b;

    /* renamed from: c, reason: collision with root package name */
    private final PendingIntent f65584c;

    /* renamed from: d, reason: collision with root package name */
    private final C14719b f65585d;

    /* renamed from: e, reason: collision with root package name */
    public static final Status f65574e = new Status(-1);

    /* renamed from: f, reason: collision with root package name */
    public static final Status f65575f = new Status(0);

    /* renamed from: g, reason: collision with root package name */
    public static final Status f65576g = new Status(14);

    /* renamed from: h, reason: collision with root package name */
    public static final Status f65577h = new Status(8);

    /* renamed from: i, reason: collision with root package name */
    public static final Status f65578i = new Status(15);

    /* renamed from: j, reason: collision with root package name */
    public static final Status f65579j = new Status(16);

    /* renamed from: l, reason: collision with root package name */
    public static final Status f65581l = new Status(17);

    /* renamed from: k, reason: collision with root package name */
    public static final Status f65580k = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new q();

    Status(int i10, String str, PendingIntent pendingIntent, C14719b c14719b) {
        this.f65582a = i10;
        this.f65583b = str;
        this.f65584c = pendingIntent;
        this.f65585d = c14719b;
    }

    public boolean I0() {
        return this.f65584c != null;
    }

    public PendingIntent T() {
        return this.f65584c;
    }

    public boolean U0() {
        return this.f65582a == 16;
    }

    @Override // com.google.android.gms.common.api.k
    public Status a() {
        return this;
    }

    public int b0() {
        return this.f65582a;
    }

    public boolean d1() {
        return this.f65582a <= 0;
    }

    public String r0() {
        return this.f65583b;
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public C14719b B() {
        return this.f65585d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f65582a == status.f65582a && C6660q.a(this.f65583b, status.f65583b) && C6660q.a(this.f65584c, status.f65584c) && C6660q.a(this.f65585d, status.f65585d);
    }

    public int hashCode() {
        return C6660q.b(Integer.valueOf(this.f65582a), this.f65583b, this.f65584c, this.f65585d);
    }

    public final String zza() {
        String str = this.f65583b;
        return str != null ? str : b.getStatusCodeString(this.f65582a);
    }

    public Status(C14719b c14719b, String str) {
        this(c14719b, str, 17);
    }

    public void h1(Activity activity, int i10) throws IntentSender.SendIntentException {
        Bundle bundle;
        if (!I0()) {
            return;
        }
        if (com.google.android.gms.common.util.n.l()) {
            bundle = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle();
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        PendingIntent pendingIntent = this.f65584c;
        r.l(pendingIntent);
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0, bundle2);
    }

    public String toString() {
        C6660q.a aVarC = C6660q.c(this);
        aVarC.a("statusCode", zza());
        aVarC.a("resolution", this.f65584c);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = C15708b.a(parcel);
        C15708b.n(parcel, 1, b0());
        C15708b.w(parcel, 2, r0(), false);
        C15708b.u(parcel, 3, this.f65584c, i10, false);
        C15708b.u(parcel, 4, B(), i10, false);
        C15708b.b(parcel, iA);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    @Deprecated
    public Status(C14719b c14719b, String str, int i10) {
        this(i10, str, c14719b.b0(), c14719b);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
