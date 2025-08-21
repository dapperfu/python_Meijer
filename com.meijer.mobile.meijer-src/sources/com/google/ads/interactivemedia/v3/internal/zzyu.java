package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class zzyu extends zzwj {
    public static final zzwk zza = new zzyq();
    private final zzys zzb;
    private final List zzc;

    private final Date zza(zzacc zzaccVar) throws IOException {
        List list = this.zzc;
        String strZzh = zzaccVar.zzh();
        synchronized (list) {
            try {
                for (DateFormat dateFormat : this.zzc) {
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            return dateFormat.parse(strZzh);
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
                try {
                    return zzabi.zza(strZzh, new ParsePosition(0));
                } catch (ParseException e10) {
                    throw new zzwe("Failed parsing '" + strZzh + "' as Date; at path " + zzaccVar.zzf(), e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.zzc.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ")";
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ")";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            zzaceVar.zzg();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.zzc.get(0);
        synchronized (this.zzc) {
            str = dateFormat.format(date);
        }
        zzaceVar.zzl(str);
    }

    /* synthetic */ zzyu(zzys zzysVar, int i10, int i11, zzyt zzytVar) {
        ArrayList arrayList = new ArrayList();
        this.zzc = arrayList;
        Objects.requireNonNull(zzysVar);
        this.zzb = zzysVar;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (zzxo.zza()) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        Date dateZza = zza(zzaccVar);
        this.zzb.zza(dateZza);
        return dateZza;
    }
}
