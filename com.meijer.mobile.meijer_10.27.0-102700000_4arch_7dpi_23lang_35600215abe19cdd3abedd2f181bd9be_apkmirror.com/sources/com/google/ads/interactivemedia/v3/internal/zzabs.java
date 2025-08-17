package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes4.dex */
final class zzabs extends zzwj {
    static final zzwk zza = new zzabq();
    private final DateFormat zzb = new SimpleDateFormat("MMM d, yyyy");

    private zzabs() {
    }

    /* synthetic */ zzabs(zzabr zzabrVar) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            zzaceVar.zzg();
            return;
        }
        synchronized (this) {
            str = this.zzb.format((java.util.Date) date);
        }
        zzaceVar.zzl(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Date read(zzacc zzaccVar) throws IOException {
        Date date;
        if (zzaccVar.zzr() == 9) {
            zzaccVar.zzm();
            return null;
        }
        String strZzh = zzaccVar.zzh();
        synchronized (this) {
            TimeZone timeZone = this.zzb.getTimeZone();
            try {
                try {
                    date = new Date(this.zzb.parse(strZzh).getTime());
                } catch (ParseException e10) {
                    throw new zzwe("Failed parsing '" + strZzh + "' as SQL Date; at path " + zzaccVar.zzf(), e10);
                }
            } finally {
                this.zzb.setTimeZone(timeZone);
            }
        }
        return date;
    }
}
