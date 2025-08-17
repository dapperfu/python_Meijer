package com.google.android.gms.measurement.internal;

import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class A extends B3 {

    /* renamed from: c, reason: collision with root package name */
    private long f84860c;

    /* renamed from: d, reason: collision with root package name */
    private String f84861d;

    A(X2 x22) {
        super(x22);
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean g() {
        Calendar calendar = Calendar.getInstance();
        this.f84860c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb2.append(lowerCase);
        sb2.append("-");
        sb2.append(lowerCase2);
        this.f84861d = sb2.toString();
        return false;
    }

    public final long m() {
        j();
        return this.f84860c;
    }

    public final String n() {
        j();
        return this.f84861d;
    }
}
